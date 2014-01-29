package gool.parser.csharp.ast;

import gool.parser.csharp.CsharpVisitor;

public class unary_expression extends expression {

	public expression unary_expression;

	public unary_expression(expression unary_expression) {
		super();
		this.unary_expression = unary_expression;
	}


	@Override
	public Object accept(CsharpVisitor v) {
		// TODO Auto-generated method stub
		return v.visit_unary_expression(this);
	}


	@Override
	public String toStringTree(int tab) {
			return nbTab(tab) + "unary_expression\n" 
						+ (unary_expression != null ? unary_expression.toStringTree(tab+1) : "");			
	}


	public expression getUnary_expression() {
		return unary_expression;
	}

}
