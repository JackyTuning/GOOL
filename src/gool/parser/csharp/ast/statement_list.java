package gool.parser.csharp.ast;

import java.util.ArrayList;

import gool.parser.csharp.CsharpVisitor;

public class statement_list extends CsharpNode{
	
	public ArrayList<CsharpNode> statement_list; 

	public statement_list() {
		this.statement_list = new ArrayList<CsharpNode>();
	}
	
	public void add(CsharpNode e){
		statement_list.add(e);
	}
	@Override
	public Object accept(CsharpVisitor v) {
		return v.visit_statement_list(this);
	}

	@Override
	public String toStringTree(int tab) {
	 String res = nbTab(tab) + "statement_list:\n";
		for (CsharpNode c : statement_list) {
			if (c == null) {
				return res + "NULL";
			}
			res += c.toStringTree(tab+1);
		}
		return res;
	}

}
