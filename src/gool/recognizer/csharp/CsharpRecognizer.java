package gool.recognizer.csharp;

import gool.ast.core.Expression;
import gool.ast.core.ExpressionUnknown;
import gool.ast.core.For;
import gool.ast.core.Statement;
import gool.ast.type.TypeNone;
import gool.parser.csharp2.CsharpVisitor;
import gool.parser.csharp2.csParser.*;


public class CsharpRecognizer extends CsharpVisitor {


	
	@Override
	public Object visitcompilation_unit_return(compilation_unit_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitnamespace_declaration_return(
			namespace_declaration_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitnamespace_block_return(namespace_block_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitnamespace_body_return(namespace_body_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitextern_alias_directives_return(
			extern_alias_directives_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitextern_alias_directive_return(
			extern_alias_directive_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitusing_directives_return(using_directives_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitusing_directive_return(using_directive_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitusing_alias_directive_return(
			using_alias_directive_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitusing_namespace_directive_return(
			using_namespace_directive_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitnamespace_member_declarations_return(
			namespace_member_declarations_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitnamespace_member_declaration_return(
			namespace_member_declaration_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visittype_declaration_return(type_declaration_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitqualified_identifier_return(qualified_identifier_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitnamespace_name_return(namespace_name_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitmodifiers_return(modifiers_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitmodifier_return(modifier_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitclass_member_declaration_return(
			class_member_declaration_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitprimary_expression_return(primary_expression_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitprimary_expression_start_return(
			primary_expression_start_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitprimary_expression_part_return(
			primary_expression_part_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitaccess_identifier_return(access_identifier_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitaccess_operator_return(access_operator_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitbrackets_or_arguments_return(
			brackets_or_arguments_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitbrackets_return(brackets_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitparen_expression_return(paren_expression_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitarguments_return(arguments_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitargument_list_return(argument_list_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitargument_return(argument_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitargument_name_return(argument_name_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitargument_value_return(argument_value_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitref_variable_reference_return(
			ref_variable_reference_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitvariable_reference_return(variable_reference_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitrank_specifiers_return(rank_specifiers_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitrank_specifier_return(rank_specifier_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitdim_separators_return(dim_separators_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitdelegate_creation_expression_return(
			delegate_creation_expression_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitanonymous_object_creation_expression_return(
			anonymous_object_creation_expression_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitanonymous_object_initializer_return(
			anonymous_object_initializer_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitmember_declarator_list_return(
			member_declarator_list_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitmember_declarator_return(member_declarator_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitprimary_or_array_creation_expression_return(
			primary_or_array_creation_expression_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitarray_creation_expression_return(
			array_creation_expression_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitarray_initializer_return(array_initializer_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitvariable_initializer_list_return(
			variable_initializer_list_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitvariable_initializer_return(variable_initializer_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitsizeof_expression_return(sizeof_expression_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitchecked_expression_return(checked_expression_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitunchecked_expression_return(unchecked_expression_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitdefault_value_expression_return(
			default_value_expression_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitanonymous_method_expression_return(
			anonymous_method_expression_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitexplicit_anonymous_function_signature_return(
			explicit_anonymous_function_signature_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitexplicit_anonymous_function_parameter_list_return(
			explicit_anonymous_function_parameter_list_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitexplicit_anonymous_function_parameter_return(
			explicit_anonymous_function_parameter_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitanonymous_function_parameter_modifier_return(
			anonymous_function_parameter_modifier_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitobject_creation_expression_return(
			object_creation_expression_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitobject_or_collection_initializer_return(
			object_or_collection_initializer_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitcollection_initializer_return(
			collection_initializer_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitelement_initializer_list_return(
			element_initializer_list_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitelement_initializer_return(element_initializer_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitobject_initializer_return(object_initializer_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitmember_initializer_list_return(
			member_initializer_list_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitmember_initializer_return(member_initializer_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitinitializer_value_return(initializer_value_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visittypeof_expression_return(typeof_expression_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitunbound_type_name_return(unbound_type_name_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitunbound_type_name_start_return(
			unbound_type_name_start_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitunbound_type_name_part_return(
			unbound_type_name_part_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitgeneric_dimension_specifier_return(
			generic_dimension_specifier_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitcommas_return(commas_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visittype_name_return(type_name_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitnamespace_or_type_name_return(
			namespace_or_type_name_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visittype_or_generic_return(type_or_generic_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitqid_return(qid_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitqid_start_return(qid_start_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitqid_part_return(qid_part_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitgeneric_argument_list_return(
			generic_argument_list_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visittype_arguments_return(type_arguments_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visittype_return(type_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitnon_nullable_type_return(non_nullable_type_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitnon_array_type_return(non_array_type_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitarray_type_return(array_type_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitunmanaged_type_return(unmanaged_type_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitclass_type_return(class_type_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitpointer_type_return(pointer_type_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitblock_return(block_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitstatement_list_return(statement_list_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitexpression_return(expression_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitexpression_list_return(expression_list_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitassignment_return(assignment_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitunary_expression_return(unary_expression_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitcast_expression_return(cast_expression_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitassignment_operator_return(assignment_operator_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitpre_increment_expression_return(
			pre_increment_expression_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitpre_decrement_expression_return(
			pre_decrement_expression_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitpointer_indirection_expression_return(
			pointer_indirection_expression_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitaddressof_expression_return(addressof_expression_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitnon_assignment_expression_return(
			non_assignment_expression_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitmultiplicative_expression_return(
			multiplicative_expression_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitadditive_expression_return(additive_expression_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitshift_expression_return(shift_expression_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitrelational_expression_return(
			relational_expression_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitequality_expression_return(equality_expression_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitand_expression_return(and_expression_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitexclusive_or_expression_return(
			exclusive_or_expression_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitinclusive_or_expression_return(
			inclusive_or_expression_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitconditional_and_expression_return(
			conditional_and_expression_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitconditional_or_expression_return(
			conditional_or_expression_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitnull_coalescing_expression_return(
			null_coalescing_expression_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitconditional_expression_return(
			conditional_expression_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitlambda_expression_return(lambda_expression_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitanonymous_function_signature_return(
			anonymous_function_signature_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitimplicit_anonymous_function_parameter_list_return(
			implicit_anonymous_function_parameter_list_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitimplicit_anonymous_function_parameter_return(
			implicit_anonymous_function_parameter_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitanonymous_function_body_return(
			anonymous_function_body_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitquery_expression_return(query_expression_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitquery_body_return(query_body_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitquery_continuation_return(query_continuation_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitquery_body_clauses_return(query_body_clauses_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitquery_body_clause_return(query_body_clause_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitfrom_clause_return(from_clause_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitjoin_clause_return(join_clause_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitlet_clause_return(let_clause_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitorderby_clause_return(orderby_clause_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitordering_list_return(ordering_list_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitordering_return(ordering_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitordering_direction_return(ordering_direction_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitselect_or_group_clause_return(
			select_or_group_clause_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitselect_clause_return(select_clause_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitgroup_clause_return(group_clause_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitwhere_clause_return(where_clause_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitboolean_expression_return(boolean_expression_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitglobal_attributes_return(global_attributes_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitglobal_attribute_return(global_attribute_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitglobal_attribute_target_specifier_return(
			global_attribute_target_specifier_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitglobal_attribute_target_return(
			global_attribute_target_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitattributes_return(attributes_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitattribute_sections_return(attribute_sections_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitattribute_section_return(attribute_section_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitattribute_target_specifier_return(
			attribute_target_specifier_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitattribute_target_return(attribute_target_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitattribute_list_return(attribute_list_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitattribute_return(attribute_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitattribute_arguments_return(attribute_arguments_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitpositional_argument_list_return(
			positional_argument_list_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitpositional_argument_return(positional_argument_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitnamed_argument_list_return(named_argument_list_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitnamed_argument_return(named_argument_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitattribute_argument_expression_return(
			attribute_argument_expression_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitclass_declaration_return(class_declaration_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitclass_base_return(class_base_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitinterface_type_list_return(interface_type_list_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitclass_body_return(class_body_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitclass_member_declarations_return(
			class_member_declarations_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitconstant_declaration_return(constant_declaration_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitconstant_declarators_return(constant_declarators_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitconstant_declarator_return(constant_declarator_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitconstant_expression_return(constant_expression_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitfield_declaration_return(field_declaration_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitvariable_declarators_return(variable_declarators_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitvariable_declarator_return(variable_declarator_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitmethod_declaration_return(method_declaration_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitmethod_header_return(method_header_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitmethod_body_return(method_body_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitmember_name_return(member_name_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitproperty_declaration_return(property_declaration_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitaccessor_declarations_return(
			accessor_declarations_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitget_accessor_declaration_return(
			get_accessor_declaration_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitset_accessor_declaration_return(
			set_accessor_declaration_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitaccessor_modifier_return(accessor_modifier_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitaccessor_body_return(accessor_body_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitevent_declaration_return(event_declaration_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitevent_modifiers_return(event_modifiers_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitevent_accessor_declarations_return(
			event_accessor_declarations_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitadd_accessor_declaration_return(
			add_accessor_declaration_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitremove_accessor_declaration_return(
			remove_accessor_declaration_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitenum_declaration_return(enum_declaration_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitenum_base_return(enum_base_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitenum_body_return(enum_body_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitenum_member_declarations_return(
			enum_member_declarations_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitenum_member_declaration_return(
			enum_member_declaration_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitintegral_type_return(integral_type_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitdelegate_declaration_return(delegate_declaration_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitdelegate_modifiers_return(delegate_modifiers_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitvariant_generic_parameter_list_return(
			variant_generic_parameter_list_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitvariant_type_parameters_return(
			variant_type_parameters_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitvariant_type_variable_name_return(
			variant_type_variable_name_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitvariance_annotation_return(variance_annotation_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visittype_parameter_constraints_clauses_return(
			type_parameter_constraints_clauses_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visittype_parameter_constraints_clause_return(
			type_parameter_constraints_clause_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visittype_parameter_constraint_list_return(
			type_parameter_constraint_list_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitsecondary_constraint_list_return(
			secondary_constraint_list_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitsecondary_constraint_return(secondary_constraint_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visittype_variable_name_return(type_variable_name_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitconstructor_constraint_return(
			constructor_constraint_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitreturn_type_return(return_type_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitformal_parameter_list_return(
			formal_parameter_list_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitformal_parameter_return(formal_parameter_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitfixed_parameters_return(fixed_parameters_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitfixed_parameter_return(fixed_parameter_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitdefault_argument_return(default_argument_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitparameter_modifier_return(parameter_modifier_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitparameter_array_return(parameter_array_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitinterface_declaration_return(
			interface_declaration_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitinterface_modifiers_return(interface_modifiers_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitinterface_base_return(interface_base_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitinterface_body_return(interface_body_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitinterface_member_declarations_return(
			interface_member_declarations_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitinterface_member_declaration_return(
			interface_member_declaration_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitinterface_property_declaration_return(
			interface_property_declaration_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitinterface_method_declaration_return(
			interface_method_declaration_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitinterface_event_declaration_return(
			interface_event_declaration_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitinterface_indexer_declaration_return(
			interface_indexer_declaration_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitinterface_accessor_declarations_return(
			interface_accessor_declarations_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitinterface_get_accessor_declaration_return(
			interface_get_accessor_declaration_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitinterface_set_accessor_declaration_return(
			interface_set_accessor_declaration_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitmethod_modifiers_return(method_modifiers_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitstruct_declaration_return(struct_declaration_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitstruct_modifiers_return(struct_modifiers_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitstruct_modifier_return(struct_modifier_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitstruct_interfaces_return(struct_interfaces_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitstruct_body_return(struct_body_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitstruct_member_declarations_return(
			struct_member_declarations_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitstruct_member_declaration_return(
			struct_member_declaration_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitindexer_declaration_return(indexer_declaration_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitindexer_declarator_return(indexer_declarator_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitoperator_declaration_return(operator_declaration_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitoperator_declarator_return(operator_declarator_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitunary_operator_declarator_return(
			unary_operator_declarator_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitoverloadable_unary_operator_return(
			overloadable_unary_operator_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitbinary_operator_declarator_return(
			binary_operator_declarator_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitoverloadable_binary_operator_return(
			overloadable_binary_operator_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitconversion_operator_declaration_return(
			conversion_operator_declaration_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitconversion_operator_declarator_return(
			conversion_operator_declarator_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitoperator_body_return(operator_body_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitconstructor_declaration_return(
			constructor_declaration_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitconstructor_declarator_return(
			constructor_declarator_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitconstructor_initializer_return(
			constructor_initializer_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitconstructor_body_return(constructor_body_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitdestructor_declaration_return(
			destructor_declaration_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitdestructor_body_return(destructor_body_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitinvocation_expression_return(
			invocation_expression_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitinvocation_start_return(invocation_start_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitinvocation_part_return(invocation_part_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitstatement_return(statement_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitembedded_statement_return(embedded_statement_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitfixed_statement_return(fixed_statement_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitfixed_pointer_declarators_return(
			fixed_pointer_declarators_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitfixed_pointer_declarator_return(
			fixed_pointer_declarator_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitfixed_pointer_initializer_return(
			fixed_pointer_initializer_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitunsafe_statement_return(unsafe_statement_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitlabeled_statement_return(labeled_statement_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitdeclaration_statement_return(
			declaration_statement_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitlocal_variable_declaration_return(
			local_variable_declaration_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitlocal_variable_type_return(local_variable_type_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitlocal_variable_declarators_return(
			local_variable_declarators_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitlocal_variable_declarator_return(
			local_variable_declarator_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitlocal_variable_initializer_return(
			local_variable_initializer_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitstackalloc_initializer_return(
			stackalloc_initializer_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitlocal_constant_declaration_return(
			local_constant_declaration_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitexpression_statement_return(expression_statement_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitstatement_expression_return(statement_expression_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitselection_statement_return(selection_statement_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitif_statement_return(if_statement_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitelse_statement_return(else_statement_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitswitch_statement_return(switch_statement_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitswitch_block_return(switch_block_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitswitch_sections_return(switch_sections_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitswitch_section_return(switch_section_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitswitch_labels_return(switch_labels_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitswitch_label_return(switch_label_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visititeration_statement_return(iteration_statement_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitwhile_statement_return(while_statement_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitdo_statement_return(do_statement_return e) {
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitfor_statement_return(for_statement_return e) {
		if (e.for_initializer991 == null || e.for_condition993 == null || e.for_iterator995 == null) {
			return new ExpressionUnknown(TypeNone.INSTANCE,e.toString());
		}

		Statement initializer = (Statement) e.for_initializer991.accept(this);
		Expression condition = (Expression) e.for_initializer991.accept(this);
		Statement updater = (Statement) e.for_initializer991.accept(this);
		Statement statements = (Statement) e.embedded_statement997.accept(this);
		return new For(initializer, condition, updater, statements );
	}

	@Override
	public Object visitfor_initializer_return(for_initializer_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitfor_condition_return(for_condition_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitfor_iterator_return(for_iterator_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitstatement_expression_list_return(
			statement_expression_list_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitforeach_statement_return(foreach_statement_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitjump_statement_return(jump_statement_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitbreak_statement_return(break_statement_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitcontinue_statement_return(continue_statement_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitgoto_statement_return(goto_statement_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitreturn_statement_return(return_statement_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitthrow_statement_return(throw_statement_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visittry_statement_return(try_statement_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitcatch_clauses_return(catch_clauses_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitspecific_catch_clauses_return(
			specific_catch_clauses_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitspecific_catch_clause_return(
			specific_catch_clause_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitgeneral_catch_clause_return(general_catch_clause_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitfinally_clause_return(finally_clause_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitchecked_statement_return(checked_statement_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitunchecked_statement_return(unchecked_statement_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitlock_statement_return(lock_statement_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitusing_statement_return(using_statement_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitresource_acquisition_return(resource_acquisition_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visityield_statement_return(yield_statement_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitpredefined_type_return(predefined_type_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitidentifier_return(identifier_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitkeyword_return(keyword_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitalso_keyword_return(also_keyword_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitliteral_return(literal_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitassignment_list_return(assignment_list_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitfield_declarations_return(field_declarations_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitproperty_declaration_list_return(
			property_declaration_list_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitconstant_declarations_return(
			constant_declarations_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitliterals_return(literals_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitdelegate_declaration_list_return(
			delegate_declaration_list_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitlocal_variable_declaration_list_return(
			local_variable_declaration_list_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitlocal_variable_initializer_list_return(
			local_variable_initializer_list_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitexpression_list_test_return(expression_list_test_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitunary_expression_list_return(
			unary_expression_list_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitinvocation_expression_list_return(
			invocation_expression_list_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitprimary_expression_list_return(
			primary_expression_list_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitnon_assignment_expression_list_return(
			non_assignment_expression_list_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

	@Override
	public Object visitmethod_declarations_return(method_declarations_return e) {
		
		return new ExpressionUnknown(TypeNone.INSTANCE, e.toString());
	}

}
