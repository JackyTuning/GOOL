package gool.parser.csharp.ast;

import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeAdaptor;
import org.antlr.runtime.tree.TreeAdaptor;

import gool.parser.csharp.CsharpVisitor;

public class qid extends CsharpNode {

	private CommonTree tree;
	String code;
		
	public qid(CommonTree root_0) {
		TreeAdaptor adaptor = new CommonTreeAdaptor();
		tree =  (CommonTree) adaptor.dupTree(root_0);
		code = tree.toStringTree();	
		
	}


	@Override
	public Object accept(CsharpVisitor v) {
		// TODO Auto-generated method stub
		return v.visit_qid(this);
	}


	@Override
	public String toStringTree(int tab) {
			return nbTab(tab) + "qid\n" 
						+ nbTab(tab+1) +  code +"\n";			
	}


	@Override
	public String toString() {
		return code;
	}
	
	

}
