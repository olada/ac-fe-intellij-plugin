package de.cofinpro.intellij.acfeplugin.psi.stub2;

import com.intellij.psi.stubs.StubElement;
import de.cofinpro.intellij.acfeplugin.psi.FormulaEngineFunctionDefinition;

public interface FunctionDefinitionStub extends StubElement<FormulaEngineFunctionDefinition> {
    String getIdentifierName();
}
