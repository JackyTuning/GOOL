package gool.parser.csharp.ast;

import gool.parser.csharp.CsharpVisitor;

public class primary_expression extends expression {

	expression object_creation_expression;
	expression primary_expression_part;
	CsharpNode primary_expression_start;
	
	public primary_expression(expression object_creation_expression,
			expression primary_expression_part) {
		super();
		this.object_creation_expression = object_creation_expression;
		this.primary_expression_part = primary_expression_part;
	}
	
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
		return nbTab(tab)+ "primary_expression:\n" + (object_creation_expression != null ? object_creation_expression.toStringTree(tab + 1) : "")
				+(primary_expression_part != null ? primary_expression_part.toStringTree(tab + 1) : "")
				+(primary_expression_start != null ? primary_expression_start.toStringTree(tab + 1) : "");
	}

}
