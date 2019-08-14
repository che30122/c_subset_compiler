all:myCompiler_test.java myCompilerParser.java myCompilerLexer.java myCompiler.tokens
	javac -cp antlr-3.5.2-complete.jar myCompiler_test.java myCompilerLexer.java myCompilerParser.java
myCompilerParser.java:myCompiler.g
	java -cp antlr-3.5.2-complete.jar org.antlr.Tool myCompiler.g
clean:
	rm -f *.class myInterp.tokens myInterpParser.java myInterpLexer.java
