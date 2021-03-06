package gool.parser.csharp.ast;

import gool.parser.csharp.CsharpVisitor;

public class return_statement extends statement {

	private expression expression;
	
	public return_statement(expression expression) {
		this.expression = expression;
	}
	
	@Override
	public Object accept(CsharpVisitor v) {
		// TODO Auto-generated method stub
		return v.visit_return_statement(this);
	}
	
	public String toStringTree(int tab) {
		return nbTab(tab) + "return_statement:\n"
		 		+ (expression != null ? getExpression().toStringTree(tab + 1) : "");

	}

	public expression getExpression() {
		return expression;
	}

}
