// This is a generated file. Not intended for manual editing.
package de.cofinpro.intellij.acfeplugin.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import de.cofinpro.intellij.acfeplugin.psi.impl.*;

public interface FormulaEngineElementTypes {

  IElementType ARRAY_ACCESS = new FormulaEngineElementType("ARRAY_ACCESS");
  IElementType ASSIGNMENT = new FormulaEngineElementType("ASSIGNMENT");
  IElementType ASSIGNMENT_OPERATOR = new FormulaEngineElementType("ASSIGNMENT_OPERATOR");
  IElementType BUILT_IN_FUNCTION_NAME = new FormulaEngineElementType("BUILT_IN_FUNCTION_NAME");
  IElementType BUILT_IN_VARIABLE_NAME = new FormulaEngineElementType("BUILT_IN_VARIABLE_NAME");
  IElementType CALCULATION_EXPRESSION = new FormulaEngineElementType("CALCULATION_EXPRESSION");
  IElementType CALCULATION_OPERATOR = new FormulaEngineElementType("CALCULATION_OPERATOR");
  IElementType COMBINATION_EXPRESSION = new FormulaEngineElementType("COMBINATION_EXPRESSION");
  IElementType COMBINATION_OPERATOR = new FormulaEngineElementType("COMBINATION_OPERATOR");
  IElementType COMPARISON_EXPRESSION = new FormulaEngineElementType("COMPARISON_EXPRESSION");
  IElementType COMPARISON_OPERATOR = new FormulaEngineElementType("COMPARISON_OPERATOR");
  IElementType CONSTANT = new FormulaEngineElementType("CONSTANT");
  IElementType CONTROL_STRUCTURE = new FormulaEngineElementType("CONTROL_STRUCTURE");
  IElementType CONTROL_STRUCTURE_BODY = new FormulaEngineElementType("CONTROL_STRUCTURE_BODY");
  IElementType CUSTOM_FUNCTION_NAME = new FormulaEngineElementType("CUSTOM_FUNCTION_NAME");
  IElementType DECLARATION = new FormulaEngineElementType("DECLARATION");
  IElementType DO_WHILE = new FormulaEngineElementType("DO_WHILE");
  IElementType EXPRESSION = new FormulaEngineElementType("EXPRESSION");
  IElementType FOR = new FormulaEngineElementType("FOR");
  IElementType FUNCTION_ARGUMENT = new FormulaEngineElementType("FUNCTION_ARGUMENT");
  IElementType FUNCTION_ARGUMENTS = new FormulaEngineElementType("FUNCTION_ARGUMENTS");
  IElementType FUNCTION_BODY = new FormulaEngineElementType("FUNCTION_BODY");
  IElementType FUNCTION_BODY_STATEMENT = new FormulaEngineElementType("FUNCTION_BODY_STATEMENT");
  IElementType FUNCTION_DEFINITION = new FormulaEngineElementType("FUNCTION_DEFINITION");
  IElementType FUNCTION_INVOCATION = new FormulaEngineElementType("FUNCTION_INVOCATION");
  IElementType FUNCTION_PARAMETER = new FormulaEngineElementType("FUNCTION_PARAMETER");
  IElementType FUNCTION_PARAMETERS = new FormulaEngineElementType("FUNCTION_PARAMETERS");
  IElementType IF = new FormulaEngineElementType("IF");
  IElementType LEAF_EXPRESSION = new FormulaEngineElementType("LEAF_EXPRESSION");
  IElementType LIST_CONTENTS = new FormulaEngineElementType("LIST_CONTENTS");
  IElementType LIST_LITERAL = new FormulaEngineElementType("LIST_LITERAL");
  IElementType NEGATED_EXPRESSION = new FormulaEngineElementType("NEGATED_EXPRESSION");
  IElementType PARENTHESIS_EXPRESSION = new FormulaEngineElementType("PARENTHESIS_EXPRESSION");
  IElementType POSTFIX_OPERATOR = new FormulaEngineElementType("POSTFIX_OPERATOR");
  IElementType PREFIX_OPERATOR = new FormulaEngineElementType("PREFIX_OPERATOR");
  IElementType RETURN_STATEMENT = new FormulaEngineElementType("RETURN_STATEMENT");
  IElementType SEQ = new FormulaEngineElementType("SEQ");
  IElementType SEQ_FOR_PARENTHESIS = new FormulaEngineElementType("SEQ_FOR_PARENTHESIS");
  IElementType SHORT_IF_EXPRESSION = new FormulaEngineElementType("SHORT_IF_EXPRESSION");
  IElementType SINGLE_STRING_LITERAL = new FormulaEngineElementType("SINGLE_STRING_LITERAL");
  IElementType STATEMENT = new FormulaEngineElementType("STATEMENT");
  IElementType STATEMENT_WITHOUT_EOL = new FormulaEngineElementType("STATEMENT_WITHOUT_EOL");
  IElementType STRING_LITERAL = new FormulaEngineElementType("STRING_LITERAL");
  IElementType SWITCH = new FormulaEngineElementType("SWITCH");
  IElementType TOP_LEVEL_ITEM = new FormulaEngineElementType("TOP_LEVEL_ITEM");
  IElementType TYPE = new FormulaEngineElementType("TYPE");
  IElementType VISIBILITY = new FormulaEngineElementType("VISIBILITY");
  IElementType WHILE = new FormulaEngineElementType("WHILE");

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
  IElementType BUILT_IN_FUNC_STRING = new FormulaEngineTokenType("string");
  IElementType BUILT_IN_VAR_NA = new FormulaEngineTokenType("$NA");
  IElementType BUILT_IN_VAR_TODAY = new FormulaEngineTokenType("$TODAY");
  IElementType COLON = new FormulaEngineTokenType(":");
  IElementType COMMA = new FormulaEngineTokenType(",");
  IElementType DOUBLE_QUOTED_STRING = new FormulaEngineTokenType("DOUBLE_QUOTED_STRING");
  IElementType DOUBLE_QUOTED_STRING_LITERAL = new FormulaEngineTokenType("double quoted string literal");
  IElementType IDENTIFIER = new FormulaEngineTokenType("IDENTIFIER");
  IElementType KEYWORD_AND = new FormulaEngineTokenType("and");
  IElementType KEYWORD_BREAK = new FormulaEngineTokenType("break");
  IElementType KEYWORD_CASE = new FormulaEngineTokenType("case");
  IElementType KEYWORD_DEFAULT = new FormulaEngineTokenType("default");
  IElementType KEYWORD_DO = new FormulaEngineTokenType("do");
  IElementType KEYWORD_ELSE = new FormulaEngineTokenType("else");
  IElementType KEYWORD_FOR = new FormulaEngineTokenType("for");
  IElementType KEYWORD_FUNCTION = new FormulaEngineTokenType("function");
  IElementType KEYWORD_IF = new FormulaEngineTokenType("if");
  IElementType KEYWORD_OR = new FormulaEngineTokenType("or");
  IElementType KEYWORD_RETURN = new FormulaEngineTokenType("return");
  IElementType KEYWORD_SEQ = new FormulaEngineTokenType("seq");
  IElementType KEYWORD_SWITCH = new FormulaEngineTokenType("switch");
  IElementType KEYWORD_WHILE = new FormulaEngineTokenType("while");
  IElementType LEFT_BRACKET = new FormulaEngineTokenType("[");
  IElementType LEFT_CURLY_BRACE = new FormulaEngineTokenType("{");
  IElementType LEFT_PARENTHESIS = new FormulaEngineTokenType("(");
  IElementType LINE_COMMENT = new FormulaEngineTokenType("LINE_COMMENT");
  IElementType MINUS = new FormulaEngineTokenType("-");
  IElementType NUMBER_INTEGER = new FormulaEngineTokenType("NUMBER_INTEGER");
  IElementType OPERATOR_ADDASSIGNMENT = new FormulaEngineTokenType("+=");
  IElementType OPERATOR_AND = new FormulaEngineTokenType("&&");
  IElementType OPERATOR_ASSIGNMENT = new FormulaEngineTokenType("=");
  IElementType OPERATOR_DECREMENT = new FormulaEngineTokenType("--");
  IElementType OPERATOR_DIVIDE = new FormulaEngineTokenType("/");
  IElementType OPERATOR_EQUAL = new FormulaEngineTokenType("==");
  IElementType OPERATOR_GREATERTHAN = new FormulaEngineTokenType(">");
  IElementType OPERATOR_GREATERTHANEQUAL = new FormulaEngineTokenType(">=");
  IElementType OPERATOR_INCREMENT = new FormulaEngineTokenType("++");
  IElementType OPERATOR_LESSTHAN = new FormulaEngineTokenType("<");
  IElementType OPERATOR_LESSTHANEQUAL = new FormulaEngineTokenType("<=");
  IElementType OPERATOR_MODULO = new FormulaEngineTokenType("%");
  IElementType OPERATOR_MULTIPLY = new FormulaEngineTokenType("*");
  IElementType OPERATOR_NEGATION = new FormulaEngineTokenType("!");
  IElementType OPERATOR_NOTEQUAL = new FormulaEngineTokenType("!=");
  IElementType OPERATOR_OR = new FormulaEngineTokenType("||");
  IElementType OPERATOR_PLUS = new FormulaEngineTokenType("+");
  IElementType OPERATOR_SUBTRACTASSIGNMENT = new FormulaEngineTokenType("-=");
  IElementType QUESIONMARK = new FormulaEngineTokenType("?");
  IElementType RIGHT_BRACKET = new FormulaEngineTokenType("]");
  IElementType RIGHT_CURLY_BRACE = new FormulaEngineTokenType("}");
  IElementType RIGHT_PARENTHESIS = new FormulaEngineTokenType(")");
  IElementType SEMICOLON = new FormulaEngineTokenType(";");
  IElementType SINGLE_QUOTED_STRING = new FormulaEngineTokenType("SINGLE_QUOTED_STRING");
  IElementType SINGLE_QUOTED_STRING_LITERAL = new FormulaEngineTokenType("single quoted string literal");
  IElementType TYPE_ANY = new FormulaEngineTokenType("any");
  IElementType TYPE_DATE = new FormulaEngineTokenType("TYPE_DATE");
  IElementType TYPE_DATETIME = new FormulaEngineTokenType("TYPE_DATETIME");
  IElementType TYPE_DICT = new FormulaEngineTokenType("dict");
  IElementType TYPE_FLOAT = new FormulaEngineTokenType("TYPE_FLOAT");
  IElementType TYPE_INTEGER = new FormulaEngineTokenType("TYPE_INTEGER");
  IElementType TYPE_LIST = new FormulaEngineTokenType("list");
  IElementType TYPE_STRING = new FormulaEngineTokenType("TYPE_STRING");
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
      else if (type == ASSIGNMENT_OPERATOR) {
        return new FormulaEngineAssignmentOperatorImpl(node);
      }
      else if (type == BUILT_IN_FUNCTION_NAME) {
        return new FormulaEngineBuiltInFunctionNameImpl(node);
      }
      else if (type == BUILT_IN_VARIABLE_NAME) {
        return new FormulaEngineBuiltInVariableNameImpl(node);
      }
      else if (type == CALCULATION_EXPRESSION) {
        return new FormulaEngineCalculationExpressionImpl(node);
      }
      else if (type == CALCULATION_OPERATOR) {
        return new FormulaEngineCalculationOperatorImpl(node);
      }
      else if (type == COMBINATION_EXPRESSION) {
        return new FormulaEngineCombinationExpressionImpl(node);
      }
      else if (type == COMBINATION_OPERATOR) {
        return new FormulaEngineCombinationOperatorImpl(node);
      }
      else if (type == COMPARISON_EXPRESSION) {
        return new FormulaEngineComparisonExpressionImpl(node);
      }
      else if (type == COMPARISON_OPERATOR) {
        return new FormulaEngineComparisonOperatorImpl(node);
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
      else if (type == CUSTOM_FUNCTION_NAME) {
        return new FormulaEngineCustomFunctionNameImpl(node);
      }
      else if (type == DECLARATION) {
        return new FormulaEngineDeclarationImpl(node);
      }
      else if (type == DO_WHILE) {
        return new FormulaEngineDoWhileImpl(node);
      }
      else if (type == FOR) {
        return new FormulaEngineForImpl(node);
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
      else if (type == IF) {
        return new FormulaEngineIfImpl(node);
      }
      else if (type == LEAF_EXPRESSION) {
        return new FormulaEngineLeafExpressionImpl(node);
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
      else if (type == PARENTHESIS_EXPRESSION) {
        return new FormulaEngineParenthesisExpressionImpl(node);
      }
      else if (type == POSTFIX_OPERATOR) {
        return new FormulaEnginePostfixOperatorImpl(node);
      }
      else if (type == PREFIX_OPERATOR) {
        return new FormulaEnginePrefixOperatorImpl(node);
      }
      else if (type == RETURN_STATEMENT) {
        return new FormulaEngineReturnStatementImpl(node);
      }
      else if (type == SEQ) {
        return new FormulaEngineSeqImpl(node);
      }
      else if (type == SEQ_FOR_PARENTHESIS) {
        return new FormulaEngineSeqForParenthesisImpl(node);
      }
      else if (type == SHORT_IF_EXPRESSION) {
        return new FormulaEngineShortIfExpressionImpl(node);
      }
      else if (type == SINGLE_STRING_LITERAL) {
        return new FormulaEngineSingleStringLiteralImpl(node);
      }
      else if (type == STATEMENT) {
        return new FormulaEngineStatementImpl(node);
      }
      else if (type == STATEMENT_WITHOUT_EOL) {
        return new FormulaEngineStatementWithoutEolImpl(node);
      }
      else if (type == STRING_LITERAL) {
        return new FormulaEngineStringLiteralImpl(node);
      }
      else if (type == SWITCH) {
        return new FormulaEngineSwitchImpl(node);
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
      else if (type == WHILE) {
        return new FormulaEngineWhileImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
