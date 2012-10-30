package gool.ast.list;

import gool.ast.constructs.Expression;
import gool.ast.constructs.ListMethCall;
import gool.ast.printer.GoolGeneratorController;
import gool.ast.type.TypeVoid;

public class ListSizeCall extends ListMethCall {

	public ListSizeCall(Expression target) {
		super(TypeVoid.INSTANCE, target);
	}
	
	@Override
	public String toString() {
		return GoolGeneratorController.generator().getCode(this);		
	}

}
