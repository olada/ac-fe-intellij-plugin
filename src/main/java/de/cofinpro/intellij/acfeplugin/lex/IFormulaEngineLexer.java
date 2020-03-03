package de.cofinpro.intellij.acfeplugin.lex;

import com.intellij.lexer.FlexLexer;

/**
 * Von {@link FlexLexer} abgeleitetes Interface, damit weitere erwartete Methoden eingeführt werden können,
 * die bspw. von {@link FormulaEngineLexerStateTracker} aufgerufen werden können.
 * Das "I" als Prefix wird verwendet, damit es keinen Namens-Clash mit dem generierten Flexer gibt.
 */
public interface IFormulaEngineLexer extends FlexLexer {
    /**
     * Liefert den initialen State zurück.
     * Sollte YYINITIAL sein;
     * @return initialer State
     */
    int getInitialState();
}
