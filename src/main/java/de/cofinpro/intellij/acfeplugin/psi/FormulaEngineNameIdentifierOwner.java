package de.cofinpro.intellij.acfeplugin.psi;

import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiNameIdentifierOwner;
import com.intellij.psi.impl.source.tree.LeafPsiElement;
import com.intellij.psi.util.PsiTreeUtil;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface FormulaEngineNameIdentifierOwner extends PsiNameIdentifierOwner {

    @Nullable
    @Override
    default PsiElement getNameIdentifier() {
        return getIdentifier();
    }

    @Override
    default PsiElement setName(@NotNull String name) {
        getLeafPsiElement().replaceWithText(name);
        return this;
    }

    default LeafPsiElement getLeafPsiElement() {
        return PsiTreeUtil.getChildOfType(this, LeafPsiElement.class);
    }

    PsiElement getIdentifier();
}
