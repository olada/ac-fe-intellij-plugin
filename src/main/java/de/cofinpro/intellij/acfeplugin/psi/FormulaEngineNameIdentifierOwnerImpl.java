package de.cofinpro.intellij.acfeplugin.psi;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiReference;
import com.intellij.psi.impl.source.tree.LeafPsiElement;
import com.intellij.psi.util.PsiTreeUtil;
import com.intellij.util.IncorrectOperationException;
import de.cofinpro.intellij.acfeplugin.referencing.FormulaEngineSelfReference;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public abstract class FormulaEngineNameIdentifierOwnerImpl extends ASTWrapperPsiElement implements FormulaEngineNameIdentifierOwner {

    public FormulaEngineNameIdentifierOwnerImpl(@NotNull ASTNode node) {
        super(node);
    }

    @Nullable
    @Override
    public PsiElement getNameIdentifier() {
        return getIdentifier();
    }

    @Override
    public PsiElement setName(@NotNull String name) throws IncorrectOperationException {
        getLeafPsiElement().replaceWithText(name);
        return this;
    }

    @Override
    public PsiReference getReference() {
        return new FormulaEngineSelfReference(this);
    }

    /**
     * Taken from com.android.tools.idea.lang.aidl.psi.impl.AidlNamedElementImpl#getLeaf (from OSS edition)
     * @return Psi element using the specific implementation
     */
    private LeafPsiElement getLeafPsiElement() {
        return PsiTreeUtil.getChildOfType(this, LeafPsiElement.class);
    }

    public abstract PsiElement getIdentifier();
}
