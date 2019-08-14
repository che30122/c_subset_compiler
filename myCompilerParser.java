// $ANTLR 3.5.2 myCompiler.g 2019-06-21 02:48:56

	import java.util.Scanner;
	import java.util.HashMap;
	import java.util.ArrayList;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class myCompilerParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "COMMENT1", "COMMENT2", "DEC_NUM", 
		"DIGIT", "FLOAT_NUM", "FLOAT_NUM1", "FLOAT_NUM2", "FLOAT_NUM3", "ID", 
		"LETTER", "STRING", "WS", "'!='", "'('", "')'", "'*'", "'+'", "','", "'-'", 
		"'/'", "';'", "'<'", "'<='", "'='", "'=='", "'>'", "'>='", "'else'", "'float'", 
		"'for'", "'if'", "'int'", "'printf'", "'while'", "'{'", "'}'"
	};
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
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public myCompilerParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public myCompilerParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return myCompilerParser.tokenNames; }
	@Override public String getGrammarFileName() { return "myCompiler.g"; }


		HashMap memory = new HashMap();
		HashMap memoryF = new HashMap();
	/** Map variable name to Integer object holding value */
		HashMap<String,ArrayList> symtab = new HashMap<String,ArrayList>();
		int labelCount=0;
		int memIndex=0;
		
		List<String> code=new ArrayList<String>();
		List<String> label=new ArrayList<String>();	
		
		    void prologue()
	    {
	       code.add(".source in.j");
	       code.add(".class public static myResult");
	       code.add(".super java/lang/Object");
	       code.add(".method public static main([Ljava/lang/String;)V");

	       /* The size of stack and locals should be properly set. */
	       code.add(".limit stack 100");
	       code.add(".limit locals 100");
	    }
	    void epilogue()
	    {
	       /* handle epilogue */
	       code.add("return");
	       code.add(".end method");
	    }
	    String newLabel()
	    {
	       labelCount ++;
	       return (new String("L")) + Integer.toString(labelCount);
	    }
		void labelInit(){
			label.add("goto END");
		}
		String newReLabel(){
			return (new String("RE")) + Integer.toString(labelCount);
		}
	    public List<String> getTextCode()
	    {
	       return code;
	    }
	    public List<String> getTextLabel()
	    {
	       return label;
	    }



	// $ANTLR start "program"
	// myCompiler.g:60:1: program : ( declaration )+ ;
	public final void program() throws RecognitionException {
		try {
			// myCompiler.g:62:3: ( ( declaration )+ )
			// myCompiler.g:62:3: ( declaration )+
			{
			// myCompiler.g:62:3: ( declaration )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==32||LA1_0==35) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// myCompiler.g:62:3: declaration
					{
					pushFollow(FOLLOW_declaration_in_program34);
					declaration();
					state._fsp--;

					}
					break;

				default :
					if ( cnt1 >= 1 ) break loop1;
					EarlyExitException eee = new EarlyExitException(1, input);
					throw eee;
				}
				cnt1++;
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "program"



	// $ANTLR start "declaration"
	// myCompiler.g:66:1: declaration : ( variable | function | functionDef );
	public final void declaration() throws RecognitionException {
		try {
			// myCompiler.g:68:3: ( variable | function | functionDef )
			int alt2=3;
			alt2 = dfa2.predict(input);
			switch (alt2) {
				case 1 :
					// myCompiler.g:68:3: variable
					{
					pushFollow(FOLLOW_variable_in_declaration47);
					variable();
					state._fsp--;

					}
					break;
				case 2 :
					// myCompiler.g:68:14: function
					{
					pushFollow(FOLLOW_function_in_declaration51);
					function();
					state._fsp--;

					}
					break;
				case 3 :
					// myCompiler.g:68:25: functionDef
					{
					pushFollow(FOLLOW_functionDef_in_declaration55);
					functionDef();
					state._fsp--;

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "declaration"



	// $ANTLR start "variable"
	// myCompiler.g:72:1: variable : type ID '=' expr ';' ;
	public final void variable() throws RecognitionException {
		Token ID1=null;
		int type2 =0;

		try {
			// myCompiler.g:74:3: ( type ID '=' expr ';' )
			// myCompiler.g:74:3: type ID '=' expr ';'
			{
			pushFollow(FOLLOW_type_in_variable67);
			type2=type();
			state._fsp--;

			ID1=(Token)match(input,ID,FOLLOW_ID_in_variable69); 
			match(input,27,FOLLOW_27_in_variable71); 
			pushFollow(FOLLOW_expr_in_variable73);
			expr();
			state._fsp--;

			match(input,24,FOLLOW_24_in_variable75); 

				int t;
				if (symtab.containsKey((ID1!=null?ID1.getText():null))) {
			                                    // variable re-declared.
				System.out.println("Type Error: " + ID1.getLine() +": Redeclared identifier.");
			                    System.exit(0);
			 	}
				if(type2==0)
					t=0;
				else
					t=1;
			    /* Add ID and its attr_type into the symbol table. */
			    	ArrayList<Integer> the_list = new ArrayList<Integer>();
			      	the_list.add(t);
			      	the_list.add(memIndex); 
				if(t==0){
					code.add("istore "+Integer.toString(memIndex));
				}
				else{
					code.add("fstore "+Integer.toString(memIndex));
				}
			      	memIndex = memIndex + 1;
			  	symtab.put((ID1!=null?ID1.getText():null), the_list);

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "variable"



	// $ANTLR start "type"
	// myCompiler.g:101:1: type returns [int t] : ( 'int' | 'float' );
	public final int type() throws RecognitionException {
		int t = 0;


		try {
			// myCompiler.g:103:3: ( 'int' | 'float' )
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==35) ) {
				alt3=1;
			}
			else if ( (LA3_0==32) ) {
				alt3=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}

			switch (alt3) {
				case 1 :
					// myCompiler.g:103:3: 'int'
					{
					match(input,35,FOLLOW_35_in_type91); 
					t =0;
					}
					break;
				case 2 :
					// myCompiler.g:104:3: 'float'
					{
					match(input,32,FOLLOW_32_in_type97); 
					t =1;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return t;
	}
	// $ANTLR end "type"



	// $ANTLR start "function"
	// myCompiler.g:108:1: function : type ID '(' ( formalParameter ( ',' formalParameter )* )? ')' block ;
	public final void function() throws RecognitionException {
		try {
			// myCompiler.g:110:3: ( type ID '(' ( formalParameter ( ',' formalParameter )* )? ')' block )
			// myCompiler.g:110:3: type ID '(' ( formalParameter ( ',' formalParameter )* )? ')' block
			{
			pushFollow(FOLLOW_type_in_function110);
			type();
			state._fsp--;

			match(input,ID,FOLLOW_ID_in_function112); 
			match(input,17,FOLLOW_17_in_function115); 
			// myCompiler.g:112:5: ( formalParameter ( ',' formalParameter )* )?
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==32||LA5_0==35) ) {
				alt5=1;
			}
			switch (alt5) {
				case 1 :
					// myCompiler.g:112:7: formalParameter ( ',' formalParameter )*
					{
					pushFollow(FOLLOW_formalParameter_in_function119);
					formalParameter();
					state._fsp--;

					// myCompiler.g:112:23: ( ',' formalParameter )*
					loop4:
					while (true) {
						int alt4=2;
						int LA4_0 = input.LA(1);
						if ( (LA4_0==21) ) {
							alt4=1;
						}

						switch (alt4) {
						case 1 :
							// myCompiler.g:112:24: ',' formalParameter
							{
							match(input,21,FOLLOW_21_in_function122); 
							pushFollow(FOLLOW_formalParameter_in_function124);
							formalParameter();
							state._fsp--;

							}
							break;

						default :
							break loop4;
						}
					}

					}
					break;

			}

			match(input,18,FOLLOW_18_in_function131); 

				prologue();

			pushFollow(FOLLOW_block_in_function135);
			block();
			state._fsp--;


				List<String> a;
				code.add("goto END");
				//labelInit();
				a=getTextLabel();
				for(String s:a){
					code.add(s);
				}
				code.add("END:");
				epilogue();

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "function"



	// $ANTLR start "functionDef"
	// myCompiler.g:129:1: functionDef : type ID '(' ( type ( ID )? ( ',' type ( ID )? )* )? ')' ';' ;
	public final void functionDef() throws RecognitionException {
		try {
			// myCompiler.g:131:2: ( type ID '(' ( type ( ID )? ( ',' type ( ID )? )* )? ')' ';' )
			// myCompiler.g:131:2: type ID '(' ( type ( ID )? ( ',' type ( ID )? )* )? ')' ';'
			{
			pushFollow(FOLLOW_type_in_functionDef145);
			type();
			state._fsp--;

			match(input,ID,FOLLOW_ID_in_functionDef147); 
			match(input,17,FOLLOW_17_in_functionDef148); 
			// myCompiler.g:131:13: ( type ( ID )? ( ',' type ( ID )? )* )?
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0==32||LA9_0==35) ) {
				alt9=1;
			}
			switch (alt9) {
				case 1 :
					// myCompiler.g:131:15: type ( ID )? ( ',' type ( ID )? )*
					{
					pushFollow(FOLLOW_type_in_functionDef152);
					type();
					state._fsp--;

					// myCompiler.g:131:20: ( ID )?
					int alt6=2;
					int LA6_0 = input.LA(1);
					if ( (LA6_0==ID) ) {
						alt6=1;
					}
					switch (alt6) {
						case 1 :
							// myCompiler.g:131:20: ID
							{
							match(input,ID,FOLLOW_ID_in_functionDef154); 
							}
							break;

					}

					// myCompiler.g:131:24: ( ',' type ( ID )? )*
					loop8:
					while (true) {
						int alt8=2;
						int LA8_0 = input.LA(1);
						if ( (LA8_0==21) ) {
							alt8=1;
						}

						switch (alt8) {
						case 1 :
							// myCompiler.g:131:25: ',' type ( ID )?
							{
							match(input,21,FOLLOW_21_in_functionDef158); 
							pushFollow(FOLLOW_type_in_functionDef160);
							type();
							state._fsp--;

							// myCompiler.g:131:34: ( ID )?
							int alt7=2;
							int LA7_0 = input.LA(1);
							if ( (LA7_0==ID) ) {
								alt7=1;
							}
							switch (alt7) {
								case 1 :
									// myCompiler.g:131:34: ID
									{
									match(input,ID,FOLLOW_ID_in_functionDef162); 
									}
									break;

							}

							}
							break;

						default :
							break loop8;
						}
					}

					}
					break;

			}

			match(input,18,FOLLOW_18_in_functionDef170); 
			match(input,24,FOLLOW_24_in_functionDef172); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "functionDef"



	// $ANTLR start "formalParameter"
	// myCompiler.g:134:1: formalParameter : type ID ;
	public final void formalParameter() throws RecognitionException {
		try {
			// myCompiler.g:136:3: ( type ID )
			// myCompiler.g:136:3: type ID
			{
			pushFollow(FOLLOW_type_in_formalParameter183);
			type();
			state._fsp--;

			match(input,ID,FOLLOW_ID_in_formalParameter185); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "formalParameter"



	// $ANTLR start "block"
	// myCompiler.g:140:1: block : '{' ( variable )* ( stat )* '}' ;
	public final void block() throws RecognitionException {
		try {
			// myCompiler.g:141:3: ( '{' ( variable )* ( stat )* '}' )
			// myCompiler.g:141:3: '{' ( variable )* ( stat )* '}'
			{
			match(input,38,FOLLOW_38_in_block196); 
			// myCompiler.g:142:1: ( variable )*
			loop10:
			while (true) {
				int alt10=2;
				int LA10_0 = input.LA(1);
				if ( (LA10_0==32||LA10_0==35) ) {
					alt10=1;
				}

				switch (alt10) {
				case 1 :
					// myCompiler.g:142:1: variable
					{
					pushFollow(FOLLOW_variable_in_block198);
					variable();
					state._fsp--;

					}
					break;

				default :
					break loop10;
				}
			}

			// myCompiler.g:142:11: ( stat )*
			loop11:
			while (true) {
				int alt11=2;
				int LA11_0 = input.LA(1);
				if ( (LA11_0==DEC_NUM||LA11_0==FLOAT_NUM||LA11_0==ID||LA11_0==17||LA11_0==24||(LA11_0 >= 33 && LA11_0 <= 34)||(LA11_0 >= 36 && LA11_0 <= 37)) ) {
					alt11=1;
				}

				switch (alt11) {
				case 1 :
					// myCompiler.g:142:11: stat
					{
					pushFollow(FOLLOW_stat_in_block201);
					stat();
					state._fsp--;

					}
					break;

				default :
					break loop11;
				}
			}

			match(input,39,FOLLOW_39_in_block204); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "block"



	// $ANTLR start "stat"
	// myCompiler.g:146:1: stat : ( ifStat | expr ';' | whileStat | forStat | ';' | functionCall ';' | assign ';' );
	public final void stat() throws RecognitionException {
		try {
			// myCompiler.g:147:3: ( ifStat | expr ';' | whileStat | forStat | ';' | functionCall ';' | assign ';' )
			int alt12=7;
			switch ( input.LA(1) ) {
			case 34:
				{
				alt12=1;
				}
				break;
			case ID:
				{
				int LA12_2 = input.LA(2);
				if ( (LA12_2==27) ) {
					alt12=7;
				}
				else if ( (LA12_2==16||(LA12_2 >= 19 && LA12_2 <= 20)||(LA12_2 >= 22 && LA12_2 <= 26)||(LA12_2 >= 28 && LA12_2 <= 30)) ) {
					alt12=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 12, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case DEC_NUM:
			case FLOAT_NUM:
			case 17:
				{
				alt12=2;
				}
				break;
			case 37:
				{
				alt12=3;
				}
				break;
			case 33:
				{
				alt12=4;
				}
				break;
			case 24:
				{
				alt12=5;
				}
				break;
			case 36:
				{
				alt12=6;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 12, 0, input);
				throw nvae;
			}
			switch (alt12) {
				case 1 :
					// myCompiler.g:147:3: ifStat
					{
					pushFollow(FOLLOW_ifStat_in_stat215);
					ifStat();
					state._fsp--;

					}
					break;
				case 2 :
					// myCompiler.g:147:12: expr ';'
					{
					pushFollow(FOLLOW_expr_in_stat219);
					expr();
					state._fsp--;

					match(input,24,FOLLOW_24_in_stat221); 
					}
					break;
				case 3 :
					// myCompiler.g:147:22: whileStat
					{
					pushFollow(FOLLOW_whileStat_in_stat224);
					whileStat();
					state._fsp--;

					}
					break;
				case 4 :
					// myCompiler.g:147:34: forStat
					{
					pushFollow(FOLLOW_forStat_in_stat228);
					forStat();
					state._fsp--;

					}
					break;
				case 5 :
					// myCompiler.g:148:3: ';'
					{
					match(input,24,FOLLOW_24_in_stat232); 
					}
					break;
				case 6 :
					// myCompiler.g:149:1: functionCall ';'
					{
					pushFollow(FOLLOW_functionCall_in_stat237);
					functionCall();
					state._fsp--;

					match(input,24,FOLLOW_24_in_stat239); 
					}
					break;
				case 7 :
					// myCompiler.g:149:19: assign ';'
					{
					pushFollow(FOLLOW_assign_in_stat242);
					assign();
					state._fsp--;

					match(input,24,FOLLOW_24_in_stat244); 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "stat"



	// $ANTLR start "ifStat"
	// myCompiler.g:153:1: ifStat : 'if' '(' expr ')' block ( 'else' block )? ;
	public final void ifStat() throws RecognitionException {

			int labelNow=0,hasElse=0;
		 	String l,r,l1,r1;
			l=r=l1=r1=null;

		try {
			// myCompiler.g:159:3: ( 'if' '(' expr ')' block ( 'else' block )? )
			// myCompiler.g:159:3: 'if' '(' expr ')' block ( 'else' block )?
			{
			match(input,34,FOLLOW_34_in_ifStat258); 
			match(input,17,FOLLOW_17_in_ifStat260); 
			pushFollow(FOLLOW_expr_in_ifStat262);
			expr();
			state._fsp--;

			match(input,18,FOLLOW_18_in_ifStat264); 

				l=newLabel();
				r=newReLabel();
				code.add("ifeq "+l);


			pushFollow(FOLLOW_block_in_ifStat267);
			block();
			state._fsp--;

			// myCompiler.g:164:9: ( 'else' block )?
			int alt13=2;
			int LA13_0 = input.LA(1);
			if ( (LA13_0==31) ) {
				alt13=1;
			}
			switch (alt13) {
				case 1 :
					// myCompiler.g:164:10: 'else' block
					{
					match(input,31,FOLLOW_31_in_ifStat270); 
					 
						hasElse=1; 
						l1=newLabel();
						r1=newReLabel();
						code.add("goto "+l1);
						code.add(l+new String(":"));

					pushFollow(FOLLOW_block_in_ifStat273);
					block();
					state._fsp--;

					}
					break;

			}

			 
				if(hasElse==1)
					code.add(l1+new String(":"));
				else
					code.add(l+new String(":"));

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ifStat"



	// $ANTLR start "whileStat"
	// myCompiler.g:180:1: whileStat : 'while' '(' expr ')' block ;
	public final void whileStat() throws RecognitionException {

		        int labelNow=0,hasElse=0;
		        String l,r,l1,r1;
		        l=r=l1=r1=null;

		try {
			// myCompiler.g:186:3: ( 'while' '(' expr ')' block )
			// myCompiler.g:186:3: 'while' '(' expr ')' block
			{
			match(input,37,FOLLOW_37_in_whileStat293); 
			l=newLabel(); code.add(l+new String(":"));
			match(input,17,FOLLOW_17_in_whileStat296); 
			pushFollow(FOLLOW_expr_in_whileStat298);
			expr();
			state._fsp--;

			match(input,18,FOLLOW_18_in_whileStat299); 
			l1=newLabel(); code.add("ifeq "+l1);
			pushFollow(FOLLOW_block_in_whileStat302);
			block();
			state._fsp--;

			code.add("goto "+l); code.add(l1+new String(":"));
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "whileStat"



	// $ANTLR start "forStat"
	// myCompiler.g:189:1: forStat : 'for' '(' assign ';' expr ';' assign ')' block ;
	public final void forStat() throws RecognitionException {

		        int labelNow=0,hasElse=0;
		        String l,r,l1,r1,l2,r2,l3,r3;
		       l3=r3=l2=r2= l=r=l1=r1=null;

		try {
			// myCompiler.g:195:3: ( 'for' '(' assign ';' expr ';' assign ')' block )
			// myCompiler.g:195:3: 'for' '(' assign ';' expr ';' assign ')' block
			{
			match(input,33,FOLLOW_33_in_forStat316); 
			match(input,17,FOLLOW_17_in_forStat318); 
			pushFollow(FOLLOW_assign_in_forStat320);
			assign();
			state._fsp--;

			match(input,24,FOLLOW_24_in_forStat322); 
			l=newLabel(); code.add(l+new String(":"));
			pushFollow(FOLLOW_expr_in_forStat325);
			expr();
			state._fsp--;

			l1=newLabel(); code.add("ifeq "+l1);
			match(input,24,FOLLOW_24_in_forStat329); 
			l3=newLabel(); code.add("goto "+l3); code.add(l2+new String(":"));
			pushFollow(FOLLOW_assign_in_forStat334);
			assign();
			state._fsp--;

			code.add("goto "+l);
			match(input,18,FOLLOW_18_in_forStat340); 
			code.add(l3+new String(":"));
			pushFollow(FOLLOW_block_in_forStat343);
			block();
			state._fsp--;

			code.add("goto "+l2); code.add(l1+new String(":"));
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "forStat"



	// $ANTLR start "functionCall"
	// myCompiler.g:201:1: functionCall : 'printf' '(' STRING ',' expr ')' ;
	public final void functionCall() throws RecognitionException {
		Token STRING3=null;
		int expr4 =0;


			int i=0,count=0;
			float Fnum=0;
			String s,output;
			String []tokens;

		try {
			// myCompiler.g:208:3: ( 'printf' '(' STRING ',' expr ')' )
			// myCompiler.g:208:3: 'printf' '(' STRING ',' expr ')'
			{
			match(input,36,FOLLOW_36_in_functionCall358); 
			match(input,17,FOLLOW_17_in_functionCall360); 
			STRING3=(Token)match(input,STRING,FOLLOW_STRING_in_functionCall362); 
			match(input,21,FOLLOW_21_in_functionCall364); 
			code.add("getstatic java/lang/System/out Ljava/io/PrintStream;");
			pushFollow(FOLLOW_expr_in_functionCall367);
			expr4=expr();
			state._fsp--;

			match(input,18,FOLLOW_18_in_functionCall369); 

				s=(STRING3!=null?STRING3.getText():null);
				for(int j=1;j<(s.length()-1);j++){
					if(s.charAt(j-1)=='%'){
						if(s.charAt(j) =='d'){
							if(expr4!=0){
								System.out.println("print type error!");
								System.exit(0);
							}
			//				code.add("getstatic java/lang/System/out Ljava/io/PrintStream;");
							code.add("invokevirtual java/io/PrintStream/println(I)V");
						}
						else if(s.charAt(j) == 'f'){
						
			                                if(expr4!=1){
			                                        System.out.println("print type error!");
			                                        System.exit(0);
			                                }
			  //                              code.add("getstatic java/lang/System/out Ljava/io/PrintStream;");
			                                code.add("invokevirtual java/io/PrintStream/println(F)V");
						}
						else{	
							String temp;
							code.add("getstatic java/lang/System/out Ljava/io/PrintStream;");
							temp=new String("%");
							code.add("ldc "+new String("\"")+temp+new String("\""));
							code.add("invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V");
						}
					}
					else if(s.charAt(j-1)=='\\' && s.charAt(j)=='n'){
						code.add("getstatic java/lang/System/out Ljava/io/PrintStream;");
						code.add("ldc \"\"");
						code.add("invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V");
					}
					else if(s.charAt(j)!='%' && s.charAt(j)!='\\'){			
						String temp=String.valueOf(s.charAt(j));
						code.add("getstatic java/lang/System/out Ljava/io/PrintStream;");
						code.add("ldc "+new String("\"")+temp+new String("\""));
						code.add("invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V");
						
					}
				}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "functionCall"



	// $ANTLR start "assign"
	// myCompiler.g:305:1: assign : ID '=' expr ;
	public final void assign() throws RecognitionException {
		Token ID5=null;
		int expr6 =0;

		try {
			// myCompiler.g:308:3: ( ID '=' expr )
			// myCompiler.g:308:3: ID '=' expr
			{
			ID5=(Token)match(input,ID,FOLLOW_ID_in_assign388); 
			match(input,27,FOLLOW_27_in_assign390); 
			pushFollow(FOLLOW_expr_in_assign392);
			expr6=expr();
			state._fsp--;


				//if(flag>0){
					int tp;
					int mem;
					
					//if no declare this ID error!
					if(symtab.get((ID5!=null?ID5.getText():null)) == null){
						System.out.println(ID5.getLine()+"didn't declare");
						System.exit(0);
					}
					tp=(int)symtab.get((ID5!=null?ID5.getText():null)).get(0);
					mem=(int)symtab.get((ID5!=null?ID5.getText():null)).get(1);
					if(tp != expr6){
			                        System.out.println("assign type error!");
			                        System.exit(0);
					}
					//where is value ??
					switch(tp){
						case 0:
							code.add("istore "+mem);
							break;
						case 1:
							code.add("fstore "+mem);
							break;
					}
				//}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "assign"



	// $ANTLR start "expr"
	// myCompiler.g:338:1: expr returns [int type] : e= condExpr ( '==' a= condExpr | '!=' a= condExpr )* ;
	public final int expr() throws RecognitionException {
		int type = 0;


		int e =0;
		int a =0;


		        String l,r;

		try {
			// myCompiler.g:347:3: (e= condExpr ( '==' a= condExpr | '!=' a= condExpr )* )
			// myCompiler.g:347:3: e= condExpr ( '==' a= condExpr | '!=' a= condExpr )*
			{
			pushFollow(FOLLOW_condExpr_in_expr416);
			e=condExpr();
			state._fsp--;

			 //condExpr
				type =e;


			// myCompiler.g:351:3: ( '==' a= condExpr | '!=' a= condExpr )*
			loop14:
			while (true) {
				int alt14=3;
				int LA14_0 = input.LA(1);
				if ( (LA14_0==28) ) {
					alt14=1;
				}
				else if ( (LA14_0==16) ) {
					alt14=2;
				}

				switch (alt14) {
				case 1 :
					// myCompiler.g:351:3: '==' a= condExpr
					{
					match(input,28,FOLLOW_28_in_expr423); 
					pushFollow(FOLLOW_condExpr_in_expr427);
					a=condExpr();
					state._fsp--;

					 //condExpr   if true set oprend stack to 1 else 0
						//error type detect
						if(e != a){
							System.out.println(" == type error!");
							System.exit(0);
						}
						if(e==0){
							//code.add("i2f");
					        	l=newLabel();
					        	r=newReLabel();
							code.add("if_icmpeq "+l);
							label.add(l+new String(":"));
							label.add("ldc 1");
							label.add("goto "+r);
							code.add("ldc 0");
					        	code.add(r+new String(":"));
						}
						else{
							code.add("fcmpl");
							l=newLabel();
							r=newReLabel();
							code.add("ifeq "+l);//ll means if eq pop and ldc 1
							label.add(l+new String(":"));
					        //label.add("pop");
					        	label.add("ldc 1");
							label.add("goto "+r);
						//code.add("pop");
							code.add("ldc 0");
							code.add(r+new String(":"));
						}

					}
					break;
				case 2 :
					// myCompiler.g:381:5: '!=' a= condExpr
					{
					match(input,16,FOLLOW_16_in_expr432); 
					pushFollow(FOLLOW_condExpr_in_expr436);
					a=condExpr();
					state._fsp--;


					        if(e != a){
					                System.out.println(" == type error!");
					                System.exit(0);
					        }
					        if(e==0){
					                l=newLabel();
					                r=newReLabel();
					                code.add("if_icmpne "+l);
							label.add(l+new String(":"));
					                label.add("ldc 1");
					                label.add("goto "+r);
					                code.add("ldc 0");
					                code.add(r+new String(":"));
					        }
						else{
					        code.add("fcmpl");
					        l=newLabel();
					        r=newReLabel();
					        code.add("ifne "+l);//ll means if eq pop and ldc 1
					        label.add(l+new String(":"));
					        //label.add("pop");
					        label.add("ldc 1");
					        label.add("goto "+r);
					        //code.add("pop");
					        code.add("ldc 0");
					        code.add(r+new String(":"));
						}	        
					//code gen

					}
					break;

				default :
					break loop14;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return type;
	}
	// $ANTLR end "expr"



	// $ANTLR start "condExpr"
	// myCompiler.g:415:1: condExpr returns [int type] : e= aexpr ( '<=' a= aexpr | '>=' a= aexpr | '>' a= aexpr | '<' a= aexpr )* ;
	public final int condExpr() throws RecognitionException {
		int type = 0;


		int e =0;
		int a =0;


		        String l,r;

		try {
			// myCompiler.g:425:3: (e= aexpr ( '<=' a= aexpr | '>=' a= aexpr | '>' a= aexpr | '<' a= aexpr )* )
			// myCompiler.g:425:3: e= aexpr ( '<=' a= aexpr | '>=' a= aexpr | '>' a= aexpr | '<' a= aexpr )*
			{
			pushFollow(FOLLOW_aexpr_in_condExpr466);
			e=aexpr();
			state._fsp--;


				type =e;

			// myCompiler.g:427:3: ( '<=' a= aexpr | '>=' a= aexpr | '>' a= aexpr | '<' a= aexpr )*
			loop15:
			while (true) {
				int alt15=5;
				switch ( input.LA(1) ) {
				case 26:
					{
					alt15=1;
					}
					break;
				case 30:
					{
					alt15=2;
					}
					break;
				case 29:
					{
					alt15=3;
					}
					break;
				case 25:
					{
					alt15=4;
					}
					break;
				}
				switch (alt15) {
				case 1 :
					// myCompiler.g:427:4: '<=' a= aexpr
					{
					match(input,26,FOLLOW_26_in_condExpr471); 
					pushFollow(FOLLOW_aexpr_in_condExpr475);
					a=aexpr();
					state._fsp--;


					        if(e != a){
					                System.out.println(" == type error!");
					                System.exit(0);
					        }
					        if(e==0){
					                l=newLabel();
					                r=newReLabel();
					                code.add("if_icmple "+l);
							label.add(l+new String(":"));
					                label.add("ldc 1");
					                label.add("goto "+r);
					                code.add("ldc 0");
					                code.add(r+new String(":"));
					        }
						else{
					        code.add("fcmpl");
					        l=newLabel();
					        r=newReLabel();
					        code.add("ifle "+l);//ll means if eq pop and ldc 1
					        label.add(l+new String(":"));
					        //label.add("pop");
					        label.add("ldc 1");
					        label.add("goto "+r);
					        //code.add("pop");
					        code.add("ldc 0");
					        code.add(r+new String(":"));
						}


					}
					break;
				case 2 :
					// myCompiler.g:457:4: '>=' a= aexpr
					{
					match(input,30,FOLLOW_30_in_condExpr481); 
					pushFollow(FOLLOW_aexpr_in_condExpr485);
					a=aexpr();
					state._fsp--;


					        if(e != a){
					                System.out.println(" == type error!");
					                System.exit(0);
					        }
					        if(e==0){
					                l=newLabel();
					                r=newReLabel();
					                code.add("if_icmpge "+l);
							label.add(l+new String(":"));
					                label.add("ldc 1");
					                label.add("goto "+r);
					                code.add("ldc 0");
					                code.add(r+new String(":"));
					        }
						else{
					        code.add("fcmpl");
					        l=newLabel();
					        r=newReLabel();
					        code.add("ifge "+l);//ll means if eq pop and ldc 1
					        label.add(l+new String(":"));
					        //label.add("pop");
					        label.add("ldc 1");
					        label.add("goto "+r);
					        //code.add("pop");
					        code.add("ldc 0");
					        code.add(r+new String(":"));
						}

					}
					break;
				case 3 :
					// myCompiler.g:486:4: '>' a= aexpr
					{
					match(input,29,FOLLOW_29_in_condExpr491); 
					pushFollow(FOLLOW_aexpr_in_condExpr495);
					a=aexpr();
					state._fsp--;


					        if(e != a){
					                System.out.println(" == type error!");
					                System.exit(0);
					        }
					        if(e==0){
					                l=newLabel();
					                r=newReLabel();
					                code.add("if_icmpgt "+l);
							label.add(l+new String(":"));
					                label.add("ldc 1");
					                label.add("goto "+r);
					                code.add("ldc 0");
					                code.add(r+new String(":"));
					        }
						else{
					        code.add("fcmpl");
					        l=newLabel();
					        r=newReLabel();
					        code.add("ifgt "+l);//ll means if eq pop and ldc 1
					        label.add(l+new String(":"));
					        //label.add("pop");
					        label.add("ldc 1");
					        label.add("goto "+r);
					        //code.add("pop");
					        code.add("ldc 0");
					        code.add(r+new String(":"));}

					}
					break;
				case 4 :
					// myCompiler.g:514:4: '<' a= aexpr
					{
					match(input,25,FOLLOW_25_in_condExpr501); 
					pushFollow(FOLLOW_aexpr_in_condExpr505);
					a=aexpr();
					state._fsp--;


					        if(e != a){
					                System.out.println(" == type error!");
					                System.exit(0);
					        }
					        if(e==0){
					                l=newLabel();
					                r=newReLabel();
					                code.add("if_icmplt "+l);
							label.add(l+new String(":"));
					                label.add("ldc 1");
					                label.add("goto "+r);
					                code.add("ldc 0");
					                code.add(r+new String(":"));
					        }
						else{
					        code.add("fcmpl");
					        l=newLabel();
					        r=newReLabel();
					        code.add("iflt "+l);//ll means if eq pop and ldc 1
					        label.add(l+new String(":"));
					        //label.add("pop");
					        label.add("ldc 1");
					        label.add("goto "+r);
					        //code.add("pop");
					        code.add("ldc 0");
					        code.add(r+new String(":"));}

					}
					break;

				default :
					break loop15;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return type;
	}
	// $ANTLR end "condExpr"



	// $ANTLR start "aexpr"
	// myCompiler.g:546:1: aexpr returns [int type] : e= mexpr ( '+' a= mexpr | '-' a= mexpr )* ;
	public final int aexpr() throws RecognitionException {
		int type = 0;


		int e =0;
		int a =0;

		try {
			// myCompiler.g:549:3: (e= mexpr ( '+' a= mexpr | '-' a= mexpr )* )
			// myCompiler.g:549:3: e= mexpr ( '+' a= mexpr | '-' a= mexpr )*
			{
			pushFollow(FOLLOW_mexpr_in_aexpr529);
			e=mexpr();
			state._fsp--;


				type =e;

			// myCompiler.g:552:2: ( '+' a= mexpr | '-' a= mexpr )*
			loop16:
			while (true) {
				int alt16=3;
				int LA16_0 = input.LA(1);
				if ( (LA16_0==20) ) {
					alt16=1;
				}
				else if ( (LA16_0==22) ) {
					alt16=2;
				}

				switch (alt16) {
				case 1 :
					// myCompiler.g:552:2: '+' a= mexpr
					{
					match(input,20,FOLLOW_20_in_aexpr535); 
					pushFollow(FOLLOW_mexpr_in_aexpr539);
					a=mexpr();
					state._fsp--;


						if(e != a){
							System.out.println(" + - type error!");
							System.exit(0);
						}
						switch(e){
							case 0:
								code.add("iadd");
								break;
							case 1:
								code.add("fadd");
								break;
						}

					}
					break;
				case 2 :
					// myCompiler.g:565:5: '-' a= mexpr
					{
					match(input,22,FOLLOW_22_in_aexpr545); 
					pushFollow(FOLLOW_mexpr_in_aexpr549);
					a=mexpr();
					state._fsp--;


					        if(e != a){
					                System.out.println(" + - type error!");
					                System.exit(0);
					        }
					        switch(e){
					                case 0:
					                        code.add("isub");
					                        break;
					                case 1:
					                        code.add("fsub");
					                        break;
					        }


					}
					break;

				default :
					break loop16;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return type;
	}
	// $ANTLR end "aexpr"



	// $ANTLR start "mexpr"
	// myCompiler.g:583:1: mexpr returns [int type] : e= atom ( '*' a= atom | '/' a= atom )* ;
	public final int mexpr() throws RecognitionException {
		int type = 0;


		int e =0;
		int a =0;

		try {
			// myCompiler.g:587:3: (e= atom ( '*' a= atom | '/' a= atom )* )
			// myCompiler.g:587:3: e= atom ( '*' a= atom | '/' a= atom )*
			{
			pushFollow(FOLLOW_atom_in_mexpr572);
			e=atom();
			state._fsp--;


				type =e;

			// myCompiler.g:590:2: ( '*' a= atom | '/' a= atom )*
			loop17:
			while (true) {
				int alt17=3;
				int LA17_0 = input.LA(1);
				if ( (LA17_0==19) ) {
					alt17=1;
				}
				else if ( (LA17_0==23) ) {
					alt17=2;
				}

				switch (alt17) {
				case 1 :
					// myCompiler.g:590:2: '*' a= atom
					{
					match(input,19,FOLLOW_19_in_mexpr579); 
					pushFollow(FOLLOW_atom_in_mexpr582);
					a=atom();
					state._fsp--;


					        if(e != a){
					                System.out.println(" * / type error!");
					                System.exit(0);
					        }
					        switch(e){
					                case 0:
					                        code.add("imul");
					                        break;
					                case 1:
					                        code.add("fmul");
					                        break;
					        }

					}
					break;
				case 2 :
					// myCompiler.g:603:4: '/' a= atom
					{
					match(input,23,FOLLOW_23_in_mexpr587); 
					pushFollow(FOLLOW_atom_in_mexpr591);
					a=atom();
					state._fsp--;


					        if(e != a){
					                System.out.println(" * / type error!");
					                System.exit(0);
					        }
					        switch(e){
					                case 0:
					                        code.add("idiv");
					                        break;
					                case 1:
					                        code.add("fdiv");
					                        break;
					        }

					}
					break;

				default :
					break loop17;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return type;
	}
	// $ANTLR end "mexpr"



	// $ANTLR start "atom"
	// myCompiler.g:619:1: atom returns [int type] : ( ID | DEC_NUM | FLOAT_NUM | '(' expr ')' );
	public final int atom() throws RecognitionException {
		int type = 0;


		Token ID7=null;
		Token DEC_NUM8=null;
		Token FLOAT_NUM9=null;
		int expr10 =0;

		try {
			// myCompiler.g:620:3: ( ID | DEC_NUM | FLOAT_NUM | '(' expr ')' )
			int alt18=4;
			switch ( input.LA(1) ) {
			case ID:
				{
				alt18=1;
				}
				break;
			case DEC_NUM:
				{
				alt18=2;
				}
				break;
			case FLOAT_NUM:
				{
				alt18=3;
				}
				break;
			case 17:
				{
				alt18=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 18, 0, input);
				throw nvae;
			}
			switch (alt18) {
				case 1 :
					// myCompiler.g:620:3: ID
					{
					ID7=(Token)match(input,ID,FOLLOW_ID_in_atom609); 

						type =(int)symtab.get((ID7!=null?ID7.getText():null)).get(0);
						switch(type){
							case 0:
								code.add("iload "+symtab.get((ID7!=null?ID7.getText():null)).get(1));
								break;
							case 1:
								code.add("fload "+symtab.get((ID7!=null?ID7.getText():null)).get(1));
								break;
						}	

					}
					break;
				case 2 :
					// myCompiler.g:631:3: DEC_NUM
					{
					DEC_NUM8=(Token)match(input,DEC_NUM,FOLLOW_DEC_NUM_in_atom615); 

						
						type =0;
						code.add("ldc "+(DEC_NUM8!=null?DEC_NUM8.getText():null));

					}
					break;
				case 3 :
					// myCompiler.g:636:3: FLOAT_NUM
					{
					FLOAT_NUM9=(Token)match(input,FLOAT_NUM,FOLLOW_FLOAT_NUM_in_atom621); 

						type =1;
						code.add("ldc "+(FLOAT_NUM9!=null?FLOAT_NUM9.getText():null)+(new String("f")));

					}
					break;
				case 4 :
					// myCompiler.g:640:3: '(' expr ')'
					{
					match(input,17,FOLLOW_17_in_atom627); 
					pushFollow(FOLLOW_expr_in_atom629);
					expr10=expr();
					state._fsp--;

					match(input,18,FOLLOW_18_in_atom631); 

						type =expr10 ;

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return type;
	}
	// $ANTLR end "atom"

	// Delegated rules


	protected DFA2 dfa2 = new DFA2(this);
	static final String DFA2_eotS =
		"\20\uffff";
	static final String DFA2_eofS =
		"\20\uffff";
	static final String DFA2_minS =
		"\1\40\2\14\1\21\1\uffff\1\22\2\14\1\30\1\22\2\uffff\1\40\2\14\1\22";
	static final String DFA2_maxS =
		"\1\43\2\14\1\33\1\uffff\1\43\2\25\1\46\1\25\2\uffff\1\43\3\25";
	static final String DFA2_acceptS =
		"\4\uffff\1\1\5\uffff\1\3\1\2\4\uffff";
	static final String DFA2_specialS =
		"\20\uffff}>";
	static final String[] DFA2_transitionS = {
			"\1\2\2\uffff\1\1",
			"\1\3",
			"\1\3",
			"\1\5\11\uffff\1\4",
			"",
			"\1\10\15\uffff\1\7\2\uffff\1\6",
			"\1\11\5\uffff\1\12\2\uffff\1\12",
			"\1\11\5\uffff\1\12\2\uffff\1\12",
			"\1\12\15\uffff\1\13",
			"\1\10\2\uffff\1\14",
			"",
			"",
			"\1\16\2\uffff\1\15",
			"\1\17\5\uffff\1\12\2\uffff\1\12",
			"\1\17\5\uffff\1\12\2\uffff\1\12",
			"\1\10\2\uffff\1\14"
	};

	static final short[] DFA2_eot = DFA.unpackEncodedString(DFA2_eotS);
	static final short[] DFA2_eof = DFA.unpackEncodedString(DFA2_eofS);
	static final char[] DFA2_min = DFA.unpackEncodedStringToUnsignedChars(DFA2_minS);
	static final char[] DFA2_max = DFA.unpackEncodedStringToUnsignedChars(DFA2_maxS);
	static final short[] DFA2_accept = DFA.unpackEncodedString(DFA2_acceptS);
	static final short[] DFA2_special = DFA.unpackEncodedString(DFA2_specialS);
	static final short[][] DFA2_transition;

	static {
		int numStates = DFA2_transitionS.length;
		DFA2_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA2_transition[i] = DFA.unpackEncodedString(DFA2_transitionS[i]);
		}
	}

	protected class DFA2 extends DFA {

		public DFA2(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 2;
			this.eot = DFA2_eot;
			this.eof = DFA2_eof;
			this.min = DFA2_min;
			this.max = DFA2_max;
			this.accept = DFA2_accept;
			this.special = DFA2_special;
			this.transition = DFA2_transition;
		}
		@Override
		public String getDescription() {
			return "66:1: declaration : ( variable | function | functionDef );";
		}
	}

	public static final BitSet FOLLOW_declaration_in_program34 = new BitSet(new long[]{0x0000000900000002L});
	public static final BitSet FOLLOW_variable_in_declaration47 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_function_in_declaration51 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functionDef_in_declaration55 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_in_variable67 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_ID_in_variable69 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_27_in_variable71 = new BitSet(new long[]{0x0000000000021140L});
	public static final BitSet FOLLOW_expr_in_variable73 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_24_in_variable75 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_35_in_type91 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_32_in_type97 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_in_function110 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_ID_in_function112 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_17_in_function115 = new BitSet(new long[]{0x0000000900040000L});
	public static final BitSet FOLLOW_formalParameter_in_function119 = new BitSet(new long[]{0x0000000000240000L});
	public static final BitSet FOLLOW_21_in_function122 = new BitSet(new long[]{0x0000000900000000L});
	public static final BitSet FOLLOW_formalParameter_in_function124 = new BitSet(new long[]{0x0000000000240000L});
	public static final BitSet FOLLOW_18_in_function131 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_block_in_function135 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_in_functionDef145 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_ID_in_functionDef147 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_17_in_functionDef148 = new BitSet(new long[]{0x0000000900040000L});
	public static final BitSet FOLLOW_type_in_functionDef152 = new BitSet(new long[]{0x0000000000241000L});
	public static final BitSet FOLLOW_ID_in_functionDef154 = new BitSet(new long[]{0x0000000000240000L});
	public static final BitSet FOLLOW_21_in_functionDef158 = new BitSet(new long[]{0x0000000900000000L});
	public static final BitSet FOLLOW_type_in_functionDef160 = new BitSet(new long[]{0x0000000000241000L});
	public static final BitSet FOLLOW_ID_in_functionDef162 = new BitSet(new long[]{0x0000000000240000L});
	public static final BitSet FOLLOW_18_in_functionDef170 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_24_in_functionDef172 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_in_formalParameter183 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_ID_in_formalParameter185 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_38_in_block196 = new BitSet(new long[]{0x000000BF01021140L});
	public static final BitSet FOLLOW_variable_in_block198 = new BitSet(new long[]{0x000000BF01021140L});
	public static final BitSet FOLLOW_stat_in_block201 = new BitSet(new long[]{0x000000B601021140L});
	public static final BitSet FOLLOW_39_in_block204 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifStat_in_stat215 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_in_stat219 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_24_in_stat221 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_whileStat_in_stat224 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_forStat_in_stat228 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_24_in_stat232 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functionCall_in_stat237 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_24_in_stat239 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assign_in_stat242 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_24_in_stat244 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_34_in_ifStat258 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_17_in_ifStat260 = new BitSet(new long[]{0x0000000000021140L});
	public static final BitSet FOLLOW_expr_in_ifStat262 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_18_in_ifStat264 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_block_in_ifStat267 = new BitSet(new long[]{0x0000000080000002L});
	public static final BitSet FOLLOW_31_in_ifStat270 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_block_in_ifStat273 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_37_in_whileStat293 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_17_in_whileStat296 = new BitSet(new long[]{0x0000000000021140L});
	public static final BitSet FOLLOW_expr_in_whileStat298 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_18_in_whileStat299 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_block_in_whileStat302 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_33_in_forStat316 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_17_in_forStat318 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_assign_in_forStat320 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_24_in_forStat322 = new BitSet(new long[]{0x0000000000021140L});
	public static final BitSet FOLLOW_expr_in_forStat325 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_24_in_forStat329 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_assign_in_forStat334 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_18_in_forStat340 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_block_in_forStat343 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_36_in_functionCall358 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_17_in_functionCall360 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_STRING_in_functionCall362 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_21_in_functionCall364 = new BitSet(new long[]{0x0000000000021140L});
	public static final BitSet FOLLOW_expr_in_functionCall367 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_18_in_functionCall369 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_assign388 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_27_in_assign390 = new BitSet(new long[]{0x0000000000021140L});
	public static final BitSet FOLLOW_expr_in_assign392 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_condExpr_in_expr416 = new BitSet(new long[]{0x0000000010010002L});
	public static final BitSet FOLLOW_28_in_expr423 = new BitSet(new long[]{0x0000000000021140L});
	public static final BitSet FOLLOW_condExpr_in_expr427 = new BitSet(new long[]{0x0000000010010002L});
	public static final BitSet FOLLOW_16_in_expr432 = new BitSet(new long[]{0x0000000000021140L});
	public static final BitSet FOLLOW_condExpr_in_expr436 = new BitSet(new long[]{0x0000000010010002L});
	public static final BitSet FOLLOW_aexpr_in_condExpr466 = new BitSet(new long[]{0x0000000066000002L});
	public static final BitSet FOLLOW_26_in_condExpr471 = new BitSet(new long[]{0x0000000000021140L});
	public static final BitSet FOLLOW_aexpr_in_condExpr475 = new BitSet(new long[]{0x0000000066000002L});
	public static final BitSet FOLLOW_30_in_condExpr481 = new BitSet(new long[]{0x0000000000021140L});
	public static final BitSet FOLLOW_aexpr_in_condExpr485 = new BitSet(new long[]{0x0000000066000002L});
	public static final BitSet FOLLOW_29_in_condExpr491 = new BitSet(new long[]{0x0000000000021140L});
	public static final BitSet FOLLOW_aexpr_in_condExpr495 = new BitSet(new long[]{0x0000000066000002L});
	public static final BitSet FOLLOW_25_in_condExpr501 = new BitSet(new long[]{0x0000000000021140L});
	public static final BitSet FOLLOW_aexpr_in_condExpr505 = new BitSet(new long[]{0x0000000066000002L});
	public static final BitSet FOLLOW_mexpr_in_aexpr529 = new BitSet(new long[]{0x0000000000500002L});
	public static final BitSet FOLLOW_20_in_aexpr535 = new BitSet(new long[]{0x0000000000021140L});
	public static final BitSet FOLLOW_mexpr_in_aexpr539 = new BitSet(new long[]{0x0000000000500002L});
	public static final BitSet FOLLOW_22_in_aexpr545 = new BitSet(new long[]{0x0000000000021140L});
	public static final BitSet FOLLOW_mexpr_in_aexpr549 = new BitSet(new long[]{0x0000000000500002L});
	public static final BitSet FOLLOW_atom_in_mexpr572 = new BitSet(new long[]{0x0000000000880002L});
	public static final BitSet FOLLOW_19_in_mexpr579 = new BitSet(new long[]{0x0000000000021140L});
	public static final BitSet FOLLOW_atom_in_mexpr582 = new BitSet(new long[]{0x0000000000880002L});
	public static final BitSet FOLLOW_23_in_mexpr587 = new BitSet(new long[]{0x0000000000021140L});
	public static final BitSet FOLLOW_atom_in_mexpr591 = new BitSet(new long[]{0x0000000000880002L});
	public static final BitSet FOLLOW_ID_in_atom609 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DEC_NUM_in_atom615 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FLOAT_NUM_in_atom621 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_17_in_atom627 = new BitSet(new long[]{0x0000000000021140L});
	public static final BitSet FOLLOW_expr_in_atom629 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_18_in_atom631 = new BitSet(new long[]{0x0000000000000002L});
}
