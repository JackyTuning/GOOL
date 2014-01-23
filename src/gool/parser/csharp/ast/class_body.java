package gool.parser.csharp.ast;

import gool.parser.csharp.CsharpVisitor;

public class class_body extends CsharpNode {

	
	CsharpNode class_member_declarations;
	
	public class_body(CsharpNode c) {
		class_member_declarations  = c;
	}

	@Override
	public Object accept(CsharpVisitor v) {
		return null;
	}

	@Override
	public String toStringTree(int tab) {
		return nbTab(tab) + "class_body:\n"
				+ (class_member_declarations != null ? class_member_declarations.toStringTree(tab + 1) : "");
	}
	
	

}
