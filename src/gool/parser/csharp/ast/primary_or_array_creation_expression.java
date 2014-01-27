package gool.parser.csharp.ast;

import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeAdaptor;
import org.antlr.runtime.tree.TreeAdaptor;

import gool.parser.csharp.CsharpVisitor;

public class primary_or_array_creation_expression extends expression {

	private CommonTree tree;
	String code;
		
	public primary_or_array_creation_expression(CommonTree root_0) {
		TreeAdaptor adaptor = new CommonTreeAdaptor();
		tree =  (CommonTree) adaptor.dupTree(root_0);
		code = tree.toStringTree();	
		
	}


	@Override
	public Object accept(CsharpVisitor v) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public String toStringTree(int tab) {
			return nbTab(tab) + "primary_or_array_creation_expression\n" 
						+ nbTab(tab+1) +  code +"\n";			
	}

}
