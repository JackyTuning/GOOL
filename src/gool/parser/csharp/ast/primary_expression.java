package gool.parser.csharp.ast;

import java.util.ArrayList;

import gool.parser.csharp.CsharpVisitor;

public class primary_expression extends expression {

	CsharpNode primary_expression_start;
	ArrayList<CsharpNode> primary_expression_part;
	
	public primary_expression(CsharpNode csharpNode) {
		// TODO Auto-generated constructor stub
		this.primary_expression_start=csharpNode;
	}

	public void add(CsharpNode e){
		primary_expression_part.add(e);
	}
	@Override
	public Object accept(CsharpVisitor v) {
		return v.visit_primary_expression(this);
	}
	
	public void creerArray(){
		primary_expression_part= new ArrayList<CsharpNode>();
	}

	public boolean isArrayNull(){
		return (primary_expression_part==null);
	}
	@Override
	public String toStringTree(int tab) {
		String res = nbTab(tab)+ "primary_expression:\n" 
				+(primary_expression_start != null ? primary_expression_start.toStringTree(tab + 1) : "");
		if(primary_expression_part!=null){
			for (CsharpNode c : primary_expression_part){
			if (c != null) 
				res += c.toStringTree(tab+1);
			else 
				System.out.println("NULL\n");
		}
		}
		return res;
	}

	public CsharpNode getPrimary_expression_start() {
		return primary_expression_start;
	}

	public ArrayList<CsharpNode> getPrimary_expression_part() {
		return primary_expression_part;
	}

	
}
