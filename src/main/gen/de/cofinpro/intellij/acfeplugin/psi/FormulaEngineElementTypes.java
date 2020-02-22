// This is a generated file. Not intended for manual editing.
package de.cofinpro.intellij.acfeplugin.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import de.cofinpro.intellij.acfeplugin.psi.impl.*;

public interface FormulaEngineElementTypes {

  IElementType ASSIGNMENT = new FormulaEngineElementType("ASSIGNMENT");
  IElementType BUILT_IN_FUNCTION_NAME = new FormulaEngineElementType("BUILT_IN_FUNCTION_NAME");
  IElementType BUILT_IN_VARIABLE_NAME = new FormulaEngineElementType("BUILT_IN_VARIABLE_NAME");
  IElementType CONSTANT = new FormulaEngineElementType("CONSTANT");
  IElementType CUSTOM_FUNCTION_NAME = new FormulaEngineElementType("CUSTOM_FUNCTION_NAME");
  IElementType DECLARATION = new FormulaEngineElementType("DECLARATION");
  IElementType FUNCTION_ARGUMENT = new FormulaEngineElementType("FUNCTION_ARGUMENT");
  IElementType FUNCTION_ARGUMENTS = new FormulaEngineElementType("FUNCTION_ARGUMENTS");
  IElementType FUNCTION_BODY = new FormulaEngineElementType("FUNCTION_BODY");
  IElementType FUNCTION_BODY_STATEMENT = new FormulaEngineElementType("FUNCTION_BODY_STATEMENT");
  IElementType FUNCTION_DEFINITION = new FormulaEngineElementType("FUNCTION_DEFINITION");
  IElementType FUNCTION_INVOCATION = new FormulaEngineElementType("FUNCTION_INVOCATION");
  IElementType FUNCTION_PARAMETER = new FormulaEngineElementType("FUNCTION_PARAMETER");
  IElementType FUNCTION_PARAMETERS = new FormulaEngineElementType("FUNCTION_PARAMETERS");
  IElementType RETURN_STATEMENT = new FormulaEngineElementType("RETURN_STATEMENT");
  IElementType STATEMENT = new FormulaEngineElementType("STATEMENT");
  IElementType STRING_LITERAL = new FormulaEngineElementType("STRING_LITERAL");
  IElementType TOP_LEVEL_ITEM = new FormulaEngineElementType("TOP_LEVEL_ITEM");
  IElementType TYPE_PREFIX = new FormulaEngineElementType("TYPE_PREFIX");
  IElementType VISIBILITY_PREFIX = new FormulaEngineElementType("VISIBILITY_PREFIX");

  IElementType ANY = new FormulaEngineTokenType("any");
  IElementType ATTRIBUTE = new FormulaEngineTokenType("attribute");
  IElementType BLOCK_COMMENT = new FormulaEngineTokenType("BLOCK_COMMENT");
  IElementType BUILT_IN_FUNC_FLOAT = new FormulaEngineTokenType("float(");
  IElementType BUILT_IN_FUNC_INTEGER = new FormulaEngineTokenType("integer(");
  IElementType BUILT_IN_VAR_NA = new FormulaEngineTokenType("$NA");
  IElementType DATE = new FormulaEngineTokenType("date");
  IElementType DATETIME = new FormulaEngineTokenType("datetime");
  IElementType DAYDIFF = new FormulaEngineTokenType("daydiff");
  IElementType DAYPLUS = new FormulaEngineTokenType("dayplus");
  IElementType DICT = new FormulaEngineTokenType("dict");
  IElementType DOUBLE_QUOTED_STRING = new FormulaEngineTokenType("DOUBLE_QUOTED_STRING");
  IElementType DOUBLE_QUOTED_STRING_LITERAL = new FormulaEngineTokenType("double quoted string literal");
  IElementType ELT = new FormulaEngineTokenType("elt");
  IElementType FLOAT = new FormulaEngineTokenType("float");
  IElementType FUNCTION = new FormulaEngineTokenType("function");
  IElementType GLOBAL = new FormulaEngineTokenType("global");
  IElementType IDENTIFIER = new FormulaEngineTokenType("IDENTIFIER");
  IElementType INTEGER = new FormulaEngineTokenType("integer");
  IElementType IS_LIST = new FormulaEngineTokenType("is_list");
  IElementType IS_NA = new FormulaEngineTokenType("is_na");
  IElementType KERNEL = new FormulaEngineTokenType("kernel");
  IElementType KEYWORD_ELSE = new FormulaEngineTokenType("else");
  IElementType KEYWORD_FOR = new FormulaEngineTokenType("for");
  IElementType KEYWORD_IF = new FormulaEngineTokenType("if");
  IElementType KEYWORD_WHILE = new FormulaEngineTokenType("while");
  IElementType LEFT_BRACKET = new FormulaEngineTokenType("[");
  IElementType LEFT_CURLY_BRACE = new FormulaEngineTokenType("{");
  IElementType LEFT_PARENTHESIS = new FormulaEngineTokenType("(");
  IElementType LEN = new FormulaEngineTokenType("len");
  IElementType LINE_COMMENT = new FormulaEngineTokenType("LINE_COMMENT");
  IElementType LIST = new FormulaEngineTokenType("list");
  IElementType LOAD = new FormulaEngineTokenType("load");
  IElementType LOCAL = new FormulaEngineTokenType("local");
  IElementType NUMBER_INTEGER = new FormulaEngineTokenType("NUMBER_INTEGER");
  IElementType OPERATOR_EQUALS = new FormulaEngineTokenType("=");
  IElementType REMOVE = new FormulaEngineTokenType("remove");
  IElementType RETURN = new FormulaEngineTokenType("return");
  IElementType RIGHT_BRACKET = new FormulaEngineTokenType("]");
  IElementType RIGHT_CURLY_BRACE = new FormulaEngineTokenType("}");
  IElementType RIGHT_PARENTHESIS = new FormulaEngineTokenType(")");
  IElementType SINGLE_QUOTED_STRING = new FormulaEngineTokenType("SINGLE_QUOTED_STRING");
  IElementType SINGLE_QUOTED_STRING_LITERAL = new FormulaEngineTokenType("single quoted string literal");
  IElementType STATUS = new FormulaEngineTokenType("status");
  IElementType STR = new FormulaEngineTokenType("str");
  IElementType STRING = new FormulaEngineTokenType("string");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == ASSIGNMENT) {
        return new FormulaEngineAssignmentImpl(node);
      }
      else if (type == BUILT_IN_FUNCTION_NAME) {
        return new FormulaEngineBuiltInFunctionNameImpl(node);
      }
      else if (type == BUILT_IN_VARIABLE_NAME) {
        return new FormulaEngineBuiltInVariableNameImpl(node);
      }
      else if (type == CONSTANT) {
        return new FormulaEngineConstantImpl(node);
      }
      else if (type == CUSTOM_FUNCTION_NAME) {
        return new FormulaEngineCustomFunctionNameImpl(node);
      }
      else if (type == DECLARATION) {
        return new FormulaEngineDeclarationImpl(node);
      }
      else if (type == FUNCTION_ARGUMENT) {
        return new FormulaEngineFunctionArgumentImpl(node);
      }
      else if (type == FUNCTION_ARGUMENTS) {
        return new FormulaEngineFunctionArgumentsImpl(node);
      }
      else if (type == FUNCTION_BODY) {
        return new FormulaEngineFunctionBodyImpl(node);
      }
      else if (type == FUNCTION_BODY_STATEMENT) {
        return new FormulaEngineFunctionBodyStatementImpl(node);
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
      else if (type == STRING_LITERAL) {
        return new FormulaEngineStringLiteralImpl(node);
      }
      else if (type == TOP_LEVEL_ITEM) {
        return new FormulaEngineTopLevelItemImpl(node);
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
