package gool.parser.csharp.ast;

import gool.parser.csharp.CsharpVisitor;

public class local_variable_declaration extends statement{


	public type local_variable_type;
	public local_variable_declarators local_variable_declarators;
	
	public local_variable_declaration(type local_variable_type,
			local_variable_declarators local_variable_declarators) {
		super();
		this.local_variable_type = local_variable_type;
		this.local_variable_declarators = local_variable_declarators;
	}
	
	@Override
	public Object accept(CsharpVisitor v) {
		// TODO Auto-generated method stub
		return v.visit_local_variable_declaration(this);
	}
	@Override
	public String toStringTree(int tab) {
		// TODO Auto-generated method stub
		return nbTab(tab) +  "local_variable_declaration:\n"
				+ (local_variable_type != null ? local_variable_type.toStringTree(tab + 1) : "")
				+ (local_variable_declarators != null ? local_variable_declarators.toStringTree(tab + 1) : "");
	}
}
