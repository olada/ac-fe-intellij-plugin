package de.cofinpro.intellij.acfeplugin.referencing;

import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import com.intellij.psi.util.PsiTreeUtil;
import de.cofinpro.intellij.acfeplugin.psi.FormulaEngineArrayAccess;
import de.cofinpro.intellij.acfeplugin.psi.FormulaEngineDeclaration;
import de.cofinpro.intellij.acfeplugin.psi.FormulaEngineStatement;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Arrays;
import java.util.Optional;

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
            return walkUp(identifierName, arrayAccess).orElse(null);
        }
        return null;
    }

    private Optional<PsiElement> walkUp(@NotNull String identifierToSearch, PsiElement currentElement) {
        if (currentElement instanceof PsiFile) {
            return Optional.empty();
        }

        PsiElement parent = currentElement.getParent();
        FormulaEngineStatement[] statementsInParent = PsiTreeUtil.getChildrenOfType(parent, FormulaEngineStatement.class);

        if (statementsInParent != null) {
            for (FormulaEngineStatement statement : statementsInParent) {
                if (statement.isDeclaration()) {
                    FormulaEngineDeclaration declaration = statement.getDeclaration();
                    if (declaration.getName() != null && declaration.getName().equals(identifierToSearch)) {
                        return Optional.of(declaration);
                    }
                }
            }
        }

        return walkUp(identifierToSearch, parent);
    }
}
