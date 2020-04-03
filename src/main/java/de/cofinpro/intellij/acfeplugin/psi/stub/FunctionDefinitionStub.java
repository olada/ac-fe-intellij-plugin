package de.cofinpro.intellij.acfeplugin.psi.stub;

import com.intellij.psi.stubs.NamedStub;
import de.cofinpro.intellij.acfeplugin.psi.FormulaEngineFunctionDefinition;

/**
 * Stub interface for {@link FormulaEngineFunctionDefinition}.
 */
public interface FunctionDefinitionStub extends NamedStub<FormulaEngineFunctionDefinition> {
    // no interface methods for now because getName() is in parent interface.
}
