package gool.parser.csharp.ast;

import gool.parser.csharp.CsharpVisitor;

public class method_declaration extends CsharpNode{

	 method_header method_header;

	 block method_body;
	
	public method_declaration(method_header method_header, block block) {
		super();
		this.method_header = method_header;
		this.method_body = block;
	}
	
	@Override
	public Object accept(CsharpVisitor v) {
		// TODO Auto-generated method stub
		return v.visit_method_declaration(this);
	}

	@Override
	public String toStringTree(int tab) {
		// TODO Auto-generated method stub
		return nbTab(tab) + "method_declaration:\n"
		 		+ (method_header != null ? method_header.toStringTree(tab + 1) : "")
		 		+ (method_body != null ? method_body.toStringTree(tab + 1) : "")
		 		;
	}

	public method_header getMethod_header() {
		return method_header;
	}

	public block getMethod_body() {
		return method_body;
	}
	

}
