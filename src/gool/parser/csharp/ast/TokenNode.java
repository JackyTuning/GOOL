package gool.parser.csharp.ast;

import org.antlr.runtime.Token;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeAdaptor;
import org.antlr.runtime.tree.TreeAdaptor;

import gool.parser.csharp.CsharpVisitor;

public class TokenNode extends CsharpNode {

	private String code;
	private CommonTree tree;

	public TokenNode(Token e) {
		TreeAdaptor adaptor = new CommonTreeAdaptor();
		tree =  (CommonTree) (CommonTree)adaptor.create(e);
		code = tree.toStringTree();		
	}

	@Override
	public Object accept(CsharpVisitor v) {
		// TODO Auto-generated method stub
		return v.visit_TokenNode(this);
	}

	@Override
	public String toStringTree(int tab) {
		return nbTab(tab) + "TokenNode\n" 
				+ nbTab(tab+1) +  code +"\n";				
	}

}
