package gool.parser.csharp.ast;

import java.util.ArrayList;
import java.util.List;

import gool.parser.csharp.CsharpVisitor;

public class formal_parameter_list extends CsharpNode {

	List<formal_parameter> formal_parameters;
	
	public formal_parameter_list() {
		this.formal_parameters = new ArrayList<formal_parameter>();
	}

	@Override
	public Object accept(CsharpVisitor v) {
		// TODO Auto-generated method stub
		return v.visit_formal_parameter_list(this);
	}

	public void add(formal_parameter e) {
		formal_parameters.add(e);
	}

	@Override
	public String toStringTree(int tab) {
		String res = nbTab(tab) + "formal_parameter_list:\n";
		for (CsharpNode c : formal_parameters) {
			res += c.toStringTree(tab+1);
		}
		return res;
	}

	public List<formal_parameter> getFormal_parameters() {
		return formal_parameters;
	}

	
}
