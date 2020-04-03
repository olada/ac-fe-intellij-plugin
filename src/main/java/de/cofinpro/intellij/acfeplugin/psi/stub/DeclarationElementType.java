package de.cofinpro.intellij.acfeplugin.psi.stub;

import com.intellij.psi.stubs.IndexSink;
import com.intellij.psi.stubs.StubElement;
import com.intellij.psi.stubs.StubInputStream;
import com.intellij.psi.stubs.StubOutputStream;
import com.intellij.util.io.StringRef;
import de.cofinpro.intellij.acfeplugin.psi.FormulaEngineDeclaration;
import de.cofinpro.intellij.acfeplugin.psi.FormulaEngineFunctionDefinition;
import de.cofinpro.intellij.acfeplugin.psi.impl.FormulaEngineDeclarationImpl;
import de.cofinpro.intellij.acfeplugin.psi.impl.FormulaEngineFunctionDefinitionImpl;
import org.jetbrains.annotations.NotNull;

import java.io.IOException;

public class DeclarationElementType extends ElementTypeBase<DeclarationStub, FormulaEngineDeclaration> {

    public DeclarationElementType(String debugName) {
        super(debugName);
    }

    @Override
    public FormulaEngineDeclaration createPsi(@NotNull DeclarationStub stub) {
        return new FormulaEngineDeclarationImpl(stub, FormulaEngineStubElementTypes.DECLARATION);
    }

    @NotNull
    @Override
    public DeclarationStub createStub(@NotNull FormulaEngineDeclaration declaration, StubElement parentStub) {
        return new DeclarationStubImpl(parentStub, FormulaEngineStubElementTypes.DECLARATION, declaration);
    }

    @Override
    public void serialize(@NotNull DeclarationStub stub, @NotNull StubOutputStream dataStream) throws IOException {
        dataStream.writeName(stub.getName());
        dataStream.writeBoolean(stub.isToplevel());
        dataStream.writeBoolean(stub.isGlobalDeclaration());
    }

    @NotNull
    @Override
    public DeclarationStub deserialize(@NotNull StubInputStream dataStream, StubElement parentStub) throws IOException {
        StringRef stringRef = dataStream.readName();
        boolean topLevel = dataStream.readBoolean();
        boolean global = dataStream.readBoolean();
        return new DeclarationStubImpl(parentStub, FormulaEngineStubElementTypes.DECLARATION, stringRef, topLevel, global);
    }

    @Override
    public void indexStub(@NotNull DeclarationStub stub, @NotNull IndexSink sink) {
        if ((stub.isToplevel() || stub.isGlobalDeclaration()) && stub.getName() != null) {
            sink.occurrence(DeclarationStubIndex.KEY, stub.getName());
        }
    }
}
