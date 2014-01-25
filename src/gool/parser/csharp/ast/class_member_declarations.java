package gool.parser.csharp.ast;

import java.util.ArrayList;
import java.util.List;

import gool.parser.csharp.CsharpVisitor;

public class class_member_declarations extends CsharpNode {

	List<CsharpNode> class_member_declarations;
	
	public class_member_declarations() {
		this.class_member_declarations = new ArrayList<CsharpNode>();
	}

	@Override
	public Object accept(CsharpVisitor v) {
		// TODO Auto-generated method stub
		return v.visit_class_member_declarations(this);
	}

	public void add(CsharpNode e) {
		class_member_declarations.add(e);
	}

	@Override
	public String toStringTree(int tab) {
		String res = nbTab(tab) + "class_member_declarations:\n";
		for (CsharpNode c : class_member_declarations) {
			if (c != null) 
				res += c.toStringTree(tab+1);
			else 
				System.out.println("NULL\n");
		}
		return res;
	}

}
