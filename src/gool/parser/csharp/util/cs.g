grammar cs;


options {
    language = Java;
    memoize=true;
    output=AST;
    ASTLabelType=CommonTree;
}

@header {
  package gool.parser.csharp;
  
  import gool.parser.csharp.ast.*;

}

@lexer::header {
  package gool.parser.csharp;
}



compilation_unit returns [compilation_unit t]:
        a=namespace_body[true] {$t = new compilation_unit($a.t);};

namespace_declaration returns [UnknownNode t]
	@after {$t=new UnknownNode($tree);}:
	'namespace'   qualified_identifier   namespace_block   ';'? ;
namespace_block:
	'{'   namespace_body[false]   '}' ;
namespace_body[boolean bGlobal] returns [namespace_body t]:
        a=extern_alias_directives?   b=using_directives?   c=global_attributes?   d=namespace_member_declarations? 
        {$t=new namespace_body($a.t,$b.t,$c.t, $d.t);} ;
extern_alias_directives returns [UnknownNode t]:
        extern_alias_directive+ {$t=new UnknownNode($tree);};
extern_alias_directive:
        'extern'   'alias'   identifier  ';' ;
using_directives returns [UnknownNode t]:
        using_directive+ {$t=new UnknownNode($tree);};

using_directive:
	(using_alias_directive
	| using_namespace_directive) ;
using_alias_directive:
	'using'	  identifier   '='   namespace_or_type_name   ';' ;
using_namespace_directive:
	'using'   namespace_name   ';' ;

namespace_member_declarations returns [namespace_member_declarations t] 
	@init {$t=new namespace_member_declarations();} :
        (a=namespace_member_declaration  {((namespace_member_declarations)$t).add($a.t);})+ ;
        
namespace_member_declaration returns [CsharpNode t]:
        d=namespace_declaration {$t=$d.t;}
        | a=attributes?   b=modifiers?   c=type_declaration {$t=new namespace_member_declaration($a.t,$b.t, $c.t);} ;
        
type_declaration returns [CsharpNode t]
	@init {CsharpNode res = null;}
	@after {if (res != null) $t=res; else $t=new UnknownNode($tree);}: 
 
        (('partial') => 'partial'   (class_declaration
                                                                | struct_declaration
                                                                | interface_declaration))
        | a=class_declaration {res = $a.t;}
        | struct_declaration
        | interface_declaration
        | enum_declaration
        | delegate_declaration;
 
// Identifiers
qualified_identifier:
	identifier ('.' identifier)* ;
namespace_name
	: namespace_or_type_name ;

modifiers  returns [modifiers t]
   	@init {modifiers res=new modifiers();}
	@after {$t = res;}:
        (a=modifier {res.add($a.t);})+  ;
modifier returns [modifier t]
	@after {$t=new modifier($tree);}:
	'new' | 'public' | 'protected' | 'private' | 'internal' | 'unsafe' | 'abstract' | 'sealed' | 'static'
	| 'readonly' | 'volatile' | 'extern' | 'virtual' | 'override';
	

class_member_declaration returns [CsharpNode t]
	@init {CsharpNode res = null;}
	@after {if (res != null) $t=res; else $t=new UnknownNode($tree);}: 
        b=attributes?
        c=modifiers?
        ( 'const'   type   constant_declarators   ';' 
        | 'partial' (method_declaration 
                           | interface_declaration 
                           | class_declaration 
                           | struct_declaration) 
        | e='void'  aa=method_declaration {res=new class_member_declaration_type($b.t,$c.t,new type($e.tree),$aa.t);}
        | d=type ( (member_name   '(') => aa=method_declaration {res=new class_member_declaration_type($b.t,$c.t,$d.t,$aa.t);}
                   | (member_name   '{') => property_declaration
                   | (member_name   '.'   'this') => type_name '.' indexer_declaration
               | indexer_declaration        //this
               | ab=field_declaration  {res=new class_member_declaration_type($b.t,$c.t,new type($e.tree),$ab.t);}     // qid
               | operator_declaration
               ) 
               
//        common_modifiers// (method_modifiers | field_modifiers)
        
        | a=class_declaration     {res=new class_member_declaration($b.t,$c.t,$a.t);}               // 'class'
        | struct_declaration        // 'struct'           
        | enum_declaration  
        | event_declaration                // 'event' 
        | interface_declaration        // 'interface'
        | delegate_declaration        // 'delegate'
        | conversion_operator_declaration
        | constructor_declaration        //        | static_constructor_declaration
        | destructor_declaration 
      
        ) 
        ;


primary_expression: 
	('this'    brackets) => 'this'   brackets   primary_expression_part*
	| ('base'   brackets) => 'this'   brackets   primary_expression_part*
	| primary_expression_start   primary_expression_part*
	| 'new' (   (object_creation_expression   ('.'|'->'|'[')) => 
					object_creation_expression   primary_expression_part+ 		// new Foo(arg, arg).Member
				// try the simple one first, this has no argS and no expressions
				// symantically could be object creation
				| (delegate_creation_expression) => delegate_creation_expression// new FooDelegate (MyFunction)
				| object_creation_expression
				| anonymous_object_creation_expression)							// new {int X, string Y} 
	| sizeof_expression						// sizeof (struct)
	| checked_expression            		// checked (...
	| unchecked_expression          		// unchecked {...}
	| default_value_expression      		// default
	| anonymous_method_expression			// delegate (int foo) {}
	;

primary_expression_start:
	predefined_type            
	| (identifier    '<') => identifier   generic_argument_list
	| identifier ('::'   identifier)?
	| 'this' 
	| 'base'
	| paren_expression
	| typeof_expression             // typeof(Foo).Name
	| literal
	;

primary_expression_part:
	 access_identifier
	| brackets_or_arguments ;
access_identifier:
	access_operator   type_or_generic ;
access_operator:
	'.'  |  '->' ;
brackets_or_arguments:
	brackets | arguments ;
brackets:
	'['   expression_list?   ']' ;	
paren_expression:	
	'('   expression   ')' ;
arguments: 
	'('   argument_list?   ')' ;
argument_list: 
	argument (',' argument)*;
// 4.0
argument:
	argument_name   argument_value
	| argument_value;
argument_name:
	identifier   ':';
argument_value: 
	expression 
	| ref_variable_reference 
	| 'out'   variable_reference ;
ref_variable_reference:
	'ref' 
		(('('   type   ')') =>   '('   type   ')'   (ref_variable_reference | variable_reference)   // SomeFunc(ref (int) ref foo)
																									// SomeFunc(ref (int) foo)
		| variable_reference);	// SomeFunc(ref foo)
// lvalue
variable_reference:
	expression;
rank_specifiers: 
	rank_specifier+ ;        
rank_specifier: 
	'['   dim_separators?   ']' ;
dim_separators: 
	','+ ;

delegate_creation_expression: 
	// 'new'   
	type_name   '('   type_name   ')' ;
anonymous_object_creation_expression: 
	// 'new'
	anonymous_object_initializer ;
anonymous_object_initializer: 
	'{'   member_declarator_list?   ','?   '}';
member_declarator_list: 
	member_declarator  (',' member_declarator)* ; 
member_declarator: 
	identifier   (generic_argument_list
				 | ('.'   primary_or_array_creation_expression)
				 | '='   expression) ;
primary_or_array_creation_expression:
	(array_creation_expression) => array_creation_expression
	| primary_expression 
	;
// new Type[2] { }
array_creation_expression:
	'new'   
		(type   ('['   expression_list   ']'   
					( rank_specifiers?   array_initializer?	// new int[4]
					// | invocation_part*
					| ( ((arguments   ('['|'.'|'->')) => arguments   invocation_part)// new object[2].GetEnumerator()
					  | invocation_part)*   arguments
					)							// new int[4]()
				| array_initializer		
				)
		| rank_specifier   // [,]
			(array_initializer	// var a = new[] { 1, 10, 100, 1000 }; // int[]
		    )
		) ;
array_initializer  returns [UnknownNode t]
	@after {$t=new UnknownNode($tree);}:
        '{'   variable_initializer_list?   ','?   '}' 
    ;
variable_initializer_list:
	variable_initializer (',' variable_initializer)* ;
variable_initializer  returns [expression t] :
	a=expression {$t=$a.t;}	| b=array_initializer {$t=$b.t;} ;
sizeof_expression:
	'sizeof'   '('   unmanaged_type   ')';
checked_expression: 
	'checked'   '('   expression   ')' ;
unchecked_expression: 
	'unchecked'   '('   expression   ')' ;
default_value_expression: 
	'default'   '('   type   ')' ;
anonymous_method_expression:
	'delegate'   explicit_anonymous_function_signature?   block;
explicit_anonymous_function_signature:
	'('   explicit_anonymous_function_parameter_list?   ')' ;
explicit_anonymous_function_parameter_list:
	explicit_anonymous_function_parameter   (','   explicit_anonymous_function_parameter)* ;	
explicit_anonymous_function_parameter:
	anonymous_function_parameter_modifier?   type   identifier;
anonymous_function_parameter_modifier:
	'ref' | 'out';


///////////////////////////////////////////////////////
object_creation_expression: 
	// 'new'
	type   
		( '('   argument_list?   ')'   object_or_collection_initializer?  
		  | object_or_collection_initializer )
	;
object_or_collection_initializer: 
	'{'  (object_initializer 
		| collection_initializer) ;
collection_initializer: 
	element_initializer_list   ','?   '}' ;
element_initializer_list: 
	element_initializer  (',' element_initializer)* ;
element_initializer: 
	non_assignment_expression 
	| '{'   expression_list   '}' ;
// object-initializer eg's
//	Rectangle r = new Rectangle {
//		P1 = new Point { X = 0, Y = 1 },
//		P2 = new Point { X = 2, Y = 3 }
//	};
// TODO: comma should only follow a member_initializer_list
object_initializer: 
	member_initializer_list?   ','?   '}' ;
member_initializer_list: 
	member_initializer  (',' member_initializer) ;
member_initializer: 
	identifier   '='   initializer_value ;
initializer_value: 
	expression 
	| object_or_collection_initializer ;

///////////////////////////////////////////////////////

typeof_expression: 
	'typeof'   '('   ((unbound_type_name) => unbound_type_name
					  | type 
					  | 'void')   ')' ;
// unbound type examples
//foo<bar<X<>>>
//bar::foo<>
//foo1::foo2.foo3<,,>
unbound_type_name:		// qualified_identifier v2
//	unbound_type_name_start unbound_type_name_part* ;
	unbound_type_name_start   
		(((generic_dimension_specifier   '.') => generic_dimension_specifier   unbound_type_name_part)
		| unbound_type_name_part)*   
			generic_dimension_specifier
	;

unbound_type_name_start:
	identifier ('::' identifier)?;
unbound_type_name_part:
	'.'   identifier;
generic_dimension_specifier: 
	'<'   commas?   '>' ;
commas: 
	','+ ; 

///////////////////////////////////////////////////////
//	Type Section
///////////////////////////////////////////////////////

type_name  returns [CsharpNode t] : 
	a=namespace_or_type_name {$t = $a.t;};
	
namespace_or_type_name  returns [CsharpNode t] :
	 a=type_or_generic {$t=$a.t;}   ('::' type_or_generic)? ('.'   type_or_generic)* ;
type_or_generic returns [CsharpNode t] :
        (identifier   '<') => a=identifier   b=generic_argument_list {$t = new type_or_generic($a.t,$b.t);}
        | a=identifier {$t=$a.t;};

qid returns [qid t]
	@after {$t=new qid($tree);}:
		// qualified_identifier v2
	qid_start   qid_part*
	;
qid_start:
	predefined_type
	| (identifier    '<')	=> identifier   generic_argument_list
//	| 'this'
//	| 'base'
	| identifier   ('::'   identifier)?
	| literal 
	;		// 0.ToString() is legal


qid_part:
	access_identifier ;

generic_argument_list  returns [UnknownNode t]
	@after {$t=new UnknownNode($tree);}: 
	'<'   type_arguments   '>' ;
type_arguments: 
	type (',' type)* ;
type  returns [type t]
	@after {$t=new type($tree);} :
        (  ((predefined_type | type_name)  rank_specifiers) => (predefined_type | type_name)   rank_specifiers   '*'*
        | ((predefined_type | type_name)  ('*'+ | '?')) => (predefined_type | type_name)   ('*'+ | '?')
        | (predefined_type | type_name)
        | 'void' '*'+ )
        ;
non_nullable_type  returns [UnknownNode t]
	@after {$t=new UnknownNode($tree);}:
	(predefined_type | type_name)
		(   rank_specifiers   '*'*
			| ('*'+)?
		)
	| 'void'   '*'+ ;
	
non_array_type:
	type;
array_type:
	type;
unmanaged_type:
	type;
class_type:
	type;
pointer_type:
	type;


///////////////////////////////////////////////////////
//	Statement Section
///////////////////////////////////////////////////////
block  returns [statement_list t]:
        ';'
        | '{'   a=statement_list?   '}' {$t= $a.t;} ;
statement_list returns [statement_list t]
	@init {statement_list res=new statement_list();}
	@after {$t = res;}:
       ( a=statement  { res.add($a.t);})+  ;
        
///////////////////////////////////////////////////////
//        Expression Section
///////////////////////////////////////////////////////        
expression returns [expression t]:
        ((unary_expression   assignment_operator) => a=assignment {$t=$a.t;}        
        | b=non_assignment_expression {$t=$b.t;}) 
        
        ;

expression_list:
	expression  (','   expression)* ;
assignment returns [assignment t]:
	a=unary_expression   b=assignment_operator   c=expression 
	{$t = new assignment($a.t,$b.t,$c.t);};
unary_expression returns [expression t]
	@after {$t=new UnknownNode($tree);}:
	//('(' arguments ')' ('[' | '.' | '(')) => primary_or_array_creation_expression
	(cast_expression) => cast_expression
	| primary_or_array_creation_expression   '++'?   '--'?
	| '+'   unary_expression 
	| '-'   unary_expression 
	| '!'   unary_expression 
	| '~'   unary_expression 
	| pre_increment_expression 
	| pre_decrement_expression 
	| pointer_indirection_expression
	| addressof_expression 
	;
cast_expression
	:	
	'('   type   ')'   unary_expression ;
assignment_operator returns [assignment_operator t]
	@after {$t=new assignment_operator($tree);}:
	'=' | '+=' | '-=' | '*=' | '/=' | '%=' | '&=' | '|=' | '^=' | '<<=' | '>' '>=' ;
pre_increment_expression: 
	'++'   unary_expression ;
pre_decrement_expression: 
	'--'   unary_expression ;
pointer_indirection_expression:
	'*'   unary_expression ;
addressof_expression:
	'&'   unary_expression ;

non_assignment_expression returns [expression t]:
	//'non ASSIGNment'
	(anonymous_function_signature   '=>')	=> a=lambda_expression {$t=$a.t;}
	| (query_expression) => b=query_expression {$t=$b.t;}
	| c=conditional_expression {$t=$c.t;}
	;

///////////////////////////////////////////////////////
//	Conditional Expression Section
///////////////////////////////////////////////////////

multiplicative_expression returns [expression t] 
	@init {expression res = null;}
	@after {$t=res;}:
	a=unary_expression  {res = $a.t;} (  (o='*'|o='/'|o='%')   b=unary_expression {res = new na_expression(res,new operator($o.text),$b.t);})*	;
additive_expression returns [expression t] 
	@init {expression res = null;}
	@after {$t=res;}:
	a=multiplicative_expression  {res = $a.t;} ((o='+'|o='-')   b=multiplicative_expression {res = new na_expression(res,new operator($o.text),$b.t);})* ;
// >> check needed (no whitespace)
shift_expression returns [expression t] 
	@init {expression res = null;}
	@after {$t=res;}:
	a=additive_expression  {res = $a.t;} ((o='<<'|o='>' '>') b=additive_expression {res = new na_expression(res,new operator($o.text),$b.t);})* ;
relational_expression returns [expression t] 
	@init {expression res = null;}
	@after {$t=res;}:
	a=shift_expression  {res = $a.t;}
		(	((o='<'|o='>'|o='>='|o='<=')	b=shift_expression) {res = new na_expression(res,new operator($o.text),$b.t);}
			| ((o='is'|o='as')   c= non_nullable_type) {res = new na_expression(res,new operator($o.text),$c.t);}
		)* ;
		
equality_expression returns [expression t] 
	@init {expression res = null;}
	@after {$t=res;}:
	a=relational_expression {res = $a.t;}
	   ((o='=='|o='!=')   b=relational_expression {res = new na_expression(res,new operator($o.text),$b.t);})* ;
and_expression returns [expression t] 
	@init {expression res = null;}
	@after {$t=res;}:
	a=equality_expression {res = $a.t;} (o='&'    b=equality_expression {res = new na_expression(res,new operator($o.text),$b.t);})* ;
exclusive_or_expression returns [expression t] 
	@init {expression res = null;}
	@after {$t=res;}:
	a=and_expression {res = $a.t;} (o='^'    b=and_expression {res = new na_expression(res,new operator($o.text),$b.t);})* ;
inclusive_or_expression returns [expression t] 
	@init {expression res = null;}
	@after {$t=res;}:
	a=exclusive_or_expression  {res = $a.t;}  (o='|'    b=exclusive_or_expression {res = new na_expression(res,new operator($o.text),$b.t);})* ;
conditional_and_expression returns [expression t]
	@init {expression res = null;}
	@after {$t=res;}:
	a=inclusive_or_expression {res = $a.t;}  (o='&&'    b=inclusive_or_expression {res = new na_expression(res,new operator($o.text),$b.t);})* ;
conditional_or_expression returns [expression t] 
	@init {expression res = null;}
	@after {$t=res;}:
	a=conditional_and_expression {res = $a.t;} (o='||'    b=conditional_and_expression {res = new na_expression(res,new operator($o.text),$b.t);})* ;

null_coalescing_expression returns [expression t]
	@init {expression res = null;}
	@after {$t=res;}:
	a=conditional_or_expression {res = $a.t;}  (o='??'   b=conditional_or_expression {res = new na_expression(res,new operator($o.text),$b.t);})* ;
conditional_expression  returns [expression t] :
	a=null_coalescing_expression {$t = $a.t;}  ('?'   b=expression   ':'   c=expression {$t = new conditional_expression($a.t,$b.t,$c.t);})? ;
      
///////////////////////////////////////////////////////
//	lambda Section
///////////////////////////////////////////////////////
lambda_expression  returns [UnknownNode t]
	@after {$t=new UnknownNode($tree);}:
	anonymous_function_signature   '=>'   anonymous_function_body;
anonymous_function_signature:
	'('	(explicit_anonymous_function_parameter_list
		| implicit_anonymous_function_parameter_list)?	')'
	| implicit_anonymous_function_parameter_list
	;
implicit_anonymous_function_parameter_list:
	implicit_anonymous_function_parameter   (','   implicit_anonymous_function_parameter)* ;
implicit_anonymous_function_parameter:
	identifier;
anonymous_function_body:
	expression
	| block ;

///////////////////////////////////////////////////////
//	LINQ Section
///////////////////////////////////////////////////////
query_expression returns [UnknownNode t]
	@after {$t=new UnknownNode($tree);}:
	from_clause   query_body ;
query_body:
	// match 'into' to closest query_body
	query_body_clauses?   select_or_group_clause   (('into') => query_continuation)? ;
query_continuation:
	'into'   identifier   query_body;
query_body_clauses:
	query_body_clause+ ;
query_body_clause:
	from_clause
	| let_clause
	| where_clause
	| join_clause
	| orderby_clause;
from_clause:
	'from'   type?   identifier   'in'   expression ;
join_clause:
	'join'   type?   identifier   'in'   expression   'on'   expression   'equals'   expression ('into' identifier)? ;
let_clause:
	'let'   identifier   '='   expression;
orderby_clause:
	'orderby'   ordering_list ;
ordering_list:
	ordering   (','   ordering)* ;
ordering:
	expression    ordering_direction
	;
ordering_direction:
	'ascending'
	| 'descending' ;
select_or_group_clause:
	select_clause
	| group_clause ;
select_clause:
	'select'   expression ;
group_clause:
	'group'   expression   'by'   expression ;
where_clause:
	'where'   boolean_expression ;
boolean_expression  returns [expression t] :
	a=expression {$t=$a.t;};

///////////////////////////////////////////////////////
// B.2.13 Attributes
///////////////////////////////////////////////////////
global_attributes returns [UnknownNode t]:
        global_attribute+ {$t=new UnknownNode($tree);};
        
global_attribute: 
	'['   global_attribute_target_specifier   attribute_list   ','?   ']' ;
global_attribute_target_specifier: 
	global_attribute_target   ':' ;
global_attribute_target: 
	'assembly' | 'module' ;
attributes returns [UnknownNode t]
	@after {$t=new UnknownNode($tree);}: 
        attribute_sections;
attribute_sections: 
	attribute_section+ ;
attribute_section: 
	'['   attribute_target_specifier?   attribute_list   ','?   ']' ;
attribute_target_specifier: 
	attribute_target   ':' ;
attribute_target: 
	'field' | 'event' | 'method' | 'param' | 'property' | 'return' | 'type' ;
attribute_list: 
	attribute (',' attribute)* ; 
attribute: 
	type_name   attribute_arguments? ;
// TODO:  allows a mix of named/positional arguments in any order
attribute_arguments: 
	'('   (')'										// empty
		   | (positional_argument   ((','   identifier   '=') => named_argument
		   							 |','	positional_argument)*
			  )	')'
			) ;
positional_argument_list: 
	positional_argument (',' positional_argument)* ;
positional_argument: 
	attribute_argument_expression ;
named_argument_list: 
	named_argument (',' named_argument)* ;
named_argument: 
	identifier   '='   attribute_argument_expression ;
attribute_argument_expression: 
	expression ;

///////////////////////////////////////////////////////
//	Class Section
///////////////////////////////////////////////////////

class_declaration  returns [class_declaration t]:
        'class'  a=type_or_generic   b=class_base?   c=type_parameter_constraints_clauses?   d=class_body   ';'? 
        {$t = new class_declaration($a.t,$b.t, $c.t, $d.t);};
class_base  returns [UnknownNode t]
	@after {$t=new UnknownNode($tree);}:
        // syntactically base class vs interface name is the same
        //':'   class_type (','   interface_type_list)? ;
        ':'   interface_type_list ;

	
interface_type_list:
	type (','   type)* ;

class_body   returns [class_member_declarations t]:
        '{'   a=class_member_declarations?   '}' {$t = $a.t;};
class_member_declarations  returns [class_member_declarations t]
	@init {$t=new class_member_declarations();} :
        (a=class_member_declaration 
         {((class_member_declarations)$t).add($a.t);})+ ;

///////////////////////////////////////////////////////
constant_declaration:
	'const'   type   constant_declarators   ';' ;
constant_declarators  returns [UnknownNode t]
	@after {$t=new UnknownNode($tree);}:
        constant_declarator (',' constant_declarator)* ;

constant_declarator:
	identifier   ('='   constant_expression)? ;
constant_expression:
	expression;

///////////////////////////////////////////////////////
field_declaration returns [variable_declarators t]:
	a=variable_declarators   ';' {$t=$a.t;}	;
variable_declarators returns [variable_declarators t] 
    	@init {variable_declarators res=new variable_declarators();}
	@after {$t = res;}:
	a=variable_declarator {res.add($a.t);} (','   a=variable_declarator  {res.add($a.t);})* ;
variable_declarator returns [variable_declarator t] :
	a=type_name ('='   b=variable_initializer)? {$t = new variable_declarator($a.t,$b.t);};		// eg. event EventHandler IInterface.VariableName = Foo;

///////////////////////////////////////////////////////
method_declaration  returns [method_declaration t]:
        a=method_header   b=method_body {$t = new method_declaration($a.t,$b.t);};
method_header returns [method_header t]:
        a=member_name  '('   b=formal_parameter_list?   ')'   c=type_parameter_constraints_clauses? 
        {$t = new method_header($a.t,$b.t,$c.t);};
method_body returns [statement_list t]:
        a=block {$t = $a.t;};
member_name  returns [qid t]:
        a=qid {$t=$a.t;};              
          // IInterface<int>.Method logic added.

///////////////////////////////////////////////////////
property_declaration:
	member_name   '{'   accessor_declarations   '}' ;
accessor_declarations:
	attributes?
		(get_accessor_declaration   attributes?   set_accessor_declaration?
		| set_accessor_declaration   attributes?   get_accessor_declaration?) ;
get_accessor_declaration:
	accessor_modifier?   'get'   accessor_body ;
set_accessor_declaration:
	accessor_modifier?   'set'   accessor_body ;
accessor_modifier:
	'public' | 'protected' | 'private' | 'internal' ;
accessor_body:
	block ;

///////////////////////////////////////////////////////
event_declaration:
	'event'   type
		((member_name   '{') => member_name   '{'   event_accessor_declarations   '}'
		| variable_declarators   ';')	// typename=foo;
		;
event_modifiers:
	modifier+ ;
event_accessor_declarations:
	attributes?   ((add_accessor_declaration   attributes?   remove_accessor_declaration)
	              | (remove_accessor_declaration   attributes?   add_accessor_declaration)) ;
add_accessor_declaration:
	'add'   block ;
remove_accessor_declaration:
	'remove'   block ;

///////////////////////////////////////////////////////
//	enum declaration
///////////////////////////////////////////////////////
enum_declaration:
	'enum'   identifier   enum_base?   enum_body   ';'? ;
enum_base:
	':'   integral_type ;
enum_body:
	'{' (enum_member_declarations ','?)?   '}' ;
enum_member_declarations:
	enum_member_declaration (',' enum_member_declaration)* ;
enum_member_declaration:
	attributes?   identifier   ('='   expression)? ;
//enum_modifiers:
//	enum_modifier+ ;
//enum_modifier:
//	'new' | 'public' | 'protected' | 'internal' | 'private' ;
integral_type: 
	'sbyte' | 'byte' | 'short' | 'ushort' | 'int' | 'uint' | 'long' | 'ulong' | 'char' ;

// B.2.12 Delegates
delegate_declaration:
	'delegate'   return_type   identifier  variant_generic_parameter_list?   
		'('   formal_parameter_list?   ')'   type_parameter_constraints_clauses?   ';' ;
delegate_modifiers:
	modifier+ ;
// 4.0
variant_generic_parameter_list:
	'<'   variant_type_parameters   '>' ;
variant_type_parameters:
	variant_type_variable_name (',' variant_type_variable_name)* ;
variant_type_variable_name:
	attributes?   variance_annotation?   type_variable_name ;
variance_annotation:
	'in' | 'out' ;

type_parameter_constraints_clauses  returns [UnknownNode t]
	@after {$t=new UnknownNode($tree);}:
        type_parameter_constraints_clause   (','   type_parameter_constraints_clause)* ;

type_parameter_constraints_clause:
	'where'   type_variable_name   ':'   type_parameter_constraint_list ;
// class, Circle, new()
type_parameter_constraint_list:                                                   
    ('class' | 'struct')   (','   secondary_constraint_list)?   (','   constructor_constraint)?
	| secondary_constraint_list   (','   constructor_constraint)?
	| constructor_constraint ;
//primary_constraint:
//	class_type
//	| 'class'
//	| 'struct' ;
secondary_constraint_list:
	secondary_constraint (',' secondary_constraint)* ;
secondary_constraint:
	type_name ;	// | type_variable_name) ;
type_variable_name: 
	identifier ;
constructor_constraint:
	'new'   '('   ')' ;
return_type:
	type
	|  'void';
formal_parameter_list  returns [formal_parameter_list t]
	@init {formal_parameter_list res=new formal_parameter_list();}
	@after {$t = res;}:
        a=formal_parameter {res.add($a.t);} (',' formal_parameter {res.add($a.t);})*;
formal_parameter returns [formal_parameter t]
	@init {CsharpNode res=null;} :
	a=attributes?   (b=fixed_parameter {res=$b.t;} | c=parameter_array {res=$c.t;}) {$t = new formal_parameter($a.t, res);}
	| '__arglist' ; // __arglist is undocumented, see google
fixed_parameters  returns [UnknownNode t]
	@after {$t=new UnknownNode($tree);}:
	fixed_parameter   (','   fixed_parameter)* ;
// 4.0
fixed_parameter returns [UnknownNode t]
	@after {$t=new UnknownNode($tree);}:
	parameter_modifier?   type   identifier   default_argument? ;
// 4.0
default_argument:
	'=' expression;
parameter_modifier:
	'ref' | 'out' | 'this' ;
parameter_array  returns [UnknownNode t]
	@after {$t=new UnknownNode($tree);}:
	'params'   type   identifier ;

///////////////////////////////////////////////////////
interface_declaration:
	'interface'   identifier   variant_generic_parameter_list? 
    	interface_base?   type_parameter_constraints_clauses?   interface_body   ';'? ;
interface_modifiers: 
	modifier+ ;
interface_base: 
   	':' interface_type_list ;
interface_body:
	'{'   interface_member_declarations?   '}' ;
interface_member_declarations:
	interface_member_declaration+ ;
interface_member_declaration:
	attributes?    modifiers?
		('void'   interface_method_declaration
		| interface_event_declaration
		| type   ( (member_name   '(') => interface_method_declaration
		         | (member_name   '{') => interface_property_declaration 
				 | interface_indexer_declaration)
		) 
		;
interface_property_declaration: 
	identifier   '{'   interface_accessor_declarations   '}' ;
interface_method_declaration:
	identifier   generic_argument_list?
	    '('   formal_parameter_list?   ')'   type_parameter_constraints_clauses?   ';' ;
interface_event_declaration: 
	//attributes?   'new'?   
	'event'   type   identifier   ';' ; 
interface_indexer_declaration: 
	// attributes?    'new'?    type   
	'this'   '['   formal_parameter_list   ']'   '{'   interface_accessor_declarations   '}' ;
interface_accessor_declarations:
	attributes?   
		(interface_get_accessor_declaration   attributes?   interface_set_accessor_declaration?
		| interface_set_accessor_declaration   attributes?   interface_get_accessor_declaration?) ;
interface_get_accessor_declaration:
	'get'   ';' ;		// no body / modifiers
interface_set_accessor_declaration:
	'set'   ';' ;		// no body / modifiers
method_modifiers:
	modifier+ ;
	
///////////////////////////////////////////////////////
struct_declaration:
	'struct'   type_or_generic   struct_interfaces?   type_parameter_constraints_clauses?   struct_body   ';'? ;
struct_modifiers:
	struct_modifier+ ;
struct_modifier:
	'new' | 'public' | 'protected' | 'internal' | 'private' | 'unsafe' ;
struct_interfaces:
	':'   interface_type_list;
struct_body:
	'{'   struct_member_declarations?   '}';
struct_member_declarations:
	struct_member_declaration+ ;
struct_member_declaration:
	attributes?   m=modifiers?
	( 'const'   type   constant_declarators   ';'
	| event_declaration		// 'event'
	| 'partial' (method_declaration 
			   | interface_declaration 
			   | class_declaration 
			   | struct_declaration)

	| interface_declaration	// 'interface'
	| class_declaration		// 'class'
	| 'void'   method_declaration
	| type ( (member_name   '(') => method_declaration
		   | (member_name   '{') => property_declaration
		   | (member_name   '.'   'this') => type_name '.' indexer_declaration
		   | indexer_declaration	//this
	       | field_declaration      // qid
	       | operator_declaration
	       )
//	common_modifiers// (method_modifiers | field_modifiers)
	
	| struct_declaration	// 'struct'	   
	| enum_declaration		// 'enum'
	| delegate_declaration	// 'delegate'
	| conversion_operator_declaration
	| constructor_declaration	//	| static_constructor_declaration
	) 
	;


///////////////////////////////////////////////////////
indexer_declaration:
	indexer_declarator   '{'   accessor_declarations   '}' ;
indexer_declarator:
	//(type_name '.')?   
	'this'   '['   formal_parameter_list   ']' ;
	
///////////////////////////////////////////////////////
operator_declaration:
	operator_declarator   operator_body ;
operator_declarator:
	'operator'   
		(('+' | '-')   '('   type   identifier (binary_operator_declarator | unary_operator_declarator)
		| overloadable_unary_operator   unary_operator_declarator
		| overloadable_binary_operator   binary_operator_declarator) ;
unary_operator_declarator:
	   ')' ;
overloadable_unary_operator:
	/*'+' |  '-' | */ '!' |  '~' |  '++' |  '--' |  'true' |  'false' ;
binary_operator_declarator:
	','   type   identifier   ')' ;
// >> check needed
overloadable_binary_operator:
	/*'+' | '-' | */ '*' | '/' | '%' | '&' | '|' | '^' | '<<' | '>' '>' | '==' | '!=' | '>' | '<' | '>=' | '<=' ; 

conversion_operator_declaration:
	conversion_operator_declarator   operator_body ;
conversion_operator_declarator:
	('implicit' | 'explicit')  'operator'   type   '('   type   identifier   ')' ;
operator_body:
	block ;

///////////////////////////////////////////////////////
constructor_declaration:
	constructor_declarator   constructor_body ;
constructor_declarator:
	identifier   '('   formal_parameter_list?   ')'   constructor_initializer? ;
constructor_initializer:
	':'   ('base' | 'this')   '('   argument_list?   ')' ;
constructor_body:
	block ;

///////////////////////////////////////////////////////
//static_constructor_declaration:
//	identifier   '('   ')'  static_constructor_body ;
//static_constructor_body:
//	block ;

///////////////////////////////////////////////////////
destructor_declaration:
	'~'  identifier   '('   ')'    destructor_body ;
destructor_body:
	block ;

///////////////////////////////////////////////////////
invocation_expression:
	invocation_start   (((arguments   ('['|'.'|'->')) => arguments   invocation_part)
						| invocation_part)*   arguments ;
invocation_start:
	predefined_type 
	| (identifier    '<')	=> identifier   generic_argument_list
	| 'this' 
	| 'base'
	| identifier   ('::'   identifier)?
	| typeof_expression             // typeof(Foo).Name
	;
invocation_part:
	 access_identifier
	| brackets ;

///////////////////////////////////////////////////////


statement  returns [statement t]:
        (declaration_statement) => a=declaration_statement {$t = $a.t;}
        | (identifier   ':') => b=labeled_statement {$t = $b.t;}
        | c=embedded_statement {$t = $c.t;} 
        ;
embedded_statement returns [statement t] :
        a=block {$t=$a.t;}
        | b=selection_statement {$t=$b.t;}       // if, switch
        | c=iteration_statement {$t=$c.t;}       // while, do, for, foreach
        | d=jump_statement {$t=$d.t;}                // break, continue, goto, return, throw
        | e=try_statement {$t=$e.t;} 
        | f=checked_statement {$t=$f.t;} 
        | g=unchecked_statement {$t=$g.t;} 
        | h=lock_statement{$t=$h.t;} 
        | i=using_statement {$t=$i.t;} 
        | j=yield_statement  {$t=$j.t;} 
        | k=unsafe_statement {$t=$k.t;} 
        | l=fixed_statement {$t=$l.t;} 
        | m=expression_statement {$t=$m.t;} 
       // expression!
        ;
fixed_statement  returns [UnknownNode t]
	@after {$t=new UnknownNode($tree);}:
	'fixed'   '('   pointer_type fixed_pointer_declarators   ')'   embedded_statement ;
fixed_pointer_declarators:
	fixed_pointer_declarator   (','   fixed_pointer_declarator)* ;
fixed_pointer_declarator:
	identifier   '='   fixed_pointer_initializer ;
fixed_pointer_initializer:
	//'&'   variable_reference   // unary_expression covers this
	expression;
unsafe_statement  returns [UnknownNode t]
	@after {$t=new UnknownNode($tree);}:
	'unsafe'   block;
labeled_statement returns [UnknownNode t]
	@after {$t=new UnknownNode($tree);}:
        identifier   ':'   statement ;
declaration_statement returns [statement t]:
        (b=local_variable_declaration {$t=$b.t;}
        | c=local_constant_declaration {$t=$c.t;} ) ';' ;

local_variable_declaration returns [local_variable_declaration t]:
        a=local_variable_type   b=local_variable_declarators  
        {$t = new local_variable_declaration($a.t,$b.t);};
local_variable_type returns [type t]:
        ('var') => a='var' {$t=new type($a.tree);}
        | ('dynamic') => b='dynamic' {$t=new type($b.tree);}
        | c=type {$t=$c.t;} ;
local_variable_declarators  returns [local_variable_declarators t]
	@init {local_variable_declarators res=new local_variable_declarators();}
	@after {$t = res;}:
        a=local_variable_declarator {res.add($a.t);} (',' a=local_variable_declarator {res.add($a.t);} )* ;
local_variable_declarator returns [local_variable_declarator t]:
        a=identifier ('='   b=local_variable_initializer)?  {$t=new local_variable_declarator($a.t,$b.t);} ; 
local_variable_initializer returns [expression t]:
        a=expression {$t=$a.t;}
        | b=array_initializer {$t=$b.t;}
        | c=stackalloc_initializer  {$t=$c.t;};
stackalloc_initializer  returns [UnknownNode t]
	@after {$t=new UnknownNode($tree);}:
        'stackalloc'   unmanaged_type   '['   expression   ']'  ;
local_constant_declaration returns [local_constant_declaration t]:
        'const'   a=type   b=constant_declarators  {$t=new local_constant_declaration($a.t,$b.t);};
expression_statement  returns [expression t] :
        a=expression   ';' {$t = $a.t;} ;

// TODO: should be assignment, call, increment, decrement, and new object expressions
statement_expression returns [expression t] :
	a=expression {$t = $a.t;}
	;
selection_statement returns [statement t] :
	a=if_statement {$t=$a.t;}
	| b=switch_statement {$t=$b.t;} ;
if_statement returns [if_statement t] :
	// else goes with closest if
	'if'   '('   a=boolean_expression   ')'   b=embedded_statement (('else') => c=else_statement)? {$t = new if_statement($a.t,$b.t,$c.t);}
	;
else_statement returns [statement t] :
	'else'   a=embedded_statement {$t=$a.t;}	;
switch_statement  returns [UnknownNode t]
	@after {$t=new UnknownNode($tree);}:
	'switch'   '('   expression   ')'   switch_block ;
switch_block:
	'{'   switch_sections?   '}' ;
switch_sections:
	switch_section+ ;
switch_section:
	switch_labels   statement_list ;
switch_labels:
	switch_label+ ;
switch_label:
	('case'   constant_expression   ':')
	| ('default'   ':') ;
iteration_statement  returns [statement t] :
	a=while_statement {$t=$a.t;}
	| b=do_statement {$t=$b.t;}
	| c=for_statement {$t=$c.t;}
	| d=foreach_statement{$t=$d.t;} ;
while_statement  returns [while_statement t] :
	'while'   '('   a=boolean_expression   ')'   b=embedded_statement {$t = new while_statement($a.t,$b.t);};
do_statement returns [do_statement t] :
	'do'   a=embedded_statement   'while'   '('   b=boolean_expression   ')'   ';' {$t = new do_statement($a.t,$b.t);};
for_statement returns [for_statement t] :
	'for'   '('   a=for_initializer?   ';'   b=for_condition?   ';'   c=for_iterator?   ')'   d=embedded_statement 
	 {$t = new for_statement($a.t,$b.t,$c.t,$d.t);};
for_initializer returns [CsharpNode t] :
	(local_variable_declaration) => a=local_variable_declaration {$t=$a.t;}
	| b=statement_expression_list {$t=$b.t;}
	;
for_condition returns [expression t] :
	a=boolean_expression {$t = $a.t;};
for_iterator returns [CsharpNode t] :
	a=statement_expression_list {$t = $a.t;};
statement_expression_list returns [statement_expression_list t] 
 	@init {statement_expression_list res=new statement_expression_list();}
	@after {$t = res;}:
	a=statement_expression{res.add($a.t);} (',' a=statement_expression {res.add($a.t);})* ;
foreach_statement returns [foreach_statement t] :
	'foreach'   '('   a=local_variable_type   b=identifier   'in'   c=expression   ')'   d=embedded_statement
	{$t = new foreach_statement($a.t, $b.t, $c.t, $d.t);} ;
jump_statement returns [statement t] :
	a=break_statement {$t = $a.t;}
	| b=continue_statement {$t = $b.t;}
	| c=goto_statement {$t = $c.t;}
	| d=return_statement {$t = $d.t;}
	| e=throw_statement {$t = $e.t;};
break_statement  returns [UnknownNode t]
	@after {$t=new UnknownNode($tree);}:
	'break'   ';' ;
continue_statement  returns [UnknownNode t]
	@after {$t=new UnknownNode($tree);}:
	'continue'   ';' ;
goto_statement  returns [UnknownNode t]
	@after {$t=new UnknownNode($tree);}:
	'goto'   ( identifier
			 | 'case'   constant_expression
			 | 'default')   ';' ;
return_statement  returns [return_statement t]:
	'return'   a=expression?   ';'  {$t=new return_statement($a.t);};
throw_statement  returns [UnknownNode t]
	@after {$t=new UnknownNode($tree);}:
	'throw'   expression?   ';' ;
try_statement returns [UnknownNode t]
	@after {$t=new UnknownNode($tree);}:
      'try'   block   ( catch_clauses   finally_clause?
					  | finally_clause);
//TODO one or both
catch_clauses:
	'catch'   (specific_catch_clauses | general_catch_clause) ;
specific_catch_clauses:
	specific_catch_clause   ('catch'   (specific_catch_clause | general_catch_clause))*;
specific_catch_clause:
	'('   class_type   identifier?   ')'   block ;
general_catch_clause:
	block ;
finally_clause:
	'finally'   block ;
checked_statement  returns [UnknownNode t]
	@after {$t=new UnknownNode($tree);}:
	'checked'   block ;
unchecked_statement  returns [UnknownNode t]
	@after {$t=new UnknownNode($tree);}:
	'unchecked'   block ;
lock_statement  returns [UnknownNode t]
	@after {$t=new UnknownNode($tree);}:
	'lock'   '('  expression   ')'   embedded_statement ;
using_statement  returns [UnknownNode t]
	@after {$t=new UnknownNode($tree);}:
	'using'   '('    resource_acquisition   ')'    embedded_statement ;
resource_acquisition:
	(local_variable_declaration) => local_variable_declaration
	| expression ;
yield_statement returns [UnknownNode t]
	@after {$t=new UnknownNode($tree);}:
	'yield'   ('return'   expression   ';'
	          | 'break'   ';') ;

///////////////////////////////////////////////////////
//	Lexar Section
///////////////////////////////////////////////////////

predefined_type:
	  'bool' | 'byte'   | 'char'   | 'decimal' | 'double' | 'float'  | 'int'    | 'long'   | 'object' | 'sbyte'  
	| 'short'  | 'string' | 'uint'   | 'ulong'  | 'ushort' ;

identifier returns [identifier t]
	@after  {$t=new identifier($tree);}:
 	(IDENTIFIER | 'add' | 'alias' | 'assembly' | 'module' | 'field' | 'method' | 'param' | 'property' | 'type'
	| 'yield' | 'from' | 'into' | 'join' | 'on' | 'where' | 'orderby' | 'group' | 'by' | 'ascending' | 'descending' | 'equals' | 'select' | 'pragma' | 'let' | 'remove' | 'set' | 'var' | '__arglist' | 'dynamic')
        ;

keyword:
	'abstract' | 'as' | 'base' | 'bool' | 'break' | 'byte' | 'case' |  'catch' | 'char' | 'checked' | 'class' | 'const' | 'continue' | 'decimal' | 'default' | 'delegate' | 'do' |	'double' | 'else' |	 'enum'  | 'event' | 'explicit' | 'extern' | 'false' | 'finally' | 'fixed' | 'float' | 'for' | 'foreach' | 'goto' | 'if' | 'implicit' | 'in' | 'int' | 'interface' | 'internal' | 'is' | 'lock' | 'long' | 'namespace' | 'new' | 'null' | 'object' | 'operator' | 'out' | 'override' | 'params' | 'private' | 'protected' | 'public' | 'readonly' | 'ref' | 'return' | 'sbyte' | 'sealed' | 'short' | 'sizeof' | 'stackalloc' | 'static' | 'string' | 'struct' | 'switch' | 'this' | 'throw' | 'true' | 'try' | 'typeof' | 'uint' | 'ulong' | 'unchecked' | 'unsafe' | 'ushort' | 'using' |	 'virtual' | 'void' | 'volatile' ;

also_keyword:
	'add' | 'alias' | 'assembly' | 'module' | 'field' | 'event' | 'method' | 'param' | 'property' | 'type' 
	| 'yield' | 'from' | 'into' | 'join' | 'on' | 'where' | 'orderby' | 'group' | 'by' | 'ascending' | 'descending' 
	| 'equals' | 'select' | 'pragma' | 'let' | 'remove' | 'set' | 'var' | '__arglist' | 'dynamic';

literal:
	Real_literal
	| NUMBER
	| Hex_number
	| Character_literal
	| STRINGLITERAL
	| Verbatim_string_literal
	| TRUE
	| FALSE
	| NULL 
	;

///////////////////////////////////////////////////////

TRUE : 'true';
FALSE: 'false' ;
NULL : 'null' ;
DOT : '.' ;
PTR : '->' ;
MINUS : '-' ;
GT : '>' ;
USING : 'using';
ENUM : 'enum';
IF: 'if';
ELIF: 'elif';
ENDIF: 'endif';
DEFINE: 'define';
UNDEF: 'undef';
SEMI: ';';
RPAREN: ')';

WS:
    (' '  |  '\r'  |  '\t'  |  '\n'  ) 
    { Skip(); } ;
fragment
TS:
    (' '  |  '\t'  ) 
    { Skip(); } ;
DOC_LINE_COMMENT
    : 	('///' ~('\n'|'\r')*  ('\r' | '\n')+)
    { Skip(); } ;
LINE_COMMENT
    :	('//' ~('\n'|'\r')*  ('\r' | '\n')+)
    { Skip(); } ;
COMMENT:
   '/*'
   (options {greedy=false;} : . )* 
   '*/'
	{ Skip(); } ;
STRINGLITERAL
	:
	'"' (EscapeSequence | ~('"' | '\\'))* '"' ;
Verbatim_string_literal:
	'@'   '"' Verbatim_string_literal_character* '"' ;
fragment
Verbatim_string_literal_character:
	'"' '"' | ~('"') ;
NUMBER:
	Decimal_digits INTEGER_TYPE_SUFFIX? ;
// For the rare case where 0.ToString() etc is used.
GooBall
	:
	dil = Decimal_integer_literal d = '.' s=GooBallIdentifier
	;

fragment GooBallIdentifier
	: IdentifierStart IdentifierPart* ;

//---------------------------------------------------------
Real_literal:
	Decimal_digits   '.'   Decimal_digits   Exponent_part?   Real_type_suffix?
	| '.'   Decimal_digits   Exponent_part?   Real_type_suffix?
	| Decimal_digits   Exponent_part   Real_type_suffix?
	| Decimal_digits   Real_type_suffix ;
Character_literal:
	'\''
    (   EscapeSequence
	// upto 3 multi byte unicode chars
    |   ~( '\\' | '\'' | '\r' | '\n' )        
    |   ~( '\\' | '\'' | '\r' | '\n' ) ~( '\\' | '\'' | '\r' | '\n' )
    |   ~( '\\' | '\'' | '\r' | '\n' ) ~( '\\' | '\'' | '\r' | '\n' ) ~( '\\' | '\'' | '\r' | '\n' )
    )
    '\'' ;
IDENTIFIER:
    IdentifierStart IdentifierPart* ;
Pragma:
	//	ignore everything after the pragma since the escape's in strings etc. are different
	'#' ('pragma' | 'region' | 'endregion' | 'line' | 'warning' | 'error') ~('\n'|'\r')*  ('\r' | '\n')+
    { Skip(); } ;
PREPROCESSOR_DIRECTIVE:
	| PP_CONDITIONAL;
fragment
PP_CONDITIONAL:
	(IF_TOKEN
	| DEFINE_TOKEN
	| ELSE_TOKEN
	| ENDIF_TOKEN 
	| UNDEF_TOKEN)   TS*   (LINE_COMMENT?  |  ('\r' | '\n')+) ;
fragment
IF_TOKEN:	
	('#'   TS*  'if'   TS+   ppe = PP_EXPRESSION) ;
fragment
DEFINE_TOKEN:
	'#'   TS*   'define'   TS+   define = IDENTIFIER
	 ;
fragment
UNDEF_TOKEN:
	'#'   TS*   'undef'   TS+   define = IDENTIFIER
	 ;
fragment
ELSE_TOKEN:
	( '#'   TS*   e = 'else'
	| '#'   TS*   'elif'   TS+   PP_EXPRESSION)
	 ;
fragment
ENDIF_TOKEN:
	'#'   'endif'
	 ;
	
	
	
	
fragment
PP_EXPRESSION:
	PP_OR_EXPRESSION;
fragment
PP_OR_EXPRESSION:
	PP_AND_EXPRESSION   TS*   ('||'   TS*   PP_AND_EXPRESSION   TS* )* ;
fragment
PP_AND_EXPRESSION:
	PP_EQUALITY_EXPRESSION   TS*   ('&&'   TS*   PP_EQUALITY_EXPRESSION   TS* )* ;
fragment
PP_EQUALITY_EXPRESSION:
	PP_UNARY_EXPRESSION   TS*   (('=='| ne = '!=')   TS*   PP_UNARY_EXPRESSION
		
		TS* )*
	;
fragment
PP_UNARY_EXPRESSION:
	pe = PP_PRIMARY_EXPRESSION
	| '!'   TS*   ue = PP_UNARY_EXPRESSION  
	;
fragment
PP_PRIMARY_EXPRESSION:
	IDENTIFIER	
	
	| '('   PP_EXPRESSION   ')'
	;


	
fragment
IdentifierStart
	:	'@' | '_' | 'A'..'Z' | 'a'..'z' ;
fragment
IdentifierPart
: 'A'..'Z' | 'a'..'z' | '0'..'9' | '_' ;
fragment
EscapeSequence 
    :   '\\' (
                 'b' 
             |   't' 
             |   'n' 
             |   'f' 
             |   'r'
             |   'v'
             |   'a'
             |   '\"' 
             |   '\'' 
             |   '\\'
             |   ('0'..'3') ('0'..'7') ('0'..'7')
             |   ('0'..'7') ('0'..'7') 
             |   ('0'..'7')
             |   'x'   HEX_DIGIT
             |   'x'   HEX_DIGIT   HEX_DIGIT
             |   'x'   HEX_DIGIT   HEX_DIGIT  HEX_DIGIT
             |   'x'   HEX_DIGIT   HEX_DIGIT  HEX_DIGIT  HEX_DIGIT
             |   'u'   HEX_DIGIT   HEX_DIGIT  HEX_DIGIT  HEX_DIGIT
             |   'U'   HEX_DIGIT   HEX_DIGIT  HEX_DIGIT  HEX_DIGIT  HEX_DIGIT  HEX_DIGIT  HEX_DIGIT
             ) ;     
fragment
Decimal_integer_literal:
	Decimal_digits   INTEGER_TYPE_SUFFIX? ;
//--------------------------------------------------------
Hex_number:
	'0'('x'|'X')   HEX_DIGITS   INTEGER_TYPE_SUFFIX? ;
fragment
Decimal_digits:
	DECIMAL_DIGIT+ ;
fragment
DECIMAL_DIGIT:
	'0'..'9' ;
fragment
INTEGER_TYPE_SUFFIX:
	'U' | 'u' | 'L' | 'l' | 'UL' | 'Ul' | 'uL' | 'ul' | 'LU' | 'Lu' | 'lU' | 'lu' ;
fragment HEX_DIGITS:
	HEX_DIGIT+ ;
fragment HEX_DIGIT:
	'0'..'9'|'A'..'F'|'a'..'f' ;
fragment
Exponent_part:
	('e'|'E')   Sign?   Decimal_digits;
fragment
Sign:
	'+'|'-' ;
fragment
Real_type_suffix:
	'F' | 'f' | 'D' | 'd' | 'M' | 'm' ;	
	
// Testing rules - so you can just use one file with a list of items
assignment_list:
	(assignment ';')+ ;
field_declarations:
	(attributes?   modifiers?   type   field_declaration)+ ;
property_declaration_list:
	(attributes?   modifiers?   type   property_declaration)+ ;
constant_declarations:
	constant_declaration+;
literals:
	literal+ ;
delegate_declaration_list:
	(attributes?   modifiers?   delegate_declaration)+ ;
local_variable_declaration_list:
	(local_variable_declaration ';')+ ;
local_variable_initializer_list:
	(local_variable_initializer ';')+ ;
expression_list_test:
	(expression ';')+ ;
unary_expression_list:
	(unary_expression ';')+ ;
invocation_expression_list:
	(invocation_expression ';')+ ;
primary_expression_list:
	(primary_expression ';')+ ;
non_assignment_expression_list:
	(non_assignment_expression ';')+ ;
method_declarations:
	(modifiers? ('void' | type) method_declaration)+ ;	