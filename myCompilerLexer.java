// $ANTLR 3.5.2 myCompiler.g 2019-06-21 02:48:56

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class myCompilerLexer extends Lexer {
	public static final int EOF=-1;
	public static final int T__16=16;
	public static final int T__17=17;
	public static final int T__18=18;
	public static final int T__19=19;
	public static final int T__20=20;
	public static final int T__21=21;
	public static final int T__22=22;
	public static final int T__23=23;
	public static final int T__24=24;
	public static final int T__25=25;
	public static final int T__26=26;
	public static final int T__27=27;
	public static final int T__28=28;
	public static final int T__29=29;
	public static final int T__30=30;
	public static final int T__31=31;
	public static final int T__32=32;
	public static final int T__33=33;
	public static final int T__34=34;
	public static final int T__35=35;
	public static final int T__36=36;
	public static final int T__37=37;
	public static final int T__38=38;
	public static final int T__39=39;
	public static final int COMMENT1=4;
	public static final int COMMENT2=5;
	public static final int DEC_NUM=6;
	public static final int DIGIT=7;
	public static final int FLOAT_NUM=8;
	public static final int FLOAT_NUM1=9;
	public static final int FLOAT_NUM2=10;
	public static final int FLOAT_NUM3=11;
	public static final int ID=12;
	public static final int LETTER=13;
	public static final int STRING=14;
	public static final int WS=15;

	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public myCompilerLexer() {} 
	public myCompilerLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public myCompilerLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "myCompiler.g"; }

	// $ANTLR start "T__16"
	public final void mT__16() throws RecognitionException {
		try {
			int _type = T__16;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:7:7: ( '!=' )
			// myCompiler.g:7:9: '!='
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
	// $ANTLR end "T__16"

	// $ANTLR start "T__17"
	public final void mT__17() throws RecognitionException {
		try {
			int _type = T__17;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:8:7: ( '(' )
			// myCompiler.g:8:9: '('
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
	// $ANTLR end "T__17"

	// $ANTLR start "T__18"
	public final void mT__18() throws RecognitionException {
		try {
			int _type = T__18;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:9:7: ( ')' )
			// myCompiler.g:9:9: ')'
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
	// $ANTLR end "T__18"

	// $ANTLR start "T__19"
	public final void mT__19() throws RecognitionException {
		try {
			int _type = T__19;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:10:7: ( '*' )
			// myCompiler.g:10:9: '*'
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
	// $ANTLR end "T__19"

	// $ANTLR start "T__20"
	public final void mT__20() throws RecognitionException {
		try {
			int _type = T__20;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:11:7: ( '+' )
			// myCompiler.g:11:9: '+'
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
	// $ANTLR end "T__20"

	// $ANTLR start "T__21"
	public final void mT__21() throws RecognitionException {
		try {
			int _type = T__21;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:12:7: ( ',' )
			// myCompiler.g:12:9: ','
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
	// $ANTLR end "T__21"

	// $ANTLR start "T__22"
	public final void mT__22() throws RecognitionException {
		try {
			int _type = T__22;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:13:7: ( '-' )
			// myCompiler.g:13:9: '-'
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
	// $ANTLR end "T__22"

	// $ANTLR start "T__23"
	public final void mT__23() throws RecognitionException {
		try {
			int _type = T__23;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:14:7: ( '/' )
			// myCompiler.g:14:9: '/'
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
	// $ANTLR end "T__23"

	// $ANTLR start "T__24"
	public final void mT__24() throws RecognitionException {
		try {
			int _type = T__24;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:15:7: ( ';' )
			// myCompiler.g:15:9: ';'
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
	// $ANTLR end "T__24"

	// $ANTLR start "T__25"
	public final void mT__25() throws RecognitionException {
		try {
			int _type = T__25;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:16:7: ( '<' )
			// myCompiler.g:16:9: '<'
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
	// $ANTLR end "T__25"

	// $ANTLR start "T__26"
	public final void mT__26() throws RecognitionException {
		try {
			int _type = T__26;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:17:7: ( '<=' )
			// myCompiler.g:17:9: '<='
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
	// $ANTLR end "T__26"

	// $ANTLR start "T__27"
	public final void mT__27() throws RecognitionException {
		try {
			int _type = T__27;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:18:7: ( '=' )
			// myCompiler.g:18:9: '='
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
	// $ANTLR end "T__27"

	// $ANTLR start "T__28"
	public final void mT__28() throws RecognitionException {
		try {
			int _type = T__28;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:19:7: ( '==' )
			// myCompiler.g:19:9: '=='
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
	// $ANTLR end "T__28"

	// $ANTLR start "T__29"
	public final void mT__29() throws RecognitionException {
		try {
			int _type = T__29;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:20:7: ( '>' )
			// myCompiler.g:20:9: '>'
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
	// $ANTLR end "T__29"

	// $ANTLR start "T__30"
	public final void mT__30() throws RecognitionException {
		try {
			int _type = T__30;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:21:7: ( '>=' )
			// myCompiler.g:21:9: '>='
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
	// $ANTLR end "T__30"

	// $ANTLR start "T__31"
	public final void mT__31() throws RecognitionException {
		try {
			int _type = T__31;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:22:7: ( 'else' )
			// myCompiler.g:22:9: 'else'
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
	// $ANTLR end "T__31"

	// $ANTLR start "T__32"
	public final void mT__32() throws RecognitionException {
		try {
			int _type = T__32;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:23:7: ( 'float' )
			// myCompiler.g:23:9: 'float'
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
	// $ANTLR end "T__32"

	// $ANTLR start "T__33"
	public final void mT__33() throws RecognitionException {
		try {
			int _type = T__33;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:24:7: ( 'for' )
			// myCompiler.g:24:9: 'for'
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
	// $ANTLR end "T__33"

	// $ANTLR start "T__34"
	public final void mT__34() throws RecognitionException {
		try {
			int _type = T__34;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:25:7: ( 'if' )
			// myCompiler.g:25:9: 'if'
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
	// $ANTLR end "T__34"

	// $ANTLR start "T__35"
	public final void mT__35() throws RecognitionException {
		try {
			int _type = T__35;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:26:7: ( 'int' )
			// myCompiler.g:26:9: 'int'
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
	// $ANTLR end "T__35"

	// $ANTLR start "T__36"
	public final void mT__36() throws RecognitionException {
		try {
			int _type = T__36;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:27:7: ( 'printf' )
			// myCompiler.g:27:9: 'printf'
			{
			match("printf"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__36"

	// $ANTLR start "T__37"
	public final void mT__37() throws RecognitionException {
		try {
			int _type = T__37;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:28:7: ( 'while' )
			// myCompiler.g:28:9: 'while'
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
	// $ANTLR end "T__37"

	// $ANTLR start "T__38"
	public final void mT__38() throws RecognitionException {
		try {
			int _type = T__38;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:29:7: ( '{' )
			// myCompiler.g:29:9: '{'
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
	// $ANTLR end "T__38"

	// $ANTLR start "T__39"
	public final void mT__39() throws RecognitionException {
		try {
			int _type = T__39;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:30:7: ( '}' )
			// myCompiler.g:30:9: '}'
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
	// $ANTLR end "T__39"

	// $ANTLR start "COMMENT1"
	public final void mCOMMENT1() throws RecognitionException {
		try {
			int _type = COMMENT1;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:646:10: ( '//' ( . )* '\\n' )
			// myCompiler.g:646:12: '//' ( . )* '\\n'
			{
			match("//"); 

			// myCompiler.g:646:17: ( . )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0=='\n') ) {
					alt1=2;
				}
				else if ( ((LA1_0 >= '\u0000' && LA1_0 <= '\t')||(LA1_0 >= '\u000B' && LA1_0 <= '\uFFFF')) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// myCompiler.g:646:18: .
					{
					matchAny(); 
					}
					break;

				default :
					break loop1;
				}
			}

			match('\n'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMMENT1"

	// $ANTLR start "COMMENT2"
	public final void mCOMMENT2() throws RecognitionException {
		try {
			int _type = COMMENT2;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:647:10: ( '/*' ( options {greedy=false; } : . )* '*/' )
			// myCompiler.g:647:12: '/*' ( options {greedy=false; } : . )* '*/'
			{
			match("/*"); 

			// myCompiler.g:647:17: ( options {greedy=false; } : . )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( (LA2_0=='*') ) {
					int LA2_1 = input.LA(2);
					if ( (LA2_1=='/') ) {
						alt2=2;
					}
					else if ( ((LA2_1 >= '\u0000' && LA2_1 <= '.')||(LA2_1 >= '0' && LA2_1 <= '\uFFFF')) ) {
						alt2=1;
					}

				}
				else if ( ((LA2_0 >= '\u0000' && LA2_0 <= ')')||(LA2_0 >= '+' && LA2_0 <= '\uFFFF')) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// myCompiler.g:647:42: .
					{
					matchAny(); 
					}
					break;

				default :
					break loop2;
				}
			}

			match("*/"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMMENT2"

	// $ANTLR start "STRING"
	public final void mSTRING() throws RecognitionException {
		try {
			int _type = STRING;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:648:8: ( '\"' ( '%f' | '%d' | '\\\\n' | ID | DEC_NUM | '\\\\t' | '\\\\r' | ' ' )* '\"' )
			// myCompiler.g:648:10: '\"' ( '%f' | '%d' | '\\\\n' | ID | DEC_NUM | '\\\\t' | '\\\\r' | ' ' )* '\"'
			{
			match('\"'); 
			// myCompiler.g:648:14: ( '%f' | '%d' | '\\\\n' | ID | DEC_NUM | '\\\\t' | '\\\\r' | ' ' )*
			loop3:
			while (true) {
				int alt3=9;
				switch ( input.LA(1) ) {
				case '%':
					{
					int LA3_2 = input.LA(2);
					if ( (LA3_2=='f') ) {
						alt3=1;
					}
					else if ( (LA3_2=='d') ) {
						alt3=2;
					}

					}
					break;
				case '\\':
					{
					switch ( input.LA(2) ) {
					case 'n':
						{
						alt3=3;
						}
						break;
					case 't':
						{
						alt3=6;
						}
						break;
					case 'r':
						{
						alt3=7;
						}
						break;
					}
					}
					break;
				case 'A':
				case 'B':
				case 'C':
				case 'D':
				case 'E':
				case 'F':
				case 'G':
				case 'H':
				case 'I':
				case 'J':
				case 'K':
				case 'L':
				case 'M':
				case 'N':
				case 'O':
				case 'P':
				case 'Q':
				case 'R':
				case 'S':
				case 'T':
				case 'U':
				case 'V':
				case 'W':
				case 'X':
				case 'Y':
				case 'Z':
				case '_':
				case 'a':
				case 'b':
				case 'c':
				case 'd':
				case 'e':
				case 'f':
				case 'g':
				case 'h':
				case 'i':
				case 'j':
				case 'k':
				case 'l':
				case 'm':
				case 'n':
				case 'o':
				case 'p':
				case 'q':
				case 'r':
				case 's':
				case 't':
				case 'u':
				case 'v':
				case 'w':
				case 'x':
				case 'y':
				case 'z':
					{
					alt3=4;
					}
					break;
				case '0':
				case '1':
				case '2':
				case '3':
				case '4':
				case '5':
				case '6':
				case '7':
				case '8':
				case '9':
					{
					alt3=5;
					}
					break;
				case ' ':
					{
					alt3=8;
					}
					break;
				}
				switch (alt3) {
				case 1 :
					// myCompiler.g:648:15: '%f'
					{
					match("%f"); 

					}
					break;
				case 2 :
					// myCompiler.g:648:20: '%d'
					{
					match("%d"); 

					}
					break;
				case 3 :
					// myCompiler.g:648:25: '\\\\n'
					{
					match("\\n"); 

					}
					break;
				case 4 :
					// myCompiler.g:648:31: ID
					{
					mID(); 

					}
					break;
				case 5 :
					// myCompiler.g:648:34: DEC_NUM
					{
					mDEC_NUM(); 

					}
					break;
				case 6 :
					// myCompiler.g:648:44: '\\\\t'
					{
					match("\\t"); 

					}
					break;
				case 7 :
					// myCompiler.g:648:52: '\\\\r'
					{
					match("\\r"); 

					}
					break;
				case 8 :
					// myCompiler.g:648:60: ' '
					{
					match(' '); 
					}
					break;

				default :
					break loop3;
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
	// $ANTLR end "STRING"

	// $ANTLR start "ID"
	public final void mID() throws RecognitionException {
		try {
			int _type = ID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:650:4: ( ( LETTER ) ( LETTER | DIGIT )* )
			// myCompiler.g:650:6: ( LETTER ) ( LETTER | DIGIT )*
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// myCompiler.g:650:14: ( LETTER | DIGIT )*
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( ((LA4_0 >= '0' && LA4_0 <= '9')||(LA4_0 >= 'A' && LA4_0 <= 'Z')||LA4_0=='_'||(LA4_0 >= 'a' && LA4_0 <= 'z')) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// myCompiler.g:
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
					break loop4;
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
	// $ANTLR end "ID"

	// $ANTLR start "DEC_NUM"
	public final void mDEC_NUM() throws RecognitionException {
		try {
			int _type = DEC_NUM;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:652:9: ( ( '0' | ( '1' .. '9' ) ( DIGIT )* ) )
			// myCompiler.g:652:11: ( '0' | ( '1' .. '9' ) ( DIGIT )* )
			{
			// myCompiler.g:652:11: ( '0' | ( '1' .. '9' ) ( DIGIT )* )
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0=='0') ) {
				alt6=1;
			}
			else if ( ((LA6_0 >= '1' && LA6_0 <= '9')) ) {
				alt6=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				throw nvae;
			}

			switch (alt6) {
				case 1 :
					// myCompiler.g:652:12: '0'
					{
					match('0'); 
					}
					break;
				case 2 :
					// myCompiler.g:652:18: ( '1' .. '9' ) ( DIGIT )*
					{
					if ( (input.LA(1) >= '1' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					// myCompiler.g:652:28: ( DIGIT )*
					loop5:
					while (true) {
						int alt5=2;
						int LA5_0 = input.LA(1);
						if ( ((LA5_0 >= '0' && LA5_0 <= '9')) ) {
							alt5=1;
						}

						switch (alt5) {
						case 1 :
							// myCompiler.g:
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
							break loop5;
						}
					}

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
	// $ANTLR end "DEC_NUM"

	// $ANTLR start "FLOAT_NUM"
	public final void mFLOAT_NUM() throws RecognitionException {
		try {
			int _type = FLOAT_NUM;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:654:10: ( FLOAT_NUM1 | FLOAT_NUM2 | FLOAT_NUM3 )
			int alt7=3;
			alt7 = dfa7.predict(input);
			switch (alt7) {
				case 1 :
					// myCompiler.g:654:12: FLOAT_NUM1
					{
					mFLOAT_NUM1(); 

					}
					break;
				case 2 :
					// myCompiler.g:654:25: FLOAT_NUM2
					{
					mFLOAT_NUM2(); 

					}
					break;
				case 3 :
					// myCompiler.g:654:38: FLOAT_NUM3
					{
					mFLOAT_NUM3(); 

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
	// $ANTLR end "FLOAT_NUM"

	// $ANTLR start "FLOAT_NUM1"
	public final void mFLOAT_NUM1() throws RecognitionException {
		try {
			// myCompiler.g:655:20: ( ( DIGIT )+ '.' ( DIGIT )* )
			// myCompiler.g:655:22: ( DIGIT )+ '.' ( DIGIT )*
			{
			// myCompiler.g:655:22: ( DIGIT )+
			int cnt8=0;
			loop8:
			while (true) {
				int alt8=2;
				int LA8_0 = input.LA(1);
				if ( ((LA8_0 >= '0' && LA8_0 <= '9')) ) {
					alt8=1;
				}

				switch (alt8) {
				case 1 :
					// myCompiler.g:
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
					if ( cnt8 >= 1 ) break loop8;
					EarlyExitException eee = new EarlyExitException(8, input);
					throw eee;
				}
				cnt8++;
			}

			match('.'); 
			// myCompiler.g:655:33: ( DIGIT )*
			loop9:
			while (true) {
				int alt9=2;
				int LA9_0 = input.LA(1);
				if ( ((LA9_0 >= '0' && LA9_0 <= '9')) ) {
					alt9=1;
				}

				switch (alt9) {
				case 1 :
					// myCompiler.g:
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
					break loop9;
				}
			}

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FLOAT_NUM1"

	// $ANTLR start "FLOAT_NUM2"
	public final void mFLOAT_NUM2() throws RecognitionException {
		try {
			// myCompiler.g:656:20: ( '.' ( DIGIT )+ )
			// myCompiler.g:656:22: '.' ( DIGIT )+
			{
			match('.'); 
			// myCompiler.g:656:25: ( DIGIT )+
			int cnt10=0;
			loop10:
			while (true) {
				int alt10=2;
				int LA10_0 = input.LA(1);
				if ( ((LA10_0 >= '0' && LA10_0 <= '9')) ) {
					alt10=1;
				}

				switch (alt10) {
				case 1 :
					// myCompiler.g:
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
					if ( cnt10 >= 1 ) break loop10;
					EarlyExitException eee = new EarlyExitException(10, input);
					throw eee;
				}
				cnt10++;
			}

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FLOAT_NUM2"

	// $ANTLR start "FLOAT_NUM3"
	public final void mFLOAT_NUM3() throws RecognitionException {
		try {
			// myCompiler.g:657:20: ( ( DIGIT )+ )
			// myCompiler.g:657:22: ( DIGIT )+
			{
			// myCompiler.g:657:22: ( DIGIT )+
			int cnt11=0;
			loop11:
			while (true) {
				int alt11=2;
				int LA11_0 = input.LA(1);
				if ( ((LA11_0 >= '0' && LA11_0 <= '9')) ) {
					alt11=1;
				}

				switch (alt11) {
				case 1 :
					// myCompiler.g:
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
					if ( cnt11 >= 1 ) break loop11;
					EarlyExitException eee = new EarlyExitException(11, input);
					throw eee;
				}
				cnt11++;
			}

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FLOAT_NUM3"

	// $ANTLR start "LETTER"
	public final void mLETTER() throws RecognitionException {
		try {
			// myCompiler.g:659:17: ( 'a' .. 'z' | 'A' .. 'Z' | '_' )
			// myCompiler.g:
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
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
	// $ANTLR end "LETTER"

	// $ANTLR start "DIGIT"
	public final void mDIGIT() throws RecognitionException {
		try {
			// myCompiler.g:660:16: ( '0' .. '9' )
			// myCompiler.g:
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
	// $ANTLR end "DIGIT"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:662:4: ( ( ' ' | '\\t' | '\\n' | '\\r' )+ )
			// myCompiler.g:662:6: ( ' ' | '\\t' | '\\n' | '\\r' )+
			{
			// myCompiler.g:662:6: ( ' ' | '\\t' | '\\n' | '\\r' )+
			int cnt12=0;
			loop12:
			while (true) {
				int alt12=2;
				int LA12_0 = input.LA(1);
				if ( ((LA12_0 >= '\t' && LA12_0 <= '\n')||LA12_0=='\r'||LA12_0==' ') ) {
					alt12=1;
				}

				switch (alt12) {
				case 1 :
					// myCompiler.g:
					{
					if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
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
					if ( cnt12 >= 1 ) break loop12;
					EarlyExitException eee = new EarlyExitException(12, input);
					throw eee;
				}
				cnt12++;
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

	@Override
	public void mTokens() throws RecognitionException {
		// myCompiler.g:1:8: ( T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | COMMENT1 | COMMENT2 | STRING | ID | DEC_NUM | FLOAT_NUM | WS )
		int alt13=31;
		alt13 = dfa13.predict(input);
		switch (alt13) {
			case 1 :
				// myCompiler.g:1:10: T__16
				{
				mT__16(); 

				}
				break;
			case 2 :
				// myCompiler.g:1:16: T__17
				{
				mT__17(); 

				}
				break;
			case 3 :
				// myCompiler.g:1:22: T__18
				{
				mT__18(); 

				}
				break;
			case 4 :
				// myCompiler.g:1:28: T__19
				{
				mT__19(); 

				}
				break;
			case 5 :
				// myCompiler.g:1:34: T__20
				{
				mT__20(); 

				}
				break;
			case 6 :
				// myCompiler.g:1:40: T__21
				{
				mT__21(); 

				}
				break;
			case 7 :
				// myCompiler.g:1:46: T__22
				{
				mT__22(); 

				}
				break;
			case 8 :
				// myCompiler.g:1:52: T__23
				{
				mT__23(); 

				}
				break;
			case 9 :
				// myCompiler.g:1:58: T__24
				{
				mT__24(); 

				}
				break;
			case 10 :
				// myCompiler.g:1:64: T__25
				{
				mT__25(); 

				}
				break;
			case 11 :
				// myCompiler.g:1:70: T__26
				{
				mT__26(); 

				}
				break;
			case 12 :
				// myCompiler.g:1:76: T__27
				{
				mT__27(); 

				}
				break;
			case 13 :
				// myCompiler.g:1:82: T__28
				{
				mT__28(); 

				}
				break;
			case 14 :
				// myCompiler.g:1:88: T__29
				{
				mT__29(); 

				}
				break;
			case 15 :
				// myCompiler.g:1:94: T__30
				{
				mT__30(); 

				}
				break;
			case 16 :
				// myCompiler.g:1:100: T__31
				{
				mT__31(); 

				}
				break;
			case 17 :
				// myCompiler.g:1:106: T__32
				{
				mT__32(); 

				}
				break;
			case 18 :
				// myCompiler.g:1:112: T__33
				{
				mT__33(); 

				}
				break;
			case 19 :
				// myCompiler.g:1:118: T__34
				{
				mT__34(); 

				}
				break;
			case 20 :
				// myCompiler.g:1:124: T__35
				{
				mT__35(); 

				}
				break;
			case 21 :
				// myCompiler.g:1:130: T__36
				{
				mT__36(); 

				}
				break;
			case 22 :
				// myCompiler.g:1:136: T__37
				{
				mT__37(); 

				}
				break;
			case 23 :
				// myCompiler.g:1:142: T__38
				{
				mT__38(); 

				}
				break;
			case 24 :
				// myCompiler.g:1:148: T__39
				{
				mT__39(); 

				}
				break;
			case 25 :
				// myCompiler.g:1:154: COMMENT1
				{
				mCOMMENT1(); 

				}
				break;
			case 26 :
				// myCompiler.g:1:163: COMMENT2
				{
				mCOMMENT2(); 

				}
				break;
			case 27 :
				// myCompiler.g:1:172: STRING
				{
				mSTRING(); 

				}
				break;
			case 28 :
				// myCompiler.g:1:179: ID
				{
				mID(); 

				}
				break;
			case 29 :
				// myCompiler.g:1:182: DEC_NUM
				{
				mDEC_NUM(); 

				}
				break;
			case 30 :
				// myCompiler.g:1:190: FLOAT_NUM
				{
				mFLOAT_NUM(); 

				}
				break;
			case 31 :
				// myCompiler.g:1:200: WS
				{
				mWS(); 

				}
				break;

		}
	}


	protected DFA7 dfa7 = new DFA7(this);
	protected DFA13 dfa13 = new DFA13(this);
	static final String DFA7_eotS =
		"\1\uffff\1\4\3\uffff";
	static final String DFA7_eofS =
		"\5\uffff";
	static final String DFA7_minS =
		"\2\56\3\uffff";
	static final String DFA7_maxS =
		"\2\71\3\uffff";
	static final String DFA7_acceptS =
		"\2\uffff\1\2\1\1\1\3";
	static final String DFA7_specialS =
		"\5\uffff}>";
	static final String[] DFA7_transitionS = {
			"\1\2\1\uffff\12\1",
			"\1\3\1\uffff\12\1",
			"",
			"",
			""
	};

	static final short[] DFA7_eot = DFA.unpackEncodedString(DFA7_eotS);
	static final short[] DFA7_eof = DFA.unpackEncodedString(DFA7_eofS);
	static final char[] DFA7_min = DFA.unpackEncodedStringToUnsignedChars(DFA7_minS);
	static final char[] DFA7_max = DFA.unpackEncodedStringToUnsignedChars(DFA7_maxS);
	static final short[] DFA7_accept = DFA.unpackEncodedString(DFA7_acceptS);
	static final short[] DFA7_special = DFA.unpackEncodedString(DFA7_specialS);
	static final short[][] DFA7_transition;

	static {
		int numStates = DFA7_transitionS.length;
		DFA7_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA7_transition[i] = DFA.unpackEncodedString(DFA7_transitionS[i]);
		}
	}

	protected class DFA7 extends DFA {

		public DFA7(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 7;
			this.eot = DFA7_eot;
			this.eof = DFA7_eof;
			this.min = DFA7_min;
			this.max = DFA7_max;
			this.accept = DFA7_accept;
			this.special = DFA7_special;
			this.transition = DFA7_transition;
		}
		@Override
		public String getDescription() {
			return "654:1: FLOAT_NUM : ( FLOAT_NUM1 | FLOAT_NUM2 | FLOAT_NUM3 );";
		}
	}

	static final String DFA13_eotS =
		"\10\uffff\1\34\1\uffff\1\36\1\40\1\42\5\25\4\uffff\2\52\13\uffff\3\25"+
		"\1\57\3\25\1\uffff\1\52\2\25\1\65\1\uffff\1\66\2\25\1\71\1\25\2\uffff"+
		"\2\25\1\uffff\1\75\1\25\1\77\1\uffff\1\100\2\uffff";
	static final String DFA13_eofS =
		"\101\uffff";
	static final String DFA13_minS =
		"\1\11\7\uffff\1\52\1\uffff\3\75\2\154\1\146\1\162\1\150\4\uffff\2\56\13"+
		"\uffff\1\163\1\157\1\162\1\60\1\164\2\151\1\uffff\1\56\1\145\1\141\1\60"+
		"\1\uffff\1\60\1\156\1\154\1\60\1\164\2\uffff\1\164\1\145\1\uffff\1\60"+
		"\1\146\1\60\1\uffff\1\60\2\uffff";
	static final String DFA13_maxS =
		"\1\175\7\uffff\1\57\1\uffff\3\75\1\154\1\157\1\156\1\162\1\150\4\uffff"+
		"\2\71\13\uffff\1\163\1\157\1\162\1\172\1\164\2\151\1\uffff\1\71\1\145"+
		"\1\141\1\172\1\uffff\1\172\1\156\1\154\1\172\1\164\2\uffff\1\164\1\145"+
		"\1\uffff\1\172\1\146\1\172\1\uffff\1\172\2\uffff";
	static final String DFA13_acceptS =
		"\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\uffff\1\11\10\uffff\1\27\1\30\1"+
		"\33\1\34\2\uffff\1\36\1\37\1\31\1\32\1\10\1\13\1\12\1\15\1\14\1\17\1\16"+
		"\7\uffff\1\35\4\uffff\1\23\5\uffff\1\22\1\24\2\uffff\1\20\3\uffff\1\21"+
		"\1\uffff\1\26\1\25";
	static final String DFA13_specialS =
		"\101\uffff}>";
	static final String[] DFA13_transitionS = {
			"\2\31\2\uffff\1\31\22\uffff\1\31\1\1\1\24\5\uffff\1\2\1\3\1\4\1\5\1\6"+
			"\1\7\1\30\1\10\1\26\11\27\1\uffff\1\11\1\12\1\13\1\14\2\uffff\32\25\4"+
			"\uffff\1\25\1\uffff\4\25\1\15\1\16\2\25\1\17\6\25\1\20\6\25\1\21\3\25"+
			"\1\22\1\uffff\1\23",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\33\4\uffff\1\32",
			"",
			"\1\35",
			"\1\37",
			"\1\41",
			"\1\43",
			"\1\44\2\uffff\1\45",
			"\1\46\7\uffff\1\47",
			"\1\50",
			"\1\51",
			"",
			"",
			"",
			"",
			"\1\30\1\uffff\12\30",
			"\1\30\1\uffff\12\53",
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
			"\1\54",
			"\1\55",
			"\1\56",
			"\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
			"\1\60",
			"\1\61",
			"\1\62",
			"",
			"\1\30\1\uffff\12\53",
			"\1\63",
			"\1\64",
			"\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
			"",
			"\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
			"\1\67",
			"\1\70",
			"\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
			"\1\72",
			"",
			"",
			"\1\73",
			"\1\74",
			"",
			"\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
			"\1\76",
			"\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
			"",
			"\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
			"",
			""
	};

	static final short[] DFA13_eot = DFA.unpackEncodedString(DFA13_eotS);
	static final short[] DFA13_eof = DFA.unpackEncodedString(DFA13_eofS);
	static final char[] DFA13_min = DFA.unpackEncodedStringToUnsignedChars(DFA13_minS);
	static final char[] DFA13_max = DFA.unpackEncodedStringToUnsignedChars(DFA13_maxS);
	static final short[] DFA13_accept = DFA.unpackEncodedString(DFA13_acceptS);
	static final short[] DFA13_special = DFA.unpackEncodedString(DFA13_specialS);
	static final short[][] DFA13_transition;

	static {
		int numStates = DFA13_transitionS.length;
		DFA13_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA13_transition[i] = DFA.unpackEncodedString(DFA13_transitionS[i]);
		}
	}

	protected class DFA13 extends DFA {

		public DFA13(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 13;
			this.eot = DFA13_eot;
			this.eof = DFA13_eof;
			this.min = DFA13_min;
			this.max = DFA13_max;
			this.accept = DFA13_accept;
			this.special = DFA13_special;
			this.transition = DFA13_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | COMMENT1 | COMMENT2 | STRING | ID | DEC_NUM | FLOAT_NUM | WS );";
		}
	}

}
