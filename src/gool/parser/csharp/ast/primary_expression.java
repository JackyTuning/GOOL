package gool.parser.csharp.ast;

import gool.parser.csharp.CsharpVisitor;

public class primary_expression extends expression {

	CsharpNode primary_expression_start;
	
	
	public primary_expression(CsharpNode csharpNode) {
		// TODO Auto-generated constructor stub
		this.primary_expression_start=csharpNode;
	}

	@Override
	public Object accept(CsharpVisitor v) {
		return v.visit_primary_expression(this);
	}

	@Override
	public String toStringTree(int tab) {
		return nbTab(tab)+ "primary_expression:\n" 
				+(primary_expression_start != null ? primary_expression_start.toStringTree(tab + 1) : "");
	}

}
