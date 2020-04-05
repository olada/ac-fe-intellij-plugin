package de.cofinpro.intellij.acfeplugin.psi.stub;

import com.intellij.psi.stubs.IStubElementType;
import com.intellij.psi.stubs.NamedStubBase;
import com.intellij.psi.stubs.StubElement;
import com.intellij.util.io.StringRef;
import de.cofinpro.intellij.acfeplugin.psi.FormulaEngineFunctionDefinition;

public class FunctionDefinitionStubImpl extends NamedStubBase<FormulaEngineFunctionDefinition> implements FunctionDefinitionStub {
    private final boolean hasInnerFunctions;
    private final boolean innerFunction;
    private final boolean topLevelFunction;

    protected FunctionDefinitionStubImpl(StubElement parent, IStubElementType elementType, String name, boolean hasInnerFunctions, boolean innerFunction, boolean topLevelFunction) {
        super(parent, elementType, name);
        this.hasInnerFunctions = hasInnerFunctions;
        this.innerFunction = innerFunction;
        this.topLevelFunction = topLevelFunction;
    }

    public FunctionDefinitionStubImpl(StubElement parentStub, FunctionDefinitionElementType functionDefinition, StringRef stringRef, boolean hasInnerFunctions, boolean innerFunction, boolean topLevelFunction) {
        super(parentStub, functionDefinition, stringRef);
        this.hasInnerFunctions = hasInnerFunctions;
        this.innerFunction = innerFunction;
        this.topLevelFunction = topLevelFunction;
    }

    @Override
    public boolean hasInnerFunctionDefinitions() {
        return hasInnerFunctions;
    }

    @Override
    public boolean isInnerFunction() {
        return innerFunction;
    }

    @Override
    public boolean isTopLevelFunction() {
        return topLevelFunction;
    }
}
