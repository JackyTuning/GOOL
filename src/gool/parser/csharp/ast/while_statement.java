package gool.parser.csharp.ast;

import gool.parser.csharp.CsharpVisitor;

public class while_statement extends statement{

	public expression boolean_expression;
	public statement embedded_statement;
	
	public while_statement(expression boolean_expression, statement embedded_statement) {
		super();
		this.boolean_expression = boolean_expression;
		this.embedded_statement = embedded_statement;
	}
	
	@Override
	public Object accept(CsharpVisitor v) {
		// TODO Auto-generated method stub
		return v.visit_while_statement(this);
	}

	@Override
	public String toStringTree(int tab) {
		// TODO Auto-generated method stub
		return nbTab(tab) + "while_statement:\n"
		 		+ (boolean_expression != null ? boolean_expression.toStringTree(tab + 1) : "")
		 		+ (embedded_statement != null ? embedded_statement.toStringTree(tab + 1) : "")
		 		;
	}
	

}
