package gool.parser.csharp.ast;

import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeAdaptor;
import org.antlr.runtime.tree.TreeAdaptor;

import gool.parser.csharp.CsharpVisitor;

public class modifier extends CsharpNode {

	private CommonTree tree;
	String name;
		
	public modifier(CommonTree root_0) {
		TreeAdaptor adaptor = new CommonTreeAdaptor();
		tree =  (CommonTree) adaptor.dupTree(root_0);
		name = tree.toStringTree();	
		
	}


	@Override
	public Object accept(CsharpVisitor v) {
		// TODO Auto-generated method stub
		return v.visit_modifier(this);
	}


	@Override
	public String toStringTree(int tab) {
			return nbTab(tab) + "modifier\n" 
						+ nbTab(tab+1) +  name +"\n";			
	}


	public String getName() {
		return name;
	}

	
}
