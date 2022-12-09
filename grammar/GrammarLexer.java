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
		CHECK_IFEZ_ID=6, CHECK_IFLZ_ID=7, CHECK_IFGZ_ID=8, WRITE_CELL_ID=9, READ_CELL_ID=10, 
		COPY_CELL_ID=11, SRCCOPY_CELL_ID=12, ADD_VAL=13, SUB_VAL=14, MUL_VAL=15, 
		DIV_VAL=16, MOD_VAL=17, COMP_VAL=18, NUMBER=19, ID=20, WS=21;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"SWAP_NOARG", "COPY_NOARG", "END_NOARG", "DEFINE_LABEL_ID", "JUMP_ID", 
			"CHECK_IFEZ_ID", "CHECK_IFLZ_ID", "CHECK_IFGZ_ID", "WRITE_CELL_ID", "READ_CELL_ID", 
			"COPY_CELL_ID", "SRCCOPY_CELL_ID", "ADD_VAL", "SUB_VAL", "MUL_VAL", "DIV_VAL", 
			"MOD_VAL", "COMP_VAL", "NUMBER", "ID", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'SWAP'", "'COPY'", "'END'", "'LABEL'", "'JUMP'", "'IFEZ'", "'IFLZ'", 
			"'IFGZ'", "'WRITE_CELL'", "'READ_CELL'", "'COPY_CELL'", "'SRCCOPY_CELL'", 
			"'ADD'", "'SUB'", "'MUL'", "'DIV'", "'MOD'", "'COMP'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "SWAP_NOARG", "COPY_NOARG", "END_NOARG", "DEFINE_LABEL_ID", "JUMP_ID", 
			"CHECK_IFEZ_ID", "CHECK_IFLZ_ID", "CHECK_IFGZ_ID", "WRITE_CELL_ID", "READ_CELL_ID", 
			"COPY_CELL_ID", "SRCCOPY_CELL_ID", "ADD_VAL", "SUB_VAL", "MUL_VAL", "DIV_VAL", 
			"MOD_VAL", "COMP_VAL", "NUMBER", "ID", "WS"
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
		"\u0004\u0000\u0015\u00b2\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0012\u0003\u0012\u009a\b\u0012\u0001\u0012\u0004\u0012\u009d"+
		"\b\u0012\u000b\u0012\f\u0012\u009e\u0001\u0013\u0004\u0013\u00a2\b\u0013"+
		"\u000b\u0013\f\u0013\u00a3\u0001\u0013\u0005\u0013\u00a7\b\u0013\n\u0013"+
		"\f\u0013\u00aa\t\u0013\u0001\u0014\u0004\u0014\u00ad\b\u0014\u000b\u0014"+
		"\f\u0014\u00ae\u0001\u0014\u0001\u0014\u0000\u0000\u0015\u0001\u0001\u0003"+
		"\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011"+
		"\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010"+
		"!\u0011#\u0012%\u0013\'\u0014)\u0015\u0001\u0000\u0002\u0002\u0000AZa"+
		"z\u0003\u0000\t\n\r\r  \u00b6\u0000\u0001\u0001\u0000\u0000\u0000\u0000"+
		"\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000"+
		"\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b"+
		"\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001"+
		"\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001"+
		"\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001"+
		"\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001"+
		"\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001"+
		"\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000"+
		"\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000"+
		"\u0000)\u0001\u0000\u0000\u0000\u0001+\u0001\u0000\u0000\u0000\u00030"+
		"\u0001\u0000\u0000\u0000\u00055\u0001\u0000\u0000\u0000\u00079\u0001\u0000"+
		"\u0000\u0000\t?\u0001\u0000\u0000\u0000\u000bD\u0001\u0000\u0000\u0000"+
		"\rI\u0001\u0000\u0000\u0000\u000fN\u0001\u0000\u0000\u0000\u0011S\u0001"+
		"\u0000\u0000\u0000\u0013^\u0001\u0000\u0000\u0000\u0015h\u0001\u0000\u0000"+
		"\u0000\u0017r\u0001\u0000\u0000\u0000\u0019\u007f\u0001\u0000\u0000\u0000"+
		"\u001b\u0083\u0001\u0000\u0000\u0000\u001d\u0087\u0001\u0000\u0000\u0000"+
		"\u001f\u008b\u0001\u0000\u0000\u0000!\u008f\u0001\u0000\u0000\u0000#\u0093"+
		"\u0001\u0000\u0000\u0000%\u0099\u0001\u0000\u0000\u0000\'\u00a1\u0001"+
		"\u0000\u0000\u0000)\u00ac\u0001\u0000\u0000\u0000+,\u0005S\u0000\u0000"+
		",-\u0005W\u0000\u0000-.\u0005A\u0000\u0000./\u0005P\u0000\u0000/\u0002"+
		"\u0001\u0000\u0000\u000001\u0005C\u0000\u000012\u0005O\u0000\u000023\u0005"+
		"P\u0000\u000034\u0005Y\u0000\u00004\u0004\u0001\u0000\u0000\u000056\u0005"+
		"E\u0000\u000067\u0005N\u0000\u000078\u0005D\u0000\u00008\u0006\u0001\u0000"+
		"\u0000\u00009:\u0005L\u0000\u0000:;\u0005A\u0000\u0000;<\u0005B\u0000"+
		"\u0000<=\u0005E\u0000\u0000=>\u0005L\u0000\u0000>\b\u0001\u0000\u0000"+
		"\u0000?@\u0005J\u0000\u0000@A\u0005U\u0000\u0000AB\u0005M\u0000\u0000"+
		"BC\u0005P\u0000\u0000C\n\u0001\u0000\u0000\u0000DE\u0005I\u0000\u0000"+
		"EF\u0005F\u0000\u0000FG\u0005E\u0000\u0000GH\u0005Z\u0000\u0000H\f\u0001"+
		"\u0000\u0000\u0000IJ\u0005I\u0000\u0000JK\u0005F\u0000\u0000KL\u0005L"+
		"\u0000\u0000LM\u0005Z\u0000\u0000M\u000e\u0001\u0000\u0000\u0000NO\u0005"+
		"I\u0000\u0000OP\u0005F\u0000\u0000PQ\u0005G\u0000\u0000QR\u0005Z\u0000"+
		"\u0000R\u0010\u0001\u0000\u0000\u0000ST\u0005W\u0000\u0000TU\u0005R\u0000"+
		"\u0000UV\u0005I\u0000\u0000VW\u0005T\u0000\u0000WX\u0005E\u0000\u0000"+
		"XY\u0005_\u0000\u0000YZ\u0005C\u0000\u0000Z[\u0005E\u0000\u0000[\\\u0005"+
		"L\u0000\u0000\\]\u0005L\u0000\u0000]\u0012\u0001\u0000\u0000\u0000^_\u0005"+
		"R\u0000\u0000_`\u0005E\u0000\u0000`a\u0005A\u0000\u0000ab\u0005D\u0000"+
		"\u0000bc\u0005_\u0000\u0000cd\u0005C\u0000\u0000de\u0005E\u0000\u0000"+
		"ef\u0005L\u0000\u0000fg\u0005L\u0000\u0000g\u0014\u0001\u0000\u0000\u0000"+
		"hi\u0005C\u0000\u0000ij\u0005O\u0000\u0000jk\u0005P\u0000\u0000kl\u0005"+
		"Y\u0000\u0000lm\u0005_\u0000\u0000mn\u0005C\u0000\u0000no\u0005E\u0000"+
		"\u0000op\u0005L\u0000\u0000pq\u0005L\u0000\u0000q\u0016\u0001\u0000\u0000"+
		"\u0000rs\u0005S\u0000\u0000st\u0005R\u0000\u0000tu\u0005C\u0000\u0000"+
		"uv\u0005C\u0000\u0000vw\u0005O\u0000\u0000wx\u0005P\u0000\u0000xy\u0005"+
		"Y\u0000\u0000yz\u0005_\u0000\u0000z{\u0005C\u0000\u0000{|\u0005E\u0000"+
		"\u0000|}\u0005L\u0000\u0000}~\u0005L\u0000\u0000~\u0018\u0001\u0000\u0000"+
		"\u0000\u007f\u0080\u0005A\u0000\u0000\u0080\u0081\u0005D\u0000\u0000\u0081"+
		"\u0082\u0005D\u0000\u0000\u0082\u001a\u0001\u0000\u0000\u0000\u0083\u0084"+
		"\u0005S\u0000\u0000\u0084\u0085\u0005U\u0000\u0000\u0085\u0086\u0005B"+
		"\u0000\u0000\u0086\u001c\u0001\u0000\u0000\u0000\u0087\u0088\u0005M\u0000"+
		"\u0000\u0088\u0089\u0005U\u0000\u0000\u0089\u008a\u0005L\u0000\u0000\u008a"+
		"\u001e\u0001\u0000\u0000\u0000\u008b\u008c\u0005D\u0000\u0000\u008c\u008d"+
		"\u0005I\u0000\u0000\u008d\u008e\u0005V\u0000\u0000\u008e \u0001\u0000"+
		"\u0000\u0000\u008f\u0090\u0005M\u0000\u0000\u0090\u0091\u0005O\u0000\u0000"+
		"\u0091\u0092\u0005D\u0000\u0000\u0092\"\u0001\u0000\u0000\u0000\u0093"+
		"\u0094\u0005C\u0000\u0000\u0094\u0095\u0005O\u0000\u0000\u0095\u0096\u0005"+
		"M\u0000\u0000\u0096\u0097\u0005P\u0000\u0000\u0097$\u0001\u0000\u0000"+
		"\u0000\u0098\u009a\u0005-\u0000\u0000\u0099\u0098\u0001\u0000\u0000\u0000"+
		"\u0099\u009a\u0001\u0000\u0000\u0000\u009a\u009c\u0001\u0000\u0000\u0000"+
		"\u009b\u009d\u000209\u0000\u009c\u009b\u0001\u0000\u0000\u0000\u009d\u009e"+
		"\u0001\u0000\u0000\u0000\u009e\u009c\u0001\u0000\u0000\u0000\u009e\u009f"+
		"\u0001\u0000\u0000\u0000\u009f&\u0001\u0000\u0000\u0000\u00a0\u00a2\u0007"+
		"\u0000\u0000\u0000\u00a1\u00a0\u0001\u0000\u0000\u0000\u00a2\u00a3\u0001"+
		"\u0000\u0000\u0000\u00a3\u00a1\u0001\u0000\u0000\u0000\u00a3\u00a4\u0001"+
		"\u0000\u0000\u0000\u00a4\u00a8\u0001\u0000\u0000\u0000\u00a5\u00a7\u0002"+
		"09\u0000\u00a6\u00a5\u0001\u0000\u0000\u0000\u00a7\u00aa\u0001\u0000\u0000"+
		"\u0000\u00a8\u00a6\u0001\u0000\u0000\u0000\u00a8\u00a9\u0001\u0000\u0000"+
		"\u0000\u00a9(\u0001\u0000\u0000\u0000\u00aa\u00a8\u0001\u0000\u0000\u0000"+
		"\u00ab\u00ad\u0007\u0001\u0000\u0000\u00ac\u00ab\u0001\u0000\u0000\u0000"+
		"\u00ad\u00ae\u0001\u0000\u0000\u0000\u00ae\u00ac\u0001\u0000\u0000\u0000"+
		"\u00ae\u00af\u0001\u0000\u0000\u0000\u00af\u00b0\u0001\u0000\u0000\u0000"+
		"\u00b0\u00b1\u0006\u0014\u0000\u0000\u00b1*\u0001\u0000\u0000\u0000\u0006"+
		"\u0000\u0099\u009e\u00a3\u00a8\u00ae\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}