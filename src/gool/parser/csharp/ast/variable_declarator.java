package gool.parser.csharp.ast;

import gool.parser.csharp.CsharpVisitor;

public class variable_declarator extends CsharpNode{

	 CsharpNode type_name;
	 CsharpNode variable_initializer;
	
	public variable_declarator(CsharpNode type_name, CsharpNode variable_initializer) {
		super();
		this.type_name = type_name;
		this.variable_initializer = variable_initializer;
	}
	
	@Override
	public Object accept(CsharpVisitor v) {
		// TODO Auto-generated method stub
		return v.visit_variable_declarator(this);
	}

	@Override
	public String toStringTree(int tab) {
		// TODO Auto-generated method stub
		return nbTab(tab) + "variable_declarator:\n"
		 		+ (type_name != null ? type_name.toStringTree(tab + 1) : "")
		 		+ (variable_initializer != null ? variable_initializer.toStringTree(tab + 1) : "")
		 		;
	}

	public CsharpNode getType_name() {
		return type_name;
	}

	public CsharpNode getVariable_initializer() {
		return variable_initializer;
	}
	

}
