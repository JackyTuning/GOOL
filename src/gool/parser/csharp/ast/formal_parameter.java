package gool.parser.csharp.ast;

import gool.parser.csharp.CsharpVisitor;

public class formal_parameter extends CsharpNode{

	 CsharpNode attributes;
	 CsharpNode parameter;
	
	public formal_parameter(CsharpNode attributes, CsharpNode parameter) {
		super();
		this.attributes = attributes;
		this.parameter = parameter;
	}
	
	@Override
	public Object accept(CsharpVisitor v) {
		// TODO Auto-generated method stub
		return v.visit_formal_parameter(this);
	}

	@Override
	public String toStringTree(int tab) {
		// TODO Auto-generated method stub
		return nbTab(tab) + "formal_parameter:\n"
		 		+ (attributes != null ? attributes.toStringTree(tab + 1) : "")
		 		+ (parameter != null ? parameter.toStringTree(tab + 1) : "")
		 		;
	}

	public CsharpNode getAttributes() {
		return attributes;
	}

	public CsharpNode getParameter() {
		return parameter;
	}
	

}
