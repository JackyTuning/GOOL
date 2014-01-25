package gool.parser.csharp.ast;

import gool.parser.csharp.CsharpVisitor;

public class local_variable_declarator extends CsharpNode {

	public identifier identifier;
	public expression local_variable_initializer;
	
	public local_variable_declarator(identifier identifier,
			expression local_variable_initializer) {
		super();
		this.identifier = identifier;
		this.local_variable_initializer = local_variable_initializer;
	}
	
	@Override
	public Object accept(CsharpVisitor v) {
		return v.visit_variable_declarator(this);
	}

	@Override
	public String toStringTree(int tab) {
		// TODO Auto-generated method stub
		return nbTab(tab) + "local_variable_declarator:\n"
				+ (identifier != null ? identifier.toStringTree(tab + 1) : "")
				+ (local_variable_initializer != null ? local_variable_initializer.toStringTree(tab + 1) : "")
				;
	}

}
