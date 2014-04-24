// Generated from C:/projects/tor/repos/antlr4-maven-example/src/main/java/org/antlrfun\MyLexer.g4 by ANTLR 4.x
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MyLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WS=1, EQ=2, COMMA=3, CMD=4, ID=5;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"WS", "'='", "','", "'cmd'", "ID"
	};
	public static final String[] ruleNames = {
		"WS", "EQ", "COMMA", "CMD", "ID"
	};


	public MyLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "MyLexer.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\7!\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\6\2\17\n\2\r\2\16\2\20\3\2\3\2\3\3"+
		"\3\3\3\4\3\4\3\5\3\5\3\5\3\5\3\6\6\6\36\n\6\r\6\16\6\37\2\2\7\3\3\5\4"+
		"\7\5\t\6\13\7\3\2\4\5\2\13\f\17\17\"\"\5\2\62;C\\c|\"\2\3\3\2\2\2\2\5"+
		"\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\3\16\3\2\2\2\5\24\3\2\2"+
		"\2\7\26\3\2\2\2\t\30\3\2\2\2\13\35\3\2\2\2\r\17\t\2\2\2\16\r\3\2\2\2\17"+
		"\20\3\2\2\2\20\16\3\2\2\2\20\21\3\2\2\2\21\22\3\2\2\2\22\23\b\2\2\2\23"+
		"\4\3\2\2\2\24\25\7?\2\2\25\6\3\2\2\2\26\27\7.\2\2\27\b\3\2\2\2\30\31\7"+
		"e\2\2\31\32\7o\2\2\32\33\7f\2\2\33\n\3\2\2\2\34\36\t\3\2\2\35\34\3\2\2"+
		"\2\36\37\3\2\2\2\37\35\3\2\2\2\37 \3\2\2\2 \f\3\2\2\2\5\2\20\37\3\b\2"+
		"\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}