package gool.parser.csharp.ast;

import gool.parser.csharp.CsharpVisitor;

public class primary_expression extends expression{

	public CsharpNode boolean_expression;
	public CsharpNode embedded_statement;
	
	public primary_expression(CsharpNode boolean_expression, CsharpNode embedded_statement) {
		super();
		this.boolean_expression = boolean_expression;
		this.embedded_statement = embedded_statement;
	}
	
	@Override
	public Object accept(CsharpVisitor v) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String toStringTree(int tab) {
		// TODO Auto-generated method stubca
		return nbTab(tab) + "primary_expression:\n"
		 		+ (boolean_expression != null ? boolean_expression.toStringTree(tab + 1) : "")
		 		+ (embedded_statement != null ? embedded_statement.toStringTree(tab + 1) : "")
		 		;
	}
	

}
