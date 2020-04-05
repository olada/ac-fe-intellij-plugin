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
class ShowDeclarationsFilter implements Filter {
    @NonNls
    public static final String ID = "SHOW_DECLARATIONS";

    @Override
    public boolean isVisible(TreeElement treeNode) {
        return !((FormulaEngineStructureViewElement) treeNode).isDeclaration();
    }

    @Override
    public boolean isReverted() {
        return true;
    }

    @NotNull
    @Override
    public ActionPresentation getPresentation() {
        return new ActionPresentationData(FormulaEngineBundle.message("toggle_declarations"), null, PlatformIcons.VARIABLE_ICON);
    }

    @NotNull
    @Override
    public String getName() {
        return ID;
    }
}
