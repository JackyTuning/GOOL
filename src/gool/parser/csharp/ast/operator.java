package gool.parser.csharp.ast;

import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeAdaptor;
import org.antlr.runtime.tree.TreeAdaptor;

import gool.parser.csharp.CsharpVisitor;

public class operator extends CsharpNode {

	String code;
		
	public operator(String string) {
		code = string;
	}

	@Override
	public Object accept(CsharpVisitor v) {
		// TODO Auto-generated method stub
		return v.visit_operator(this);
	}


	@Override
	public String toStringTree(int tab) {
			return nbTab(tab) + "operator\n" 
						+ nbTab(tab+1) +  code +"\n";			
	}

}
