package de.cofinpro.intellij.acfeplugin.referencing;

import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import com.intellij.psi.PsiPolyVariantReference;
import com.intellij.psi.ResolveResult;
import com.intellij.psi.search.ProjectScope;
import com.intellij.psi.stubs.StubIndex;
import com.intellij.psi.util.PsiTreeUtil;
import com.intellij.util.IncorrectOperationException;
import de.cofinpro.intellij.acfeplugin.psi.FormulaEngineFunctionBody;
import de.cofinpro.intellij.acfeplugin.psi.FormulaEngineFunctionDefinition;
import de.cofinpro.intellij.acfeplugin.psi.FormulaEngineFunctionInvocation;
import de.cofinpro.intellij.acfeplugin.psi.stub.FunctionDefinitionsStubIndex;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Resolves a function invocation to its function definition.
 * For custom invocations, the tree is walked up until the file is reached.
 * If no local function definition is found, the function will be resolved
 * using the stub index {@link de.cofinpro.intellij.acfeplugin.psi.stub.FunctionDefinitionsStubIndex}.
 */
public class FormulaEngineFunctionReference extends FormulaEngineReference implements PsiPolyVariantReference {
    private final FormulaEngineFunctionInvocation functionInvocation;

    public FormulaEngineFunctionReference(@NotNull PsiElement element) {
        super(element);

        if (element instanceof FormulaEngineFunctionInvocation) {
            functionInvocation = (FormulaEngineFunctionInvocation) element;
        } else {
            functionInvocation = null;
        }
    }

    @NotNull
    @Override
    public ResolveResult[] multiResolve(boolean incompleteCode) {
        return new ResolveResult[0];
    }

    @Nullable
    @Override
    public PsiElement resolve() {
        if (functionInvocation != null &&
                functionInvocation.isCustomFunction()) {
            String customFunctionName = functionInvocation.getIdentifier().getText();
            PsiFile root = functionInvocation.getContainingFile();

            AtomicReference<FormulaEngineFunctionDefinition> foundLocalFunctionDefinition = new AtomicReference<>(null);
            PsiTreeUtil.treeWalkUp(functionInvocation, root, (parentElement, childElement) -> {
                if (parentElement instanceof FormulaEngineFunctionDefinition) {
                    List<FormulaEngineFunctionDefinition> innerFunctionDefinitions = ((FormulaEngineFunctionDefinition) parentElement).getInnerFunctionDefinitions();
                    Optional<FormulaEngineFunctionDefinition> first = innerFunctionDefinitions.stream().filter(functionDefinition -> customFunctionName.equals(functionDefinition.getName())).findFirst();
                    if (first.isPresent()) {
                        foundLocalFunctionDefinition.set(first.get());
                        return false; // abort tree walking
                    } else {
                        return true; // keep tree walking
                    }
                }
                return true;
            });
            // Did not find function locally - let's check the index which contains functions across files
            if (foundLocalFunctionDefinition.get() == null) {
                Collection<FormulaEngineFunctionDefinition> functionDefinitions = StubIndex.getElements(FunctionDefinitionsStubIndex.KEY, customFunctionName, root.getProject(), ProjectScope.getAllScope(root.getProject()), FormulaEngineFunctionDefinition.class);
                Optional<FormulaEngineFunctionDefinition> foundFunctionDefinition = functionDefinitions.stream().filter(functionDefinition -> customFunctionName.equals(functionDefinition.getName())).findFirst();
                return foundFunctionDefinition.orElse(null);
            } else {
                // we found the function locally
                return foundLocalFunctionDefinition.get();
            }
        }

        return null;
    }

    /**
     * Needs to be overridden to support the rename operation for references to the function definition.
     * @param newElementName new name of function definition
     * @return new element with updated name
     * @throws IncorrectOperationException (only applies if no identifier is present)
     */
    @Override
    public PsiElement handleElementRename(@NotNull String newElementName) throws IncorrectOperationException {
        return handleElementRename(functionInvocation.getIdentifier(), newElementName);
    }
}
