package de.cofinpro.intellij.acfeplugin.psi.stub2;

import com.intellij.psi.stubs.*;
import org.jetbrains.annotations.NotNull;

import java.io.IOException;

public class FunctionDefinitionElementType extends ElementTypeBase<FunctionDefinitionStub, FunctionDefinition> {
    public FunctionDefinitionElementType() {
        super("FUNCTION_DEFINITION");
    }

    @Override
    public FunctionDefinition createPsi(@NotNull FunctionDefinitionStub stub) {
        return null;
    }

    @NotNull
    @Override
    public FunctionDefinitionStub createStub(@NotNull FunctionDefinition psi, StubElement parentStub) {
        return null;
    }

    @Override
    public void serialize(@NotNull FunctionDefinitionStub stub, @NotNull StubOutputStream dataStream) throws IOException {

    }

    @NotNull
    @Override
    public FunctionDefinitionStub deserialize(@NotNull StubInputStream dataStream, StubElement parentStub) throws IOException {
        return null;
    }
}
