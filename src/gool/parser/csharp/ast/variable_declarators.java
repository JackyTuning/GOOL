package gool.parser.csharp.ast;

import java.util.ArrayList;
import java.util.List;

import gool.parser.csharp.CsharpVisitor;

public class variable_declarators extends CsharpNode {

public List<variable_declarator> variable_declarators;
	
	public variable_declarators() {
		this.variable_declarators = new ArrayList<variable_declarator>();
	}

	@Override
	public Object accept(CsharpVisitor v) {
		// TODO Auto-generated method stub
		return v.visit_variable_declarators(this);
	}

	public void add(variable_declarator e) {
		variable_declarators.add(e);
	}

	@Override
	public String toStringTree(int tab) {
		String res = nbTab(tab) + "variable_declarators:\n";
		for (CsharpNode c : variable_declarators) {
			res += c.toStringTree(tab+1);
		}
		return res;
	}

}
