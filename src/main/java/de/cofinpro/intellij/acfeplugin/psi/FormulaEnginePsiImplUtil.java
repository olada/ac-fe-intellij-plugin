package de.cofinpro.intellij.acfeplugin.psi;

import de.cofinpro.intellij.acfeplugin.psi.stub2.FunctionDefinitionStub;

public class FormulaEnginePsiImplUtil {
    public static String getIdentifierName(FormulaEngineFunctionDefinition functionDefinition) {
        FunctionDefinitionStub stub = functionDefinition.getStub();
        if (stub != null) {
            return stub.getIdentifierName();
        } else {
            return functionDefinition.getIdentifier().getText();
        }
    }
}
