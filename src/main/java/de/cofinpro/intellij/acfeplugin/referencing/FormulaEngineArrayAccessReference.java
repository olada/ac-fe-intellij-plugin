package de.cofinpro.intellij.acfeplugin.referencing;

import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import com.intellij.psi.util.PsiTreeUtil;
import de.cofinpro.intellij.acfeplugin.psi.*;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

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
            return findFirstDeclarationWalkingUp(identifierName, arrayAccess).orElse(null);
        }
        return null;
    }

    private Optional<PsiElement> findFirstDeclarationWalkingUp(@NotNull String identifierToSearch, PsiElement currentElement) {
        if (currentElement instanceof PsiFile) {
            return Optional.empty();
        }

        PsiElement parent = currentElement.getParent();
        PsiElement[] elementsInParent = null;
        if (parent instanceof FormulaEngineControlStructureBody
                || parent instanceof FormulaEngineFunctionBody
                || parent instanceof PsiFile) {
            elementsInParent = PsiTreeUtil.getChildrenOfType(parent, FormulaEngineStatement.class);
        } else if (parent instanceof FormulaEngineFunctionDefinition) {
            FormulaEngineFunctionParameters functionParameters = ((FormulaEngineFunctionDefinition) parent).getFunctionParameters();
            if (functionParameters != null) {
                elementsInParent = functionParameters.getFunctionParameterList().toArray(new PsiElement[0]);
            }
        }

        if (elementsInParent != null) {
            for (PsiElement element : elementsInParent) {
                if (element instanceof FormulaEngineStatement) {
                    FormulaEngineStatement statement = (FormulaEngineStatement) element;
                    if (statement.isDeclaration()) {
                        FormulaEngineDeclaration declaration = statement.getDeclaration();
                        if (declaration.getName() != null && declaration.getName().equals(identifierToSearch)) {
                            return Optional.of(declaration);
                        }
                    }
                } else if (element instanceof FormulaEngineFunctionParameter) {
                    FormulaEngineFunctionParameter functionParameter = (FormulaEngineFunctionParameter) element;
                    if (functionParameter.getName() != null && functionParameter.getName().equals(identifierToSearch)) {
                        return Optional.of(functionParameter);
                    }
                }
            }
        }

        return findFirstDeclarationWalkingUp(identifierToSearch, parent);
    }
}
