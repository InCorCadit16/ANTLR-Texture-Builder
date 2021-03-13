package gen;// Generated from C:/Users/Admin/source/repos/lang/src\lang.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class langParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, WS=2, DEF=3, DOT=4, COMMA=5, EOL=6, PARAMS_START=7, START=8, END=9, 
		FUN_NAME=10, CHAR=11, INT=12, STRING=13;
	public static final int
		RULE_source_code = 0, RULE_definition = 1, RULE_function_call = 2, RULE_parameters_list = 3, 
		RULE_parameter = 4, RULE_var_name = 5, RULE_literal = 6;
	private static String[] makeRuleNames() {
		return new String[] {
			"source_code", "definition", "function_call", "parameters_list", "parameter", 
			"var_name", "literal"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", null, "'def'", "'.'", "','", "';'", "':'", "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "WS", "DEF", "DOT", "COMMA", "EOL", "PARAMS_START", "START", 
			"END", "FUN_NAME", "CHAR", "INT", "STRING"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "lang.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public langParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class Source_codeContext extends ParserRuleContext {
		public List<TerminalNode> EOL() { return getTokens(langParser.EOL); }
		public TerminalNode EOL(int i) {
			return getToken(langParser.EOL, i);
		}
		public List<DefinitionContext> definition() {
			return getRuleContexts(DefinitionContext.class);
		}
		public DefinitionContext definition(int i) {
			return getRuleContext(DefinitionContext.class,i);
		}
		public List<Function_callContext> function_call() {
			return getRuleContexts(Function_callContext.class);
		}
		public Function_callContext function_call(int i) {
			return getRuleContext(Function_callContext.class,i);
		}
		public Source_codeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_source_code; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof langListener ) ((langListener)listener).enterSource_code(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof langListener ) ((langListener)listener).exitSource_code(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof langVisitor ) return ((langVisitor<? extends T>)visitor).visitSource_code(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Source_codeContext source_code() throws RecognitionException {
		Source_codeContext _localctx = new Source_codeContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_source_code);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(20); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(16);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case DEF:
					{
					setState(14);
					definition();
					}
					break;
				case FUN_NAME:
				case CHAR:
					{
					setState(15);
					function_call();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(18);
				match(EOL);
				}
				}
				setState(22); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DEF) | (1L << FUN_NAME) | (1L << CHAR))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DefinitionContext extends ParserRuleContext {
		public TerminalNode DEF() { return getToken(langParser.DEF, 0); }
		public Var_nameContext var_name() {
			return getRuleContext(Var_nameContext.class,0);
		}
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public DefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof langListener ) ((langListener)listener).enterDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof langListener ) ((langListener)listener).exitDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof langVisitor ) return ((langVisitor<? extends T>)visitor).visitDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefinitionContext definition() throws RecognitionException {
		DefinitionContext _localctx = new DefinitionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_definition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24);
			match(DEF);
			setState(25);
			var_name();
			setState(26);
			match(T__0);
			setState(29);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FUN_NAME:
			case CHAR:
				{
				setState(27);
				function_call();
				}
				break;
			case INT:
			case STRING:
				{
				setState(28);
				literal();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_callContext extends ParserRuleContext {
		public TerminalNode FUN_NAME() { return getToken(langParser.FUN_NAME, 0); }
		public TerminalNode PARAMS_START() { return getToken(langParser.PARAMS_START, 0); }
		public TerminalNode START() { return getToken(langParser.START, 0); }
		public Parameters_listContext parameters_list() {
			return getRuleContext(Parameters_listContext.class,0);
		}
		public TerminalNode END() { return getToken(langParser.END, 0); }
		public Var_nameContext var_name() {
			return getRuleContext(Var_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(langParser.DOT, 0); }
		public Function_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof langListener ) ((langListener)listener).enterFunction_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof langListener ) ((langListener)listener).exitFunction_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof langVisitor ) return ((langVisitor<? extends T>)visitor).visitFunction_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_callContext function_call() throws RecognitionException {
		Function_callContext _localctx = new Function_callContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_function_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CHAR) {
				{
				setState(31);
				var_name();
				setState(32);
				match(DOT);
				}
			}

			setState(36);
			match(FUN_NAME);
			setState(37);
			match(PARAMS_START);
			setState(38);
			match(START);
			setState(39);
			parameters_list();
			setState(40);
			match(END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Parameters_listContext extends ParserRuleContext {
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(langParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(langParser.COMMA, i);
		}
		public Parameters_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameters_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof langListener ) ((langListener)listener).enterParameters_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof langListener ) ((langListener)listener).exitParameters_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof langVisitor ) return ((langVisitor<? extends T>)visitor).visitParameters_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Parameters_listContext parameters_list() throws RecognitionException {
		Parameters_listContext _localctx = new Parameters_listContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_parameters_list);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(42);
				parameter();
				}
				break;
			case 2:
				{
				{
				setState(49);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(43);
						parameter();
						setState(45);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==COMMA) {
							{
							setState(44);
							match(COMMA);
							}
						}

						}
						} 
					}
					setState(51);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				}
				setState(52);
				parameter();
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParameterContext extends ParserRuleContext {
		public Var_nameContext var_name() {
			return getRuleContext(Var_nameContext.class,0);
		}
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof langListener ) ((langListener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof langListener ) ((langListener)listener).exitParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof langVisitor ) return ((langVisitor<? extends T>)visitor).visitParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(55);
				var_name();
				}
				break;
			case 2:
				{
				setState(56);
				function_call();
				}
				break;
			case 3:
				{
				setState(57);
				literal();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Var_nameContext extends ParserRuleContext {
		public TerminalNode CHAR() { return getToken(langParser.CHAR, 0); }
		public Var_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof langListener ) ((langListener)listener).enterVar_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof langListener ) ((langListener)listener).exitVar_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof langVisitor ) return ((langVisitor<? extends T>)visitor).visitVar_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_nameContext var_name() throws RecognitionException {
		Var_nameContext _localctx = new Var_nameContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_var_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			match(CHAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(langParser.STRING, 0); }
		public TerminalNode INT() { return getToken(langParser.INT, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof langListener ) ((langListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof langListener ) ((langListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof langVisitor ) return ((langVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			_la = _input.LA(1);
			if ( !(_la==INT || _la==STRING) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\17C\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\3\2\5\2\23\n\2\3\2\3\2"+
		"\6\2\27\n\2\r\2\16\2\30\3\3\3\3\3\3\3\3\3\3\5\3 \n\3\3\4\3\4\3\4\5\4%"+
		"\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\5\5\60\n\5\7\5\62\n\5\f\5\16"+
		"\5\65\13\5\3\5\5\58\n\5\3\6\3\6\3\6\5\6=\n\6\3\7\3\7\3\b\3\b\3\b\2\2\t"+
		"\2\4\6\b\n\f\16\2\3\3\2\16\17\2D\2\26\3\2\2\2\4\32\3\2\2\2\6$\3\2\2\2"+
		"\b\67\3\2\2\2\n<\3\2\2\2\f>\3\2\2\2\16@\3\2\2\2\20\23\5\4\3\2\21\23\5"+
		"\6\4\2\22\20\3\2\2\2\22\21\3\2\2\2\23\24\3\2\2\2\24\25\7\b\2\2\25\27\3"+
		"\2\2\2\26\22\3\2\2\2\27\30\3\2\2\2\30\26\3\2\2\2\30\31\3\2\2\2\31\3\3"+
		"\2\2\2\32\33\7\5\2\2\33\34\5\f\7\2\34\37\7\3\2\2\35 \5\6\4\2\36 \5\16"+
		"\b\2\37\35\3\2\2\2\37\36\3\2\2\2 \5\3\2\2\2!\"\5\f\7\2\"#\7\6\2\2#%\3"+
		"\2\2\2$!\3\2\2\2$%\3\2\2\2%&\3\2\2\2&\'\7\f\2\2\'(\7\t\2\2()\7\n\2\2)"+
		"*\5\b\5\2*+\7\13\2\2+\7\3\2\2\2,8\5\n\6\2-/\5\n\6\2.\60\7\7\2\2/.\3\2"+
		"\2\2/\60\3\2\2\2\60\62\3\2\2\2\61-\3\2\2\2\62\65\3\2\2\2\63\61\3\2\2\2"+
		"\63\64\3\2\2\2\64\66\3\2\2\2\65\63\3\2\2\2\668\5\n\6\2\67,\3\2\2\2\67"+
		"\63\3\2\2\28\t\3\2\2\29=\5\f\7\2:=\5\6\4\2;=\5\16\b\2<9\3\2\2\2<:\3\2"+
		"\2\2<;\3\2\2\2=\13\3\2\2\2>?\7\r\2\2?\r\3\2\2\2@A\t\2\2\2A\17\3\2\2\2"+
		"\n\22\30\37$/\63\67<";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}