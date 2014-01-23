package gool.parser.csharp.ast;

import gool.parser.csharp.CsharpVisitor;

public abstract class CsharpNode {
	public abstract Object accept(CsharpVisitor v);

	public abstract String toStringTree(int tab);
	
	protected String nbTab(int tab) {
		String res ="";
		for (int i = 0; i < tab ; i++) {
			res += "    ";
		}
		return res;
	}
	
}
