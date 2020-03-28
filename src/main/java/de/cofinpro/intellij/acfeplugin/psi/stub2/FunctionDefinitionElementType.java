package de.cofinpro.intellij.acfeplugin.psi.stub2;

import com.intellij.psi.stubs.IndexSink;
import com.intellij.psi.stubs.StubElement;
import com.intellij.psi.stubs.StubInputStream;
import com.intellij.psi.stubs.StubOutputStream;
import com.intellij.util.io.StringRef;
import de.cofinpro.intellij.acfeplugin.psi.FormulaEngineFunctionDefinition;
import de.cofinpro.intellij.acfeplugin.psi.impl.FormulaEngineFunctionDefinitionImpl;
import org.jetbrains.annotations.NotNull;

import java.io.IOException;

public class FunctionDefinitionElementType extends ElementTypeBase<FunctionDefinitionStub, FormulaEngineFunctionDefinition> {

    public FunctionDefinitionElementType(String debugName) {
        super(debugName);
    }

    @Override
    public FormulaEngineFunctionDefinition createPsi(@NotNull FunctionDefinitionStub stub) {
        return new FormulaEngineFunctionDefinitionImpl(stub, FormulaEngineStubElementTypes.FUNCTION_DEFINITION);
    }

    @NotNull
    @Override
    public FunctionDefinitionStub createStub(@NotNull FormulaEngineFunctionDefinition functionDefinition, StubElement parentStub) {
        return new FunctionDefinitionStubImpl(parentStub, FormulaEngineStubElementTypes.FUNCTION_DEFINITION, functionDefinition.getIdentifier().getText());
    }

    @Override
    public void serialize(@NotNull FunctionDefinitionStub stub, @NotNull StubOutputStream dataStream) throws IOException {
        dataStream.writeName(stub.getName());
    }

    @NotNull
    @Override
    public FunctionDefinitionStub deserialize(@NotNull StubInputStream dataStream, StubElement parentStub) throws IOException {
        StringRef stringRef = dataStream.readName();
        return new FunctionDefinitionStubImpl(parentStub, FormulaEngineStubElementTypes.FUNCTION_DEFINITION, stringRef);
    }

    @Override
    public void indexStub(@NotNull FunctionDefinitionStub stub, @NotNull IndexSink sink) {
        if (stub.getName() != null) {
            sink.occurrence(FunctionDefinitionsStubIndex.KEY, stub.getName());
        }
    }
}
