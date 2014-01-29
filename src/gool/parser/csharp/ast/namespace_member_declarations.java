package gool.parser.csharp.ast;

import java.util.ArrayList;
import java.util.List;

import gool.parser.csharp.CsharpVisitor;

public class namespace_member_declarations extends CsharpNode {

	public List<CsharpNode> namespace_member_declarations;

	public namespace_member_declarations() {
		this.namespace_member_declarations = new ArrayList<CsharpNode>();
	}

	@Override
	public Object accept(CsharpVisitor v) {
		// TODO Auto-generated method stub
		return v.visit_namespace_member_declarations(this);
	}

	public void add(CsharpNode csharpNode) {
		namespace_member_declarations.add(csharpNode);
	}

	@Override
	public String toStringTree(int tab) {
		String res = nbTab(tab) + "namespace_member_declarations:\n";
		for (CsharpNode c : namespace_member_declarations) {
			res += c.toStringTree(tab + 1);
		}
		return res;
	}

	public List<CsharpNode> getNamespace_member_declarations() {
		return namespace_member_declarations;
	}

	
}
