package gool.parser.csharp.ast;

import org.antlr.runtime.ParserRuleReturnScope;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeAdaptor;
import org.antlr.runtime.tree.TreeAdaptor;

import gool.parser.csharp.CsharpVisitor;

public class UnknowNode extends CsharpNode {

	private CommonTree tree;
	String code;
	
	public UnknowNode(ParserRuleReturnScope a) {
		if (a == null) {
			code = "null";
		} else {
			TreeAdaptor adaptor = new CommonTreeAdaptor();
			tree =  (CommonTree) adaptor.dupTree(a.getTree());
			code = tree.toStringTree();			
		}
	}
	

	public UnknowNode(CommonTree root_0) {
		TreeAdaptor adaptor = new CommonTreeAdaptor();
		tree =  (CommonTree) adaptor.dupTree(root_0);
		code = tree.toStringTree();	
		
	}


	@Override
	public Object accept(CsharpVisitor v) {
		// TODO Auto-generated method stub
		return v.visit_UnknowNode(this);
	}


	@Override
	public String toStringTree(int tab) {
			return nbTab(tab) + "UnknowNode\n" 
						+ nbTab(tab+1) +  code +"\n";			
	}

}
