package gool.ast.file;

import gool.ast.constructs.FileMethCall;
import gool.ast.constructs.Expression;
import gool.ast.type.TypeVoid;
import gool.generator.GoolGeneratorController;

public class FileIsDirectoryCall extends FileMethCall {

	public FileIsDirectoryCall (Expression target) {
		super(TypeVoid.INSTANCE, target);
	}
	
	@Override
	public String callGetCode() {
		return GoolGeneratorController.generator().getCode(this);		
	}

}