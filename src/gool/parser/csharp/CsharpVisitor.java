package gool.parser.csharp;

import gool.parser.csharp.ast.*;

public interface CsharpVisitor {

	public Object visit_class_body(class_body class_body);

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

	public Object visit_TokenNode(TokenNode tokenNode);

	public Object visit_type_declaration(type_declaration type_declaration);

	public Object visit_UnknowNode(UnknowNode unknowNode);

	public Object visit_method_declaration(method_declaration method_declaration);

	public Object visit_method_header(method_header method_header);

	public Object visit_statement_list(statement_list statement_list);

}
