package gool.parser.csharp.ast;

import gool.parser.csharp.CsharpVisitor;

public class compilation_unit extends CsharpNode {

	CsharpNode namespace_body;
	
	public compilation_unit(CsharpNode e) {
		namespace_body = e;
	}
	
	@Override
	public Object accept(CsharpVisitor v) {
		// TODO Auto-generated method stub
		return v.visit_compilation_unit(this);
	}
	
	public String toStringTree(int tab) {
		return nbTab(tab) + "compilation_unit:\n"
		 		+ (namespace_body != null ? namespace_body.toStringTree(tab + 1) : "");

	}

}
