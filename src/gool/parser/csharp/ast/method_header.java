package gool.parser.csharp.ast;

import gool.parser.csharp.CsharpVisitor;

public class method_header extends CsharpNode{
	public qid member_name;
	public formal_parameter_list formal_parameter_list;
	public CsharpNode type_parameter_constraints_clauses;

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
		// TODO Auto-generated method stub
		return v.visit_method_header(this);
	}

	@Override
	public String toStringTree(int tab) {
		// TODO Auto-generated method stub
		return nbTab(tab) + "method_header:\n"
				+ (member_name != null ? member_name.toStringTree(tab + 1) : "")
				+ (formal_parameter_list != null ? formal_parameter_list.toStringTree(tab + 1) : "")
				+ (type_parameter_constraints_clauses != null ? type_parameter_constraints_clauses.toStringTree(tab + 1) : "");
	}

}
