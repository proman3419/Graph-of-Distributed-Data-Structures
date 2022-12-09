// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class GrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SWAP_NOARG=1, COPY_NOARG=2, END_NOARG=3, DEFINE_LABEL_ID=4, JUMP_ID=5, 
		CHECK_IFEZ_ID=6, CHECK_IFLZ_ID=7, CHECK_IFGZ_ID=8, WRITE_CELL_ID=9, READ_CELL_ID=10, 
		COPY_CELL_ID=11, SRCCOPY_CELL_ID=12, ADD_VAL=13, SUB_VAL=14, MUL_VAL=15, 
		DIV_VAL=16, MOD_VAL=17, COMP_VAL=18, NUMBER=19, ID=20, WS=21;
	public static final int
		RULE_start = 0, RULE_main = 1, RULE_function = 2, RULE_functionNoArgument = 3, 
		RULE_functionIDArgument = 4, RULE_functionNUMBERArgument = 5, RULE_idArgument = 6, 
		RULE_numberArgument = 7;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "main", "function", "functionNoArgument", "functionIDArgument", 
			"functionNUMBERArgument", "idArgument", "numberArgument"
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

	@Override
	public String getGrammarFileName() { return "java-escape"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StartContext extends ParserRuleContext {
		public MainContext main() {
			return getRuleContext(MainContext.class,0);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitStart(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(16);
			main();
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

	@SuppressWarnings("CheckReturnValue")
	public static class MainContext extends ParserRuleContext {
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public MainContext main() {
			return getRuleContext(MainContext.class,0);
		}
		public TerminalNode END_NOARG() { return getToken(GrammarParser.END_NOARG, 0); }
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterMain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitMain(this);
		}
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_main);
		try {
			setState(22);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(18);
				function();
				setState(19);
				main();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(21);
				match(END_NOARG);
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionContext extends ParserRuleContext {
		public FunctionNoArgumentContext functionNoArgument() {
			return getRuleContext(FunctionNoArgumentContext.class,0);
		}
		public FunctionIDArgumentContext functionIDArgument() {
			return getRuleContext(FunctionIDArgumentContext.class,0);
		}
		public IdArgumentContext idArgument() {
			return getRuleContext(IdArgumentContext.class,0);
		}
		public FunctionNUMBERArgumentContext functionNUMBERArgument() {
			return getRuleContext(FunctionNUMBERArgumentContext.class,0);
		}
		public NumberArgumentContext numberArgument() {
			return getRuleContext(NumberArgumentContext.class,0);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitFunction(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_function);
		try {
			setState(31);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SWAP_NOARG:
			case COPY_NOARG:
			case END_NOARG:
				enterOuterAlt(_localctx, 1);
				{
				setState(24);
				functionNoArgument();
				}
				break;
			case DEFINE_LABEL_ID:
			case JUMP_ID:
			case CHECK_IFEZ_ID:
			case CHECK_IFLZ_ID:
			case CHECK_IFGZ_ID:
			case WRITE_CELL_ID:
			case READ_CELL_ID:
			case COPY_CELL_ID:
			case SRCCOPY_CELL_ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(25);
				functionIDArgument();
				setState(26);
				idArgument();
				}
				break;
			case ADD_VAL:
			case SUB_VAL:
			case MUL_VAL:
			case DIV_VAL:
			case MOD_VAL:
			case COMP_VAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(28);
				functionNUMBERArgument();
				setState(29);
				numberArgument();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionNoArgumentContext extends ParserRuleContext {
		public TerminalNode SWAP_NOARG() { return getToken(GrammarParser.SWAP_NOARG, 0); }
		public TerminalNode COPY_NOARG() { return getToken(GrammarParser.COPY_NOARG, 0); }
		public TerminalNode END_NOARG() { return getToken(GrammarParser.END_NOARG, 0); }
		public FunctionNoArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionNoArgument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterFunctionNoArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitFunctionNoArgument(this);
		}
	}

	public final FunctionNoArgumentContext functionNoArgument() throws RecognitionException {
		FunctionNoArgumentContext _localctx = new FunctionNoArgumentContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_functionNoArgument);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(33);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 14L) != 0) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionIDArgumentContext extends ParserRuleContext {
		public TerminalNode DEFINE_LABEL_ID() { return getToken(GrammarParser.DEFINE_LABEL_ID, 0); }
		public TerminalNode JUMP_ID() { return getToken(GrammarParser.JUMP_ID, 0); }
		public TerminalNode CHECK_IFEZ_ID() { return getToken(GrammarParser.CHECK_IFEZ_ID, 0); }
		public TerminalNode CHECK_IFLZ_ID() { return getToken(GrammarParser.CHECK_IFLZ_ID, 0); }
		public TerminalNode CHECK_IFGZ_ID() { return getToken(GrammarParser.CHECK_IFGZ_ID, 0); }
		public TerminalNode WRITE_CELL_ID() { return getToken(GrammarParser.WRITE_CELL_ID, 0); }
		public TerminalNode READ_CELL_ID() { return getToken(GrammarParser.READ_CELL_ID, 0); }
		public TerminalNode COPY_CELL_ID() { return getToken(GrammarParser.COPY_CELL_ID, 0); }
		public TerminalNode SRCCOPY_CELL_ID() { return getToken(GrammarParser.SRCCOPY_CELL_ID, 0); }
		public FunctionIDArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionIDArgument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterFunctionIDArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitFunctionIDArgument(this);
		}
	}

	public final FunctionIDArgumentContext functionIDArgument() throws RecognitionException {
		FunctionIDArgumentContext _localctx = new FunctionIDArgumentContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_functionIDArgument);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 8176L) != 0) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionNUMBERArgumentContext extends ParserRuleContext {
		public TerminalNode ADD_VAL() { return getToken(GrammarParser.ADD_VAL, 0); }
		public TerminalNode SUB_VAL() { return getToken(GrammarParser.SUB_VAL, 0); }
		public TerminalNode MUL_VAL() { return getToken(GrammarParser.MUL_VAL, 0); }
		public TerminalNode DIV_VAL() { return getToken(GrammarParser.DIV_VAL, 0); }
		public TerminalNode MOD_VAL() { return getToken(GrammarParser.MOD_VAL, 0); }
		public TerminalNode COMP_VAL() { return getToken(GrammarParser.COMP_VAL, 0); }
		public FunctionNUMBERArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionNUMBERArgument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterFunctionNUMBERArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitFunctionNUMBERArgument(this);
		}
	}

	public final FunctionNUMBERArgumentContext functionNUMBERArgument() throws RecognitionException {
		FunctionNUMBERArgumentContext _localctx = new FunctionNUMBERArgumentContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_functionNUMBERArgument);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 516096L) != 0) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class IdArgumentContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(GrammarParser.ID, 0); }
		public IdArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idArgument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterIdArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitIdArgument(this);
		}
	}

	public final IdArgumentContext idArgument() throws RecognitionException {
		IdArgumentContext _localctx = new IdArgumentContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_idArgument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			match(ID);
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

	@SuppressWarnings("CheckReturnValue")
	public static class NumberArgumentContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(GrammarParser.NUMBER, 0); }
		public NumberArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numberArgument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterNumberArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitNumberArgument(this);
		}
	}

	public final NumberArgumentContext numberArgument() throws RecognitionException {
		NumberArgumentContext _localctx = new NumberArgumentContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_numberArgument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			match(NUMBER);
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
		"\u0004\u0001\u0015,\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0001"+
		"\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003"+
		"\u0001\u0017\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0003\u0002 \b\u0002\u0001\u0003\u0001"+
		"\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001"+
		"\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0000\u0000\b\u0000\u0002\u0004"+
		"\u0006\b\n\f\u000e\u0000\u0003\u0001\u0000\u0001\u0003\u0001\u0000\u0004"+
		"\f\u0001\u0000\r\u0012&\u0000\u0010\u0001\u0000\u0000\u0000\u0002\u0016"+
		"\u0001\u0000\u0000\u0000\u0004\u001f\u0001\u0000\u0000\u0000\u0006!\u0001"+
		"\u0000\u0000\u0000\b#\u0001\u0000\u0000\u0000\n%\u0001\u0000\u0000\u0000"+
		"\f\'\u0001\u0000\u0000\u0000\u000e)\u0001\u0000\u0000\u0000\u0010\u0011"+
		"\u0003\u0002\u0001\u0000\u0011\u0001\u0001\u0000\u0000\u0000\u0012\u0013"+
		"\u0003\u0004\u0002\u0000\u0013\u0014\u0003\u0002\u0001\u0000\u0014\u0017"+
		"\u0001\u0000\u0000\u0000\u0015\u0017\u0005\u0003\u0000\u0000\u0016\u0012"+
		"\u0001\u0000\u0000\u0000\u0016\u0015\u0001\u0000\u0000\u0000\u0017\u0003"+
		"\u0001\u0000\u0000\u0000\u0018 \u0003\u0006\u0003\u0000\u0019\u001a\u0003"+
		"\b\u0004\u0000\u001a\u001b\u0003\f\u0006\u0000\u001b \u0001\u0000\u0000"+
		"\u0000\u001c\u001d\u0003\n\u0005\u0000\u001d\u001e\u0003\u000e\u0007\u0000"+
		"\u001e \u0001\u0000\u0000\u0000\u001f\u0018\u0001\u0000\u0000\u0000\u001f"+
		"\u0019\u0001\u0000\u0000\u0000\u001f\u001c\u0001\u0000\u0000\u0000 \u0005"+
		"\u0001\u0000\u0000\u0000!\"\u0007\u0000\u0000\u0000\"\u0007\u0001\u0000"+
		"\u0000\u0000#$\u0007\u0001\u0000\u0000$\t\u0001\u0000\u0000\u0000%&\u0007"+
		"\u0002\u0000\u0000&\u000b\u0001\u0000\u0000\u0000\'(\u0005\u0014\u0000"+
		"\u0000(\r\u0001\u0000\u0000\u0000)*\u0005\u0013\u0000\u0000*\u000f\u0001"+
		"\u0000\u0000\u0000\u0002\u0016\u001f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}