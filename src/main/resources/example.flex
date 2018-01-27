package jflexcup.generated;

import java_cup.runtime.Symbol;
import jflexcup.ExampleSymbols;

%%

// The class name of the lexer.
%class ExampleLexer
%eofval{
    return newToken(ExampleSymbols.EOF, null);
%eofval}
// The current line number can be accessed with the variable yyline
// and the current column number with the variable yycolumn.
%line
%column

// CUP compatibility.
%cup


// Code between %{ and %}, both of which must be at the beginning of a
// line, will be copied letter to letter into the lexer class source.
// Here you declare member variables and functions that are used inside
// scanner actions.
%{
    private Symbol symbol(int type) {
        return new Symbol(type, yyline, yycolumn);
    }

    private Symbol symbol(int type, Object value) {
        return new Symbol(type, yyline, yycolumn, value);
    }

    private Symbol newToken(int id, Object value) {
        return new Symbol(id, yyline + 1, yycolumn + 1, value);
    }
%}

//  Macro Declarations
//
//  These declarations are regular expressions that will be used latter
//  in the Lexical Rules Section.

LineTerminator = \r|\n|\r\n
WhiteSpace = {LineTerminator} | [ \t\f]
IntegerLiteral = [:digit:][:digit:]*
IdentifierOrKeyword = [:digit:]*[:jletter:][:jletterdigit:]*

%%

// YYINITIAL is the state at which the lexer begins scanning.  So
// these regular expressions will only be matched if the scanner is in
// the start state YYINITIAL.
<YYINITIAL> {
    {IntegerLiteral} {
        System.out.print(yytext());
        return symbol(ExampleSymbols.INTEGER_LITERAL, new Integer(yytext()));
    }

    {IdentifierOrKeyword} {
        System.out.print(yytext());
        return symbol(ExampleSymbols.IDENT, yytext());
    }

    {WhiteSpace} { /* Ignore */ }
}


// No token was found for the input so through an error.  Print out an
//   Illegal character message with the illegal character that was found. */
[^] {
    throw new Error("Illegal character <"+yytext()+">");
}