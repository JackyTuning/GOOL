package gool.parser.csharp.ast;

import gool.parser.csharp.CsharpVisitor;

public class constant_declarator extends CsharpNode{
	CsharpNode identifier;
	CsharpNode constant_expression;

	public constant_declarator(CsharpNode identifier,
			CsharpNode constant_expression) {
		super();
		this.identifier = identifier;
		this.constant_expression = constant_expression;
	}
	
	@Override
	public Object accept(CsharpVisitor v) {
		// TODO Auto-generated method stub
		return v.visit_constant_declarator(this);
	}
	
	@Override
	public String toStringTree(int tab) {
		// TODO Auto-generated method stub
		return nbTab(tab)+"constant_declarator:\n"
				+ (identifier != null ? identifier.toStringTree(tab + 1) : "")
				+  (constant_expression != null ? constant_expression.toStringTree(tab + 1) : "");
	}
}
