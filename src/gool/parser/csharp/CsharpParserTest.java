package gool.parser.csharp;

import gool.parser.csharp.csParser.compilation_unit_return;
import gool.parser.csharp.ast.CsharpNode;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.tree.Tree;

public class CsharpParserTest  {
    public static void main(String[] args) throws Exception {
    	//String filename = "resource/class.cs";
    	//String filename = "resource/for_if_while.cs";
    	//String filename = "resource/helloworld.cs";
    	//String filename = "resource/methods.cs";
    	//String filename = "resource/switch.cs";
    	//String filename = "resource/try_catch.cs";
    	//String filename = "resource/variables.cs";
    	String filename = "resource/test.cs";


    	CharStream cs = new ANTLRFileStream(filename);
    	csLexer lexer = new csLexer(cs);
    	CommonTokenStream token = new CommonTokenStream(lexer);
    	csParser parser= new csParser(token);
    	
    	
    	 compilation_unit_return result = parser.compilation_unit();
    	
    	 CsharpNode tree = result.t;
    	 System.out.println(tree.toStringTree(1));

    }
}
