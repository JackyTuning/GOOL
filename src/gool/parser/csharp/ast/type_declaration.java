package gool.parser.csharp.ast;

import gool.parser.csharp.CsharpVisitor;

public class type_declaration extends CsharpNode {

	CsharpNode type_declaration;
	
	public type_declaration(CsharpNode e) {
		type_declaration = e;
	}
	
	@Override
	public Object accept(CsharpVisitor v) {
		// TODO Auto-generated method stub
		return v.visit_type_declaration(this);
	}
	
	public String toStringTree(int tab) {
		return nbTab(tab) + "type_declaration:\n"
		 		+ (type_declaration != null ? type_declaration.toStringTree(tab + 1) : "");
		}

}
