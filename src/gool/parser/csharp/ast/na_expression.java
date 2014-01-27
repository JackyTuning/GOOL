package gool.parser.csharp.ast;

import gool.parser.csharp.CsharpVisitor;

public class na_expression extends expression{

	 expression filsGauche;
	 operator operator;
	 expression filsDroit;
	
	public na_expression(expression filsGauche, operator operator, expression filsDroit) {
		super();
		this.filsGauche = filsGauche;
		this.operator = operator;
		this.filsDroit = filsDroit;

	}
	
	@Override
	public Object accept(CsharpVisitor v) {
		// TODO Auto-generated method stub
		return v.visit_expression(this);
	}

	@Override
	public String toStringTree(int tab) {
		// TODO Auto-generated method stub
		return nbTab(tab) + "expression:\n"
		 		+ (filsGauche != null ? filsGauche.toStringTree(tab + 1) : "")
		 		+ (operator != null ? operator.toStringTree(tab + 1) : "")
		 		+ (filsDroit != null ? filsDroit.toStringTree(tab + 1) : "")
		 		;
	}

	public expression getFilsGauche() {
		return filsGauche;
	}

	public operator getOperator() {
		return operator;
	}

	public expression getFilsDroit() {
		return filsDroit;
	}
	

}
