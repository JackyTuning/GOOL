package gool.parser.csharp2;

import gool.parser.csharp2.csLexer;
import gool.parser.csharp2.csParser.compilation_unit_return;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.tree.Tree;

public class CsharpParserTest  {
    public static void main(String[] args) throws Exception {
    	String filename = "resource/if_statement.cs";
    	CharStream cs = new ANTLRFileStream(filename);
    	csLexer lexer = new csLexer(cs);
    	CommonTokenStream token = new CommonTokenStream(lexer);
    	csParser parser= new csParser(token);
    	
    	
    	 compilation_unit_return result = parser.compilation_unit();
    	 int i = 2;
    }
}
