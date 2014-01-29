package gool.parser.csharp.ast;

import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeAdaptor;
import org.antlr.runtime.tree.TreeAdaptor;

import gool.parser.csharp.CsharpVisitor;

public class NULL extends expression{

	private CommonTree tree;
	String code;
	
	public NULL(CommonTree root_0) {
		TreeAdaptor adaptor = new CommonTreeAdaptor();
		tree =  (CommonTree) adaptor.dupTree(root_0);
		code = tree.toStringTree();	
		
	}
	
	public Object accept(CsharpVisitor v) {
		return v.visit_NULL(this);
	}

	@Override
	public String toStringTree(int tab) {
		return nbTab(tab) + "NULL\n" 
				+ nbTab(tab+1) +  code +"\n";
	}
}
