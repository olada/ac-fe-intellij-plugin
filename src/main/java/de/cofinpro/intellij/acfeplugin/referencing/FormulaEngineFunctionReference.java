package de.cofinpro.intellij.acfeplugin.referencing;

import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import com.intellij.psi.PsiPolyVariantReference;
import com.intellij.psi.ResolveResult;
import com.intellij.psi.search.ProjectScope;
import com.intellij.psi.stubs.StubIndex;
import de.cofinpro.intellij.acfeplugin.psi.FormulaEngineFunctionDefinition;
import de.cofinpro.intellij.acfeplugin.psi.FormulaEngineFunctionInvocation;
import de.cofinpro.intellij.acfeplugin.psi.stub.FunctionDefinitionsStubIndex;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Collection;
import java.util.Optional;

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
            Collection<FormulaEngineFunctionDefinition> functionDefinitions = StubIndex.getElements(FunctionDefinitionsStubIndex.KEY, customFunctionName, root.getProject(), ProjectScope.getAllScope(root.getProject()), FormulaEngineFunctionDefinition.class);
            Optional<FormulaEngineFunctionDefinition> foundFunctionDefinition = functionDefinitions.stream().filter(functionDefinition -> customFunctionName.equals(functionDefinition.getName())).findFirst();
            return foundFunctionDefinition.orElse(null);
        }

        return null;
    }
}
