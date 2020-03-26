package de.cofinpro.intellij.acfeplugin.psi.stub2;

import com.intellij.psi.stubs.IStubElementType;
import com.intellij.psi.stubs.StubBase;
import com.intellij.psi.stubs.StubElement;
import de.cofinpro.intellij.acfeplugin.psi.FormulaEngineFunctionDefinition;

public class FunctionDefinitionStubImpl extends StubBase<FormulaEngineFunctionDefinition> implements FunctionDefinitionStub {
    private String name;

    protected FunctionDefinitionStubImpl(StubElement parent, IStubElementType elementType) {
        super(parent, elementType);
    }

    @Override
    public String getName() {
        return name;
    }
}
