package gool.parser.csharp.ast;

import gool.parser.csharp.CsharpVisitor;

public class namespace_body extends CsharpNode {

	CsharpNode extern_alias_directives;
	CsharpNode using_directives;
	CsharpNode global_attributes;
	CsharpNode namespace_member_declarations;

	
	public namespace_body(CsharpNode a, CsharpNode b,
			CsharpNode c, CsharpNode d) {
		 extern_alias_directives = a;
		 using_directives = b;
		 global_attributes = c;
		 namespace_member_declarations = d;	}

	@Override
	public Object accept(CsharpVisitor v) {
		
		return v.visit_namespace_body(this);
	}
	
	public String toStringTree(int tab) {
		return nbTab(tab) + "namespace_body:\n"
		 		+ (extern_alias_directives != null ? extern_alias_directives.toStringTree(tab + 1) : "")
 		+ (using_directives != null ? using_directives.toStringTree(tab + 1) : "")
 		+ (global_attributes != null ? global_attributes.toStringTree(tab + 1) : "")
 		+ (namespace_member_declarations != null ? namespace_member_declarations.toStringTree(tab + 1) : "");

	}

	public CsharpNode getExtern_alias_directives() {
		return extern_alias_directives;
	}

	public CsharpNode getUsing_directives() {
		return using_directives;
	}

	public CsharpNode getGlobal_attributes() {
		return global_attributes;
	}

	public CsharpNode getNamespace_member_declarations() {
		return namespace_member_declarations;
	}
	
	

}
