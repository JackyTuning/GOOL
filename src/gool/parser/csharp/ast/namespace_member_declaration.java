package gool.parser.csharp.ast;

import gool.parser.csharp.CsharpVisitor;

public class namespace_member_declaration extends CsharpNode {

	public CsharpNode attributes;
	public modifiers modifiers;
	public CsharpNode type_declaration;
	
	public namespace_member_declaration(CsharpNode a,
			modifiers b, CsharpNode c) {
		attributes = a;
				modifiers = b;
				type_declaration =c;
	}

	@Override
	public Object accept(CsharpVisitor v) {
		return v.visit_namespace_member_declaration(this);
	}

	public String toStringTree(int tab) {
		return nbTab(tab) + "namespace_member_declaration:\n"
		 		+ (attributes != null ? attributes.toStringTree(tab + 1) : "")
 		+ (modifiers != null ? modifiers.toStringTree(tab + 1) : "")
 		+ (type_declaration != null ? type_declaration.toStringTree(tab + 1) : "");
	}

	public CsharpNode getAttributes() {
		return attributes;
	}

	public modifiers getModifiers() {
		return modifiers;
	}

	public CsharpNode getType_declaration() {
		return type_declaration;
	}

	
	
}
