package gool.parser.csharp.ast;

import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeAdaptor;
import org.antlr.runtime.tree.TreeAdaptor;

import gool.parser.csharp.CsharpVisitor;

public class Verbatim_string_literal extends expression{

	private CommonTree tree;
	String code;
	
	public Verbatim_string_literal(CommonTree root_0) {
		TreeAdaptor adaptor = new CommonTreeAdaptor();
		tree =  (CommonTree) adaptor.dupTree(root_0);
		code = tree.toStringTree();	
		
	}
	
	public Object accept(CsharpVisitor v) {
		return v.visit_Verbatim_string_literal(this);
	}

	@Override
	public String toStringTree(int tab) {
		return nbTab(tab) + "Verbatim_string_literal\n" 
				+ nbTab(tab+1) +  code +"\n";
	}
}
