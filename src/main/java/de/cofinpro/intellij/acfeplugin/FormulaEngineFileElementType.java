package de.cofinpro.intellij.acfeplugin;

import com.intellij.lang.Language;
import com.intellij.psi.PsiFile;
import com.intellij.psi.StubBuilder;
import com.intellij.psi.stubs.DefaultStubBuilder;
import com.intellij.psi.stubs.StubElement;
import com.intellij.psi.stubs.StubInputStream;
import com.intellij.psi.stubs.StubOutputStream;
import com.intellij.psi.tree.IStubFileElementType;
import org.jetbrains.annotations.NotNull;

import java.io.IOException;

public class FormulaEngineFileElementType extends IStubFileElementType<FormulaEngineFileStub> {
    private static final int STUB_VERSION = 12;
    public static final FormulaEngineFileElementType INSTANCE = new FormulaEngineFileElementType();

    private FormulaEngineFileElementType() {
        this(FormulaEngineLanguage.INSTANCE);
    }

    public FormulaEngineFileElementType(Language language) {
        super("FE_FILE", language);
    }

    @Override
    public int getStubVersion() {
        return STUB_VERSION;
    }

    /*@Override
    public StubBuilder getBuilder() {
        return new DefaultStubBuilder() {
            @Override
            protected StubElement createStubForFile(@NotNull PsiFile file) {
                if (file instanceof FormulaEngineFile) {
                    return new FormulaEngineFileStub((FormulaEngineFile) file);
                }
                return super.createStubForFile(file);
            }
        };
    }

    @Override
    public void serialize(@NotNull FormulaEngineFileStub stub, @NotNull StubOutputStream dataStream) throws IOException {
    }

    @NotNull
    @Override
    public FormulaEngineFileStub deserialize(@NotNull StubInputStream dataStream, StubElement parentStub) throws IOException {
        return new FormulaEngineFileStub(null);
    }*/

    @NotNull
    @Override
    public String getExternalId() {
        return "fe.FILE";
    }
}
