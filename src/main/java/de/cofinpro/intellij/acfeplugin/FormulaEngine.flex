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

    // Visibility
    "local" { return FormulaEngineElementTypes.VISIBILITY_PREFIX; }
    "global" { return FormulaEngineElementTypes.VISIBILITY_PREFIX; }

    // Data Types
    "integer" { return FormulaEngineElementTypes.INTEGER; }
    "string" { return FormulaEngineElementTypes.STRING; }
    "list" { return FormulaEngineElementTypes.LIST; }
    "dict" { return FormulaEngineElementTypes.DICT; }
    "any" { return FormulaEngineElementTypes.ANY; }

    {IDENTIFIER} { return FormulaEngineElementTypes.IDENTIFIER; }
    {WHITE_SPACE} { return TokenType.WHITE_SPACE; }
}

/*
<YYINITIAL> {END_OF_LINE_COMMENT}                           { yybegin(YYINITIAL); return FormulaEngineElementTypes.COMMENT; }

<YYINITIAL> {KEY_CHARACTER}+                                { yybegin(YYINITIAL); return FormulaEngineElementTypes.KEY; }

<YYINITIAL> {SEPARATOR}                                     { yybegin(WAITING_VALUE); return FormulaEngineElementTypes.SEPARATOR; }

<WAITING_VALUE> {CRLF}({CRLF}|{WHITE_SPACE})+               { yybegin(YYINITIAL); return TokenType.WHITE_SPACE; }

<WAITING_VALUE> {WHITE_SPACE}+                              { yybegin(WAITING_VALUE); return TokenType.WHITE_SPACE; }

<WAITING_VALUE> {FIRST_VALUE_CHARACTER}{VALUE_CHARACTER}*   { yybegin(YYINITIAL); return FormulaEngineElementTypes.VALUE; }

({CRLF}|{WHITE_SPACE})+                                     { yybegin(YYINITIAL); return TokenType.WHITE_SPACE; }
*/

[^]                                                         { return TokenType.BAD_CHARACTER; }