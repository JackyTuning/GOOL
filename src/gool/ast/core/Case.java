/*
 * Copyright 2010 Pablo Arrighi, Alex Concha, Miguel Lezama for version 1.
 * Copyright 2013 Pablo Arrighi, Miguel Lezama, Kevin Mazet for version 2.    
 *
 * This file is part of GOOL.
 *
 * GOOL is free software: you can redistribute it and/or modify it under the terms of the GNU
 * General Public License as published by the Free Software Foundation, version 3.
 *
 * GOOL is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without
 * even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 * See the GNU General Public License version 3 for more details.
 *
 * You should have received a copy of the GNU General Public License along with GOOL,
 * in the file COPYING.txt.  If not, see <http://www.gnu.org/licenses/>.
 */

package gool.ast.core;

import java.util.ArrayList;
import java.util.List;

import gool.generator.GoolGeneratorController;

/**
 * This captures the if statements of the intermediate language. Hence it is an
 * OOTStatement. Notice the type checking achieved through generics.
 */
public class Case extends Statement {

	/**
	 * The condition expression.
	 */
	private Expression expression;
	
	/**
	 * The statement that is evaluated when the condition is true.
	 */
	private List<Statement> statements = new ArrayList<Statement>();


	/**
	 * @param condition
	 * @param statements
	 */
	public Case(Expression expression, List<Statement> statement) {
		this.expression = expression;
		this.statements = statement;
	}

	public Expression getCondition() {
		return expression;
	}
	
	public List<Statement> getStatements() {
		return statements;
	}

	@Override
	public String callGetCode() {
		return GoolGeneratorController.generator().getCode(this);
	}

}
