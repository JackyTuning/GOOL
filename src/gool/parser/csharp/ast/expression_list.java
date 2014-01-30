package gool.parser.csharp.ast;

import java.util.ArrayList;

import gool.parser.csharp.CsharpVisitor;

public class expression_list extends expression {

	ArrayList<CsharpNode> expression_list;
	public expression_list(){
		expression_list=new ArrayList<CsharpNode>();
	}
	@Override
	public Object accept(CsharpVisitor v) {
		// TODO Auto-generated method stub
		return v.visit_expression_list(this);
	}

	@Override
	public String toStringTree(int tab) {
		// TODO Auto-generated method stub
		String res = nbTab(tab)+"expression_list:\n";
		for (CsharpNode c : expression_list){
			res += c.toStringTree(tab+1);
		}
		return res;
	}

	public void add(gool.parser.csharp.ast.expression expression) {
		// TODO Auto-generated method stub
		expression_list.add(expression);
	}

}
