package de.cofinpro.intellij.acfeplugin.psi.stub;

import com.intellij.psi.stubs.NamedStub;
import de.cofinpro.intellij.acfeplugin.psi.FormulaEngineDeclaration;
import de.cofinpro.intellij.acfeplugin.psi.FormulaEngineFunctionDefinition;

public interface DeclarationStub extends NamedStub<FormulaEngineDeclaration> {
    boolean isToplevel();
    boolean isGlobalDeclaration();
}
