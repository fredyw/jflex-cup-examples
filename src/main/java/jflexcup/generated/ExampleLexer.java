/* The following code was generated by JFlex 1.6.1 */

package jflexcup.generated;

import java_cup.runtime.Symbol;
import jflexcup.ExampleSymbols;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.6.1
 * from the specification file <tt>src/main/resources/example.flex</tt>
 */
class ExampleLexer implements java_cup.runtime.Scanner {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\6\1\3\1\2\1\0\1\3\1\1\16\6\4\0\1\3\3\0"+
    "\1\5\13\0\12\7\7\0\32\5\4\0\1\5\1\0\32\5\4\0"+
    "\41\6\2\0\4\5\4\0\1\5\2\0\1\6\7\0\1\5\4\0"+
    "\1\5\5\0\27\5\1\0\37\5\1\0\u01ca\5\4\0\14\5\16\0"+
    "\5\5\7\0\1\5\1\0\1\5\21\0\160\6\5\5\1\0\2\5"+
    "\2\0\4\5\10\0\1\5\1\0\3\5\1\0\1\5\1\0\24\5"+
    "\1\0\123\5\1\0\213\5\1\0\5\6\2\0\236\5\11\0\46\5"+
    "\2\0\1\5\7\0\47\5\7\0\1\5\1\0\55\6\1\0\1\6"+
    "\1\0\2\6\1\0\2\6\1\0\1\6\10\0\33\5\5\0\3\5"+
    "\15\0\5\6\6\0\1\5\4\0\13\6\5\0\53\5\25\6\12\7"+
    "\4\0\2\5\1\6\143\5\1\0\1\5\10\6\1\0\6\6\2\5"+
    "\2\6\1\0\4\6\2\5\12\7\3\5\2\0\1\5\17\0\1\6"+
    "\1\5\1\6\36\5\33\6\2\0\131\5\13\6\1\5\16\0\12\7"+
    "\41\5\11\6\2\5\4\0\1\5\5\0\26\5\4\6\1\5\11\6"+
    "\1\5\3\6\1\5\5\6\22\0\31\5\3\6\104\0\1\5\1\0"+
    "\13\5\67\0\33\6\1\0\4\6\66\5\3\6\1\5\22\6\1\5"+
    "\7\6\12\5\2\6\2\0\12\7\1\0\7\5\1\0\7\5\1\0"+
    "\3\6\1\0\10\5\2\0\2\5\2\0\26\5\1\0\7\5\1\0"+
    "\1\5\3\0\4\5\2\0\1\6\1\5\7\6\2\0\2\6\2\0"+
    "\3\6\1\5\10\0\1\6\4\0\2\5\1\0\3\5\2\6\2\0"+
    "\12\7\4\5\7\0\1\5\5\0\3\6\1\0\6\5\4\0\2\5"+
    "\2\0\26\5\1\0\7\5\1\0\2\5\1\0\2\5\1\0\2\5"+
    "\2\0\1\6\1\0\5\6\4\0\2\6\2\0\3\6\3\0\1\6"+
    "\7\0\4\5\1\0\1\5\7\0\12\7\2\6\3\5\1\6\13\0"+
    "\3\6\1\0\11\5\1\0\3\5\1\0\26\5\1\0\7\5\1\0"+
    "\2\5\1\0\5\5\2\0\1\6\1\5\10\6\1\0\3\6\1\0"+
    "\3\6\2\0\1\5\17\0\2\5\2\6\2\0\12\7\1\0\1\5"+
    "\17\0\3\6\1\0\10\5\2\0\2\5\2\0\26\5\1\0\7\5"+
    "\1\0\2\5\1\0\5\5\2\0\1\6\1\5\7\6\2\0\2\6"+
    "\2\0\3\6\10\0\2\6\4\0\2\5\1\0\3\5\2\6\2\0"+
    "\12\7\1\0\1\5\20\0\1\6\1\5\1\0\6\5\3\0\3\5"+
    "\1\0\4\5\3\0\2\5\1\0\1\5\1\0\2\5\3\0\2\5"+
    "\3\0\3\5\3\0\14\5\4\0\5\6\3\0\3\6\1\0\4\6"+
    "\2\0\1\5\6\0\1\6\16\0\12\7\11\0\1\5\7\0\3\6"+
    "\1\0\10\5\1\0\3\5\1\0\27\5\1\0\12\5\1\0\5\5"+
    "\3\0\1\5\7\6\1\0\3\6\1\0\4\6\7\0\2\6\1\0"+
    "\2\5\6\0\2\5\2\6\2\0\12\7\22\0\2\6\1\0\10\5"+
    "\1\0\3\5\1\0\27\5\1\0\12\5\1\0\5\5\2\0\1\6"+
    "\1\5\7\6\1\0\3\6\1\0\4\6\7\0\2\6\7\0\1\5"+
    "\1\0\2\5\2\6\2\0\12\7\1\0\2\5\17\0\2\6\1\0"+
    "\10\5\1\0\3\5\1\0\51\5\2\0\1\5\7\6\1\0\3\6"+
    "\1\0\4\6\1\5\10\0\1\6\10\0\2\5\2\6\2\0\12\7"+
    "\12\0\6\5\2\0\2\6\1\0\22\5\3\0\30\5\1\0\11\5"+
    "\1\0\1\5\2\0\7\5\3\0\1\6\4\0\6\6\1\0\1\6"+
    "\1\0\10\6\6\0\12\4\2\0\2\6\15\0\60\5\1\6\2\5"+
    "\7\6\4\0\10\5\10\6\1\0\12\7\47\0\2\5\1\0\1\5"+
    "\2\0\2\5\1\0\1\5\2\0\1\5\6\0\4\5\1\0\7\5"+
    "\1\0\3\5\1\0\1\5\1\0\1\5\2\0\2\5\1\0\4\5"+
    "\1\6\2\5\6\6\1\0\2\6\1\5\2\0\5\5\1\0\1\5"+
    "\1\0\6\6\2\0\12\7\2\0\4\5\40\0\1\5\27\0\2\6"+
    "\6\0\12\7\13\0\1\6\1\0\1\6\1\0\1\6\4\0\2\6"+
    "\10\5\1\0\44\5\4\0\24\6\1\0\2\6\5\5\13\6\1\0"+
    "\44\6\11\0\1\6\71\0\53\5\24\6\1\5\12\7\6\0\6\5"+
    "\4\6\4\5\3\6\1\5\3\6\2\5\7\6\3\5\4\6\15\5"+
    "\14\6\1\5\1\6\12\7\4\6\2\0\46\5\1\0\1\5\5\0"+
    "\1\5\2\0\53\5\1\0\u014d\5\1\0\4\5\2\0\7\5\1\0"+
    "\1\5\1\0\4\5\2\0\51\5\1\0\4\5\2\0\41\5\1\0"+
    "\4\5\2\0\7\5\1\0\1\5\1\0\4\5\2\0\17\5\1\0"+
    "\71\5\1\0\4\5\2\0\103\5\2\0\3\6\40\0\20\5\20\0"+
    "\125\5\14\0\u026c\5\2\0\21\5\1\0\32\5\5\0\113\5\3\0"+
    "\3\5\17\0\15\5\1\0\4\5\3\6\13\0\22\5\3\6\13\0"+
    "\22\5\2\6\14\0\15\5\1\0\3\5\1\0\2\6\14\0\64\5"+
    "\40\6\3\0\1\5\3\0\2\5\1\6\2\0\12\7\41\0\3\6"+
    "\2\0\12\7\6\0\130\5\10\0\51\5\1\6\1\5\5\0\106\5"+
    "\12\0\35\5\3\0\14\6\4\0\14\6\12\0\12\7\36\5\2\0"+
    "\5\5\13\0\54\5\4\0\21\6\7\5\2\6\6\0\12\7\46\0"+
    "\27\5\5\6\4\0\65\5\12\6\1\0\35\6\2\0\1\6\12\7"+
    "\6\0\12\7\15\0\1\5\130\0\5\6\57\5\21\6\7\5\4\0"+
    "\12\7\21\0\11\6\14\0\3\6\36\5\15\6\2\5\12\7\54\5"+
    "\16\6\14\0\44\5\24\6\10\0\12\7\3\0\3\5\12\7\44\5"+
    "\122\0\3\6\1\0\25\6\4\5\1\6\4\5\3\6\2\5\11\0"+
    "\300\5\47\6\25\0\4\6\u0116\5\2\0\6\5\2\0\46\5\2\0"+
    "\6\5\2\0\10\5\1\0\1\5\1\0\1\5\1\0\1\5\1\0"+
    "\37\5\2\0\65\5\1\0\7\5\1\0\1\5\3\0\3\5\1\0"+
    "\7\5\3\0\4\5\2\0\6\5\4\0\15\5\5\0\3\5\1\0"+
    "\7\5\16\0\5\6\32\0\5\6\20\0\2\5\23\0\1\5\13\0"+
    "\5\6\5\0\6\6\1\0\1\5\15\0\1\5\20\0\15\5\3\0"+
    "\33\5\25\0\15\6\4\0\1\6\3\0\14\6\21\0\1\5\4\0"+
    "\1\5\2\0\12\5\1\0\1\5\3\0\5\5\6\0\1\5\1\0"+
    "\1\5\1\0\1\5\1\0\4\5\1\0\13\5\2\0\4\5\5\0"+
    "\5\5\4\0\1\5\21\0\51\5\u0a77\0\57\5\1\0\57\5\1\0"+
    "\205\5\6\0\4\5\3\6\2\5\14\0\46\5\1\0\1\5\5\0"+
    "\1\5\2\0\70\5\7\0\1\5\17\0\1\6\27\5\11\0\7\5"+
    "\1\0\7\5\1\0\7\5\1\0\7\5\1\0\7\5\1\0\7\5"+
    "\1\0\7\5\1\0\7\5\1\0\40\6\57\0\1\5\u01d5\0\3\5"+
    "\31\0\11\5\6\6\1\0\5\5\2\0\5\5\4\0\126\5\2\0"+
    "\2\6\2\0\3\5\1\0\132\5\1\0\4\5\5\0\51\5\3\0"+
    "\136\5\21\0\33\5\65\0\20\5\u0200\0\u19b6\5\112\0\u51cd\5\63\0"+
    "\u048d\5\103\0\56\5\2\0\u010d\5\3\0\20\5\12\7\2\5\24\0"+
    "\57\5\1\6\4\0\12\6\1\0\31\5\7\0\1\6\120\5\2\6"+
    "\45\0\11\5\2\0\147\5\2\0\4\5\1\0\4\5\14\0\13\5"+
    "\115\0\12\5\1\6\3\5\1\6\4\5\1\6\27\5\5\6\20\0"+
    "\1\5\7\0\64\5\14\0\2\6\62\5\21\6\13\0\12\7\6\0"+
    "\22\6\6\5\3\0\1\5\4\0\12\7\34\5\10\6\2\0\27\5"+
    "\15\6\14\0\35\5\3\0\4\6\57\5\16\6\16\0\1\5\12\7"+
    "\26\0\12\4\6\0\51\5\16\6\11\0\3\5\1\6\10\5\2\6"+
    "\2\0\12\7\6\0\27\5\3\0\1\5\1\6\4\0\60\5\1\6"+
    "\1\5\3\6\2\5\2\6\5\5\2\6\1\5\1\6\1\5\30\0"+
    "\3\5\2\0\13\5\5\6\2\0\3\5\2\6\12\0\6\5\2\0"+
    "\6\5\2\0\6\5\11\0\7\5\1\0\7\5\221\0\43\5\10\6"+
    "\1\0\2\6\2\0\12\7\6\0\u2ba4\5\14\0\27\5\4\0\61\5"+
    "\u2104\0\u016e\5\2\0\152\5\46\0\7\5\14\0\5\5\5\0\1\5"+
    "\1\6\12\5\1\0\15\5\1\0\5\5\1\0\1\5\1\0\2\5"+
    "\1\0\2\5\1\0\154\5\41\0\u016b\5\22\0\100\5\2\0\66\5"+
    "\50\0\15\5\3\0\20\6\20\0\7\6\14\0\2\5\30\0\3\5"+
    "\31\0\1\5\6\0\5\5\1\0\207\5\2\0\1\6\4\0\1\5"+
    "\13\0\12\7\7\0\32\5\4\0\1\5\1\0\32\5\13\0\131\5"+
    "\3\0\6\5\2\0\6\5\2\0\6\5\2\0\3\5\3\0\2\5"+
    "\3\0\2\5\22\0\3\6\4\0\14\5\1\0\32\5\1\0\23\5"+
    "\1\0\2\5\1\0\17\5\2\0\16\5\42\0\173\5\105\0\65\5"+
    "\210\0\1\6\202\0\35\5\3\0\61\5\57\0\37\5\21\0\33\5"+
    "\65\0\36\5\2\0\44\5\4\0\10\5\1\0\5\5\52\0\236\5"+
    "\2\0\12\7\u0356\0\6\5\2\0\1\5\1\0\54\5\1\0\2\5"+
    "\3\0\1\5\2\0\27\5\252\0\26\5\12\0\32\5\106\0\70\5"+
    "\6\0\2\5\100\0\1\5\3\6\1\0\2\6\5\0\4\6\4\5"+
    "\1\0\3\5\1\0\33\5\4\0\3\6\4\0\1\6\40\0\35\5"+
    "\203\0\66\5\12\0\26\5\12\0\23\5\215\0\111\5\u03b7\0\3\6"+
    "\65\5\17\6\37\0\12\7\20\0\3\6\55\5\13\6\2\0\1\6"+
    "\22\0\31\5\7\0\12\7\6\0\3\6\44\5\16\6\1\0\12\7"+
    "\100\0\3\6\60\5\16\6\4\5\13\0\12\7\u0116\0\12\4\u01d6\0"+
    "\12\4\u0176\0\12\4\46\0\53\5\15\6\10\0\12\7\u0216\0\12\4"+
    "\u0716\0\u036f\5\221\0\143\5\u0b9d\0\u042f\5\u33d1\0\u0239\5\47\0\12\4"+
    "\346\0\12\4\u03a6\0\105\5\13\0\1\5\56\6\20\0\4\6\15\5"+
    "\u4060\0\2\5\u2163\0\5\6\3\0\26\6\2\0\7\6\36\0\4\6"+
    "\224\0\3\6\u01bb\0\125\5\1\0\107\5\1\0\2\5\2\0\1\5"+
    "\2\0\2\5\2\0\4\5\1\0\14\5\1\0\1\5\1\0\7\5"+
    "\1\0\101\5\1\0\4\5\2\0\10\5\1\0\7\5\1\0\34\5"+
    "\1\0\4\5\1\0\5\5\1\0\1\5\3\0\7\5\1\0\u0154\5"+
    "\2\0\31\5\1\0\31\5\1\0\37\5\1\0\31\5\1\0\37\5"+
    "\1\0\31\5\1\0\37\5\1\0\31\5\1\0\37\5\1\0\31\5"+
    "\1\0\10\5\2\0\62\7\u1600\0\4\5\1\0\33\5\1\0\2\5"+
    "\1\0\1\5\2\0\1\5\1\0\12\5\1\0\4\5\1\0\1\5"+
    "\1\0\1\5\6\0\1\5\4\0\1\5\1\0\1\5\1\0\1\5"+
    "\1\0\3\5\1\0\2\5\1\0\1\5\2\0\1\5\1\0\1\5"+
    "\1\0\1\5\1\0\1\5\1\0\1\5\1\0\2\5\1\0\1\5"+
    "\2\0\4\5\1\0\7\5\1\0\4\5\1\0\4\5\1\0\1\5"+
    "\1\0\12\5\1\0\21\5\5\0\3\5\1\0\5\5\1\0\21\5"+
    "\u1144\0\ua6d7\5\51\0\u1035\5\13\0\336\5\u3fe2\0\u021e\5\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\u05ee\0"+
    "\1\6\36\0\140\6\200\0\360\6\uffff\0\uffff\0\ufe12\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\2\2\1\3\1\4";

  private static int [] zzUnpackAction() {
    int [] result = new int[6];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\10\0\20\0\10\0\30\0\40";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[6];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\1\3\2\4\1\5\1\6\1\2\1\5\12\0"+
    "\1\4\11\0\1\5\1\6\1\0\1\5\5\0\3\6";

  private static int [] zzUnpackTrans() {
    int [] result = new int[40];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\1\1\1\11\2\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[6];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;
  
  /** 
   * The number of occupied positions in zzBuffer beyond zzEndRead.
   * When a lead/high surrogate has been read from the input stream
   * into the final zzBuffer position, this will have a value of 1;
   * otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /* user code: */
    private Symbol symbol(int type) {
        return new Symbol(type, yyline, yycolumn);
    }

    private Symbol symbol(int type, Object value) {
        return new Symbol(type, yyline, yycolumn, value);
    }

    private Symbol newToken(int id, Object value) {
        return new Symbol(id, yyline + 1, yycolumn + 1, value);
    }


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  ExampleLexer(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x110000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 2796) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzBuffer.length*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    /* not supposed to occur according to specification of java.io.Reader */
    if (numRead == 0) {
      throw new java.io.IOException("Reader returned 0 characters. See JFlex examples for workaround.");
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      /* If numRead == requested, we might have requested to few chars to
         encode a full Unicode character. We assume that a Reader would
         otherwise never return half characters. */
      if (numRead == requested) {
        if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    zzFinalHighSurrogate = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE)
      zzBuffer = new char[ZZ_BUFFERSIZE];
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
      yyclose();
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public java_cup.runtime.Symbol next_token() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      boolean zzR = false;
      int zzCh;
      int zzCharCount;
      for (zzCurrentPosL = zzStartRead  ;
           zzCurrentPosL < zzMarkedPosL ;
           zzCurrentPosL += zzCharCount ) {
        zzCh = Character.codePointAt(zzBufferL, zzCurrentPosL, zzMarkedPosL);
        zzCharCount = Character.charCount(zzCh);
        switch (zzCh) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn += zzCharCount;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
            zzDoEOF();
          {     return newToken(ExampleSymbols.EOF, null);
 }
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { throw new Error("Illegal character <"+yytext()+">");
            }
          case 5: break;
          case 2: 
            { /* Ignore */
            }
          case 6: break;
          case 3: 
            { System.out.print(yytext());
        return symbol(ExampleSymbols.INTEGER_LITERAL, new Integer(yytext()));
            }
          case 7: break;
          case 4: 
            { System.out.print(yytext());
        return symbol(ExampleSymbols.IDENT, yytext());
            }
          case 8: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}
