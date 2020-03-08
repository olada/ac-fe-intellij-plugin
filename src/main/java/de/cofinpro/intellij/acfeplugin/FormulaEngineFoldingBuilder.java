package de.cofinpro.intellij.acfeplugin;

import com.intellij.lang.ASTNode;
import com.intellij.lang.folding.CustomFoldingBuilder;
import com.intellij.lang.folding.FoldingDescriptor;
import com.intellij.openapi.diagnostic.Logger;
import com.intellij.openapi.editor.Document;
import com.intellij.openapi.project.DumbAware;
import com.intellij.openapi.util.TextRange;
import com.intellij.psi.PsiElement;
import com.intellij.psi.util.PsiTreeUtil;
import de.cofinpro.intellij.acfeplugin.psi.FormulaEngineElementTypes;
import de.cofinpro.intellij.acfeplugin.psi.FormulaEngineFunctionDefinition;
import org.jetbrains.annotations.NotNull;

import java.util.Collection;
import java.util.List;

/**
 * Responsible for dealing with folding regions.
 */
public class FormulaEngineFoldingBuilder extends CustomFoldingBuilder implements DumbAware {
    private static final Logger LOG = Logger.getInstance(FormulaEngineFoldingBuilder.class);

    @Override
    protected void buildLanguageFoldRegions(@NotNull List<FoldingDescriptor> descriptors, @NotNull PsiElement root, @NotNull Document document, boolean quick) {
        Collection<FormulaEngineFunctionDefinition> functionDefinitions = PsiTreeUtil.findChildrenOfType(root, FormulaEngineFunctionDefinition.class);

        for (final FormulaEngineFunctionDefinition functionDefinition : functionDefinitions) {
            LOG.debug("Found function definition '" + functionDefinition.getIdentifier() + "' for folding");

            // Region Folding for functions should fold the content of the outer-most curly braces.
            // The actual function definition (including function parameters) should be printed regularly (similar to java method folding)
            int offsetStart = functionDefinition.getTextRange().getStartOffset() + functionDefinition.getText().indexOf('{');
            int offsetEnd = functionDefinition.getTextRange().getEndOffset() - (functionDefinition.getText().length() - functionDefinition.getText().lastIndexOf('}')) + 1;
            TextRange textRange = new TextRange(offsetStart, offsetEnd);
            FoldingDescriptor descriptor = new FoldingDescriptor(functionDefinition.getNode(), textRange);
            descriptors.add(descriptor);
        }
    }

    @Override
    protected String getLanguagePlaceholderText(@NotNull ASTNode node, @NotNull TextRange range) {
        if (node.getElementType() == FormulaEngineElementTypes.FUNCTION_DEFINITION) {
            return "{ ... }";
        } else {
            return "...";
        }
    }

    @Override
    protected boolean isRegionCollapsedByDefault(@NotNull ASTNode node) {
        return false;
    }


}
