package de.cofinpro.intellij.acfeplugin;

import com.intellij.lang.Language;
import com.intellij.psi.tree.IStubFileElementType;

public class FormulaEngineFileElementType extends IStubFileElementType<FormulaEngineFileStub> {
    private static final int STUB_VERSION = 1;
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
}
