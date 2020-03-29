package de.cofinpro.intellij.acfeplugin.referencing;

import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiPolyVariantReference;
import com.intellij.psi.ResolveResult;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class FormulaEngineArrayAccessReference extends FormulaEngineReference implements PsiPolyVariantReference {
    private final PsiElement sourceElement;

    public FormulaEngineArrayAccessReference(@NotNull PsiElement element) {
        super(element);
        this.sourceElement = element;
    }

    @Nullable
    @Override
    public PsiElement resolve() {
        return null;
    }

    @NotNull
    @Override
    public ResolveResult[] multiResolve(boolean incompleteCode) {
        return new ResolveResult[0];
    }
}
