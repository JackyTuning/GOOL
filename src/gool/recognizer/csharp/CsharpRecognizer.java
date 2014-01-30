package gool.recognizer.csharp;

import gool.ast.core.*;
import gool.ast.type.*;
import gool.generator.common.Platform;
import gool.parser.csharp.CsharpVisitor;
import gool.parser.csharp.csLexer;
import gool.parser.csharp.csParser;
import gool.parser.csharp.csParser.compilation_unit_return;
import gool.parser.csharp.ast.*;

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
	
	// '=' | '+=' | '-=' | '*=' | '/=' | '%=' | '&=' | '|=' | '^=' | '<<=' | '>' '>='
	static final private Map<String, Operator> CompoundOperatorMap = new HashMap<String, Operator>();
	static {
		CompoundOperatorMap.put("+=", Operator.PLUS);
		CompoundOperatorMap.put("-=", Operator.MINUS);
		CompoundOperatorMap.put("*=", Operator.MULT);
		CompoundOperatorMap.put("/=", Operator.DIV);
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
	
	static final private Map<literal.literaltype,IType> literalTypeMap = new HashMap<literal.literaltype,IType>();
	static {
		literalTypeMap.put(literal.literaltype.Bool, TypeBool.INSTANCE);
		literalTypeMap.put(literal.literaltype.Character_literal, TypeChar.INSTANCE);
		literalTypeMap.put(literal.literaltype.NUMBER, TypeInt.INSTANCE);
		literalTypeMap.put(literal.literaltype.Real_literal, TypeDecimal.INSTANCE);
		literalTypeMap.put(literal.literaltype.STRINGLITERAL, TypeString.INSTANCE);
		literalTypeMap.put(literal.literaltype.Verbatim_string_literal, TypeNone.INSTANCE);
		literalTypeMap.put(literal.literaltype.Hex_number, TypeNone.INSTANCE);
		literalTypeMap.put(literal.literaltype.NULL, TypeNull.INSTANCE);
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
		// TODO gerer system.String
		IType result = typeMap.get(type.toLowerCase());
		if(result == null) {
			// pour simplifier on considère que si c'est pas un type de base alors c'est une classe déclarer a un autre endroit
			result = new TypeClass(type);
		}
		return result;
	}

	private IType getIType(literal literal) {
		IType result = literalTypeMap.get(literal.getType());
		if(result == null) {
			result = new TypeUnknown(literal.toString());
		}
		return result;
	}
	
	/**
	 * Converts CSharp operator to GOOL operators.
	 */
	private Operator getCompoundOperator(String operator) {
		Operator result = CompoundOperatorMap.get(operator);
		if (result == null) {
			result = Operator.UNKNOWN;
		}
		return result;
	}
	
	@Override
	public Object visit_assignment(assignment o) {
		Node var = (Node) o.getUnary_expression().accept(this);
		Expression value = (Expression) o.getExpression().accept(this);	
		String textop = o.getAssignment_operator().toString();
		if (textop.equals("=")) {
			return new Assign(var, value);
		} else {			
			textop = textop.replace("=", "");
			Operator operator = (Operator) o.getAssignment_operator().accept(this);
			return new  CompoundAssign(var, value, operator , textop, TypeNone.INSTANCE);		
		}
	}

	@Override
	public Object visit_assignment_operator(
			assignment_operator o) {
		return getCompoundOperator(o.toString());
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

	@Override
	public Object visit_class_declaration(class_declaration c) {
		Identifier name = (Identifier) c.getType_or_generic().accept(this);
		ClassDef classe = new ClassDef(name.getName());
		if (c.getClass_body() != null) {
			// class_body peut contenir des methode, des attribues, des déclarations de classes, ... 
			List<Object> fm = (List<Object>) c.getClass_body().accept(this);
			for (Object o : fm) {
				// on ne garde que les methodes et les attribues (le reste n'est pas reconnue par gool)
				if (o instanceof Meth) {
					Meth m = (Meth) o;
					if (m.getName().equals("Main")) {
						classe.setMainClass(true);
						MainMeth r = new MainMeth();
						r.addStatements(m.getBlock().getStatements());
						classe.addMethod(r);
					} else if (m.getName().equals(classe.getName())) {
						Constructor r = new Constructor();
						r.addStatements(m.getBlock().getStatements());
						r.setModifiers(m.getModifiers());
						for (VarDeclaration pa : m.getParams()) {							
							r.addParameter(pa);
						}
						classe.addMethod(r);
					} else {						
						classe.addMethod((Meth) o);
					}
				}
				if (o instanceof List<?>) {
					for (Field f : (List<Field>) o)
						classe.addField(f);
				}
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
		List<Field> lf = (List<Field>) c.getField_declaration().accept(this);
		// on rajoute les informations manquante lors de la création du Field.
		for (Field f : lf) {
			if (c.getModifiers() != null) {
				f.setModifiers((Collection<Modifier>) c.getModifiers().accept(this));				
			}
			f.setType((IType) c.getType().accept(this));			
		}
		return lf;
	}

	@Override
	public Object visit_class_member_declaration_meth(
			class_member_declaration_meth o) {
		Meth m = (Meth) o.getMethod_declaration().accept(this);
		// on rajoute les informations manquante lors de la création de la methode.
		if ( o.getModifiers() != null) {
			m.setModifiers((Collection<Modifier>) o.getModifiers().accept(this));			
		}
		m.setType((IType) o.getType().accept(this));
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
	public Object visit_compilation_unit(compilation_unit o) {
		return o.getNamespace_body().accept(this);
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
		VarDeclaration v = new VarDeclaration(null,((Identifier) o.getIdentifier().accept(this)).getName());
		if (o.getConstant_expression() != null) {
			v.setInitialValue((Expression) o.getConstant_expression().accept(this));
		}
		return v;
	}

	@Override
	public Object visit_constant_declarators(
			constant_declarators o) {
		List<VarDeclaration> lv = new ArrayList<VarDeclaration>();
		for(CsharpNode c : o.getConstant_declarators()) {
			lv.add((VarDeclaration) c.accept(this));
		}
		return lv;
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
		//TODO : déterminer la type de l'opération
		BinaryOperation b = new BinaryOperation(operator, left, right, TypeNone.INSTANCE, o.getOperator().toString());
		return b;
	}

	@Override
	public Object visit_for_statement(for_statement o) {
		if (o.getFor_initializer() == null || o.getFor_condition() == null || o.getFor_iterator().accept(this) == null) {
			return new ExpressionUnknown(null, o.toString());
		}
		Statement initializer = (Statement) o.getFor_initializer().accept(this);
		Expression condition = (Expression) o.getFor_condition().accept(this);
		Statement iterator = (Statement) o.getFor_iterator().accept(this);
			
		return new For(initializer, condition, iterator, (Statement) o.getEmbedded_statement().accept(this));
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
	public Object visit_formal_parameter_list(formal_parameter_list o) {
		List<VarDeclaration> vars = new ArrayList<VarDeclaration>();
		for (formal_parameter parm : o.getFormal_parameters()) {
			Object accept = parm.accept(this);
			if (accept instanceof VarDeclaration) {
				vars.add((VarDeclaration) accept);
			} else {
				return new ExpressionUnknown(null, o.toString());
			}
		}
		return vars;
	}

	@Override
	public Object visit_identifier(identifier o) {
		return new Identifier(TypeNone.INSTANCE, o.toString());
	}

	@Override
	public Object visit_if_statement(if_statement if_statement) {	
		Expression condition = (Expression)if_statement.getBoolean_expression().accept(this);
		Statement thenStmt = null;
		thenStmt = (Statement) if_statement.getEmbedded_statement().accept(this);
		Statement elseStmt = null;
		if(if_statement.getElse_statement()!=null) {
			elseStmt = (Statement) if_statement.getElse_statement().accept(this);
		}
		return new If(condition, thenStmt, elseStmt);
	}

	@Override
	public Object visit_local_constant_declaration(
			local_constant_declaration o) {
		IType type = (IType) o.getType().accept(this);
		List<VarDeclaration> lv = (List<VarDeclaration>) o.getConstant_declarators().accept(this);
		for (VarDeclaration v : lv) {
			v.setType(type);
			v.addModifier(Modifier.FINAL);
		}
		if (lv.size() == 1) {
			return lv.get(0);
		} else {
			return new ExpressionUnknown(null, o.toString());
		}
	}

	@Override
	public Object visit_local_variable_declaration(
			local_variable_declaration o) {
		IType type = (IType) o.getLocal_variable_type().accept(this);
		List<VarDeclaration> lv = (List<VarDeclaration>) o.getLocal_variable_declarators().accept(this);
		for (VarDeclaration v : lv) {
			v.setType(type);			
		}
		if (lv.size() == 1) {
			return lv.get(0);
		} else {
			return new ExpressionUnknown(null, o.toString());
		}
	}

	@Override
	public Object visit_local_variable_declarator(
			local_variable_declarator o) {
		VarDeclaration v = new VarDeclaration(null,((Identifier) o.getIdentifier().accept(this)).getName());
		if (o.getLocal_variable_initializer() != null) {
			v.setInitialValue((Expression) o.getLocal_variable_initializer().accept(this));
		}
		return v;
	}

	@Override
	public Object visit_local_variable_declarators(
			local_variable_declarators o) {
		List<VarDeclaration> lv = new ArrayList<VarDeclaration>();
		for(local_variable_declarator c : o.getLocal_variable_declarators()) {
			lv.add((VarDeclaration) c.accept(this));
		}
		return lv;
	}

	@Override
	public Object visit_method_declaration(method_declaration o) {
		method_header method_header = o.getMethod_header();
		String name = method_header.getMember_name().toString();
		Meth m = new Meth(null, name);
		formal_parameter_list formal_parameter_list = method_header.getFormal_parameter_list();
		if (formal_parameter_list != null) {
			Object accept2 = formal_parameter_list.accept(this);
			if (accept2 instanceof List<?>) {
				List<VarDeclaration> params = (List<VarDeclaration>) accept2;
				for(VarDeclaration v : params) {
					m.addParameter(v);
				}							
			} else {
				return new ExpressionUnknown(null, o.toString());
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
		if (namespace_member_declaration.getModifiers() != null) {
			Collection<Modifier> modifiers =  (Collection<Modifier>) namespace_member_declaration.getModifiers().accept(this);
			classe.setModifiers(modifiers);			
		}
		return classe;
	}

	@Override
	public Object visit_namespace_member_declarations(
			namespace_member_declarations namespace_member_declarations) {
		List<ClassDef> classes = new ArrayList<ClassDef>();
		for (CsharpNode node : namespace_member_declarations.getNamespace_member_declarations()) {
			Object accept = node.accept(this);
			if ( accept instanceof ClassDef) {
				classes.add( ( ClassDef ) accept);
			}
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
		if (return_statement.getExpression() != null) {
			return new Return((Expression) return_statement.getExpression().accept(this));
		}
		return new Return(null);
	}

	@Override
	public Object visit_statement_expression_list(
			statement_expression_list o) {
		return o.getStatement_expression_list().get(0).accept(this);
	}

	@Override
	public Object visit_statement_list(statement_list o) {
		List<Statement> stats = new ArrayList<Statement>();
		for (statement s : o.getStatement_list()) {
			Object accept = s.accept(this);
			stats.add((Statement) accept);
		}
		return stats;
	}


	public Object visit_type_declaration(type_declaration type_declaration) {
		return type_declaration.accept(this);
	}

	@Override
	public Object visit_type_or_generic(type_or_generic o) {
		return new ExpressionUnknown(null, o.toString());
	}

	@Override
	public Object visit_unary_expression(unary_expression o) {
		Expression res = (Expression) o.getUnary_expression().accept(this);
		if (o.isMoins()) {
			res = new UnaryOperation(Operator.POSTFIX_DECREMENT, res, TypeNone.INSTANCE, "--");
		}
		if (o.isPlus()) {
			res = new UnaryOperation(Operator.POSTFIX_INCREMENT, res, TypeNone.INSTANCE, "++");
		}
		return res;
	}
	@Override
	public Object visit_UnknwnNode(UnknownNode unknowNode) {
		return new ExpressionUnknown(null, unknowNode.toString(),"CsharpParser");
	}
	@Override
	public Object visit_variable_declarator(
			variable_declarator o) {
		
		Field f = new Field(((Identifier) o.getType_name().accept(this)).getName(), null, null);
		if (o.getVariable_initializer() != null) {
			f.setDefaultValue((Expression) o.getVariable_initializer().accept(this));
		}
		return f;
	}
	
	@Override
	public Object visit_variable_declarators(
			variable_declarators o) {
		List<Field> lf = new ArrayList<Field>();
		for (variable_declarator c : o.getVariable_declarators()) {
			lf.add((Field) c.accept(this));
		}
		return lf;
	}
	
	@Override
	public Object visit_while_statement(while_statement while_statement) {
		return new While((Expression) while_statement.boolean_expression.accept(this),(Statement) while_statement.embedded_statement.accept(this));
	}

	@Override
	public Object visit_type(type o) {
		return getIType(o.toString());
	}

	@Override
	public Object visit_fixed_parameter(fixed_parameter o) {
		return new VarDeclaration((IType) o.getType().accept(this),((Identifier) o.getIdentifier().accept(this)).getName());
	}

	@Override
	public Object visit_argument_list(argument_list o) {
		List<Expression> le = new ArrayList<Expression>();
		for (CsharpNode c : o.getArgument_list()) {
			le.add((Expression) c.accept(this));
		}
		return le;
	}

	@Override
	public Object visit_argument_value(argument o) {
		return o.getArgument_value().accept(this);
	}

	@Override
	public Object visit_literal(literal o) {
		String string = o.toString().replace("\"", "");
		return new Constant(getIType(o), string);
	}

	@Override
	public Object visit_object_creation_expression(
			object_creation_expression o) {
		IType type = (IType) o.getType().accept(this);
		ClassNew ni = new ClassNew(type);
		if ( o.getArgument_list() != null) {
			ni.addParameters((List<Expression>) o.getArgument_list().accept(this));
		}
		return ni;
	}

	@Override
	public Object visit_predefined_type(predefined_type o) {
		// TODO Auto-generated method stub
		return new ExpressionUnknown(null, o.toString());
	}

	@Override
	public Object visit_primary_expression_new(
			primary_expression_new o) {
		ClassNew ni = (ClassNew) o.getObject_creation_expression().accept(this);
		return ni;
	}

	@Override
	public Object visit_primary_expression(primary_expression o) {
		Object start = o.getPrimary_expression_start().accept(this);
		if (start instanceof Identifier) { 
			if (! o.isArrayNull()) {
				// Si primary_expression contient des primary_expression_part alors c'est une methode
				MethCall m = new MethCall(TypeNone.INSTANCE, (Identifier) start);
				for (CsharpNode c : o.getPrimary_expression_part()) {
					if (c != null) { 
						Object accept = c.accept(this);
						if (accept instanceof List<?>) {
							m.addParameters((List<Expression>) accept);
						} else {
							return new ExpressionUnknown(TypeNone.INSTANCE, o.toString());
						}
						
					}
				}
				return m;
			}
		} 
		return start;
	}

	@Override
	public Object visit_expression_list(expression_list o) {
		// TODO Auto-generated method stub
		return new ExpressionUnknown(null, o.toString());
	}

	@Override
	public Object visit_cast_expression(cast_expression o) {
		return new CastExpression((IType) o.getType().accept(this), (Expression) o.getUnary_expression().accept(this));
	}

	@Override
	public Object visit_access_identifier(access_identifier o) {
		// TODO Auto-generated method stub
		return new ExpressionUnknown(null, o.toString());
	}

	@Override
	public Object visit_acces_operator(acces_operator o) {
		// TODO Auto-generated method stub
		return new ExpressionUnknown(null, o.toString());
	}
}
