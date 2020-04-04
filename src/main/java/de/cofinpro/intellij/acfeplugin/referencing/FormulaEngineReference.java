package de.cofinpro.intellij.acfeplugin.referencing;

import com.intellij.openapi.util.TextRange;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import com.intellij.psi.PsiReferenceBase;
import com.intellij.psi.search.ProjectScope;
import com.intellij.psi.stubs.StubIndex;
import com.intellij.psi.util.PsiTreeUtil;
import com.intellij.util.IncorrectOperationException;
import de.cofinpro.intellij.acfeplugin.psi.*;
import de.cofinpro.intellij.acfeplugin.psi.stub.DeclarationStubIndex;
import org.jetbrains.annotations.NotNull;

import java.util.Collection;
import java.util.Optional;

/**
 * Base reference class for the Formula Engine language.
 * This is primarily necessary because {@link #getRangeInElement()} needs to be overridden
 *
 * @see
 *      <a href="https://intellij-support.jetbrains.com/hc/en-us/community/posts/115000006084/comments/115000091030">
 *          Jetbrains Comment Thread
 *      </a>
 */
public abstract class FormulaEngineReference extends PsiReferenceBase<PsiElement> {
    public FormulaEngineReference(@NotNull PsiElement element) {
        /*
         * Taken from Terence Parr's comment from https://intellij-support.jetbrains.com/hc/en-us/community/posts/206751155/comments/206653549
         * WARNING: You must send the text range or you get this error:
         * "Cannot find manipulator for PsiElement(ID) in org.antlr.jetbrains.sample.SampleElementRef"...
         *  when you click on an identifier.
         */
        super(element, element.getTextRange());
    }

    /**
     * Controls which portion of an element can be used to resolve a reference.
     * This can be shown by holding down the ctrl or the command button.
     * @return text range of the element which is used for resolving
     */
    @NotNull
    @Override
    public TextRange getRangeInElement() {
        int indexOfLeftParenthesis = getElement().getText().indexOf('(');
        if (indexOfLeftParenthesis >= 0) {
            return TextRange.from(0, indexOfLeftParenthesis);
        } else {
            int indexOfLeftBracket = getElement().getText().indexOf('[');
            if (indexOfLeftBracket >= 0) {
                return TextRange.from(0, indexOfLeftBracket);
            } else {
                return TextRange.from(0, getElement().getTextLength());
            }
        }
    }

    protected Optional<? extends PsiElement> findFirstDeclarationWalkingUp(@NotNull String identifierToSearch, PsiElement currentElement) {
        if (currentElement instanceof PsiFile) {
            Collection<FormulaEngineDeclaration> elements = StubIndex.getElements(DeclarationStubIndex.KEY, identifierToSearch, currentElement.getProject(), ProjectScope.getAllScope(currentElement.getProject()), FormulaEngineDeclaration.class);
            return elements.stream().filter(declaration -> identifierToSearch.equals(declaration.getName())).findFirst();
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
