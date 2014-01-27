package gool.recognizer.csharp;

import gool.ast.core.ClassDef;
import gool.ast.core.Modifier;
import gool.ast.type.TypeUnknown;
import gool.generator.common.Platform;
import gool.parser.csharp.CsharpVisitor;
import gool.parser.csharp.csLexer;
import gool.parser.csharp.csParser;
import gool.parser.csharp.ast.CsharpNode;
import gool.parser.csharp.ast.UnknownNode;
import gool.parser.csharp.ast.assignment;
import gool.parser.csharp.ast.assignment_operator;
import gool.parser.csharp.ast.class_declaration;
import gool.parser.csharp.ast.class_member_declaration;
import gool.parser.csharp.ast.class_member_declaration_type;
import gool.parser.csharp.ast.class_member_declarations;
import gool.parser.csharp.ast.compilation_unit;
import gool.parser.csharp.ast.conditional_expression;
import gool.parser.csharp.ast.constant_declarator;
import gool.parser.csharp.ast.constant_declarators;
import gool.parser.csharp.ast.do_statement;
import gool.parser.csharp.ast.for_statement;
import gool.parser.csharp.ast.foreach_statement;
import gool.parser.csharp.ast.formal_parameter;
import gool.parser.csharp.ast.formal_parameter_list;
import gool.parser.csharp.ast.identifier;
import gool.parser.csharp.ast.if_statement;
import gool.parser.csharp.ast.local_constant_declaration;
import gool.parser.csharp.ast.local_variable_declaration;
import gool.parser.csharp.ast.local_variable_declarator;
import gool.parser.csharp.ast.local_variable_declarators;
import gool.parser.csharp.ast.method_declaration;
import gool.parser.csharp.ast.method_header;
import gool.parser.csharp.ast.modifier;
import gool.parser.csharp.ast.modifiers;
import gool.parser.csharp.ast.na_expression;
import gool.parser.csharp.ast.namespace_body;
import gool.parser.csharp.ast.namespace_member_declaration;
import gool.parser.csharp.ast.namespace_member_declarations;
import gool.parser.csharp.ast.operator;
import gool.parser.csharp.ast.qid;
import gool.parser.csharp.ast.return_statement;
import gool.parser.csharp.ast.statement_expression_list;
import gool.parser.csharp.ast.statement_list;
import gool.parser.csharp.ast.type;
import gool.parser.csharp.ast.type_declaration;
import gool.parser.csharp.ast.type_or_generic;
import gool.parser.csharp.ast.unary_expression;
import gool.parser.csharp.ast.variable_declarator;
import gool.parser.csharp.ast.variable_declarators;
import gool.parser.csharp.ast.while_statement;
import gool.parser.csharp.csParser.compilation_unit_return;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

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
	public Object visit_type_declaration(type_declaration type_declaration) {
		return type_declaration.accept(this);
	}

	@Override
	public Object visit_UnknwnNode(UnknownNode unknowNode) {
		return new TypeUnknown(unknowNode.toString());
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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visit_while_statement(while_statement while_statement) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visit_do_statement(do_statement do_statement) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visit_for_statement(for_statement for_statement) {
		// TODO Auto-generated method stub
		return null;
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
		return null;
	}

	@Override
	public Object visit_return_statement(return_statement return_statement) {
		// TODO Auto-generated method stub
		return null;
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
	public Object visit_modifiers(modifiers m) {
		Collection<Modifier> modifiers = new HashSet<Modifier>();
		for(modifier modi : m.getModifiers()) {
			modifiers.add((Modifier) modi.accept(this));
		}
		return modifiers;
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