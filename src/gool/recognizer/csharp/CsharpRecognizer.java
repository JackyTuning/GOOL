package gool.recognizer.csharp;

import gool.ast.core.BinaryOperation;
import gool.ast.core.Block;
import gool.ast.core.ClassDef;
import gool.ast.core.Constant;
import gool.ast.core.Expression;
import gool.ast.core.ExpressionUnknown;
import gool.ast.core.Field;
import gool.ast.core.For;
import gool.ast.core.If;
import gool.ast.core.Meth;
import gool.ast.core.Modifier;
import gool.ast.core.Operator;
import gool.ast.core.Return;
import gool.ast.core.Statement;
import gool.ast.core.VarAccess;
import gool.ast.core.VarDeclaration;
import gool.ast.core.While;
import gool.ast.type.IType;
import gool.ast.type.TypeBool;
import gool.ast.type.TypeByte;
import gool.ast.type.TypeChar;
import gool.ast.type.TypeDecimal;
import gool.ast.type.TypeInt;
import gool.ast.type.TypeNone;
import gool.ast.type.TypeString;
import gool.ast.type.TypeUnknown;
import gool.ast.type.TypeVoid;
import gool.generator.common.Platform;
import gool.parser.csharp.CsharpVisitor;
import gool.parser.csharp.csLexer;
import gool.parser.csharp.csParser;
import gool.parser.csharp.csParser.compilation_unit_return;
import gool.parser.csharp.ast.CsharpNode;
import gool.parser.csharp.ast.UnknownNode;
import gool.parser.csharp.ast.assignment;
import gool.parser.csharp.ast.assignment_operator;
import gool.parser.csharp.ast.block;
import gool.parser.csharp.ast.class_declaration;
import gool.parser.csharp.ast.class_member_declaration;
import gool.parser.csharp.ast.class_member_declaration_field;
import gool.parser.csharp.ast.class_member_declaration_meth;
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
import gool.parser.csharp.ast.statement;
import gool.parser.csharp.ast.statement_expression_list;
import gool.parser.csharp.ast.statement_list;
import gool.parser.csharp.ast.type;
import gool.parser.csharp.ast.type_declaration;
import gool.parser.csharp.ast.type_or_generic;
import gool.parser.csharp.ast.unary_expression;
import gool.parser.csharp.ast.variable_declarator;
import gool.parser.csharp.ast.variable_declarators;
import gool.parser.csharp.ast.while_statement;

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
	
	/**
	 * The map between CSharp modifiers and GOOL modifiers. Left are the CSharp
	 * modifiers. Right are the GOOL modifiers.
	 * TODO modifier � ajouter : 'new' | 'internal' | 'unsafe' | 'readonly' | 'extern' ;
	 */
	static final private Map<String, Modifier> modifierMap = new HashMap<String, Modifier>();
	
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
	
	static final private Map<String, IType> typeMap = new HashMap<String, IType>();
	static {
		typeMap.put("bool",TypeBool.INSTANCE);
		typeMap.put("int",TypeInt.INSTANCE);
		typeMap.put("short",TypeInt.INSTANCE);
		typeMap.put("long",TypeInt.INSTANCE);
		typeMap.put("float",TypeDecimal.INSTANCE);
		typeMap.put("double",TypeDecimal.INSTANCE);
		typeMap.put("decimal",TypeDecimal.INSTANCE);
		typeMap.put("byte",TypeByte.INSTANCE);
		typeMap.put("void",TypeVoid.INSTANCE);
		typeMap.put("char",TypeChar.INSTANCE);
		typeMap.put("string",TypeString.INSTANCE);
	}
	
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
	 * Converts CSharp modifier to GOOL modifier.
	 */
	private Modifier getModifier(String modifier) {
		return modifierMap.get(modifier);
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
	
	private IType getIType(String type) {
		IType result = typeMap.get(type);
		if(result == null) {
			result = new TypeUnknown(type);
		}
		return result;
	}
	
	@Override
	public Object visit_assignment(assignment o) {
		// TODO Auto-generated method stub
				return new ExpressionUnknown(null, o.toString());

	}

	@Override
	public Object visit_assignment_operator(
			assignment_operator o) {
		// TODO Auto-generated method stub
				return new ExpressionUnknown(null, o.toString());

	}

	@Override
	public Object visit_class_declaration(class_declaration c) {
		String name = (String) c.getType_or_generic().accept(this);
		ClassDef classe = new ClassDef(name);
		List<Object> fm = (List<Object>) c.getClass_body().accept(this);
		for (Object o : fm) {
			if (o instanceof Meth) {
				classe.addMethod((Meth) o);
			}
			if (o instanceof Field) {
				classe.addField((Field) o);
			}
		}
		return classe;
	}

	@Override
	public Object visit_class_member_declaration(
			class_member_declaration o) {
		// TODO Auto-generated method stub
				return new ExpressionUnknown(null, o.toString());

	}

	@Override
	public Object visit_class_member_declaration_field(
			class_member_declaration_field c) {
		Field f = (Field) c.getField_declaration().accept(this);
		f.addModifiers((Collection<Modifier>) c.getModifiers().accept(this));
		f.setType((IType) c.getType().accept(this));
		return f;
	}

	@Override
	public Object visit_class_member_declaration_meth(
			class_member_declaration_meth c) {
		Meth m = (Meth) c.getMethod_declaration().accept(this);
		m.addModifiers((Collection<Modifier>) c.getModifiers().accept(this));
		m.setType((IType) c.getType().accept(this));
		return m;
	}

	@Override
	public Object visit_class_member_declarations(
			class_member_declarations o) {
		List<Object> l = new ArrayList<Object>();
		for (CsharpNode c : o.getClass_member_declarations()) {
			l.add(c.accept(this));
		}
		return l;
	}

	
	@Override
	public Object visit_compilation_unit(compilation_unit compilation_unit) {
		return compilation_unit.getNamespace_body().accept(this);
	}


	@Override
	public Object visit_conditional_expression(
			conditional_expression o) {
		// TODO Auto-generated method stub
				return new ExpressionUnknown(null, o.toString());

	}
	
	@Override
	public Object visit_constant_declarator(
			constant_declarator o) {
		// TODO Auto-generated method stub
				return new ExpressionUnknown(null, o.toString());

	}

	@Override
	public Object visit_constant_declarators(
			constant_declarators o) {
		// TODO Auto-generated method stub
		return new ExpressionUnknown(null, o.toString());

	}

	@Override
	public Object visit_do_statement(do_statement do_statement) {
		// TODO Auto-generated method stub
		return new ExpressionUnknown(null, do_statement.toString());
	}

	@Override
	public Object visit_expression(na_expression o) {
		Expression left = (Expression) o.getFilsGauche().accept(this);
		Expression right = (Expression) o.getFilsDroit().accept(this);
		Operator operator = (Operator) o.getOperator().accept(this);
		BinaryOperation b = new BinaryOperation(operator, left, right, new TypeUnknown(""), operator.toString());
		return b;

	}

	@Override
	public Object visit_for_statement(for_statement for_statement) {
		Statement initializer = (Statement) for_statement.for_initializer.accept(this);
		Expression condition = (Expression) for_statement.for_condition.accept(this);
		Statement iterator = (Statement) for_statement.for_iterator.accept(this);
			
		return new For(initializer, condition, iterator, (Statement) for_statement.embedded_statement.accept(this));
	}

	@Override
	public Object visit_foreach_statement(foreach_statement foreach_statement) {
		// TODO Auto-generated method stub
		return new ExpressionUnknown(null, foreach_statement.toString());
	}

	@Override
	public Object visit_formal_parameter(formal_parameter o) {
		return o.getParameter().accept(this);
	}

	@Override
	public Object visit_formal_parameter_list(
			formal_parameter_list o) {
		List<VarDeclaration> vars = new ArrayList<VarDeclaration>();
		for (formal_parameter parm : o.getFormal_parameters()) {
			vars.add((VarDeclaration) parm.accept(this));
		}
		return vars;
	}

	@Override
	public Object visit_identifier(identifier o) {
		return o.toString();
	}

	@Override
	public Object visit_if_statement(if_statement if_statement) {	
		Expression condition = (Expression)if_statement.boolean_expression.accept(this);
		Statement thenStmt = null;
		thenStmt = (Statement) if_statement.embedded_statement.accept(this);
		Statement elseStmt = null;
		if(if_statement.else_statement!=null) {
			elseStmt = (Statement) if_statement.else_statement.accept(this);
		}
		return new If(condition, thenStmt, elseStmt);
	}

	@Override
	public Object visit_local_constant_declaration(
			local_constant_declaration o) {
		// TODO Auto-generated method stub
				return new ExpressionUnknown(null, o.toString());

	}

	@Override
	public Object visit_local_variable_declaration(
			local_variable_declaration o) {
		// TODO Auto-generated method stub
				return new ExpressionUnknown(null, o.toString());

	}

	@Override
	public Object visit_local_variable_declarators(
			local_variable_declarators o) {
		// TODO Auto-generated method stub
				return new ExpressionUnknown(null, o.toString());

	}

	@Override
	public Object visit_method_declaration(method_declaration o) {
		method_header method_header = o.getMethod_header();
		String name = (String) method_header.getMember_name().accept(this);
		Meth m = new Meth(null, name);
		formal_parameter_list formal_parameter_list = method_header.getFormal_parameter_list();
		if (formal_parameter_list != null) {
			List<VarDeclaration> params = (List<VarDeclaration>) formal_parameter_list.accept(this);
			for(VarDeclaration v : params) {
				m.addParameter(v);
			}			
		}
		Statement statement = (Statement) o.getMethod_body().accept(this);
		m.addStatement(statement);
		return m;
	}

	@Override
	public Object visit_modifier(modifier m) {
		return getModifier(m.getName());
	}

	@Override
	public Object visit_modifiers(modifiers m) {
		Collection<Modifier> modifiers = new HashSet<Modifier>();
		for(modifier modi : m.getModifiers()) {
			Modifier res = (Modifier) modi.accept(this);
			if (res != null) {
				modifiers.add(res);				
			}
		}
		return modifiers;
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
	public Object visit_operator(operator o) {
		return getOperator(o.toString());

	}

	@Override
	public Object visit_qid(qid o) {
		return o.toString();
	}

	@Override
	public Object visit_return_statement(return_statement return_statement) {
		return new Return((Expression) return_statement.getExpression().accept(this));
	}

	@Override
	public Object visit_statement_expression_list(
			statement_expression_list o) {
		// TODO Auto-generated method stub
				return new ExpressionUnknown(null, o.toString());

	}

	@Override
	public Object visit_statement_list(statement_list o) {
		List<Statement> stats = new ArrayList<Statement>();
		for (statement s : o.getStatement_list()) {
			stats.add((Statement) s.accept(this));
		}
		return stats;
	}

	@Override
	public Object visit_type(type o) {
		return getIType(o.toString());
	}

	public Object visit_type_declaration(type_declaration type_declaration) {
		return type_declaration.accept(this);
	}

	@Override
	public Object visit_type_or_generic(type_or_generic o) {
		// TODO Auto-generated method stub
				return new ExpressionUnknown(null, o.toString());

	}

	@Override
	public Object visit_unary_expression(unary_expression o) {
		System.out.println("toto");
		try {
			Integer i = Integer.parseInt(o.toString());
			return new Constant(TypeString.INSTANCE, i);
		} catch (NumberFormatException e){
			return new VarAccess(new VarDeclaration(TypeString.INSTANCE,o.toString()));
		}
	}

	@Override
	public Object visit_UnknwnNode(UnknownNode unknowNode) {
		return new ExpressionUnknown(TypeNone.INSTANCE, unknowNode.toString());
	}


	@Override
	public Object visit_variable_declarator(
			local_variable_declarator o) {
		// TODO Auto-generated method stub
				return new ExpressionUnknown(null, o.toString());

	}

	@Override
	public Object visit_variable_declarator(
			variable_declarator o) {
		// TODO Auto-generated method stub
				return new ExpressionUnknown(null, o.toString());

	}
	@Override
	public Object visit_variable_declarators(
			variable_declarators o) {
		// TODO Auto-generated method stub
				return new ExpressionUnknown(null, o.toString());

	}
	@Override
	public Object visit_while_statement(while_statement while_statement) {
		return new While((Expression) while_statement.boolean_expression.accept(this),(Statement) while_statement.embedded_statement.accept(this));
	}
	
	@Override
	public Object visit_block(block o) {
		Block b = new Block();
		if (o.getStatement_list() != null){
			List<Statement> ls = (List<Statement>) o.getStatement_list().accept(this);
			b.addStatements(ls);			
		}
		return b;
	}

}