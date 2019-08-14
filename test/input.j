.source in.j
.class public static myResult
.super java/lang/Object
.method public static main([Ljava/lang/String;)V
.limit stack 100
.limit locals 100
ldc 0
istore 0
ldc 3
istore 1
ldc 0
istore 2
ldc 0
istore 3
ldc 0
istore 3
L1:
iload 3
ldc 5
if_icmplt L2
ldc 0
RE2:
ifeq L3
goto L4
null:
iload 3
ldc 1
iadd
istore 3
goto L1
L4:
getstatic java/lang/System/out Ljava/io/PrintStream;
iload 3
invokevirtual java/io/PrintStream/println(I)V
iload 0
ldc 2
iadd
istore 0
iload 2
ldc 1
iadd
istore 2
goto null
L3:
getstatic java/lang/System/out Ljava/io/PrintStream;
iload 0
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc "s"
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc "s"
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc "s"
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc "s"
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc "s"
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc "s"
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc "s"
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc "s"
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc "s"
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V
invokevirtual java/io/PrintStream/println(I)V
goto END
L2:
ldc 1
goto RE2
END:
return
.end method
