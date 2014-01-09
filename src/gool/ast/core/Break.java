package gool.ast.core;

import gool.generator.GoolGeneratorController;

/**
 * This captures the if statements of the intermediate language. Hence it is an
 * OOTStatement. Notice the type checking achieved through generics.
 */
public class Break extends Statement {

	private String label;


	public Break(String label) {
		this.label = label;
	}

	public String getLabel() {
		return label;
	}

	@Override
	public String callGetCode() {
		return GoolGeneratorController.generator().getCode(this);
	}

}
