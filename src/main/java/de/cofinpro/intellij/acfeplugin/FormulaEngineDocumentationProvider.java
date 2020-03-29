package de.cofinpro.intellij.acfeplugin;

import com.intellij.lang.documentation.DocumentationProvider;
import com.intellij.psi.PsiElement;
import de.cofinpro.intellij.acfeplugin.psi.FormulaEngineFunctionDefinition;
import de.cofinpro.intellij.acfeplugin.psi.FormulaEnginePsiPresentationTextCreator;
import org.jetbrains.annotations.Nullable;

public class FormulaEngineDocumentationProvider implements DocumentationProvider {
    private static final FormulaEnginePsiPresentationTextCreator psiPresentationTextCreator = new FormulaEnginePsiPresentationTextCreator();

    @Nullable
    @Override
    public String getQuickNavigateInfo(PsiElement element, PsiElement originalElement) {
        if (element instanceof FormulaEngineFunctionDefinition) {
            FormulaEngineFunctionDefinition functionDefinition = (FormulaEngineFunctionDefinition) element;
            String functionHeader = psiPresentationTextCreator.createTextFor(functionDefinition);
            String fileName = functionDefinition.getContainingFile().getVirtualFile().getName();
            return functionHeader + " in " + fileName;
        }

        return null;
    }

    /**
     * Called when
     * @param element
     * @param originalElement
     * @return
     */
    @Nullable
    @Override
    public String generateDoc(PsiElement element, @Nullable PsiElement originalElement) {
        return "EEE";
    }
}
