package de.cofinpro.intellij.acfeplugin.psi;

import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import de.cofinpro.intellij.acfeplugin.FormulaEngineFileType;
import de.cofinpro.intellij.acfeplugin.FormulaEngineLanguage;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

/**
 * Created by David Olah on 30.07.2018.
 */
public class FormulaEngineFileBase extends PsiFileBase {
    public FormulaEngineFileBase(@NotNull FileViewProvider viewProvider) {
        super(viewProvider, FormulaEngineLanguage.INSTANCE);
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
}
