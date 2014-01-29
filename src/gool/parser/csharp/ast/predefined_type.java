package gool.parser.csharp.ast;

import gool.parser.csharp.CsharpVisitor;

import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeAdaptor;
import org.antlr.runtime.tree.TreeAdaptor;

public class predefined_type extends CsharpNode{

	private CommonTree tree;
	String code;
	
	public predefined_type(CommonTree root_0) {
		TreeAdaptor adaptor = new CommonTreeAdaptor();
		tree =  (CommonTree) adaptor.dupTree(root_0);
		code = tree.toStringTree();	
		
	}
	
	public Object accept(CsharpVisitor v) {
		return v.visit_predefined_type(this);
	}

	@Override
	public String toStringTree(int tab) {
		return nbTab(tab) + "predefined_type\n" 
				+ nbTab(tab+1) +  code +"\n";
	}
}