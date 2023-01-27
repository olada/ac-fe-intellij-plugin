package de.cofinpro.intellij.acfeplugin;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import com.intellij.psi.TokenType;
import de.cofinpro.intellij.acfeplugin.lex.FormulaEngineLexerStateTracker;
import de.cofinpro.intellij.acfeplugin.lex.IFormulaEngineLexer;
import de.cofinpro.intellij.acfeplugin.psi.FormulaEngineElementType;
import de.cofinpro.intellij.acfeplugin.psi.FormulaEngineElementTypes;

%%

%class FormulaEngineLexer
%implements IFormulaEngineLexer
%public
%unicode
%function advance
%type IElementType
%eof{  return;
%eof}

WHITE_SPACE= " " | [\ \n\t\f\r]
IDENTIFIER=[a-zA-Z_][a-zA-Z0-9_]*

// taken from Python.flex in OSS
QUOTED_LITERAL="'" ([^\\\'\r\n] | {ESCAPE_SEQUENCE} | (\\[\r\n]))* ("'"|\\)?
QUOTED_MULTILINE_LITERAL="'" ([^\\\'] | {ESCAPE_SEQUENCE} | (\\[\r\n]))* ("'"|\\)?
DOUBLE_QUOTED_LITERAL=\"([^\\\"\r\n]|{ESCAPE_SEQUENCE}|(\\[\r\n]))*?(\"|\\)?
DOUBLE_QUOTED_MULTILINE_LITERAL=\"([^\\\"]|{ESCAPE_SEQUENCE}|(\\[\r\n]))*?(\"|\\)?
ESCAPE_SEQUENCE=\\[^\r\n]

COMMENT_SINGLE_LINE = ("//")[^\r\n]*
BLOCK_COMMENT=[/][*][^*]*[*]+([^/*][^*]*[*]+)*[/]

NUMBER_SCIENTIFIC = [0-9]+\.[0-9]+(E\d+)
NUMBER_FLOAT = [0-9]+\.[0-9]*
NUMBER_INTEGER = [0-9]+
DIGIT = [0-9]

%state IN_PARENTHESIS
%state IN_FUNCTION_HEADER
%state AS_VARIABLE_NAME

%{
  private final FormulaEngineLexerStateTracker stateTracker = new FormulaEngineLexerStateTracker(this);

  @Override
  public int getInitialState() {
      return YYINITIAL;
  }
%}

%%
// Bei Funktionsargumenten ist es möglich, Methodenreferenzen anzugeben. Diese müssen also auch ohne darauffolgendes "(" erkannt werden.
// Deshalb wurde der State "IN_PARENTHESIS" eingeführt, damit das nur auf "innerhalb von '(' und ')' beschränkt werden kann.
<IN_PARENTHESIS> {
    // Built-in Functions (use parenthesis for matching but don't include the parenthesis in the token)
   "ado_browse" { return FormulaEngineElementTypes.BUILT_IN_FUNC_ADO_BROWSE; }
   "attribute" { return FormulaEngineElementTypes.BUILT_IN_FUNC_ATTRIBUTE; }
   "bsearch" { return FormulaEngineElementTypes.BUILT_IN_FUNC_BSEARCH; }
   "bool" { return FormulaEngineElementTypes.BUILT_IN_FUNC_BOOL; }
   "correct_price_field" { return FormulaEngineElementTypes.BUILT_IN_FUNC_CORRECT_PRICE_FIELD; }
   "date" { return FormulaEngineElementTypes.BUILT_IN_FUNC_DATE; }
   "datetime" { return FormulaEngineElementTypes.BUILT_IN_FUNC_DATETIME; }
   "daydiff" { return FormulaEngineElementTypes.BUILT_IN_FUNC_DAYDIFF; }
   "dayplus" { return FormulaEngineElementTypes.BUILT_IN_FUNC_DAYPLUS; }
   "dict" { return FormulaEngineElementTypes.BUILT_IN_FUNC_DICT; }
   "dict_get" { return FormulaEngineElementTypes.BUILT_IN_FUNC_DICT_GET; }
   "dict_iskey" { return FormulaEngineElementTypes.BUILT_IN_FUNC_DICT_ISKEY; }
   "dict_keys" { return FormulaEngineElementTypes.BUILT_IN_FUNC_DICT_KEYS; }
   "dict_put" { return FormulaEngineElementTypes.BUILT_IN_FUNC_DICT_PUT; }
   "dict_values" { return FormulaEngineElementTypes.BUILT_IN_FUNC_DICT_VALUES; }
   "elt" { return FormulaEngineElementTypes.BUILT_IN_FUNC_ELT; }
   "evaluate" { return FormulaEngineElementTypes.BUILT_IN_FUNC_EVALUATE; }
   "first" { return FormulaEngineElementTypes.BUILT_IN_FUNC_FIRST; }
   "float" { return FormulaEngineElementTypes.BUILT_IN_FUNC_FLOAT; }
   "hash_get" { return FormulaEngineElementTypes.BUILT_IN_FUNC_HASH_GET; }
   "hash_global" { return FormulaEngineElementTypes.BUILT_IN_FUNC_HASH_GLOBAL; }
   "hash_iskey" { return FormulaEngineElementTypes.BUILT_IN_FUNC_HASH_ISKEY; }
   "hash_keys" { return FormulaEngineElementTypes.BUILT_IN_FUNC_HASH_KEYS; }
   "hash_put" { return FormulaEngineElementTypes.BUILT_IN_FUNC_HASH_PUT; }
   "insert" { return FormulaEngineElementTypes.BUILT_IN_FUNC_INSERT; }
   "integer" { return FormulaEngineElementTypes.BUILT_IN_FUNC_INTEGER; }
   "is_date" { return FormulaEngineElementTypes.BUILT_IN_FUNC_IS_DATE; }
   "is_datetime" { return FormulaEngineElementTypes.BUILT_IN_FUNC_IS_DATETIME; }
   "is_float" { return FormulaEngineElementTypes.BUILT_IN_FUNC_IS_FLOAT; }
   "is_integer" { return FormulaEngineElementTypes.BUILT_IN_FUNC_IS_INTEGER; }
   "is_list" { return FormulaEngineElementTypes.BUILT_IN_FUNC_IS_LIST; }
   "is_matrix" { return FormulaEngineElementTypes.BUILT_IN_FUNC_IS_MATRIX; }
   "is_na" { return FormulaEngineElementTypes.BUILT_IN_FUNC_IS_NA; }
   "is_number" { return FormulaEngineElementTypes.BUILT_IN_FUNC_IS_NUMBER; }
   "is_opaque" { return FormulaEngineElementTypes.BUILT_IN_FUNC_IS_OPAQUE; }
   "is_string" { return FormulaEngineElementTypes.BUILT_IN_FUNC_IS_STRING; }
   "is_time" { return FormulaEngineElementTypes.BUILT_IN_FUNC_IS_TIME; }
   "kernel" { return FormulaEngineElementTypes.BUILT_IN_FUNC_KERNEL; }
   "last" { return FormulaEngineElementTypes.BUILT_IN_FUNC_LAST; }
   "len" { return FormulaEngineElementTypes.BUILT_IN_FUNC_LEN; }
   "list" { return FormulaEngineElementTypes.BUILT_IN_FUNC_LIST; }
   "load" { return FormulaEngineElementTypes.BUILT_IN_FUNC_LOAD; }
   "lsearch" { return FormulaEngineElementTypes.BUILT_IN_FUNC_LSEARCH; }
   "map" { return FormulaEngineElementTypes.BUILT_IN_FUNC_MAP; }
   "max" { return FormulaEngineElementTypes.BUILT_IN_FUNC_MAX; }
   "out" { return FormulaEngineElementTypes.BUILT_IN_FUNC_OUT; }
   "price_field" { return FormulaEngineElementTypes.BUILT_IN_FUNC_PRICE_FIELD; }
   "rdbms_proc" { return FormulaEngineElementTypes.BUILT_IN_FUNC_RDBMS_PROC; }
   "regex_match" { return FormulaEngineElementTypes.BUILT_IN_FUNC_REGEX_MATCH; }
   "remove" { return FormulaEngineElementTypes.BUILT_IN_FUNC_REMOVE; }
   "second" { return FormulaEngineElementTypes.BUILT_IN_FUNC_SECOND; }
   "set_suspect_price_field" { return FormulaEngineElementTypes.BUILT_IN_FUNC_SET_SUSPECT_PRICE_FIELD; }
   "sort" { return FormulaEngineElementTypes.BUILT_IN_FUNC_SORT; }
   "split" { return FormulaEngineElementTypes.BUILT_IN_FUNC_SPLIT;}
   "sql" { return FormulaEngineElementTypes.BUILT_IN_FUNC_SQL; }
   "status" { return FormulaEngineElementTypes.BUILT_IN_FUNC_STATUS; }
   "str" { return FormulaEngineElementTypes.BUILT_IN_FUNC_STR; }
   "string" { return FormulaEngineElementTypes.BUILT_IN_FUNC_STRING; }
   "strip" { return FormulaEngineElementTypes.BUILT_IN_FUNC_STRIP; }
   "strval" { return FormulaEngineElementTypes.BUILT_IN_FUNC_STRVAL; }
   "time" { return FormulaEngineElementTypes.BUILT_IN_FUNC_TIME; }
   "toupper" { return FormulaEngineElementTypes.BUILT_IN_FUNC_TOUPPER; }
   "ts" { return FormulaEngineElementTypes.BUILT_IN_FUNC_TS; }
   "ts_update" { return FormulaEngineElementTypes.BUILT_IN_FUNC_TS_UPDATE; }
   "year_fraction" { return FormulaEngineElementTypes.BUILT_IN_FUNC_YEAR_FRACTION; }
}

// Der Function Header soll Datentypen nicht als built-in methode markieren (clash von datentypen und built-in Methodennamen, bspw "string" oder "integer" -> klassische cast funktionen)
<IN_FUNCTION_HEADER> {
    "(" { return FormulaEngineElementTypes.LEFT_PARENTHESIS; }
    ")" { return FormulaEngineElementTypes.RIGHT_PARENTHESIS; }
    "{" { stateTracker.endState(); return FormulaEngineElementTypes.LEFT_CURLY_BRACE; }
}

<YYINITIAL, IN_PARENTHESIS, IN_FUNCTION_HEADER> {
    "{" { return FormulaEngineElementTypes.LEFT_CURLY_BRACE; }
    "}" { return FormulaEngineElementTypes.RIGHT_CURLY_BRACE; }
    "[" { return FormulaEngineElementTypes.LEFT_BRACKET; }
    "]" { return FormulaEngineElementTypes.RIGHT_BRACKET; }

    && { return FormulaEngineElementTypes.OPERATOR_AND; }
    "==" { return FormulaEngineElementTypes.OPERATOR_EQUAL; }
    "=" { return FormulaEngineElementTypes.OPERATOR_ASSIGNMENT; }
    "/" { return FormulaEngineElementTypes.OPERATOR_DIVIDE; }
    "--" { return FormulaEngineElementTypes.OPERATOR_DECREMENT; }
    ">=" { return FormulaEngineElementTypes.OPERATOR_GREATERTHANEQUAL; }
    ">" { return FormulaEngineElementTypes.OPERATOR_GREATERTHAN; }
    "++" { return FormulaEngineElementTypes.OPERATOR_INCREMENT; }
    "<=" { return FormulaEngineElementTypes.OPERATOR_LESSTHANEQUAL; }
    "<" { return FormulaEngineElementTypes.OPERATOR_LESSTHAN; }
    "%" { return FormulaEngineElementTypes.OPERATOR_MODULO; }
    "!" { return FormulaEngineElementTypes.OPERATOR_NEGATION; }
    "!=" { return FormulaEngineElementTypes.OPERATOR_NOTEQUAL; }
    "||" { return FormulaEngineElementTypes.OPERATOR_OR; }
    "*" { return FormulaEngineElementTypes.OPERATOR_MULTIPLY; }
    "+=" { return FormulaEngineElementTypes.OPERATOR_ADDASSIGNMENT; }
    "+" { return FormulaEngineElementTypes.OPERATOR_PLUS; }
    "-" { return FormulaEngineElementTypes.OPERATOR_MINUS; }
    "-=" { return FormulaEngineElementTypes.OPERATOR_SUBTRACTASSIGNMENT; }
    "*=" { return FormulaEngineElementTypes.OPERATOR_MULTIPLYASSIGNMENT; }
    "/=" { return FormulaEngineElementTypes.OPERATOR_DIVIDEASSIGNMENT; }
    "%=" { return FormulaEngineElementTypes.OPERATOR_MODULOASSIGNMENT; }
    "^" { return FormulaEngineElementTypes.OPERATOR_POWER; }

    // Visibility
    "local" { return FormulaEngineElementTypes.VISIBILITY_LOCAL; }
    "global" { return FormulaEngineElementTypes.VISIBILITY_GLOBAL; }

    // Data Types
    "any" { return FormulaEngineElementTypes.KEYWORD_ANY; }
    "bool" { return FormulaEngineElementTypes.KEYWORD_BOOLEAN; }
    "date" { return FormulaEngineElementTypes.KEYWORD_DATE; }
    "datetime" { return FormulaEngineElementTypes.KEYWORD_DATETIME; }
    "dict" { return FormulaEngineElementTypes.KEYWORD_DICT; }
    "float" { return FormulaEngineElementTypes.KEYWORD_FLOAT; }
    "integer" { return FormulaEngineElementTypes.KEYWORD_INTEGER; }
    "list" { return FormulaEngineElementTypes.KEYWORD_LIST; }
    "number" { return FormulaEngineElementTypes.KEYWORD_NUMBER; }
    "string" { return FormulaEngineElementTypes.KEYWORD_STRING; }
    "time" { return FormulaEngineElementTypes.KEYWORD_TIME; }

    // Keywords
    "and" { return FormulaEngineElementTypes.KEYWORD_AND; }
    "break" { return FormulaEngineElementTypes.KEYWORD_BREAK; }
    "case" { return FormulaEngineElementTypes.KEYWORD_CASE; }
    "continue" { return FormulaEngineElementTypes.KEYWORD_CONTINUE; }
    "default" { return FormulaEngineElementTypes.KEYWORD_DEFAULT; }
    "do" { return FormulaEngineElementTypes.KEYWORD_DO; }
    "else" { return FormulaEngineElementTypes.KEYWORD_ELSE; }
    "for" { return FormulaEngineElementTypes.KEYWORD_FOR; }
    "function" { stateTracker.beginState(IN_FUNCTION_HEADER); return FormulaEngineElementTypes.KEYWORD_FUNCTION; }
    "if" { return FormulaEngineElementTypes.KEYWORD_IF; }
    "or" { return FormulaEngineElementTypes.KEYWORD_OR; }
    "return" { return FormulaEngineElementTypes.KEYWORD_RETURN; }
    "seq" { return FormulaEngineElementTypes.KEYWORD_SEQ; }
    "switch" { return FormulaEngineElementTypes.KEYWORD_SWITCH; }
    "while" { return FormulaEngineElementTypes.KEYWORD_WHILE; }

    // Built-in Variables
    "\$NA" { return FormulaEngineElementTypes.BUILT_IN_VAR_NA; }
    "\$TODAY" { return FormulaEngineElementTypes.BUILT_IN_VAR_TODAY; }
    "\$TIMETODAY" { return FormulaEngineElementTypes.BUILT_IN_VAR_TIMETODAY; }
    "\$SYMBOL" { return FormulaEngineElementTypes.BUILT_IN_VAR_SYMBOL; }
    "\$NAME" { return FormulaEngineElementTypes.BUILT_IN_VAR_NAME; }
    "\$PROCESSED" { return FormulaEngineElementTypes.BUILT_IN_VAR_PROCESSED; }
    "\$PASSED" { return FormulaEngineElementTypes.BUILT_IN_VAR_PASSED; }
    "\$LISTID" { return FormulaEngineElementTypes.BUILT_IN_VAR_LISTID; }
    "\$LISTTP" { return FormulaEngineElementTypes.BUILT_IN_VAR_LISTTP; }
    "\$TREEID" { return FormulaEngineElementTypes.BUILT_IN_VAR_TREEID; }
    "\$FIELD" { return FormulaEngineElementTypes.BUILT_IN_VAR_FIELD; }
    "\$FIELDS" { return FormulaEngineElementTypes.BUILT_IN_VAR_FIELDS; }
    "\$DATA" { return FormulaEngineElementTypes.BUILT_IN_VAR_DATA; }
    "\$DATETIME" { return FormulaEngineElementTypes.BUILT_IN_VAR_DATETIME; }
    "\$STATUS" { return FormulaEngineElementTypes.BUILT_IN_VAR_STATUS; }
    "\$DEPENDENCIES" { return FormulaEngineElementTypes.BUILT_IN_VAR_DEPENDENCIES; }
    "\$DEPENDENCIES_TRIGGERS" { return FormulaEngineElementTypes.BUILT_IN_VAR_DEPENDENCIES_TRIGGERS; }

    // Built-in Functions (use parenthesis for matching but don't include the parenthesis in the token)
   "ado_browse(" { yypushback(1); return FormulaEngineElementTypes.BUILT_IN_FUNC_ADO_BROWSE; }
   "attribute(" { yypushback(1); return FormulaEngineElementTypes.BUILT_IN_FUNC_ATTRIBUTE; }
   "bsearch(" { yypushback(1); return FormulaEngineElementTypes.BUILT_IN_FUNC_BSEARCH; }
   "bool(" { yypushback(1); return FormulaEngineElementTypes.BUILT_IN_FUNC_BOOL; }
   "correct_price_field(" { yypushback(1); return FormulaEngineElementTypes.BUILT_IN_FUNC_CORRECT_PRICE_FIELD; }
   "date(" { yypushback(1); return FormulaEngineElementTypes.BUILT_IN_FUNC_DATE; }
   "datetime(" { yypushback(1); return FormulaEngineElementTypes.BUILT_IN_FUNC_DATETIME; }
   "daydiff(" { yypushback(1); return FormulaEngineElementTypes.BUILT_IN_FUNC_DAYDIFF; }
   "dayplus(" { yypushback(1); return FormulaEngineElementTypes.BUILT_IN_FUNC_DAYPLUS; }
   "dict(" { yypushback(1); return FormulaEngineElementTypes.BUILT_IN_FUNC_DICT; }
   "dict_get(" { yypushback(1); return FormulaEngineElementTypes.BUILT_IN_FUNC_DICT_GET; }
   "dict_iskey(" { yypushback(1); return FormulaEngineElementTypes.BUILT_IN_FUNC_DICT_ISKEY; }
   "dict_keys(" { yypushback(1); return FormulaEngineElementTypes.BUILT_IN_FUNC_DICT_KEYS; }
   "dict_put(" { yypushback(1); return FormulaEngineElementTypes.BUILT_IN_FUNC_DICT_PUT; }
   "dict_values(" {yypushback(1); return FormulaEngineElementTypes.BUILT_IN_FUNC_DICT_VALUES; }
   "elt(" { yypushback(1); return FormulaEngineElementTypes.BUILT_IN_FUNC_ELT; }
   "evaluate(" { yypushback(1); return FormulaEngineElementTypes.BUILT_IN_FUNC_EVALUATE; }
   "first(" { yypushback(1); return FormulaEngineElementTypes.BUILT_IN_FUNC_FIRST; }
   "float(" { yypushback(1); return FormulaEngineElementTypes.BUILT_IN_FUNC_FLOAT; }
   "hash_get(" { yypushback(1); return FormulaEngineElementTypes.BUILT_IN_FUNC_HASH_GET; }
   "hash_global(" { yypushback(1); return FormulaEngineElementTypes.BUILT_IN_FUNC_HASH_GLOBAL; }
   "hash_iskey(" { yypushback(1); return FormulaEngineElementTypes.BUILT_IN_FUNC_HASH_ISKEY; }
   "hash_keys(" { yypushback(1); return FormulaEngineElementTypes.BUILT_IN_FUNC_HASH_KEYS; }
   "hash_put(" { yypushback(1); return FormulaEngineElementTypes.BUILT_IN_FUNC_HASH_PUT; }
   "insert(" { yypushback(1); return FormulaEngineElementTypes.BUILT_IN_FUNC_INSERT; }
   "integer(" { yypushback(1); return FormulaEngineElementTypes.BUILT_IN_FUNC_INTEGER; }
   "is_date(" { yypushback(1); return FormulaEngineElementTypes.BUILT_IN_FUNC_IS_DATE; }
   "is_datetime(" { yypushback(1); return FormulaEngineElementTypes.BUILT_IN_FUNC_IS_DATETIME; }
   "is_float(" { yypushback(1); return FormulaEngineElementTypes.BUILT_IN_FUNC_IS_FLOAT; }
   "is_integer(" { yypushback(1); return FormulaEngineElementTypes.BUILT_IN_FUNC_IS_INTEGER; }
   "is_list(" { yypushback(1); return FormulaEngineElementTypes.BUILT_IN_FUNC_IS_LIST; }
   "is_matrix(" { yypushback(1); return FormulaEngineElementTypes.BUILT_IN_FUNC_IS_MATRIX; }
   "is_na(" { yypushback(1); return FormulaEngineElementTypes.BUILT_IN_FUNC_IS_NA; }
   "is_number(" { yypushback(1); return FormulaEngineElementTypes.BUILT_IN_FUNC_IS_NUMBER; }
   "is_opaque(" { yypushback(1); return FormulaEngineElementTypes.BUILT_IN_FUNC_IS_OPAQUE; }
   "is_string(" { yypushback(1); return FormulaEngineElementTypes.BUILT_IN_FUNC_IS_STRING; }
   "is_time(" { yypushback(1); return FormulaEngineElementTypes.BUILT_IN_FUNC_IS_TIME; }
   "kernel(" { yypushback(1); return FormulaEngineElementTypes.BUILT_IN_FUNC_KERNEL; }
   "last(" { yypushback(1); return FormulaEngineElementTypes.BUILT_IN_FUNC_LAST; }
   "len(" { yypushback(1); return FormulaEngineElementTypes.BUILT_IN_FUNC_LEN; }
   "list(" { yypushback(1); return FormulaEngineElementTypes.BUILT_IN_FUNC_LIST; }
   "load(" { yypushback(1); return FormulaEngineElementTypes.BUILT_IN_FUNC_LOAD; }
   "lsearch(" { yypushback(1); return FormulaEngineElementTypes.BUILT_IN_FUNC_LSEARCH; }
   "map(" { yypushback(1); return FormulaEngineElementTypes.BUILT_IN_FUNC_MAP; }
   "max(" { yypushback(1); return FormulaEngineElementTypes.BUILT_IN_FUNC_MAX; }
   "out(" { yypushback(1); return FormulaEngineElementTypes.BUILT_IN_FUNC_OUT; }
   "price_field(" { yypushback(1); return FormulaEngineElementTypes.BUILT_IN_FUNC_PRICE_FIELD; }
   "rdbms_proc(" { yypushback(1); return FormulaEngineElementTypes.BUILT_IN_FUNC_RDBMS_PROC; }
   "regex_match(" { yypushback(1); return FormulaEngineElementTypes.BUILT_IN_FUNC_REGEX_MATCH; }
   "remove(" { yypushback(1); return FormulaEngineElementTypes.BUILT_IN_FUNC_REMOVE; }
   "second(" { yypushback(1); return FormulaEngineElementTypes.BUILT_IN_FUNC_SECOND; }
   "set_suspect_price_field(" { yypushback(1); return FormulaEngineElementTypes.BUILT_IN_FUNC_SET_SUSPECT_PRICE_FIELD; }
   "sort(" { yypushback(1); return FormulaEngineElementTypes.BUILT_IN_FUNC_SORT; }
   "split(" { yypushback(1); return FormulaEngineElementTypes.BUILT_IN_FUNC_SPLIT; }
   "sql(" { yypushback(1); return FormulaEngineElementTypes.BUILT_IN_FUNC_SQL; }
   "status(" { yypushback(1); return FormulaEngineElementTypes.BUILT_IN_FUNC_STATUS; }
   "str(" { yypushback(1); return FormulaEngineElementTypes.BUILT_IN_FUNC_STR; }
   "string(" { yypushback(1); return FormulaEngineElementTypes.BUILT_IN_FUNC_STRING; }
   "strip(" { yypushback(1); return FormulaEngineElementTypes.BUILT_IN_FUNC_STRIP; }
   "strval(" { yypushback(1); return FormulaEngineElementTypes.BUILT_IN_FUNC_STRVAL; }
   "time(" { yypushback(1); return FormulaEngineElementTypes.BUILT_IN_FUNC_TIME; }
   "toupper(" { yypushback(1); return FormulaEngineElementTypes.BUILT_IN_FUNC_TOUPPER; }
   "ts(" { yypushback(1); return FormulaEngineElementTypes.BUILT_IN_FUNC_TS; }
   "ts_update(" { yypushback(1); return FormulaEngineElementTypes.BUILT_IN_FUNC_TS_UPDATE; }
   "year_fraction(" { yypushback(1); return FormulaEngineElementTypes.BUILT_IN_FUNC_YEAR_FRACTION; }

   "," { return FormulaEngineElementTypes.COMMA; }
   ";" { return FormulaEngineElementTypes.SEMICOLON; }
   ":" { return FormulaEngineElementTypes.COLON; }
   "?" { return FormulaEngineElementTypes.QUESIONMARK; }

   {COMMENT_SINGLE_LINE} { return FormulaEngineElementTypes.LINE_COMMENT; }
   {BLOCK_COMMENT} { return FormulaEngineElementTypes.BLOCK_COMMENT; }

   {QUOTED_MULTILINE_LITERAL} { return FormulaEngineElementTypes.SINGLE_QUOTED_STRING; }
   {QUOTED_LITERAL} { return FormulaEngineElementTypes.SINGLE_QUOTED_STRING; }
   {DOUBLE_QUOTED_MULTILINE_LITERAL} { return FormulaEngineElementTypes.DOUBLE_QUOTED_STRING; }
   {DOUBLE_QUOTED_LITERAL} { return FormulaEngineElementTypes.DOUBLE_QUOTED_STRING; }

   {NUMBER_SCIENTIFIC} { return FormulaEngineElementTypes.NUMBER_SCIENTIFIC; }
   {NUMBER_FLOAT} { return FormulaEngineElementTypes.NUMBER_FLOAT; }
   {NUMBER_INTEGER} { return FormulaEngineElementTypes.NUMBER_INTEGER; }

   {IDENTIFIER} "[" { yypushback(1); return FormulaEngineElementTypes.IDENTIFIER; }  // fix token detection of built in methods during array access (e.g. list[0])
   {IDENTIFIER} { return FormulaEngineElementTypes.IDENTIFIER; }
   {WHITE_SPACE} { return TokenType.WHITE_SPACE; }
}

<YYINITIAL, IN_PARENTHESIS> {
    "(" { stateTracker.beginState(IN_PARENTHESIS); return FormulaEngineElementTypes.LEFT_PARENTHESIS; }
    ")" { stateTracker.endState(); return FormulaEngineElementTypes.RIGHT_PARENTHESIS; }
}

[^] { return TokenType.BAD_CHARACTER; }
