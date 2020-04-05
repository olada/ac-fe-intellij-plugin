package de.cofinpro.intellij.acfeplugin.psi;

import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import com.intellij.psi.PsiElement;
import com.intellij.psi.util.CachedValue;
import com.intellij.psi.util.CachedValueProvider;
import com.intellij.psi.util.CachedValuesManager;
import com.intellij.psi.util.PsiTreeUtil;
import de.cofinpro.intellij.acfeplugin.FormulaEngineFile;
import de.cofinpro.intellij.acfeplugin.FormulaEngineFileType;
import de.cofinpro.intellij.acfeplugin.FormulaEngineLanguage;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;
import java.util.*;
import java.util.function.Supplier;
import java.util.stream.Collectors;

import static java.util.Collections.*;

/**
 * Created by David Olah on 30.07.2018.
 */
public class FormulaEngineFileImpl extends PsiFileBase implements FormulaEngineFile {
    private final CachedValue<Collection<PsiElement>> sortedTopLevelElements = createCachedValue(this::collectTopLevelElements);

    public FormulaEngineFileImpl(@NotNull FileViewProvider viewProvider) {
        super(viewProvider, FormulaEngineLanguage.INSTANCE);
    }

    @Override
    public Collection<PsiElement> getTopLevelElements() {
        return sortedTopLevelElements.getValue();
    }

    private Collection<PsiElement> collectTopLevelElements() {
        List<PsiElement> elements = PsiTreeUtil.getChildrenOfAnyType(this, FormulaEngineStatement.class).stream()
                .filter(e -> e.getFunctionDefinition() != null || e.isDeclaration())
                .map(this::mapToChildElement)
                .collect(Collectors.toList());

        return unmodifiableList(elements);
    }

    private PsiElement mapToChildElement(FormulaEngineStatement topLevelItem) {
        if (topLevelItem.getFunctionDefinition() != null) {
            return topLevelItem.getFunctionDefinition();
        } else if (topLevelItem.isDeclaration()) {
            return topLevelItem.getDeclaration();
        } else {
            throw new IllegalArgumentException("expected function definition or declaration");
        }
    }

    @NotNull
    @Override
    public FileType getFileType() {
        return FormulaEngineFileType.INSTANCE;
    }

    @Override
    public String toString() {
        return "Formula Engine File";
    }

    @Nullable
    @Override
    public Icon getIcon(int flags) {
        return super.getIcon(flags);
    }

    private <T> CachedValue<T> createCachedValue(Supplier<T> supplier) {
        return CachedValuesManager.getManager(getProject()).createCachedValue(new ValueProvider<T>() {
            @Override
            protected T computeValue() {
                return supplier.get();
            }
        }, false);
    }

    /**
     * Implementation of a {@link CachedValueProvider} which is used for {@link FormulaEngineFileImpl}.
     * @param <T>
     */
    private abstract class ValueProvider<T> implements CachedValueProvider<T> {
        @Nullable
        @Override
        public Result<T> compute() {
            return Result.create(computeValue(), FormulaEngineFileImpl.this);
        }

        protected abstract T computeValue();
    }
}
