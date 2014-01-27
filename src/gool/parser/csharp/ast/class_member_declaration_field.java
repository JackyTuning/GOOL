package gool.parser.csharp.ast;

import gool.parser.csharp.CsharpVisitor;

public class class_member_declaration_field extends CsharpNode {

	public CsharpNode attributes;
	public CsharpNode modifiers;
	public CsharpNode type;
	public CsharpNode field_declaration;

	public class_member_declaration_field(CsharpNode ca, CsharpNode cb,
			CsharpNode cc, CsharpNode cd) {
		attributes = ca;
		modifiers = cb;
		type = cc;
		field_declaration = cd;
	}

	@Override
	public Object accept(CsharpVisitor v) {
		return v.visit_class_member_declaration_field(this);
	}

	@Override
	public String toStringTree(int tab) {
		return nbTab(tab)
				+ "class_member_declaration_field:\n"
				+ (attributes != null ? attributes.toStringTree(tab + 1) : "")
				+ (modifiers != null ? modifiers.toStringTree(tab + 1) : "")
				+ (type != null ? type.toStringTree(tab + 1) : "")
				+ (field_declaration != null ? field_declaration.toStringTree(tab + 1) : "");
	}

	public CsharpNode getAttributes() {
		return attributes;
	}

	public CsharpNode getModifiers() {
		return modifiers;
	}

	public CsharpNode getType() {
		return type;
	}

	public CsharpNode getField_declaration() {
		return field_declaration;
	}



}
