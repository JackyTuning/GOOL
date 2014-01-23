package gool.parser.csharp.ast;

import java.util.ArrayList;

import gool.parser.csharp.CsharpVisitor;

public class local_variable_declarators extends CsharpNode {

	public ArrayList<CsharpNode> local_variable_declarators;
	
	public local_variable_declarators(){
		local_variable_declarators=new ArrayList<CsharpNode>();
	}
	
	public void add(CsharpNode e){
		local_variable_declarators.add(e);
	}
	@Override
	public Object accept(CsharpVisitor v) {
		return v.visit_local_variable_declarators(this);
	}

	@Override
	public String toStringTree(int tab) {
		String res = nbTab(tab) + "local_variable_declarators:\n";
		for (CsharpNode c : local_variable_declarators) {
			res += c.toStringTree(tab+1);
		}
		return res;
	}

}
