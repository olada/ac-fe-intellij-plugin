package de.cofinpro.intellij.acfeplugin.psi;

import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiReference;
import com.intellij.psi.impl.source.tree.LeafPsiElement;
import com.intellij.psi.util.PsiTreeUtil;
import de.cofinpro.intellij.acfeplugin.psi.stub.FunctionDefinitionStub;
import de.cofinpro.intellij.acfeplugin.referencing.FormulaEngineArrayAccessReference;
import de.cofinpro.intellij.acfeplugin.referencing.FormulaEngineFunctionReference;
import de.cofinpro.intellij.acfeplugin.referencing.FormulaEngineIdentifierLiteralReference;
import de.cofinpro.intellij.acfeplugin.referencing.FormulaEngineLeafExpressionReference;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Contains util functions which can be injected into PSI implementations via grammar kit.
 */
public class FormulaEnginePsiImplUtil {
    private FormulaEnginePsiImplUtil() {}

    public static List<FormulaEngineFunctionDefinition> getInnerFunctionDefinitions(FormulaEngineFunctionDefinition functionDefinition) {
        FunctionDefinitionStub stub = functionDefinition.getStub();
        if (stub != null) {
            if (stub.hasInnerFunctionDefinitions()) {
                return getFunctionDefinitions(functionDefinition);
            } else {
                return Collections.emptyList();
            }
        } else {
            return getFunctionDefinitions(functionDefinition);
        }
    }

    private static List<FormulaEngineFunctionDefinition> getFunctionDefinitions(FormulaEngineFunctionDefinition functionDefinition) {
        if (!functionDefinition.getFunctionBody().getStatementList().isEmpty()) {
            List<FormulaEngineStatement> statements = functionDefinition.getFunctionBody().getStatementList();
            return statements.stream()
                    .filter(statement -> statement.getFunctionDefinition() != null)
                    .map(FormulaEngineStatement::getFunctionDefinition)
                    .collect(Collectors.toList());
        }
        return Collections.emptyList();
    }

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
        return setName(functionDefinition.getIdentifier(), name);
    }

    /**
     * Called, when the rename refactoring action is invoked on a declaration (or a reference).
     * @param declaration the declaration which the operation is applied to
     * @param name new name
     * @return new element
     */
    public static PsiElement setName(FormulaEngineDeclaration declaration, String name) {
        return setName(declaration.getIdentifierLiteral().getIdentifier(), name);
    }

    /**
     * Called, when the rename refactoring action is invoked on a function parameter (or a reference).
     * @param parameter the function definition which the operation is applied to
     * @param name new name
     * @return new element
     */
    public static PsiElement setName(FormulaEngineFunctionParameter parameter, String name) {
        return setName(parameter.getIdentifierLiteral().getIdentifier(), name);
    }

    private static PsiElement setName(PsiElement e, String name) {
        LeafPsiElement identifier = (LeafPsiElement) e;
        return (LeafPsiElement) identifier.replaceWithText(name);
    }
}
