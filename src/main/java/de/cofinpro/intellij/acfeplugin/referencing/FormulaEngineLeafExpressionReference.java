package de.cofinpro.intellij.acfeplugin.referencing;

import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiPolyVariantReference;
import com.intellij.psi.ResolveResult;
import com.intellij.psi.util.PsiTreeUtil;
import de.cofinpro.intellij.acfeplugin.psi.FormulaEngineFunctionDefinition;
import de.cofinpro.intellij.acfeplugin.psi.FormulaEngineIdentifierLiteral;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class FormulaEngineLeafExpressionReference extends FormulaEngineReference implements PsiPolyVariantReference {
    private final PsiElement leafExpression;

    public FormulaEngineLeafExpressionReference(@NotNull PsiElement element) {
        super(element);
        this.leafExpression = element;
    }

    @Nullable
    @Override
    public PsiElement resolve() {
        String identifierName = null;
        if (leafExpression instanceof FormulaEngineIdentifierLiteral) {
            identifierName = ((FormulaEngineIdentifierLiteral) leafExpression).getIdentifier().getText();
        }
        FormulaEngineFunctionDefinition surroundingFunction = PsiTreeUtil.getParentOfType(leafExpression, FormulaEngineFunctionDefinition.class);

        return null;
    }

    @NotNull
    @Override
    public ResolveResult[] multiResolve(boolean incompleteCode) {
        return new ResolveResult[0];
    }
}
