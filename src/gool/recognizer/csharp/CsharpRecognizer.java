package gool.recognizer.csharp;

import gool.ast.core.*;
import gool.ast.type.TypeUnknown;
import gool.generator.common.Platform;
import gool.parser.csharp.CsharpVisitor;
import gool.parser.csharp.csLexer;
import gool.parser.csharp.csParser;
import gool.parser.csharp.ast.*;
import gool.parser.csharp.csParser.compilation_unit_return;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;


public class CsharpRecognizer implements CsharpVisitor {
	
	public static Collection<ClassDef> parseGool(Platform defaultPlatform,
			Collection<? extends File> inputFiles) throws Exception {
		Collection<ClassDef> result = new ArrayList<ClassDef>();
		Iterator<? extends File> it = inputFiles.iterator();
		while (it.hasNext()) {
			File courant = it.next();
			CharStream cs = new ANTLRFileStream(courant.toString());
			csLexer lexer = new csLexer(cs);
			CommonTokenStream token = new CommonTokenStream(lexer);
			csParser parser = new csParser(token);
			compilation_unit_return r = parser.compilation_unit();
			compilation_unit cu = r.t;
			CsharpRecognizer v = new CsharpRecognizer();
			List<ClassDef> classes = (List<ClassDef>) v.visit_compilation_unit(cu);
			for (ClassDef classe : classes) {
				classe.setPlatform(defaultPlatform);
				result.add(classe);				
			}
		}
		return result;
	}
	
	/**
	 * The map between CSharp operators and GOOL operators. Left are the CSharp
	 * operators. Right are the GOOL operators.
	 */
	static final private Map<String, Operator> operatorMap = new HashMap<String, Operator>();
	static {
		operatorMap.put("+", Operator.PLUS);
		operatorMap.put("-", Operator.MINUS);
		operatorMap.put("*", Operator.MULT);
		operatorMap.put("/", Operator.DIV);
		operatorMap.put("&&", Operator.AND);
		operatorMap.put("||", Operator.OR);
		operatorMap.put("==", Operator.EQUAL);
		operatorMap.put("!=", Operator.NOT_EQUAL);
		operatorMap.put("<", Operator.LT);
		operatorMap.put("<=", Operator.LEQ);
		operatorMap.put(">", Operator.GT);
		operatorMap.put(">=", Operator.GEQ);
	}
	
	/**
	 * Converts CSharp operator to GOOL operators.
	 */
	private Operator getOperator(String operator) {
		Operator result = operatorMap.get(operator);
		if (result == null) {
			result = Operator.UNKNOWN;
		}
		return result;
	}
	
	/**
	 * The map between CSharp modifiers and GOOL modifiers. Left are the CSharp
	 * modifiers. Right are the GOOL modifiers.
	 * TODO modifier � ajouter : 'new' | 'internal' | 'unsafe' | 'readonly' | 'extern' ;
	 */
	static final private Map<String, Modifier> modifierMap = new HashMap<String, Modifier>();
	static {
		modifierMap.put("public", Modifier.PUBLIC);
		modifierMap.put("protected", Modifier.PROTECTED);
		modifierMap.put("private", Modifier.PRIVATE);
		modifierMap.put("abstract", Modifier.ABSTRACT);
		modifierMap.put("sealed", Modifier.FINAL);
		modifierMap.put("static", Modifier.STATIC);
		modifierMap.put("volatile", Modifier.VOLATILE);
		modifierMap.put("virtual", Modifier.VIRTUAL);
		modifierMap.put("override", Modifier.OVERRIDE);
	}
	
	/**
	 * Converts CSharp modifier to GOOL modifier.
	 */
	private Modifier getModifier(String modifier) {
		return modifierMap.get(modifier);
	}
	
	
	@Override
	public Object visit_class_declaration(class_declaration c) {
		String name = (String) c.getType_or_generic().accept(this);
		ClassDef classe = new ClassDef(name);
		return classe;
	}

	@Override
	public Object visit_class_member_declaration_type(
			class_member_declaration_type class_member_declaration_type) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visit_class_member_declaration(
			class_member_declaration class_member_declaration) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visit_class_member_declarations(
			class_member_declarations class_member_declarations) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visit_compilation_unit(compilation_unit compilation_unit) {
		return compilation_unit.getNamespace_body().accept(this);
	}

	@Override
	public Object visit_namespace_body(namespace_body namespace_body) {
		return namespace_body.getNamespace_member_declarations().accept(this);
	}

	@Override
	public Object visit_namespace_member_declaration(
			namespace_member_declaration namespace_member_declaration) {
		ClassDef classe = (ClassDef) namespace_member_declaration.getType_declaration().accept(this);
		Collection<Modifier> modifiers =  (Collection<Modifier>) namespace_member_declaration.getModifiers();
		classe.setModifiers(modifiers);
		// TODO Auto-generated method stub
		return classe;
	}

	@Override
	public Object visit_namespace_member_declarations(
			namespace_member_declarations namespace_member_declarations) {
		List<ClassDef> classes = new ArrayList<ClassDef>();
		for (CsharpNode node : namespace_member_declarations.getNamespace_member_declarations()) {
			classes.add( ( ClassDef ) node.accept(this));
		}
		return classes;
	}

	
	@Override
	public Object visit_UnknwnNode(UnknownNode unknowNode) {
		return new TypeUnknown(unknowNode.toString());
	}


	@Override
	public Object visit_modifiers(modifiers m) {
		Collection<Modifier> modifiers = new HashSet<Modifier>();
		for(modifier modi : m.getModifiers()) {
			modifiers.add((Modifier) modi.accept(this));
		}
		return modifiers;
	}
	
	public Object visit_type_declaration(type_declaration type_declaration) {
		return type_declaration.accept(this);
	}

	@Override
	public Object visit_method_declaration(method_declaration method_declaration) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visit_method_header(method_header method_header) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visit_statement_list(statement_list statement_list) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visit_local_variable_declaration(
			local_variable_declaration local_variable_declaration) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visit_type(type type) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visit_local_variable_declarators(
			local_variable_declarators local_variable_declarators) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visit_variable_declarator(
			local_variable_declarator local_variable_declarator) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visit_identifier(identifier identifier) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visit_qid(qid qid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visit_formal_parameter_list(
			formal_parameter_list formal_parameter_list) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visit_formal_parameter(formal_parameter formal_parameter) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visit_if_statement(if_statement if_statement) {
		Expression condition = (Expression)if_statement.boolean_expression.accept(this);
		Statement thenStmt = (Statement) if_statement.embedded_statement.accept(this);
		Statement elseStmt = null;
		if(if_statement.else_statement!=null) {
			elseStmt = (Statement) if_statement.else_statement.accept(this);
		}

		return new If(condition, thenStmt, elseStmt);
	}

	@Override
	public Object visit_while_statement(while_statement while_statement) {
		return new While((Expression) while_statement.boolean_expression.accept(this),(Statement) while_statement.embedded_statement.accept(this));
	}

	@Override
	public Object visit_do_statement(do_statement do_statement) {
		// TODO Auto-generated method stub
		return new ExpressionUnknown(null, do_statement.toString());
	}

	@Override
	public Object visit_for_statement(for_statement for_statement) {
		Statement initializer = (Statement) for_statement.for_initializer.accept(this);
		Expression condition = (Expression) for_statement.for_condition.accept(this);
		Statement iterator = (Statement) for_statement.for_iterator.accept(this);
			
		return new For(initializer, condition, iterator, (Statement) for_statement.embedded_statement.accept(this));
	}

	@Override
	public Object visit_statement_expression_list(
			statement_expression_list statement_expression_list) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visit_foreach_statement(foreach_statement foreach_statement) {
		// TODO Auto-generated method stub
		return new ExpressionUnknown(null, foreach_statement.toString());
	}

	@Override
	public Object visit_return_statement(return_statement return_statement) {
		return new Return((Expression) return_statement.getExpression().accept(this));
	}

	@Override
	public Object visit_assignment(assignment assignment) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visit_operator(operator operator) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visit_assignment_operator(
			assignment_operator assignment_operator) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visit_expression(na_expression expression) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visit_conditional_expression(
			conditional_expression conditional_expression) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visit_unary_expression(unary_expression unary_expression) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visit_local_constant_declaration(
			local_constant_declaration local_constant_declaration) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visit_modifier(modifier modifier) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visit_type_or_generic(type_or_generic type_or_generic) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visit_variable_declarators(
			variable_declarators variable_declarators) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visit_variable_declarator(
			variable_declarator variable_declarator) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Object visit_constant_declarators(
			constant_declarators constant_declarators) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visit_constant_declarator(
			constant_declarator constant_declarator) {
		// TODO Auto-generated method stub
		return null;
	}

}