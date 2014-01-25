package gool.parser.csharp.ast;

import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeAdaptor;
import org.antlr.runtime.tree.TreeAdaptor;

import gool.parser.csharp.CsharpVisitor;

public class assignment_operator extends CsharpNode {

	private CommonTree tree;
	String code;
		
	public assignment_operator(CommonTree root_0) {
		TreeAdaptor adaptor = new CommonTreeAdaptor();
		tree =  (CommonTree) adaptor.dupTree(root_0);
		code = tree.toStringTree();	
		
	}


	@Override
	public Object accept(CsharpVisitor v) {
		// TODO Auto-generated method stub
		return v.visit_assignment_operator(this);
	}


	@Override
	public String toStringTree(int tab) {
			return nbTab(tab) + "assignment_operator\n" 
						+ nbTab(tab+1) +  code +"\n";			
	}

}
