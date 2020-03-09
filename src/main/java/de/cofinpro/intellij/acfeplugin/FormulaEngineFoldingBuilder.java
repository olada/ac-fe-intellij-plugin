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
import de.cofinpro.intellij.acfeplugin.psi.*;
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
        // get language structures where folding should be enabled
        Collection<PsiElement> functionDefinitions = PsiTreeUtil.findChildrenOfType(root, FormulaEngineFunctionDefinition.class);
        Collection<PsiElement> forLoops = PsiTreeUtil.findChildrenOfType(root, FormulaEngineFor.class);
        Collection<PsiElement> whileLoops = PsiTreeUtil.findChildrenOfType(root, FormulaEngineWhile.class);
        Collection<PsiElement> doWhileLoops = PsiTreeUtil.findChildrenOfType(root, FormulaEngineDoWhile.class);
        Collection<PsiElement> ifStatements = PsiTreeUtil.findChildrenOfType(root, FormulaEngineIf.class);
        Collection<PsiElement> switchStatements = PsiTreeUtil.findChildrenOfType(root, FormulaEngineSwitch.class);

        // define the folding range and descriptor (header that stays when block is folded)
        buildFoldRegionForElementWithCurlyBraces(descriptors, functionDefinitions);
        buildFoldRegionForElementWithCurlyBraces(descriptors, forLoops);
        buildFoldRegionForElementWithCurlyBraces(descriptors, whileLoops);
        buildFoldRegionForElementWithCurlyBraces(descriptors, doWhileLoops);
        buildFoldRegionForElementWithCurlyBraces(descriptors, ifStatements);
        buildFoldRegionForElementWithCurlyBraces(descriptors, switchStatements);
    }

    private void buildFoldRegionForElementWithCurlyBraces (List<FoldingDescriptor> descriptors, Collection<PsiElement> elements) {
        for (final PsiElement element : elements) {
            //LOG.debug("Found function definition '" + functionDefinition.getIdentifier() + "' for folding");

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
        if (node.getElementType() == FormulaEngineElementTypes.FUNCTION_DEFINITION
                || node.getElementType() == FormulaEngineElementTypes.FOR
                || node.getElementType() == FormulaEngineElementTypes.WHILE
                || node.getElementType() == FormulaEngineElementTypes.DO_WHILE
                || node.getElementType() == FormulaEngineElementTypes.IF
                || node.getElementType() == FormulaEngineElementTypes.SWITCH
        ) {
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
