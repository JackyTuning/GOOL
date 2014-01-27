package gool.parser.csharp;

import gool.parser.csharp.ast.*;

public interface CsharpVisitor {

	public Object visit_class_declaration(class_declaration class_declaration);

	public Object visit_class_member_declaration_type(
			class_member_declaration_type class_member_declaration_type);

	public Object visit_class_member_declaration(
			class_member_declaration class_member_declaration);

	public Object visit_class_member_declarations(
			class_member_declarations class_member_declarations);

	public Object visit_compilation_unit(compilation_unit compilation_unit);

	public Object visit_namespace_body(namespace_body namespace_body);

	public Object visit_namespace_member_declaration(
			namespace_member_declaration namespace_member_declaration);

	public Object visit_namespace_member_declarations(
			namespace_member_declarations namespace_member_declarations);

	public Object visit_type_declaration(type_declaration type_declaration);

	public Object visit_UnknwnNode(UnknownNode unknowNode);

	public Object visit_method_declaration(method_declaration method_declaration);

	public Object visit_method_header(method_header method_header);

	public Object visit_statement_list(statement_list statement_list);

	public Object visit_local_variable_declaration(
			local_variable_declaration local_variable_declaration);

	public Object visit_type(type type);

	public Object visit_local_variable_declarators(
			local_variable_declarators local_variable_declarators);

	public Object visit_variable_declarator(
			local_variable_declarator local_variable_declarator);

	public Object visit_identifier(identifier identifier);

	public Object visit_qid(qid qid);

	public Object visit_formal_parameter_list(
			formal_parameter_list formal_parameter_list);

	public Object visit_formal_parameter(formal_parameter formal_parameter);

	public Object visit_if_statement(if_statement if_statement);

	public Object visit_while_statement(while_statement while_statement);

	public Object visit_do_statement(do_statement do_statement);

	public Object visit_for_statement(for_statement for_statement);

	public Object visit_statement_expression_list(
			statement_expression_list statement_expression_list);

	public Object visit_foreach_statement(foreach_statement foreach_statement);

	public Object visit_return_statement(return_statement return_statement);

	public Object visit_assignment(assignment assignment);

	public Object visit_operator(operator operator);

	public Object visit_assignment_operator(
			assignment_operator assignment_operator);

	public Object visit_expression(na_expression expression);

	public Object visit_conditional_expression(
			conditional_expression conditional_expression);

	public Object visit_unary_expression(unary_expression unary_expression);

	public Object visit_local_constant_declaration(
			local_constant_declaration local_constant_declaration);

	public Object visit_modifier(modifier modifier);

	public Object visit_type_or_generic(type_or_generic type_or_generic);

	public Object visit_variable_declarators(
			variable_declarators variable_declarators);

	public Object visit_variable_declarator(
			variable_declarator variable_declarator);

	public Object visit_modifiers(modifiers modifiers);

	public Object visit_constant_declarators(
			constant_declarators constant_declarators);

	public Object visit_constant_declarator(
			constant_declarator constant_declarator);
	
	

}
