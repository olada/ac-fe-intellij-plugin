package de.cofinpro.intellij.acfeplugin;

import com.intellij.lang.refactoring.RefactoringSupportProvider;
import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Allows registration and configuration of extended refactoring operations, such as
 * inline-renaming, extracting methods and many more.
 */
public class FormulaEngineRefactoringSupportProvider extends RefactoringSupportProvider {

    /**
     * Enable live renaming of elements which are renameable.
     * @param element element to rename (in larger scope - e.g. function definition)
     * @param context actual leaf element which will be renamed (e.g. identifier)
     * @return true if in-place-renameing is supported
     */
    @Override
    public boolean isMemberInplaceRenameAvailable(@NotNull PsiElement element, @Nullable PsiElement context) {
        return true;
    }
}
