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

    {IDENTIFIER} { return FormulaEngineElementTypes.IDENTIFIER; }
    {WHITE_SPACE} { return TokenType.WHITE_SPACE; }
}

[^]                                                         { return TokenType.BAD_CHARACTER; }