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

CRLF=\R
WHITE_SPACE= " " | [\ \n\t\f\r]
END_OF_LINE_COMMENT=("//")[^\r\n]*
KEY_CHARACTER=[^:=\ \n\t\f\\] | "\\ "
IDENTIFIER=[a-zA-Z_][a-zA-Z0-9_]*

// taken from Python.flex in OSS
QUOTED_LITERAL="'" ([^\\\'\r\n] | {ESCAPE_SEQUENCE} | (\\[\r\n]))* ("'"|\\)?
DOUBLE_QUOTED_LITERAL=\"([^\\\"\r\n]|{ESCAPE_SEQUENCE}|(\\[\r\n]))*?(\"|\\)?
ESCAPE_SEQUENCE=\\[^\r\n]

%state WAITING_VALUE

%%
<YYINITIAL> {
    "(" { return FormulaEngineElementTypes.LEFT_PARENTHESIS; }
    ")" { return FormulaEngineElementTypes.RIGHT_PARENTHESIS; }
    "{" { return FormulaEngineElementTypes.LEFT_CURLY_BRACE; }
    "}" { return FormulaEngineElementTypes.RIGHT_CURLY_BRACE; }

    "=" { return FormulaEngineElementTypes.OPERATOR_EQUALS; }

    "function" { return FormulaEngineElementTypes.FUNCTION; }
    "return" { return FormulaEngineElementTypes.RETURN; }

    // Visibility
    "local" { return FormulaEngineElementTypes.LOCAL; }
    "global" { return FormulaEngineElementTypes.GLOBAL; }

    // Data Types
    "integer" { return FormulaEngineElementTypes.INTEGER; }
    "string" { return FormulaEngineElementTypes.STRING; }
    "list" { return FormulaEngineElementTypes.LIST; }
    "dict" { return FormulaEngineElementTypes.DICT; }
    "any" { return FormulaEngineElementTypes.ANY; }

    // Built-in Variables
    "\$NA" { return FormulaEngineElementTypes.BUILT_IN_VAR_NA; }

    // Built-in Functions (use parenthesis for matching but don't include the parenthesis in the token)
   "attribute(" { yypushback(1); return FormulaEngineElementTypes.ATTRIBUTE; }
   "date(" { yypushback(1); return FormulaEngineElementTypes.DATE; }
   "datetime(" { yypushback(1); return FormulaEngineElementTypes.DATETIME; }
   "elt(" { yypushback(1); return FormulaEngineElementTypes.ELT; }
   "is_list(" { yypushback(1); return FormulaEngineElementTypes.IS_LIST; }
   "is_na(" { yypushback(1); return FormulaEngineElementTypes.IS_NA; }
   "len(" { yypushback(1); return FormulaEngineElementTypes.LEN; }
   "load(" { yypushback(1); return FormulaEngineElementTypes.LOAD; }
   "remove(" { yypushback(1); return FormulaEngineElementTypes.REMOVE; }
   "status(" { yypushback(1); return FormulaEngineElementTypes.STATUS; }
   "str(" { yypushback(1); return FormulaEngineElementTypes.STR; }

    {IDENTIFIER} { return FormulaEngineElementTypes.IDENTIFIER; }
    {WHITE_SPACE} { return TokenType.WHITE_SPACE; }
}

[^] { return TokenType.BAD_CHARACTER; }