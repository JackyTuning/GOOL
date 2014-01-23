package gool.parser.csharp.ast;

import gool.parser.csharp.CsharpVisitor;

public class class_member_declaration_type extends CsharpNode {

	public CsharpNode attributes;
	public CsharpNode modifiers;
	public CsharpNode type;
	public CsharpNode class_member_declaration_type;

	public class_member_declaration_type(CsharpNode ca, CsharpNode cb,
			CsharpNode cc, CsharpNode cd) {
		attributes = ca;
		modifiers = cb;
		type = cc;
		class_member_declaration_type = cd;
	}

	@Override
	public Object accept(CsharpVisitor v) {
		return v.visit_class_member_declaration_type(this);
	}

	@Override
	public String toStringTree(int tab) {
		return nbTab(tab)
				+ "class_member_declaration_type:\n"
				+ (attributes != null ? attributes.toStringTree(tab + 1) : "")
				+ (modifiers != null ? modifiers.toStringTree(tab + 1) : "")
				+ (type != null ? type.toStringTree(tab + 1) : "")
				+ (class_member_declaration_type != null ? class_member_declaration_type.toStringTree(tab + 1) : "");
	}

}
