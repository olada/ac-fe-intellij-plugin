// This is a generated file. Not intended for manual editing.
package de.cofinpro.intellij.acfeplugin.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import de.cofinpro.intellij.acfeplugin.psi.impl.*;

public interface FormulaEngineElementTypes {

  IElementType ASSIGNMENT = new FormulaEngineElementType("ASSIGNMENT");
  IElementType FUNCTION_ARGUMENTS = new FormulaEngineElementType("FUNCTION_ARGUMENTS");
  IElementType FUNCTION_BODY = new FormulaEngineElementType("FUNCTION_BODY");
  IElementType FUNCTION_DEFINITION = new FormulaEngineElementType("FUNCTION_DEFINITION");
  IElementType FUNCTION_INVOCATION = new FormulaEngineElementType("FUNCTION_INVOCATION");
  IElementType FUNCTION_PARAMETER = new FormulaEngineElementType("FUNCTION_PARAMETER");
  IElementType FUNCTION_PARAMETERS = new FormulaEngineElementType("FUNCTION_PARAMETERS");
  IElementType RETURN_STATEMENT = new FormulaEngineElementType("RETURN_STATEMENT");
  IElementType STATEMENT = new FormulaEngineElementType("STATEMENT");
  IElementType TYPE_PREFIX = new FormulaEngineElementType("TYPE_PREFIX");
  IElementType VISIBILITY_PREFIX = new FormulaEngineElementType("VISIBILITY_PREFIX");

  IElementType ANY = new FormulaEngineTokenType("any");
  IElementType BLOCK_COMMENT = new FormulaEngineTokenType("BLOCK_COMMENT");
  IElementType DICT = new FormulaEngineTokenType("dict");
  IElementType FUNCTION = new FormulaEngineTokenType("function");
  IElementType GLOBAL = new FormulaEngineTokenType("global");
  IElementType IDENTIFIER = new FormulaEngineTokenType("IDENTIFIER");
  IElementType INTEGER = new FormulaEngineTokenType("integer");
  IElementType LEFT_CURLY_BRACE = new FormulaEngineTokenType("{");
  IElementType LEFT_PARENTHESIS = new FormulaEngineTokenType("(");
  IElementType LINE_COMMENT = new FormulaEngineTokenType("LINE_COMMENT");
  IElementType LIST = new FormulaEngineTokenType("list");
  IElementType LOCAL = new FormulaEngineTokenType("local");
  IElementType OPERATOR_EQUALS = new FormulaEngineTokenType("=");
  IElementType RETURN = new FormulaEngineTokenType("return");
  IElementType RIGHT_CURLY_BRACE = new FormulaEngineTokenType("}");
  IElementType RIGHT_PARENTHESIS = new FormulaEngineTokenType(")");
  IElementType STRING = new FormulaEngineTokenType("string");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == ASSIGNMENT) {
        return new FormulaEngineAssignmentImpl(node);
      }
      else if (type == FUNCTION_ARGUMENTS) {
        return new FormulaEngineFunctionArgumentsImpl(node);
      }
      else if (type == FUNCTION_BODY) {
        return new FormulaEngineFunctionBodyImpl(node);
      }
      else if (type == FUNCTION_DEFINITION) {
        return new FormulaEngineFunctionDefinitionImpl(node);
      }
      else if (type == FUNCTION_INVOCATION) {
        return new FormulaEngineFunctionInvocationImpl(node);
      }
      else if (type == FUNCTION_PARAMETER) {
        return new FormulaEngineFunctionParameterImpl(node);
      }
      else if (type == FUNCTION_PARAMETERS) {
        return new FormulaEngineFunctionParametersImpl(node);
      }
      else if (type == RETURN_STATEMENT) {
        return new FormulaEngineReturnStatementImpl(node);
      }
      else if (type == STATEMENT) {
        return new FormulaEngineStatementImpl(node);
      }
      else if (type == TYPE_PREFIX) {
        return new FormulaEngineTypePrefixImpl(node);
      }
      else if (type == VISIBILITY_PREFIX) {
        return new FormulaEngineVisibilityPrefixImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
