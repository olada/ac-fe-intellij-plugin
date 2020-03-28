package de.cofinpro.intellij.acfeplugin.psi.stub2;

import com.intellij.psi.stubs.StringStubIndexExtension;
import com.intellij.psi.stubs.StubIndexKey;
import de.cofinpro.intellij.acfeplugin.psi.FormulaEngineFunctionDefinition;
import org.jetbrains.annotations.NotNull;

public class FunctionDefinitionsStubIndex extends StringStubIndexExtension<FormulaEngineFunctionDefinition> {
    public static final StubIndexKey<String, FormulaEngineFunctionDefinition> KEY = StubIndexKey.createIndexKey("fe.stub.functions");
    private static final int VERSION = 0;

    @NotNull
    @Override
    public StubIndexKey<String, FormulaEngineFunctionDefinition> getKey() {
        return KEY;
    }

    @Override
    public int getVersion() {
        return super.getVersion() + VERSION;
    }
}
