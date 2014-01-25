package gool.parser.csharp.ast;

import gool.parser.csharp.CsharpVisitor;

public class conditional_expression extends expression{

	public expression expression1;
	public expression expression2;
	public expression expression3;
	
	public conditional_expression(expression expression1, expression expression2, expression expression3) {
		super();
		this.expression1 = expression1;
		this.expression2 = expression2;
		this.expression3 = expression3;

	}
	
	@Override
	public Object accept(CsharpVisitor v) {
		// TODO Auto-generated method stub
		return v.visit_conditional_expression(this);
	}

	@Override
	public String toStringTree(int tab) {
		// TODO Auto-generated method stub
		return nbTab(tab) + "conditional_expression:\n"
		 		+ (expression1 != null ? expression1.toStringTree(tab + 1) : "")
		 		+ (expression2 != null ? expression2.toStringTree(tab + 1) : "")
		 		+ (expression3 != null ? expression3.toStringTree(tab + 1) : "")
		 		;
	}
	

}
