package gool.parser.csharp.ast;

import gool.parser.csharp.CsharpVisitor;

public class class_member_declaration extends CsharpNode {
	
	public CsharpNode attributes;
	public CsharpNode modifiers;
	public CsharpNode class_member_declaration_type;

	public class_member_declaration(CsharpNode ca, CsharpNode cb, CsharpNode cd) {
		attributes = ca;
		modifiers = cb;
		class_member_declaration_type = cd;
	}
	

	@Override
	public Object accept(CsharpVisitor v) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public String toStringTree(int tab) {
		return nbTab(tab) + "class_member_declaration:\n"
				 + attributes.toStringTree(tab+1)
				 		+ (modifiers != null ? modifiers.toStringTree(tab + 1) : "")
		+ (class_member_declaration_type != null ? class_member_declaration_type.toStringTree(tab + 1) : "");
	}

}
