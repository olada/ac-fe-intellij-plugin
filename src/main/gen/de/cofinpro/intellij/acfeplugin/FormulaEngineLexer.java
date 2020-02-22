/* The following code was generated by JFlex 1.7.0 tweaked for IntelliJ platform */

package de.cofinpro.intellij.acfeplugin;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import com.intellij.psi.TokenType;
import de.cofinpro.intellij.acfeplugin.psi.FormulaEngineElementType;
import de.cofinpro.intellij.acfeplugin.psi.FormulaEngineElementTypes;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.7.0
 * from the specification file <tt>FormulaEngine.flex</tt>
 */
public class FormulaEngineLexer implements FlexLexer {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;
  public static final int WAITING_VALUE = 2;

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
   * Chosen bits are [8, 6, 7]
   * Total runtime size is 1040 bytes
   */
  public static int ZZ_CMAP(int ch) {
    return ZZ_CMAP_A[ZZ_CMAP_Y[ZZ_CMAP_Z[ch>>13]|((ch>>7)&0x3f)]|(ch&0x7f)];
  }

  /* The ZZ_CMAP_Z table has 136 entries */
  static final char ZZ_CMAP_Z[] = zzUnpackCMap(
    "\1\0\207\100");

  /* The ZZ_CMAP_Y table has 128 entries */
  static final char ZZ_CMAP_Y[] = zzUnpackCMap(
    "\1\0\177\200");

  /* The ZZ_CMAP_A table has 256 entries */
  static final char ZZ_CMAP_A[] = zzUnpackCMap(
    "\11\0\1\2\1\1\1\0\1\2\1\1\22\0\1\2\1\0\1\7\1\0\1\42\3\0\1\11\1\12\1\10\4\0"+
    "\1\3\12\6\3\0\1\17\3\0\1\44\14\5\1\43\14\5\1\15\1\4\1\16\1\0\1\47\1\0\1\32"+
    "\1\34\1\23\1\36\1\30\1\20\1\33\1\41\1\25\1\5\1\50\1\31\1\45\1\22\1\26\1\46"+
    "\1\5\1\27\1\35\1\24\1\21\1\51\1\40\1\5\1\37\1\5\1\13\1\0\1\14\202\0");

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\2\0\1\1\1\2\1\1\1\3\1\4\1\5\1\6"+
    "\1\7\1\10\1\11\1\12\1\13\1\14\12\3\1\1"+
    "\1\3\1\15\1\0\2\5\3\3\1\16\16\3\1\0"+
    "\1\3\1\0\1\3\1\17\13\3\1\20\10\3\1\21"+
    "\1\3\1\22\7\3\1\23\1\24\1\25\2\3\1\26"+
    "\2\3\1\27\2\3\1\30\6\3\1\31\5\3\1\32"+
    "\1\33\4\3\1\34\3\3\1\35\2\3\1\36\1\3"+
    "\1\37\1\3\1\40\2\3\1\41\1\42\6\3\1\43"+
    "\1\3\1\44\1\3\1\45\3\3\1\46\1\47\1\50"+
    "\1\51\2\3\1\52\1\53\1\3\1\54\1\55";

  private static int [] zzUnpackAction() {
    int [] result = new int[155];
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
    "\0\0\0\52\0\124\0\124\0\176\0\250\0\322\0\374"+
    "\0\124\0\124\0\124\0\124\0\124\0\124\0\124\0\u0126"+
    "\0\u0150\0\u017a\0\u01a4\0\u01ce\0\u01f8\0\u0222\0\u024c\0\u0276"+
    "\0\u02a0\0\u02ca\0\u02f4\0\u031e\0\u0348\0\u0372\0\124\0\u039c"+
    "\0\u03c6\0\u03f0\0\250\0\u041a\0\u0444\0\u046e\0\u0498\0\u04c2"+
    "\0\u04ec\0\u0516\0\u0540\0\u056a\0\u0594\0\u05be\0\u05e8\0\u0612"+
    "\0\u063c\0\u0666\0\u0690\0\u06ba\0\u06e4\0\250\0\u070e\0\u0738"+
    "\0\u0762\0\u078c\0\u07b6\0\u07e0\0\u080a\0\u0834\0\u085e\0\u0888"+
    "\0\u08b2\0\250\0\u08dc\0\u0906\0\u0930\0\u095a\0\u0984\0\u09ae"+
    "\0\u09d8\0\u0a02\0\124\0\u0a2c\0\124\0\u0a56\0\u0a80\0\u0aaa"+
    "\0\u0ad4\0\u0afe\0\u0b28\0\u0b52\0\124\0\250\0\250\0\u0b7c"+
    "\0\u0ba6\0\124\0\u0bd0\0\u0bfa\0\124\0\u0c24\0\u0c4e\0\250"+
    "\0\u0c78\0\u0ca2\0\u0ccc\0\u0cf6\0\u0d20\0\u0d4a\0\u0d74\0\u0d9e"+
    "\0\u0dc8\0\u0df2\0\u0e1c\0\u0e46\0\250\0\124\0\u0e70\0\u0e9a"+
    "\0\u0ec4\0\u0eee\0\124\0\u0f18\0\u0f42\0\u0f6c\0\250\0\u0f96"+
    "\0\u0fc0\0\124\0\u0fea\0\124\0\u1014\0\250\0\u103e\0\u1068"+
    "\0\250\0\250\0\u1092\0\u10bc\0\u10e6\0\u1110\0\u113a\0\u1164"+
    "\0\u118e\0\u11b8\0\124\0\u11e2\0\124\0\u120c\0\u1236\0\u1260"+
    "\0\124\0\250\0\124\0\124\0\u128a\0\u12b4\0\124\0\124"+
    "\0\u12de\0\124\0\124";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[155];
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
    "\1\3\2\4\1\5\1\3\1\6\1\7\1\10\1\3"+
    "\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20"+
    "\4\6\1\21\1\6\1\22\1\23\1\24\1\25\1\26"+
    "\1\6\1\27\1\30\1\6\1\31\1\6\1\32\5\6"+
    "\1\33\1\6\52\3\55\0\1\34\4\0\1\35\46\0"+
    "\2\6\11\0\22\6\1\0\7\6\6\0\1\7\43\0"+
    "\1\10\1\0\2\10\1\36\2\10\1\37\42\10\5\0"+
    "\2\6\11\0\1\6\1\40\4\6\1\41\2\6\1\42"+
    "\10\6\1\0\7\6\5\0\2\6\11\0\1\43\1\6"+
    "\1\44\12\6\1\45\4\6\1\0\7\6\5\0\2\6"+
    "\11\0\10\6\1\46\11\6\1\0\7\6\5\0\2\6"+
    "\11\0\11\6\1\47\10\6\1\0\7\6\5\0\2\6"+
    "\11\0\5\6\1\50\1\51\1\6\1\52\11\6\1\0"+
    "\7\6\5\0\2\6\11\0\2\6\1\53\1\6\1\54"+
    "\15\6\1\0\7\6\5\0\2\6\11\0\11\6\1\55"+
    "\10\6\1\0\7\6\5\0\2\6\11\0\4\6\1\56"+
    "\15\6\1\0\7\6\5\0\2\6\11\0\5\6\1\57"+
    "\4\6\1\60\7\6\1\0\7\6\5\0\2\6\11\0"+
    "\21\6\1\61\1\0\7\6\43\0\1\62\13\0\2\6"+
    "\11\0\10\6\1\63\11\6\1\0\7\6\1\34\1\0"+
    "\50\34\10\35\1\64\41\35\52\10\5\0\2\6\11\0"+
    "\2\6\1\65\17\6\1\0\7\6\5\0\2\6\11\0"+
    "\7\6\1\66\12\6\1\0\7\6\5\0\2\6\11\0"+
    "\6\6\1\67\13\6\1\0\7\6\5\0\2\6\11\0"+
    "\4\6\1\70\15\6\1\0\7\6\5\0\2\6\11\0"+
    "\22\6\1\0\4\6\1\71\2\6\5\0\2\6\11\0"+
    "\4\6\1\72\15\6\1\0\2\6\1\73\4\6\5\0"+
    "\2\6\11\0\4\6\1\74\10\6\1\75\4\6\1\0"+
    "\7\6\5\0\2\6\11\0\15\6\1\76\4\6\1\0"+
    "\7\6\5\0\2\6\11\0\3\6\1\77\6\6\1\100"+
    "\7\6\1\0\7\6\5\0\2\6\11\0\2\6\1\101"+
    "\17\6\1\0\7\6\5\0\2\6\11\0\17\6\1\102"+
    "\2\6\1\0\7\6\5\0\2\6\11\0\4\6\1\103"+
    "\15\6\1\0\7\6\5\0\2\6\11\0\6\6\1\104"+
    "\13\6\1\0\7\6\5\0\2\6\11\0\7\6\1\105"+
    "\2\6\1\106\7\6\1\0\7\6\5\0\2\6\11\0"+
    "\3\6\1\107\16\6\1\0\7\6\5\0\2\6\11\0"+
    "\4\6\1\110\12\6\1\111\2\6\1\0\7\6\5\0"+
    "\2\6\11\0\5\6\1\112\14\6\1\0\7\6\44\0"+
    "\1\113\12\0\2\6\11\0\7\6\1\114\12\6\1\0"+
    "\7\6\3\35\1\115\4\35\1\64\41\35\5\0\2\6"+
    "\11\0\3\6\1\116\16\6\1\0\7\6\5\0\2\6"+
    "\11\0\12\6\1\117\7\6\1\0\7\6\5\0\2\6"+
    "\11\0\10\6\1\120\11\6\1\0\7\6\5\0\2\6"+
    "\11\0\2\6\1\121\6\6\1\122\10\6\1\0\7\6"+
    "\5\0\2\6\11\0\1\6\1\123\20\6\1\0\7\6"+
    "\5\0\2\6\11\0\6\6\1\124\13\6\1\0\7\6"+
    "\5\0\2\6\2\0\1\125\6\0\22\6\1\0\7\6"+
    "\5\0\2\6\11\0\10\6\1\126\11\6\1\0\7\6"+
    "\5\0\2\6\11\0\4\6\1\127\15\6\1\0\7\6"+
    "\5\0\2\6\11\0\12\6\1\130\7\6\1\0\7\6"+
    "\5\0\2\6\11\0\16\6\1\131\3\6\1\0\7\6"+
    "\5\0\2\6\2\0\1\132\6\0\22\6\1\0\7\6"+
    "\5\0\2\6\11\0\7\6\1\133\12\6\1\0\7\6"+
    "\5\0\2\6\11\0\14\6\1\134\5\6\1\0\7\6"+
    "\5\0\2\6\2\0\1\135\6\0\5\6\1\136\14\6"+
    "\1\0\7\6\5\0\2\6\11\0\4\6\1\137\15\6"+
    "\1\0\7\6\5\0\2\6\11\0\4\6\1\140\15\6"+
    "\1\0\7\6\5\0\2\6\11\0\10\6\1\141\11\6"+
    "\1\0\7\6\5\0\2\6\11\0\16\6\1\142\3\6"+
    "\1\0\3\6\1\143\3\6\5\0\2\6\11\0\11\6"+
    "\1\144\10\6\1\0\7\6\5\0\2\6\11\0\2\6"+
    "\1\145\17\6\1\0\7\6\5\0\2\6\11\0\4\6"+
    "\1\146\15\6\1\0\7\6\5\0\2\6\11\0\4\6"+
    "\1\147\15\6\1\0\7\6\5\0\2\6\11\0\13\6"+
    "\1\150\6\6\1\0\7\6\5\0\2\6\11\0\12\6"+
    "\1\151\7\6\1\0\7\6\5\0\2\6\11\0\5\6"+
    "\1\152\14\6\1\0\7\6\5\0\2\6\11\0\7\6"+
    "\1\153\12\6\1\0\7\6\5\0\2\6\11\0\22\6"+
    "\1\0\6\6\1\154\5\0\2\6\11\0\11\6\1\155"+
    "\10\6\1\0\7\6\5\0\2\6\2\0\1\156\6\0"+
    "\22\6\1\0\7\6\5\0\2\6\11\0\5\6\1\157"+
    "\14\6\1\0\7\6\5\0\2\6\11\0\12\6\1\160"+
    "\7\6\1\0\7\6\5\0\2\6\11\0\2\6\1\161"+
    "\17\6\1\0\7\6\5\0\2\6\11\0\1\6\1\162"+
    "\20\6\1\0\7\6\5\0\2\6\2\0\1\163\6\0"+
    "\4\6\1\164\15\6\1\0\7\6\5\0\2\6\11\0"+
    "\5\6\1\165\14\6\1\0\7\6\5\0\2\6\11\0"+
    "\11\6\1\166\10\6\1\0\7\6\5\0\2\6\11\0"+
    "\10\6\1\167\11\6\1\0\7\6\5\0\2\6\11\0"+
    "\10\6\1\170\11\6\1\0\7\6\5\0\2\6\11\0"+
    "\5\6\1\171\14\6\1\0\7\6\5\0\2\6\2\0"+
    "\1\172\6\0\22\6\1\0\7\6\5\0\2\6\11\0"+
    "\10\6\1\173\11\6\1\0\7\6\5\0\2\6\2\0"+
    "\1\174\6\0\22\6\1\0\7\6\5\0\2\6\11\0"+
    "\15\6\1\175\4\6\1\0\7\6\5\0\2\6\11\0"+
    "\2\6\1\176\17\6\1\0\7\6\5\0\2\6\11\0"+
    "\10\6\1\177\11\6\1\0\7\6\5\0\2\6\11\0"+
    "\14\6\1\200\5\6\1\0\7\6\5\0\2\6\11\0"+
    "\11\6\1\201\10\6\1\0\7\6\5\0\2\6\11\0"+
    "\13\6\1\202\6\6\1\0\7\6\5\0\2\6\11\0"+
    "\15\6\1\203\4\6\1\0\7\6\5\0\2\6\11\0"+
    "\5\6\1\204\14\6\1\0\7\6\5\0\2\6\11\0"+
    "\1\205\21\6\1\0\7\6\5\0\2\6\11\0\1\6"+
    "\1\206\20\6\1\0\7\6\5\0\2\6\11\0\11\6"+
    "\1\207\10\6\1\0\7\6\5\0\2\6\11\0\6\6"+
    "\1\210\13\6\1\0\7\6\5\0\2\6\11\0\7\6"+
    "\1\211\12\6\1\0\7\6\5\0\2\6\11\0\4\6"+
    "\1\212\15\6\1\0\7\6\5\0\2\6\2\0\1\213"+
    "\6\0\22\6\1\0\7\6\5\0\2\6\11\0\1\6"+
    "\1\214\20\6\1\0\7\6\5\0\2\6\2\0\1\215"+
    "\6\0\22\6\1\0\7\6\5\0\2\6\11\0\22\6"+
    "\1\0\2\6\1\216\4\6\5\0\2\6\11\0\1\217"+
    "\21\6\1\0\7\6\5\0\2\6\11\0\15\6\1\220"+
    "\4\6\1\0\7\6\5\0\2\6\2\0\1\221\6\0"+
    "\22\6\1\0\7\6\5\0\2\6\11\0\2\6\1\222"+
    "\17\6\1\0\7\6\5\0\2\6\2\0\1\223\6\0"+
    "\22\6\1\0\7\6\5\0\2\6\2\0\1\224\6\0"+
    "\22\6\1\0\7\6\5\0\2\6\11\0\4\6\1\225"+
    "\15\6\1\0\7\6\5\0\2\6\11\0\10\6\1\226"+
    "\11\6\1\0\7\6\5\0\2\6\2\0\1\227\6\0"+
    "\22\6\1\0\7\6\5\0\2\6\2\0\1\230\6\0"+
    "\22\6\1\0\7\6\5\0\2\6\11\0\10\6\1\231"+
    "\11\6\1\0\7\6\5\0\2\6\2\0\1\232\6\0"+
    "\22\6\1\0\7\6\5\0\2\6\2\0\1\233\6\0"+
    "\22\6\1\0\7\6";

  private static int [] zzUnpackTrans() {
    int [] result = new int[4872];
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
  private static final String[] ZZ_ERROR_MSG = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\2\0\2\11\4\1\7\11\15\1\1\0\1\1\1\11"+
    "\22\1\1\0\1\1\1\0\26\1\1\11\1\1\1\11"+
    "\7\1\1\11\4\1\1\11\2\1\1\11\20\1\1\11"+
    "\4\1\1\11\6\1\1\11\1\1\1\11\16\1\1\11"+
    "\1\1\1\11\3\1\1\11\1\1\2\11\2\1\2\11"+
    "\1\1\2\11";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[155];
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
  private CharSequence zzBuffer = "";

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /**
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public FormulaEngineLexer(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    int size = 0;
    for (int i = 0, length = packed.length(); i < length; i += 2) {
      size += packed.charAt(i);
    }
    char[] map = new char[size];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < packed.length()) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }

  public final int getTokenStart() {
    return zzStartRead;
  }

  public final int getTokenEnd() {
    return getTokenStart() + yylength();
  }

  public void reset(CharSequence buffer, int start, int end, int initialState) {
    zzBuffer = buffer;
    zzCurrentPos = zzMarkedPos = zzStartRead = start;
    zzAtEOF  = false;
    zzAtBOL = true;
    zzEndRead = end;
    yybegin(initialState);
  }

  /**
   * Refills the input buffer.
   *
   * @return      {@code false}, iff there was new input.
   *
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {
    return true;
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
  public final CharSequence yytext() {
    return zzBuffer.subSequence(zzStartRead, zzMarkedPos);
  }


  /**
   * Returns the character at position {@code pos} from the
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
    return zzBuffer.charAt(zzStartRead+pos);
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occurred while scanning.
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
  private void zzDoEOF() {
    if (!zzEOFDone) {
      zzEOFDone = true;
    
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public IElementType advance() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    CharSequence zzBufferL = zzBuffer;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

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
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL/*, zzEndReadL*/);
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
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL/*, zzEndReadL*/);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + ZZ_CMAP(zzInput) ];
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
        return null;
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { return TokenType.BAD_CHARACTER;
            } 
            // fall through
          case 46: break;
          case 2: 
            { return TokenType.WHITE_SPACE;
            } 
            // fall through
          case 47: break;
          case 3: 
            { return FormulaEngineElementTypes.IDENTIFIER;
            } 
            // fall through
          case 48: break;
          case 4: 
            { return FormulaEngineElementTypes.NUMBER_INTEGER;
            } 
            // fall through
          case 49: break;
          case 5: 
            { return FormulaEngineElementTypes.DOUBLE_QUOTED_STRING_LITERAL;
            } 
            // fall through
          case 50: break;
          case 6: 
            { return FormulaEngineElementTypes.LEFT_PARENTHESIS;
            } 
            // fall through
          case 51: break;
          case 7: 
            { return FormulaEngineElementTypes.RIGHT_PARENTHESIS;
            } 
            // fall through
          case 52: break;
          case 8: 
            { return FormulaEngineElementTypes.LEFT_CURLY_BRACE;
            } 
            // fall through
          case 53: break;
          case 9: 
            { return FormulaEngineElementTypes.RIGHT_CURLY_BRACE;
            } 
            // fall through
          case 54: break;
          case 10: 
            { return FormulaEngineElementTypes.LEFT_BRACKET;
            } 
            // fall through
          case 55: break;
          case 11: 
            { return FormulaEngineElementTypes.RIGHT_BRACKET;
            } 
            // fall through
          case 56: break;
          case 12: 
            { return FormulaEngineElementTypes.OPERATOR_EQUALS;
            } 
            // fall through
          case 57: break;
          case 13: 
            { return FormulaEngineElementTypes.LINE_COMMENT;
            } 
            // fall through
          case 58: break;
          case 14: 
            { return FormulaEngineElementTypes.KEYWORD_IF;
            } 
            // fall through
          case 59: break;
          case 15: 
            { return FormulaEngineElementTypes.KEYWORD_FOR;
            } 
            // fall through
          case 60: break;
          case 16: 
            { return FormulaEngineElementTypes.ANY;
            } 
            // fall through
          case 61: break;
          case 17: 
            { return FormulaEngineElementTypes.BUILT_IN_VAR_NA;
            } 
            // fall through
          case 62: break;
          case 18: 
            { return FormulaEngineElementTypes.BLOCK_COMMENT;
            } 
            // fall through
          case 63: break;
          case 19: 
            { yypushback(1); return FormulaEngineElementTypes.ELT;
            } 
            // fall through
          case 64: break;
          case 20: 
            { return FormulaEngineElementTypes.KEYWORD_ELSE;
            } 
            // fall through
          case 65: break;
          case 21: 
            { return FormulaEngineElementTypes.LIST;
            } 
            // fall through
          case 66: break;
          case 22: 
            { yypushback(1); return FormulaEngineElementTypes.LEN;
            } 
            // fall through
          case 67: break;
          case 23: 
            { yypushback(1); return FormulaEngineElementTypes.STR;
            } 
            // fall through
          case 68: break;
          case 24: 
            { return FormulaEngineElementTypes.DICT;
            } 
            // fall through
          case 69: break;
          case 25: 
            { return FormulaEngineElementTypes.FLOAT;
            } 
            // fall through
          case 70: break;
          case 26: 
            { return FormulaEngineElementTypes.LOCAL;
            } 
            // fall through
          case 71: break;
          case 27: 
            { yypushback(1); return FormulaEngineElementTypes.LOAD;
            } 
            // fall through
          case 72: break;
          case 28: 
            { yypushback(1); return FormulaEngineElementTypes.DATE;
            } 
            // fall through
          case 73: break;
          case 29: 
            { return FormulaEngineElementTypes.KEYWORD_WHILE;
            } 
            // fall through
          case 74: break;
          case 30: 
            { yypushback(1); return FormulaEngineElementTypes.BUILT_IN_FUNC_FLOAT;
            } 
            // fall through
          case 75: break;
          case 31: 
            { yypushback(1); return FormulaEngineElementTypes.IS_NA;
            } 
            // fall through
          case 76: break;
          case 32: 
            { return FormulaEngineElementTypes.RETURN;
            } 
            // fall through
          case 77: break;
          case 33: 
            { return FormulaEngineElementTypes.GLOBAL;
            } 
            // fall through
          case 78: break;
          case 34: 
            { return FormulaEngineElementTypes.STRING;
            } 
            // fall through
          case 79: break;
          case 35: 
            { return FormulaEngineElementTypes.INTEGER;
            } 
            // fall through
          case 80: break;
          case 36: 
            { yypushback(1); return FormulaEngineElementTypes.REMOVE;
            } 
            // fall through
          case 81: break;
          case 37: 
            { yypushback(1); return FormulaEngineElementTypes.STATUS;
            } 
            // fall through
          case 82: break;
          case 38: 
            { yypushback(1); return FormulaEngineElementTypes.KERNEL;
            } 
            // fall through
          case 83: break;
          case 39: 
            { return FormulaEngineElementTypes.FUNCTION;
            } 
            // fall through
          case 84: break;
          case 40: 
            { yypushback(1); return FormulaEngineElementTypes.BUILT_IN_FUNC_INTEGER;
            } 
            // fall through
          case 85: break;
          case 41: 
            { yypushback(1); return FormulaEngineElementTypes.IS_LIST;
            } 
            // fall through
          case 86: break;
          case 42: 
            { yypushback(1); return FormulaEngineElementTypes.DAYDIFF;
            } 
            // fall through
          case 87: break;
          case 43: 
            { yypushback(1); return FormulaEngineElementTypes.DAYPLUS;
            } 
            // fall through
          case 88: break;
          case 44: 
            { yypushback(1); return FormulaEngineElementTypes.DATETIME;
            } 
            // fall through
          case 89: break;
          case 45: 
            { yypushback(1); return FormulaEngineElementTypes.ATTRIBUTE;
            } 
            // fall through
          case 90: break;
          default:
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
