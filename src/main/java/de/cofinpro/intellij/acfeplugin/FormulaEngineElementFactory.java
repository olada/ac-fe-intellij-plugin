package de.cofinpro.intellij.acfeplugin;

import com.intellij.openapi.project.Project;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFileFactory;
import de.cofinpro.intellij.acfeplugin.psi.FormulaEngineFunctionDefinition;
import org.jetbrains.annotations.NotNull;

/**
 * Responsible for creating elements of the Formula Engine language.
 */
public class FormulaEngineElementFactory {

    public static PsiElement createIdentifier(Project project, String name) {
        String functionDeclarationText = "function " + name + "() {}";
        FormulaEngineFile fileWithFunctionDeclaration = createFileFromText(project, name);
        return ((FormulaEngineFunctionDefinition) fileWithFunctionDeclaration.getFirstChild()).getIdentifier();
    }

    /**
     * Create a file from text - used for renaming elements.
     * From: https://www.jetbrains.org/intellij/sdk/docs/reference_guide/custom_language_support/rename_refactoring.html
     *  ... surprisingly, the easiest way to get the replacement node is to create a dummy file in the custom language
     *      so that it would contain the necessary node in its parse tree, build the parse tree and extract the
     *      necessary node from it.
     * Code adapted based on org.intellij.erlang.psi.impl.ErlangElementFactory and
     *  com.intellij.lang.properties.psi.PropertiesElementFactory#createPropertiesFile(com.intellij.openapi.project.Project, java.lang.String)
     * @param project current project
     * @param text text to use for creating a file
     * @return a new file based on given text in current project
     */
    @NotNull
    private static FormulaEngineFile createFileFromText(@NotNull Project project, @NotNull String text) {
        return (FormulaEngineFile) PsiFileFactory.getInstance(project).createFileFromText("dummy." + FormulaEngineFileType.INSTANCE.getDefaultExtension(), FormulaEngineFileType.INSTANCE, text);
    }
}
