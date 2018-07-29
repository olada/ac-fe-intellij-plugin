package de.cofinpro.intellij.acfeplugin.psi;

import com.intellij.psi.tree.IElementType;
import de.cofinpro.intellij.acfeplugin.FormulaEngineLanguage;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

/**
 * Created by David Olah on 29.07.2018.
 */
public class FormulaEngineElementType extends IElementType {
    public FormulaEngineElementType(@NotNull @NonNls String debugName) {
        super(debugName, FormulaEngineLanguage.INSTANCE);
    }
}
