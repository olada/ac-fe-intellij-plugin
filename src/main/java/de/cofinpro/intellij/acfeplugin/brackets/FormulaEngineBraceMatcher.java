package de.cofinpro.intellij.acfeplugin.brackets;

import com.intellij.lang.BracePair;
import com.intellij.lang.PairedBraceMatcher;
import com.intellij.psi.PsiFile;
import com.intellij.psi.tree.IElementType;
import de.cofinpro.intellij.acfeplugin.psi.FormulaEngineElementTypes;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class FormulaEngineBraceMatcher implements PairedBraceMatcher {
    private static final BracePair[] PAIRS = {
        new BracePair(FormulaEngineElementTypes.LEFT_CURLY_BRACE, FormulaEngineElementTypes.RIGHT_CURLY_BRACE, true),
        new BracePair(FormulaEngineElementTypes.LEFT_BRACKET, FormulaEngineElementTypes.RIGHT_BRACKET, false),
        new BracePair(FormulaEngineElementTypes.LEFT_PARENTHESIS, FormulaEngineElementTypes.RIGHT_PARENTHESIS, false)
    };

    @NotNull
    @Override
    public BracePair[] getPairs() {
        return PAIRS;
    }

    @Override
    public boolean isPairedBracesAllowedBeforeType(@NotNull IElementType lbraceType, @Nullable IElementType contextType) {
        return true;
    }

    @Override
    public int getCodeConstructStart(PsiFile file, int openingBraceOffset) {
        return openingBraceOffset;
    }
}
