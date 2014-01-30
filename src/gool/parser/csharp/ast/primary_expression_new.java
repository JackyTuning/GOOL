package gool.parser.csharp.ast;

import gool.parser.csharp.CsharpVisitor;

public class primary_expression_new extends expression {

	expression object_creation_expression;
	expression primary_expression_part;
	
	public primary_expression_new(expression object_creation_expression,
			expression primary_expression_part) {
		super();
		this.object_creation_expression = object_creation_expression;
		this.primary_expression_part = primary_expression_part;
	}
	
	
	public primary_expression_new(expression object_creation_expression) {
		super();
		this.object_creation_expression = object_creation_expression;
	}


	@Override
	public Object accept(CsharpVisitor v) {
		return v.visit_primary_expression_new(this);
	}

	@Override
	public String toStringTree(int tab) {
		return nbTab(tab)+ "primary_expression:\n" + (object_creation_expression != null ? object_creation_expression.toStringTree(tab + 1) : "")
				+(primary_expression_part != null ? primary_expression_part.toStringTree(tab + 1) : "");
		}


	public expression getObject_creation_expression() {
		return object_creation_expression;
	}


	public expression getPrimary_expression_part() {
		return primary_expression_part;
	}
	
	

}
