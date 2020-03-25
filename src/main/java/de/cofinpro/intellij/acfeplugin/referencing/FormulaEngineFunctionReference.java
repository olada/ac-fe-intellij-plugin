package de.cofinpro.intellij.acfeplugin.referencing;

import com.intellij.openapi.util.TextRange;
import com.intellij.psi.*;
import com.intellij.psi.util.PsiTreeUtil;
import de.cofinpro.intellij.acfeplugin.psi.FormulaEngineFunctionDefinition;
import de.cofinpro.intellij.acfeplugin.psi.FormulaEngineFunctionInvocation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Collection;
import java.util.Optional;

// TODO: Performance Optimization (limit PsiTree walks by caching / indexing)
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
                functionInvocation.getCustomFunctionName() != null) {
            String customFunctionName = functionInvocation.getCustomFunctionName().getIdentifier().getText();
            PsiFile root = functionInvocation.getContainingFile();
            Collection<FormulaEngineFunctionDefinition> functionDefinitions = PsiTreeUtil.findChildrenOfType(root, FormulaEngineFunctionDefinition.class);
            Optional<FormulaEngineFunctionDefinition> foundFunctionDefinition = functionDefinitions.stream().filter(functionDefinition -> functionDefinition.getIdentifier().getText().equals(customFunctionName)).findFirst();
            return foundFunctionDefinition.orElse(null);
        }

        return null;
    }

    @NotNull
    @Override
    public Object[] getVariants() {
        return new Object[0];
    }

    @Override
    public boolean isReferenceTo(@NotNull PsiElement element) {
        return false;
    }
}
