package de.cofinpro.intellij.acfeplugin.psi;

import com.intellij.psi.PsiReference;
import de.cofinpro.intellij.acfeplugin.psi.stub.FunctionDefinitionStub;
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

    public static String getName(FormulaEngineFunctionDefinition functionDefinition) {
        return getIdentifierName(functionDefinition);
    }

    public static PsiReference getReference(FormulaEngineFunctionInvocation functionInvocation) {
        return new FormulaEngineFunctionReference(functionInvocation);
    }

    public static PsiReference getReference(FormulaEngineArrayAccess arrayAccess) {
        return new FormulaEngineArrayAccessReference(arrayAccess);
    }

    /**
     * Returns the offset of the identifier as the function definition's offset.
     * The text offset of a function definition needs to be its identifier literal because
     * - when resolving the reference, the cursor should be places at the beginning of the identifier (not the beginning of the 'function' token)
     * - otherwise the token 'function' will be part of the function reference which would be a bit surprising
     * @param functionDefinition the function definition
     * @return the offset
     */
    public static int getTextOffset(FormulaEngineFunctionDefinition functionDefinition) {
        return functionDefinition.getIdentifier().getTextOffset();
    }

    /**
     * Returns the offset of the identifier literal as the function parameter's offset.
     * The text offset of a function parameter needs to be its identifier literal because otherwise the identifier will
     * only be underlined when hovering over the type if it is present.
     * @param functionParameter the function parameter
     * @return the offset
     */
    public static int getTextOffset(FormulaEngineFunctionParameter functionParameter) {
        return functionParameter.getIdentifierLiteral().getTextOffset();
    }
}
