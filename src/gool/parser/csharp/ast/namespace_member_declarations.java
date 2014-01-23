package gool.parser.csharp.ast;

import java.util.ArrayList;
import java.util.List;

import gool.parser.csharp.CsharpVisitor;

public class namespace_member_declarations extends CsharpNode {

List<CsharpNode> namespace_member_declarations;
	
	public namespace_member_declarations() {
		this.namespace_member_declarations = new ArrayList<CsharpNode>();
	}

	@Override
	public Object accept(CsharpVisitor v) {
		// TODO Auto-generated method stub
		return null;
	}

	public void add(CsharpNode e) {
		namespace_member_declarations.add(e);
	}

	@Override
	public String toStringTree(int tab) {
		String res = nbTab(tab) + "namespace_member_declarations:\n";
		for (CsharpNode c : namespace_member_declarations) {
			res += c.toStringTree(tab+1);
		}
		return res;
	}

}
