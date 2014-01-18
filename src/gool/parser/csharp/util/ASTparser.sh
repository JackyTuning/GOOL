#!/bin/bash

#----------------------------------------------------------------------------
#netoyage de repertoire :
#----------------------------------------------------------------------------

rm -rf tmp
rm -rf res

#----------------------------------------------------------------------------
#initialisation
#----------------------------------------------------------------------------
mkdir tmp
mkdir res

#CsharpVisitor
echo "package gool.parser.csharp;" >> ./res/CsharpVisitor.java
echo "import gool.parser.csharp.csParser.*;" >> ./res/CsharpVisitor.java
echo "public abstract class CsharpVisitor {" >> ./res/CsharpVisitor.java

#CsharpNode

echo "package gool.parser.csharp;" >> ./res/CsharpNode.java
echo "public interface CsharpNode {" >> ./res/CsharpNode.java
echo "  public Object accept(CsharpVisitor v);" >> ./res/CsharpNode.java
echo "}" >> ./res/CsharpNode.java

#----------------------------------------------------------------------------
#Traitement
#----------------------------------------------------------------------------

#On découpe le fichier pour garder uniquement la classe du noeud et ça methode.
split -p 'public static class' csParser.java ./tmp/
cd tmp
test="1"
for fichier in $(ls)
do
 if [[ "1" == $test ]]
 then
    test="ok"
 else

    #On re découpe chaque fichier en 2 : la classe / la methode
    split -p '@Override' $fichier $fichier

    #On récupère le nom de la classe.
    class=$(grep 'public static class .* extends ParserRuleReturnScope {' "${fichier}aa" | sed 's/	public static class //g' | sed 's/ extends ParserRuleReturnScope {//g')

    #----------------------------------------------------------------------------
    #On rajoute une methode toString dans la classe.
    #----------------------------------------------------------------------------
    echo "@Override" >> "${fichier}aa"
    echo "public String toString() {" >> "${fichier}aa"
    echo "return tree.toStringTree();" >> "${fichier}aa"
    echo "}" >> "${fichier}aa"

    #----------------------------------------------------------------------------
    #On rajoute les information neccesaire pour faire un pattern visitor
    #----------------------------------------------------------------------------
    #implements CsharpNode :
    sed -i '' "s/extends ParserRuleReturnScope/extends ParserRuleReturnScope implements CsharpNode/g" "${fichier}aa"
    #acceptMethode
    echo "public Object accept(CsharpVisitor v) {" >> "${fichier}aa"
    echo "    return v.visit${class}(this);" >> "${fichier}aa"
    echo "}" >> "${fichier}aa"

    #CsharpVisitor :
    echo " public abstract Object visit${class}(${class} e);" >> ../res/CsharpVisitor.java


    #----------------------------------------------------------------------------
    # on crée la structure d'arbre grace au Token
    #----------------------------------------------------------------------------
    for elem in $(grep 'Token .*=null' $fichier | sed 's/		Token //g' | sed 's/=null;//g')
    do
        sed -i '' "s/${elem}_tree = (CommonTree)adaptor.create(${elem});/retval.${elem} = ${elem}_tree=(CommonTree)adaptor.create(${elem});/g" "${fichier}ab"
        sed -i '' "s/adaptor.addChild(root_0, ${elem}_tree);/adaptor.addChild(root_0, adaptor.dupTree(${elem}_tree));/g" "${fichier}ab"
        echo "CommonTree $elem ;" >> "${fichier}aa"
    done


    #----------------------------------------------------------------------------
    # on crée la structure d'arbre grace au ParserRuleReturnScope
    #----------------------------------------------------------------------------
    #On decoupe la methode en plusieur sous fichier pour chaque boucle while.
    split -p 'while' "${fichier}ab" "${fichier}ab"

    #Pour chaque ParserRuleReturnScope (on récupère leur nom)
    for elem in $(grep 'ParserRuleReturnScope .* =null' $fichier | sed 's/		ParserRuleReturnScope //g' | sed 's/ =null;//g')
    do
        #On parcoure les fichier précédant (découpé par boucle while) dans l'ordre inverse
        for fich in $(ls -r ${fichier}ab*)
        do
            #si on trouve le ParserRuleReturnScope :
            if grep -q $elem $fich
            then
                #on suprime les chiffre du ParserRuleReturnScope
                x=$(echo $elem | sed "s/[0-9]//g")

                #Si le fichier contient un while on doit créer une liste dasn la classe pour stoquer le ParserRuleReturnScope
                if grep -q 'while' $fich
                then
                    sed -i '' "s/$elem=$x();/$elem=$x();retval.$elem.add((${x}_return) $elem);/g" "${fich}"
                    echo "public List<${x}_return> $elem = new ArrayList<${x}_return>();" >> "${fichier}aa"
                #Sinon un attribue suffit
                else
                    sed -i '' "s/$elem=/$elem=retval.$elem=/g" "${fich}"
                    echo "public ${x}_return $elem ;" >> "${fichier}aa"
                fi
                    sed -i '' "s/$elem.getTree()/adaptor.dupTree($elem.getTree())/g" "${fich}"

                break
            fi
        done
    done

    rm "${fichier}ab"
    rm $fichier
 fi
done


#----------------------------------------------------------------------------
# Terminaison
#----------------------------------------------------------------------------
#On reconstitue le fichier csParser :
for fichier in $(ls)
do
    cat $fichier >> ../res/csParser.java
done

cd ..
#On termine le fichier CsharpVisitor
echo "}" >> ./res/CsharpVisitor.java

exit 0