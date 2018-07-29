package de.cofinpro.intellij.acfeplugin;

import com.intellij.lang.Language;

/**
 * Created by David Olah on 29.07.2018.
 */
public class FormulaEngineLanguage extends Language {
    public static final FormulaEngineLanguage INSTANCE = new FormulaEngineLanguage();

    private FormulaEngineLanguage() {
        super("FormulaEngine");
    }
}
