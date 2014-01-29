package gool.parser.csharp.ast;

import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeAdaptor;
import org.antlr.runtime.tree.TreeAdaptor;

import gool.parser.csharp.CsharpVisitor;

public class literal extends CsharpNode{

	private CommonTree tree;
	String code;
	private literaltype type;
	
	public enum literaltype {
		Real_literal, NUMBER, Hex_number, Character_literal, STRINGLITERAL, Verbatim_string_literal, Bool, NULL;
	}
	
	public literal(CommonTree root_0, literaltype t) {
		TreeAdaptor adaptor = new CommonTreeAdaptor();
		tree =  (CommonTree) adaptor.dupTree(root_0);
		code = tree.toStringTree();	
		type = t;
		
	}
	
	public Object accept(CsharpVisitor v) {
		return v.visit_literal(this);
	}

	@Override
	public String toStringTree(int tab) {
		return nbTab(tab) + type.toString() +"\n"
				+ nbTab(tab+1) +  code +"\n";
	}

	@Override
	public String toString() {
		return code;
	}
	
	
}
