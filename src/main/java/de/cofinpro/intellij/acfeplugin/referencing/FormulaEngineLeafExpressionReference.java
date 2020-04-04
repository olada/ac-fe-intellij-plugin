package de.cofinpro.intellij.acfeplugin.referencing;

import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiPolyVariantReference;
import com.intellij.psi.ResolveResult;
import com.intellij.psi.util.PsiTreeUtil;
import com.intellij.util.IncorrectOperationException;
import de.cofinpro.intellij.acfeplugin.psi.FormulaEngineFunctionDefinition;
import de.cofinpro.intellij.acfeplugin.psi.FormulaEngineIdentifierLiteral;
import de.cofinpro.intellij.acfeplugin.psi.FormulaEngineLeafExpression;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class FormulaEngineLeafExpressionReference extends FormulaEngineReference implements PsiPolyVariantReference {
    private final FormulaEngineLeafExpression leafExpression;

    public FormulaEngineLeafExpressionReference(@NotNull FormulaEngineLeafExpression element) {
        super(element);
        this.leafExpression = element;
    }

    @Nullable
    @Override
    public PsiElement resolve() {
        if (leafExpression.getIdentifier() != null) {
            String identifierName = leafExpression.getIdentifier().getText();
            return findFirstDeclarationWalkingUp(identifierName, leafExpression).orElse(null);
        }

        return null;
    }

    @NotNull
    @Override
    public ResolveResult[] multiResolve(boolean incompleteCode) {
        return new ResolveResult[0];
    }

    @Override
    public PsiElement handleElementRename(@NotNull String newElementName) throws IncorrectOperationException {
        return handleElementRename(leafExpression.getIdentifier(), newElementName);
    }
}
