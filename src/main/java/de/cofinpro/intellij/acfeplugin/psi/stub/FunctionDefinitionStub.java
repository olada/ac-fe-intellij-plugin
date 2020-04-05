package de.cofinpro.intellij.acfeplugin.psi.stub;

import com.intellij.psi.stubs.NamedStub;
import de.cofinpro.intellij.acfeplugin.psi.FormulaEngineFunctionDefinition;

/**
 * Stub interface for {@link FormulaEngineFunctionDefinition}.
 */
public interface FunctionDefinitionStub extends NamedStub<FormulaEngineFunctionDefinition> {
    // no interface methods for now because getName() is in parent interface.

    boolean hasInnerFunctionDefinitions();

    /**
     * Function is an inner function if there is a {@link de.cofinpro.intellij.acfeplugin.psi.FormulaEngineFunctionBody}
     * in the parent direction.
     * @return true, if this function stub is an inner function.
     */
    boolean isInnerFunction();

    /**
     * Negation of {@link #isInnerFunction()}.
     *
     * @return true for top level functions
     */
    boolean isTopLevelFunction();
}
