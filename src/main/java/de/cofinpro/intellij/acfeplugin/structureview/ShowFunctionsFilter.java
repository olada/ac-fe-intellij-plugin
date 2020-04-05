package de.cofinpro.intellij.acfeplugin.structureview;

import com.intellij.ide.util.treeView.smartTree.ActionPresentation;
import com.intellij.ide.util.treeView.smartTree.ActionPresentationData;
import com.intellij.ide.util.treeView.smartTree.Filter;
import com.intellij.ide.util.treeView.smartTree.TreeElement;
import com.intellij.util.PlatformIcons;
import de.cofinpro.intellij.acfeplugin.FormulaEngineBundle;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

/**
 * Allows filtering declarations in structure view.
 * By declaring this filter as "reverted", the filter is enabled by default - therefore declarations are shown
 * by default.
 */
class ShowFunctionsFilter implements Filter {
    @NonNls
    public static final String ID = "SHOW_FUNCTIONS";

    @Override
    public boolean isVisible(TreeElement treeNode) {
        return !((FormulaEngineStructureViewElement) treeNode).isFunctionDefinition();
    }

    @Override
    public boolean isReverted() {
        return true;
    }

    @NotNull
    @Override
    public ActionPresentation getPresentation() {
        return new ActionPresentationData(FormulaEngineBundle.message("toggle_functions"), null, PlatformIcons.METHOD_ICON);
    }

    @NotNull
    @Override
    public String getName() {
        return ID;
    }
}
