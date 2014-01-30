package gool.parser.csharp.ast;

import gool.parser.csharp.CsharpVisitor;

public class access_identifier extends CsharpNode{

	CsharpNode access_operator;
	CsharpNode type_or_generic;
	
	
	public access_identifier(CsharpNode access_operator,
			CsharpNode type_or_generic) {
		super();
		this.access_operator = access_operator;
		this.type_or_generic = type_or_generic;
	}

	public Object accept(CsharpVisitor v) {
		return v.visit_access_identifier(this);
	}

	@Override
	public String toStringTree(int tab) {
		return nbTab(tab) +"access_identifier:\n"
				+ (access_operator != null ? access_operator.toStringTree(tab + 1) : "")
				+ (type_or_generic != null ? type_or_generic.toStringTree(tab + 1) : "");
	}


	
}
