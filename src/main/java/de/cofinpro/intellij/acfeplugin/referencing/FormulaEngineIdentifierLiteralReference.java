package de.cofinpro.intellij.acfeplugin.referencing;

import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiPolyVariantReference;
import com.intellij.psi.ResolveResult;
import com.intellij.psi.util.PsiTreeUtil;
import de.cofinpro.intellij.acfeplugin.psi.FormulaEngineFunctionDefinition;
import de.cofinpro.intellij.acfeplugin.psi.FormulaEngineIdentifierLiteral;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class FormulaEngineIdentifierLiteralReference extends FormulaEngineReference implements PsiPolyVariantReference {
    private final PsiElement identifierLiteral;

    public FormulaEngineIdentifierLiteralReference(@NotNull PsiElement element) {
        super(element);
        this.identifierLiteral = element;
    }

    @Nullable
    @Override
    public PsiElement resolve() {
        String identifierName = null;
        if (identifierLiteral instanceof FormulaEngineIdentifierLiteral) {
            identifierName = ((FormulaEngineIdentifierLiteral) identifierLiteral).getIdentifier().getText();
        }
        FormulaEngineFunctionDefinition surroundingFunction = PsiTreeUtil.getParentOfType(identifierLiteral, FormulaEngineFunctionDefinition.class);

        return null;
    }

    @NotNull
    @Override
    public ResolveResult[] multiResolve(boolean incompleteCode) {
        return new ResolveResult[0];
    }
}
