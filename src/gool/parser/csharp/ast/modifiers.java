package gool.parser.csharp.ast;

import java.util.ArrayList;

import gool.parser.csharp.CsharpVisitor;

public class modifiers extends CsharpNode{
	
	public ArrayList<modifier> modifiers; 

	public modifiers() {
		this.modifiers = new ArrayList<modifier>();
	}
	
	public void add(modifier e){
		modifiers.add(e);
	}
	@Override
	public Object accept(CsharpVisitor v) {
		// TODO Auto-generated method stub
		return v.visit_modifiers(this);
	}

	@Override
	public String toStringTree(int tab) {
		// TODO Auto-generated method stub
	 String res = nbTab(tab) + "modifiers:\n";
		for (CsharpNode c : modifiers) {
			res += c.toStringTree(tab+1);
		}
		return res;
	}

}
