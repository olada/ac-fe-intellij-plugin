package de.cofinpro.intellij.acfeplugin.psi.stub;

import de.cofinpro.intellij.acfeplugin.psi.FormulaEngineElementTypes;

/**
 * Necessary for referencing stub element types.
 * These stub element types have to reference the identical element type from {@link FormulaEngineElementTypes} so that
 * the parser works as expected.
 */
public interface FormulaEngineStubElementTypes {
    FunctionDefinitionElementType FUNCTION_DEFINITION = (FunctionDefinitionElementType) FormulaEngineElementTypes.FUNCTION_DEFINITION;
    DeclarationElementType DECLARATION = (DeclarationElementType) FormulaEngineElementTypes.DECLARATION;
}
