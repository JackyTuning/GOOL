package gool.parser.csharp.ast;

import java.util.ArrayList;

import gool.parser.csharp.CsharpVisitor;

public class statement_expression_list extends CsharpNode{
	
	public ArrayList<expression> statement_expression_list; 

	public statement_expression_list() {
		this.statement_expression_list = new ArrayList<expression>();
	}
	
	public void add(expression e){
		statement_expression_list.add(e);
	}
	@Override
	public Object accept(CsharpVisitor v) {
		// TODO Auto-generated method stub
		return v.visit_statement_expression_list(this);
	}

	@Override
	public String toStringTree(int tab) {
		// TODO Auto-generated method stub
	 String res = nbTab(tab) + "statement_expression_list:\n";
		for (CsharpNode c : statement_expression_list) {
			res += c.toStringTree(tab+1);
		}
		return res;
	}

	public ArrayList<expression> getStatement_expression_list() {
		return statement_expression_list;
	}
	
	

}
