package gool.parser.csharp.ast;

import gool.parser.csharp.CsharpVisitor;

public class class_declaration extends CsharpNode {

	CsharpNode type_or_generic;
	CsharpNode class_base;
	CsharpNode type_parameter_constraints_clauses;
	class_member_declarations class_body;

	public class_declaration(CsharpNode c1, CsharpNode c2,
			CsharpNode c3, class_member_declarations c4) {
		type_or_generic = c1;
		 class_base = c2;
		 type_parameter_constraints_clauses = c3;
		 class_body = c4;
	}

	@Override
	public Object accept(CsharpVisitor v) {
		return v.visit_class_declaration(this);
	}

	@Override
	public String toStringTree(int tab) {
		return nbTab(tab) + "class_declaration:\n"
				+ (type_or_generic != null ? type_or_generic.toStringTree(tab + 1) : "")
		+ (class_base != null ? class_base.toStringTree(tab + 1) : "")
		+ (type_parameter_constraints_clauses != null ? type_parameter_constraints_clauses.toStringTree(tab + 1) : "")
		+ (class_body != null ? class_body.toStringTree(tab + 1) : "");

	}

	public CsharpNode getType_or_generic() {
		return type_or_generic;
	}

	public CsharpNode getClass_base() {
		return class_base;
	}

	public CsharpNode getType_parameter_constraints_clauses() {
		return type_parameter_constraints_clauses;
	}

	public class_member_declarations getClass_body() {
		return class_body;
	}
}
