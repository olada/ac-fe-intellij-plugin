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
        FormulaEngineIdentifierLiteral identifierLiteral = getIdentifierLiteral();
        if (identifierLiteral != null) {
            return identifierLiteral;
        } else {
            return getIdentifier();
        }
    }

    @Override
    default PsiElement setName(@NotNull String name) {
        getLeafPsiElement().replaceWithText(name);
        return this;
    }

    default LeafPsiElement getLeafPsiElement() {
        return PsiTreeUtil.getChildOfType(this, LeafPsiElement.class);
    }

    // requires default implementations for getIdentifier and getIdentifierLiteral because these two methods
    // are the possible methods which return an identifier

    default PsiElement getIdentifier() {
        return null;
    }

    default FormulaEngineIdentifierLiteral getIdentifierLiteral() {
        return null;
    }
}
