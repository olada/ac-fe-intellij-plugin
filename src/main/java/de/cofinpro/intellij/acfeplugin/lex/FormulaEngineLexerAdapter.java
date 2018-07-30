package de.cofinpro.intellij.acfeplugin.lex;

import com.intellij.lexer.FlexAdapter;
import de.cofinpro.intellij.acfeplugin.FormulaEngineLexer;

/**
 * Created by David Olah on 30.07.2018.
 */
public class FormulaEngineLexerAdapter extends FlexAdapter {
    public FormulaEngineLexerAdapter() {
        super(new FormulaEngineLexer(null));
    }
}
