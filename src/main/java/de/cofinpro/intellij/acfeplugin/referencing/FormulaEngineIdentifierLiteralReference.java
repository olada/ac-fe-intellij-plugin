package de.cofinpro.intellij.acfeplugin.referencing;

import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiPolyVariantReference;
import com.intellij.psi.ResolveResult;
import de.cofinpro.intellij.acfeplugin.psi.FormulaEngineIdentifierLiteral;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class FormulaEngineIdentifierLiteralReference extends FormulaEngineReference implements PsiPolyVariantReference {
    private final FormulaEngineIdentifierLiteral identifierLiteral;

    public FormulaEngineIdentifierLiteralReference(@NotNull FormulaEngineIdentifierLiteral element) {
        super(element);
        this.identifierLiteral = element;
    }

    @Nullable
    @Override
    public PsiElement resolve() {
        String identifierName = identifierLiteral.getIdentifier().getText();
        return findFirstDeclarationWalkingUp(identifierName, identifierLiteral).orElse(null);
    }

    @NotNull
    @Override
    public ResolveResult[] multiResolve(boolean incompleteCode) {
        return new ResolveResult[0];
    }
}
