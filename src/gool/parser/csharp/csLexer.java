// $ANTLR 3.5 /Users/jeremie/ANTLR/cs.g 2014-01-24 11:20:23

  package gool.parser.csharp;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class csLexer extends Lexer {
	public static final int EOF=-1;
	public static final int T__61=61;
	public static final int T__62=62;
	public static final int T__63=63;
	public static final int T__64=64;
	public static final int T__65=65;
	public static final int T__66=66;
	public static final int T__67=67;
	public static final int T__68=68;
	public static final int T__69=69;
	public static final int T__70=70;
	public static final int T__71=71;
	public static final int T__72=72;
	public static final int T__73=73;
	public static final int T__74=74;
	public static final int T__75=75;
	public static final int T__76=76;
	public static final int T__77=77;
	public static final int T__78=78;
	public static final int T__79=79;
	public static final int T__80=80;
	public static final int T__81=81;
	public static final int T__82=82;
	public static final int T__83=83;
	public static final int T__84=84;
	public static final int T__85=85;
	public static final int T__86=86;
	public static final int T__87=87;
	public static final int T__88=88;
	public static final int T__89=89;
	public static final int T__90=90;
	public static final int T__91=91;
	public static final int T__92=92;
	public static final int T__93=93;
	public static final int T__94=94;
	public static final int T__95=95;
	public static final int T__96=96;
	public static final int T__97=97;
	public static final int T__98=98;
	public static final int T__99=99;
	public static final int T__100=100;
	public static final int T__101=101;
	public static final int T__102=102;
	public static final int T__103=103;
	public static final int T__104=104;
	public static final int T__105=105;
	public static final int T__106=106;
	public static final int T__107=107;
	public static final int T__108=108;
	public static final int T__109=109;
	public static final int T__110=110;
	public static final int T__111=111;
	public static final int T__112=112;
	public static final int T__113=113;
	public static final int T__114=114;
	public static final int T__115=115;
	public static final int T__116=116;
	public static final int T__117=117;
	public static final int T__118=118;
	public static final int T__119=119;
	public static final int T__120=120;
	public static final int T__121=121;
	public static final int T__122=122;
	public static final int T__123=123;
	public static final int T__124=124;
	public static final int T__125=125;
	public static final int T__126=126;
	public static final int T__127=127;
	public static final int T__128=128;
	public static final int T__129=129;
	public static final int T__130=130;
	public static final int T__131=131;
	public static final int T__132=132;
	public static final int T__133=133;
	public static final int T__134=134;
	public static final int T__135=135;
	public static final int T__136=136;
	public static final int T__137=137;
	public static final int T__138=138;
	public static final int T__139=139;
	public static final int T__140=140;
	public static final int T__141=141;
	public static final int T__142=142;
	public static final int T__143=143;
	public static final int T__144=144;
	public static final int T__145=145;
	public static final int T__146=146;
	public static final int T__147=147;
	public static final int T__148=148;
	public static final int T__149=149;
	public static final int T__150=150;
	public static final int T__151=151;
	public static final int T__152=152;
	public static final int T__153=153;
	public static final int T__154=154;
	public static final int T__155=155;
	public static final int T__156=156;
	public static final int T__157=157;
	public static final int T__158=158;
	public static final int T__159=159;
	public static final int T__160=160;
	public static final int T__161=161;
	public static final int T__162=162;
	public static final int T__163=163;
	public static final int T__164=164;
	public static final int T__165=165;
	public static final int T__166=166;
	public static final int T__167=167;
	public static final int T__168=168;
	public static final int T__169=169;
	public static final int T__170=170;
	public static final int T__171=171;
	public static final int T__172=172;
	public static final int T__173=173;
	public static final int T__174=174;
	public static final int T__175=175;
	public static final int T__176=176;
	public static final int T__177=177;
	public static final int T__178=178;
	public static final int T__179=179;
	public static final int T__180=180;
	public static final int T__181=181;
	public static final int T__182=182;
	public static final int T__183=183;
	public static final int T__184=184;
	public static final int T__185=185;
	public static final int T__186=186;
	public static final int T__187=187;
	public static final int T__188=188;
	public static final int T__189=189;
	public static final int T__190=190;
	public static final int T__191=191;
	public static final int T__192=192;
	public static final int T__193=193;
	public static final int T__194=194;
	public static final int T__195=195;
	public static final int T__196=196;
	public static final int T__197=197;
	public static final int T__198=198;
	public static final int T__199=199;
	public static final int T__200=200;
	public static final int T__201=201;
	public static final int T__202=202;
	public static final int COMMENT=4;
	public static final int Character_literal=5;
	public static final int DECIMAL_DIGIT=6;
	public static final int DEFINE=7;
	public static final int DEFINE_TOKEN=8;
	public static final int DOC_LINE_COMMENT=9;
	public static final int DOT=10;
	public static final int Decimal_digits=11;
	public static final int Decimal_integer_literal=12;
	public static final int ELIF=13;
	public static final int ELSE_TOKEN=14;
	public static final int ENDIF=15;
	public static final int ENDIF_TOKEN=16;
	public static final int ENUM=17;
	public static final int EscapeSequence=18;
	public static final int Exponent_part=19;
	public static final int FALSE=20;
	public static final int GT=21;
	public static final int GooBall=22;
	public static final int GooBallIdentifier=23;
	public static final int HEX_DIGIT=24;
	public static final int HEX_DIGITS=25;
	public static final int Hex_number=26;
	public static final int IDENTIFIER=27;
	public static final int IF=28;
	public static final int IF_TOKEN=29;
	public static final int INTEGER_TYPE_SUFFIX=30;
	public static final int IdentifierPart=31;
	public static final int IdentifierStart=32;
	public static final int LINE_COMMENT=33;
	public static final int MINUS=34;
	public static final int NULL=35;
	public static final int NUMBER=36;
	public static final int PP_AND_EXPRESSION=37;
	public static final int PP_CONDITIONAL=38;
	public static final int PP_EQUALITY_EXPRESSION=39;
	public static final int PP_EXPRESSION=40;
	public static final int PP_OR_EXPRESSION=41;
	public static final int PP_PRIMARY_EXPRESSION=42;
	public static final int PP_UNARY_EXPRESSION=43;
	public static final int PREPROCESSOR_DIRECTIVE=44;
	public static final int PTR=45;
	public static final int Pragma=46;
	public static final int RPAREN=47;
	public static final int Real_literal=48;
	public static final int Real_type_suffix=49;
	public static final int SEMI=50;
	public static final int STRINGLITERAL=51;
	public static final int Sign=52;
	public static final int TRUE=53;
	public static final int TS=54;
	public static final int UNDEF=55;
	public static final int UNDEF_TOKEN=56;
	public static final int USING=57;
	public static final int Verbatim_string_literal=58;
	public static final int Verbatim_string_literal_character=59;
	public static final int WS=60;

	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public csLexer() {} 
	public csLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public csLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "/Users/jeremie/ANTLR/cs.g"; }

	// $ANTLR start "T__61"
	public final void mT__61() throws RecognitionException {
		try {
			int _type = T__61;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jeremie/ANTLR/cs.g:11:7: ( '!' )
			// /Users/jeremie/ANTLR/cs.g:11:9: '!'
			{
			match('!'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__61"

	// $ANTLR start "T__62"
	public final void mT__62() throws RecognitionException {
		try {
			int _type = T__62;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jeremie/ANTLR/cs.g:12:7: ( '!=' )
			// /Users/jeremie/ANTLR/cs.g:12:9: '!='
			{
			match("!="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__62"

	// $ANTLR start "T__63"
	public final void mT__63() throws RecognitionException {
		try {
			int _type = T__63;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jeremie/ANTLR/cs.g:13:7: ( '%' )
			// /Users/jeremie/ANTLR/cs.g:13:9: '%'
			{
			match('%'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__63"

	// $ANTLR start "T__64"
	public final void mT__64() throws RecognitionException {
		try {
			int _type = T__64;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jeremie/ANTLR/cs.g:14:7: ( '%=' )
			// /Users/jeremie/ANTLR/cs.g:14:9: '%='
			{
			match("%="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__64"

	// $ANTLR start "T__65"
	public final void mT__65() throws RecognitionException {
		try {
			int _type = T__65;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jeremie/ANTLR/cs.g:15:7: ( '&&' )
			// /Users/jeremie/ANTLR/cs.g:15:9: '&&'
			{
			match("&&"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__65"

	// $ANTLR start "T__66"
	public final void mT__66() throws RecognitionException {
		try {
			int _type = T__66;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jeremie/ANTLR/cs.g:16:7: ( '&' )
			// /Users/jeremie/ANTLR/cs.g:16:9: '&'
			{
			match('&'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__66"

	// $ANTLR start "T__67"
	public final void mT__67() throws RecognitionException {
		try {
			int _type = T__67;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jeremie/ANTLR/cs.g:17:7: ( '&=' )
			// /Users/jeremie/ANTLR/cs.g:17:9: '&='
			{
			match("&="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__67"

	// $ANTLR start "T__68"
	public final void mT__68() throws RecognitionException {
		try {
			int _type = T__68;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jeremie/ANTLR/cs.g:18:7: ( '(' )
			// /Users/jeremie/ANTLR/cs.g:18:9: '('
			{
			match('('); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__68"

	// $ANTLR start "T__69"
	public final void mT__69() throws RecognitionException {
		try {
			int _type = T__69;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jeremie/ANTLR/cs.g:19:7: ( '*' )
			// /Users/jeremie/ANTLR/cs.g:19:9: '*'
			{
			match('*'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__69"

	// $ANTLR start "T__70"
	public final void mT__70() throws RecognitionException {
		try {
			int _type = T__70;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jeremie/ANTLR/cs.g:20:7: ( '*=' )
			// /Users/jeremie/ANTLR/cs.g:20:9: '*='
			{
			match("*="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__70"

	// $ANTLR start "T__71"
	public final void mT__71() throws RecognitionException {
		try {
			int _type = T__71;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jeremie/ANTLR/cs.g:21:7: ( '+' )
			// /Users/jeremie/ANTLR/cs.g:21:9: '+'
			{
			match('+'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__71"

	// $ANTLR start "T__72"
	public final void mT__72() throws RecognitionException {
		try {
			int _type = T__72;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jeremie/ANTLR/cs.g:22:7: ( '++' )
			// /Users/jeremie/ANTLR/cs.g:22:9: '++'
			{
			match("++"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__72"

	// $ANTLR start "T__73"
	public final void mT__73() throws RecognitionException {
		try {
			int _type = T__73;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jeremie/ANTLR/cs.g:23:7: ( '+=' )
			// /Users/jeremie/ANTLR/cs.g:23:9: '+='
			{
			match("+="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__73"

	// $ANTLR start "T__74"
	public final void mT__74() throws RecognitionException {
		try {
			int _type = T__74;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jeremie/ANTLR/cs.g:24:7: ( ',' )
			// /Users/jeremie/ANTLR/cs.g:24:9: ','
			{
			match(','); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__74"

	// $ANTLR start "T__75"
	public final void mT__75() throws RecognitionException {
		try {
			int _type = T__75;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jeremie/ANTLR/cs.g:25:7: ( '--' )
			// /Users/jeremie/ANTLR/cs.g:25:9: '--'
			{
			match("--"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__75"

	// $ANTLR start "T__76"
	public final void mT__76() throws RecognitionException {
		try {
			int _type = T__76;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jeremie/ANTLR/cs.g:26:7: ( '-=' )
			// /Users/jeremie/ANTLR/cs.g:26:9: '-='
			{
			match("-="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__76"

	// $ANTLR start "T__77"
	public final void mT__77() throws RecognitionException {
		try {
			int _type = T__77;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jeremie/ANTLR/cs.g:27:7: ( '/' )
			// /Users/jeremie/ANTLR/cs.g:27:9: '/'
			{
			match('/'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__77"

	// $ANTLR start "T__78"
	public final void mT__78() throws RecognitionException {
		try {
			int _type = T__78;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jeremie/ANTLR/cs.g:28:7: ( '/=' )
			// /Users/jeremie/ANTLR/cs.g:28:9: '/='
			{
			match("/="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__78"

	// $ANTLR start "T__79"
	public final void mT__79() throws RecognitionException {
		try {
			int _type = T__79;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jeremie/ANTLR/cs.g:29:7: ( ':' )
			// /Users/jeremie/ANTLR/cs.g:29:9: ':'
			{
			match(':'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__79"

	// $ANTLR start "T__80"
	public final void mT__80() throws RecognitionException {
		try {
			int _type = T__80;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jeremie/ANTLR/cs.g:30:7: ( '::' )
			// /Users/jeremie/ANTLR/cs.g:30:9: '::'
			{
			match("::"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__80"

	// $ANTLR start "T__81"
	public final void mT__81() throws RecognitionException {
		try {
			int _type = T__81;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jeremie/ANTLR/cs.g:31:7: ( '<' )
			// /Users/jeremie/ANTLR/cs.g:31:9: '<'
			{
			match('<'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__81"

	// $ANTLR start "T__82"
	public final void mT__82() throws RecognitionException {
		try {
			int _type = T__82;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jeremie/ANTLR/cs.g:32:7: ( '<<' )
			// /Users/jeremie/ANTLR/cs.g:32:9: '<<'
			{
			match("<<"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__82"

	// $ANTLR start "T__83"
	public final void mT__83() throws RecognitionException {
		try {
			int _type = T__83;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jeremie/ANTLR/cs.g:33:7: ( '<<=' )
			// /Users/jeremie/ANTLR/cs.g:33:9: '<<='
			{
			match("<<="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__83"

	// $ANTLR start "T__84"
	public final void mT__84() throws RecognitionException {
		try {
			int _type = T__84;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jeremie/ANTLR/cs.g:34:7: ( '<=' )
			// /Users/jeremie/ANTLR/cs.g:34:9: '<='
			{
			match("<="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__84"

	// $ANTLR start "T__85"
	public final void mT__85() throws RecognitionException {
		try {
			int _type = T__85;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jeremie/ANTLR/cs.g:35:7: ( '=' )
			// /Users/jeremie/ANTLR/cs.g:35:9: '='
			{
			match('='); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__85"

	// $ANTLR start "T__86"
	public final void mT__86() throws RecognitionException {
		try {
			int _type = T__86;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jeremie/ANTLR/cs.g:36:7: ( '==' )
			// /Users/jeremie/ANTLR/cs.g:36:9: '=='
			{
			match("=="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__86"

	// $ANTLR start "T__87"
	public final void mT__87() throws RecognitionException {
		try {
			int _type = T__87;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jeremie/ANTLR/cs.g:37:7: ( '=>' )
			// /Users/jeremie/ANTLR/cs.g:37:9: '=>'
			{
			match("=>"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__87"

	// $ANTLR start "T__88"
	public final void mT__88() throws RecognitionException {
		try {
			int _type = T__88;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jeremie/ANTLR/cs.g:38:7: ( '>=' )
			// /Users/jeremie/ANTLR/cs.g:38:9: '>='
			{
			match(">="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__88"

	// $ANTLR start "T__89"
	public final void mT__89() throws RecognitionException {
		try {
			int _type = T__89;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jeremie/ANTLR/cs.g:39:7: ( '?' )
			// /Users/jeremie/ANTLR/cs.g:39:9: '?'
			{
			match('?'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__89"

	// $ANTLR start "T__90"
	public final void mT__90() throws RecognitionException {
		try {
			int _type = T__90;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jeremie/ANTLR/cs.g:40:7: ( '??' )
			// /Users/jeremie/ANTLR/cs.g:40:9: '??'
			{
			match("??"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__90"

	// $ANTLR start "T__91"
	public final void mT__91() throws RecognitionException {
		try {
			int _type = T__91;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jeremie/ANTLR/cs.g:41:7: ( '[' )
			// /Users/jeremie/ANTLR/cs.g:41:9: '['
			{
			match('['); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__91"

	// $ANTLR start "T__92"
	public final void mT__92() throws RecognitionException {
		try {
			int _type = T__92;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jeremie/ANTLR/cs.g:42:7: ( ']' )
			// /Users/jeremie/ANTLR/cs.g:42:9: ']'
			{
			match(']'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__92"

	// $ANTLR start "T__93"
	public final void mT__93() throws RecognitionException {
		try {
			int _type = T__93;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jeremie/ANTLR/cs.g:43:7: ( '^' )
			// /Users/jeremie/ANTLR/cs.g:43:9: '^'
			{
			match('^'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__93"

	// $ANTLR start "T__94"
	public final void mT__94() throws RecognitionException {
		try {
			int _type = T__94;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jeremie/ANTLR/cs.g:44:7: ( '^=' )
			// /Users/jeremie/ANTLR/cs.g:44:9: '^='
			{
			match("^="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__94"

	// $ANTLR start "T__95"
	public final void mT__95() throws RecognitionException {
		try {
			int _type = T__95;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jeremie/ANTLR/cs.g:45:7: ( '__arglist' )
			// /Users/jeremie/ANTLR/cs.g:45:9: '__arglist'
			{
			match("__arglist"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__95"

	// $ANTLR start "T__96"
	public final void mT__96() throws RecognitionException {
		try {
			int _type = T__96;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jeremie/ANTLR/cs.g:46:7: ( 'abstract' )
			// /Users/jeremie/ANTLR/cs.g:46:9: 'abstract'
			{
			match("abstract"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__96"

	// $ANTLR start "T__97"
	public final void mT__97() throws RecognitionException {
		try {
			int _type = T__97;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jeremie/ANTLR/cs.g:47:7: ( 'add' )
			// /Users/jeremie/ANTLR/cs.g:47:9: 'add'
			{
			match("add"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__97"

	// $ANTLR start "T__98"
	public final void mT__98() throws RecognitionException {
		try {
			int _type = T__98;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jeremie/ANTLR/cs.g:48:7: ( 'alias' )
			// /Users/jeremie/ANTLR/cs.g:48:9: 'alias'
			{
			match("alias"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__98"

	// $ANTLR start "T__99"
	public final void mT__99() throws RecognitionException {
		try {
			int _type = T__99;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jeremie/ANTLR/cs.g:49:7: ( 'as' )
			// /Users/jeremie/ANTLR/cs.g:49:9: 'as'
			{
			match("as"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__99"

	// $ANTLR start "T__100"
	public final void mT__100() throws RecognitionException {
		try {
			int _type = T__100;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jeremie/ANTLR/cs.g:50:8: ( 'ascending' )
			// /Users/jeremie/ANTLR/cs.g:50:10: 'ascending'
			{
			match("ascending"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__100"

	// $ANTLR start "T__101"
	public final void mT__101() throws RecognitionException {
		try {
			int _type = T__101;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jeremie/ANTLR/cs.g:51:8: ( 'assembly' )
			// /Users/jeremie/ANTLR/cs.g:51:10: 'assembly'
			{
			match("assembly"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__101"

	// $ANTLR start "T__102"
	public final void mT__102() throws RecognitionException {
		try {
			int _type = T__102;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jeremie/ANTLR/cs.g:52:8: ( 'base' )
			// /Users/jeremie/ANTLR/cs.g:52:10: 'base'
			{
			match("base"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__102"

	// $ANTLR start "T__103"
	public final void mT__103() throws RecognitionException {
		try {
			int _type = T__103;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jeremie/ANTLR/cs.g:53:8: ( 'bool' )
			// /Users/jeremie/ANTLR/cs.g:53:10: 'bool'
			{
			match("bool"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__103"

	// $ANTLR start "T__104"
	public final void mT__104() throws RecognitionException {
		try {
			int _type = T__104;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jeremie/ANTLR/cs.g:54:8: ( 'break' )
			// /Users/jeremie/ANTLR/cs.g:54:10: 'break'
			{
			match("break"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__104"

	// $ANTLR start "T__105"
	public final void mT__105() throws RecognitionException {
		try {
			int _type = T__105;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jeremie/ANTLR/cs.g:55:8: ( 'by' )
			// /Users/jeremie/ANTLR/cs.g:55:10: 'by'
			{
			match("by"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__105"

	// $ANTLR start "T__106"
	public final void mT__106() throws RecognitionException {
		try {
			int _type = T__106;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jeremie/ANTLR/cs.g:56:8: ( 'byte' )
			// /Users/jeremie/ANTLR/cs.g:56:10: 'byte'
			{
			match("byte"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__106"

	// $ANTLR start "T__107"
	public final void mT__107() throws RecognitionException {
		try {
			int _type = T__107;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jeremie/ANTLR/cs.g:57:8: ( 'case' )
			// /Users/jeremie/ANTLR/cs.g:57:10: 'case'
			{
			match("case"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__107"

	// $ANTLR start "T__108"
	public final void mT__108() throws RecognitionException {
		try {
			int _type = T__108;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jeremie/ANTLR/cs.g:58:8: ( 'catch' )
			// /Users/jeremie/ANTLR/cs.g:58:10: 'catch'
			{
			match("catch"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__108"

	// $ANTLR start "T__109"
	public final void mT__109() throws RecognitionException {
		try {
			int _type = T__109;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jeremie/ANTLR/cs.g:59:8: ( 'char' )
			// /Users/jeremie/ANTLR/cs.g:59:10: 'char'
			{
			match("char"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__109"

	// $ANTLR start "T__110"
	public final void mT__110() throws RecognitionException {
		try {
			int _type = T__110;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jeremie/ANTLR/cs.g:60:8: ( 'checked' )
			// /Users/jeremie/ANTLR/cs.g:60:10: 'checked'
			{
			match("checked"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__110"

	// $ANTLR start "T__111"
	public final void mT__111() throws RecognitionException {
		try {
			int _type = T__111;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jeremie/ANTLR/cs.g:61:8: ( 'class' )
			// /Users/jeremie/ANTLR/cs.g:61:10: 'class'
			{
			match("class"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__111"

	// $ANTLR start "T__112"
	public final void mT__112() throws RecognitionException {
		try {
			int _type = T__112;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jeremie/ANTLR/cs.g:62:8: ( 'const' )
			// /Users/jeremie/ANTLR/cs.g:62:10: 'const'
			{
			match("const"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__112"

	// $ANTLR start "T__113"
	public final void mT__113() throws RecognitionException {
		try {
			int _type = T__113;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jeremie/ANTLR/cs.g:63:8: ( 'continue' )
			// /Users/jeremie/ANTLR/cs.g:63:10: 'continue'
			{
			match("continue"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__113"

	// $ANTLR start "T__114"
	public final void mT__114() throws RecognitionException {
		try {
			int _type = T__114;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jeremie/ANTLR/cs.g:64:8: ( 'decimal' )
			// /Users/jeremie/ANTLR/cs.g:64:10: 'decimal'
			{
			match("decimal"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__114"

	// $ANTLR start "T__115"
	public final void mT__115() throws RecognitionException {
		try {
			int _type = T__115;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jeremie/ANTLR/cs.g:65:8: ( 'default' )
			// /Users/jeremie/ANTLR/cs.g:65:10: 'default'
			{
			match("default"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__115"

	// $ANTLR start "T__116"
	public final void mT__116() throws RecognitionException {
		try {
			int _type = T__116;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jeremie/ANTLR/cs.g:66:8: ( 'delegate' )
			// /Users/jeremie/ANTLR/cs.g:66:10: 'delegate'
			{
			match("delegate"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__116"

	// $ANTLR start "T__117"
	public final void mT__117() throws RecognitionException {
		try {
			int _type = T__117;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jeremie/ANTLR/cs.g:67:8: ( 'descending' )
			// /Users/jeremie/ANTLR/cs.g:67:10: 'descending'
			{
			match("descending"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__117"

	// $ANTLR start "T__118"
	public final void mT__118() throws RecognitionException {
		try {
			int _type = T__118;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jeremie/ANTLR/cs.g:68:8: ( 'do' )
			// /Users/jeremie/ANTLR/cs.g:68:10: 'do'
			{
			match("do"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__118"

	// $ANTLR start "T__119"
	public final void mT__119() throws RecognitionException {
		try {
			int _type = T__119;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jeremie/ANTLR/cs.g:69:8: ( 'double' )
			// /Users/jeremie/ANTLR/cs.g:69:10: 'double'
			{
			match("double"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__119"

	// $ANTLR start "T__120"
	public final void mT__120() throws RecognitionException {
		try {
			int _type = T__120;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jeremie/ANTLR/cs.g:70:8: ( 'dynamic' )
			// /Users/jeremie/ANTLR/cs.g:70:10: 'dynamic'
			{
			match("dynamic"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__120"

	// $ANTLR start "T__121"
	public final void mT__121() throws RecognitionException {
		try {
			int _type = T__121;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jeremie/ANTLR/cs.g:71:8: ( 'else' )
			// /Users/jeremie/ANTLR/cs.g:71:10: 'else'
			{
			match("else"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__121"

	// $ANTLR start "T__122"
	public final void mT__122() throws RecognitionException {
		try {
			int _type = T__122;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jeremie/ANTLR/cs.g:72:8: ( 'equals' )
			// /Users/jeremie/ANTLR/cs.g:72:10: 'equals'
			{
			match("equals"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__122"

	// $ANTLR start "T__123"
	public final void mT__123() throws RecognitionException {
		try {
			int _type = T__123;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jeremie/ANTLR/cs.g:73:8: ( 'event' )
			// /Users/jeremie/ANTLR/cs.g:73:10: 'event'
			{
			match("event"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__123"

	// $ANTLR start "T__124"
	public final void mT__124() throws RecognitionException {
		try {
			int _type = T__124;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jeremie/ANTLR/cs.g:74:8: ( 'explicit' )
			// /Users/jeremie/ANTLR/cs.g:74:10: 'explicit'
			{
			match("explicit"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__124"

	// $ANTLR start "T__125"
	public final void mT__125() throws RecognitionException {
		try {
			int _type = T__125;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jeremie/ANTLR/cs.g:75:8: ( 'extern' )
			// /Users/jeremie/ANTLR/cs.g:75:10: 'extern'
			{
			match("extern"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__125"

	// $ANTLR start "T__126"
	public final void mT__126() throws RecognitionException {
		try {
			int _type = T__126;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jeremie/ANTLR/cs.g:76:8: ( 'field' )
			// /Users/jeremie/ANTLR/cs.g:76:10: 'field'
			{
			match("field"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__126"

	// $ANTLR start "T__127"
	public final void mT__127() throws RecognitionException {
		try {
			int _type = T__127;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jeremie/ANTLR/cs.g:77:8: ( 'finally' )
			// /Users/jeremie/ANTLR/cs.g:77:10: 'finally'
			{
			match("finally"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__127"

	// $ANTLR start "T__128"
	public final void mT__128() throws RecognitionException {
		try {
			int _type = T__128;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jeremie/ANTLR/cs.g:78:8: ( 'fixed' )
			// /Users/jeremie/ANTLR/cs.g:78:10: 'fixed'
			{
			match("fixed"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__128"

	// $ANTLR start "T__129"
	public final void mT__129() throws RecognitionException {
		try {
			int _type = T__129;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jeremie/ANTLR/cs.g:79:8: ( 'float' )
			// /Users/jeremie/ANTLR/cs.g:79:10: 'float'
			{
			match("float"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__129"

	// $ANTLR start "T__130"
	public final void mT__130() throws RecognitionException {
		try {
			int _type = T__130;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jeremie/ANTLR/cs.g:80:8: ( 'for' )
			// /Users/jeremie/ANTLR/cs.g:80:10: 'for'
			{
			match("for"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__130"

	// $ANTLR start "T__131"
	public final void mT__131() throws RecognitionException {
		try {
			int _type = T__131;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jeremie/ANTLR/cs.g:81:8: ( 'foreach' )
			// /Users/jeremie/ANTLR/cs.g:81:10: 'foreach'
			{
			match("foreach"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__131"

	// $ANTLR start "T__132"
	public final void mT__132() throws RecognitionException {
		try {
			int _type = T__132;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jeremie/ANTLR/cs.g:82:8: ( 'from' )
			// /Users/jeremie/ANTLR/cs.g:82:10: 'from'
			{
			match("from"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__132"

	// $ANTLR start "T__133"
	public final void mT__133() throws RecognitionException {
		try {
			int _type = T__133;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jeremie/ANTLR/cs.g:83:8: ( 'get' )
			// /Users/jeremie/ANTLR/cs.g:83:10: 'get'
			{
			match("get"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__133"

	// $ANTLR start "T__134"
	public final void mT__134() throws RecognitionException {
		try {
			int _type = T__134;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jeremie/ANTLR/cs.g:84:8: ( 'goto' )
			// /Users/jeremie/ANTLR/cs.g:84:10: 'goto'
			{
			match("goto"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__134"

	// $ANTLR start "T__135"
	public final void mT__135() throws RecognitionException {
		try {
			int _type = T__135;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jeremie/ANTLR/cs.g:85:8: ( 'group' )
			// /Users/jeremie/ANTLR/cs.g:85:10: 'group'
			{
			match("group"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__135"

	// $ANTLR start "T__136"
	public final void mT__136() throws RecognitionException {
		try {
			int _type = T__136;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jeremie/ANTLR/cs.g:86:8: ( 'implicit' )
			// /Users/jeremie/ANTLR/cs.g:86:10: 'implicit'
			{
			match("implicit"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__136"

	// $ANTLR start "T__137"
	public final void mT__137() throws RecognitionException {
		try {
			int _type = T__137;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jeremie/ANTLR/cs.g:87:8: ( 'in' )
			// /Users/jeremie/ANTLR/cs.g:87:10: 'in'
			{
			match("in"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__137"

	// $ANTLR start "T__138"
	public final void mT__138() throws RecognitionException {
		try {
			int _type = T__138;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jeremie/ANTLR/cs.g:88:8: ( 'int' )
			// /Users/jeremie/ANTLR/cs.g:88:10: 'int'
			{
			match("int"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__138"

	// $ANTLR start "T__139"
	public final void mT__139() throws RecognitionException {
		try {
			int _type = T__139;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jeremie/ANTLR/cs.g:89:8: ( 'interface' )
			// /Users/jeremie/ANTLR/cs.g:89:10: 'interface'
			{
			match("interface"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__139"

	// $ANTLR start "T__140"
	public final void mT__140() throws RecognitionException {
		try {
			int _type = T__140;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jeremie/ANTLR/cs.g:90:8: ( 'internal' )
			// /Users/jeremie/ANTLR/cs.g:90:10: 'internal'
			{
			match("internal"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__140"

	// $ANTLR start "T__141"
	public final void mT__141() throws RecognitionException {
		try {
			int _type = T__141;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jeremie/ANTLR/cs.g:91:8: ( 'into' )
			// /Users/jeremie/ANTLR/cs.g:91:10: 'into'
			{
			match("into"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__141"

	// $ANTLR start "T__142"
	public final void mT__142() throws RecognitionException {
		try {
			int _type = T__142;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jeremie/ANTLR/cs.g:92:8: ( 'is' )
			// /Users/jeremie/ANTLR/cs.g:92:10: 'is'
			{
			match("is"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__142"

	// $ANTLR start "T__143"
	public final void mT__143() throws RecognitionException {
		try {
			int _type = T__143;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jeremie/ANTLR/cs.g:93:8: ( 'join' )
			// /Users/jeremie/ANTLR/cs.g:93:10: 'join'
			{
			match("join"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__143"

	// $ANTLR start "T__144"
	public final void mT__144() throws RecognitionException {
		try {
			int _type = T__144;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jeremie/ANTLR/cs.g:94:8: ( 'let' )
			// /Users/jeremie/ANTLR/cs.g:94:10: 'let'
			{
			match("let"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__144"

	// $ANTLR start "T__145"
	public final void mT__145() throws RecognitionException {
		try {
			int _type = T__145;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jeremie/ANTLR/cs.g:95:8: ( 'lock' )
			// /Users/jeremie/ANTLR/cs.g:95:10: 'lock'
			{
			match("lock"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__145"

	// $ANTLR start "T__146"
	public final void mT__146() throws RecognitionException {
		try {
			int _type = T__146;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jeremie/ANTLR/cs.g:96:8: ( 'long' )
			// /Users/jeremie/ANTLR/cs.g:96:10: 'long'
			{
			match("long"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__146"

	// $ANTLR start "T__147"
	public final void mT__147() throws RecognitionException {
		try {
			int _type = T__147;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jeremie/ANTLR/cs.g:97:8: ( 'method' )
			// /Users/jeremie/ANTLR/cs.g:97:10: 'method'
			{
			match("method"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__147"

	// $ANTLR start "T__148"
	public final void mT__148() throws RecognitionException {
		try {
			int _type = T__148;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jeremie/ANTLR/cs.g:98:8: ( 'module' )
			// /Users/jeremie/ANTLR/cs.g:98:10: 'module'
			{
			match("module"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__148"

	// $ANTLR start "T__149"
	public final void mT__149() throws RecognitionException {
		try {
			int _type = T__149;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jeremie/ANTLR/cs.g:99:8: ( 'namespace' )
			// /Users/jeremie/ANTLR/cs.g:99:10: 'namespace'
			{
			match("namespace"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__149"

	// $ANTLR start "T__150"
	public final void mT__150() throws RecognitionException {
		try {
			int _type = T__150;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jeremie/ANTLR/cs.g:100:8: ( 'new' )
			// /Users/jeremie/ANTLR/cs.g:100:10: 'new'
			{
			match("new"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__150"

	// $ANTLR start "T__151"
	public final void mT__151() throws RecognitionException {
		try {
			int _type = T__151;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jeremie/ANTLR/cs.g:101:8: ( 'object' )
			// /Users/jeremie/ANTLR/cs.g:101:10: 'object'
			{
			match("object"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__151"

	// $ANTLR start "T__152"
	public final void mT__152() throws RecognitionException {
		try {
			int _type = T__152;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jeremie/ANTLR/cs.g:102:8: ( 'on' )
			// /Users/jeremie/ANTLR/cs.g:102:10: 'on'
			{
			match("on"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__152"

	// $ANTLR start "T__153"
	public final void mT__153() throws RecognitionException {
		try {
			int _type = T__153;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jeremie/ANTLR/cs.g:103:8: ( 'operator' )
			// /Users/jeremie/ANTLR/cs.g:103:10: 'operator'
			{
			match("operator"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__153"

	// $ANTLR start "T__154"
	public final void mT__154() throws RecognitionException {
		try {
			int _type = T__154;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jeremie/ANTLR/cs.g:104:8: ( 'orderby' )
			// /Users/jeremie/ANTLR/cs.g:104:10: 'orderby'
			{
			match("orderby"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__154"

	// $ANTLR start "T__155"
	public final void mT__155() throws RecognitionException {
		try {
			int _type = T__155;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jeremie/ANTLR/cs.g:105:8: ( 'out' )
			// /Users/jeremie/ANTLR/cs.g:105:10: 'out'
			{
			match("out"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__155"

	// $ANTLR start "T__156"
	public final void mT__156() throws RecognitionException {
		try {
			int _type = T__156;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jeremie/ANTLR/cs.g:106:8: ( 'override' )
			// /Users/jeremie/ANTLR/cs.g:106:10: 'override'
			{
			match("override"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__156"

	// $ANTLR start "T__157"
	public final void mT__157() throws RecognitionException {
		try {
			int _type = T__157;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jeremie/ANTLR/cs.g:107:8: ( 'param' )
			// /Users/jeremie/ANTLR/cs.g:107:10: 'param'
			{
			match("param"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__157"

	// $ANTLR start "T__158"
	public final void mT__158() throws RecognitionException {
		try {
			int _type = T__158;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jeremie/ANTLR/cs.g:108:8: ( 'params' )
			// /Users/jeremie/ANTLR/cs.g:108:10: 'params'
			{
			match("params"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__158"

	// $ANTLR start "T__159"
	public final void mT__159() throws RecognitionException {
		try {
			int _type = T__159;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jeremie/ANTLR/cs.g:109:8: ( 'partial' )
			// /Users/jeremie/ANTLR/cs.g:109:10: 'partial'
			{
			match("partial"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__159"

	// $ANTLR start "T__160"
	public final void mT__160() throws RecognitionException {
		try {
			int _type = T__160;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jeremie/ANTLR/cs.g:110:8: ( 'pragma' )
			// /Users/jeremie/ANTLR/cs.g:110:10: 'pragma'
			{
			match("pragma"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__160"

	// $ANTLR start "T__161"
	public final void mT__161() throws RecognitionException {
		try {
			int _type = T__161;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jeremie/ANTLR/cs.g:111:8: ( 'private' )
			// /Users/jeremie/ANTLR/cs.g:111:10: 'private'
			{
			match("private"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__161"

	// $ANTLR start "T__162"
	public final void mT__162() throws RecognitionException {
		try {
			int _type = T__162;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jeremie/ANTLR/cs.g:112:8: ( 'property' )
			// /Users/jeremie/ANTLR/cs.g:112:10: 'property'
			{
			match("property"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__162"

	// $ANTLR start "T__163"
	public final void mT__163() throws RecognitionException {
		try {
			int _type = T__163;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jeremie/ANTLR/cs.g:113:8: ( 'protected' )
			// /Users/jeremie/ANTLR/cs.g:113:10: 'protected'
			{
			match("protected"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__163"

	// $ANTLR start "T__164"
	public final void mT__164() throws RecognitionException {
		try {
			int _type = T__164;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jeremie/ANTLR/cs.g:114:8: ( 'public' )
			// /Users/jeremie/ANTLR/cs.g:114:10: 'public'
			{
			match("public"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__164"

	// $ANTLR start "T__165"
	public final void mT__165() throws RecognitionException {
		try {
			int _type = T__165;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jeremie/ANTLR/cs.g:115:8: ( 'readonly' )
			// /Users/jeremie/ANTLR/cs.g:115:10: 'readonly'
			{
			match("readonly"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__165"

	// $ANTLR start "T__166"
	public final void mT__166() throws RecognitionException {
		try {
			int _type = T__166;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jeremie/ANTLR/cs.g:116:8: ( 'ref' )
			// /Users/jeremie/ANTLR/cs.g:116:10: 'ref'
			{
			match("ref"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__166"

	// $ANTLR start "T__167"
	public final void mT__167() throws RecognitionException {
		try {
			int _type = T__167;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jeremie/ANTLR/cs.g:117:8: ( 'remove' )
			// /Users/jeremie/ANTLR/cs.g:117:10: 'remove'
			{
			match("remove"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__167"

	// $ANTLR start "T__168"
	public final void mT__168() throws RecognitionException {
		try {
			int _type = T__168;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jeremie/ANTLR/cs.g:118:8: ( 'return' )
			// /Users/jeremie/ANTLR/cs.g:118:10: 'return'
			{
			match("return"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__168"

	// $ANTLR start "T__169"
	public final void mT__169() throws RecognitionException {
		try {
			int _type = T__169;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jeremie/ANTLR/cs.g:119:8: ( 'sbyte' )
			// /Users/jeremie/ANTLR/cs.g:119:10: 'sbyte'
			{
			match("sbyte"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__169"

	// $ANTLR start "T__170"
	public final void mT__170() throws RecognitionException {
		try {
			int _type = T__170;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jeremie/ANTLR/cs.g:120:8: ( 'sealed' )
			// /Users/jeremie/ANTLR/cs.g:120:10: 'sealed'
			{
			match("sealed"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__170"

	// $ANTLR start "T__171"
	public final void mT__171() throws RecognitionException {
		try {
			int _type = T__171;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jeremie/ANTLR/cs.g:121:8: ( 'select' )
			// /Users/jeremie/ANTLR/cs.g:121:10: 'select'
			{
			match("select"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__171"

	// $ANTLR start "T__172"
	public final void mT__172() throws RecognitionException {
		try {
			int _type = T__172;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jeremie/ANTLR/cs.g:122:8: ( 'set' )
			// /Users/jeremie/ANTLR/cs.g:122:10: 'set'
			{
			match("set"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__172"

	// $ANTLR start "T__173"
	public final void mT__173() throws RecognitionException {
		try {
			int _type = T__173;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jeremie/ANTLR/cs.g:123:8: ( 'short' )
			// /Users/jeremie/ANTLR/cs.g:123:10: 'short'
			{
			match("short"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__173"

	// $ANTLR start "T__174"
	public final void mT__174() throws RecognitionException {
		try {
			int _type = T__174;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jeremie/ANTLR/cs.g:124:8: ( 'sizeof' )
			// /Users/jeremie/ANTLR/cs.g:124:10: 'sizeof'
			{
			match("sizeof"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__174"

	// $ANTLR start "T__175"
	public final void mT__175() throws RecognitionException {
		try {
			int _type = T__175;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jeremie/ANTLR/cs.g:125:8: ( 'stackalloc' )
			// /Users/jeremie/ANTLR/cs.g:125:10: 'stackalloc'
			{
			match("stackalloc"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__175"

	// $ANTLR start "T__176"
	public final void mT__176() throws RecognitionException {
		try {
			int _type = T__176;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jeremie/ANTLR/cs.g:126:8: ( 'static' )
			// /Users/jeremie/ANTLR/cs.g:126:10: 'static'
			{
			match("static"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__176"

	// $ANTLR start "T__177"
	public final void mT__177() throws RecognitionException {
		try {
			int _type = T__177;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jeremie/ANTLR/cs.g:127:8: ( 'string' )
			// /Users/jeremie/ANTLR/cs.g:127:10: 'string'
			{
			match("string"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__177"

	// $ANTLR start "T__178"
	public final void mT__178() throws RecognitionException {
		try {
			int _type = T__178;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jeremie/ANTLR/cs.g:128:8: ( 'struct' )
			// /Users/jeremie/ANTLR/cs.g:128:10: 'struct'
			{
			match("struct"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__178"

	// $ANTLR start "T__179"
	public final void mT__179() throws RecognitionException {
		try {
			int _type = T__179;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jeremie/ANTLR/cs.g:129:8: ( 'switch' )
			// /Users/jeremie/ANTLR/cs.g:129:10: 'switch'
			{
			match("switch"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__179"

	// $ANTLR start "T__180"
	public final void mT__180() throws RecognitionException {
		try {
			int _type = T__180;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jeremie/ANTLR/cs.g:130:8: ( 'this' )
			// /Users/jeremie/ANTLR/cs.g:130:10: 'this'
			{
			match("this"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__180"

	// $ANTLR start "T__181"
	public final void mT__181() throws RecognitionException {
		try {
			int _type = T__181;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jeremie/ANTLR/cs.g:131:8: ( 'throw' )
			// /Users/jeremie/ANTLR/cs.g:131:10: 'throw'
			{
			match("throw"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__181"

	// $ANTLR start "T__182"
	public final void mT__182() throws RecognitionException {
		try {
			int _type = T__182;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jeremie/ANTLR/cs.g:132:8: ( 'try' )
			// /Users/jeremie/ANTLR/cs.g:132:10: 'try'
			{
			match("try"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__182"

	// $ANTLR start "T__183"
	public final void mT__183() throws RecognitionException {
		try {
			int _type = T__183;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jeremie/ANTLR/cs.g:133:8: ( 'type' )
			// /Users/jeremie/ANTLR/cs.g:133:10: 'type'
			{
			match("type"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__183"

	// $ANTLR start "T__184"
	public final void mT__184() throws RecognitionException {
		try {
			int _type = T__184;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jeremie/ANTLR/cs.g:134:8: ( 'typeof' )
			// /Users/jeremie/ANTLR/cs.g:134:10: 'typeof'
			{
			match("typeof"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__184"

	// $ANTLR start "T__185"
	public final void mT__185() throws RecognitionException {
		try {
			int _type = T__185;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jeremie/ANTLR/cs.g:135:8: ( 'uint' )
			// /Users/jeremie/ANTLR/cs.g:135:10: 'uint'
			{
			match("uint"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__185"

	// $ANTLR start "T__186"
	public final void mT__186() throws RecognitionException {
		try {
			int _type = T__186;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jeremie/ANTLR/cs.g:136:8: ( 'ulong' )
			// /Users/jeremie/ANTLR/cs.g:136:10: 'ulong'
			{
			match("ulong"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__186"

	// $ANTLR start "T__187"
	public final void mT__187() throws RecognitionException {
		try {
			int _type = T__187;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jeremie/ANTLR/cs.g:137:8: ( 'unchecked' )
			// /Users/jeremie/ANTLR/cs.g:137:10: 'unchecked'
			{
			match("unchecked"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__187"

	// $ANTLR start "T__188"
	public final void mT__188() throws RecognitionException {
		try {
			int _type = T__188;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jeremie/ANTLR/cs.g:138:8: ( 'unsafe' )
			// /Users/jeremie/ANTLR/cs.g:138:10: 'unsafe'
			{
			match("unsafe"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__188"

	// $ANTLR start "T__189"
	public final void mT__189() throws RecognitionException {
		try {
			int _type = T__189;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jeremie/ANTLR/cs.g:139:8: ( 'ushort' )
			// /Users/jeremie/ANTLR/cs.g:139:10: 'ushort'
			{
			match("ushort"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__189"

	// $ANTLR start "T__190"
	public final void mT__190() throws RecognitionException {
		try {
			int _type = T__190;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jeremie/ANTLR/cs.g:140:8: ( 'var' )
			// /Users/jeremie/ANTLR/cs.g:140:10: 'var'
			{
			match("var"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__190"

	// $ANTLR start "T__191"
	public final void mT__191() throws RecognitionException {
		try {
			int _type = T__191;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jeremie/ANTLR/cs.g:141:8: ( 'virtual' )
			// /Users/jeremie/ANTLR/cs.g:141:10: 'virtual'
			{
			match("virtual"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__191"

	// $ANTLR start "T__192"
	public final void mT__192() throws RecognitionException {
		try {
			int _type = T__192;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jeremie/ANTLR/cs.g:142:8: ( 'void' )
			// /Users/jeremie/ANTLR/cs.g:142:10: 'void'
			{
			match("void"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__192"

	// $ANTLR start "T__193"
	public final void mT__193() throws RecognitionException {
		try {
			int _type = T__193;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jeremie/ANTLR/cs.g:143:8: ( 'volatile' )
			// /Users/jeremie/ANTLR/cs.g:143:10: 'volatile'
			{
			match("volatile"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__193"

	// $ANTLR start "T__194"
	public final void mT__194() throws RecognitionException {
		try {
			int _type = T__194;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jeremie/ANTLR/cs.g:144:8: ( 'where' )
			// /Users/jeremie/ANTLR/cs.g:144:10: 'where'
			{
			match("where"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__194"

	// $ANTLR start "T__195"
	public final void mT__195() throws RecognitionException {
		try {
			int _type = T__195;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jeremie/ANTLR/cs.g:145:8: ( 'while' )
			// /Users/jeremie/ANTLR/cs.g:145:10: 'while'
			{
			match("while"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__195"

	// $ANTLR start "T__196"
	public final void mT__196() throws RecognitionException {
		try {
			int _type = T__196;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jeremie/ANTLR/cs.g:146:8: ( 'yield' )
			// /Users/jeremie/ANTLR/cs.g:146:10: 'yield'
			{
			match("yield"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__196"

	// $ANTLR start "T__197"
	public final void mT__197() throws RecognitionException {
		try {
			int _type = T__197;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jeremie/ANTLR/cs.g:147:8: ( '{' )
			// /Users/jeremie/ANTLR/cs.g:147:10: '{'
			{
			match('{'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__197"

	// $ANTLR start "T__198"
	public final void mT__198() throws RecognitionException {
		try {
			int _type = T__198;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jeremie/ANTLR/cs.g:148:8: ( '|' )
			// /Users/jeremie/ANTLR/cs.g:148:10: '|'
			{
			match('|'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__198"

	// $ANTLR start "T__199"
	public final void mT__199() throws RecognitionException {
		try {
			int _type = T__199;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jeremie/ANTLR/cs.g:149:8: ( '|=' )
			// /Users/jeremie/ANTLR/cs.g:149:10: '|='
			{
			match("|="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__199"

	// $ANTLR start "T__200"
	public final void mT__200() throws RecognitionException {
		try {
			int _type = T__200;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jeremie/ANTLR/cs.g:150:8: ( '||' )
			// /Users/jeremie/ANTLR/cs.g:150:10: '||'
			{
			match("||"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__200"

	// $ANTLR start "T__201"
	public final void mT__201() throws RecognitionException {
		try {
			int _type = T__201;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jeremie/ANTLR/cs.g:151:8: ( '}' )
			// /Users/jeremie/ANTLR/cs.g:151:10: '}'
			{
			match('}'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__201"

	// $ANTLR start "T__202"
	public final void mT__202() throws RecognitionException {
		try {
			int _type = T__202;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jeremie/ANTLR/cs.g:152:8: ( '~' )
			// /Users/jeremie/ANTLR/cs.g:152:10: '~'
			{
			match('~'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__202"

	// $ANTLR start "TRUE"
	public final void mTRUE() throws RecognitionException {
		try {
			int _type = TRUE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jeremie/ANTLR/cs.g:1070:6: ( 'true' )
			// /Users/jeremie/ANTLR/cs.g:1070:8: 'true'
			{
			match("true"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TRUE"

	// $ANTLR start "FALSE"
	public final void mFALSE() throws RecognitionException {
		try {
			int _type = FALSE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jeremie/ANTLR/cs.g:1071:6: ( 'false' )
			// /Users/jeremie/ANTLR/cs.g:1071:8: 'false'
			{
			match("false"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FALSE"

	// $ANTLR start "NULL"
	public final void mNULL() throws RecognitionException {
		try {
			int _type = NULL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jeremie/ANTLR/cs.g:1072:6: ( 'null' )
			// /Users/jeremie/ANTLR/cs.g:1072:8: 'null'
			{
			match("null"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NULL"

	// $ANTLR start "DOT"
	public final void mDOT() throws RecognitionException {
		try {
			int _type = DOT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jeremie/ANTLR/cs.g:1073:5: ( '.' )
			// /Users/jeremie/ANTLR/cs.g:1073:7: '.'
			{
			match('.'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DOT"

	// $ANTLR start "PTR"
	public final void mPTR() throws RecognitionException {
		try {
			int _type = PTR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jeremie/ANTLR/cs.g:1074:5: ( '->' )
			// /Users/jeremie/ANTLR/cs.g:1074:7: '->'
			{
			match("->"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PTR"

	// $ANTLR start "MINUS"
	public final void mMINUS() throws RecognitionException {
		try {
			int _type = MINUS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jeremie/ANTLR/cs.g:1075:7: ( '-' )
			// /Users/jeremie/ANTLR/cs.g:1075:9: '-'
			{
			match('-'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MINUS"

	// $ANTLR start "GT"
	public final void mGT() throws RecognitionException {
		try {
			int _type = GT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jeremie/ANTLR/cs.g:1076:4: ( '>' )
			// /Users/jeremie/ANTLR/cs.g:1076:6: '>'
			{
			match('>'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "GT"

	// $ANTLR start "USING"
	public final void mUSING() throws RecognitionException {
		try {
			int _type = USING;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jeremie/ANTLR/cs.g:1077:7: ( 'using' )
			// /Users/jeremie/ANTLR/cs.g:1077:9: 'using'
			{
			match("using"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "USING"

	// $ANTLR start "ENUM"
	public final void mENUM() throws RecognitionException {
		try {
			int _type = ENUM;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jeremie/ANTLR/cs.g:1078:6: ( 'enum' )
			// /Users/jeremie/ANTLR/cs.g:1078:8: 'enum'
			{
			match("enum"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ENUM"

	// $ANTLR start "IF"
	public final void mIF() throws RecognitionException {
		try {
			int _type = IF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jeremie/ANTLR/cs.g:1079:3: ( 'if' )
			// /Users/jeremie/ANTLR/cs.g:1079:5: 'if'
			{
			match("if"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "IF"

	// $ANTLR start "ELIF"
	public final void mELIF() throws RecognitionException {
		try {
			int _type = ELIF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jeremie/ANTLR/cs.g:1080:5: ( 'elif' )
			// /Users/jeremie/ANTLR/cs.g:1080:7: 'elif'
			{
			match("elif"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ELIF"

	// $ANTLR start "ENDIF"
	public final void mENDIF() throws RecognitionException {
		try {
			int _type = ENDIF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jeremie/ANTLR/cs.g:1081:6: ( 'endif' )
			// /Users/jeremie/ANTLR/cs.g:1081:8: 'endif'
			{
			match("endif"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ENDIF"

	// $ANTLR start "DEFINE"
	public final void mDEFINE() throws RecognitionException {
		try {
			int _type = DEFINE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jeremie/ANTLR/cs.g:1082:7: ( 'define' )
			// /Users/jeremie/ANTLR/cs.g:1082:9: 'define'
			{
			match("define"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DEFINE"

	// $ANTLR start "UNDEF"
	public final void mUNDEF() throws RecognitionException {
		try {
			int _type = UNDEF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jeremie/ANTLR/cs.g:1083:6: ( 'undef' )
			// /Users/jeremie/ANTLR/cs.g:1083:8: 'undef'
			{
			match("undef"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "UNDEF"

	// $ANTLR start "SEMI"
	public final void mSEMI() throws RecognitionException {
		try {
			int _type = SEMI;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jeremie/ANTLR/cs.g:1084:5: ( ';' )
			// /Users/jeremie/ANTLR/cs.g:1084:7: ';'
			{
			match(';'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SEMI"

	// $ANTLR start "RPAREN"
	public final void mRPAREN() throws RecognitionException {
		try {
			int _type = RPAREN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jeremie/ANTLR/cs.g:1085:7: ( ')' )
			// /Users/jeremie/ANTLR/cs.g:1085:9: ')'
			{
			match(')'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RPAREN"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jeremie/ANTLR/cs.g:1087:3: ( ( ' ' | '\\r' | '\\t' | '\\n' ) )
			// /Users/jeremie/ANTLR/cs.g:1088:5: ( ' ' | '\\r' | '\\t' | '\\n' )
			{
			if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			 skip(); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	// $ANTLR start "TS"
	public final void mTS() throws RecognitionException {
		try {
			// /Users/jeremie/ANTLR/cs.g:1092:3: ( ( ' ' | '\\t' ) )
			// /Users/jeremie/ANTLR/cs.g:1093:5: ( ' ' | '\\t' )
			{
			if ( input.LA(1)=='\t'||input.LA(1)==' ' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			 skip(); 
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TS"

	// $ANTLR start "DOC_LINE_COMMENT"
	public final void mDOC_LINE_COMMENT() throws RecognitionException {
		try {
			int _type = DOC_LINE_COMMENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jeremie/ANTLR/cs.g:1095:5: ( ( '///' (~ ( '\\n' | '\\r' ) )* ( '\\r' | '\\n' )+ ) )
			// /Users/jeremie/ANTLR/cs.g:1095:8: ( '///' (~ ( '\\n' | '\\r' ) )* ( '\\r' | '\\n' )+ )
			{
			// /Users/jeremie/ANTLR/cs.g:1095:8: ( '///' (~ ( '\\n' | '\\r' ) )* ( '\\r' | '\\n' )+ )
			// /Users/jeremie/ANTLR/cs.g:1095:9: '///' (~ ( '\\n' | '\\r' ) )* ( '\\r' | '\\n' )+
			{
			match("///"); 

			// /Users/jeremie/ANTLR/cs.g:1095:15: (~ ( '\\n' | '\\r' ) )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= '\u0000' && LA1_0 <= '\t')||(LA1_0 >= '\u000B' && LA1_0 <= '\f')||(LA1_0 >= '\u000E' && LA1_0 <= '\uFFFF')) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// /Users/jeremie/ANTLR/cs.g:
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop1;
				}
			}

			// /Users/jeremie/ANTLR/cs.g:1095:30: ( '\\r' | '\\n' )+
			int cnt2=0;
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( (LA2_0=='\n'||LA2_0=='\r') ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// /Users/jeremie/ANTLR/cs.g:
					{
					if ( input.LA(1)=='\n'||input.LA(1)=='\r' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt2 >= 1 ) break loop2;
					EarlyExitException eee = new EarlyExitException(2, input);
					throw eee;
				}
				cnt2++;
			}

			}

			 skip(); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DOC_LINE_COMMENT"

	// $ANTLR start "LINE_COMMENT"
	public final void mLINE_COMMENT() throws RecognitionException {
		try {
			int _type = LINE_COMMENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jeremie/ANTLR/cs.g:1098:5: ( ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' | '\\n' )+ ) )
			// /Users/jeremie/ANTLR/cs.g:1098:7: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' | '\\n' )+ )
			{
			// /Users/jeremie/ANTLR/cs.g:1098:7: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' | '\\n' )+ )
			// /Users/jeremie/ANTLR/cs.g:1098:8: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' | '\\n' )+
			{
			match("//"); 

			// /Users/jeremie/ANTLR/cs.g:1098:13: (~ ( '\\n' | '\\r' ) )*
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( ((LA3_0 >= '\u0000' && LA3_0 <= '\t')||(LA3_0 >= '\u000B' && LA3_0 <= '\f')||(LA3_0 >= '\u000E' && LA3_0 <= '\uFFFF')) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// /Users/jeremie/ANTLR/cs.g:
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop3;
				}
			}

			// /Users/jeremie/ANTLR/cs.g:1098:28: ( '\\r' | '\\n' )+
			int cnt4=0;
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( (LA4_0=='\n'||LA4_0=='\r') ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// /Users/jeremie/ANTLR/cs.g:
					{
					if ( input.LA(1)=='\n'||input.LA(1)=='\r' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt4 >= 1 ) break loop4;
					EarlyExitException eee = new EarlyExitException(4, input);
					throw eee;
				}
				cnt4++;
			}

			}

			 skip(); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LINE_COMMENT"

	// $ANTLR start "COMMENT"
	public final void mCOMMENT() throws RecognitionException {
		try {
			int _type = COMMENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jeremie/ANTLR/cs.g:1100:8: ( '/*' ( options {greedy=false; } : . )* '*/' )
			// /Users/jeremie/ANTLR/cs.g:1101:4: '/*' ( options {greedy=false; } : . )* '*/'
			{
			match("/*"); 

			// /Users/jeremie/ANTLR/cs.g:1102:4: ( options {greedy=false; } : . )*
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( (LA5_0=='*') ) {
					int LA5_1 = input.LA(2);
					if ( (LA5_1=='/') ) {
						alt5=2;
					}
					else if ( ((LA5_1 >= '\u0000' && LA5_1 <= '.')||(LA5_1 >= '0' && LA5_1 <= '\uFFFF')) ) {
						alt5=1;
					}

				}
				else if ( ((LA5_0 >= '\u0000' && LA5_0 <= ')')||(LA5_0 >= '+' && LA5_0 <= '\uFFFF')) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// /Users/jeremie/ANTLR/cs.g:1102:31: .
					{
					matchAny(); 
					}
					break;

				default :
					break loop5;
				}
			}

			match("*/"); 

			 skip(); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMMENT"

	// $ANTLR start "STRINGLITERAL"
	public final void mSTRINGLITERAL() throws RecognitionException {
		try {
			int _type = STRINGLITERAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jeremie/ANTLR/cs.g:1106:2: ( '\"' ( EscapeSequence |~ ( '\"' | '\\\\' ) )* '\"' )
			// /Users/jeremie/ANTLR/cs.g:1107:2: '\"' ( EscapeSequence |~ ( '\"' | '\\\\' ) )* '\"'
			{
			match('\"'); 
			// /Users/jeremie/ANTLR/cs.g:1107:6: ( EscapeSequence |~ ( '\"' | '\\\\' ) )*
			loop6:
			while (true) {
				int alt6=3;
				int LA6_0 = input.LA(1);
				if ( (LA6_0=='\\') ) {
					alt6=1;
				}
				else if ( ((LA6_0 >= '\u0000' && LA6_0 <= '!')||(LA6_0 >= '#' && LA6_0 <= '[')||(LA6_0 >= ']' && LA6_0 <= '\uFFFF')) ) {
					alt6=2;
				}

				switch (alt6) {
				case 1 :
					// /Users/jeremie/ANTLR/cs.g:1107:7: EscapeSequence
					{
					mEscapeSequence(); 

					}
					break;
				case 2 :
					// /Users/jeremie/ANTLR/cs.g:1107:24: ~ ( '\"' | '\\\\' )
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop6;
				}
			}

			match('\"'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STRINGLITERAL"

	// $ANTLR start "Verbatim_string_literal"
	public final void mVerbatim_string_literal() throws RecognitionException {
		try {
			int _type = Verbatim_string_literal;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jeremie/ANTLR/cs.g:1108:24: ( '@' '\"' ( Verbatim_string_literal_character )* '\"' )
			// /Users/jeremie/ANTLR/cs.g:1109:2: '@' '\"' ( Verbatim_string_literal_character )* '\"'
			{
			match('@'); 
			match('\"'); 
			// /Users/jeremie/ANTLR/cs.g:1109:12: ( Verbatim_string_literal_character )*
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( (LA7_0=='\"') ) {
					int LA7_1 = input.LA(2);
					if ( (LA7_1=='\"') ) {
						alt7=1;
					}

				}
				else if ( ((LA7_0 >= '\u0000' && LA7_0 <= '!')||(LA7_0 >= '#' && LA7_0 <= '\uFFFF')) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// /Users/jeremie/ANTLR/cs.g:1109:12: Verbatim_string_literal_character
					{
					mVerbatim_string_literal_character(); 

					}
					break;

				default :
					break loop7;
				}
			}

			match('\"'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Verbatim_string_literal"

	// $ANTLR start "Verbatim_string_literal_character"
	public final void mVerbatim_string_literal_character() throws RecognitionException {
		try {
			// /Users/jeremie/ANTLR/cs.g:1112:34: ( '\"' '\"' |~ ( '\"' ) )
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0=='\"') ) {
				alt8=1;
			}
			else if ( ((LA8_0 >= '\u0000' && LA8_0 <= '!')||(LA8_0 >= '#' && LA8_0 <= '\uFFFF')) ) {
				alt8=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 8, 0, input);
				throw nvae;
			}

			switch (alt8) {
				case 1 :
					// /Users/jeremie/ANTLR/cs.g:1113:2: '\"' '\"'
					{
					match('\"'); 
					match('\"'); 
					}
					break;
				case 2 :
					// /Users/jeremie/ANTLR/cs.g:1113:12: ~ ( '\"' )
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '\uFFFF') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

			}
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Verbatim_string_literal_character"

	// $ANTLR start "NUMBER"
	public final void mNUMBER() throws RecognitionException {
		try {
			int _type = NUMBER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jeremie/ANTLR/cs.g:1113:7: ( Decimal_digits ( INTEGER_TYPE_SUFFIX )? )
			// /Users/jeremie/ANTLR/cs.g:1114:2: Decimal_digits ( INTEGER_TYPE_SUFFIX )?
			{
			mDecimal_digits(); 

			// /Users/jeremie/ANTLR/cs.g:1114:17: ( INTEGER_TYPE_SUFFIX )?
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0=='L'||LA9_0=='U'||LA9_0=='l'||LA9_0=='u') ) {
				alt9=1;
			}
			switch (alt9) {
				case 1 :
					// /Users/jeremie/ANTLR/cs.g:1114:17: INTEGER_TYPE_SUFFIX
					{
					mINTEGER_TYPE_SUFFIX(); 

					}
					break;

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NUMBER"

	// $ANTLR start "GooBall"
	public final void mGooBall() throws RecognitionException {
		try {
			int _type = GooBall;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			CommonToken dil=null;
			CommonToken s=null;
			int d;

			// /Users/jeremie/ANTLR/cs.g:1117:2: (dil= Decimal_integer_literal d= '.' s= GooBallIdentifier )
			// /Users/jeremie/ANTLR/cs.g:1118:2: dil= Decimal_integer_literal d= '.' s= GooBallIdentifier
			{
			int dilStart1543 = getCharIndex();
			int dilStartLine1543 = getLine();
			int dilStartCharPos1543 = getCharPositionInLine();
			mDecimal_integer_literal(); 
			dil = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, dilStart1543, getCharIndex()-1);
			dil.setLine(dilStartLine1543);
			dil.setCharPositionInLine(dilStartCharPos1543);

			d = input.LA(1);
			match('.'); 
			int sStart1553 = getCharIndex();
			int sStartLine1553 = getLine();
			int sStartCharPos1553 = getCharPositionInLine();
			mGooBallIdentifier(); 
			s = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, sStart1553, getCharIndex()-1);
			s.setLine(sStartLine1553);
			s.setCharPositionInLine(sStartCharPos1553);

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "GooBall"

	// $ANTLR start "GooBallIdentifier"
	public final void mGooBallIdentifier() throws RecognitionException {
		try {
			// /Users/jeremie/ANTLR/cs.g:1122:2: ( IdentifierStart ( IdentifierPart )* )
			// /Users/jeremie/ANTLR/cs.g:1122:4: IdentifierStart ( IdentifierPart )*
			{
			mIdentifierStart(); 

			// /Users/jeremie/ANTLR/cs.g:1122:20: ( IdentifierPart )*
			loop10:
			while (true) {
				int alt10=2;
				int LA10_0 = input.LA(1);
				if ( ((LA10_0 >= '0' && LA10_0 <= '9')||(LA10_0 >= 'A' && LA10_0 <= 'Z')||LA10_0=='_'||(LA10_0 >= 'a' && LA10_0 <= 'z')) ) {
					alt10=1;
				}

				switch (alt10) {
				case 1 :
					// /Users/jeremie/ANTLR/cs.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop10;
				}
			}

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "GooBallIdentifier"

	// $ANTLR start "Real_literal"
	public final void mReal_literal() throws RecognitionException {
		try {
			int _type = Real_literal;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jeremie/ANTLR/cs.g:1125:13: ( Decimal_digits '.' Decimal_digits ( Exponent_part )? ( Real_type_suffix )? | '.' Decimal_digits ( Exponent_part )? ( Real_type_suffix )? | Decimal_digits Exponent_part ( Real_type_suffix )? | Decimal_digits Real_type_suffix )
			int alt16=4;
			alt16 = dfa16.predict(input);
			switch (alt16) {
				case 1 :
					// /Users/jeremie/ANTLR/cs.g:1126:2: Decimal_digits '.' Decimal_digits ( Exponent_part )? ( Real_type_suffix )?
					{
					mDecimal_digits(); 

					match('.'); 
					mDecimal_digits(); 

					// /Users/jeremie/ANTLR/cs.g:1126:42: ( Exponent_part )?
					int alt11=2;
					int LA11_0 = input.LA(1);
					if ( (LA11_0=='E'||LA11_0=='e') ) {
						alt11=1;
					}
					switch (alt11) {
						case 1 :
							// /Users/jeremie/ANTLR/cs.g:1126:42: Exponent_part
							{
							mExponent_part(); 

							}
							break;

					}

					// /Users/jeremie/ANTLR/cs.g:1126:59: ( Real_type_suffix )?
					int alt12=2;
					int LA12_0 = input.LA(1);
					if ( (LA12_0=='D'||LA12_0=='F'||LA12_0=='M'||LA12_0=='d'||LA12_0=='f'||LA12_0=='m') ) {
						alt12=1;
					}
					switch (alt12) {
						case 1 :
							// /Users/jeremie/ANTLR/cs.g:
							{
							if ( input.LA(1)=='D'||input.LA(1)=='F'||input.LA(1)=='M'||input.LA(1)=='d'||input.LA(1)=='f'||input.LA(1)=='m' ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

					}

					}
					break;
				case 2 :
					// /Users/jeremie/ANTLR/cs.g:1127:4: '.' Decimal_digits ( Exponent_part )? ( Real_type_suffix )?
					{
					match('.'); 
					mDecimal_digits(); 

					// /Users/jeremie/ANTLR/cs.g:1127:27: ( Exponent_part )?
					int alt13=2;
					int LA13_0 = input.LA(1);
					if ( (LA13_0=='E'||LA13_0=='e') ) {
						alt13=1;
					}
					switch (alt13) {
						case 1 :
							// /Users/jeremie/ANTLR/cs.g:1127:27: Exponent_part
							{
							mExponent_part(); 

							}
							break;

					}

					// /Users/jeremie/ANTLR/cs.g:1127:44: ( Real_type_suffix )?
					int alt14=2;
					int LA14_0 = input.LA(1);
					if ( (LA14_0=='D'||LA14_0=='F'||LA14_0=='M'||LA14_0=='d'||LA14_0=='f'||LA14_0=='m') ) {
						alt14=1;
					}
					switch (alt14) {
						case 1 :
							// /Users/jeremie/ANTLR/cs.g:
							{
							if ( input.LA(1)=='D'||input.LA(1)=='F'||input.LA(1)=='M'||input.LA(1)=='d'||input.LA(1)=='f'||input.LA(1)=='m' ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

					}

					}
					break;
				case 3 :
					// /Users/jeremie/ANTLR/cs.g:1128:4: Decimal_digits Exponent_part ( Real_type_suffix )?
					{
					mDecimal_digits(); 

					mExponent_part(); 

					// /Users/jeremie/ANTLR/cs.g:1128:37: ( Real_type_suffix )?
					int alt15=2;
					int LA15_0 = input.LA(1);
					if ( (LA15_0=='D'||LA15_0=='F'||LA15_0=='M'||LA15_0=='d'||LA15_0=='f'||LA15_0=='m') ) {
						alt15=1;
					}
					switch (alt15) {
						case 1 :
							// /Users/jeremie/ANTLR/cs.g:
							{
							if ( input.LA(1)=='D'||input.LA(1)=='F'||input.LA(1)=='M'||input.LA(1)=='d'||input.LA(1)=='f'||input.LA(1)=='m' ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

					}

					}
					break;
				case 4 :
					// /Users/jeremie/ANTLR/cs.g:1129:4: Decimal_digits Real_type_suffix
					{
					mDecimal_digits(); 

					mReal_type_suffix(); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Real_literal"

	// $ANTLR start "Character_literal"
	public final void mCharacter_literal() throws RecognitionException {
		try {
			int _type = Character_literal;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jeremie/ANTLR/cs.g:1130:18: ( '\\'' ( EscapeSequence |~ ( '\\\\' | '\\'' | '\\r' | '\\n' ) |~ ( '\\\\' | '\\'' | '\\r' | '\\n' ) ~ ( '\\\\' | '\\'' | '\\r' | '\\n' ) |~ ( '\\\\' | '\\'' | '\\r' | '\\n' ) ~ ( '\\\\' | '\\'' | '\\r' | '\\n' ) ~ ( '\\\\' | '\\'' | '\\r' | '\\n' ) ) '\\'' )
			// /Users/jeremie/ANTLR/cs.g:1131:2: '\\'' ( EscapeSequence |~ ( '\\\\' | '\\'' | '\\r' | '\\n' ) |~ ( '\\\\' | '\\'' | '\\r' | '\\n' ) ~ ( '\\\\' | '\\'' | '\\r' | '\\n' ) |~ ( '\\\\' | '\\'' | '\\r' | '\\n' ) ~ ( '\\\\' | '\\'' | '\\r' | '\\n' ) ~ ( '\\\\' | '\\'' | '\\r' | '\\n' ) ) '\\''
			{
			match('\''); 
			// /Users/jeremie/ANTLR/cs.g:1132:5: ( EscapeSequence |~ ( '\\\\' | '\\'' | '\\r' | '\\n' ) |~ ( '\\\\' | '\\'' | '\\r' | '\\n' ) ~ ( '\\\\' | '\\'' | '\\r' | '\\n' ) |~ ( '\\\\' | '\\'' | '\\r' | '\\n' ) ~ ( '\\\\' | '\\'' | '\\r' | '\\n' ) ~ ( '\\\\' | '\\'' | '\\r' | '\\n' ) )
			int alt17=4;
			int LA17_0 = input.LA(1);
			if ( (LA17_0=='\\') ) {
				alt17=1;
			}
			else if ( ((LA17_0 >= '\u0000' && LA17_0 <= '\t')||(LA17_0 >= '\u000B' && LA17_0 <= '\f')||(LA17_0 >= '\u000E' && LA17_0 <= '&')||(LA17_0 >= '(' && LA17_0 <= '[')||(LA17_0 >= ']' && LA17_0 <= '\uFFFF')) ) {
				int LA17_2 = input.LA(2);
				if ( ((LA17_2 >= '\u0000' && LA17_2 <= '\t')||(LA17_2 >= '\u000B' && LA17_2 <= '\f')||(LA17_2 >= '\u000E' && LA17_2 <= '&')||(LA17_2 >= '(' && LA17_2 <= '[')||(LA17_2 >= ']' && LA17_2 <= '\uFFFF')) ) {
					int LA17_3 = input.LA(3);
					if ( ((LA17_3 >= '\u0000' && LA17_3 <= '\t')||(LA17_3 >= '\u000B' && LA17_3 <= '\f')||(LA17_3 >= '\u000E' && LA17_3 <= '&')||(LA17_3 >= '(' && LA17_3 <= '[')||(LA17_3 >= ']' && LA17_3 <= '\uFFFF')) ) {
						alt17=4;
					}
					else if ( (LA17_3=='\'') ) {
						alt17=3;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 17, 3, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}
				else if ( (LA17_2=='\'') ) {
					alt17=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 17, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 17, 0, input);
				throw nvae;
			}

			switch (alt17) {
				case 1 :
					// /Users/jeremie/ANTLR/cs.g:1132:9: EscapeSequence
					{
					mEscapeSequence(); 

					}
					break;
				case 2 :
					// /Users/jeremie/ANTLR/cs.g:1134:9: ~ ( '\\\\' | '\\'' | '\\r' | '\\n' )
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '&')||(input.LA(1) >= '(' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;
				case 3 :
					// /Users/jeremie/ANTLR/cs.g:1135:9: ~ ( '\\\\' | '\\'' | '\\r' | '\\n' ) ~ ( '\\\\' | '\\'' | '\\r' | '\\n' )
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '&')||(input.LA(1) >= '(' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '&')||(input.LA(1) >= '(' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;
				case 4 :
					// /Users/jeremie/ANTLR/cs.g:1136:9: ~ ( '\\\\' | '\\'' | '\\r' | '\\n' ) ~ ( '\\\\' | '\\'' | '\\r' | '\\n' ) ~ ( '\\\\' | '\\'' | '\\r' | '\\n' )
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '&')||(input.LA(1) >= '(' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '&')||(input.LA(1) >= '(' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '&')||(input.LA(1) >= '(' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

			}

			match('\''); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Character_literal"

	// $ANTLR start "IDENTIFIER"
	public final void mIDENTIFIER() throws RecognitionException {
		try {
			int _type = IDENTIFIER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jeremie/ANTLR/cs.g:1139:11: ( IdentifierStart ( IdentifierPart )* )
			// /Users/jeremie/ANTLR/cs.g:1140:5: IdentifierStart ( IdentifierPart )*
			{
			mIdentifierStart(); 

			// /Users/jeremie/ANTLR/cs.g:1140:21: ( IdentifierPart )*
			loop18:
			while (true) {
				int alt18=2;
				int LA18_0 = input.LA(1);
				if ( ((LA18_0 >= '0' && LA18_0 <= '9')||(LA18_0 >= 'A' && LA18_0 <= 'Z')||LA18_0=='_'||(LA18_0 >= 'a' && LA18_0 <= 'z')) ) {
					alt18=1;
				}

				switch (alt18) {
				case 1 :
					// /Users/jeremie/ANTLR/cs.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop18;
				}
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "IDENTIFIER"

	// $ANTLR start "Pragma"
	public final void mPragma() throws RecognitionException {
		try {
			int _type = Pragma;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jeremie/ANTLR/cs.g:1141:7: ( '#' ( 'pragma' | 'region' | 'endregion' | 'line' | 'warning' | 'error' ) (~ ( '\\n' | '\\r' ) )* ( '\\r' | '\\n' )+ )
			// /Users/jeremie/ANTLR/cs.g:1143:2: '#' ( 'pragma' | 'region' | 'endregion' | 'line' | 'warning' | 'error' ) (~ ( '\\n' | '\\r' ) )* ( '\\r' | '\\n' )+
			{
			match('#'); 
			// /Users/jeremie/ANTLR/cs.g:1143:6: ( 'pragma' | 'region' | 'endregion' | 'line' | 'warning' | 'error' )
			int alt19=6;
			switch ( input.LA(1) ) {
			case 'p':
				{
				alt19=1;
				}
				break;
			case 'r':
				{
				alt19=2;
				}
				break;
			case 'e':
				{
				int LA19_3 = input.LA(2);
				if ( (LA19_3=='n') ) {
					alt19=3;
				}
				else if ( (LA19_3=='r') ) {
					alt19=6;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 19, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 'l':
				{
				alt19=4;
				}
				break;
			case 'w':
				{
				alt19=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 19, 0, input);
				throw nvae;
			}
			switch (alt19) {
				case 1 :
					// /Users/jeremie/ANTLR/cs.g:1143:7: 'pragma'
					{
					match("pragma"); 

					}
					break;
				case 2 :
					// /Users/jeremie/ANTLR/cs.g:1143:18: 'region'
					{
					match("region"); 

					}
					break;
				case 3 :
					// /Users/jeremie/ANTLR/cs.g:1143:29: 'endregion'
					{
					match("endregion"); 

					}
					break;
				case 4 :
					// /Users/jeremie/ANTLR/cs.g:1143:43: 'line'
					{
					match("line"); 

					}
					break;
				case 5 :
					// /Users/jeremie/ANTLR/cs.g:1143:52: 'warning'
					{
					match("warning"); 

					}
					break;
				case 6 :
					// /Users/jeremie/ANTLR/cs.g:1143:64: 'error'
					{
					match("error"); 

					}
					break;

			}

			// /Users/jeremie/ANTLR/cs.g:1143:73: (~ ( '\\n' | '\\r' ) )*
			loop20:
			while (true) {
				int alt20=2;
				int LA20_0 = input.LA(1);
				if ( ((LA20_0 >= '\u0000' && LA20_0 <= '\t')||(LA20_0 >= '\u000B' && LA20_0 <= '\f')||(LA20_0 >= '\u000E' && LA20_0 <= '\uFFFF')) ) {
					alt20=1;
				}

				switch (alt20) {
				case 1 :
					// /Users/jeremie/ANTLR/cs.g:
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop20;
				}
			}

			// /Users/jeremie/ANTLR/cs.g:1143:88: ( '\\r' | '\\n' )+
			int cnt21=0;
			loop21:
			while (true) {
				int alt21=2;
				int LA21_0 = input.LA(1);
				if ( (LA21_0=='\n'||LA21_0=='\r') ) {
					alt21=1;
				}

				switch (alt21) {
				case 1 :
					// /Users/jeremie/ANTLR/cs.g:
					{
					if ( input.LA(1)=='\n'||input.LA(1)=='\r' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt21 >= 1 ) break loop21;
					EarlyExitException eee = new EarlyExitException(21, input);
					throw eee;
				}
				cnt21++;
			}

			 skip(); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Pragma"

	// $ANTLR start "PREPROCESSOR_DIRECTIVE"
	public final void mPREPROCESSOR_DIRECTIVE() throws RecognitionException {
		try {
			int _type = PREPROCESSOR_DIRECTIVE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jeremie/ANTLR/cs.g:1145:23: (| PP_CONDITIONAL )
			int alt22=2;
			int LA22_0 = input.LA(1);
			if ( (LA22_0=='#') ) {
				alt22=2;
			}

			else {
				alt22=1;
			}

			switch (alt22) {
				case 1 :
					// /Users/jeremie/ANTLR/cs.g:1146:2: 
					{
					}
					break;
				case 2 :
					// /Users/jeremie/ANTLR/cs.g:1146:4: PP_CONDITIONAL
					{
					mPP_CONDITIONAL(); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PREPROCESSOR_DIRECTIVE"

	// $ANTLR start "PP_CONDITIONAL"
	public final void mPP_CONDITIONAL() throws RecognitionException {
		try {
			// /Users/jeremie/ANTLR/cs.g:1149:15: ( ( IF_TOKEN | DEFINE_TOKEN | ELSE_TOKEN | ENDIF_TOKEN | UNDEF_TOKEN ) ( TS )* ( ( LINE_COMMENT )? | ( '\\r' | '\\n' )+ ) )
			// /Users/jeremie/ANTLR/cs.g:1150:2: ( IF_TOKEN | DEFINE_TOKEN | ELSE_TOKEN | ENDIF_TOKEN | UNDEF_TOKEN ) ( TS )* ( ( LINE_COMMENT )? | ( '\\r' | '\\n' )+ )
			{
			// /Users/jeremie/ANTLR/cs.g:1150:2: ( IF_TOKEN | DEFINE_TOKEN | ELSE_TOKEN | ENDIF_TOKEN | UNDEF_TOKEN )
			int alt23=5;
			alt23 = dfa23.predict(input);
			switch (alt23) {
				case 1 :
					// /Users/jeremie/ANTLR/cs.g:1150:3: IF_TOKEN
					{
					mIF_TOKEN(); 

					}
					break;
				case 2 :
					// /Users/jeremie/ANTLR/cs.g:1151:4: DEFINE_TOKEN
					{
					mDEFINE_TOKEN(); 

					}
					break;
				case 3 :
					// /Users/jeremie/ANTLR/cs.g:1152:4: ELSE_TOKEN
					{
					mELSE_TOKEN(); 

					}
					break;
				case 4 :
					// /Users/jeremie/ANTLR/cs.g:1153:4: ENDIF_TOKEN
					{
					mENDIF_TOKEN(); 

					}
					break;
				case 5 :
					// /Users/jeremie/ANTLR/cs.g:1154:4: UNDEF_TOKEN
					{
					mUNDEF_TOKEN(); 

					}
					break;

			}

			// /Users/jeremie/ANTLR/cs.g:1154:19: ( TS )*
			loop24:
			while (true) {
				int alt24=2;
				int LA24_0 = input.LA(1);
				if ( (LA24_0=='\t'||LA24_0==' ') ) {
					alt24=1;
				}

				switch (alt24) {
				case 1 :
					// /Users/jeremie/ANTLR/cs.g:1154:19: TS
					{
					mTS(); 

					}
					break;

				default :
					break loop24;
				}
			}

			// /Users/jeremie/ANTLR/cs.g:1154:25: ( ( LINE_COMMENT )? | ( '\\r' | '\\n' )+ )
			int alt27=2;
			int LA27_0 = input.LA(1);
			if ( (LA27_0=='\n'||LA27_0=='\r') ) {
				alt27=2;
			}

			else {
				alt27=1;
			}

			switch (alt27) {
				case 1 :
					// /Users/jeremie/ANTLR/cs.g:1154:26: ( LINE_COMMENT )?
					{
					// /Users/jeremie/ANTLR/cs.g:1154:26: ( LINE_COMMENT )?
					int alt25=2;
					int LA25_0 = input.LA(1);
					if ( (LA25_0=='/') ) {
						alt25=1;
					}
					switch (alt25) {
						case 1 :
							// /Users/jeremie/ANTLR/cs.g:1154:26: LINE_COMMENT
							{
							mLINE_COMMENT(); 

							}
							break;

					}

					}
					break;
				case 2 :
					// /Users/jeremie/ANTLR/cs.g:1154:44: ( '\\r' | '\\n' )+
					{
					// /Users/jeremie/ANTLR/cs.g:1154:44: ( '\\r' | '\\n' )+
					int cnt26=0;
					loop26:
					while (true) {
						int alt26=2;
						int LA26_0 = input.LA(1);
						if ( (LA26_0=='\n'||LA26_0=='\r') ) {
							alt26=1;
						}

						switch (alt26) {
						case 1 :
							// /Users/jeremie/ANTLR/cs.g:
							{
							if ( input.LA(1)=='\n'||input.LA(1)=='\r' ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							if ( cnt26 >= 1 ) break loop26;
							EarlyExitException eee = new EarlyExitException(26, input);
							throw eee;
						}
						cnt26++;
					}

					}
					break;

			}

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PP_CONDITIONAL"

	// $ANTLR start "IF_TOKEN"
	public final void mIF_TOKEN() throws RecognitionException {
		try {
			CommonToken ppe=null;

			// /Users/jeremie/ANTLR/cs.g:1156:9: ( ( '#' ( TS )* 'if' ( TS )+ ppe= PP_EXPRESSION ) )
			// /Users/jeremie/ANTLR/cs.g:1157:2: ( '#' ( TS )* 'if' ( TS )+ ppe= PP_EXPRESSION )
			{
			// /Users/jeremie/ANTLR/cs.g:1157:2: ( '#' ( TS )* 'if' ( TS )+ ppe= PP_EXPRESSION )
			// /Users/jeremie/ANTLR/cs.g:1157:3: '#' ( TS )* 'if' ( TS )+ ppe= PP_EXPRESSION
			{
			match('#'); 
			// /Users/jeremie/ANTLR/cs.g:1157:9: ( TS )*
			loop28:
			while (true) {
				int alt28=2;
				int LA28_0 = input.LA(1);
				if ( (LA28_0=='\t'||LA28_0==' ') ) {
					alt28=1;
				}

				switch (alt28) {
				case 1 :
					// /Users/jeremie/ANTLR/cs.g:1157:9: TS
					{
					mTS(); 

					}
					break;

				default :
					break loop28;
				}
			}

			match("if"); 

			// /Users/jeremie/ANTLR/cs.g:1157:21: ( TS )+
			int cnt29=0;
			loop29:
			while (true) {
				int alt29=2;
				int LA29_0 = input.LA(1);
				if ( (LA29_0=='\t'||LA29_0==' ') ) {
					alt29=1;
				}

				switch (alt29) {
				case 1 :
					// /Users/jeremie/ANTLR/cs.g:1157:21: TS
					{
					mTS(); 

					}
					break;

				default :
					if ( cnt29 >= 1 ) break loop29;
					EarlyExitException eee = new EarlyExitException(29, input);
					throw eee;
				}
				cnt29++;
			}

			int ppeStart1986 = getCharIndex();
			int ppeStartLine1986 = getLine();
			int ppeStartCharPos1986 = getCharPositionInLine();
			mPP_EXPRESSION(); 
			ppe = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, ppeStart1986, getCharIndex()-1);
			ppe.setLine(ppeStartLine1986);
			ppe.setCharPositionInLine(ppeStartCharPos1986);

			}

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "IF_TOKEN"

	// $ANTLR start "DEFINE_TOKEN"
	public final void mDEFINE_TOKEN() throws RecognitionException {
		try {
			CommonToken define=null;

			// /Users/jeremie/ANTLR/cs.g:1159:13: ( '#' ( TS )* 'define' ( TS )+ define= IDENTIFIER )
			// /Users/jeremie/ANTLR/cs.g:1160:2: '#' ( TS )* 'define' ( TS )+ define= IDENTIFIER
			{
			match('#'); 
			// /Users/jeremie/ANTLR/cs.g:1160:8: ( TS )*
			loop30:
			while (true) {
				int alt30=2;
				int LA30_0 = input.LA(1);
				if ( (LA30_0=='\t'||LA30_0==' ') ) {
					alt30=1;
				}

				switch (alt30) {
				case 1 :
					// /Users/jeremie/ANTLR/cs.g:1160:8: TS
					{
					mTS(); 

					}
					break;

				default :
					break loop30;
				}
			}

			match("define"); 

			// /Users/jeremie/ANTLR/cs.g:1160:25: ( TS )+
			int cnt31=0;
			loop31:
			while (true) {
				int alt31=2;
				int LA31_0 = input.LA(1);
				if ( (LA31_0=='\t'||LA31_0==' ') ) {
					alt31=1;
				}

				switch (alt31) {
				case 1 :
					// /Users/jeremie/ANTLR/cs.g:1160:25: TS
					{
					mTS(); 

					}
					break;

				default :
					if ( cnt31 >= 1 ) break loop31;
					EarlyExitException eee = new EarlyExitException(31, input);
					throw eee;
				}
				cnt31++;
			}

			int defineStart2019 = getCharIndex();
			int defineStartLine2019 = getLine();
			int defineStartCharPos2019 = getCharPositionInLine();
			mIDENTIFIER(); 
			define = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, defineStart2019, getCharIndex()-1);
			define.setLine(defineStartLine2019);
			define.setCharPositionInLine(defineStartCharPos2019);

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DEFINE_TOKEN"

	// $ANTLR start "UNDEF_TOKEN"
	public final void mUNDEF_TOKEN() throws RecognitionException {
		try {
			CommonToken define=null;

			// /Users/jeremie/ANTLR/cs.g:1163:12: ( '#' ( TS )* 'undef' ( TS )+ define= IDENTIFIER )
			// /Users/jeremie/ANTLR/cs.g:1164:2: '#' ( TS )* 'undef' ( TS )+ define= IDENTIFIER
			{
			match('#'); 
			// /Users/jeremie/ANTLR/cs.g:1164:8: ( TS )*
			loop32:
			while (true) {
				int alt32=2;
				int LA32_0 = input.LA(1);
				if ( (LA32_0=='\t'||LA32_0==' ') ) {
					alt32=1;
				}

				switch (alt32) {
				case 1 :
					// /Users/jeremie/ANTLR/cs.g:1164:8: TS
					{
					mTS(); 

					}
					break;

				default :
					break loop32;
				}
			}

			match("undef"); 

			// /Users/jeremie/ANTLR/cs.g:1164:24: ( TS )+
			int cnt33=0;
			loop33:
			while (true) {
				int alt33=2;
				int LA33_0 = input.LA(1);
				if ( (LA33_0=='\t'||LA33_0==' ') ) {
					alt33=1;
				}

				switch (alt33) {
				case 1 :
					// /Users/jeremie/ANTLR/cs.g:1164:24: TS
					{
					mTS(); 

					}
					break;

				default :
					if ( cnt33 >= 1 ) break loop33;
					EarlyExitException eee = new EarlyExitException(33, input);
					throw eee;
				}
				cnt33++;
			}

			int defineStart2053 = getCharIndex();
			int defineStartLine2053 = getLine();
			int defineStartCharPos2053 = getCharPositionInLine();
			mIDENTIFIER(); 
			define = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, defineStart2053, getCharIndex()-1);
			define.setLine(defineStartLine2053);
			define.setCharPositionInLine(defineStartCharPos2053);

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "UNDEF_TOKEN"

	// $ANTLR start "ELSE_TOKEN"
	public final void mELSE_TOKEN() throws RecognitionException {
		try {
			CommonToken e=null;

			// /Users/jeremie/ANTLR/cs.g:1167:11: ( ( '#' ( TS )* e= 'else' | '#' ( TS )* 'elif' ( TS )+ PP_EXPRESSION ) )
			// /Users/jeremie/ANTLR/cs.g:1168:2: ( '#' ( TS )* e= 'else' | '#' ( TS )* 'elif' ( TS )+ PP_EXPRESSION )
			{
			// /Users/jeremie/ANTLR/cs.g:1168:2: ( '#' ( TS )* e= 'else' | '#' ( TS )* 'elif' ( TS )+ PP_EXPRESSION )
			int alt37=2;
			alt37 = dfa37.predict(input);
			switch (alt37) {
				case 1 :
					// /Users/jeremie/ANTLR/cs.g:1168:4: '#' ( TS )* e= 'else'
					{
					match('#'); 
					// /Users/jeremie/ANTLR/cs.g:1168:10: ( TS )*
					loop34:
					while (true) {
						int alt34=2;
						int LA34_0 = input.LA(1);
						if ( (LA34_0=='\t'||LA34_0==' ') ) {
							alt34=1;
						}

						switch (alt34) {
						case 1 :
							// /Users/jeremie/ANTLR/cs.g:1168:10: TS
							{
							mTS(); 

							}
							break;

						default :
							break loop34;
						}
					}

					int eStart = getCharIndex();
					match("else"); 
					int eStartLine2080 = getLine();
					int eStartCharPos2080 = getCharPositionInLine();
					e = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, eStart, getCharIndex()-1);
					e.setLine(eStartLine2080);
					e.setCharPositionInLine(eStartCharPos2080);

					}
					break;
				case 2 :
					// /Users/jeremie/ANTLR/cs.g:1169:4: '#' ( TS )* 'elif' ( TS )+ PP_EXPRESSION
					{
					match('#'); 
					// /Users/jeremie/ANTLR/cs.g:1169:10: ( TS )*
					loop35:
					while (true) {
						int alt35=2;
						int LA35_0 = input.LA(1);
						if ( (LA35_0=='\t'||LA35_0==' ') ) {
							alt35=1;
						}

						switch (alt35) {
						case 1 :
							// /Users/jeremie/ANTLR/cs.g:1169:10: TS
							{
							mTS(); 

							}
							break;

						default :
							break loop35;
						}
					}

					match("elif"); 

					// /Users/jeremie/ANTLR/cs.g:1169:25: ( TS )+
					int cnt36=0;
					loop36:
					while (true) {
						int alt36=2;
						int LA36_0 = input.LA(1);
						if ( (LA36_0=='\t'||LA36_0==' ') ) {
							alt36=1;
						}

						switch (alt36) {
						case 1 :
							// /Users/jeremie/ANTLR/cs.g:1169:25: TS
							{
							mTS(); 

							}
							break;

						default :
							if ( cnt36 >= 1 ) break loop36;
							EarlyExitException eee = new EarlyExitException(36, input);
							throw eee;
						}
						cnt36++;
					}

					mPP_EXPRESSION(); 

					}
					break;

			}

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ELSE_TOKEN"

	// $ANTLR start "ENDIF_TOKEN"
	public final void mENDIF_TOKEN() throws RecognitionException {
		try {
			// /Users/jeremie/ANTLR/cs.g:1172:12: ( '#' 'endif' )
			// /Users/jeremie/ANTLR/cs.g:1173:2: '#' 'endif'
			{
			match('#'); 
			match("endif"); 

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ENDIF_TOKEN"

	// $ANTLR start "PP_EXPRESSION"
	public final void mPP_EXPRESSION() throws RecognitionException {
		try {
			// /Users/jeremie/ANTLR/cs.g:1180:14: ( PP_OR_EXPRESSION )
			// /Users/jeremie/ANTLR/cs.g:1181:2: PP_OR_EXPRESSION
			{
			mPP_OR_EXPRESSION(); 

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PP_EXPRESSION"

	// $ANTLR start "PP_OR_EXPRESSION"
	public final void mPP_OR_EXPRESSION() throws RecognitionException {
		try {
			// /Users/jeremie/ANTLR/cs.g:1183:17: ( PP_AND_EXPRESSION ( TS )* ( '||' ( TS )* PP_AND_EXPRESSION ( TS )* )* )
			// /Users/jeremie/ANTLR/cs.g:1184:2: PP_AND_EXPRESSION ( TS )* ( '||' ( TS )* PP_AND_EXPRESSION ( TS )* )*
			{
			mPP_AND_EXPRESSION(); 

			// /Users/jeremie/ANTLR/cs.g:1184:22: ( TS )*
			loop38:
			while (true) {
				int alt38=2;
				int LA38_0 = input.LA(1);
				if ( (LA38_0=='\t'||LA38_0==' ') ) {
					alt38=1;
				}

				switch (alt38) {
				case 1 :
					// /Users/jeremie/ANTLR/cs.g:1184:22: TS
					{
					mTS(); 

					}
					break;

				default :
					break loop38;
				}
			}

			// /Users/jeremie/ANTLR/cs.g:1184:28: ( '||' ( TS )* PP_AND_EXPRESSION ( TS )* )*
			loop41:
			while (true) {
				int alt41=2;
				int LA41_0 = input.LA(1);
				if ( (LA41_0=='|') ) {
					alt41=1;
				}

				switch (alt41) {
				case 1 :
					// /Users/jeremie/ANTLR/cs.g:1184:29: '||' ( TS )* PP_AND_EXPRESSION ( TS )*
					{
					match("||"); 

					// /Users/jeremie/ANTLR/cs.g:1184:36: ( TS )*
					loop39:
					while (true) {
						int alt39=2;
						int LA39_0 = input.LA(1);
						if ( (LA39_0=='\t'||LA39_0==' ') ) {
							alt39=1;
						}

						switch (alt39) {
						case 1 :
							// /Users/jeremie/ANTLR/cs.g:1184:36: TS
							{
							mTS(); 

							}
							break;

						default :
							break loop39;
						}
					}

					mPP_AND_EXPRESSION(); 

					// /Users/jeremie/ANTLR/cs.g:1184:62: ( TS )*
					loop40:
					while (true) {
						int alt40=2;
						int LA40_0 = input.LA(1);
						if ( (LA40_0=='\t'||LA40_0==' ') ) {
							alt40=1;
						}

						switch (alt40) {
						case 1 :
							// /Users/jeremie/ANTLR/cs.g:1184:62: TS
							{
							mTS(); 

							}
							break;

						default :
							break loop40;
						}
					}

					}
					break;

				default :
					break loop41;
				}
			}

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PP_OR_EXPRESSION"

	// $ANTLR start "PP_AND_EXPRESSION"
	public final void mPP_AND_EXPRESSION() throws RecognitionException {
		try {
			// /Users/jeremie/ANTLR/cs.g:1186:18: ( PP_EQUALITY_EXPRESSION ( TS )* ( '&&' ( TS )* PP_EQUALITY_EXPRESSION ( TS )* )* )
			// /Users/jeremie/ANTLR/cs.g:1187:2: PP_EQUALITY_EXPRESSION ( TS )* ( '&&' ( TS )* PP_EQUALITY_EXPRESSION ( TS )* )*
			{
			mPP_EQUALITY_EXPRESSION(); 

			// /Users/jeremie/ANTLR/cs.g:1187:27: ( TS )*
			loop42:
			while (true) {
				int alt42=2;
				int LA42_0 = input.LA(1);
				if ( (LA42_0=='\t'||LA42_0==' ') ) {
					alt42=1;
				}

				switch (alt42) {
				case 1 :
					// /Users/jeremie/ANTLR/cs.g:1187:27: TS
					{
					mTS(); 

					}
					break;

				default :
					break loop42;
				}
			}

			// /Users/jeremie/ANTLR/cs.g:1187:33: ( '&&' ( TS )* PP_EQUALITY_EXPRESSION ( TS )* )*
			loop45:
			while (true) {
				int alt45=2;
				int LA45_0 = input.LA(1);
				if ( (LA45_0=='&') ) {
					alt45=1;
				}

				switch (alt45) {
				case 1 :
					// /Users/jeremie/ANTLR/cs.g:1187:34: '&&' ( TS )* PP_EQUALITY_EXPRESSION ( TS )*
					{
					match("&&"); 

					// /Users/jeremie/ANTLR/cs.g:1187:41: ( TS )*
					loop43:
					while (true) {
						int alt43=2;
						int LA43_0 = input.LA(1);
						if ( (LA43_0=='\t'||LA43_0==' ') ) {
							alt43=1;
						}

						switch (alt43) {
						case 1 :
							// /Users/jeremie/ANTLR/cs.g:1187:41: TS
							{
							mTS(); 

							}
							break;

						default :
							break loop43;
						}
					}

					mPP_EQUALITY_EXPRESSION(); 

					// /Users/jeremie/ANTLR/cs.g:1187:72: ( TS )*
					loop44:
					while (true) {
						int alt44=2;
						int LA44_0 = input.LA(1);
						if ( (LA44_0=='\t'||LA44_0==' ') ) {
							alt44=1;
						}

						switch (alt44) {
						case 1 :
							// /Users/jeremie/ANTLR/cs.g:1187:72: TS
							{
							mTS(); 

							}
							break;

						default :
							break loop44;
						}
					}

					}
					break;

				default :
					break loop45;
				}
			}

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PP_AND_EXPRESSION"

	// $ANTLR start "PP_EQUALITY_EXPRESSION"
	public final void mPP_EQUALITY_EXPRESSION() throws RecognitionException {
		try {
			CommonToken ne=null;

			// /Users/jeremie/ANTLR/cs.g:1189:23: ( PP_UNARY_EXPRESSION ( TS )* ( ( '==' |ne= '!=' ) ( TS )* PP_UNARY_EXPRESSION ( TS )* )* )
			// /Users/jeremie/ANTLR/cs.g:1190:2: PP_UNARY_EXPRESSION ( TS )* ( ( '==' |ne= '!=' ) ( TS )* PP_UNARY_EXPRESSION ( TS )* )*
			{
			mPP_UNARY_EXPRESSION(); 

			// /Users/jeremie/ANTLR/cs.g:1190:24: ( TS )*
			loop46:
			while (true) {
				int alt46=2;
				int LA46_0 = input.LA(1);
				if ( (LA46_0=='\t'||LA46_0==' ') ) {
					alt46=1;
				}

				switch (alt46) {
				case 1 :
					// /Users/jeremie/ANTLR/cs.g:1190:24: TS
					{
					mTS(); 

					}
					break;

				default :
					break loop46;
				}
			}

			// /Users/jeremie/ANTLR/cs.g:1190:30: ( ( '==' |ne= '!=' ) ( TS )* PP_UNARY_EXPRESSION ( TS )* )*
			loop50:
			while (true) {
				int alt50=2;
				int LA50_0 = input.LA(1);
				if ( (LA50_0=='!'||LA50_0=='=') ) {
					alt50=1;
				}

				switch (alt50) {
				case 1 :
					// /Users/jeremie/ANTLR/cs.g:1190:31: ( '==' |ne= '!=' ) ( TS )* PP_UNARY_EXPRESSION ( TS )*
					{
					// /Users/jeremie/ANTLR/cs.g:1190:31: ( '==' |ne= '!=' )
					int alt47=2;
					int LA47_0 = input.LA(1);
					if ( (LA47_0=='=') ) {
						alt47=1;
					}
					else if ( (LA47_0=='!') ) {
						alt47=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 47, 0, input);
						throw nvae;
					}

					switch (alt47) {
						case 1 :
							// /Users/jeremie/ANTLR/cs.g:1190:32: '=='
							{
							match("=="); 

							}
							break;
						case 2 :
							// /Users/jeremie/ANTLR/cs.g:1190:38: ne= '!='
							{
							int neStart = getCharIndex();
							match("!="); 
							int neStartLine2233 = getLine();
							int neStartCharPos2233 = getCharPositionInLine();
							ne = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, neStart, getCharIndex()-1);
							ne.setLine(neStartLine2233);
							ne.setCharPositionInLine(neStartCharPos2233);

							}
							break;

					}

					// /Users/jeremie/ANTLR/cs.g:1190:51: ( TS )*
					loop48:
					while (true) {
						int alt48=2;
						int LA48_0 = input.LA(1);
						if ( (LA48_0=='\t'||LA48_0==' ') ) {
							alt48=1;
						}

						switch (alt48) {
						case 1 :
							// /Users/jeremie/ANTLR/cs.g:1190:51: TS
							{
							mTS(); 

							}
							break;

						default :
							break loop48;
						}
					}

					mPP_UNARY_EXPRESSION(); 

					// /Users/jeremie/ANTLR/cs.g:1192:3: ( TS )*
					loop49:
					while (true) {
						int alt49=2;
						int LA49_0 = input.LA(1);
						if ( (LA49_0=='\t'||LA49_0==' ') ) {
							alt49=1;
						}

						switch (alt49) {
						case 1 :
							// /Users/jeremie/ANTLR/cs.g:1192:3: TS
							{
							mTS(); 

							}
							break;

						default :
							break loop49;
						}
					}

					}
					break;

				default :
					break loop50;
				}
			}

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PP_EQUALITY_EXPRESSION"

	// $ANTLR start "PP_UNARY_EXPRESSION"
	public final void mPP_UNARY_EXPRESSION() throws RecognitionException {
		try {
			CommonToken pe=null;
			CommonToken ue=null;

			// /Users/jeremie/ANTLR/cs.g:1195:20: (pe= PP_PRIMARY_EXPRESSION | '!' ( TS )* ue= PP_UNARY_EXPRESSION )
			int alt52=2;
			int LA52_0 = input.LA(1);
			if ( (LA52_0=='('||(LA52_0 >= '@' && LA52_0 <= 'Z')||LA52_0=='_'||(LA52_0 >= 'a' && LA52_0 <= 'z')) ) {
				alt52=1;
			}
			else if ( (LA52_0=='!') ) {
				alt52=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 52, 0, input);
				throw nvae;
			}

			switch (alt52) {
				case 1 :
					// /Users/jeremie/ANTLR/cs.g:1196:2: pe= PP_PRIMARY_EXPRESSION
					{
					int peStart2269 = getCharIndex();
					int peStartLine2269 = getLine();
					int peStartCharPos2269 = getCharPositionInLine();
					mPP_PRIMARY_EXPRESSION(); 
					pe = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, peStart2269, getCharIndex()-1);
					pe.setLine(peStartLine2269);
					pe.setCharPositionInLine(peStartCharPos2269);

					}
					break;
				case 2 :
					// /Users/jeremie/ANTLR/cs.g:1197:4: '!' ( TS )* ue= PP_UNARY_EXPRESSION
					{
					match('!'); 
					// /Users/jeremie/ANTLR/cs.g:1197:10: ( TS )*
					loop51:
					while (true) {
						int alt51=2;
						int LA51_0 = input.LA(1);
						if ( (LA51_0=='\t'||LA51_0==' ') ) {
							alt51=1;
						}

						switch (alt51) {
						case 1 :
							// /Users/jeremie/ANTLR/cs.g:1197:10: TS
							{
							mTS(); 

							}
							break;

						default :
							break loop51;
						}
					}

					int ueStart2287 = getCharIndex();
					int ueStartLine2287 = getLine();
					int ueStartCharPos2287 = getCharPositionInLine();
					mPP_UNARY_EXPRESSION(); 
					ue = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, ueStart2287, getCharIndex()-1);
					ue.setLine(ueStartLine2287);
					ue.setCharPositionInLine(ueStartCharPos2287);

					}
					break;

			}
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PP_UNARY_EXPRESSION"

	// $ANTLR start "PP_PRIMARY_EXPRESSION"
	public final void mPP_PRIMARY_EXPRESSION() throws RecognitionException {
		try {
			// /Users/jeremie/ANTLR/cs.g:1200:22: ( IDENTIFIER | '(' PP_EXPRESSION ')' )
			int alt53=2;
			int LA53_0 = input.LA(1);
			if ( ((LA53_0 >= '@' && LA53_0 <= 'Z')||LA53_0=='_'||(LA53_0 >= 'a' && LA53_0 <= 'z')) ) {
				alt53=1;
			}
			else if ( (LA53_0=='(') ) {
				alt53=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 53, 0, input);
				throw nvae;
			}

			switch (alt53) {
				case 1 :
					// /Users/jeremie/ANTLR/cs.g:1201:2: IDENTIFIER
					{
					mIDENTIFIER(); 

					}
					break;
				case 2 :
					// /Users/jeremie/ANTLR/cs.g:1203:4: '(' PP_EXPRESSION ')'
					{
					match('('); 
					mPP_EXPRESSION(); 

					match(')'); 
					}
					break;

			}
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PP_PRIMARY_EXPRESSION"

	// $ANTLR start "IdentifierStart"
	public final void mIdentifierStart() throws RecognitionException {
		try {
			// /Users/jeremie/ANTLR/cs.g:1210:2: ( '@' | '_' | 'A' .. 'Z' | 'a' .. 'z' )
			// /Users/jeremie/ANTLR/cs.g:
			{
			if ( (input.LA(1) >= '@' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "IdentifierStart"

	// $ANTLR start "IdentifierPart"
	public final void mIdentifierPart() throws RecognitionException {
		try {
			// /Users/jeremie/ANTLR/cs.g:1213:3: ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' )
			// /Users/jeremie/ANTLR/cs.g:
			{
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "IdentifierPart"

	// $ANTLR start "EscapeSequence"
	public final void mEscapeSequence() throws RecognitionException {
		try {
			// /Users/jeremie/ANTLR/cs.g:1216:5: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'v' | 'a' | '\\\"' | '\\'' | '\\\\' | ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) | ( '0' .. '7' ) ( '0' .. '7' ) | ( '0' .. '7' ) | 'x' HEX_DIGIT | 'x' HEX_DIGIT HEX_DIGIT | 'x' HEX_DIGIT HEX_DIGIT HEX_DIGIT | 'x' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT | 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT | 'U' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT ) )
			// /Users/jeremie/ANTLR/cs.g:1216:9: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'v' | 'a' | '\\\"' | '\\'' | '\\\\' | ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) | ( '0' .. '7' ) ( '0' .. '7' ) | ( '0' .. '7' ) | 'x' HEX_DIGIT | 'x' HEX_DIGIT HEX_DIGIT | 'x' HEX_DIGIT HEX_DIGIT HEX_DIGIT | 'x' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT | 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT | 'U' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT )
			{
			match('\\'); 
			// /Users/jeremie/ANTLR/cs.g:1216:14: ( 'b' | 't' | 'n' | 'f' | 'r' | 'v' | 'a' | '\\\"' | '\\'' | '\\\\' | ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) | ( '0' .. '7' ) ( '0' .. '7' ) | ( '0' .. '7' ) | 'x' HEX_DIGIT | 'x' HEX_DIGIT HEX_DIGIT | 'x' HEX_DIGIT HEX_DIGIT HEX_DIGIT | 'x' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT | 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT | 'U' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT )
			int alt54=19;
			switch ( input.LA(1) ) {
			case 'b':
				{
				alt54=1;
				}
				break;
			case 't':
				{
				alt54=2;
				}
				break;
			case 'n':
				{
				alt54=3;
				}
				break;
			case 'f':
				{
				alt54=4;
				}
				break;
			case 'r':
				{
				alt54=5;
				}
				break;
			case 'v':
				{
				alt54=6;
				}
				break;
			case 'a':
				{
				alt54=7;
				}
				break;
			case '\"':
				{
				alt54=8;
				}
				break;
			case '\'':
				{
				alt54=9;
				}
				break;
			case '\\':
				{
				alt54=10;
				}
				break;
			case '0':
			case '1':
			case '2':
			case '3':
				{
				int LA54_11 = input.LA(2);
				if ( ((LA54_11 >= '0' && LA54_11 <= '7')) ) {
					int LA54_16 = input.LA(3);
					if ( ((LA54_16 >= '0' && LA54_16 <= '7')) ) {
						alt54=11;
					}

					else {
						alt54=12;
					}

				}

				else {
					alt54=13;
				}

				}
				break;
			case '4':
			case '5':
			case '6':
			case '7':
				{
				int LA54_12 = input.LA(2);
				if ( ((LA54_12 >= '0' && LA54_12 <= '7')) ) {
					alt54=12;
				}

				else {
					alt54=13;
				}

				}
				break;
			case 'x':
				{
				int LA54_13 = input.LA(2);
				if ( ((LA54_13 >= '0' && LA54_13 <= '9')||(LA54_13 >= 'A' && LA54_13 <= 'F')||(LA54_13 >= 'a' && LA54_13 <= 'f')) ) {
					int LA54_19 = input.LA(3);
					if ( ((LA54_19 >= '0' && LA54_19 <= '9')||(LA54_19 >= 'A' && LA54_19 <= 'F')||(LA54_19 >= 'a' && LA54_19 <= 'f')) ) {
						int LA54_22 = input.LA(4);
						if ( ((LA54_22 >= '0' && LA54_22 <= '9')||(LA54_22 >= 'A' && LA54_22 <= 'F')||(LA54_22 >= 'a' && LA54_22 <= 'f')) ) {
							int LA54_24 = input.LA(5);
							if ( ((LA54_24 >= '0' && LA54_24 <= '9')||(LA54_24 >= 'A' && LA54_24 <= 'F')||(LA54_24 >= 'a' && LA54_24 <= 'f')) ) {
								alt54=17;
							}

							else {
								alt54=16;
							}

						}

						else {
							alt54=15;
						}

					}

					else {
						alt54=14;
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 54, 13, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 'u':
				{
				alt54=18;
				}
				break;
			case 'U':
				{
				alt54=19;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 54, 0, input);
				throw nvae;
			}
			switch (alt54) {
				case 1 :
					// /Users/jeremie/ANTLR/cs.g:1217:18: 'b'
					{
					match('b'); 
					}
					break;
				case 2 :
					// /Users/jeremie/ANTLR/cs.g:1218:18: 't'
					{
					match('t'); 
					}
					break;
				case 3 :
					// /Users/jeremie/ANTLR/cs.g:1219:18: 'n'
					{
					match('n'); 
					}
					break;
				case 4 :
					// /Users/jeremie/ANTLR/cs.g:1220:18: 'f'
					{
					match('f'); 
					}
					break;
				case 5 :
					// /Users/jeremie/ANTLR/cs.g:1221:18: 'r'
					{
					match('r'); 
					}
					break;
				case 6 :
					// /Users/jeremie/ANTLR/cs.g:1222:18: 'v'
					{
					match('v'); 
					}
					break;
				case 7 :
					// /Users/jeremie/ANTLR/cs.g:1223:18: 'a'
					{
					match('a'); 
					}
					break;
				case 8 :
					// /Users/jeremie/ANTLR/cs.g:1224:18: '\\\"'
					{
					match('\"'); 
					}
					break;
				case 9 :
					// /Users/jeremie/ANTLR/cs.g:1225:18: '\\''
					{
					match('\''); 
					}
					break;
				case 10 :
					// /Users/jeremie/ANTLR/cs.g:1226:18: '\\\\'
					{
					match('\\'); 
					}
					break;
				case 11 :
					// /Users/jeremie/ANTLR/cs.g:1227:18: ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' )
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '3') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;
				case 12 :
					// /Users/jeremie/ANTLR/cs.g:1228:18: ( '0' .. '7' ) ( '0' .. '7' )
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;
				case 13 :
					// /Users/jeremie/ANTLR/cs.g:1229:18: ( '0' .. '7' )
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;
				case 14 :
					// /Users/jeremie/ANTLR/cs.g:1230:18: 'x' HEX_DIGIT
					{
					match('x'); 
					mHEX_DIGIT(); 

					}
					break;
				case 15 :
					// /Users/jeremie/ANTLR/cs.g:1231:18: 'x' HEX_DIGIT HEX_DIGIT
					{
					match('x'); 
					mHEX_DIGIT(); 

					mHEX_DIGIT(); 

					}
					break;
				case 16 :
					// /Users/jeremie/ANTLR/cs.g:1232:18: 'x' HEX_DIGIT HEX_DIGIT HEX_DIGIT
					{
					match('x'); 
					mHEX_DIGIT(); 

					mHEX_DIGIT(); 

					mHEX_DIGIT(); 

					}
					break;
				case 17 :
					// /Users/jeremie/ANTLR/cs.g:1233:18: 'x' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
					{
					match('x'); 
					mHEX_DIGIT(); 

					mHEX_DIGIT(); 

					mHEX_DIGIT(); 

					mHEX_DIGIT(); 

					}
					break;
				case 18 :
					// /Users/jeremie/ANTLR/cs.g:1234:18: 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
					{
					match('u'); 
					mHEX_DIGIT(); 

					mHEX_DIGIT(); 

					mHEX_DIGIT(); 

					mHEX_DIGIT(); 

					}
					break;
				case 19 :
					// /Users/jeremie/ANTLR/cs.g:1235:18: 'U' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
					{
					match('U'); 
					mHEX_DIGIT(); 

					mHEX_DIGIT(); 

					mHEX_DIGIT(); 

					mHEX_DIGIT(); 

					mHEX_DIGIT(); 

					mHEX_DIGIT(); 

					mHEX_DIGIT(); 

					}
					break;

			}

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EscapeSequence"

	// $ANTLR start "Decimal_integer_literal"
	public final void mDecimal_integer_literal() throws RecognitionException {
		try {
			// /Users/jeremie/ANTLR/cs.g:1238:24: ( Decimal_digits ( INTEGER_TYPE_SUFFIX )? )
			// /Users/jeremie/ANTLR/cs.g:1239:2: Decimal_digits ( INTEGER_TYPE_SUFFIX )?
			{
			mDecimal_digits(); 

			// /Users/jeremie/ANTLR/cs.g:1239:19: ( INTEGER_TYPE_SUFFIX )?
			int alt55=2;
			int LA55_0 = input.LA(1);
			if ( (LA55_0=='L'||LA55_0=='U'||LA55_0=='l'||LA55_0=='u') ) {
				alt55=1;
			}
			switch (alt55) {
				case 1 :
					// /Users/jeremie/ANTLR/cs.g:1239:19: INTEGER_TYPE_SUFFIX
					{
					mINTEGER_TYPE_SUFFIX(); 

					}
					break;

			}

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Decimal_integer_literal"

	// $ANTLR start "Hex_number"
	public final void mHex_number() throws RecognitionException {
		try {
			int _type = Hex_number;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jeremie/ANTLR/cs.g:1240:11: ( '0' ( 'x' | 'X' ) HEX_DIGITS ( INTEGER_TYPE_SUFFIX )? )
			// /Users/jeremie/ANTLR/cs.g:1241:2: '0' ( 'x' | 'X' ) HEX_DIGITS ( INTEGER_TYPE_SUFFIX )?
			{
			match('0'); 
			if ( input.LA(1)=='X'||input.LA(1)=='x' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			mHEX_DIGITS(); 

			// /Users/jeremie/ANTLR/cs.g:1241:30: ( INTEGER_TYPE_SUFFIX )?
			int alt56=2;
			int LA56_0 = input.LA(1);
			if ( (LA56_0=='L'||LA56_0=='U'||LA56_0=='l'||LA56_0=='u') ) {
				alt56=1;
			}
			switch (alt56) {
				case 1 :
					// /Users/jeremie/ANTLR/cs.g:1241:30: INTEGER_TYPE_SUFFIX
					{
					mINTEGER_TYPE_SUFFIX(); 

					}
					break;

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Hex_number"

	// $ANTLR start "Decimal_digits"
	public final void mDecimal_digits() throws RecognitionException {
		try {
			// /Users/jeremie/ANTLR/cs.g:1244:15: ( ( DECIMAL_DIGIT )+ )
			// /Users/jeremie/ANTLR/cs.g:1245:2: ( DECIMAL_DIGIT )+
			{
			// /Users/jeremie/ANTLR/cs.g:1245:2: ( DECIMAL_DIGIT )+
			int cnt57=0;
			loop57:
			while (true) {
				int alt57=2;
				int LA57_0 = input.LA(1);
				if ( ((LA57_0 >= '0' && LA57_0 <= '9')) ) {
					alt57=1;
				}

				switch (alt57) {
				case 1 :
					// /Users/jeremie/ANTLR/cs.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt57 >= 1 ) break loop57;
					EarlyExitException eee = new EarlyExitException(57, input);
					throw eee;
				}
				cnt57++;
			}

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Decimal_digits"

	// $ANTLR start "DECIMAL_DIGIT"
	public final void mDECIMAL_DIGIT() throws RecognitionException {
		try {
			// /Users/jeremie/ANTLR/cs.g:1247:14: ( '0' .. '9' )
			// /Users/jeremie/ANTLR/cs.g:
			{
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DECIMAL_DIGIT"

	// $ANTLR start "INTEGER_TYPE_SUFFIX"
	public final void mINTEGER_TYPE_SUFFIX() throws RecognitionException {
		try {
			// /Users/jeremie/ANTLR/cs.g:1250:20: ( 'U' | 'u' | 'L' | 'l' | 'UL' | 'Ul' | 'uL' | 'ul' | 'LU' | 'Lu' | 'lU' | 'lu' )
			int alt58=12;
			switch ( input.LA(1) ) {
			case 'U':
				{
				switch ( input.LA(2) ) {
				case 'L':
					{
					alt58=5;
					}
					break;
				case 'l':
					{
					alt58=6;
					}
					break;
				default:
					alt58=1;
				}
				}
				break;
			case 'u':
				{
				switch ( input.LA(2) ) {
				case 'L':
					{
					alt58=7;
					}
					break;
				case 'l':
					{
					alt58=8;
					}
					break;
				default:
					alt58=2;
				}
				}
				break;
			case 'L':
				{
				switch ( input.LA(2) ) {
				case 'U':
					{
					alt58=9;
					}
					break;
				case 'u':
					{
					alt58=10;
					}
					break;
				default:
					alt58=3;
				}
				}
				break;
			case 'l':
				{
				switch ( input.LA(2) ) {
				case 'U':
					{
					alt58=11;
					}
					break;
				case 'u':
					{
					alt58=12;
					}
					break;
				default:
					alt58=4;
				}
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 58, 0, input);
				throw nvae;
			}
			switch (alt58) {
				case 1 :
					// /Users/jeremie/ANTLR/cs.g:1251:2: 'U'
					{
					match('U'); 
					}
					break;
				case 2 :
					// /Users/jeremie/ANTLR/cs.g:1251:8: 'u'
					{
					match('u'); 
					}
					break;
				case 3 :
					// /Users/jeremie/ANTLR/cs.g:1251:14: 'L'
					{
					match('L'); 
					}
					break;
				case 4 :
					// /Users/jeremie/ANTLR/cs.g:1251:20: 'l'
					{
					match('l'); 
					}
					break;
				case 5 :
					// /Users/jeremie/ANTLR/cs.g:1251:26: 'UL'
					{
					match("UL"); 

					}
					break;
				case 6 :
					// /Users/jeremie/ANTLR/cs.g:1251:33: 'Ul'
					{
					match("Ul"); 

					}
					break;
				case 7 :
					// /Users/jeremie/ANTLR/cs.g:1251:40: 'uL'
					{
					match("uL"); 

					}
					break;
				case 8 :
					// /Users/jeremie/ANTLR/cs.g:1251:47: 'ul'
					{
					match("ul"); 

					}
					break;
				case 9 :
					// /Users/jeremie/ANTLR/cs.g:1251:54: 'LU'
					{
					match("LU"); 

					}
					break;
				case 10 :
					// /Users/jeremie/ANTLR/cs.g:1251:61: 'Lu'
					{
					match("Lu"); 

					}
					break;
				case 11 :
					// /Users/jeremie/ANTLR/cs.g:1251:68: 'lU'
					{
					match("lU"); 

					}
					break;
				case 12 :
					// /Users/jeremie/ANTLR/cs.g:1251:75: 'lu'
					{
					match("lu"); 

					}
					break;

			}
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INTEGER_TYPE_SUFFIX"

	// $ANTLR start "HEX_DIGITS"
	public final void mHEX_DIGITS() throws RecognitionException {
		try {
			// /Users/jeremie/ANTLR/cs.g:1251:20: ( ( HEX_DIGIT )+ )
			// /Users/jeremie/ANTLR/cs.g:1252:2: ( HEX_DIGIT )+
			{
			// /Users/jeremie/ANTLR/cs.g:1252:2: ( HEX_DIGIT )+
			int cnt59=0;
			loop59:
			while (true) {
				int alt59=2;
				int LA59_0 = input.LA(1);
				if ( ((LA59_0 >= '0' && LA59_0 <= '9')||(LA59_0 >= 'A' && LA59_0 <= 'F')||(LA59_0 >= 'a' && LA59_0 <= 'f')) ) {
					alt59=1;
				}

				switch (alt59) {
				case 1 :
					// /Users/jeremie/ANTLR/cs.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'F')||(input.LA(1) >= 'a' && input.LA(1) <= 'f') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt59 >= 1 ) break loop59;
					EarlyExitException eee = new EarlyExitException(59, input);
					throw eee;
				}
				cnt59++;
			}

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "HEX_DIGITS"

	// $ANTLR start "HEX_DIGIT"
	public final void mHEX_DIGIT() throws RecognitionException {
		try {
			// /Users/jeremie/ANTLR/cs.g:1253:19: ( '0' .. '9' | 'A' .. 'F' | 'a' .. 'f' )
			// /Users/jeremie/ANTLR/cs.g:
			{
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'F')||(input.LA(1) >= 'a' && input.LA(1) <= 'f') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "HEX_DIGIT"

	// $ANTLR start "Exponent_part"
	public final void mExponent_part() throws RecognitionException {
		try {
			// /Users/jeremie/ANTLR/cs.g:1257:14: ( ( 'e' | 'E' ) ( Sign )? Decimal_digits )
			// /Users/jeremie/ANTLR/cs.g:1258:2: ( 'e' | 'E' ) ( Sign )? Decimal_digits
			{
			if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// /Users/jeremie/ANTLR/cs.g:1258:14: ( Sign )?
			int alt60=2;
			int LA60_0 = input.LA(1);
			if ( (LA60_0=='+'||LA60_0=='-') ) {
				alt60=1;
			}
			switch (alt60) {
				case 1 :
					// /Users/jeremie/ANTLR/cs.g:
					{
					if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

			}

			mDecimal_digits(); 

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Exponent_part"

	// $ANTLR start "Sign"
	public final void mSign() throws RecognitionException {
		try {
			// /Users/jeremie/ANTLR/cs.g:1260:5: ( '+' | '-' )
			// /Users/jeremie/ANTLR/cs.g:
			{
			if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Sign"

	// $ANTLR start "Real_type_suffix"
	public final void mReal_type_suffix() throws RecognitionException {
		try {
			// /Users/jeremie/ANTLR/cs.g:1263:17: ( 'F' | 'f' | 'D' | 'd' | 'M' | 'm' )
			// /Users/jeremie/ANTLR/cs.g:
			{
			if ( input.LA(1)=='D'||input.LA(1)=='F'||input.LA(1)=='M'||input.LA(1)=='d'||input.LA(1)=='f'||input.LA(1)=='m' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Real_type_suffix"

	@Override
	public void mTokens() throws RecognitionException {
		// /Users/jeremie/ANTLR/cs.g:1:8: ( T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | T__103 | T__104 | T__105 | T__106 | T__107 | T__108 | T__109 | T__110 | T__111 | T__112 | T__113 | T__114 | T__115 | T__116 | T__117 | T__118 | T__119 | T__120 | T__121 | T__122 | T__123 | T__124 | T__125 | T__126 | T__127 | T__128 | T__129 | T__130 | T__131 | T__132 | T__133 | T__134 | T__135 | T__136 | T__137 | T__138 | T__139 | T__140 | T__141 | T__142 | T__143 | T__144 | T__145 | T__146 | T__147 | T__148 | T__149 | T__150 | T__151 | T__152 | T__153 | T__154 | T__155 | T__156 | T__157 | T__158 | T__159 | T__160 | T__161 | T__162 | T__163 | T__164 | T__165 | T__166 | T__167 | T__168 | T__169 | T__170 | T__171 | T__172 | T__173 | T__174 | T__175 | T__176 | T__177 | T__178 | T__179 | T__180 | T__181 | T__182 | T__183 | T__184 | T__185 | T__186 | T__187 | T__188 | T__189 | T__190 | T__191 | T__192 | T__193 | T__194 | T__195 | T__196 | T__197 | T__198 | T__199 | T__200 | T__201 | T__202 | TRUE | FALSE | NULL | DOT | PTR | MINUS | GT | USING | ENUM | IF | ELIF | ENDIF | DEFINE | UNDEF | SEMI | RPAREN | WS | DOC_LINE_COMMENT | LINE_COMMENT | COMMENT | STRINGLITERAL | Verbatim_string_literal | NUMBER | GooBall | Real_literal | Character_literal | IDENTIFIER | Pragma | PREPROCESSOR_DIRECTIVE | Hex_number )
		int alt61=172;
		alt61 = dfa61.predict(input);
		switch (alt61) {
			case 1 :
				// /Users/jeremie/ANTLR/cs.g:1:10: T__61
				{
				mT__61(); 

				}
				break;
			case 2 :
				// /Users/jeremie/ANTLR/cs.g:1:16: T__62
				{
				mT__62(); 

				}
				break;
			case 3 :
				// /Users/jeremie/ANTLR/cs.g:1:22: T__63
				{
				mT__63(); 

				}
				break;
			case 4 :
				// /Users/jeremie/ANTLR/cs.g:1:28: T__64
				{
				mT__64(); 

				}
				break;
			case 5 :
				// /Users/jeremie/ANTLR/cs.g:1:34: T__65
				{
				mT__65(); 

				}
				break;
			case 6 :
				// /Users/jeremie/ANTLR/cs.g:1:40: T__66
				{
				mT__66(); 

				}
				break;
			case 7 :
				// /Users/jeremie/ANTLR/cs.g:1:46: T__67
				{
				mT__67(); 

				}
				break;
			case 8 :
				// /Users/jeremie/ANTLR/cs.g:1:52: T__68
				{
				mT__68(); 

				}
				break;
			case 9 :
				// /Users/jeremie/ANTLR/cs.g:1:58: T__69
				{
				mT__69(); 

				}
				break;
			case 10 :
				// /Users/jeremie/ANTLR/cs.g:1:64: T__70
				{
				mT__70(); 

				}
				break;
			case 11 :
				// /Users/jeremie/ANTLR/cs.g:1:70: T__71
				{
				mT__71(); 

				}
				break;
			case 12 :
				// /Users/jeremie/ANTLR/cs.g:1:76: T__72
				{
				mT__72(); 

				}
				break;
			case 13 :
				// /Users/jeremie/ANTLR/cs.g:1:82: T__73
				{
				mT__73(); 

				}
				break;
			case 14 :
				// /Users/jeremie/ANTLR/cs.g:1:88: T__74
				{
				mT__74(); 

				}
				break;
			case 15 :
				// /Users/jeremie/ANTLR/cs.g:1:94: T__75
				{
				mT__75(); 

				}
				break;
			case 16 :
				// /Users/jeremie/ANTLR/cs.g:1:100: T__76
				{
				mT__76(); 

				}
				break;
			case 17 :
				// /Users/jeremie/ANTLR/cs.g:1:106: T__77
				{
				mT__77(); 

				}
				break;
			case 18 :
				// /Users/jeremie/ANTLR/cs.g:1:112: T__78
				{
				mT__78(); 

				}
				break;
			case 19 :
				// /Users/jeremie/ANTLR/cs.g:1:118: T__79
				{
				mT__79(); 

				}
				break;
			case 20 :
				// /Users/jeremie/ANTLR/cs.g:1:124: T__80
				{
				mT__80(); 

				}
				break;
			case 21 :
				// /Users/jeremie/ANTLR/cs.g:1:130: T__81
				{
				mT__81(); 

				}
				break;
			case 22 :
				// /Users/jeremie/ANTLR/cs.g:1:136: T__82
				{
				mT__82(); 

				}
				break;
			case 23 :
				// /Users/jeremie/ANTLR/cs.g:1:142: T__83
				{
				mT__83(); 

				}
				break;
			case 24 :
				// /Users/jeremie/ANTLR/cs.g:1:148: T__84
				{
				mT__84(); 

				}
				break;
			case 25 :
				// /Users/jeremie/ANTLR/cs.g:1:154: T__85
				{
				mT__85(); 

				}
				break;
			case 26 :
				// /Users/jeremie/ANTLR/cs.g:1:160: T__86
				{
				mT__86(); 

				}
				break;
			case 27 :
				// /Users/jeremie/ANTLR/cs.g:1:166: T__87
				{
				mT__87(); 

				}
				break;
			case 28 :
				// /Users/jeremie/ANTLR/cs.g:1:172: T__88
				{
				mT__88(); 

				}
				break;
			case 29 :
				// /Users/jeremie/ANTLR/cs.g:1:178: T__89
				{
				mT__89(); 

				}
				break;
			case 30 :
				// /Users/jeremie/ANTLR/cs.g:1:184: T__90
				{
				mT__90(); 

				}
				break;
			case 31 :
				// /Users/jeremie/ANTLR/cs.g:1:190: T__91
				{
				mT__91(); 

				}
				break;
			case 32 :
				// /Users/jeremie/ANTLR/cs.g:1:196: T__92
				{
				mT__92(); 

				}
				break;
			case 33 :
				// /Users/jeremie/ANTLR/cs.g:1:202: T__93
				{
				mT__93(); 

				}
				break;
			case 34 :
				// /Users/jeremie/ANTLR/cs.g:1:208: T__94
				{
				mT__94(); 

				}
				break;
			case 35 :
				// /Users/jeremie/ANTLR/cs.g:1:214: T__95
				{
				mT__95(); 

				}
				break;
			case 36 :
				// /Users/jeremie/ANTLR/cs.g:1:220: T__96
				{
				mT__96(); 

				}
				break;
			case 37 :
				// /Users/jeremie/ANTLR/cs.g:1:226: T__97
				{
				mT__97(); 

				}
				break;
			case 38 :
				// /Users/jeremie/ANTLR/cs.g:1:232: T__98
				{
				mT__98(); 

				}
				break;
			case 39 :
				// /Users/jeremie/ANTLR/cs.g:1:238: T__99
				{
				mT__99(); 

				}
				break;
			case 40 :
				// /Users/jeremie/ANTLR/cs.g:1:244: T__100
				{
				mT__100(); 

				}
				break;
			case 41 :
				// /Users/jeremie/ANTLR/cs.g:1:251: T__101
				{
				mT__101(); 

				}
				break;
			case 42 :
				// /Users/jeremie/ANTLR/cs.g:1:258: T__102
				{
				mT__102(); 

				}
				break;
			case 43 :
				// /Users/jeremie/ANTLR/cs.g:1:265: T__103
				{
				mT__103(); 

				}
				break;
			case 44 :
				// /Users/jeremie/ANTLR/cs.g:1:272: T__104
				{
				mT__104(); 

				}
				break;
			case 45 :
				// /Users/jeremie/ANTLR/cs.g:1:279: T__105
				{
				mT__105(); 

				}
				break;
			case 46 :
				// /Users/jeremie/ANTLR/cs.g:1:286: T__106
				{
				mT__106(); 

				}
				break;
			case 47 :
				// /Users/jeremie/ANTLR/cs.g:1:293: T__107
				{
				mT__107(); 

				}
				break;
			case 48 :
				// /Users/jeremie/ANTLR/cs.g:1:300: T__108
				{
				mT__108(); 

				}
				break;
			case 49 :
				// /Users/jeremie/ANTLR/cs.g:1:307: T__109
				{
				mT__109(); 

				}
				break;
			case 50 :
				// /Users/jeremie/ANTLR/cs.g:1:314: T__110
				{
				mT__110(); 

				}
				break;
			case 51 :
				// /Users/jeremie/ANTLR/cs.g:1:321: T__111
				{
				mT__111(); 

				}
				break;
			case 52 :
				// /Users/jeremie/ANTLR/cs.g:1:328: T__112
				{
				mT__112(); 

				}
				break;
			case 53 :
				// /Users/jeremie/ANTLR/cs.g:1:335: T__113
				{
				mT__113(); 

				}
				break;
			case 54 :
				// /Users/jeremie/ANTLR/cs.g:1:342: T__114
				{
				mT__114(); 

				}
				break;
			case 55 :
				// /Users/jeremie/ANTLR/cs.g:1:349: T__115
				{
				mT__115(); 

				}
				break;
			case 56 :
				// /Users/jeremie/ANTLR/cs.g:1:356: T__116
				{
				mT__116(); 

				}
				break;
			case 57 :
				// /Users/jeremie/ANTLR/cs.g:1:363: T__117
				{
				mT__117(); 

				}
				break;
			case 58 :
				// /Users/jeremie/ANTLR/cs.g:1:370: T__118
				{
				mT__118(); 

				}
				break;
			case 59 :
				// /Users/jeremie/ANTLR/cs.g:1:377: T__119
				{
				mT__119(); 

				}
				break;
			case 60 :
				// /Users/jeremie/ANTLR/cs.g:1:384: T__120
				{
				mT__120(); 

				}
				break;
			case 61 :
				// /Users/jeremie/ANTLR/cs.g:1:391: T__121
				{
				mT__121(); 

				}
				break;
			case 62 :
				// /Users/jeremie/ANTLR/cs.g:1:398: T__122
				{
				mT__122(); 

				}
				break;
			case 63 :
				// /Users/jeremie/ANTLR/cs.g:1:405: T__123
				{
				mT__123(); 

				}
				break;
			case 64 :
				// /Users/jeremie/ANTLR/cs.g:1:412: T__124
				{
				mT__124(); 

				}
				break;
			case 65 :
				// /Users/jeremie/ANTLR/cs.g:1:419: T__125
				{
				mT__125(); 

				}
				break;
			case 66 :
				// /Users/jeremie/ANTLR/cs.g:1:426: T__126
				{
				mT__126(); 

				}
				break;
			case 67 :
				// /Users/jeremie/ANTLR/cs.g:1:433: T__127
				{
				mT__127(); 

				}
				break;
			case 68 :
				// /Users/jeremie/ANTLR/cs.g:1:440: T__128
				{
				mT__128(); 

				}
				break;
			case 69 :
				// /Users/jeremie/ANTLR/cs.g:1:447: T__129
				{
				mT__129(); 

				}
				break;
			case 70 :
				// /Users/jeremie/ANTLR/cs.g:1:454: T__130
				{
				mT__130(); 

				}
				break;
			case 71 :
				// /Users/jeremie/ANTLR/cs.g:1:461: T__131
				{
				mT__131(); 

				}
				break;
			case 72 :
				// /Users/jeremie/ANTLR/cs.g:1:468: T__132
				{
				mT__132(); 

				}
				break;
			case 73 :
				// /Users/jeremie/ANTLR/cs.g:1:475: T__133
				{
				mT__133(); 

				}
				break;
			case 74 :
				// /Users/jeremie/ANTLR/cs.g:1:482: T__134
				{
				mT__134(); 

				}
				break;
			case 75 :
				// /Users/jeremie/ANTLR/cs.g:1:489: T__135
				{
				mT__135(); 

				}
				break;
			case 76 :
				// /Users/jeremie/ANTLR/cs.g:1:496: T__136
				{
				mT__136(); 

				}
				break;
			case 77 :
				// /Users/jeremie/ANTLR/cs.g:1:503: T__137
				{
				mT__137(); 

				}
				break;
			case 78 :
				// /Users/jeremie/ANTLR/cs.g:1:510: T__138
				{
				mT__138(); 

				}
				break;
			case 79 :
				// /Users/jeremie/ANTLR/cs.g:1:517: T__139
				{
				mT__139(); 

				}
				break;
			case 80 :
				// /Users/jeremie/ANTLR/cs.g:1:524: T__140
				{
				mT__140(); 

				}
				break;
			case 81 :
				// /Users/jeremie/ANTLR/cs.g:1:531: T__141
				{
				mT__141(); 

				}
				break;
			case 82 :
				// /Users/jeremie/ANTLR/cs.g:1:538: T__142
				{
				mT__142(); 

				}
				break;
			case 83 :
				// /Users/jeremie/ANTLR/cs.g:1:545: T__143
				{
				mT__143(); 

				}
				break;
			case 84 :
				// /Users/jeremie/ANTLR/cs.g:1:552: T__144
				{
				mT__144(); 

				}
				break;
			case 85 :
				// /Users/jeremie/ANTLR/cs.g:1:559: T__145
				{
				mT__145(); 

				}
				break;
			case 86 :
				// /Users/jeremie/ANTLR/cs.g:1:566: T__146
				{
				mT__146(); 

				}
				break;
			case 87 :
				// /Users/jeremie/ANTLR/cs.g:1:573: T__147
				{
				mT__147(); 

				}
				break;
			case 88 :
				// /Users/jeremie/ANTLR/cs.g:1:580: T__148
				{
				mT__148(); 

				}
				break;
			case 89 :
				// /Users/jeremie/ANTLR/cs.g:1:587: T__149
				{
				mT__149(); 

				}
				break;
			case 90 :
				// /Users/jeremie/ANTLR/cs.g:1:594: T__150
				{
				mT__150(); 

				}
				break;
			case 91 :
				// /Users/jeremie/ANTLR/cs.g:1:601: T__151
				{
				mT__151(); 

				}
				break;
			case 92 :
				// /Users/jeremie/ANTLR/cs.g:1:608: T__152
				{
				mT__152(); 

				}
				break;
			case 93 :
				// /Users/jeremie/ANTLR/cs.g:1:615: T__153
				{
				mT__153(); 

				}
				break;
			case 94 :
				// /Users/jeremie/ANTLR/cs.g:1:622: T__154
				{
				mT__154(); 

				}
				break;
			case 95 :
				// /Users/jeremie/ANTLR/cs.g:1:629: T__155
				{
				mT__155(); 

				}
				break;
			case 96 :
				// /Users/jeremie/ANTLR/cs.g:1:636: T__156
				{
				mT__156(); 

				}
				break;
			case 97 :
				// /Users/jeremie/ANTLR/cs.g:1:643: T__157
				{
				mT__157(); 

				}
				break;
			case 98 :
				// /Users/jeremie/ANTLR/cs.g:1:650: T__158
				{
				mT__158(); 

				}
				break;
			case 99 :
				// /Users/jeremie/ANTLR/cs.g:1:657: T__159
				{
				mT__159(); 

				}
				break;
			case 100 :
				// /Users/jeremie/ANTLR/cs.g:1:664: T__160
				{
				mT__160(); 

				}
				break;
			case 101 :
				// /Users/jeremie/ANTLR/cs.g:1:671: T__161
				{
				mT__161(); 

				}
				break;
			case 102 :
				// /Users/jeremie/ANTLR/cs.g:1:678: T__162
				{
				mT__162(); 

				}
				break;
			case 103 :
				// /Users/jeremie/ANTLR/cs.g:1:685: T__163
				{
				mT__163(); 

				}
				break;
			case 104 :
				// /Users/jeremie/ANTLR/cs.g:1:692: T__164
				{
				mT__164(); 

				}
				break;
			case 105 :
				// /Users/jeremie/ANTLR/cs.g:1:699: T__165
				{
				mT__165(); 

				}
				break;
			case 106 :
				// /Users/jeremie/ANTLR/cs.g:1:706: T__166
				{
				mT__166(); 

				}
				break;
			case 107 :
				// /Users/jeremie/ANTLR/cs.g:1:713: T__167
				{
				mT__167(); 

				}
				break;
			case 108 :
				// /Users/jeremie/ANTLR/cs.g:1:720: T__168
				{
				mT__168(); 

				}
				break;
			case 109 :
				// /Users/jeremie/ANTLR/cs.g:1:727: T__169
				{
				mT__169(); 

				}
				break;
			case 110 :
				// /Users/jeremie/ANTLR/cs.g:1:734: T__170
				{
				mT__170(); 

				}
				break;
			case 111 :
				// /Users/jeremie/ANTLR/cs.g:1:741: T__171
				{
				mT__171(); 

				}
				break;
			case 112 :
				// /Users/jeremie/ANTLR/cs.g:1:748: T__172
				{
				mT__172(); 

				}
				break;
			case 113 :
				// /Users/jeremie/ANTLR/cs.g:1:755: T__173
				{
				mT__173(); 

				}
				break;
			case 114 :
				// /Users/jeremie/ANTLR/cs.g:1:762: T__174
				{
				mT__174(); 

				}
				break;
			case 115 :
				// /Users/jeremie/ANTLR/cs.g:1:769: T__175
				{
				mT__175(); 

				}
				break;
			case 116 :
				// /Users/jeremie/ANTLR/cs.g:1:776: T__176
				{
				mT__176(); 

				}
				break;
			case 117 :
				// /Users/jeremie/ANTLR/cs.g:1:783: T__177
				{
				mT__177(); 

				}
				break;
			case 118 :
				// /Users/jeremie/ANTLR/cs.g:1:790: T__178
				{
				mT__178(); 

				}
				break;
			case 119 :
				// /Users/jeremie/ANTLR/cs.g:1:797: T__179
				{
				mT__179(); 

				}
				break;
			case 120 :
				// /Users/jeremie/ANTLR/cs.g:1:804: T__180
				{
				mT__180(); 

				}
				break;
			case 121 :
				// /Users/jeremie/ANTLR/cs.g:1:811: T__181
				{
				mT__181(); 

				}
				break;
			case 122 :
				// /Users/jeremie/ANTLR/cs.g:1:818: T__182
				{
				mT__182(); 

				}
				break;
			case 123 :
				// /Users/jeremie/ANTLR/cs.g:1:825: T__183
				{
				mT__183(); 

				}
				break;
			case 124 :
				// /Users/jeremie/ANTLR/cs.g:1:832: T__184
				{
				mT__184(); 

				}
				break;
			case 125 :
				// /Users/jeremie/ANTLR/cs.g:1:839: T__185
				{
				mT__185(); 

				}
				break;
			case 126 :
				// /Users/jeremie/ANTLR/cs.g:1:846: T__186
				{
				mT__186(); 

				}
				break;
			case 127 :
				// /Users/jeremie/ANTLR/cs.g:1:853: T__187
				{
				mT__187(); 

				}
				break;
			case 128 :
				// /Users/jeremie/ANTLR/cs.g:1:860: T__188
				{
				mT__188(); 

				}
				break;
			case 129 :
				// /Users/jeremie/ANTLR/cs.g:1:867: T__189
				{
				mT__189(); 

				}
				break;
			case 130 :
				// /Users/jeremie/ANTLR/cs.g:1:874: T__190
				{
				mT__190(); 

				}
				break;
			case 131 :
				// /Users/jeremie/ANTLR/cs.g:1:881: T__191
				{
				mT__191(); 

				}
				break;
			case 132 :
				// /Users/jeremie/ANTLR/cs.g:1:888: T__192
				{
				mT__192(); 

				}
				break;
			case 133 :
				// /Users/jeremie/ANTLR/cs.g:1:895: T__193
				{
				mT__193(); 

				}
				break;
			case 134 :
				// /Users/jeremie/ANTLR/cs.g:1:902: T__194
				{
				mT__194(); 

				}
				break;
			case 135 :
				// /Users/jeremie/ANTLR/cs.g:1:909: T__195
				{
				mT__195(); 

				}
				break;
			case 136 :
				// /Users/jeremie/ANTLR/cs.g:1:916: T__196
				{
				mT__196(); 

				}
				break;
			case 137 :
				// /Users/jeremie/ANTLR/cs.g:1:923: T__197
				{
				mT__197(); 

				}
				break;
			case 138 :
				// /Users/jeremie/ANTLR/cs.g:1:930: T__198
				{
				mT__198(); 

				}
				break;
			case 139 :
				// /Users/jeremie/ANTLR/cs.g:1:937: T__199
				{
				mT__199(); 

				}
				break;
			case 140 :
				// /Users/jeremie/ANTLR/cs.g:1:944: T__200
				{
				mT__200(); 

				}
				break;
			case 141 :
				// /Users/jeremie/ANTLR/cs.g:1:951: T__201
				{
				mT__201(); 

				}
				break;
			case 142 :
				// /Users/jeremie/ANTLR/cs.g:1:958: T__202
				{
				mT__202(); 

				}
				break;
			case 143 :
				// /Users/jeremie/ANTLR/cs.g:1:965: TRUE
				{
				mTRUE(); 

				}
				break;
			case 144 :
				// /Users/jeremie/ANTLR/cs.g:1:970: FALSE
				{
				mFALSE(); 

				}
				break;
			case 145 :
				// /Users/jeremie/ANTLR/cs.g:1:976: NULL
				{
				mNULL(); 

				}
				break;
			case 146 :
				// /Users/jeremie/ANTLR/cs.g:1:981: DOT
				{
				mDOT(); 

				}
				break;
			case 147 :
				// /Users/jeremie/ANTLR/cs.g:1:985: PTR
				{
				mPTR(); 

				}
				break;
			case 148 :
				// /Users/jeremie/ANTLR/cs.g:1:989: MINUS
				{
				mMINUS(); 

				}
				break;
			case 149 :
				// /Users/jeremie/ANTLR/cs.g:1:995: GT
				{
				mGT(); 

				}
				break;
			case 150 :
				// /Users/jeremie/ANTLR/cs.g:1:998: USING
				{
				mUSING(); 

				}
				break;
			case 151 :
				// /Users/jeremie/ANTLR/cs.g:1:1004: ENUM
				{
				mENUM(); 

				}
				break;
			case 152 :
				// /Users/jeremie/ANTLR/cs.g:1:1009: IF
				{
				mIF(); 

				}
				break;
			case 153 :
				// /Users/jeremie/ANTLR/cs.g:1:1012: ELIF
				{
				mELIF(); 

				}
				break;
			case 154 :
				// /Users/jeremie/ANTLR/cs.g:1:1017: ENDIF
				{
				mENDIF(); 

				}
				break;
			case 155 :
				// /Users/jeremie/ANTLR/cs.g:1:1023: DEFINE
				{
				mDEFINE(); 

				}
				break;
			case 156 :
				// /Users/jeremie/ANTLR/cs.g:1:1030: UNDEF
				{
				mUNDEF(); 

				}
				break;
			case 157 :
				// /Users/jeremie/ANTLR/cs.g:1:1036: SEMI
				{
				mSEMI(); 

				}
				break;
			case 158 :
				// /Users/jeremie/ANTLR/cs.g:1:1041: RPAREN
				{
				mRPAREN(); 

				}
				break;
			case 159 :
				// /Users/jeremie/ANTLR/cs.g:1:1048: WS
				{
				mWS(); 

				}
				break;
			case 160 :
				// /Users/jeremie/ANTLR/cs.g:1:1051: DOC_LINE_COMMENT
				{
				mDOC_LINE_COMMENT(); 

				}
				break;
			case 161 :
				// /Users/jeremie/ANTLR/cs.g:1:1068: LINE_COMMENT
				{
				mLINE_COMMENT(); 

				}
				break;
			case 162 :
				// /Users/jeremie/ANTLR/cs.g:1:1081: COMMENT
				{
				mCOMMENT(); 

				}
				break;
			case 163 :
				// /Users/jeremie/ANTLR/cs.g:1:1089: STRINGLITERAL
				{
				mSTRINGLITERAL(); 

				}
				break;
			case 164 :
				// /Users/jeremie/ANTLR/cs.g:1:1103: Verbatim_string_literal
				{
				mVerbatim_string_literal(); 

				}
				break;
			case 165 :
				// /Users/jeremie/ANTLR/cs.g:1:1127: NUMBER
				{
				mNUMBER(); 

				}
				break;
			case 166 :
				// /Users/jeremie/ANTLR/cs.g:1:1134: GooBall
				{
				mGooBall(); 

				}
				break;
			case 167 :
				// /Users/jeremie/ANTLR/cs.g:1:1142: Real_literal
				{
				mReal_literal(); 

				}
				break;
			case 168 :
				// /Users/jeremie/ANTLR/cs.g:1:1155: Character_literal
				{
				mCharacter_literal(); 

				}
				break;
			case 169 :
				// /Users/jeremie/ANTLR/cs.g:1:1173: IDENTIFIER
				{
				mIDENTIFIER(); 

				}
				break;
			case 170 :
				// /Users/jeremie/ANTLR/cs.g:1:1184: Pragma
				{
				mPragma(); 

				}
				break;
			case 171 :
				// /Users/jeremie/ANTLR/cs.g:1:1191: PREPROCESSOR_DIRECTIVE
				{
				mPREPROCESSOR_DIRECTIVE(); 

				}
				break;
			case 172 :
				// /Users/jeremie/ANTLR/cs.g:1:1214: Hex_number
				{
				mHex_number(); 

				}
				break;

		}
	}


	protected DFA16 dfa16 = new DFA16(this);
	protected DFA23 dfa23 = new DFA23(this);
	protected DFA37 dfa37 = new DFA37(this);
	protected DFA61 dfa61 = new DFA61(this);
	static final String DFA16_eotS =
		"\6\uffff";
	static final String DFA16_eofS =
		"\6\uffff";
	static final String DFA16_minS =
		"\2\56\4\uffff";
	static final String DFA16_maxS =
		"\1\71\1\155\4\uffff";
	static final String DFA16_acceptS =
		"\2\uffff\1\2\1\1\1\3\1\4";
	static final String DFA16_specialS =
		"\6\uffff}>";
	static final String[] DFA16_transitionS = {
			"\1\2\1\uffff\12\1",
			"\1\3\1\uffff\12\1\12\uffff\1\5\1\4\1\5\6\uffff\1\5\26\uffff\1\5\1\4"+
			"\1\5\6\uffff\1\5",
			"",
			"",
			"",
			""
	};

	static final short[] DFA16_eot = DFA.unpackEncodedString(DFA16_eotS);
	static final short[] DFA16_eof = DFA.unpackEncodedString(DFA16_eofS);
	static final char[] DFA16_min = DFA.unpackEncodedStringToUnsignedChars(DFA16_minS);
	static final char[] DFA16_max = DFA.unpackEncodedStringToUnsignedChars(DFA16_maxS);
	static final short[] DFA16_accept = DFA.unpackEncodedString(DFA16_acceptS);
	static final short[] DFA16_special = DFA.unpackEncodedString(DFA16_specialS);
	static final short[][] DFA16_transition;

	static {
		int numStates = DFA16_transitionS.length;
		DFA16_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA16_transition[i] = DFA.unpackEncodedString(DFA16_transitionS[i]);
		}
	}

	protected class DFA16 extends DFA {

		public DFA16(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 16;
			this.eot = DFA16_eot;
			this.eof = DFA16_eof;
			this.min = DFA16_min;
			this.max = DFA16_max;
			this.accept = DFA16_accept;
			this.special = DFA16_special;
			this.transition = DFA16_transition;
		}
		@Override
		public String getDescription() {
			return "1125:1: Real_literal : ( Decimal_digits '.' Decimal_digits ( Exponent_part )? ( Real_type_suffix )? | '.' Decimal_digits ( Exponent_part )? ( Real_type_suffix )? | Decimal_digits Exponent_part ( Real_type_suffix )? | Decimal_digits Real_type_suffix );";
		}
	}

	static final String DFA23_eotS =
		"\11\uffff";
	static final String DFA23_eofS =
		"\11\uffff";
	static final String DFA23_minS =
		"\1\43\1\11\1\154\1\11\5\uffff";
	static final String DFA23_maxS =
		"\1\43\1\165\1\156\1\165\5\uffff";
	static final String DFA23_acceptS =
		"\4\uffff\1\1\1\2\1\5\1\4\1\3";
	static final String DFA23_specialS =
		"\11\uffff}>";
	static final String[] DFA23_transitionS = {
			"\1\1",
			"\1\3\26\uffff\1\3\103\uffff\1\5\1\2\3\uffff\1\4\13\uffff\1\6",
			"\1\10\1\uffff\1\7",
			"\1\3\26\uffff\1\3\103\uffff\1\5\1\10\3\uffff\1\4\13\uffff\1\6",
			"",
			"",
			"",
			"",
			""
	};

	static final short[] DFA23_eot = DFA.unpackEncodedString(DFA23_eotS);
	static final short[] DFA23_eof = DFA.unpackEncodedString(DFA23_eofS);
	static final char[] DFA23_min = DFA.unpackEncodedStringToUnsignedChars(DFA23_minS);
	static final char[] DFA23_max = DFA.unpackEncodedStringToUnsignedChars(DFA23_maxS);
	static final short[] DFA23_accept = DFA.unpackEncodedString(DFA23_acceptS);
	static final short[] DFA23_special = DFA.unpackEncodedString(DFA23_specialS);
	static final short[][] DFA23_transition;

	static {
		int numStates = DFA23_transitionS.length;
		DFA23_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA23_transition[i] = DFA.unpackEncodedString(DFA23_transitionS[i]);
		}
	}

	protected class DFA23 extends DFA {

		public DFA23(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 23;
			this.eot = DFA23_eot;
			this.eof = DFA23_eof;
			this.min = DFA23_min;
			this.max = DFA23_max;
			this.accept = DFA23_accept;
			this.special = DFA23_special;
			this.transition = DFA23_transition;
		}
		@Override
		public String getDescription() {
			return "1150:2: ( IF_TOKEN | DEFINE_TOKEN | ELSE_TOKEN | ENDIF_TOKEN | UNDEF_TOKEN )";
		}
	}

	static final String DFA37_eotS =
		"\7\uffff";
	static final String DFA37_eofS =
		"\7\uffff";
	static final String DFA37_minS =
		"\1\43\2\11\1\154\1\151\2\uffff";
	static final String DFA37_maxS =
		"\1\43\2\145\1\154\1\163\2\uffff";
	static final String DFA37_acceptS =
		"\5\uffff\1\1\1\2";
	static final String DFA37_specialS =
		"\7\uffff}>";
	static final String[] DFA37_transitionS = {
			"\1\1",
			"\1\2\26\uffff\1\2\104\uffff\1\3",
			"\1\2\26\uffff\1\2\104\uffff\1\3",
			"\1\4",
			"\1\6\11\uffff\1\5",
			"",
			""
	};

	static final short[] DFA37_eot = DFA.unpackEncodedString(DFA37_eotS);
	static final short[] DFA37_eof = DFA.unpackEncodedString(DFA37_eofS);
	static final char[] DFA37_min = DFA.unpackEncodedStringToUnsignedChars(DFA37_minS);
	static final char[] DFA37_max = DFA.unpackEncodedStringToUnsignedChars(DFA37_maxS);
	static final short[] DFA37_accept = DFA.unpackEncodedString(DFA37_acceptS);
	static final short[] DFA37_special = DFA.unpackEncodedString(DFA37_specialS);
	static final short[][] DFA37_transition;

	static {
		int numStates = DFA37_transitionS.length;
		DFA37_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA37_transition[i] = DFA.unpackEncodedString(DFA37_transitionS[i]);
		}
	}

	protected class DFA37 extends DFA {

		public DFA37(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 37;
			this.eot = DFA37_eot;
			this.eof = DFA37_eof;
			this.min = DFA37_min;
			this.max = DFA37_max;
			this.accept = DFA37_accept;
			this.special = DFA37_special;
			this.transition = DFA37_transition;
		}
		@Override
		public String getDescription() {
			return "1168:2: ( '#' ( TS )* e= 'else' | '#' ( TS )* 'elif' ( TS )+ PP_EXPRESSION )";
		}
	}

	static final String DFA61_eotS =
		"\1\66\1\71\1\73\1\76\1\uffff\1\100\1\103\1\uffff\1\107\1\113\1\115\1\120"+
		"\1\123\1\125\1\127\2\uffff\1\131\26\64\1\uffff\1\u00a1\2\uffff\1\u00a2"+
		"\4\uffff\1\64\1\u00a6\4\uffff\1\u00a6\26\uffff\1\u00b1\13\uffff\4\64\1"+
		"\u00b8\3\64\1\u00bd\5\64\1\u00c9\17\64\1\u00df\1\u00e0\1\u00e1\11\64\1"+
		"\u00ec\32\64\10\uffff\4\u00a6\7\uffff\2\64\1\u0124\3\64\1\uffff\4\64\1"+
		"\uffff\13\64\1\uffff\15\64\1\u0147\2\64\1\u014a\3\64\1\u0150\3\uffff\1"+
		"\64\1\u0152\5\64\1\u0158\2\64\1\uffff\2\64\1\u015d\7\64\1\u0167\5\64\1"+
		"\u016d\7\64\1\u0177\11\64\1\u0181\6\64\2\u00a6\1\uffff\6\u00a6\2\uffff"+
		"\1\u0189\2\64\1\uffff\3\64\1\u018f\1\u0190\1\64\1\u0192\1\u0193\1\64\1"+
		"\u0195\13\64\1\u01a1\1\u01a2\4\64\1\u01a7\6\64\1\uffff\1\u01ae\1\64\1"+
		"\uffff\1\u01b0\3\64\1\u01b4\1\uffff\1\u01b5\1\uffff\1\u01b6\1\u01b7\3"+
		"\64\1\uffff\1\u01bb\3\64\1\uffff\11\64\1\uffff\5\64\1\uffff\7\64\1\u01d4"+
		"\1\64\1\uffff\1\u01d6\1\u01d8\1\u01d9\6\64\1\uffff\1\64\1\u01e1\4\64\2"+
		"\uffff\2\64\1\u01e8\2\64\2\uffff\1\u01eb\2\uffff\1\u01ec\1\uffff\1\64"+
		"\1\u01ee\1\u01ef\10\64\2\uffff\1\64\1\u01f9\2\64\1\uffff\1\u01fc\1\u01fd"+
		"\1\64\1\u01ff\1\u0200\1\64\1\uffff\1\u0202\1\uffff\1\u0203\2\64\4\uffff"+
		"\3\64\1\uffff\4\64\1\u020f\11\64\1\u0219\2\64\1\u021c\6\64\1\uffff\1\u0223"+
		"\1\uffff\1\64\2\uffff\1\u0225\2\64\1\u0228\1\64\1\u022a\1\64\1\uffff\1"+
		"\64\1\u022d\1\u022e\1\u022f\2\64\1\uffff\2\64\2\uffff\1\64\2\uffff\3\64"+
		"\1\u0238\2\64\1\u023b\1\64\1\u023d\1\uffff\1\64\1\u023f\2\uffff\1\64\2"+
		"\uffff\1\64\2\uffff\3\64\1\u0245\1\u0246\1\64\1\u0248\3\64\1\u024c\1\uffff"+
		"\1\64\1\u024e\3\64\1\u0252\1\64\1\u0254\1\u0255\1\uffff\1\u0256\1\u0257"+
		"\1\uffff\1\u0258\1\64\1\u025a\1\u025b\1\u025c\1\u025d\1\uffff\1\u025e"+
		"\1\uffff\1\64\1\u0260\1\uffff\1\u0261\1\uffff\2\64\3\uffff\4\64\1\u0268"+
		"\1\64\1\u026a\1\u026b\1\uffff\2\64\1\uffff\1\u026e\1\uffff\1\64\1\uffff"+
		"\1\u0270\1\u0271\3\64\2\uffff\1\64\1\uffff\1\64\1\u0277\1\64\1\uffff\1"+
		"\u0279\1\uffff\1\u027a\2\64\1\uffff\1\64\5\uffff\1\64\5\uffff\1\64\2\uffff"+
		"\1\u0280\2\64\1\u0283\1\64\1\u0285\1\uffff\1\u0286\2\uffff\1\u0287\1\64"+
		"\1\uffff\1\u0289\2\uffff\1\u028a\1\64\1\u028c\1\64\1\u028e\1\uffff\1\u028f"+
		"\2\uffff\1\u0290\1\64\1\u0292\2\64\1\uffff\1\u0295\1\u0296\1\uffff\1\u0297"+
		"\3\uffff\1\64\2\uffff\1\u0299\1\uffff\1\u029a\3\uffff\1\u029b\1\uffff"+
		"\1\64\1\u029d\3\uffff\1\u029e\3\uffff\1\u029f\3\uffff";
	static final String DFA61_eofS =
		"\u02a0\uffff";
	static final String DFA61_minS =
		"\1\11\2\75\1\46\1\uffff\1\75\1\53\1\uffff\1\55\1\52\1\72\1\74\2\75\1\77"+
		"\2\uffff\1\75\1\137\1\142\2\141\1\145\1\154\1\141\1\145\1\146\1\157\2"+
		"\145\1\141\1\142\1\141\1\145\1\142\1\150\1\151\1\141\1\150\1\151\1\uffff"+
		"\1\75\2\uffff\1\60\4\uffff\1\42\1\56\2\uffff\1\11\1\uffff\1\56\21\uffff"+
		"\1\0\4\uffff\1\75\13\uffff\1\141\1\163\1\144\1\151\1\60\1\163\1\157\1"+
		"\145\1\60\1\163\2\141\1\156\1\143\1\60\1\156\1\151\1\165\1\145\1\160\1"+
		"\144\1\145\1\157\1\162\1\157\1\154\2\164\1\157\1\160\3\60\1\151\1\164"+
		"\1\143\1\164\1\144\1\155\1\167\1\154\1\152\1\60\1\145\1\144\1\164\1\145"+
		"\1\162\1\141\1\142\1\141\1\171\1\141\1\157\1\172\1\141\2\151\1\165\1\160"+
		"\1\156\1\157\1\143\1\150\2\162\1\151\2\145\10\uffff\4\56\1\60\1\154\1"+
		"\uffff\1\0\3\uffff\1\162\1\164\1\60\1\141\2\145\1\uffff\1\145\1\154\1"+
		"\141\1\145\1\uffff\1\145\1\143\1\162\1\143\2\163\1\151\1\141\1\145\1\143"+
		"\1\142\1\uffff\1\141\1\145\1\146\1\141\1\156\1\154\1\145\1\155\1\151\1"+
		"\154\1\141\1\145\1\141\1\60\1\155\1\163\1\60\1\157\1\165\1\154\1\60\3"+
		"\uffff\1\156\1\60\1\153\1\147\1\150\1\165\1\145\1\60\1\154\1\145\1\uffff"+
		"\1\162\1\145\1\60\1\162\1\141\1\147\1\166\1\160\1\154\1\144\1\60\1\157"+
		"\1\165\1\164\1\154\1\145\1\60\1\162\1\145\1\143\1\151\1\164\1\163\1\157"+
		"\1\60\2\145\1\164\1\156\1\150\1\141\1\145\1\157\1\156\1\60\1\164\1\144"+
		"\1\141\1\162\2\154\2\56\1\uffff\6\56\1\144\1\0\1\12\1\147\1\162\1\uffff"+
		"\1\163\1\156\1\155\2\60\1\153\2\60\1\150\1\60\1\153\1\163\1\164\1\151"+
		"\1\155\1\165\1\156\1\147\1\145\1\154\1\155\2\60\1\154\1\164\1\151\1\162"+
		"\1\60\1\146\1\144\1\154\1\144\1\164\1\141\1\uffff\1\60\1\145\1\uffff\1"+
		"\60\1\160\1\151\1\162\1\60\1\uffff\1\60\1\uffff\2\60\1\157\1\154\1\163"+
		"\1\uffff\1\60\1\143\1\141\1\162\1\uffff\1\162\1\155\1\151\1\155\1\141"+
		"\2\145\1\151\1\157\1\uffff\1\166\1\162\2\145\1\143\1\uffff\1\164\1\157"+
		"\1\153\1\151\1\156\2\143\1\60\1\167\1\uffff\3\60\1\147\1\145\2\146\1\162"+
		"\1\147\1\uffff\1\165\1\60\1\164\2\145\1\144\1\151\1\uffff\1\154\1\141"+
		"\1\60\1\144\1\142\2\uffff\1\60\2\uffff\1\60\1\uffff\1\145\2\60\1\156\1"+
		"\141\1\154\1\145\1\141\1\156\1\145\1\151\2\uffff\1\163\1\60\1\143\1\156"+
		"\1\uffff\2\60\1\154\2\60\1\143\1\uffff\1\60\1\uffff\1\60\1\143\1\146\4"+
		"\uffff\1\144\1\145\1\160\1\uffff\2\164\1\142\1\151\1\60\2\141\1\164\1"+
		"\162\2\143\1\156\1\145\1\156\1\60\1\144\1\164\1\60\1\146\1\141\1\143\1"+
		"\147\1\164\1\150\1\uffff\1\60\1\uffff\1\146\2\uffff\1\60\1\143\1\145\1"+
		"\60\1\164\1\60\1\141\1\uffff\1\151\3\60\1\151\1\143\1\uffff\1\151\1\154"+
		"\2\uffff\1\144\2\uffff\1\165\1\154\1\164\1\60\1\164\1\144\1\60\1\143\1"+
		"\60\1\uffff\1\151\1\60\2\uffff\1\171\2\uffff\1\150\2\uffff\1\151\2\141"+
		"\2\60\1\141\1\60\1\157\1\171\1\144\1\60\1\uffff\1\154\1\60\1\145\2\164"+
		"\1\60\1\154\2\60\1\uffff\2\60\1\uffff\1\60\1\154\4\60\1\uffff\1\60\1\uffff"+
		"\1\153\1\60\1\uffff\1\60\1\uffff\2\154\3\uffff\1\163\1\164\1\156\1\171"+
		"\1\60\1\145\2\60\1\uffff\1\145\1\151\1\uffff\1\60\1\uffff\1\164\1\uffff"+
		"\2\60\1\164\1\143\1\154\2\uffff\1\143\1\uffff\1\162\1\60\1\145\1\uffff"+
		"\1\60\1\uffff\1\60\1\171\1\145\1\uffff\1\171\5\uffff\1\154\5\uffff\1\145"+
		"\2\uffff\1\60\1\145\1\164\1\60\1\147\1\60\1\uffff\1\60\2\uffff\1\60\1"+
		"\156\1\uffff\1\60\2\uffff\1\60\1\145\1\60\1\145\1\60\1\uffff\1\60\2\uffff"+
		"\1\60\1\144\1\60\1\157\1\144\1\uffff\2\60\1\uffff\1\60\3\uffff\1\147\2"+
		"\uffff\1\60\1\uffff\1\60\3\uffff\1\60\1\uffff\1\143\1\60\3\uffff\1\60"+
		"\3\uffff\1\60\3\uffff";
	static final String DFA61_maxS =
		"\1\176\3\75\1\uffff\2\75\1\uffff\1\76\1\75\1\72\1\75\1\76\1\75\1\77\2"+
		"\uffff\1\75\1\137\1\163\1\171\1\157\1\171\1\170\2\162\1\163\3\157\1\165"+
		"\1\166\1\165\1\145\1\167\1\171\1\163\1\157\1\150\1\151\1\uffff\1\174\2"+
		"\uffff\1\71\4\uffff\1\42\1\170\2\uffff\1\167\1\uffff\1\165\21\uffff\1"+
		"\uffff\4\uffff\1\75\13\uffff\1\141\1\163\1\144\1\151\1\172\1\163\1\157"+
		"\1\145\1\172\1\164\1\145\1\141\1\156\1\163\1\172\1\156\1\163\1\165\1\145"+
		"\1\164\1\165\1\170\1\157\1\162\1\157\1\154\2\164\1\157\1\160\3\172\1\151"+
		"\1\164\1\156\1\164\1\144\1\155\1\167\1\154\1\152\1\172\1\145\1\144\1\164"+
		"\1\145\1\162\1\157\1\142\1\164\1\171\1\164\1\157\1\172\1\162\1\151\1\162"+
		"\1\171\1\160\1\156\1\157\1\163\1\151\2\162\1\154\1\151\1\145\10\uffff"+
		"\2\154\2\165\1\172\1\162\1\uffff\1\uffff\3\uffff\1\162\1\164\1\172\1\141"+
		"\2\145\1\uffff\1\145\1\154\1\141\1\145\1\uffff\1\145\1\143\1\162\1\143"+
		"\1\163\1\164\2\151\1\145\1\143\1\142\1\uffff\1\141\1\145\1\146\1\141\1"+
		"\156\1\154\1\145\1\155\1\151\1\154\1\141\1\145\1\141\1\172\1\155\1\163"+
		"\1\172\1\157\1\165\1\154\1\172\3\uffff\1\156\1\172\1\153\1\147\1\150\1"+
		"\165\1\145\1\172\1\154\1\145\1\uffff\1\162\1\145\1\172\1\162\1\164\1\147"+
		"\1\166\1\164\1\154\1\144\1\172\1\157\1\165\1\164\1\154\1\145\1\172\1\162"+
		"\1\145\1\164\1\165\1\164\1\163\1\157\1\172\2\145\1\164\1\156\1\150\1\141"+
		"\1\145\1\157\1\156\1\172\1\164\1\144\1\141\1\162\2\154\2\56\1\uffff\6"+
		"\56\1\144\1\uffff\1\15\1\147\1\162\1\uffff\1\163\1\156\1\155\2\172\1\153"+
		"\2\172\1\150\1\172\1\153\1\163\1\164\1\151\1\155\1\165\1\156\1\147\1\145"+
		"\1\154\1\155\2\172\1\154\1\164\1\151\1\162\1\172\1\146\1\144\1\154\1\144"+
		"\1\164\1\141\1\uffff\1\172\1\145\1\uffff\1\172\1\160\1\151\1\162\1\172"+
		"\1\uffff\1\172\1\uffff\2\172\1\157\1\154\1\163\1\uffff\1\172\1\143\1\141"+
		"\1\162\1\uffff\1\162\1\155\1\151\1\155\1\141\2\145\1\151\1\157\1\uffff"+
		"\1\166\1\162\2\145\1\143\1\uffff\1\164\1\157\1\153\1\151\1\156\2\143\1"+
		"\172\1\167\1\uffff\3\172\1\147\1\145\2\146\1\162\1\147\1\uffff\1\165\1"+
		"\172\1\164\2\145\1\144\1\162\1\uffff\1\154\1\141\1\172\1\144\1\142\2\uffff"+
		"\1\172\2\uffff\1\172\1\uffff\1\145\2\172\1\156\1\141\1\154\1\145\1\141"+
		"\1\156\1\145\1\151\2\uffff\1\163\1\172\1\143\1\156\1\uffff\2\172\1\154"+
		"\2\172\1\143\1\uffff\1\172\1\uffff\1\172\1\143\1\156\4\uffff\1\144\1\145"+
		"\1\160\1\uffff\2\164\1\142\1\151\1\172\2\141\1\164\1\162\2\143\1\156\1"+
		"\145\1\156\1\172\1\144\1\164\1\172\1\146\1\141\1\143\1\147\1\164\1\150"+
		"\1\uffff\1\172\1\uffff\1\146\2\uffff\1\172\1\143\1\145\1\172\1\164\1\172"+
		"\1\141\1\uffff\1\151\3\172\1\151\1\143\1\uffff\1\151\1\154\2\uffff\1\144"+
		"\2\uffff\1\165\1\154\1\164\1\172\1\164\1\144\1\172\1\143\1\172\1\uffff"+
		"\1\151\1\172\2\uffff\1\171\2\uffff\1\150\2\uffff\1\151\2\141\2\172\1\141"+
		"\1\172\1\157\1\171\1\144\1\172\1\uffff\1\154\1\172\1\145\2\164\1\172\1"+
		"\154\2\172\1\uffff\2\172\1\uffff\1\172\1\154\4\172\1\uffff\1\172\1\uffff"+
		"\1\153\1\172\1\uffff\1\172\1\uffff\2\154\3\uffff\1\163\1\164\1\156\1\171"+
		"\1\172\1\145\2\172\1\uffff\1\145\1\151\1\uffff\1\172\1\uffff\1\164\1\uffff"+
		"\2\172\1\164\1\143\1\154\2\uffff\1\143\1\uffff\1\162\1\172\1\145\1\uffff"+
		"\1\172\1\uffff\1\172\1\171\1\145\1\uffff\1\171\5\uffff\1\154\5\uffff\1"+
		"\145\2\uffff\1\172\1\145\1\164\1\172\1\147\1\172\1\uffff\1\172\2\uffff"+
		"\1\172\1\156\1\uffff\1\172\2\uffff\1\172\1\145\1\172\1\145\1\172\1\uffff"+
		"\1\172\2\uffff\1\172\1\144\1\172\1\157\1\144\1\uffff\2\172\1\uffff\1\172"+
		"\3\uffff\1\147\2\uffff\1\172\1\uffff\1\172\3\uffff\1\172\1\uffff\1\143"+
		"\1\172\3\uffff\1\172\3\uffff\1\172\3\uffff";
	static final String DFA61_acceptS =
		"\4\uffff\1\10\2\uffff\1\16\7\uffff\1\37\1\40\27\uffff\1\u0089\1\uffff"+
		"\1\u008d\1\u008e\1\uffff\1\u009d\1\u009e\1\u009f\1\u00a3\2\uffff\1\u00a8"+
		"\1\u00a9\1\uffff\1\u00ab\1\uffff\1\2\1\1\1\4\1\3\1\5\1\7\1\6\1\12\1\11"+
		"\1\14\1\15\1\13\1\17\1\20\1\u0093\1\u0094\1\22\1\uffff\1\u00a2\1\21\1"+
		"\24\1\23\1\uffff\1\30\1\25\1\32\1\33\1\31\1\34\1\u0095\1\36\1\35\1\42"+
		"\1\41\105\uffff\1\u008b\1\u008c\1\u008a\1\u0092\1\u00a7\1\u00a4\1\u00ac"+
		"\1\u00a5\6\uffff\1\u00aa\1\uffff\1\u00a1\1\27\1\26\6\uffff\1\47\4\uffff"+
		"\1\55\13\uffff\1\72\25\uffff\1\115\1\122\1\u0098\12\uffff\1\134\53\uffff"+
		"\1\u00a6\13\uffff\1\45\42\uffff\1\106\2\uffff\1\111\5\uffff\1\116\1\uffff"+
		"\1\124\5\uffff\1\132\4\uffff\1\137\11\uffff\1\152\5\uffff\1\160\11\uffff"+
		"\1\172\11\uffff\1\u0082\7\uffff\1\u00a0\5\uffff\1\52\1\53\1\uffff\1\56"+
		"\1\57\1\uffff\1\61\13\uffff\1\75\1\u0099\4\uffff\1\u0097\6\uffff\1\110"+
		"\1\uffff\1\112\3\uffff\1\121\1\123\1\125\1\126\3\uffff\1\u0091\30\uffff"+
		"\1\170\1\uffff\1\u008f\1\uffff\1\173\1\175\7\uffff\1\u0084\6\uffff\1\46"+
		"\2\uffff\1\54\1\60\1\uffff\1\63\1\64\11\uffff\1\77\2\uffff\1\u009a\1\102"+
		"\1\uffff\1\104\1\105\1\uffff\1\u0090\1\113\13\uffff\1\141\11\uffff\1\155"+
		"\2\uffff\1\161\6\uffff\1\171\1\uffff\1\176\2\uffff\1\u009c\1\uffff\1\u0096"+
		"\2\uffff\1\u0086\1\u0087\1\u0088\10\uffff\1\u009b\2\uffff\1\73\1\uffff"+
		"\1\76\1\uffff\1\101\5\uffff\1\127\1\130\1\uffff\1\133\3\uffff\1\142\1"+
		"\uffff\1\144\3\uffff\1\150\1\uffff\1\153\1\154\1\156\1\157\1\162\1\uffff"+
		"\1\164\1\165\1\166\1\167\1\174\1\uffff\1\u0080\1\u0081\6\uffff\1\62\1"+
		"\uffff\1\66\1\67\2\uffff\1\74\1\uffff\1\103\1\107\5\uffff\1\136\1\uffff"+
		"\1\143\1\145\5\uffff\1\u0083\2\uffff\1\44\1\uffff\1\51\1\65\1\70\1\uffff"+
		"\1\100\1\114\1\uffff\1\120\1\uffff\1\135\1\140\1\146\1\uffff\1\151\2\uffff"+
		"\1\u0085\1\43\1\50\1\uffff\1\117\1\131\1\147\1\uffff\1\177\1\71\1\163";
	static final String DFA61_specialS =
		"\111\uffff\1\0\144\uffff\1\2\161\uffff\1\1\u017f\uffff}>";
	static final String[] DFA61_transitionS = {
			"\2\57\2\uffff\1\57\22\uffff\1\57\1\1\1\60\1\65\1\uffff\1\2\1\3\1\63\1"+
			"\4\1\56\1\5\1\6\1\7\1\10\1\54\1\11\1\62\11\67\1\12\1\55\1\13\1\14\1\15"+
			"\1\16\1\61\32\64\1\17\1\uffff\1\20\1\21\1\22\1\uffff\1\23\1\24\1\25\1"+
			"\26\1\27\1\30\1\31\1\64\1\32\1\33\1\64\1\34\1\35\1\36\1\37\1\40\1\64"+
			"\1\41\1\42\1\43\1\44\1\45\1\46\1\64\1\47\1\64\1\50\1\51\1\52\1\53",
			"\1\70",
			"\1\72",
			"\1\74\26\uffff\1\75",
			"",
			"\1\77",
			"\1\101\21\uffff\1\102",
			"",
			"\1\104\17\uffff\1\105\1\106",
			"\1\112\4\uffff\1\111\15\uffff\1\110",
			"\1\114",
			"\1\116\1\117",
			"\1\121\1\122",
			"\1\124",
			"\1\126",
			"",
			"",
			"\1\130",
			"\1\132",
			"\1\133\1\uffff\1\134\7\uffff\1\135\6\uffff\1\136",
			"\1\137\15\uffff\1\140\2\uffff\1\141\6\uffff\1\142",
			"\1\143\6\uffff\1\144\3\uffff\1\145\2\uffff\1\146",
			"\1\147\11\uffff\1\150\11\uffff\1\151",
			"\1\152\1\uffff\1\156\2\uffff\1\153\4\uffff\1\154\1\uffff\1\155",
			"\1\163\7\uffff\1\157\2\uffff\1\160\2\uffff\1\161\2\uffff\1\162",
			"\1\164\11\uffff\1\165\2\uffff\1\166",
			"\1\172\6\uffff\1\167\1\170\4\uffff\1\171",
			"\1\173",
			"\1\174\11\uffff\1\175",
			"\1\176\11\uffff\1\177",
			"\1\u0080\3\uffff\1\u0081\17\uffff\1\u0082",
			"\1\u0083\13\uffff\1\u0084\1\uffff\1\u0085\1\uffff\1\u0086\2\uffff\1"+
			"\u0087\1\u0088",
			"\1\u0089\20\uffff\1\u008a\2\uffff\1\u008b",
			"\1\u008c",
			"\1\u008d\2\uffff\1\u008e\2\uffff\1\u008f\1\u0090\12\uffff\1\u0091\2"+
			"\uffff\1\u0092",
			"\1\u0093\11\uffff\1\u0094\6\uffff\1\u0095",
			"\1\u0096\2\uffff\1\u0097\1\uffff\1\u0098\4\uffff\1\u0099",
			"\1\u009a\7\uffff\1\u009b\5\uffff\1\u009c",
			"\1\u009d",
			"\1\u009e",
			"",
			"\1\u009f\76\uffff\1\u00a0",
			"",
			"",
			"\12\u00a3",
			"",
			"",
			"",
			"",
			"\1\u00a4",
			"\1\u00ab\1\uffff\12\67\12\uffff\3\u00a3\5\uffff\1\u00a9\1\u00a3\7\uffff"+
			"\1\u00a7\2\uffff\1\u00a5\13\uffff\3\u00a3\5\uffff\1\u00aa\1\u00a3\7\uffff"+
			"\1\u00a8\2\uffff\1\u00a5",
			"",
			"",
			"\1\66\26\uffff\1\66\103\uffff\1\66\1\u00ac\3\uffff\1\66\2\uffff\1\u00ad"+
			"\3\uffff\1\u00ad\1\uffff\1\u00ad\2\uffff\1\66\1\uffff\1\u00ad",
			"",
			"\1\u00ab\1\uffff\12\67\12\uffff\3\u00a3\5\uffff\1\u00a9\1\u00a3\7\uffff"+
			"\1\u00a7\16\uffff\3\u00a3\5\uffff\1\u00aa\1\u00a3\7\uffff\1\u00a8",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\57\u00af\1\u00ae\uffd0\u00af",
			"",
			"",
			"",
			"",
			"\1\u00b0",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\u00b2",
			"\1\u00b3",
			"\1\u00b4",
			"\1\u00b5",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\2\64\1\u00b6\17\64\1\u00b7"+
			"\7\64",
			"\1\u00b9",
			"\1\u00ba",
			"\1\u00bb",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\23\64\1\u00bc\6\64",
			"\1\u00be\1\u00bf",
			"\1\u00c0\3\uffff\1\u00c1",
			"\1\u00c2",
			"\1\u00c3",
			"\1\u00c4\2\uffff\1\u00c5\5\uffff\1\u00c6\6\uffff\1\u00c7",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\24\64\1\u00c8\5\64",
			"\1\u00ca",
			"\1\u00cc\11\uffff\1\u00cb",
			"\1\u00cd",
			"\1\u00ce",
			"\1\u00cf\3\uffff\1\u00d0",
			"\1\u00d2\20\uffff\1\u00d1",
			"\1\u00d3\10\uffff\1\u00d4\11\uffff\1\u00d5",
			"\1\u00d6",
			"\1\u00d7",
			"\1\u00d8",
			"\1\u00d9",
			"\1\u00da",
			"\1\u00db",
			"\1\u00dc",
			"\1\u00dd",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\23\64\1\u00de\6\64",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u00e2",
			"\1\u00e3",
			"\1\u00e4\12\uffff\1\u00e5",
			"\1\u00e6",
			"\1\u00e7",
			"\1\u00e8",
			"\1\u00e9",
			"\1\u00ea",
			"\1\u00eb",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u00ed",
			"\1\u00ee",
			"\1\u00ef",
			"\1\u00f0",
			"\1\u00f1",
			"\1\u00f2\7\uffff\1\u00f3\5\uffff\1\u00f4",
			"\1\u00f5",
			"\1\u00f6\4\uffff\1\u00f7\6\uffff\1\u00f8\6\uffff\1\u00f9",
			"\1\u00fa",
			"\1\u00fb\12\uffff\1\u00fc\7\uffff\1\u00fd",
			"\1\u00fe",
			"\1\u00ff",
			"\1\u0100\20\uffff\1\u0101",
			"\1\u0102",
			"\1\u0103\10\uffff\1\u0104",
			"\1\u0106\3\uffff\1\u0105",
			"\1\u0107",
			"\1\u0108",
			"\1\u0109",
			"\1\u010a\1\u010c\16\uffff\1\u010b",
			"\1\u010d\1\u010e",
			"\1\u010f",
			"\1\u0110",
			"\1\u0111\2\uffff\1\u0112",
			"\1\u0113\3\uffff\1\u0114",
			"\1\u0115",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\u0118\35\uffff\1\u0116\37\uffff\1\u0117",
			"\1\u0118\35\uffff\1\u0119\37\uffff\1\u011a",
			"\1\u0118\46\uffff\1\u011b\37\uffff\1\u011c",
			"\1\u0118\46\uffff\1\u011d\37\uffff\1\u011e",
			"\12\u00a3\6\uffff\33\u0118\4\uffff\1\u0118\1\uffff\32\u0118",
			"\1\66\1\uffff\1\u011f\3\uffff\1\u00ad",
			"",
			"\12\u0120\1\u0121\2\u0120\1\u0121\ufff2\u0120",
			"",
			"",
			"",
			"\1\u0122",
			"\1\u0123",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u0125",
			"\1\u0126",
			"\1\u0127",
			"",
			"\1\u0128",
			"\1\u0129",
			"\1\u012a",
			"\1\u012b",
			"",
			"\1\u012c",
			"\1\u012d",
			"\1\u012e",
			"\1\u012f",
			"\1\u0130",
			"\1\u0131\1\u0132",
			"\1\u0133",
			"\1\u0134\7\uffff\1\u0135",
			"\1\u0136",
			"\1\u0137",
			"\1\u0138",
			"",
			"\1\u0139",
			"\1\u013a",
			"\1\u013b",
			"\1\u013c",
			"\1\u013d",
			"\1\u013e",
			"\1\u013f",
			"\1\u0140",
			"\1\u0141",
			"\1\u0142",
			"\1\u0143",
			"\1\u0144",
			"\1\u0145",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\4\64\1\u0146\25\64",
			"\1\u0148",
			"\1\u0149",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u014b",
			"\1\u014c",
			"\1\u014d",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\4\64\1\u014e\11\64\1\u014f"+
			"\13\64",
			"",
			"",
			"",
			"\1\u0151",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u0153",
			"\1\u0154",
			"\1\u0155",
			"\1\u0156",
			"\1\u0157",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u0159",
			"\1\u015a",
			"",
			"\1\u015b",
			"\1\u015c",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u015e",
			"\1\u015f\22\uffff\1\u0160",
			"\1\u0161",
			"\1\u0162",
			"\1\u0163\3\uffff\1\u0164",
			"\1\u0165",
			"\1\u0166",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u0168",
			"\1\u0169",
			"\1\u016a",
			"\1\u016b",
			"\1\u016c",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u016e",
			"\1\u016f",
			"\1\u0170\20\uffff\1\u0171",
			"\1\u0172\13\uffff\1\u0173",
			"\1\u0174",
			"\1\u0175",
			"\1\u0176",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u0178",
			"\1\u0179",
			"\1\u017a",
			"\1\u017b",
			"\1\u017c",
			"\1\u017d",
			"\1\u017e",
			"\1\u017f",
			"\1\u0180",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u0182",
			"\1\u0183",
			"\1\u0184",
			"\1\u0185",
			"\1\u0186",
			"\1\u0187",
			"\1\u0118",
			"\1\u0118",
			"",
			"\1\u0118",
			"\1\u0118",
			"\1\u0118",
			"\1\u0118",
			"\1\u0118",
			"\1\u0118",
			"\1\u0188",
			"\12\u0120\1\u0121\2\u0120\1\u0121\ufff2\u0120",
			"\1\u0121\2\uffff\1\u0121",
			"\1\u018a",
			"\1\u018b",
			"",
			"\1\u018c",
			"\1\u018d",
			"\1\u018e",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u0191",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u0194",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u0196",
			"\1\u0197",
			"\1\u0198",
			"\1\u0199",
			"\1\u019a",
			"\1\u019b",
			"\1\u019c",
			"\1\u019d",
			"\1\u019e",
			"\1\u019f",
			"\1\u01a0",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u01a3",
			"\1\u01a4",
			"\1\u01a5",
			"\1\u01a6",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u01a8",
			"\1\u01a9",
			"\1\u01aa",
			"\1\u01ab",
			"\1\u01ac",
			"\1\u01ad",
			"",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u01af",
			"",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u01b1",
			"\1\u01b2",
			"\1\u01b3",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u01b8",
			"\1\u01b9",
			"\1\u01ba",
			"",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u01bc",
			"\1\u01bd",
			"\1\u01be",
			"",
			"\1\u01bf",
			"\1\u01c0",
			"\1\u01c1",
			"\1\u01c2",
			"\1\u01c3",
			"\1\u01c4",
			"\1\u01c5",
			"\1\u01c6",
			"\1\u01c7",
			"",
			"\1\u01c8",
			"\1\u01c9",
			"\1\u01ca",
			"\1\u01cb",
			"\1\u01cc",
			"",
			"\1\u01cd",
			"\1\u01ce",
			"\1\u01cf",
			"\1\u01d0",
			"\1\u01d1",
			"\1\u01d2",
			"\1\u01d3",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u01d5",
			"",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\16\64\1\u01d7\13\64",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u01da",
			"\1\u01db",
			"\1\u01dc",
			"\1\u01dd",
			"\1\u01de",
			"\1\u01df",
			"",
			"\1\u01e0",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u01e2",
			"\1\u01e3",
			"\1\u01e4",
			"\1\u01e5",
			"\1\66\10\uffff\1\u00ad",
			"",
			"\1\u01e6",
			"\1\u01e7",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u01e9",
			"\1\u01ea",
			"",
			"",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"",
			"",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"",
			"\1\u01ed",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u01f0",
			"\1\u01f1",
			"\1\u01f2",
			"\1\u01f3",
			"\1\u01f4",
			"\1\u01f5",
			"\1\u01f6",
			"\1\u01f7",
			"",
			"",
			"\1\u01f8",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u01fa",
			"\1\u01fb",
			"",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u01fe",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u0201",
			"",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u0204",
			"\1\u0205\7\uffff\1\u0206",
			"",
			"",
			"",
			"",
			"\1\u0207",
			"\1\u0208",
			"\1\u0209",
			"",
			"\1\u020a",
			"\1\u020b",
			"\1\u020c",
			"\1\u020d",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\22\64\1\u020e\7\64",
			"\1\u0210",
			"\1\u0211",
			"\1\u0212",
			"\1\u0213",
			"\1\u0214",
			"\1\u0215",
			"\1\u0216",
			"\1\u0217",
			"\1\u0218",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u021a",
			"\1\u021b",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u021d",
			"\1\u021e",
			"\1\u021f",
			"\1\u0220",
			"\1\u0221",
			"\1\u0222",
			"",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"",
			"\1\u0224",
			"",
			"",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u0226",
			"\1\u0227",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u0229",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u022b",
			"",
			"\1\u022c",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u0230",
			"\1\u0231",
			"",
			"\1\u0232",
			"\1\u0233",
			"",
			"",
			"\1\u0234",
			"",
			"",
			"\1\u0235",
			"\1\u0236",
			"\1\u0237",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u0239",
			"\1\u023a",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u023c",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"",
			"\1\u023e",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"",
			"",
			"\1\u0240",
			"",
			"",
			"\1\u0241",
			"",
			"",
			"\1\u0242",
			"\1\u0243",
			"\1\u0244",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u0247",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u0249",
			"\1\u024a",
			"\1\u024b",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"",
			"\1\u024d",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u024f",
			"\1\u0250",
			"\1\u0251",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u0253",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u0259",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"",
			"\1\u025f",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"",
			"\1\u0262",
			"\1\u0263",
			"",
			"",
			"",
			"\1\u0264",
			"\1\u0265",
			"\1\u0266",
			"\1\u0267",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u0269",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"",
			"\1\u026c",
			"\1\u026d",
			"",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"",
			"\1\u026f",
			"",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u0272",
			"\1\u0273",
			"\1\u0274",
			"",
			"",
			"\1\u0275",
			"",
			"\1\u0276",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u0278",
			"",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u027b",
			"\1\u027c",
			"",
			"\1\u027d",
			"",
			"",
			"",
			"",
			"",
			"\1\u027e",
			"",
			"",
			"",
			"",
			"",
			"\1\u027f",
			"",
			"",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u0281",
			"\1\u0282",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u0284",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"",
			"",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u0288",
			"",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"",
			"",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u028b",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u028d",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"",
			"",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u0291",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u0293",
			"\1\u0294",
			"",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"",
			"",
			"",
			"\1\u0298",
			"",
			"",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"",
			"",
			"",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"",
			"\1\u029c",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"",
			"",
			"",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"",
			"",
			"",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"",
			"",
			""
	};

	static final short[] DFA61_eot = DFA.unpackEncodedString(DFA61_eotS);
	static final short[] DFA61_eof = DFA.unpackEncodedString(DFA61_eofS);
	static final char[] DFA61_min = DFA.unpackEncodedStringToUnsignedChars(DFA61_minS);
	static final char[] DFA61_max = DFA.unpackEncodedStringToUnsignedChars(DFA61_maxS);
	static final short[] DFA61_accept = DFA.unpackEncodedString(DFA61_acceptS);
	static final short[] DFA61_special = DFA.unpackEncodedString(DFA61_specialS);
	static final short[][] DFA61_transition;

	static {
		int numStates = DFA61_transitionS.length;
		DFA61_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA61_transition[i] = DFA.unpackEncodedString(DFA61_transitionS[i]);
		}
	}

	protected class DFA61 extends DFA {

		public DFA61(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 61;
			this.eot = DFA61_eot;
			this.eof = DFA61_eof;
			this.min = DFA61_min;
			this.max = DFA61_max;
			this.accept = DFA61_accept;
			this.special = DFA61_special;
			this.transition = DFA61_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | T__103 | T__104 | T__105 | T__106 | T__107 | T__108 | T__109 | T__110 | T__111 | T__112 | T__113 | T__114 | T__115 | T__116 | T__117 | T__118 | T__119 | T__120 | T__121 | T__122 | T__123 | T__124 | T__125 | T__126 | T__127 | T__128 | T__129 | T__130 | T__131 | T__132 | T__133 | T__134 | T__135 | T__136 | T__137 | T__138 | T__139 | T__140 | T__141 | T__142 | T__143 | T__144 | T__145 | T__146 | T__147 | T__148 | T__149 | T__150 | T__151 | T__152 | T__153 | T__154 | T__155 | T__156 | T__157 | T__158 | T__159 | T__160 | T__161 | T__162 | T__163 | T__164 | T__165 | T__166 | T__167 | T__168 | T__169 | T__170 | T__171 | T__172 | T__173 | T__174 | T__175 | T__176 | T__177 | T__178 | T__179 | T__180 | T__181 | T__182 | T__183 | T__184 | T__185 | T__186 | T__187 | T__188 | T__189 | T__190 | T__191 | T__192 | T__193 | T__194 | T__195 | T__196 | T__197 | T__198 | T__199 | T__200 | T__201 | T__202 | TRUE | FALSE | NULL | DOT | PTR | MINUS | GT | USING | ENUM | IF | ELIF | ENDIF | DEFINE | UNDEF | SEMI | RPAREN | WS | DOC_LINE_COMMENT | LINE_COMMENT | COMMENT | STRINGLITERAL | Verbatim_string_literal | NUMBER | GooBall | Real_literal | Character_literal | IDENTIFIER | Pragma | PREPROCESSOR_DIRECTIVE | Hex_number );";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			IntStream input = _input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA61_73 = input.LA(1);
						s = -1;
						if ( (LA61_73=='/') ) {s = 174;}
						else if ( ((LA61_73 >= '\u0000' && LA61_73 <= '.')||(LA61_73 >= '0' && LA61_73 <= '\uFFFF')) ) {s = 175;}
						if ( s>=0 ) return s;
						break;

					case 1 : 
						int LA61_288 = input.LA(1);
						s = -1;
						if ( (LA61_288=='\n'||LA61_288=='\r') ) {s = 289;}
						else if ( ((LA61_288 >= '\u0000' && LA61_288 <= '\t')||(LA61_288 >= '\u000B' && LA61_288 <= '\f')||(LA61_288 >= '\u000E' && LA61_288 <= '\uFFFF')) ) {s = 288;}
						if ( s>=0 ) return s;
						break;

					case 2 : 
						int LA61_174 = input.LA(1);
						s = -1;
						if ( ((LA61_174 >= '\u0000' && LA61_174 <= '\t')||(LA61_174 >= '\u000B' && LA61_174 <= '\f')||(LA61_174 >= '\u000E' && LA61_174 <= '\uFFFF')) ) {s = 288;}
						else if ( (LA61_174=='\n'||LA61_174=='\r') ) {s = 289;}
						if ( s>=0 ) return s;
						break;
			}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 61, _s, input);
			error(nvae);
			throw nvae;
		}
	}

}
