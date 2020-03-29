package de.cofinpro.intellij.acfeplugin.psi;

import com.intellij.psi.PsiReference;
import de.cofinpro.intellij.acfeplugin.psi.stub2.FunctionDefinitionStub;
import de.cofinpro.intellij.acfeplugin.referencing.FormulaEngineFunctionReference;
import de.cofinpro.intellij.acfeplugin.referencing.FormulaEngineArrayAccessReference;
import de.cofinpro.intellij.acfeplugin.referencing.FormulaEngineSelfReference;

/**
 * Contains util functions which can be injected into PSI implementations via grammar kit.
 */
public class FormulaEnginePsiImplUtil {
    private FormulaEnginePsiImplUtil() {}

    public static String getIdentifierName(FormulaEngineFunctionDefinition functionDefinition) {
        FunctionDefinitionStub stub = functionDefinition.getStub();
        if (stub != null) {
            return stub.getName();
        } else {
            return functionDefinition.getIdentifier().getText();
        }
    }

    public static PsiReference getReference(FormulaEngineFunctionInvocation functionInvocation) {
        return new FormulaEngineFunctionReference(functionInvocation);
    }

    public static PsiReference getReference(FormulaEngineFunctionDefinition functionDefinition) {
        return new FormulaEngineSelfReference(functionDefinition);
    }


    public static PsiReference getReference(FormulaEngineArrayAccess arrayAccess) {
        return new FormulaEngineArrayAccessReference(arrayAccess);
    }

    public static int getTextOffset(FormulaEngineFunctionDefinition functionDefinition) {
        return functionDefinition.getIdentifier().getTextOffset();
    }
}
