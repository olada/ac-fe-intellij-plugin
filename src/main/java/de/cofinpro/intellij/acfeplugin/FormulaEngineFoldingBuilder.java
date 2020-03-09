package de.cofinpro.intellij.acfeplugin;

import com.intellij.lang.ASTNode;
import com.intellij.lang.folding.CustomFoldingBuilder;
import com.intellij.lang.folding.FoldingDescriptor;
import com.intellij.openapi.editor.Document;
import com.intellij.openapi.project.DumbAware;
import com.intellij.openapi.util.TextRange;
import com.intellij.psi.PsiElement;
import com.intellij.psi.tree.IElementType;
import com.intellij.psi.util.PsiTreeUtil;
import de.cofinpro.intellij.acfeplugin.psi.*;
import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import static de.cofinpro.intellij.acfeplugin.psi.FormulaEngineElementTypes.*;

/**
 * Responsible for dealing with folding regions.
 */
public class FormulaEngineFoldingBuilder extends CustomFoldingBuilder implements DumbAware {

    private static final List<IElementType> CURLY_BRACE_FOLDING_ELEMENTS = Arrays.asList(
        FUNCTION_DEFINITION, FOR, WHILE, DO_WHILE, IF, SWITCH
    );

    @Override
    protected void buildLanguageFoldRegions(@NotNull List<FoldingDescriptor> descriptors, @NotNull PsiElement root, @NotNull Document document, boolean quick) {
        buildFoldRegionForElementWithCurlyBraces(descriptors, root, FormulaEngineFunctionDefinition.class);
        buildFoldRegionForElementWithCurlyBraces(descriptors, root, FormulaEngineFor.class);
        buildFoldRegionForElementWithCurlyBraces(descriptors, root, FormulaEngineWhile.class);
        buildFoldRegionForElementWithCurlyBraces(descriptors, root, FormulaEngineDoWhile.class);
        buildFoldRegionForElementWithCurlyBraces(descriptors, root, FormulaEngineIf.class);
        buildFoldRegionForElementWithCurlyBraces(descriptors, root, FormulaEngineSwitch.class);
    }

    private void buildFoldRegionForElementWithCurlyBraces (List<FoldingDescriptor> descriptors, PsiElement root, Class<? extends PsiElement> structure) {
        Collection<PsiElement> elements = PsiTreeUtil.findChildrenOfType(root, structure);
        for (final PsiElement element : elements) {
            // Region folding for elements with curly braces should fold the content of the outer-most curly braces.
            // The actual element definition (e.g. function name and parameters) should be printed regularly (similar to java method folding)
            int offsetStart = element.getTextRange().getStartOffset() + element.getText().indexOf('{');
            int offsetEnd = element.getTextRange().getEndOffset() - (element.getText().length() - element.getText().lastIndexOf('}')) + 1;
            TextRange textRange = new TextRange(offsetStart, offsetEnd);
            FoldingDescriptor descriptor = new FoldingDescriptor(element.getNode(), textRange);
            descriptors.add(descriptor);
        }
    }

    @Override
    protected String getLanguagePlaceholderText(@NotNull ASTNode node, @NotNull TextRange range) {
        if (CURLY_BRACE_FOLDING_ELEMENTS.contains(node.getElementType())) {
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
