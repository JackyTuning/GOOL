package gool.parser.csharp.ast;

import gool.parser.csharp.CsharpVisitor;

public class method_header extends CsharpNode{
	 qid member_name;
	 formal_parameter_list formal_parameter_list;
	 CsharpNode type_parameter_constraints_clauses;

	public method_header(qid member_name,
			formal_parameter_list formal_parameter_list,
			CsharpNode type_parameter_constraints_clauses) {
		super();
		this.member_name = member_name;
		this.formal_parameter_list = formal_parameter_list;
		this.type_parameter_constraints_clauses = type_parameter_constraints_clauses;
	}

	@Override
	public Object accept(CsharpVisitor v) {
		return null;
	}

	@Override
	public String toStringTree(int tab) {
		// TODO Auto-generated method stub
		return nbTab(tab) + "method_header:\n"
				+ (member_name != null ? member_name.toStringTree(tab + 1) : "")
				+ (formal_parameter_list != null ? formal_parameter_list.toStringTree(tab + 1) : "")
				+ (type_parameter_constraints_clauses != null ? type_parameter_constraints_clauses.toStringTree(tab + 1) : "");
	}

	public qid getMember_name() {
		return member_name;
	}

	public formal_parameter_list getFormal_parameter_list() {
		return formal_parameter_list;
	}

	public CsharpNode getType_parameter_constraints_clauses() {
		return type_parameter_constraints_clauses;
	}
	
}
