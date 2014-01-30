package gool.parser.csharp.ast;

import gool.parser.csharp.CsharpVisitor;

import java.util.ArrayList;

public class argument_list extends CsharpNode {
	ArrayList<CsharpNode> argument_list;
	public argument_list(){
		argument_list = new ArrayList<CsharpNode>();
	}
	public void add(CsharpNode e){
		argument_list.add(e);
	}

	@Override
	public Object accept(CsharpVisitor v) {
		// TODO Auto-generated method stub
		return v.visit_argument_list(this);
	}
	@Override
	public String toStringTree(int tab) {
		// TODO Auto-generated method stub
		String res=nbTab(tab)+"argument_list:\n";
		for (CsharpNode c : argument_list) {
			res += c.toStringTree(tab+1);
		}
		return res;
	}
	public ArrayList<CsharpNode> getArgument_list() {
		return argument_list;
	}
	
}