package gool.ast.gool;

import gool.ast.Dependency;
import gool.ast.printer.GoolGeneratorController;

public class SystemOutDependency extends Dependency {

	@Override
	public String toString() {
		return GoolGeneratorController.generator().getCode(this);
	}
}
