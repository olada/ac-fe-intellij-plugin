package de.cofinpro.intellij.acfeplugin;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import com.intellij.psi.TokenType;
import de.cofinpro.intellij.acfeplugin.psi.FormulaEngineElementType;
import de.cofinpro.intellij.acfeplugin.psi.FormulaEngineElementTypes;

%%

%class FormulaEngineLexer
%implements FlexLexer
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
DOUBLE_QUOTED_LITERAL=\"([^\\\"\r\n]|{ESCAPE_SEQUENCE}|(\\[\r\n]))*?(\"|\\)?
ESCAPE_SEQUENCE=\\[^\r\n]

COMMENT_SINGLE_LINE = ("//")[^\r\n]*
BLOCK_COMMENT=[/][*][^*]*[*]+([^/*][^*]*[*]+)*[/]

NUMBER_INTEGER = [0-9]+

%state WAITING_VALUE

%%
<YYINITIAL> {
    "(" { return FormulaEngineElementTypes.LEFT_PARENTHESIS; }
    ")" { return FormulaEngineElementTypes.RIGHT_PARENTHESIS; }
    "{" { return FormulaEngineElementTypes.LEFT_CURLY_BRACE; }
    "}" { return FormulaEngineElementTypes.RIGHT_CURLY_BRACE; }
    "[" { return FormulaEngineElementTypes.LEFT_BRACKET; }
    "]" { return FormulaEngineElementTypes.RIGHT_BRACKET; }

    "=" { return FormulaEngineElementTypes.OPERATOR_EQUALS; }

    "function" { return FormulaEngineElementTypes.FUNCTION; }
    "return" { return FormulaEngineElementTypes.RETURN; }

    // Visibility
    "local" { return FormulaEngineElementTypes.LOCAL; }
    "global" { return FormulaEngineElementTypes.GLOBAL; }

    // Data Types
    "float" { return FormulaEngineElementTypes.FLOAT; }
    "integer" { return FormulaEngineElementTypes.INTEGER; }
    "string" { return FormulaEngineElementTypes.STRING; }
    "list" { return FormulaEngineElementTypes.LIST; }
    "dict" { return FormulaEngineElementTypes.DICT; }
    "any" { return FormulaEngineElementTypes.ANY; }

    // Keywords
    "else" { return FormulaEngineElementTypes.KEYWORD_ELSE; }
    "for" { return FormulaEngineElementTypes.KEYWORD_FOR; }
    "if" { return FormulaEngineElementTypes.KEYWORD_IF; }
    "while" { return FormulaEngineElementTypes.KEYWORD_WHILE; }

    // Built-in Variables
    "\$NA" { return FormulaEngineElementTypes.BUILT_IN_VAR_NA; }

    // Built-in Functions (use parenthesis for matching but don't include the parenthesis in the token)
   "attribute(" { yypushback(1); return FormulaEngineElementTypes.BUILT_IN_FUNC_ATTRIBUTE; }
   "date(" { yypushback(1); return FormulaEngineElementTypes.BUILT_IN_FUNC_DATE; }
   "datetime(" { yypushback(1); return FormulaEngineElementTypes.BUILT_IN_FUNC_DATETIME; }
   "daydiff(" { yypushback(1); return FormulaEngineElementTypes.BUILT_IN_FUNC_DAYDIFF; }
   "dayplus(" { yypushback(1); return FormulaEngineElementTypes.BUILT_IN_FUNC_DAYPLUS; }
   "elt(" { yypushback(1); return FormulaEngineElementTypes.BUILT_IN_FUNC_ELT; }
   "float(" { yypushback(1); return FormulaEngineElementTypes.BUILT_IN_FUNC_FLOAT; }
   "integer(" { yypushback(1); return FormulaEngineElementTypes.BUILT_IN_FUNC_INTEGER; }
   "hash_get(" { yypushback(1); return FormulaEngineElementTypes.BUILT_IN_FUNC_HASH_GET; }
   "hash_iskey(" { yypushback(1); return FormulaEngineElementTypes.BUILT_IN_FUNC_HASH_ISKEY; }
   "hash_keys(" { yypushback(1); return FormulaEngineElementTypes.BUILT_IN_FUNC_HASH_KEYS; }
   "hash_put(" { yypushback(1); return FormulaEngineElementTypes.BUILT_IN_FUNC_HASH_PUT; }
   "is_list(" { yypushback(1); return FormulaEngineElementTypes.BUILT_IN_FUNC_IS_LIST; }
   "is_na(" { yypushback(1); return FormulaEngineElementTypes.BUILT_IN_FUNC_IS_NA; }
   "kernel(" { yypushback(1); return FormulaEngineElementTypes.BUILT_IN_FUNC_KERNEL; }
   "len(" { yypushback(1); return FormulaEngineElementTypes.BUILT_IN_FUNC_LEN; }
   "load(" { yypushback(1); return FormulaEngineElementTypes.BUILT_IN_FUNC_LOAD; }
   "out(" { yypushback(1); return FormulaEngineElementTypes.BUILT_IN_FUNC_OUT; }
   "remove(" { yypushback(1); return FormulaEngineElementTypes.BUILT_IN_FUNC_REMOVE; }
   "status(" { yypushback(1); return FormulaEngineElementTypes.BUILT_IN_FUNC_STATUS; }
   "str(" { yypushback(1); return FormulaEngineElementTypes.BUILT_IN_FUNC_STR; }

   {COMMENT_SINGLE_LINE} { return FormulaEngineElementTypes.LINE_COMMENT; }
   {BLOCK_COMMENT} { return FormulaEngineElementTypes.BLOCK_COMMENT; }

   {QUOTED_LITERAL} { return FormulaEngineElementTypes.SINGLE_QUOTED_STRING; }
   {DOUBLE_QUOTED_LITERAL} { return FormulaEngineElementTypes.DOUBLE_QUOTED_STRING; }

   {NUMBER_INTEGER} { return FormulaEngineElementTypes.NUMBER_INTEGER; }

   {IDENTIFIER} { return FormulaEngineElementTypes.IDENTIFIER; }
   {WHITE_SPACE} { return TokenType.WHITE_SPACE; }
}

[^] { return TokenType.BAD_CHARACTER; }