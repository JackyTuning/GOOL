package gool.parser.csharp.ast;

import gool.parser.csharp.CsharpVisitor;

public class local_constant_declaration extends statement{


	 type type;
	 CsharpNode constant_declarators;
	
	public local_constant_declaration(type type,
			CsharpNode constant_declarators) {
		super();
		this.type = type;
		this.constant_declarators = constant_declarators;
	}
	
	@Override
	public Object accept(CsharpVisitor v) {
		// TODO Auto-generated method stub
		return v.visit_local_constant_declaration(this);
	}
	@Override
	public String toStringTree(int tab) {
		// TODO Auto-generated method stub
		return nbTab(tab) +  "local_variable_declaration:\n"
				+ (type != null ? type.toStringTree(tab + 1) : "")
				+ (constant_declarators != null ? constant_declarators.toStringTree(tab + 1) : "");
	}

	public type getType() {
		return type;
	}

	public CsharpNode getConstant_declarators() {
		return constant_declarators;
	}
	
	
	
}
