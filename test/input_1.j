.source in.j
.class public static myResult
.super java/lang/Object
.method public static main([Ljava/lang/String;)V
.limit stack 100
.limit locals 100
ldc 0
istore 0
ldc 1.1f
fstore 1
L1:
iload 0
ldc 100
if_icmplt L2
ldc 0
RE2:
ifeq L3
getstatic java/lang/System/out Ljava/io/PrintStream;
iload 0
invokevirtual java/io/PrintStream/println(I)V
fload 1
ldc 2.0f
fadd
fstore 1
getstatic java/lang/System/out Ljava/io/PrintStream;
fload 1
invokevirtual java/io/PrintStream/println(F)V
iload 0
ldc 1
iadd
istore 0
goto L1
L3:
goto END
L2:
ldc 1
goto RE2
END:
return
.end method
