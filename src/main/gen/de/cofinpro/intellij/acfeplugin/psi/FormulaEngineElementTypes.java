// This is a generated file. Not intended for manual editing.
package de.cofinpro.intellij.acfeplugin.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import de.cofinpro.intellij.acfeplugin.psi.impl.*;

public interface FormulaEngineElementTypes {

  IElementType ARRAY_ACCESS = new FormulaEngineElementType("ARRAY_ACCESS");
  IElementType ASSIGNMENT = new FormulaEngineElementType("ASSIGNMENT");
  IElementType BUILT_IN_FUNCTION_NAME = new FormulaEngineElementType("BUILT_IN_FUNCTION_NAME");
  IElementType BUILT_IN_VARIABLE_NAME = new FormulaEngineElementType("BUILT_IN_VARIABLE_NAME");
  IElementType CONSTANT = new FormulaEngineElementType("CONSTANT");
  IElementType CONTROL_STRUCTURE = new FormulaEngineElementType("CONTROL_STRUCTURE");
  IElementType CONTROL_STRUCTURE_BODY = new FormulaEngineElementType("CONTROL_STRUCTURE_BODY");
  IElementType CONTROL_STRUCTURE_IN_FUNCTION = new FormulaEngineElementType("CONTROL_STRUCTURE_IN_FUNCTION");
  IElementType CONTROL_STRUCTURE_IN_FUNCTION_BODY = new FormulaEngineElementType("CONTROL_STRUCTURE_IN_FUNCTION_BODY");
  IElementType CONTROL_STRUCTURE_KEYWORD = new FormulaEngineElementType("CONTROL_STRUCTURE_KEYWORD");
  IElementType CUSTOM_FUNCTION_NAME = new FormulaEngineElementType("CUSTOM_FUNCTION_NAME");
  IElementType DECLARATION = new FormulaEngineElementType("DECLARATION");
  IElementType EXPRESSION = new FormulaEngineElementType("EXPRESSION");
  IElementType FUNCTION_ARGUMENT = new FormulaEngineElementType("FUNCTION_ARGUMENT");
  IElementType FUNCTION_ARGUMENTS = new FormulaEngineElementType("FUNCTION_ARGUMENTS");
  IElementType FUNCTION_BODY = new FormulaEngineElementType("FUNCTION_BODY");
  IElementType FUNCTION_BODY_STATEMENT = new FormulaEngineElementType("FUNCTION_BODY_STATEMENT");
  IElementType FUNCTION_DEFINITION = new FormulaEngineElementType("FUNCTION_DEFINITION");
  IElementType FUNCTION_INVOCATION = new FormulaEngineElementType("FUNCTION_INVOCATION");
  IElementType FUNCTION_PARAMETER = new FormulaEngineElementType("FUNCTION_PARAMETER");
  IElementType FUNCTION_PARAMETERS = new FormulaEngineElementType("FUNCTION_PARAMETERS");
  IElementType LIST_CONTENTS = new FormulaEngineElementType("LIST_CONTENTS");
  IElementType LIST_LITERAL = new FormulaEngineElementType("LIST_LITERAL");
  IElementType NEGATED_EXPRESSION = new FormulaEngineElementType("NEGATED_EXPRESSION");
  IElementType OPERATOR = new FormulaEngineElementType("OPERATOR");
  IElementType RETURN_STATEMENT = new FormulaEngineElementType("RETURN_STATEMENT");
  IElementType SINGLE_EXPRESSION = new FormulaEngineElementType("SINGLE_EXPRESSION");
  IElementType SINGLE_STRING_LITERAL = new FormulaEngineElementType("SINGLE_STRING_LITERAL");
  IElementType STATEMENT = new FormulaEngineElementType("STATEMENT");
  IElementType STRING_LITERAL = new FormulaEngineElementType("STRING_LITERAL");
  IElementType TOP_LEVEL_ITEM = new FormulaEngineElementType("TOP_LEVEL_ITEM");
  IElementType TYPE = new FormulaEngineElementType("TYPE");
  IElementType VISIBILITY = new FormulaEngineElementType("VISIBILITY");

  IElementType BLOCK_COMMENT = new FormulaEngineTokenType("BLOCK_COMMENT");
  IElementType BUILT_IN_FUNC_ATTRIBUTE = new FormulaEngineTokenType("attribute");
  IElementType BUILT_IN_FUNC_DATE = new FormulaEngineTokenType("date");
  IElementType BUILT_IN_FUNC_DATETIME = new FormulaEngineTokenType("datetime");
  IElementType BUILT_IN_FUNC_DAYDIFF = new FormulaEngineTokenType("daydiff");
  IElementType BUILT_IN_FUNC_DAYPLUS = new FormulaEngineTokenType("dayplus");
  IElementType BUILT_IN_FUNC_ELT = new FormulaEngineTokenType("elt");
  IElementType BUILT_IN_FUNC_FIRST = new FormulaEngineTokenType("first");
  IElementType BUILT_IN_FUNC_FLOAT = new FormulaEngineTokenType("float");
  IElementType BUILT_IN_FUNC_HASH_GET = new FormulaEngineTokenType("hash_get");
  IElementType BUILT_IN_FUNC_HASH_ISKEY = new FormulaEngineTokenType("hash_iskey");
  IElementType BUILT_IN_FUNC_HASH_KEYS = new FormulaEngineTokenType("hash_keys");
  IElementType BUILT_IN_FUNC_HASH_PUT = new FormulaEngineTokenType("hash_put");
  IElementType BUILT_IN_FUNC_INTEGER = new FormulaEngineTokenType("integer");
  IElementType BUILT_IN_FUNC_IS_LIST = new FormulaEngineTokenType("is_list");
  IElementType BUILT_IN_FUNC_IS_NA = new FormulaEngineTokenType("is_na");
  IElementType BUILT_IN_FUNC_IS_STRING = new FormulaEngineTokenType("is_string");
  IElementType BUILT_IN_FUNC_KERNEL = new FormulaEngineTokenType("kernel");
  IElementType BUILT_IN_FUNC_LEN = new FormulaEngineTokenType("len");
  IElementType BUILT_IN_FUNC_LOAD = new FormulaEngineTokenType("load");
  IElementType BUILT_IN_FUNC_OUT = new FormulaEngineTokenType("out");
  IElementType BUILT_IN_FUNC_REMOVE = new FormulaEngineTokenType("remove");
  IElementType BUILT_IN_FUNC_STATUS = new FormulaEngineTokenType("status");
  IElementType BUILT_IN_FUNC_STR = new FormulaEngineTokenType("str");
  IElementType BUILT_IN_VAR_NA = new FormulaEngineTokenType("$NA");
  IElementType BUILT_IN_VAR_TODAY = new FormulaEngineTokenType("$TODAY");
  IElementType COMMA = new FormulaEngineTokenType(",");
  IElementType DOUBLE_QUOTED_STRING = new FormulaEngineTokenType("DOUBLE_QUOTED_STRING");
  IElementType DOUBLE_QUOTED_STRING_LITERAL = new FormulaEngineTokenType("double quoted string literal");
  IElementType IDENTIFIER = new FormulaEngineTokenType("IDENTIFIER");
  IElementType KEYWORD_ELSE = new FormulaEngineTokenType("else");
  IElementType KEYWORD_FOR = new FormulaEngineTokenType("for");
  IElementType KEYWORD_FUNCTION = new FormulaEngineTokenType("function");
  IElementType KEYWORD_IF = new FormulaEngineTokenType("if");
  IElementType KEYWORD_RETURN = new FormulaEngineTokenType("return");
  IElementType KEYWORD_SEQ = new FormulaEngineTokenType("seq");
  IElementType KEYWORD_WHILE = new FormulaEngineTokenType("while");
  IElementType LEFT_BRACKET = new FormulaEngineTokenType("[");
  IElementType LEFT_CURLY_BRACE = new FormulaEngineTokenType("{");
  IElementType LEFT_PARENTHESIS = new FormulaEngineTokenType("(");
  IElementType LINE_COMMENT = new FormulaEngineTokenType("LINE_COMMENT");
  IElementType NUMBER_INTEGER = new FormulaEngineTokenType("NUMBER_INTEGER");
  IElementType OPERATOR_AND = new FormulaEngineTokenType("&&");
  IElementType OPERATOR_ASSIGNMENT = new FormulaEngineTokenType("=");
  IElementType OPERATOR_EQUAL = new FormulaEngineTokenType("==");
  IElementType OPERATOR_MODULO = new FormulaEngineTokenType("%");
  IElementType OPERATOR_NEGATION = new FormulaEngineTokenType("!");
  IElementType OPERATOR_NOTEQUAL = new FormulaEngineTokenType("!=");
  IElementType OPERATOR_OR = new FormulaEngineTokenType("||");
  IElementType OPERATOR_PLUS = new FormulaEngineTokenType("+");
  IElementType RIGHT_BRACKET = new FormulaEngineTokenType("]");
  IElementType RIGHT_CURLY_BRACE = new FormulaEngineTokenType("}");
  IElementType RIGHT_PARENTHESIS = new FormulaEngineTokenType(")");
  IElementType SINGLE_QUOTED_STRING = new FormulaEngineTokenType("SINGLE_QUOTED_STRING");
  IElementType SINGLE_QUOTED_STRING_LITERAL = new FormulaEngineTokenType("single quoted string literal");
  IElementType TYPE_ANY = new FormulaEngineTokenType("any");
  IElementType TYPE_DATE = new FormulaEngineTokenType("TYPE_DATE");
  IElementType TYPE_DICT = new FormulaEngineTokenType("dict");
  IElementType TYPE_FLOAT = new FormulaEngineTokenType("TYPE_FLOAT");
  IElementType TYPE_INTEGER = new FormulaEngineTokenType("TYPE_INTEGER");
  IElementType TYPE_LIST = new FormulaEngineTokenType("list");
  IElementType TYPE_STRING = new FormulaEngineTokenType("string");
  IElementType VISIBILITY_GLOBAL = new FormulaEngineTokenType("global");
  IElementType VISIBILITY_LOCAL = new FormulaEngineTokenType("local");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == ARRAY_ACCESS) {
        return new FormulaEngineArrayAccessImpl(node);
      }
      else if (type == ASSIGNMENT) {
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
      else if (type == CONTROL_STRUCTURE) {
        return new FormulaEngineControlStructureImpl(node);
      }
      else if (type == CONTROL_STRUCTURE_BODY) {
        return new FormulaEngineControlStructureBodyImpl(node);
      }
      else if (type == CONTROL_STRUCTURE_IN_FUNCTION) {
        return new FormulaEngineControlStructureInFunctionImpl(node);
      }
      else if (type == CONTROL_STRUCTURE_IN_FUNCTION_BODY) {
        return new FormulaEngineControlStructureInFunctionBodyImpl(node);
      }
      else if (type == CONTROL_STRUCTURE_KEYWORD) {
        return new FormulaEngineControlStructureKeywordImpl(node);
      }
      else if (type == CUSTOM_FUNCTION_NAME) {
        return new FormulaEngineCustomFunctionNameImpl(node);
      }
      else if (type == DECLARATION) {
        return new FormulaEngineDeclarationImpl(node);
      }
      else if (type == EXPRESSION) {
        return new FormulaEngineExpressionImpl(node);
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
      else if (type == LIST_CONTENTS) {
        return new FormulaEngineListContentsImpl(node);
      }
      else if (type == LIST_LITERAL) {
        return new FormulaEngineListLiteralImpl(node);
      }
      else if (type == NEGATED_EXPRESSION) {
        return new FormulaEngineNegatedExpressionImpl(node);
      }
      else if (type == OPERATOR) {
        return new FormulaEngineOperatorImpl(node);
      }
      else if (type == RETURN_STATEMENT) {
        return new FormulaEngineReturnStatementImpl(node);
      }
      else if (type == SINGLE_EXPRESSION) {
        return new FormulaEngineSingleExpressionImpl(node);
      }
      else if (type == SINGLE_STRING_LITERAL) {
        return new FormulaEngineSingleStringLiteralImpl(node);
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
      else if (type == TYPE) {
        return new FormulaEngineTypeImpl(node);
      }
      else if (type == VISIBILITY) {
        return new FormulaEngineVisibilityImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
