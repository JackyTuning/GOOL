package gool.parser.csharp.ast;

import gool.parser.csharp.CsharpVisitor;

public class if_statement extends statement{

	 expression boolean_expression;
	 statement embedded_statement;
	 statement else_statement;
	
	public if_statement(expression boolean_expression, statement embedded_statement, statement else_statement) {
		super();
		this.boolean_expression = boolean_expression;
		this.embedded_statement = embedded_statement;
		this.else_statement = else_statement;

	}
	
	@Override
	public Object accept(CsharpVisitor v) {
		// TODO Auto-generated method stub
		return v.visit_if_statement(this);
	}

	@Override
	public String toStringTree(int tab) {
		// TODO Auto-generated method stub
		return nbTab(tab) + "if_statement:\n"
		 		+ (boolean_expression != null ? boolean_expression.toStringTree(tab + 1) : "")
		 		+ (embedded_statement != null ? embedded_statement.toStringTree(tab + 1) : "")
		 		+ (else_statement != null ? else_statement.toStringTree(tab + 1) : "")
		 		;
	}

	public expression getBoolean_expression() {
		return boolean_expression;
	}

	public statement getEmbedded_statement() {
		return embedded_statement;
	}

	public statement getElse_statement() {
		return else_statement;
	}
	
	
}
