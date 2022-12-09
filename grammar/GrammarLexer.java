// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class GrammarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SWAP_NOARG=1, COPY_NOARG=2, END_NOARG=3, DEFINE_LABEL_ID=4, JUMP_ID=5, 
		CHECK_IFEZ_ID=6, CHECK_IFLZ_ID=7, CHECK_IFGZ_ID=8, ADD_VAL=9, SUB_VAL=10, 
		MUL_VAL=11, DIV_VAL=12, MOD_VAL=13, COMP_VAL=14, NUMBER=15, ID=16, WS=17;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"SWAP_NOARG", "COPY_NOARG", "END_NOARG", "DEFINE_LABEL_ID", "JUMP_ID", 
			"CHECK_IFEZ_ID", "CHECK_IFLZ_ID", "CHECK_IFGZ_ID", "ADD_VAL", "SUB_VAL", 
			"MUL_VAL", "DIV_VAL", "MOD_VAL", "COMP_VAL", "NUMBER", "ID", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'SWAP'", "'COPY'", "'END'", "'LABEL'", "'JUMP'", "'IFEZ'", "'IFLZ'", 
			"'IFGZ'", "'ADD'", "'SUB'", "'MUL'", "'DIV'", "'MOD'", "'COMP'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "SWAP_NOARG", "COPY_NOARG", "END_NOARG", "DEFINE_LABEL_ID", "JUMP_ID", 
			"CHECK_IFEZ_ID", "CHECK_IFLZ_ID", "CHECK_IFGZ_ID", "ADD_VAL", "SUB_VAL", 
			"MUL_VAL", "DIV_VAL", "MOD_VAL", "COMP_VAL", "NUMBER", "ID", "WS"
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


	public GrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Grammar.g4"; }

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
		"\u0004\u0000\u0011~\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\u000e\u0003\u000ef\b\u000e\u0001\u000e\u0004"+
		"\u000ei\b\u000e\u000b\u000e\f\u000ej\u0001\u000f\u0004\u000fn\b\u000f"+
		"\u000b\u000f\f\u000fo\u0001\u000f\u0005\u000fs\b\u000f\n\u000f\f\u000f"+
		"v\t\u000f\u0001\u0010\u0004\u0010y\b\u0010\u000b\u0010\f\u0010z\u0001"+
		"\u0010\u0001\u0010\u0000\u0000\u0011\u0001\u0001\u0003\u0002\u0005\u0003"+
		"\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015"+
		"\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011\u0001"+
		"\u0000\u0002\u0002\u0000AZaz\u0003\u0000\t\n\r\r  \u0082\u0000\u0001\u0001"+
		"\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001"+
		"\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000"+
		"\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000"+
		"\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000"+
		"\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000"+
		"\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000"+
		"\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000"+
		"\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000"+
		"\u0001#\u0001\u0000\u0000\u0000\u0003(\u0001\u0000\u0000\u0000\u0005-"+
		"\u0001\u0000\u0000\u0000\u00071\u0001\u0000\u0000\u0000\t7\u0001\u0000"+
		"\u0000\u0000\u000b<\u0001\u0000\u0000\u0000\rA\u0001\u0000\u0000\u0000"+
		"\u000fF\u0001\u0000\u0000\u0000\u0011K\u0001\u0000\u0000\u0000\u0013O"+
		"\u0001\u0000\u0000\u0000\u0015S\u0001\u0000\u0000\u0000\u0017W\u0001\u0000"+
		"\u0000\u0000\u0019[\u0001\u0000\u0000\u0000\u001b_\u0001\u0000\u0000\u0000"+
		"\u001de\u0001\u0000\u0000\u0000\u001fm\u0001\u0000\u0000\u0000!x\u0001"+
		"\u0000\u0000\u0000#$\u0005S\u0000\u0000$%\u0005W\u0000\u0000%&\u0005A"+
		"\u0000\u0000&\'\u0005P\u0000\u0000\'\u0002\u0001\u0000\u0000\u0000()\u0005"+
		"C\u0000\u0000)*\u0005O\u0000\u0000*+\u0005P\u0000\u0000+,\u0005Y\u0000"+
		"\u0000,\u0004\u0001\u0000\u0000\u0000-.\u0005E\u0000\u0000./\u0005N\u0000"+
		"\u0000/0\u0005D\u0000\u00000\u0006\u0001\u0000\u0000\u000012\u0005L\u0000"+
		"\u000023\u0005A\u0000\u000034\u0005B\u0000\u000045\u0005E\u0000\u0000"+
		"56\u0005L\u0000\u00006\b\u0001\u0000\u0000\u000078\u0005J\u0000\u0000"+
		"89\u0005U\u0000\u00009:\u0005M\u0000\u0000:;\u0005P\u0000\u0000;\n\u0001"+
		"\u0000\u0000\u0000<=\u0005I\u0000\u0000=>\u0005F\u0000\u0000>?\u0005E"+
		"\u0000\u0000?@\u0005Z\u0000\u0000@\f\u0001\u0000\u0000\u0000AB\u0005I"+
		"\u0000\u0000BC\u0005F\u0000\u0000CD\u0005L\u0000\u0000DE\u0005Z\u0000"+
		"\u0000E\u000e\u0001\u0000\u0000\u0000FG\u0005I\u0000\u0000GH\u0005F\u0000"+
		"\u0000HI\u0005G\u0000\u0000IJ\u0005Z\u0000\u0000J\u0010\u0001\u0000\u0000"+
		"\u0000KL\u0005A\u0000\u0000LM\u0005D\u0000\u0000MN\u0005D\u0000\u0000"+
		"N\u0012\u0001\u0000\u0000\u0000OP\u0005S\u0000\u0000PQ\u0005U\u0000\u0000"+
		"QR\u0005B\u0000\u0000R\u0014\u0001\u0000\u0000\u0000ST\u0005M\u0000\u0000"+
		"TU\u0005U\u0000\u0000UV\u0005L\u0000\u0000V\u0016\u0001\u0000\u0000\u0000"+
		"WX\u0005D\u0000\u0000XY\u0005I\u0000\u0000YZ\u0005V\u0000\u0000Z\u0018"+
		"\u0001\u0000\u0000\u0000[\\\u0005M\u0000\u0000\\]\u0005O\u0000\u0000]"+
		"^\u0005D\u0000\u0000^\u001a\u0001\u0000\u0000\u0000_`\u0005C\u0000\u0000"+
		"`a\u0005O\u0000\u0000ab\u0005M\u0000\u0000bc\u0005P\u0000\u0000c\u001c"+
		"\u0001\u0000\u0000\u0000df\u0005-\u0000\u0000ed\u0001\u0000\u0000\u0000"+
		"ef\u0001\u0000\u0000\u0000fh\u0001\u0000\u0000\u0000gi\u000209\u0000h"+
		"g\u0001\u0000\u0000\u0000ij\u0001\u0000\u0000\u0000jh\u0001\u0000\u0000"+
		"\u0000jk\u0001\u0000\u0000\u0000k\u001e\u0001\u0000\u0000\u0000ln\u0007"+
		"\u0000\u0000\u0000ml\u0001\u0000\u0000\u0000no\u0001\u0000\u0000\u0000"+
		"om\u0001\u0000\u0000\u0000op\u0001\u0000\u0000\u0000pt\u0001\u0000\u0000"+
		"\u0000qs\u000209\u0000rq\u0001\u0000\u0000\u0000sv\u0001\u0000\u0000\u0000"+
		"tr\u0001\u0000\u0000\u0000tu\u0001\u0000\u0000\u0000u \u0001\u0000\u0000"+
		"\u0000vt\u0001\u0000\u0000\u0000wy\u0007\u0001\u0000\u0000xw\u0001\u0000"+
		"\u0000\u0000yz\u0001\u0000\u0000\u0000zx\u0001\u0000\u0000\u0000z{\u0001"+
		"\u0000\u0000\u0000{|\u0001\u0000\u0000\u0000|}\u0006\u0010\u0000\u0000"+
		"}\"\u0001\u0000\u0000\u0000\u0006\u0000ejotz\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}