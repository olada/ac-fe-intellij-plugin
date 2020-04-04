package de.cofinpro.intellij.acfeplugin.psi;

import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiReference;
import com.intellij.psi.impl.source.tree.LeafPsiElement;
import de.cofinpro.intellij.acfeplugin.psi.stub.FunctionDefinitionStub;
import de.cofinpro.intellij.acfeplugin.referencing.FormulaEngineArrayAccessReference;
import de.cofinpro.intellij.acfeplugin.referencing.FormulaEngineFunctionReference;
import de.cofinpro.intellij.acfeplugin.referencing.FormulaEngineIdentifierLiteralReference;
import de.cofinpro.intellij.acfeplugin.referencing.FormulaEngineLeafExpressionReference;

/**
 * Contains util functions which can be injected into PSI implementations via grammar kit.
 */
public class FormulaEnginePsiImplUtil {
    private FormulaEnginePsiImplUtil() {}

    public static String getName(FormulaEngineFunctionDefinition functionDefinition) {
        FunctionDefinitionStub stub = functionDefinition.getStub();
        if (stub != null) {
            return stub.getName();
        } else {
            return functionDefinition.getIdentifier().getText();
        }
    }

    public static String getName(FormulaEngineDeclaration declaration) {
        return declaration.getNameIdentifier() == null ? "" : declaration.getNameIdentifier().getText();
    }

    public static String getName(FormulaEngineFunctionParameter functionParameter) {
        return functionParameter.getNameIdentifier() == null ? "" : functionParameter.getNameIdentifier().getText();
    }

    public static PsiReference getReference(FormulaEngineFunctionInvocation functionInvocation) {
        return new FormulaEngineFunctionReference(functionInvocation);
    }

    public static PsiReference getReference(FormulaEngineArrayAccess arrayAccess) {
        return new FormulaEngineArrayAccessReference(arrayAccess);
    }

    public static PsiReference getReference(FormulaEngineLeafExpression leafExpression) {
        return new FormulaEngineLeafExpressionReference(leafExpression);
    }

    public static PsiReference getReference(FormulaEngineIdentifierLiteral identifierLiteral) {
        return new FormulaEngineIdentifierLiteralReference(identifierLiteral);
    }

    public static boolean isDeclaration(FormulaEngineStatement statement) {
        return statement.getDeclaration() != null;
    }

    public static boolean isCustomFunction(FormulaEngineFunctionInvocation functionInvocation) {
        return functionInvocation.getBuiltInFunctionName() == null;
    }

    /**
     * Returns the offset of the identifier as the function definition's offset.
     * The text offset of a function definition needs to be its identifier literal because
     * - when resolving the reference, the cursor should be placed at the beginning of the identifier (not the beginning of the 'function' token)
     * - otherwise the token 'function' will be part of the function reference which would be a bit surprising
     * @param functionDefinition the function definition
     * @return the offset
     */
    public static int getTextOffset(FormulaEngineFunctionDefinition functionDefinition) {
        return functionDefinition.getIdentifier().getTextOffset();
    }

    /**
     * Returns the offset of the identifier as the declaration's offset so that the cursor is placed at the
     * identifier, when resolving the reference.
     * @param declaration the declaration
     * @return the offset
     */
    public static int getTextOffset(FormulaEngineDeclaration declaration) {
        return declaration.getNameIdentifier().getTextOffset();
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

    /**
     * Called, when the rename refactoring action is invoked on a function definition (or a reference).
     * @param functionDefinition the function definition which the operation is applied to
     * @param name new name
     * @return new element
     */
    public static PsiElement setName(FormulaEngineFunctionDefinition functionDefinition, String name) {
        LeafPsiElement identifier = (LeafPsiElement) functionDefinition.getIdentifier();
        return (LeafPsiElement) identifier.replaceWithText(name);
    }
}
