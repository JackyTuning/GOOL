package gool.parser.csharp.ast;

import gool.parser.csharp.CsharpVisitor;

public class cast_expression extends expression {

	CsharpNode type;
	CsharpNode unary_expression;
	
	public cast_expression(CsharpNode type, CsharpNode unary_expression) {
		super();
		this.type = type;
		this.unary_expression = unary_expression;
	}

	@Override
	public Object accept(CsharpVisitor v) {
		// TODO Auto-generated method stub
		return v.visit_cast_expression(this);
	}

	@Override
	public String toStringTree(int tab) {
		// TODO Auto-generated method stub
		return nbTab(tab)+"cast_expression:\n"
				+ (type != null ? type.toStringTree(tab+1) : "")
				+ (unary_expression != null ? unary_expression.toStringTree(tab+1) : "");
	}

}
