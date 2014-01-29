package gool.parser.csharp.ast;

import gool.parser.csharp.CsharpVisitor;

public class primary_or_array_creation_expression extends expression {

	expression primary_expression;
	public primary_or_array_creation_expression(expression primary_expression) {
		super();
		this.primary_expression = primary_expression;
	}

	@Override
	public Object accept(CsharpVisitor v) {
		// TODO Auto-generated method stub
		return v.visit_primary_or_array_creation_expression(this);
	}

	@Override
	public String toStringTree(int tab) {
		// TODO Auto-generated method stub
		return nbTab(tab) + "primary_or_array_creation_expression:\n"+ (primary_expression != null ? primary_expression.toStringTree(tab+1) : "");
	}

}
