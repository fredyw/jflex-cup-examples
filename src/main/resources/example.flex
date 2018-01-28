package jflexcup.generated;

import java_cup.runtime.Symbol;
import java.math.BigDecimal;
%%

// The class name of the lexer.
%class ExampleLexer
// Make this class public.
%public
%eofval{
    return symbol(ExampleSymbols.EOF);
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
%}

//  Macro Declarations
//
//  These declarations are regular expressions that will be used latter
//  in the Lexical Rules Section.

LineTerminator = \r|\n|\r\n
WhiteSpace = {LineTerminator} | [ \t\f]
IntegerLiteral = [:digit:][:digit:]*
FLit1 = [0-9]+ \. [0-9]*
FLit2 = \. [0-9]+
FLit3 = [0-9]+
Exponent = [eE] [+-]? [0-9]+
DecimalLiteral = ({FLit1}|{FLit2}|{FLit3}) {Exponent}?
IdentifierOrKeyword = [:digit:]*[:jletter:][:jletterdigit:]*
QuotedIdentifier = \`(\\.|[^\\\`])*\`

%%

// YYINITIAL is the state at which the lexer begins scanning.  So
// these regular expressions will only be matched if the scanner is in
// the start state YYINITIAL.
<YYINITIAL> {
    "." { return symbol(ExampleSymbols.DOT); }

    {IntegerLiteral} {
        return symbol(ExampleSymbols.INTEGER_LITERAL, new BigDecimal(yytext()));
    }

    {DecimalLiteral} {
        return symbol(ExampleSymbols.DECIMAL_LITERAL, new BigDecimal(yytext()));
    }

    {QuotedIdentifier} {
        // Remove the quotes and trim whitespace.
        String trimmedIdent = yytext().substring(1, yytext().length() - 1).trim();
        return symbol(ExampleSymbols.IDENT, trimmedIdent);
    }

    {IdentifierOrKeyword} {
        if (yytext().equals("NUMBER")) {
            return symbol(ExampleSymbols.KW_NUMBER, yytext());
        } else if (yytext().equals("NAME")) {
            return symbol(ExampleSymbols.KW_NAME, yytext());
        }
        return symbol(ExampleSymbols.IDENT, yytext());
    }

    {WhiteSpace} { /* Ignore */ }
}


// No token was found for the input so through an error.  Print out an
//   Illegal character message with the illegal character that was found. */
[^] {
    return symbol(ExampleSymbols.UNEXPECTED_TOKEN, yytext());
}