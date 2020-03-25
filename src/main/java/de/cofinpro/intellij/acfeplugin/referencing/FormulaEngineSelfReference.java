package de.cofinpro.intellij.acfeplugin.referencing;

import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class FormulaEngineSelfReference extends FormulaEngineReference {
    private final PsiElement sourceElement;

    public FormulaEngineSelfReference(@NotNull PsiElement element) {
        super(element);
        this.sourceElement = element;
    }

    @Nullable
    @Override
    public PsiElement resolve() {
        return sourceElement;
    }

    @NotNull
    @Override
    public Object[] getVariants() {
        return new Object[]{"this", "is", "a", "self", "reference"};
    }
}
