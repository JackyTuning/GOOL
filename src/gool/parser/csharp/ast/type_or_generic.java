package gool.parser.csharp.ast;

import gool.parser.csharp.CsharpVisitor;

public class type_or_generic extends CsharpNode{

	public identifier identifier;
	public CsharpNode generic_argument_list;
	
	public type_or_generic(identifier identifier,CsharpNode generic_argument_list) {
		super();
		this.identifier = identifier;
		this.generic_argument_list = generic_argument_list;
	}
	
	@Override
	public Object accept(CsharpVisitor v) {
		// TODO Auto-generated method stub
		return v.visit_type_or_generic(this);
	}

	@Override
	public String toStringTree(int tab) {
		// TODO Auto-generated method stub
		return nbTab(tab) + "type_or_generic:\n"
		 		+ (identifier != null ? identifier.toStringTree(tab + 1) : "")
		 		+ (generic_argument_list != null ? generic_argument_list.toStringTree(tab + 1) : "")
		 		;
	}
	

}
