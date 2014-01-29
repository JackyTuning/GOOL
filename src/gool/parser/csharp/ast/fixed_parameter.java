package gool.parser.csharp.ast;

import gool.parser.csharp.CsharpVisitor;

public class fixed_parameter extends statement{

	public CsharpNode parameter_modifier;
	public type type;
	public identifier identifier;
	public CsharpNode default_argument;
	
	public fixed_parameter(CsharpNode parameter_modifier, type type, identifier identifier, statement default_argument) {
		super();
		this.parameter_modifier = parameter_modifier;
		this.type = type;
		this.identifier = identifier;
		this.default_argument = default_argument;

	}
	
	@Override
	public Object accept(CsharpVisitor v) {
		// TODO Auto-generated method stub
		return v.visit_fixed_parameter(this);
	}

	@Override
	public String toStringTree(int tab) {
		// TODO Auto-generated method stub
		return nbTab(tab) + "fixed_parameter:\n"
		 		+ (parameter_modifier != null ? parameter_modifier.toStringTree(tab + 1) : "")
		 		+ (type != null ? type.toStringTree(tab + 1) : "")
		 		+ (identifier != null ? identifier.toStringTree(tab + 1) : "")
		 		+ (default_argument != null ? default_argument.toStringTree(tab + 1) : "")
		 		;
	}

	public CsharpNode getParameter_modifier() {
		return parameter_modifier;
	}

	public type getType() {
		return type;
	}

	public identifier getIdentifier() {
		return identifier;
	}

	public CsharpNode getDefault_argument() {
		return default_argument;
	}
	
	
}
