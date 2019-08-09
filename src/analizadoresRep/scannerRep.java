/* The following code was generated by JFlex 1.4.3 on 9/08/19 04:24 PM */

//******************************************************************************
//**                       Importar paquetes                                  **
//******************************************************************************

package analizadoresRep;

//******************************************************************************
//**                       Importar librería                                  **
//******************************************************************************

import java_cup.runtime.*;
import almacenamiento.Errores;
import java.util.ArrayList;

//Scanner
//Descripción del proyecto


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 9/08/19 04:24 PM from the specification file
 * <tt>src/analizadoresRep/lexico.jflex</tt>
 */
public class scannerRep implements java_cup.runtime.Scanner {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;
  public static final int CADENA = 2;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  1, 1
  };

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = {
     0,  0,  0,  0,  0,  0,  0,  0,  0, 28, 29,  0, 28, 36,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
    28, 27, 38,  0,  0,  0,  0,  0, 22, 23, 37, 30, 20, 30, 32, 35, 
    31, 31, 31, 31, 31, 31, 31, 31, 31, 31,  0, 24, 26, 21, 25,  0, 
     0,  1, 17,  3, 16,  9, 19, 18,  4,  5, 33, 33,  8, 12, 10,  7, 
    15, 33,  2, 13, 14, 11,  6, 33, 33, 33, 33,  0,  0,  0,  0, 34, 
     0,  1, 17,  3, 16,  9, 19, 18,  4,  5, 33, 33,  8, 12, 10,  7, 
    15, 33,  2, 13, 14, 11,  6, 33, 33, 33, 33,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0, 33,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0, 33,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0
  };

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\2\0\1\1\12\2\1\3\1\4\1\5\1\6\1\7"+
    "\1\10\1\11\1\12\1\13\1\14\1\1\1\15\1\1"+
    "\1\16\1\17\1\20\1\21\12\2\3\0\12\2\1\15"+
    "\2\22\1\0\12\2\2\0\7\2\1\23\2\2\1\0"+
    "\1\22\1\2\1\24\1\25\6\2\1\26\7\2\1\27"+
    "\1\30\2\2\1\31\1\32\1\33\1\34\2\2\1\35";

  private static int [] zzUnpackAction() {
    int [] result = new int[109];
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
    "\0\0\0\47\0\116\0\165\0\234\0\303\0\352\0\u0111"+
    "\0\u0138\0\u015f\0\u0186\0\u01ad\0\u01d4\0\116\0\116\0\116"+
    "\0\116\0\116\0\116\0\116\0\116\0\116\0\116\0\u01fb"+
    "\0\u0222\0\u0249\0\116\0\116\0\116\0\116\0\u0270\0\u0297"+
    "\0\u02be\0\u02e5\0\u030c\0\u0333\0\u035a\0\u0381\0\u03a8\0\u03cf"+
    "\0\u03f6\0\u041d\0\u0444\0\u046b\0\u0492\0\u04b9\0\u04e0\0\u0507"+
    "\0\u052e\0\u0555\0\u057c\0\u05a3\0\u05ca\0\u03f6\0\116\0\u041d"+
    "\0\u05f1\0\u0618\0\u063f\0\u0666\0\u068d\0\u06b4\0\u06db\0\u0702"+
    "\0\u0729\0\u0750\0\u0777\0\u079e\0\u07c5\0\u07ec\0\u0813\0\u083a"+
    "\0\u0861\0\u0888\0\u08af\0\u08d6\0\234\0\u08fd\0\u0924\0\u094b"+
    "\0\u094b\0\u0972\0\234\0\u0999\0\u09c0\0\u09e7\0\u0a0e\0\u0a35"+
    "\0\u0a5c\0\u0a83\0\234\0\u0aaa\0\u0ad1\0\u0af8\0\u0b1f\0\u0b46"+
    "\0\u0b6d\0\u0b94\0\234\0\234\0\u0bbb\0\u0be2\0\234\0\234"+
    "\0\234\0\234\0\u0c09\0\u0c30\0\234";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[109];
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
    "\1\3\1\4\1\5\1\6\1\5\1\7\1\5\1\10"+
    "\1\11\1\5\1\12\2\5\1\13\1\5\1\14\2\5"+
    "\1\15\1\5\1\16\1\17\1\20\1\21\1\22\1\23"+
    "\1\24\1\25\1\26\1\27\1\30\1\31\1\3\1\5"+
    "\1\3\1\32\1\26\1\3\1\33\35\34\1\35\10\34"+
    "\1\36\50\0\1\5\1\37\21\5\13\0\1\5\1\0"+
    "\2\5\5\0\23\5\13\0\1\5\1\0\2\5\5\0"+
    "\1\40\5\5\1\41\14\5\13\0\1\5\1\0\2\5"+
    "\5\0\13\5\1\42\7\5\13\0\1\5\1\0\2\5"+
    "\5\0\20\5\1\43\2\5\13\0\1\5\1\0\2\5"+
    "\5\0\10\5\1\44\12\5\13\0\1\5\1\0\2\5"+
    "\5\0\12\5\1\45\10\5\13\0\1\5\1\0\2\5"+
    "\5\0\12\5\1\46\10\5\13\0\1\5\1\0\2\5"+
    "\5\0\1\5\1\47\21\5\13\0\1\5\1\0\2\5"+
    "\5\0\1\5\1\50\21\5\13\0\1\5\1\0\2\5"+
    "\43\0\1\31\46\0\1\31\1\51\51\0\1\52\1\0"+
    "\1\53\2\0\2\5\1\54\20\5\13\0\1\5\1\0"+
    "\2\5\5\0\17\5\1\55\3\5\13\0\1\5\1\0"+
    "\2\5\5\0\11\5\1\56\11\5\13\0\1\5\1\0"+
    "\2\5\5\0\16\5\1\57\4\5\13\0\1\5\1\0"+
    "\2\5\5\0\15\5\1\60\5\5\13\0\1\5\1\0"+
    "\2\5\5\0\10\5\1\61\12\5\13\0\1\5\1\0"+
    "\2\5\5\0\13\5\1\62\7\5\13\0\1\5\1\0"+
    "\2\5\5\0\13\5\1\63\7\5\13\0\1\5\1\0"+
    "\2\5\5\0\6\5\1\64\14\5\13\0\1\5\1\0"+
    "\2\5\5\0\1\65\22\5\13\0\1\5\1\0\2\5"+
    "\43\0\1\66\7\0\35\52\1\67\6\52\1\70\2\52"+
    "\45\53\1\71\1\53\1\0\3\5\1\72\17\5\13\0"+
    "\1\5\1\0\2\5\5\0\10\5\1\73\12\5\13\0"+
    "\1\5\1\0\2\5\5\0\15\5\1\74\5\5\13\0"+
    "\1\5\1\0\2\5\5\0\1\5\1\75\21\5\13\0"+
    "\1\5\1\0\2\5\5\0\10\5\1\76\12\5\13\0"+
    "\1\5\1\0\2\5\5\0\1\5\1\77\21\5\13\0"+
    "\1\5\1\0\2\5\5\0\10\5\1\100\12\5\13\0"+
    "\1\5\1\0\2\5\5\0\1\101\22\5\13\0\1\5"+
    "\1\0\2\5\5\0\13\5\1\102\7\5\13\0\1\5"+
    "\1\0\2\5\5\0\22\5\1\103\13\0\1\5\1\0"+
    "\2\5\4\0\43\104\1\67\1\104\1\105\1\104\1\0"+
    "\4\5\1\106\16\5\13\0\1\5\1\0\2\5\5\0"+
    "\11\5\1\107\11\5\13\0\1\5\1\0\2\5\5\0"+
    "\1\110\22\5\13\0\1\5\1\0\2\5\5\0\4\5"+
    "\1\111\16\5\13\0\1\5\1\0\2\5\5\0\11\5"+
    "\1\112\11\5\13\0\1\5\1\0\2\5\5\0\1\113"+
    "\22\5\13\0\1\5\1\0\2\5\5\0\1\5\1\114"+
    "\21\5\13\0\1\5\1\0\2\5\5\0\1\5\1\115"+
    "\21\5\13\0\1\5\1\0\2\5\5\0\10\5\1\116"+
    "\12\5\13\0\1\5\1\0\2\5\5\0\4\5\1\117"+
    "\16\5\13\0\1\5\1\0\2\5\4\0\43\53\1\120"+
    "\1\53\1\71\44\53\1\121\1\53\1\71\1\53\1\0"+
    "\5\5\1\122\15\5\13\0\1\5\1\0\2\5\5\0"+
    "\1\123\22\5\13\0\1\5\1\0\2\5\5\0\1\5"+
    "\1\124\21\5\13\0\1\5\1\0\2\5\5\0\13\5"+
    "\1\125\7\5\13\0\1\5\1\0\2\5\5\0\10\5"+
    "\1\126\12\5\13\0\1\5\1\0\2\5\5\0\1\5"+
    "\1\127\21\5\13\0\1\5\1\0\2\5\5\0\4\5"+
    "\1\130\16\5\13\0\1\5\1\0\2\5\5\0\17\5"+
    "\1\131\3\5\13\0\1\5\1\0\2\5\5\0\2\5"+
    "\1\132\20\5\13\0\1\5\1\0\2\5\47\0\1\104"+
    "\4\0\6\5\1\133\14\5\13\0\1\5\1\0\2\5"+
    "\5\0\14\5\1\134\6\5\13\0\1\5\1\0\2\5"+
    "\5\0\4\5\1\135\16\5\13\0\1\5\1\0\2\5"+
    "\5\0\1\5\1\136\21\5\13\0\1\5\1\0\2\5"+
    "\5\0\2\5\1\137\20\5\13\0\1\5\1\0\2\5"+
    "\5\0\2\5\1\140\20\5\13\0\1\5\1\0\2\5"+
    "\5\0\4\5\1\141\16\5\13\0\1\5\1\0\2\5"+
    "\5\0\1\142\22\5\13\0\1\5\1\0\2\5\5\0"+
    "\4\5\1\143\16\5\13\0\1\5\1\0\2\5\5\0"+
    "\1\5\1\144\21\5\13\0\1\5\1\0\2\5\5\0"+
    "\14\5\1\145\6\5\13\0\1\5\1\0\2\5\5\0"+
    "\3\5\1\146\17\5\13\0\1\5\1\0\2\5\5\0"+
    "\6\5\1\147\14\5\13\0\1\5\1\0\2\5\5\0"+
    "\6\5\1\150\14\5\13\0\1\5\1\0\2\5\5\0"+
    "\1\5\1\151\21\5\13\0\1\5\1\0\2\5\5\0"+
    "\4\5\1\152\16\5\13\0\1\5\1\0\2\5\5\0"+
    "\4\5\1\153\16\5\13\0\1\5\1\0\2\5\5\0"+
    "\5\5\1\154\15\5\13\0\1\5\1\0\2\5\5\0"+
    "\6\5\1\155\14\5\13\0\1\5\1\0\2\5\4\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[3159];
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
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\2\0\1\11\12\1\12\11\3\1\4\11\12\1\3\0"+
    "\13\1\1\11\1\1\1\0\12\1\2\0\12\1\1\0"+
    "\35\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[109];
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

  /* user code: */
//Codigo de usuario
String cadena = "";
public ArrayList<Errores> listaErrores = new ArrayList<Errores>();
public String archivoActual = "";


  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public scannerRep(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  public scannerRep(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
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
    if (zzCurrentPos >= zzBuffer.length) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzCurrentPos*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
    }

    /* finally: fill the buffer with new input */
    int numRead = zzReader.read(zzBuffer, zzEndRead,
                                            zzBuffer.length-zzEndRead);

    if (numRead > 0) {
      zzEndRead+= numRead;
      return false;
    }
    // unlikely but not impossible: read 0 characters, but not at end of stream    
    if (numRead == 0) {
      int c = zzReader.read();
      if (c == -1) {
        return true;
      } else {
        zzBuffer[zzEndRead++] = (char) c;
        return false;
      }     
    }

	// numRead < 0
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
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
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

      yychar+= zzMarkedPosL-zzStartRead;

      boolean zzR = false;
      for (zzCurrentPosL = zzStartRead; zzCurrentPosL < zzMarkedPosL;
                                                             zzCurrentPosL++) {
        switch (zzBufferL[zzCurrentPosL]) {
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
          yycolumn++;
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


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL[zzCurrentPosL++];
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
              zzInput = zzBufferL[zzCurrentPosL++];
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 26: 
          { return new Symbol(sym.R_PROMEDIO, yyline, yycolumn, yytext());
          }
        case 30: break;
        case 19: 
          { return new Symbol(sym.R_SUMAR, yyline, yycolumn, yytext());
          }
        case 31: break;
        case 6: 
          { return new Symbol(sym.PARENTESISCIERRA, yyline, yycolumn, yytext());
          }
        case 32: break;
        case 11: 
          { /*Espacios en blanco, ignorados*/
          }
        case 33: break;
        case 12: 
          { /*Saltos de linea, ignorados*/
          }
        case 34: break;
        case 23: 
          { return new Symbol(sym.R_CONTARSI, yyline, yycolumn, yytext());
          }
        case 35: break;
        case 7: 
          { return new Symbol(sym.PUNTOCOMA, yyline, yycolumn, yytext());
          }
        case 36: break;
        case 29: 
          { return new Symbol(sym.R_LEERARCHIVO, yyline, yycolumn, yytext());
          }
        case 37: break;
        case 21: 
          { return new Symbol(sym.R_CONTAR, yyline, yycolumn, yytext());
          }
        case 38: break;
        case 1: 
          { //String errLex = "Error léxico : '"+yytext()+"' en la línea: "+(yyline+1)+" y columna: "+(yycolumn+1);
        //System.out.println(errLex);
        Errores nuevoError = new Errores(yyline+1, yycolumn+1, 1, "El caracter " + yytext() + " no pertenece al lenguaje", "","", archivoActual);
        listaErrores.add(nuevoError);
          }
        case 39: break;
        case 18: 
          { /*Comentario ignorado*/
          }
        case 40: break;
        case 8: 
          { return new Symbol(sym.MAYORQUE, yyline, yycolumn, yytext());
          }
        case 41: break;
        case 2: 
          { return new Symbol(sym.ID, yyline, yycolumn, yytext());
          }
        case 42: break;
        case 9: 
          { return new Symbol(sym.MENORQUE, yyline, yycolumn, yytext());
          }
        case 43: break;
        case 28: 
          { return new Symbol(sym.R_OBTENERSI, yyline, yycolumn, yytext());
          }
        case 44: break;
        case 16: 
          { String tmp=cadena; cadena="";  
                    System.out.println("Se esperaba cierre de cadena (\")."); 
                    Errores nuevoError = new Errores(yyline+1, yycolumn+1, 1, "Se esperaba cierre de cadena [\"]", "","", archivoActual);
                    listaErrores.add(nuevoError); 
                    yybegin(YYINITIAL);
                    yybegin(YYINITIAL);
          }
        case 45: break;
        case 4: 
          { return new Symbol(sym.IGUAL, yyline, yycolumn, yytext());
          }
        case 46: break;
        case 22: 
          { return new Symbol(sym.R_ARCHIVO, yyline, yycolumn, yytext());
          }
        case 47: break;
        case 5: 
          { return new Symbol(sym.PARENTESISABRE, yyline, yycolumn, yytext());
          }
        case 48: break;
        case 20: 
          { return new Symbol(sym.R_CADENA, yyline, yycolumn, yytext());
          }
        case 49: break;
        case 14: 
          { yybegin(CADENA); cadena+="";
          }
        case 50: break;
        case 17: 
          { String tmp="\""+cadena+"\""; cadena=""; yybegin(YYINITIAL);  return new Symbol(sym.CADENA, yychar,yyline,tmp);
          }
        case 51: break;
        case 15: 
          { cadena+=yytext();
          }
        case 52: break;
        case 25: 
          { return new Symbol(sym.R_NUMERICO, yyline, yycolumn, yytext());
          }
        case 53: break;
        case 24: 
          { return new Symbol(sym.R_IMPRIMIR, yyline, yycolumn, yytext());
          }
        case 54: break;
        case 10: 
          { return new Symbol(sym.NOIGUAL, yyline, yycolumn, yytext());
          }
        case 55: break;
        case 27: 
          { return new Symbol(sym.R_GRAFICAR, yyline, yycolumn, yytext());
          }
        case 56: break;
        case 13: 
          { return new Symbol(sym.NUMERO, yyline, yycolumn, yytext());
          }
        case 57: break;
        case 3: 
          { return new Symbol(sym.COMA, yyline, yycolumn, yytext());
          }
        case 58: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            zzDoEOF();
              { return new java_cup.runtime.Symbol(sym.EOF); }
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
