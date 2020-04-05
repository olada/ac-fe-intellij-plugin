package de.cofinpro.intellij.acfeplugin.psi.stub;

import com.intellij.psi.PsiElement;
import com.intellij.psi.stubs.IndexSink;
import com.intellij.psi.stubs.StubElement;
import com.intellij.psi.stubs.StubInputStream;
import com.intellij.psi.stubs.StubOutputStream;
import com.intellij.psi.util.PsiTreeUtil;
import com.intellij.util.io.StringRef;
import de.cofinpro.intellij.acfeplugin.FormulaEngineFile;
import de.cofinpro.intellij.acfeplugin.psi.FormulaEngineFunctionDefinition;
import de.cofinpro.intellij.acfeplugin.psi.FormulaEngineStatement;
import de.cofinpro.intellij.acfeplugin.psi.impl.FormulaEngineFunctionDefinitionImpl;
import org.jetbrains.annotations.NotNull;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

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
        List<FormulaEngineStatement> statements = functionDefinition.getFunctionBody().getStatementList();
        Optional<FormulaEngineStatement> firstFunctionDefinition = statements.stream().filter(statement -> statement.getFunctionDefinition() != null).findFirst();
        boolean hasInnerFunctionDefinitions = firstFunctionDefinition.isPresent();

        // A function definition always has at least two parents
        // if it is a top level function definition, the first parent is "Statement" and the next parent is "FormulaEngineFile"
        // If it is an inner function, the first parent is again "Statement" and the next parent is "Function Body"
        PsiElement parentOfParent = functionDefinition.getParent().getParent();
        boolean isInnerFunctionDefinition = !(parentOfParent instanceof FormulaEngineFile);
        boolean isTopLevel = parentOfParent instanceof FormulaEngineFile;
        return new FunctionDefinitionStubImpl(parentStub, FormulaEngineStubElementTypes.FUNCTION_DEFINITION, functionDefinition.getIdentifier().getText(), hasInnerFunctionDefinitions, isInnerFunctionDefinition, isTopLevel);
    }

    @Override
    public void serialize(@NotNull FunctionDefinitionStub stub, @NotNull StubOutputStream dataStream) throws IOException {
        dataStream.writeName(stub.getName());
        dataStream.writeBoolean(stub.hasInnerFunctionDefinitions());
        dataStream.writeBoolean(stub.isInnerFunction());
        dataStream.writeBoolean(stub.isTopLevelFunction());
    }

    @NotNull
    @Override
    public FunctionDefinitionStub deserialize(@NotNull StubInputStream dataStream, StubElement parentStub) throws IOException {
        StringRef stringRef = dataStream.readName();
        boolean hasInnerFunctions = dataStream.readBoolean();
        boolean isInnerFunction = dataStream.readBoolean();
        boolean topLevelFunction = dataStream.readBoolean();
        return new FunctionDefinitionStubImpl(parentStub, FormulaEngineStubElementTypes.FUNCTION_DEFINITION, stringRef, hasInnerFunctions, isInnerFunction, topLevelFunction);
    }

    @Override
    public void indexStub(@NotNull FunctionDefinitionStub stub, @NotNull IndexSink sink) {
        if (stub.getName() != null && stub.isTopLevelFunction()) {
            sink.occurrence(FunctionDefinitionsStubIndex.KEY, stub.getName());
        }
    }
}
