package gool.parser.csharp.ast;

import java.util.ArrayList;

import gool.parser.csharp.CsharpVisitor;

public class constant_declarators extends CsharpNode{

	public ArrayList<CsharpNode> constant_declarators;
	
	public constant_declarators(){
		constant_declarators=new ArrayList<CsharpNode>();
	}
	
	public void add(CsharpNode e){
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

}
