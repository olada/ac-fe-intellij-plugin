package de.cofinpro.intellij.acfeplugin.referencing;

import com.intellij.psi.PsiElement;
import com.intellij.util.IncorrectOperationException;
import de.cofinpro.intellij.acfeplugin.psi.FormulaEngineArrayAccess;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class FormulaEngineArrayAccessReference extends FormulaEngineReference {

    public FormulaEngineArrayAccessReference(FormulaEngineArrayAccess psiElement) {
        super(psiElement);
    }

    @Nullable
    @Override
    public PsiElement resolve() {
        FormulaEngineArrayAccess arrayAccess = (FormulaEngineArrayAccess) myElement;
        if (arrayAccess.getIdentifierLiteral() != null) {
            String identifierName = arrayAccess.getIdentifierLiteral().getIdentifier().getText();
            return findFirstDeclarationWalkingUp(identifierName, arrayAccess).orElse(null);
        }
        return null;
    }

    /*@Override
    public PsiElement handleElementRename(@NotNull String newElementName) throws IncorrectOperationException {
        FormulaEngineArrayAccess arrayAccess = (FormulaEngineArrayAccess) myElement;
        if (arrayAccess.getIdentifierLiteral() != null) {
            return handleElementRename(arrayAccess.getIdentifierLiteral().getIdentifier(), newElementName);
        } else {
            return super.handleElementRename(newElementName);
        }
    }*/
}
