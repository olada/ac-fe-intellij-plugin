package de.cofinpro.intellij.acfeplugin.structureview;

import com.intellij.ide.structureView.*;
import com.intellij.lang.PsiStructureViewFactory;
import com.intellij.openapi.editor.Editor;
import com.intellij.psi.PsiFile;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Entry point for struture view.
 * Delegates the view model to {@link FormulaEngineStructureViewModel}.
 */
public class FormulaEngineStructureViewFactory implements PsiStructureViewFactory {
    @Nullable
    @Override
    public StructureViewBuilder getStructureViewBuilder(@NotNull PsiFile psiFile) {
        return new TreeBasedStructureViewBuilder() {
            @NotNull
            @Override
            public StructureViewModel createStructureViewModel(@Nullable Editor editor) {
                return new FormulaEngineStructureViewModel(psiFile, editor, new FormulaEngineStructureViewElement(psiFile));
            }

            @Override
            public boolean isRootNodeShown() {
                return true;
            }
        };
    }
}
