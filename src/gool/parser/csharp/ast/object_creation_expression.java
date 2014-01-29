package gool.parser.csharp.ast;

import gool.parser.csharp.CsharpVisitor;

public class object_creation_expression extends expression{
	public type type;
	public argument_list argument_list;
	
	@Override
	public Object accept(CsharpVisitor v) {
		return v.visit_object_creation_expression(this);
	}

	public object_creation_expression(gool.parser.csharp.ast.type type,
			gool.parser.csharp.ast.argument_list argument_list) {
		super();
		this.type = type;
		this.argument_list = argument_list;
	}

	@Override
	public String toStringTree(int tab) {
		return nbTab(tab)+"object_creation_expression:\n"
			 + (type != null ? type.toStringTree(tab + 1) : "")
			 + (argument_list != null ? argument_list.toStringTree(tab + 1) : "");
	}

}
