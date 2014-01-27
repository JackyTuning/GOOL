package gool.parser.csharp.ast;

import gool.parser.csharp.CsharpVisitor;

public class class_member_declaration_meth extends CsharpNode {

	public CsharpNode attributes;
	public CsharpNode modifiers;
	public CsharpNode type;
	public CsharpNode method_declaration;

	public class_member_declaration_meth(CsharpNode ca, CsharpNode cb,
			CsharpNode cc, CsharpNode cd) {
		attributes = ca;
		modifiers = cb;
		type = cc;
		method_declaration = cd;
	}

	@Override
	public Object accept(CsharpVisitor v) {
		return v.visit_class_member_declaration_meth(this);
	}

	@Override
	public String toStringTree(int tab) {
		return nbTab(tab)
				+ "class_member_declaration_meth:\n"
				+ (attributes != null ? attributes.toStringTree(tab + 1) : "")
				+ (modifiers != null ? modifiers.toStringTree(tab + 1) : "")
				+ (type != null ? type.toStringTree(tab + 1) : "")
				+ (method_declaration != null ? method_declaration.toStringTree(tab + 1) : "");
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

	public CsharpNode getMethod_declaration() {
		return method_declaration;
	}

	
}
