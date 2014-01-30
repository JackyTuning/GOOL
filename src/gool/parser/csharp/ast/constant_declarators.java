package gool.parser.csharp.ast;

import java.util.ArrayList;

import gool.parser.csharp.CsharpVisitor;

public class constant_declarators extends CsharpNode{

	ArrayList<constant_declarator> constant_declarators;
	
	public constant_declarators(){
		constant_declarators=new ArrayList<constant_declarator>();
	}
	
	public void add(constant_declarator e){
		constant_declarators.add(e);
	}

	@Override
	public Object accept(CsharpVisitor v) {
		// TODO Auto-generated method stub
		return v.visit_constant_declarators(this);
	}

	@Override
	public String toStringTree(int tab) {
		String res = nbTab(tab) + "constant_declarators:\n";
		for (CsharpNode c : constant_declarators) {
			res += c.toStringTree(tab+1);
		}
		return res;
	}

	public ArrayList<constant_declarator> getConstant_declarators() {
		return constant_declarators;
	}
	
	

}
