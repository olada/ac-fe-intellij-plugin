package de.cofinpro.intellij.acfeplugin;

import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

/**
 * Created by David Olah on 29.07.2018.
 */
public class FormulaEngineFileType extends LanguageFileType {
    public static FormulaEngineFileType INSTANCE = new FormulaEngineFileType();

    private FormulaEngineFileType() {
        super(FormulaEngineLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public String getName() {
        return "Formula Engine File";
    }

    @NotNull
    @Override
    public String getDescription() {
        return "Asset Control's Formula Engine Language File";
    }

    @NotNull
    @Override
    public String getDefaultExtension() {
        return "fe";
    }

    @Nullable
    @Override
    public Icon getIcon() {
        return null;
    }
}
