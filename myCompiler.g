grammar myCompiler;

options{
	language = Java;
}
@header {
	import java.util.Scanner;
	import java.util.HashMap;
	import java.util.ArrayList;
}
@members {
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
}

program

: declaration+ 

;

declaration

: variable | function | functionDef

;

variable //declare
//[int flag]
: type ID '=' expr ';' 
{
	int t;
	if (symtab.containsKey($ID.text)) {
                                    // variable re-declared.
	System.out.println("Type Error: " + $ID.getLine() +": Redeclared identifier.");
                    System.exit(0);
 	}
	if($type.t==0)
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
  	symtab.put($ID.text, the_list);
}
;

type
returns [int t]
: 'int' {$t=0;}
| 'float' {$t=1;}

;

function

: type ID

'(' ( formalParameter (',' formalParameter)* )? ')'
{
	prologue();
}
block
{
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
;
functionDef

:type ID'(' ( type ID? (',' type ID?)* )? ')' ';' 

;
formalParameter

: type ID 

;

block
: '{'
variable* stat* '}' 

;

stat
: ifStat | expr ';' |whileStat | forStat
| ';' | 
functionCall ';' |assign ';'

;

ifStat
@init{
	int labelNow=0,hasElse=0;
 	String l,r,l1,r1;
	l=r=l1=r1=null;
}
: 'if' '(' expr ')'{
	l=newLabel();
	r=newReLabel();
	code.add("ifeq "+l);

} block ('else'{ 
	hasElse=1; 
	l1=newLabel();
	r1=newReLabel();
	code.add("goto "+l1);
	code.add(l+new String(":"));
} block)? { 
	if(hasElse==1)
		code.add(l1+new String(":"));
	else
		code.add(l+new String(":"));
} 

;

//while
whileStat
@init{
        int labelNow=0,hasElse=0;
        String l,r,l1,r1;
        l=r=l1=r1=null;
}
: 'while'{l=newLabel(); code.add(l+new String(":"));} '(' expr')'{l1=newLabel(); code.add("ifeq "+l1);} block
{code.add("goto "+l); code.add(l1+new String(":"));}//jump to here if not
;
forStat
@init{
        int labelNow=0,hasElse=0;
        String l,r,l1,r1,l2,r2,l3,r3;
       l3=r3=l2=r2= l=r=l1=r1=null;
}
: 'for' '(' assign ';' {l=newLabel(); code.add(l+new String(":"));}expr {l1=newLabel(); code.add("ifeq "+l1);} ';'
	{l3=newLabel(); code.add("goto "+l3); code.add(l2+new String(":"));} assign 
	{code.add("goto "+l);} ')'
{code.add(l3+new String(":"));}block {code.add("goto "+l2); code.add(l1+new String(":"));}
;

functionCall
@init{
	int i=0,count=0;
	float Fnum=0;
	String s,output;
	String []tokens;
}
: 'printf' '(' STRING ',' {code.add("getstatic java/lang/System/out Ljava/io/PrintStream;");}expr ')' {
	s=$STRING.text;
	for(int j=1;j<(s.length()-1);j++){
		if(s.charAt(j-1)=='\%'){
			if(s.charAt(j) =='d'){
				if($expr.type!=0){
					System.out.println("print type error!");
					System.exit(0);
				}
//				code.add("getstatic java/lang/System/out Ljava/io/PrintStream;");
				code.add("invokevirtual java/io/PrintStream/println(I)V");
			}
			else if(s.charAt(j) == 'f'){
			
                                if($expr.type!=1){
                                        System.out.println("print type error!");
                                        System.exit(0);
                                }
  //                              code.add("getstatic java/lang/System/out Ljava/io/PrintStream;");
                                code.add("invokevirtual java/io/PrintStream/println(F)V");
			}
			else{	
				String temp;
				code.add("getstatic java/lang/System/out Ljava/io/PrintStream;");
				temp=new String("\%");
				code.add("ldc "+new String("\"")+temp+new String("\""));
				code.add("invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V");
			}
		}
		else if(s.charAt(j-1)=='\\' && s.charAt(j)=='n'){
			code.add("getstatic java/lang/System/out Ljava/io/PrintStream;");
			code.add("ldc \"\"");
			code.add("invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V");
		}
		else if(s.charAt(j)!='\%' && s.charAt(j)!='\\'){			
			String temp=String.valueOf(s.charAt(j));
			code.add("getstatic java/lang/System/out Ljava/io/PrintStream;");
			code.add("ldc "+new String("\"")+temp+new String("\""));
			code.add("invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V");
			
		}
	}
};
/*| 'printf' '(' STRING ')'{
	if(flag>0){
                s=$STRING.text;
                for(int j=1;j<(s.length()-1);j++){
                        if(s.charAt(j-1)=='\%'){
                                if(s.charAt(j) =='d'){
                                        System.out.print("error");
                                }
                                else if(s.charAt(j) == 'f'){
                                        System.out.print("error");
                                }
                                else{
                                        System.out.print("\%");
                                }
                        }
                        else if(s.charAt(j-1)=='\\' && s.charAt(j)=='n'){
                                System.out.println("");
                        }
                        else if(s.charAt(j)!='\%' && s.charAt(j)!='\\'){
                                System.out.print(s.charAt(j));
                        }
                }
        }
} */
/*| 'scanf' '('STRING ',''&'ID ')' {
if(flag>0){
	Float ff;
	s=$STRING.text;
	if(s.charAt(2)=='d'){
	Integer v = (Integer)memory.get($ID.text);
	if ( v!=null )  {
		Scanner scanner = new Scanner(System.in);
		i=scanner.nextInt();
		memory.remove($ID.text);
		memory.put($ID.text,new Integer(i));
	}
	else
		System.err.println("undefined variable "+$ID.text);
	}
	else 
		if((ff= (Float)memoryF.get($ID.text))!=null){
		Scanner scanner = new Scanner(System.in);
		Fnum=scanner.nextFloat();
		memoryF.remove($ID.text);
		memoryF.put($ID.text,new Float(Fnum));
		}
		else
			System.err.println("undefined variable "+$ID.text);
	}

};*/

//end function call

assign 
//[int flag]

: ID '=' expr{
	//if(flag>0){
		int tp;
		int mem;
		
		//if no declare this ID error!
		if(symtab.get($ID.text) == null){
			System.out.println($ID.getLine()+"didn't declare");
			System.exit(0);
		}
		tp=(int)symtab.get($ID.text).get(0);
		mem=(int)symtab.get($ID.text).get(1);
		if(tp != $expr.type){
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
;

//condtion start
expr
/*@init{
	String l,r;
}*/
returns [int type]
@init{
        String l,r;
}

: e=condExpr  { //condExpr
	$type=$e.type;

}
( '==' a=condExpr{ //condExpr   if true set oprend stack to 1 else 0
	//error type detect
	if($e.type != $a.type){
		System.out.println(" == type error!");
		System.exit(0);
	}
	if($e.type==0){
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
} | '!=' a=condExpr {
        if($e.type != $a.type){
                System.out.println(" == type error!");
                System.exit(0);
        }
        if($e.type==0){
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
})* 

;


condExpr
/*@init{
	String l,r;
} */
//[int inType]
returns [int type]
@init{
        String l,r;
}

: e=aexpr {
	$type=$e.type;
} ('<=' a=aexpr 
{
        if($e.type != $a.type){
                System.out.println(" == type error!");
                System.exit(0);
        }
        if($e.type==0){
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

}| '>=' a=aexpr 
{
        if($e.type != $a.type){
                System.out.println(" == type error!");
                System.exit(0);
        }
        if($e.type==0){
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
}| '>' a=aexpr 
{
        if($e.type != $a.type){
                System.out.println(" == type error!");
                System.exit(0);
        }
        if($e.type==0){
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
}| '<' a=aexpr 
{
        if($e.type != $a.type){
                System.out.println(" == type error!");
                System.exit(0);
        }
        if($e.type==0){
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
)* 
;
// condition end
aexpr 
returns [int type]

: e=mexpr {
	$type=$e.type;
} 
('+' a=mexpr {
	if($e.type != $a.type){
		System.out.println(" + - type error!");
		System.exit(0);
	}
	switch($e.type){
		case 0:
			code.add("iadd");
			break;
		case 1:
			code.add("fadd");
			break;
	}
} | '-' a=mexpr {
        if($e.type != $a.type){
                System.out.println(" + - type error!");
                System.exit(0);
        }
        switch($e.type){
                case 0:
                        code.add("isub");
                        break;
                case 1:
                        code.add("fsub");
                        break;
        }

})*

;

mexpr 

returns [int type]

: e=atom  {
	$type=$e.type;
} 
('*'a=atom {
        if($e.type != $a.type){
                System.out.println(" * / type error!");
                System.exit(0);
        }
        switch($e.type){
                case 0:
                        code.add("imul");
                        break;
                case 1:
                        code.add("fmul");
                        break;
        }
}| '/' a=atom {
        if($e.type != $a.type){
                System.out.println(" * / type error!");
                System.exit(0);
        }
        switch($e.type){
                case 0:
                        code.add("idiv");
                        break;
                case 1:
                        code.add("fdiv");
                        break;
        }
})* 
;

atom returns [int type]
: ID {
	$type=(int)symtab.get($ID.text).get(0);
	switch($type){
		case 0:
			code.add("iload "+symtab.get($ID.text).get(1));
			break;
		case 1:
			code.add("fload "+symtab.get($ID.text).get(1));
			break;
	}	
}
| DEC_NUM {
	
	$type=0;
	code.add("ldc "+$DEC_NUM.text);
}
| FLOAT_NUM {
	$type=1;
	code.add("ldc "+$FLOAT_NUM.text+(new String("f")));
}
| '(' expr ')' {
	$type=$expr.type ;
} 
;

/* Comments */
COMMENT1 : '//' (.)* '\n';           
COMMENT2 : '/*' (options{greedy=false;}: .)* '*/';
STRING : '"' ('%f'|'%d'|'\\n'|ID|DEC_NUM | '\\t' | '\\r' | ' ')*  '"';

ID : (LETTER)(LETTER | DIGIT)*;

DEC_NUM : ('0' | ('1'..'9')(DIGIT)*);

FLOAT_NUM: FLOAT_NUM1 | FLOAT_NUM2 | FLOAT_NUM3;
fragment FLOAT_NUM1: (DIGIT)+'.'(DIGIT)*;
fragment FLOAT_NUM2: '.'(DIGIT)+;
fragment FLOAT_NUM3: (DIGIT)+;

fragment LETTER : 'a'..'z' | 'A'..'Z' | '_';
fragment DIGIT : '0'..'9';

WS : ( ' ' | '\t' | '\n' | '\r' )+ { skip(); } ; 
