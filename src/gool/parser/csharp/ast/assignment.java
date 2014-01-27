package gool.parser.csharp.ast;

import gool.parser.csharp.CsharpVisitor;

public class assignment extends expression{

	 expression unary_expression;
	 assignment_operator assignment_operator;
	 expression expression;
	
	public assignment(expression unary_expression, assignment_operator assignment_operator, expression expression) {
		super();
		this.unary_expression = unary_expression;
		this.assignment_operator = assignment_operator;
		this.expression = expression;

	}
	
	@Override
	public Object accept(CsharpVisitor v) {
		// TODO Auto-generated method stub
		return v.visit_assignment(this);
	}

	@Override
	public String toStringTree(int tab) {
		// TODO Auto-generated method stub
		return nbTab(tab) + "assignment:\n"
		 		+ (unary_expression != null ? unary_expression.toStringTree(tab + 1) : "")
		 		+ (assignment_operator != null ? assignment_operator.toStringTree(tab + 1) : "")
		 		+ (expression != null ? expression.toStringTree(tab + 1) : "")
		 		;
	}

	public expression getUnary_expression() {
		return unary_expression;
	}

	public assignment_operator getAssignment_operator() {
		return assignment_operator;
	}

	public expression getExpression() {
		return expression;
	}
	
	
}
