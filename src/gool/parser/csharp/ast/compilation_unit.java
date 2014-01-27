package gool.parser.csharp.ast;

import gool.parser.csharp.CsharpVisitor;

public class compilation_unit extends CsharpNode {

	namespace_body namespace_body;
	
	public compilation_unit(namespace_body e) {
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

	public namespace_body getNamespace_body() {
		return namespace_body;
	}
	
	

}
