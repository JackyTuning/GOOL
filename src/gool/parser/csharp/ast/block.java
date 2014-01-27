package gool.parser.csharp.ast;

import gool.parser.csharp.CsharpVisitor;

public class block extends statement {

	statement_list statement_list;
	
	public block(statement_list e) {
		statement_list = e;
	}
	
	@Override
	public Object accept(CsharpVisitor v) {
		// TODO Auto-generated method stub
		return v.visit_block(this);
	}
	
	public String toStringTree(int tab) {
		return nbTab(tab) + "block:\n"
		 		+ (statement_list != null ? statement_list.toStringTree(tab + 1) : "");
	}

	public statement_list getStatement_list() {
		return statement_list;
	}
	
	

}
