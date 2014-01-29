package gool.parser.csharp.ast;

import gool.parser.csharp.CsharpVisitor;

public class for_statement extends statement{

	 CsharpNode for_initializer;
	 expression for_condition;
	 CsharpNode for_iterator;
	 statement embedded_statement;
	
	public for_statement(CsharpNode for_initializer, expression for_condition, CsharpNode for_iterator, statement embedded_statement) {
		super();
		this.for_initializer = for_initializer;
		this.for_condition = for_condition;
		this.for_iterator = for_iterator;
		this.embedded_statement = embedded_statement;

	}
	
	@Override
	public Object accept(CsharpVisitor v) {
		// TODO Auto-generated method stub
		return v.visit_for_statement(this);
	}

	@Override
	public String toStringTree(int tab) {
		// TODO Auto-generated method stub
		return nbTab(tab) + "for_statement:\n"
		 		+ (for_initializer != null ? for_initializer.toStringTree(tab + 1) : "")
		 		+ (for_condition != null ? for_condition.toStringTree(tab + 1) : "")
		 		+ (for_iterator != null ? for_iterator.toStringTree(tab + 1) : "")
		 		+ (embedded_statement != null ? embedded_statement.toStringTree(tab + 1) : "")
		 		;
	}

	public CsharpNode getFor_initializer() {
		return for_initializer;
	}

	public expression getFor_condition() {
		return for_condition;
	}

	public CsharpNode getFor_iterator() {
		return for_iterator;
	}

	public statement getEmbedded_statement() {
		return embedded_statement;
	}
	
	

}
