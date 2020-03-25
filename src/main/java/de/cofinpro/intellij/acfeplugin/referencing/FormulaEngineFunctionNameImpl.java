package de.cofinpro.intellij.acfeplugin.referencing;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiReference;
import org.jetbrains.annotations.NotNull;

public class FormulaEngineFunctionNameImpl extends ASTWrapperPsiElement {
    public FormulaEngineFunctionNameImpl(@NotNull ASTNode node) {
        super(node);
    }

    @Override
    public PsiReference getReference() {

        return new FormulaEngineFunctionReference(this);
    }
}
