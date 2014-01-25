package gool.parser.csharp.ast;

import java.util.ArrayList;

import gool.parser.csharp.CsharpVisitor;

public class statement_list extends statement{
	
	public ArrayList<statement> statement_list; 

	public statement_list() {
		this.statement_list = new ArrayList<statement>();
	}
	
	public void add(statement e){
		statement_list.add(e);
	}
	@Override
	public Object accept(CsharpVisitor v) {
		// TODO Auto-generated method stub
		return v.visit_statement_list(this);
	}

	@Override
	public String toStringTree(int tab) {
		// TODO Auto-generated method stub
	 String res = nbTab(tab) + "statement_list:\n";
		for (CsharpNode c : statement_list) {
			res += c.toStringTree(tab+1);
		}
		return res;
	}

}
