package gool.recognizer.csharp;

import gool.parser.csharp.CsharpVisitor;
import gool.parser.csharp.ast.*;
import gool.ast.core.*;
import gool.ast.type.*;




public class CsharpRecognizer implements CsharpVisitor {

	@Override
	public Object visit_class_body(class_body class_body) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visit_class_declaration(class_declaration class_declaration) {
		// TODO Auto-generated method stub
		return null;
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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visit_namespace_body(namespace_body namespace_body) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visit_namespace_member_declaration(
			namespace_member_declaration namespace_member_declaration) {
		
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visit_namespace_member_declarations(
			namespace_member_declarations namespace_member_declarations) {
		for(CsharpNode node:namespace_member_declarations.namespace_member_declarations)
		{

		}
		return null;
	}

	@Override
	public Object visit_TokenNode(TokenNode tokenNode) {
		return tokenNode.toString();
	}

	@Override
	public Object visit_type_declaration(type_declaration type_declaration) {
		return type_declaration.accept(this);
	}

	@Override
	public Object visit_UnknowNode(UnknowNode unknowNode) {
		return new TypeUnknown(unknowNode.toString());
	}


}