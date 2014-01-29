package gool.parser.csharp.ast;

import gool.parser.csharp.CsharpVisitor;

public abstract class CsharpNode {
	private String msg;

	public abstract Object accept(CsharpVisitor v);

	public abstract String toStringTree(int tab);
	
	public void setMessage (String str) {
		 msg = str;
	}
	
	protected String nbTab(int tab) {
		String res ="";
		for (int i = 0; i < tab ; i++) {
			res += "    ";
		}
		return res;
	}

	@Override
	public String toString() {
		return msg;
	}
	
	
	
}
