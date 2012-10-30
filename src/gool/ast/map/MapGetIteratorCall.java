package gool.ast.map;

import gool.ast.Expression;
import gool.ast.MapMethCall;
import gool.ast.printer.GoolGeneratorController;
import gool.ast.type.TypeVoid;

public class MapGetIteratorCall extends MapMethCall {

	public MapGetIteratorCall(Expression target) {
		super(TypeVoid.INSTANCE, target);
	}
	
	@Override
	public String toString() {
		return GoolGeneratorController.generator().getCode(this);		
	}

}
