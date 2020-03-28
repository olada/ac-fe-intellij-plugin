package de.cofinpro.intellij.acfeplugin.psi.stub2;

import com.intellij.psi.stubs.IStubElementType;
import com.intellij.psi.stubs.NamedStubBase;
import com.intellij.psi.stubs.StubElement;
import com.intellij.util.io.StringRef;
import de.cofinpro.intellij.acfeplugin.psi.FormulaEngineFunctionDefinition;

public class FunctionDefinitionStubImpl extends NamedStubBase<FormulaEngineFunctionDefinition> implements FunctionDefinitionStub {
    protected FunctionDefinitionStubImpl(StubElement parent, IStubElementType elementType, String name) {
        super(parent, elementType, name);
    }

    public FunctionDefinitionStubImpl(StubElement parentStub, FunctionDefinitionElementType functionDefinition, StringRef stringRef) {
        super(parentStub, functionDefinition, stringRef);
    }
}
