package gool.parser.csharp.ast;

import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeAdaptor;
import org.antlr.runtime.tree.TreeAdaptor;

import gool.parser.csharp.CsharpVisitor;

public abstract class CsharpNode {
	private String msg;
	private CommonTree tree;
	public abstract Object accept(CsharpVisitor v);

	public abstract String toStringTree(int tab);
	
	public void setMessage (CommonTree root_0) {
		TreeAdaptor adaptor = new CommonTreeAdaptor();
		tree =  (CommonTree) adaptor.dupTree(root_0);
		msg = tree.toStringTree();	
		
	}
	
	protected String nbTab(int tab) {
		String res ="";
		for (int i = 0; i < tab ; i++) {
			res += "    ";
		}
		return res;
	}

	@Override
	public String toString() {
		return msg;
	}
	
	
	
}
