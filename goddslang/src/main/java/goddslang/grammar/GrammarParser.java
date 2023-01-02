// Generated from java-escape by ANTLR 4.11.1
package goddslang.grammar;
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
		CELLS_COUNT_SUPER=1, CELLS_GRAPH_SUPER=2, CELL_SUPER=3, END_SUPER=4, END_ALL_SUPER=5, 
		INPUT_VALS_SUPER=6, INPUT_VALS_ORDER_SUPER=7, SWAP=8, COPY=9, DEFINE_LABEL=10, 
		JUMP=11, CHECK_IFEZ=12, CHECK_IFLZ=13, CHECK_IFGZ=14, WRITE_CELL=15, READ_CELL=16, 
		COPY_CELL=17, SRCCOPY_SUPER=18, PRINT=19, PRINT_CHAR=20, PRINT_LABEL_NAME=21, 
		PRINT_LABEL_ID=22, ADD=23, SUB=24, MUL=25, DIV=26, MOD=27, COMP=28, SET=29, 
		SET_ALL_SUPER=30, NUMBER=31, ID=32, WS=33, COMMENT=34;
	public static final int
		RULE_start = 0, RULE_preamble = 1, RULE_cellsCode = 2, RULE_cellCodePart = 3, 
		RULE_functionCall = 4, RULE_functionSuper = 5, RULE_function = 6, RULE_idArgument = 7, 
		RULE_numberArgument = 8;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "preamble", "cellsCode", "cellCodePart", "functionCall", "functionSuper", 
			"function", "idArgument", "numberArgument"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'#CELLS_COUNT'", "'#CELLS_GRAPH'", "'#CELL'", "'#END'", "'#END_ALL'", 
			"'#INPUT_VALS'", "'#INPUT_VALS_ORDER'", "'SWAP'", "'COPY'", "'LABEL'", 
			"'JUMP'", "'IFEZ'", "'IFLZ'", "'IFGZ'", "'WRITE_CELL'", "'READ_CELL'", 
			"'COPY_CELL'", "'#SRCCOPY'", "'PRINT'", "'PRINT_CHAR'", "'PRINT_LABEL_NAME'", 
			"'PRINT_LABEL_ID'", "'ADD'", "'SUB'", "'MUL'", "'DIV'", "'MOD'", "'COMP'", 
			"'SET'", "'#SET_ALL'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "CELLS_COUNT_SUPER", "CELLS_GRAPH_SUPER", "CELL_SUPER", "END_SUPER", 
			"END_ALL_SUPER", "INPUT_VALS_SUPER", "INPUT_VALS_ORDER_SUPER", "SWAP", 
			"COPY", "DEFINE_LABEL", "JUMP", "CHECK_IFEZ", "CHECK_IFLZ", "CHECK_IFGZ", 
			"WRITE_CELL", "READ_CELL", "COPY_CELL", "SRCCOPY_SUPER", "PRINT", "PRINT_CHAR", 
			"PRINT_LABEL_NAME", "PRINT_LABEL_ID", "ADD", "SUB", "MUL", "DIV", "MOD", 
			"COMP", "SET", "SET_ALL_SUPER", "NUMBER", "ID", "WS", "COMMENT"
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
		public PreambleContext preamble() {
			return getRuleContext(PreambleContext.class,0);
		}
		public CellsCodeContext cellsCode() {
			return getRuleContext(CellsCodeContext.class,0);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(18);
			preamble();
			setState(19);
			cellsCode();
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
	public static class PreambleContext extends ParserRuleContext {
		public TerminalNode CELLS_COUNT_SUPER() { return getToken(GrammarParser.CELLS_COUNT_SUPER, 0); }
		public List<NumberArgumentContext> numberArgument() {
			return getRuleContexts(NumberArgumentContext.class);
		}
		public NumberArgumentContext numberArgument(int i) {
			return getRuleContext(NumberArgumentContext.class,i);
		}
		public TerminalNode CELLS_GRAPH_SUPER() { return getToken(GrammarParser.CELLS_GRAPH_SUPER, 0); }
		public TerminalNode INPUT_VALS_SUPER() { return getToken(GrammarParser.INPUT_VALS_SUPER, 0); }
		public TerminalNode INPUT_VALS_ORDER_SUPER() { return getToken(GrammarParser.INPUT_VALS_ORDER_SUPER, 0); }
		public List<TerminalNode> SET_ALL_SUPER() { return getTokens(GrammarParser.SET_ALL_SUPER); }
		public TerminalNode SET_ALL_SUPER(int i) {
			return getToken(GrammarParser.SET_ALL_SUPER, i);
		}
		public List<TerminalNode> ID() { return getTokens(GrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(GrammarParser.ID, i);
		}
		public List<TerminalNode> NUMBER() { return getTokens(GrammarParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(GrammarParser.NUMBER, i);
		}
		public PreambleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_preamble; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterPreamble(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitPreamble(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitPreamble(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PreambleContext preamble() throws RecognitionException {
		PreambleContext _localctx = new PreambleContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_preamble);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(21);
			match(CELLS_COUNT_SUPER);
			setState(22);
			numberArgument();
			setState(23);
			match(CELLS_GRAPH_SUPER);
			setState(24);
			numberArgument();
			setState(37);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INPUT_VALS_SUPER) {
				{
				setState(25);
				match(INPUT_VALS_SUPER);
				setState(27); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(26);
					match(NUMBER);
					}
					}
					setState(29); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NUMBER );
				setState(31);
				match(INPUT_VALS_ORDER_SUPER);
				setState(33); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(32);
					match(NUMBER);
					}
					}
					setState(35); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NUMBER );
				}
			}

			setState(48);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SET_ALL_SUPER) {
				{
				{
				setState(39);
				match(SET_ALL_SUPER);
				setState(40);
				match(ID);
				setState(42); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(41);
					match(NUMBER);
					}
					}
					setState(44); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NUMBER );
				}
				}
				setState(50);
				_errHandler.sync(this);
				_la = _input.LA(1);
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
	public static class CellsCodeContext extends ParserRuleContext {
		public TerminalNode CELL_SUPER() { return getToken(GrammarParser.CELL_SUPER, 0); }
		public NumberArgumentContext numberArgument() {
			return getRuleContext(NumberArgumentContext.class,0);
		}
		public IdArgumentContext idArgument() {
			return getRuleContext(IdArgumentContext.class,0);
		}
		public CellCodePartContext cellCodePart() {
			return getRuleContext(CellCodePartContext.class,0);
		}
		public CellsCodeContext cellsCode() {
			return getRuleContext(CellsCodeContext.class,0);
		}
		public TerminalNode END_ALL_SUPER() { return getToken(GrammarParser.END_ALL_SUPER, 0); }
		public CellsCodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cellsCode; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterCellsCode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitCellsCode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitCellsCode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CellsCodeContext cellsCode() throws RecognitionException {
		CellsCodeContext _localctx = new CellsCodeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_cellsCode);
		try {
			setState(58);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CELL_SUPER:
				enterOuterAlt(_localctx, 1);
				{
				setState(51);
				match(CELL_SUPER);
				setState(52);
				numberArgument();
				setState(53);
				idArgument();
				setState(54);
				cellCodePart();
				setState(55);
				cellsCode();
				}
				break;
			case END_ALL_SUPER:
				enterOuterAlt(_localctx, 2);
				{
				setState(57);
				match(END_ALL_SUPER);
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
	public static class CellCodePartContext extends ParserRuleContext {
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public CellCodePartContext cellCodePart() {
			return getRuleContext(CellCodePartContext.class,0);
		}
		public TerminalNode SRCCOPY_SUPER() { return getToken(GrammarParser.SRCCOPY_SUPER, 0); }
		public NumberArgumentContext numberArgument() {
			return getRuleContext(NumberArgumentContext.class,0);
		}
		public TerminalNode END_SUPER() { return getToken(GrammarParser.END_SUPER, 0); }
		public CellCodePartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cellCodePart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterCellCodePart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitCellCodePart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitCellCodePart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CellCodePartContext cellCodePart() throws RecognitionException {
		CellCodePartContext _localctx = new CellCodePartContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_cellCodePart);
		try {
			setState(68);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SWAP:
			case COPY:
			case DEFINE_LABEL:
			case JUMP:
			case CHECK_IFEZ:
			case CHECK_IFLZ:
			case CHECK_IFGZ:
			case WRITE_CELL:
			case READ_CELL:
			case COPY_CELL:
			case PRINT:
			case PRINT_CHAR:
			case PRINT_LABEL_NAME:
			case ADD:
			case SUB:
			case MUL:
			case DIV:
			case MOD:
			case COMP:
			case SET:
				enterOuterAlt(_localctx, 1);
				{
				setState(60);
				functionCall();
				setState(61);
				cellCodePart();
				}
				break;
			case SRCCOPY_SUPER:
				enterOuterAlt(_localctx, 2);
				{
				setState(63);
				match(SRCCOPY_SUPER);
				setState(64);
				numberArgument();
				setState(65);
				cellCodePart();
				}
				break;
			case END_SUPER:
				enterOuterAlt(_localctx, 3);
				{
				setState(67);
				match(END_SUPER);
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
	public static class FunctionCallContext extends ParserRuleContext {
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public List<IdArgumentContext> idArgument() {
			return getRuleContexts(IdArgumentContext.class);
		}
		public IdArgumentContext idArgument(int i) {
			return getRuleContext(IdArgumentContext.class,i);
		}
		public List<NumberArgumentContext> numberArgument() {
			return getRuleContexts(NumberArgumentContext.class);
		}
		public NumberArgumentContext numberArgument(int i) {
			return getRuleContext(NumberArgumentContext.class,i);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_functionCall);
		int _la;
		try {
			int _alt;
			setState(104);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(70);
				function();
				setState(84);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ID) {
					{
					{
					setState(72); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(71);
							idArgument();
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(74); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					setState(79);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NUMBER) {
						{
						{
						setState(76);
						numberArgument();
						}
						}
						setState(81);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					setState(86);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(87);
				function();
				setState(99); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(91);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==ID) {
						{
						{
						setState(88);
						idArgument();
						}
						}
						setState(93);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(95); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(94);
							numberArgument();
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(97); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					}
					}
					setState(101); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NUMBER || _la==ID );
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(103);
				function();
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
	public static class FunctionSuperContext extends ParserRuleContext {
		public TerminalNode CELLS_COUNT_SUPER() { return getToken(GrammarParser.CELLS_COUNT_SUPER, 0); }
		public TerminalNode CELLS_GRAPH_SUPER() { return getToken(GrammarParser.CELLS_GRAPH_SUPER, 0); }
		public TerminalNode CELL_SUPER() { return getToken(GrammarParser.CELL_SUPER, 0); }
		public TerminalNode END_SUPER() { return getToken(GrammarParser.END_SUPER, 0); }
		public TerminalNode END_ALL_SUPER() { return getToken(GrammarParser.END_ALL_SUPER, 0); }
		public TerminalNode SRCCOPY_SUPER() { return getToken(GrammarParser.SRCCOPY_SUPER, 0); }
		public TerminalNode SET_ALL_SUPER() { return getToken(GrammarParser.SET_ALL_SUPER, 0); }
		public TerminalNode INPUT_VALS_SUPER() { return getToken(GrammarParser.INPUT_VALS_SUPER, 0); }
		public TerminalNode INPUT_VALS_ORDER_SUPER() { return getToken(GrammarParser.INPUT_VALS_ORDER_SUPER, 0); }
		public FunctionSuperContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionSuper; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterFunctionSuper(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitFunctionSuper(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitFunctionSuper(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionSuperContext functionSuper() throws RecognitionException {
		FunctionSuperContext _localctx = new FunctionSuperContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_functionSuper);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 1074004222L) != 0) ) {
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
	public static class FunctionContext extends ParserRuleContext {
		public TerminalNode SWAP() { return getToken(GrammarParser.SWAP, 0); }
		public TerminalNode COPY() { return getToken(GrammarParser.COPY, 0); }
		public TerminalNode PRINT() { return getToken(GrammarParser.PRINT, 0); }
		public TerminalNode PRINT_CHAR() { return getToken(GrammarParser.PRINT_CHAR, 0); }
		public TerminalNode DEFINE_LABEL() { return getToken(GrammarParser.DEFINE_LABEL, 0); }
		public TerminalNode JUMP() { return getToken(GrammarParser.JUMP, 0); }
		public TerminalNode CHECK_IFEZ() { return getToken(GrammarParser.CHECK_IFEZ, 0); }
		public TerminalNode CHECK_IFLZ() { return getToken(GrammarParser.CHECK_IFLZ, 0); }
		public TerminalNode CHECK_IFGZ() { return getToken(GrammarParser.CHECK_IFGZ, 0); }
		public TerminalNode WRITE_CELL() { return getToken(GrammarParser.WRITE_CELL, 0); }
		public TerminalNode READ_CELL() { return getToken(GrammarParser.READ_CELL, 0); }
		public TerminalNode COPY_CELL() { return getToken(GrammarParser.COPY_CELL, 0); }
		public TerminalNode ADD() { return getToken(GrammarParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(GrammarParser.SUB, 0); }
		public TerminalNode MUL() { return getToken(GrammarParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(GrammarParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(GrammarParser.MOD, 0); }
		public TerminalNode COMP() { return getToken(GrammarParser.COMP, 0); }
		public TerminalNode PRINT_LABEL_NAME() { return getToken(GrammarParser.PRINT_LABEL_NAME, 0); }
		public TerminalNode SET() { return getToken(GrammarParser.SET, 0); }
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 1069285120L) != 0) ) {
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitIdArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdArgumentContext idArgument() throws RecognitionException {
		IdArgumentContext _localctx = new IdArgumentContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_idArgument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitNumberArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberArgumentContext numberArgument() throws RecognitionException {
		NumberArgumentContext _localctx = new NumberArgumentContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_numberArgument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
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
		"\u0004\u0001\"s\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0004\u0001\u001c\b\u0001"+
		"\u000b\u0001\f\u0001\u001d\u0001\u0001\u0001\u0001\u0004\u0001\"\b\u0001"+
		"\u000b\u0001\f\u0001#\u0003\u0001&\b\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0004\u0001+\b\u0001\u000b\u0001\f\u0001,\u0005\u0001/\b\u0001"+
		"\n\u0001\f\u00012\t\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002;\b\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0003\u0003E\b\u0003\u0001\u0004\u0001\u0004\u0004\u0004"+
		"I\b\u0004\u000b\u0004\f\u0004J\u0001\u0004\u0005\u0004N\b\u0004\n\u0004"+
		"\f\u0004Q\t\u0004\u0005\u0004S\b\u0004\n\u0004\f\u0004V\t\u0004\u0001"+
		"\u0004\u0001\u0004\u0005\u0004Z\b\u0004\n\u0004\f\u0004]\t\u0004\u0001"+
		"\u0004\u0004\u0004`\b\u0004\u000b\u0004\f\u0004a\u0004\u0004d\b\u0004"+
		"\u000b\u0004\f\u0004e\u0001\u0004\u0003\u0004i\b\u0004\u0001\u0005\u0001"+
		"\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b"+
		"\u0001\b\u0000\u0000\t\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0000"+
		"\u0002\u0003\u0000\u0001\u0007\u0012\u0012\u001e\u001e\u0003\u0000\b\u0011"+
		"\u0013\u0015\u0017\u001dy\u0000\u0012\u0001\u0000\u0000\u0000\u0002\u0015"+
		"\u0001\u0000\u0000\u0000\u0004:\u0001\u0000\u0000\u0000\u0006D\u0001\u0000"+
		"\u0000\u0000\bh\u0001\u0000\u0000\u0000\nj\u0001\u0000\u0000\u0000\fl"+
		"\u0001\u0000\u0000\u0000\u000en\u0001\u0000\u0000\u0000\u0010p\u0001\u0000"+
		"\u0000\u0000\u0012\u0013\u0003\u0002\u0001\u0000\u0013\u0014\u0003\u0004"+
		"\u0002\u0000\u0014\u0001\u0001\u0000\u0000\u0000\u0015\u0016\u0005\u0001"+
		"\u0000\u0000\u0016\u0017\u0003\u0010\b\u0000\u0017\u0018\u0005\u0002\u0000"+
		"\u0000\u0018%\u0003\u0010\b\u0000\u0019\u001b\u0005\u0006\u0000\u0000"+
		"\u001a\u001c\u0005\u001f\u0000\u0000\u001b\u001a\u0001\u0000\u0000\u0000"+
		"\u001c\u001d\u0001\u0000\u0000\u0000\u001d\u001b\u0001\u0000\u0000\u0000"+
		"\u001d\u001e\u0001\u0000\u0000\u0000\u001e\u001f\u0001\u0000\u0000\u0000"+
		"\u001f!\u0005\u0007\u0000\u0000 \"\u0005\u001f\u0000\u0000! \u0001\u0000"+
		"\u0000\u0000\"#\u0001\u0000\u0000\u0000#!\u0001\u0000\u0000\u0000#$\u0001"+
		"\u0000\u0000\u0000$&\u0001\u0000\u0000\u0000%\u0019\u0001\u0000\u0000"+
		"\u0000%&\u0001\u0000\u0000\u0000&0\u0001\u0000\u0000\u0000\'(\u0005\u001e"+
		"\u0000\u0000(*\u0005 \u0000\u0000)+\u0005\u001f\u0000\u0000*)\u0001\u0000"+
		"\u0000\u0000+,\u0001\u0000\u0000\u0000,*\u0001\u0000\u0000\u0000,-\u0001"+
		"\u0000\u0000\u0000-/\u0001\u0000\u0000\u0000.\'\u0001\u0000\u0000\u0000"+
		"/2\u0001\u0000\u0000\u00000.\u0001\u0000\u0000\u000001\u0001\u0000\u0000"+
		"\u00001\u0003\u0001\u0000\u0000\u000020\u0001\u0000\u0000\u000034\u0005"+
		"\u0003\u0000\u000045\u0003\u0010\b\u000056\u0003\u000e\u0007\u000067\u0003"+
		"\u0006\u0003\u000078\u0003\u0004\u0002\u00008;\u0001\u0000\u0000\u0000"+
		"9;\u0005\u0005\u0000\u0000:3\u0001\u0000\u0000\u0000:9\u0001\u0000\u0000"+
		"\u0000;\u0005\u0001\u0000\u0000\u0000<=\u0003\b\u0004\u0000=>\u0003\u0006"+
		"\u0003\u0000>E\u0001\u0000\u0000\u0000?@\u0005\u0012\u0000\u0000@A\u0003"+
		"\u0010\b\u0000AB\u0003\u0006\u0003\u0000BE\u0001\u0000\u0000\u0000CE\u0005"+
		"\u0004\u0000\u0000D<\u0001\u0000\u0000\u0000D?\u0001\u0000\u0000\u0000"+
		"DC\u0001\u0000\u0000\u0000E\u0007\u0001\u0000\u0000\u0000FT\u0003\f\u0006"+
		"\u0000GI\u0003\u000e\u0007\u0000HG\u0001\u0000\u0000\u0000IJ\u0001\u0000"+
		"\u0000\u0000JH\u0001\u0000\u0000\u0000JK\u0001\u0000\u0000\u0000KO\u0001"+
		"\u0000\u0000\u0000LN\u0003\u0010\b\u0000ML\u0001\u0000\u0000\u0000NQ\u0001"+
		"\u0000\u0000\u0000OM\u0001\u0000\u0000\u0000OP\u0001\u0000\u0000\u0000"+
		"PS\u0001\u0000\u0000\u0000QO\u0001\u0000\u0000\u0000RH\u0001\u0000\u0000"+
		"\u0000SV\u0001\u0000\u0000\u0000TR\u0001\u0000\u0000\u0000TU\u0001\u0000"+
		"\u0000\u0000Ui\u0001\u0000\u0000\u0000VT\u0001\u0000\u0000\u0000Wc\u0003"+
		"\f\u0006\u0000XZ\u0003\u000e\u0007\u0000YX\u0001\u0000\u0000\u0000Z]\u0001"+
		"\u0000\u0000\u0000[Y\u0001\u0000\u0000\u0000[\\\u0001\u0000\u0000\u0000"+
		"\\_\u0001\u0000\u0000\u0000][\u0001\u0000\u0000\u0000^`\u0003\u0010\b"+
		"\u0000_^\u0001\u0000\u0000\u0000`a\u0001\u0000\u0000\u0000a_\u0001\u0000"+
		"\u0000\u0000ab\u0001\u0000\u0000\u0000bd\u0001\u0000\u0000\u0000c[\u0001"+
		"\u0000\u0000\u0000de\u0001\u0000\u0000\u0000ec\u0001\u0000\u0000\u0000"+
		"ef\u0001\u0000\u0000\u0000fi\u0001\u0000\u0000\u0000gi\u0003\f\u0006\u0000"+
		"hF\u0001\u0000\u0000\u0000hW\u0001\u0000\u0000\u0000hg\u0001\u0000\u0000"+
		"\u0000i\t\u0001\u0000\u0000\u0000jk\u0007\u0000\u0000\u0000k\u000b\u0001"+
		"\u0000\u0000\u0000lm\u0007\u0001\u0000\u0000m\r\u0001\u0000\u0000\u0000"+
		"no\u0005 \u0000\u0000o\u000f\u0001\u0000\u0000\u0000pq\u0005\u001f\u0000"+
		"\u0000q\u0011\u0001\u0000\u0000\u0000\u000e\u001d#%,0:DJOT[aeh";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}