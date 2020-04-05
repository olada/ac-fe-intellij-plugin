package de.cofinpro.intellij.acfeplugin;

import com.intellij.ide.structureView.*;
import com.intellij.ide.util.treeView.smartTree.Sorter;
import com.intellij.ide.util.treeView.smartTree.TreeElement;
import com.intellij.lang.PsiStructureViewFactory;
import com.intellij.navigation.ItemPresentation;
import com.intellij.navigation.NavigationItem;
import com.intellij.openapi.editor.Editor;
import com.intellij.pom.Navigatable;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import com.intellij.util.PlatformIcons;
import de.cofinpro.intellij.acfeplugin.psi.FormulaEngineDeclaration;
import de.cofinpro.intellij.acfeplugin.psi.FormulaEngineFunctionDefinition;
import de.cofinpro.intellij.acfeplugin.psi.FormulaEngineNameIdentifierOwner;
import de.cofinpro.intellij.acfeplugin.psi.FormulaEnginePsiPresentationTextCreator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;
import java.util.Collection;

public class FormulaEngineStructureViewFactory implements PsiStructureViewFactory {
    @Nullable
    @Override
    public StructureViewBuilder getStructureViewBuilder(@NotNull PsiFile psiFile) {
        return new TreeBasedStructureViewBuilder() {
            @NotNull
            @Override
            public StructureViewModel createStructureViewModel(@Nullable Editor editor) {
                return new Model(psiFile, editor, new Element(psiFile));
            }

            @Override
            public boolean isRootNodeShown() {
                return true;
            }
        };
    }

    public static class Model extends StructureViewModelBase implements StructureViewModel.ElementInfoProvider {

        public Model(@NotNull PsiFile psiFile, @Nullable Editor editor, @NotNull StructureViewTreeElement root) {
            super(psiFile, editor, root);
            withSorters(Sorter.ALPHA_SORTER);
        }

        @Override
        public boolean isAlwaysShowsPlus(StructureViewTreeElement element) {
            return false;
        }

        @Override
        public boolean isAlwaysLeaf(StructureViewTreeElement element) {
            return false;
        }
    }

    public static class Element implements ItemPresentation, StructureViewTreeElement, NavigationItem {
        private static final FormulaEnginePsiPresentationTextCreator psiPresenter = new FormulaEnginePsiPresentationTextCreator();

        private final PsiElement psiElement;

        public Element(PsiElement psiElement) {
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
                return topLevelItems.stream().map(Element::new).toArray(TreeElement[]::new);
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
    }
}
