package de.cofinpro.intellij.acfeplugin.psi.stub;

import com.intellij.psi.stubs.StringStubIndexExtension;
import com.intellij.psi.stubs.StubIndexKey;
import de.cofinpro.intellij.acfeplugin.psi.FormulaEngineDeclaration;
import org.jetbrains.annotations.NotNull;

public class DeclarationStubIndex extends StringStubIndexExtension<FormulaEngineDeclaration> {
    public static final StubIndexKey<String, FormulaEngineDeclaration> KEY = StubIndexKey.createIndexKey("fe.stub.declarations");
    private static final int VERSION = 0;

    @NotNull
    @Override
    public StubIndexKey<String, FormulaEngineDeclaration> getKey() {
        return KEY;
    }

    @Override
    public int getVersion() {
        return super.getVersion() + VERSION;
    }
}
