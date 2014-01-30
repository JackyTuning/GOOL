package gool.parser.csharp.ast;

import gool.parser.csharp.CsharpVisitor;

public class argument extends CsharpNode {

	CsharpNode argument_value;
	@Override
	public Object accept(CsharpVisitor v) {
		return v.visit_argument_value(this);
	}

	@Override
	public String toStringTree(int tab) {
		// TODO Auto-generated method stub
		return nbTab(tab)+"argument:\n"+(argument_value != null ? argument_value.toStringTree(tab + 1) : "");
	}

	public argument(CsharpNode argument_value) {
		super();
		this.argument_value = argument_value;
	}

	public CsharpNode getArgument_value() {
		return argument_value;
	}


}
