package gen;// Generated from C:/Users/Admin/source/repos/lang/src\lang.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class langLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, WS=2, DEF=3, DOT=4, COMMA=5, EOL=6, PARAMS_START=7, START=8, END=9, 
		FUN_NAME=10, CHAR=11, INT=12, STRING=13;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "WS", "DEF", "DOT", "COMMA", "EOL", "PARAMS_START", "START", 
			"END", "FUN_NAME", "CHAR", "INT", "STRING"
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


	public langLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "lang.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\17\u00bf\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\3\6\3!\n\3\r\3\16\3\"\3\3"+
		"\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00a3\n\13\3\f\5"+
		"\f\u00a6\n\f\3\f\6\f\u00a9\n\f\r\f\16\f\u00aa\3\r\3\r\3\r\7\r\u00b0\n"+
		"\r\f\r\16\r\u00b3\13\r\5\r\u00b5\n\r\3\16\3\16\7\16\u00b9\n\16\f\16\16"+
		"\16\u00bc\13\16\3\16\3\16\2\2\17\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23"+
		"\13\25\f\27\r\31\16\33\17\3\2\b\5\2\13\f\17\17\"\"\4\2aac|\5\2\62;aac"+
		"|\3\2\63;\3\2\62;\7\2\"\"//\62;aac|\2\u00d2\2\3\3\2\2\2\2\5\3\2\2\2\2"+
		"\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2"+
		"\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2"+
		"\3\35\3\2\2\2\5 \3\2\2\2\7&\3\2\2\2\t*\3\2\2\2\13,\3\2\2\2\r.\3\2\2\2"+
		"\17\60\3\2\2\2\21\62\3\2\2\2\23\64\3\2\2\2\25\u00a2\3\2\2\2\27\u00a5\3"+
		"\2\2\2\31\u00b4\3\2\2\2\33\u00b6\3\2\2\2\35\36\7?\2\2\36\4\3\2\2\2\37"+
		"!\t\2\2\2 \37\3\2\2\2!\"\3\2\2\2\" \3\2\2\2\"#\3\2\2\2#$\3\2\2\2$%\b\3"+
		"\2\2%\6\3\2\2\2&\'\7f\2\2\'(\7g\2\2()\7h\2\2)\b\3\2\2\2*+\7\60\2\2+\n"+
		"\3\2\2\2,-\7.\2\2-\f\3\2\2\2./\7=\2\2/\16\3\2\2\2\60\61\7<\2\2\61\20\3"+
		"\2\2\2\62\63\7*\2\2\63\22\3\2\2\2\64\65\7+\2\2\65\24\3\2\2\2\66\67\7e"+
		"\2\2\678\7c\2\289\7p\2\29:\7x\2\2:;\7c\2\2;\u00a3\7u\2\2<=\7h\2\2=>\7"+
		"k\2\2>?\7i\2\2?@\7w\2\2@A\7t\2\2A\u00a3\7g\2\2BC\7n\2\2CD\7k\2\2DE\7p"+
		"\2\2E\u00a3\7g\2\2FG\7h\2\2GH\7t\2\2HI\7c\2\2IJ\7e\2\2JK\7v\2\2KL\7c\2"+
		"\2L\u00a3\7n\2\2MN\7u\2\2NO\7k\2\2OP\7i\2\2P\u00a3\7p\2\2QR\7e\2\2RS\7"+
		"q\2\2ST\7n\2\2TU\7q\2\2U\u00a3\7t\2\2VW\7k\2\2WX\7o\2\2XY\7c\2\2YZ\7i"+
		"\2\2Z\u00a3\7g\2\2[\\\7i\2\2\\]\7t\2\2]^\7c\2\2^_\7f\2\2_`\7k\2\2`a\7"+
		"g\2\2ab\7p\2\2b\u00a3\7v\2\2cd\7c\2\2de\7f\2\2ef\7f\2\2fg\7a\2\2gh\7r"+
		"\2\2hi\7c\2\2ij\7v\2\2jk\7v\2\2kl\7g\2\2lm\7t\2\2m\u00a3\7p\2\2no\7t\2"+
		"\2op\7g\2\2pq\7o\2\2qr\7q\2\2rs\7x\2\2st\7g\2\2tu\7a\2\2uv\7r\2\2vw\7"+
		"c\2\2wx\7v\2\2xy\7v\2\2yz\7g\2\2z{\7t\2\2{\u00a3\7p\2\2|}\7d\2\2}~\7n"+
		"\2\2~\177\7w\2\2\177\u00a3\7t\2\2\u0080\u0081\7f\2\2\u0081\u0082\7c\2"+
		"\2\u0082\u0083\7t\2\2\u0083\u0084\7m\2\2\u0084\u0085\7g\2\2\u0085\u00a3"+
		"\7p\2\2\u0086\u0087\7n\2\2\u0087\u0088\7k\2\2\u0088\u0089\7i\2\2\u0089"+
		"\u008a\7j\2\2\u008a\u008b\7v\2\2\u008b\u008c\7g\2\2\u008c\u00a3\7p\2\2"+
		"\u008d\u008e\7d\2\2\u008e\u008f\7n\2\2\u008f\u0090\7c\2\2\u0090\u0091"+
		"\7e\2\2\u0091\u0092\7m\2\2\u0092\u0093\7a\2\2\u0093\u0094\7y\2\2\u0094"+
		"\u0095\7j\2\2\u0095\u0096\7k\2\2\u0096\u0097\7v\2\2\u0097\u00a3\7g\2\2"+
		"\u0098\u0099\7n\2\2\u0099\u009a\7g\2\2\u009a\u009b\7p\2\2\u009b\u00a3"+
		"\7u\2\2\u009c\u009d\7o\2\2\u009d\u009e\7k\2\2\u009e\u009f\7t\2\2\u009f"+
		"\u00a0\7t\2\2\u00a0\u00a1\7q\2\2\u00a1\u00a3\7t\2\2\u00a2\66\3\2\2\2\u00a2"+
		"<\3\2\2\2\u00a2B\3\2\2\2\u00a2F\3\2\2\2\u00a2M\3\2\2\2\u00a2Q\3\2\2\2"+
		"\u00a2V\3\2\2\2\u00a2[\3\2\2\2\u00a2c\3\2\2\2\u00a2n\3\2\2\2\u00a2|\3"+
		"\2\2\2\u00a2\u0080\3\2\2\2\u00a2\u0086\3\2\2\2\u00a2\u008d\3\2\2\2\u00a2"+
		"\u0098\3\2\2\2\u00a2\u009c\3\2\2\2\u00a3\26\3\2\2\2\u00a4\u00a6\t\3\2"+
		"\2\u00a5\u00a4\3\2\2\2\u00a6\u00a8\3\2\2\2\u00a7\u00a9\t\4\2\2\u00a8\u00a7"+
		"\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00a8\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab"+
		"\30\3\2\2\2\u00ac\u00b5\7\62\2\2\u00ad\u00b1\t\5\2\2\u00ae\u00b0\t\6\2"+
		"\2\u00af\u00ae\3\2\2\2\u00b0\u00b3\3\2\2\2\u00b1\u00af\3\2\2\2\u00b1\u00b2"+
		"\3\2\2\2\u00b2\u00b5\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b4\u00ac\3\2\2\2\u00b4"+
		"\u00ad\3\2\2\2\u00b5\32\3\2\2\2\u00b6\u00ba\7)\2\2\u00b7\u00b9\t\7\2\2"+
		"\u00b8\u00b7\3\2\2\2\u00b9\u00bc\3\2\2\2\u00ba\u00b8\3\2\2\2\u00ba\u00bb"+
		"\3\2\2\2\u00bb\u00bd\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bd\u00be\7)\2\2\u00be"+
		"\34\3\2\2\2\f\2\"\u00a2\u00a5\u00a8\u00aa\u00b1\u00b4\u00b8\u00ba\3\b"+
		"\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}