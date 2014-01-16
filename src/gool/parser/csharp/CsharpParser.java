package gool.parser.csharp;

import java.io.IOException;
import java.util.List;

import org.antlr.runtime.*;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeNodeStream;
import org.antlr.runtime.tree.Tree;

public class CsharpParser  {
    public static void main(String[] args) throws Exception {
    	String filename = "resource/if_statement.cs";
    	CharStream cs = new ANTLRFileStream(filename);
    	csLexer lexer = new csLexer(cs);
    	CommonTokenStream token = new CommonTokenStream(lexer);
    	csParser parser= new csParser(token);
    	
    	
    	csParser.compilation_unit_return result = parser.compilation_unit();
        System.out.println("tree="+((Tree)result.tree).toStringTree());
        
        
        
        
        
        Tree tree = result.tree;
        System.out.println(tree.getChildCount());
        System.out.println(tree.getChild(18).toStringTree());
        
    }
}
