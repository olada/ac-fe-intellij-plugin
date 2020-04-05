package de.cofinpro.intellij.acfeplugin.structureview;

import com.intellij.ide.structureView.StructureViewTreeElement;
import com.intellij.ide.util.treeView.smartTree.TreeElement;
import com.intellij.navigation.ItemPresentation;
import com.intellij.navigation.NavigationItem;
import com.intellij.pom.Navigatable;
import com.intellij.psi.PsiElement;
import com.intellij.util.PlatformIcons;
import de.cofinpro.intellij.acfeplugin.FormulaEngineFile;
import de.cofinpro.intellij.acfeplugin.FormulaEngineFileType;
import de.cofinpro.intellij.acfeplugin.psi.FormulaEngineDeclaration;
import de.cofinpro.intellij.acfeplugin.psi.FormulaEngineFunctionDefinition;
import de.cofinpro.intellij.acfeplugin.psi.FormulaEngineNameIdentifierOwner;
import de.cofinpro.intellij.acfeplugin.psi.FormulaEnginePsiPresentationTextCreator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;
import java.util.Collection;
import java.util.List;

public class FormulaEngineStructureViewElement implements ItemPresentation, StructureViewTreeElement, NavigationItem {
    private static final FormulaEnginePsiPresentationTextCreator psiPresenter = new FormulaEnginePsiPresentationTextCreator();

    private final PsiElement psiElement;

    public FormulaEngineStructureViewElement(PsiElement psiElement) {
        this.psiElement = psiElement;
    }

    @Override
    public Object getValue() {
        return psiElement;
    }

    @Nullable
    @Override
    public String getName() {
        return psiElement instanceof FormulaEngineNameIdentifierOwner ? ((FormulaEngineNameIdentifierOwner) psiElement).getName() : null;
    }

    @NotNull
    @Override
    public ItemPresentation getPresentation() {
        return this;
    }

    @NotNull
    @Override
    public TreeElement[] getChildren() {
        if (psiElement instanceof FormulaEngineFile) {
            Collection<PsiElement> topLevelItems = ((FormulaEngineFile) psiElement).getTopLevelElements();
            return topLevelItems.stream().map(FormulaEngineStructureViewElement::new).toArray(TreeElement[]::new);
        } else if (psiElement instanceof FormulaEngineFunctionDefinition) {
            List<FormulaEngineFunctionDefinition> innerFunctionDefinitions = ((FormulaEngineFunctionDefinition) psiElement).getInnerFunctionDefinitions();
            return innerFunctionDefinitions.stream().map(FormulaEngineStructureViewElement::new).toArray(TreeElement[]::new);
        }
        return EMPTY_ARRAY;
    }

    @Override
    public void navigate(boolean requestFocus) {
        ((Navigatable) psiElement).navigate(requestFocus);
    }

    @Override
    public boolean canNavigate() {
        return ((Navigatable) psiElement).canNavigate();
    }

    @Override
    public boolean canNavigateToSource() {
        return ((Navigatable) psiElement).canNavigateToSource();
    }

    @Nullable
    @Override
    public String getPresentableText() {
        if (!psiElement.isValid()) {
            return null;
        }
        if (psiElement instanceof FormulaEngineFile) {
            return ((FormulaEngineFile) psiElement).getName();
        }
        if (psiElement instanceof FormulaEngineFunctionDefinition) {
            return psiPresenter.createTextFor((FormulaEngineFunctionDefinition) psiElement);
        }
        if (psiElement instanceof FormulaEngineDeclaration) {
            return psiPresenter.createTextFor((FormulaEngineDeclaration) psiElement);
        }
        return null;
    }

    @Nullable
    @Override
    public String getLocationString() {
        return null;
    }

    @Nullable
    @Override
    public Icon getIcon(boolean unused) {
        if (!psiElement.isValid()) {
            return null;
        }
        else if (psiElement instanceof FormulaEngineFile) {
            return FormulaEngineFileType.INSTANCE.getIcon();
        }
        else if (psiElement instanceof FormulaEngineFunctionDefinition) {
            return PlatformIcons.METHOD_ICON;
        } else if (psiElement instanceof FormulaEngineDeclaration) {
            return PlatformIcons.VARIABLE_ICON;
        }
        return null;
    }

    public boolean isFunctionDefinition() {
        return psiElement instanceof FormulaEngineFunctionDefinition;
    }

    public boolean isDeclaration() {
        return psiElement instanceof FormulaEngineDeclaration;
    }
}
