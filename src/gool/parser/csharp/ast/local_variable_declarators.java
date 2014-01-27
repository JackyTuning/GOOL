package gool.parser.csharp.ast;

import java.util.ArrayList;

import gool.parser.csharp.CsharpVisitor;

public class local_variable_declarators extends CsharpNode {

	ArrayList<local_variable_declarator> local_variable_declarators;
	
	public local_variable_declarators(){
		local_variable_declarators=new ArrayList<local_variable_declarator>();
	}
	
	public void add(local_variable_declarator e){
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

	public ArrayList<local_variable_declarator> getLocal_variable_declarators() {
		return local_variable_declarators;
	}
	
	

}
