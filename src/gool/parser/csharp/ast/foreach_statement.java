package gool.parser.csharp.ast;

import gool.parser.csharp.CsharpVisitor;

public class foreach_statement extends statement{

	public type local_variable_type;
	public identifier identifier;
	public expression expression;
	public statement embedded_statement;

	
	public foreach_statement(type local_variable_type, identifier identifier, expression expression, statement embedded_statement) {
		super();
		this.local_variable_type = local_variable_type;
		this.identifier = identifier;
		this.expression = expression;
		this.embedded_statement = embedded_statement;
	}
	
	@Override
	public Object accept(CsharpVisitor v) {
		// TODO Auto-generated method stub
		return v.visit_foreach_statement(this);
	}

	@Override
	public String toStringTree(int tab) {
		// TODO Auto-generated method stub
		return nbTab(tab) + "foreach_statement:\n"
		 		+ (local_variable_type != null ? local_variable_type.toStringTree(tab + 1) : "")
		 		+ (identifier != null ? identifier.toStringTree(tab + 1) : "")
		 		+ (expression != null ? expression.toStringTree(tab + 1) : "")
		 		+ (embedded_statement != null ? embedded_statement.toStringTree(tab + 1) : "")
		 		;
	}
	

}
