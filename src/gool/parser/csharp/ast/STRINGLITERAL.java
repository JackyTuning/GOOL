package gool.parser.csharp.ast;

import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeAdaptor;
import org.antlr.runtime.tree.TreeAdaptor;

import gool.parser.csharp.CsharpVisitor;

public class STRINGLITERAL extends expression{

	private CommonTree tree;
	String code;
	
	public STRINGLITERAL(CommonTree root_0) {
		TreeAdaptor adaptor = new CommonTreeAdaptor();
		tree =  (CommonTree) adaptor.dupTree(root_0);
		code = tree.toStringTree();	
		
	}
	
	public Object accept(CsharpVisitor v) {
		return v.visit_STRINGLITERAL(this);
	}

	@Override
	public String toStringTree(int tab) {
		return nbTab(tab) + "STRINGLITERAL\n" 
				+ nbTab(tab+1) +  code +"\n";
	}
}
