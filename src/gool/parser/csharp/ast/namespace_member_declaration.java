package gool.parser.csharp.ast;

import gool.parser.csharp.CsharpVisitor;

public class namespace_member_declaration extends CsharpNode {

	CsharpNode attributes;
	CsharpNode modifiers;
	CsharpNode type_declaration;
	
	public namespace_member_declaration(CsharpNode a,
			CsharpNode b, CsharpNode c) {
		attributes = a;
				modifiers = b;
				type_declaration =c;
	}

	@Override
	public Object accept(CsharpVisitor v) {
		return v.vistor_namespace_member_declaration();
	}

	public String toStringTree(int tab) {
		return nbTab(tab) + "namespace_member_declaration:\n"
		 		+ (attributes != null ? attributes.toStringTree(tab + 1) : "")
 		+ (modifiers != null ? modifiers.toStringTree(tab + 1) : "")
 		+ (type_declaration != null ? type_declaration.toStringTree(tab + 1) : "");
	}

	
}
