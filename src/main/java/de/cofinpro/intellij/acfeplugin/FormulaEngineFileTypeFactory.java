package de.cofinpro.intellij.acfeplugin;

import com.intellij.openapi.fileTypes.FileTypeConsumer;
import com.intellij.openapi.fileTypes.FileTypeFactory;
import org.jetbrains.annotations.NotNull;

/**
 * Created by David Olah on 29.07.2018.
 */
public class FormulaEngineFileTypeFactory extends FileTypeFactory {
    @Override
    public void createFileTypes(@NotNull FileTypeConsumer consumer) {
        consumer.consume(FormulaEngineFileType.INSTANCE);
    }
}
