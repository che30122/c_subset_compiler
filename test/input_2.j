.source in.j
.class public static myResult
.super java/lang/Object
.method public static main([Ljava/lang/String;)V
.limit stack 100
.limit locals 100
ldc 0
istore 0
ldc 0
istore 0
L1:
iload 0
ldc 100
if_icmplt L2
ldc 0
RE2:
ifeq L3
goto L4
null:
iload 0
ldc 1
iadd
istore 0
goto L1
L4:
iload 0
ldc 50
if_icmpgt L5
ldc 0
RE5:
ifeq L6
getstatic java/lang/System/out Ljava/io/PrintStream;
iload 0
invokevirtual java/io/PrintStream/println(I)V
goto L7
L6:
getstatic java/lang/System/out Ljava/io/PrintStream;
iload 0
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc "l"
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc "e"
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc "s"
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc "s"
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc " "
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc "f"
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc "i"
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc "f"
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc "t"
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc "y"
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V
invokevirtual java/io/PrintStream/println(I)V
L7:
goto null
L3:
goto END
L2:
ldc 1
goto RE2
L5:
ldc 1
goto RE5
END:
return
.end method
