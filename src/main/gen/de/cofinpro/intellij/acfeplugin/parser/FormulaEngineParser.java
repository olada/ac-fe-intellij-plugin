// This is a generated file. Not intended for manual editing.
package de.cofinpro.intellij.acfeplugin.parser;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static de.cofinpro.intellij.acfeplugin.psi.FormulaEngineElementTypes.*;
import static com.intellij.lang.parser.GeneratedParserUtilBase.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class FormulaEngineParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType t, PsiBuilder b) {
    parseLight(t, b);
    return b.getTreeBuilt();
  }

  public void parseLight(IElementType t, PsiBuilder b) {
    boolean r;
    b = adapt_builder_(t, b, this, EXTENDS_SETS_);
    Marker m = enter_section_(b, 0, _COLLAPSE_, null);
    r = parse_root_(t, b);
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b) {
    return parse_root_(t, b, 0);
  }

  static boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return feFile(b, l + 1);
  }

  public static final TokenSet[] EXTENDS_SETS_ = new TokenSet[] {
    create_token_set_(CALCULATION_EXPRESSION, COMBINATION_EXPRESSION, COMPARISON_EXPRESSION, EXPRESSION,
      LEAF_EXPRESSION, NEGATED_EXPRESSION, PARENTHESIS_EXPRESSION, SHORT_IF_EXPRESSION),
  };

  /* ********************************************************** */
  // IDENTIFIER (LEFT_BRACKET (NUMBER_INTEGER | IDENTIFIER) RIGHT_BRACKET)+
  public static boolean ArrayAccess(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ArrayAccess")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    r = r && ArrayAccess_1(b, l + 1);
    exit_section_(b, m, ARRAY_ACCESS, r);
    return r;
  }

  // (LEFT_BRACKET (NUMBER_INTEGER | IDENTIFIER) RIGHT_BRACKET)+
  private static boolean ArrayAccess_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ArrayAccess_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ArrayAccess_1_0(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!ArrayAccess_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ArrayAccess_1", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // LEFT_BRACKET (NUMBER_INTEGER | IDENTIFIER) RIGHT_BRACKET
  private static boolean ArrayAccess_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ArrayAccess_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LEFT_BRACKET);
    r = r && ArrayAccess_1_0_1(b, l + 1);
    r = r && consumeToken(b, RIGHT_BRACKET);
    exit_section_(b, m, null, r);
    return r;
  }

  // NUMBER_INTEGER | IDENTIFIER
  private static boolean ArrayAccess_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ArrayAccess_1_0_1")) return false;
    boolean r;
    r = consumeToken(b, NUMBER_INTEGER);
    if (!r) r = consumeToken(b, IDENTIFIER);
    return r;
  }

  /* ********************************************************** */
  // (Declaration AssignmentOperator (Seq | Expression)) | IDENTIFIER PostfixOperator
  public static boolean Assignment(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Assignment")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ASSIGNMENT, "<assignment>");
    r = Assignment_0(b, l + 1);
    if (!r) r = Assignment_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // Declaration AssignmentOperator (Seq | Expression)
  private static boolean Assignment_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Assignment_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Declaration(b, l + 1);
    r = r && AssignmentOperator(b, l + 1);
    r = r && Assignment_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // Seq | Expression
  private static boolean Assignment_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Assignment_0_2")) return false;
    boolean r;
    r = Seq(b, l + 1);
    if (!r) r = Expression(b, l + 1, -1);
    return r;
  }

  // IDENTIFIER PostfixOperator
  private static boolean Assignment_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Assignment_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    r = r && PostfixOperator(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // OPERATOR_ADDASSIGNMENT | OPERATOR_SUBTRACTASSIGNMENT | OPERATOR_ASSIGNMENT
  public static boolean AssignmentOperator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AssignmentOperator")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ASSIGNMENT_OPERATOR, "<assignment operator>");
    r = consumeToken(b, OPERATOR_ADDASSIGNMENT);
    if (!r) r = consumeToken(b, OPERATOR_SUBTRACTASSIGNMENT);
    if (!r) r = consumeToken(b, OPERATOR_ASSIGNMENT);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // BUILT_IN_FUNC_ATTRIBUTE | BUILT_IN_FUNC_STATUS
  //     | BUILT_IN_FUNC_DATE | BUILT_IN_FUNC_DATETIME | BUILT_IN_FUNC_STR | BUILT_IN_FUNC_FLOAT | BUILT_IN_FUNC_INTEGER | BUILT_IN_FUNC_STRING
  //     | BUILT_IN_FUNC_DAYDIFF | BUILT_IN_FUNC_DAYPLUS
  //     | BUILT_IN_FUNC_ELT
  //     | BUILT_IN_FUNC_FIRST
  //     | BUILT_IN_FUNC_HASH_GET | BUILT_IN_FUNC_HASH_PUT | BUILT_IN_FUNC_HASH_ISKEY | BUILT_IN_FUNC_HASH_KEYS
  //     | BUILT_IN_FUNC_IS_LIST | BUILT_IN_FUNC_IS_NA | BUILT_IN_FUNC_IS_STRING
  //     | BUILT_IN_FUNC_KERNEL
  //     | BUILT_IN_FUNC_LEN
  //     | BUILT_IN_FUNC_LOAD
  //     | BUILT_IN_FUNC_OUT
  //     | BUILT_IN_FUNC_REMOVE
  public static boolean BuiltInFunctionName(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BuiltInFunctionName")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BUILT_IN_FUNCTION_NAME, "<built in function name>");
    r = consumeToken(b, BUILT_IN_FUNC_ATTRIBUTE);
    if (!r) r = consumeToken(b, BUILT_IN_FUNC_STATUS);
    if (!r) r = consumeToken(b, BUILT_IN_FUNC_DATE);
    if (!r) r = consumeToken(b, BUILT_IN_FUNC_DATETIME);
    if (!r) r = consumeToken(b, BUILT_IN_FUNC_STR);
    if (!r) r = consumeToken(b, BUILT_IN_FUNC_FLOAT);
    if (!r) r = consumeToken(b, BUILT_IN_FUNC_INTEGER);
    if (!r) r = consumeToken(b, BUILT_IN_FUNC_STRING);
    if (!r) r = consumeToken(b, BUILT_IN_FUNC_DAYDIFF);
    if (!r) r = consumeToken(b, BUILT_IN_FUNC_DAYPLUS);
    if (!r) r = consumeToken(b, BUILT_IN_FUNC_ELT);
    if (!r) r = consumeToken(b, BUILT_IN_FUNC_FIRST);
    if (!r) r = consumeToken(b, BUILT_IN_FUNC_HASH_GET);
    if (!r) r = consumeToken(b, BUILT_IN_FUNC_HASH_PUT);
    if (!r) r = consumeToken(b, BUILT_IN_FUNC_HASH_ISKEY);
    if (!r) r = consumeToken(b, BUILT_IN_FUNC_HASH_KEYS);
    if (!r) r = consumeToken(b, BUILT_IN_FUNC_IS_LIST);
    if (!r) r = consumeToken(b, BUILT_IN_FUNC_IS_NA);
    if (!r) r = consumeToken(b, BUILT_IN_FUNC_IS_STRING);
    if (!r) r = consumeToken(b, BUILT_IN_FUNC_KERNEL);
    if (!r) r = consumeToken(b, BUILT_IN_FUNC_LEN);
    if (!r) r = consumeToken(b, BUILT_IN_FUNC_LOAD);
    if (!r) r = consumeToken(b, BUILT_IN_FUNC_OUT);
    if (!r) r = consumeToken(b, BUILT_IN_FUNC_REMOVE);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // BUILT_IN_VAR_NA | BUILT_IN_VAR_TODAY
  public static boolean BuiltInVariableName(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BuiltInVariableName")) return false;
    if (!nextTokenIs(b, "<built in variable name>", BUILT_IN_VAR_NA, BUILT_IN_VAR_TODAY)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BUILT_IN_VARIABLE_NAME, "<built in variable name>");
    r = consumeToken(b, BUILT_IN_VAR_NA);
    if (!r) r = consumeToken(b, BUILT_IN_VAR_TODAY);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // OPERATOR_MODULO | OPERATOR_PLUS | MINUS | OPERATOR_MULTIPLY | OPERATOR_DIVIDE
  public static boolean CalculationOperator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CalculationOperator")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CALCULATION_OPERATOR, "<calculation operator>");
    r = consumeToken(b, OPERATOR_MODULO);
    if (!r) r = consumeToken(b, OPERATOR_PLUS);
    if (!r) r = consumeToken(b, MINUS);
    if (!r) r = consumeToken(b, OPERATOR_MULTIPLY);
    if (!r) r = consumeToken(b, OPERATOR_DIVIDE);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // OPERATOR_AND | OPERATOR_OR | KEYWORD_AND | KEYWORD_OR
  public static boolean CombinationOperator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CombinationOperator")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, COMBINATION_OPERATOR, "<combination operator>");
    r = consumeToken(b, OPERATOR_AND);
    if (!r) r = consumeToken(b, OPERATOR_OR);
    if (!r) r = consumeToken(b, KEYWORD_AND);
    if (!r) r = consumeToken(b, KEYWORD_OR);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // OPERATOR_EQUAL | OPERATOR_NOTEQUAL | OPERATOR_GREATERTHANEQUAL | OPERATOR_GREATERTHAN | OPERATOR_LESSTHANEQUAL | OPERATOR_LESSTHAN
  public static boolean ComparisonOperator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ComparisonOperator")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, COMPARISON_OPERATOR, "<comparison operator>");
    r = consumeToken(b, OPERATOR_EQUAL);
    if (!r) r = consumeToken(b, OPERATOR_NOTEQUAL);
    if (!r) r = consumeToken(b, OPERATOR_GREATERTHANEQUAL);
    if (!r) r = consumeToken(b, OPERATOR_GREATERTHAN);
    if (!r) r = consumeToken(b, OPERATOR_LESSTHANEQUAL);
    if (!r) r = consumeToken(b, OPERATOR_LESSTHAN);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // BuiltInVariableName | MINUS? NUMBER_INTEGER | StringLiteral | ListLiteral
  public static boolean Constant(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Constant")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CONSTANT, "<constant>");
    r = BuiltInVariableName(b, l + 1);
    if (!r) r = Constant_1(b, l + 1);
    if (!r) r = StringLiteral(b, l + 1);
    if (!r) r = ListLiteral(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // MINUS? NUMBER_INTEGER
  private static boolean Constant_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Constant_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Constant_1_0(b, l + 1);
    r = r && consumeToken(b, NUMBER_INTEGER);
    exit_section_(b, m, null, r);
    return r;
  }

  // MINUS?
  private static boolean Constant_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Constant_1_0")) return false;
    consumeToken(b, MINUS);
    return true;
  }

  /* ********************************************************** */
  // While | For | DoWhile | If | Switch
  public static boolean ControlStructure(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ControlStructure")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CONTROL_STRUCTURE, "<control structure>");
    r = While(b, l + 1);
    if (!r) r = For(b, l + 1);
    if (!r) r = DoWhile(b, l + 1);
    if (!r) r = If(b, l + 1);
    if (!r) r = Switch(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // (ControlStructure | Statement)*
  public static boolean ControlStructureBody(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ControlStructureBody")) return false;
    Marker m = enter_section_(b, l, _NONE_, CONTROL_STRUCTURE_BODY, "<control structure body>");
    while (true) {
      int c = current_position_(b);
      if (!ControlStructureBody_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ControlStructureBody", c)) break;
    }
    exit_section_(b, l, m, true, false, null);
    return true;
  }

  // ControlStructure | Statement
  private static boolean ControlStructureBody_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ControlStructureBody_0")) return false;
    boolean r;
    r = ControlStructure(b, l + 1);
    if (!r) r = Statement(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // IDENTIFIER
  public static boolean CustomFunctionName(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CustomFunctionName")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    exit_section_(b, m, CUSTOM_FUNCTION_NAME, r);
    return r;
  }

  /* ********************************************************** */
  // Visibility? Type? IDENTIFIER
  public static boolean Declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Declaration")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DECLARATION, "<declaration>");
    r = Declaration_0(b, l + 1);
    r = r && Declaration_1(b, l + 1);
    r = r && consumeToken(b, IDENTIFIER);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // Visibility?
  private static boolean Declaration_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Declaration_0")) return false;
    Visibility(b, l + 1);
    return true;
  }

  // Type?
  private static boolean Declaration_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Declaration_1")) return false;
    Type(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // KEYWORD_DO LEFT_CURLY_BRACE ControlStructureBody RIGHT_CURLY_BRACE KEYWORD_WHILE LEFT_PARENTHESIS Expression RIGHT_PARENTHESIS SEMICOLON
  public static boolean DoWhile(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DoWhile")) return false;
    if (!nextTokenIs(b, KEYWORD_DO)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, KEYWORD_DO, LEFT_CURLY_BRACE);
    r = r && ControlStructureBody(b, l + 1);
    r = r && consumeTokens(b, 0, RIGHT_CURLY_BRACE, KEYWORD_WHILE, LEFT_PARENTHESIS);
    r = r && Expression(b, l + 1, -1);
    r = r && consumeTokens(b, 0, RIGHT_PARENTHESIS, SEMICOLON);
    exit_section_(b, m, DO_WHILE, r);
    return r;
  }

  /* ********************************************************** */
  // KEYWORD_FOR SeqForParenthesis LEFT_CURLY_BRACE ControlStructureBody RIGHT_CURLY_BRACE
  public static boolean For(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "For")) return false;
    if (!nextTokenIs(b, KEYWORD_FOR)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KEYWORD_FOR);
    r = r && SeqForParenthesis(b, l + 1);
    r = r && consumeToken(b, LEFT_CURLY_BRACE);
    r = r && ControlStructureBody(b, l + 1);
    r = r && consumeToken(b, RIGHT_CURLY_BRACE);
    exit_section_(b, m, FOR, r);
    return r;
  }

  /* ********************************************************** */
  // Expression
  public static boolean FunctionArgument(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionArgument")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FUNCTION_ARGUMENT, "<function argument>");
    r = Expression(b, l + 1, -1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // FunctionArgument (COMMA FunctionArgument)*
  public static boolean FunctionArguments(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionArguments")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FUNCTION_ARGUMENTS, "<function arguments>");
    r = FunctionArgument(b, l + 1);
    r = r && FunctionArguments_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (COMMA FunctionArgument)*
  private static boolean FunctionArguments_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionArguments_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!FunctionArguments_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "FunctionArguments_1", c)) break;
    }
    return true;
  }

  // COMMA FunctionArgument
  private static boolean FunctionArguments_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionArguments_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && FunctionArgument(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // FunctionBodyStatement*
  public static boolean FunctionBody(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionBody")) return false;
    Marker m = enter_section_(b, l, _NONE_, FUNCTION_BODY, "<function body>");
    while (true) {
      int c = current_position_(b);
      if (!FunctionBodyStatement(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "FunctionBody", c)) break;
    }
    exit_section_(b, l, m, true, false, null);
    return true;
  }

  /* ********************************************************** */
  // FunctionDefinition | ControlStructure | ((FunctionInvocation | Assignment | Declaration | ReturnStatement) SEMICOLON)
  public static boolean FunctionBodyStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionBodyStatement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FUNCTION_BODY_STATEMENT, "<function body statement>");
    r = FunctionDefinition(b, l + 1);
    if (!r) r = ControlStructure(b, l + 1);
    if (!r) r = FunctionBodyStatement_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (FunctionInvocation | Assignment | Declaration | ReturnStatement) SEMICOLON
  private static boolean FunctionBodyStatement_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionBodyStatement_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = FunctionBodyStatement_2_0(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, m, null, r);
    return r;
  }

  // FunctionInvocation | Assignment | Declaration | ReturnStatement
  private static boolean FunctionBodyStatement_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionBodyStatement_2_0")) return false;
    boolean r;
    r = FunctionInvocation(b, l + 1);
    if (!r) r = Assignment(b, l + 1);
    if (!r) r = Declaration(b, l + 1);
    if (!r) r = ReturnStatement(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // KEYWORD_FUNCTION IDENTIFIER LEFT_PARENTHESIS FunctionParameters? RIGHT_PARENTHESIS LEFT_CURLY_BRACE FunctionBody RIGHT_CURLY_BRACE
  public static boolean FunctionDefinition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionDefinition")) return false;
    if (!nextTokenIs(b, KEYWORD_FUNCTION)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, KEYWORD_FUNCTION, IDENTIFIER, LEFT_PARENTHESIS);
    r = r && FunctionDefinition_3(b, l + 1);
    r = r && consumeTokens(b, 0, RIGHT_PARENTHESIS, LEFT_CURLY_BRACE);
    r = r && FunctionBody(b, l + 1);
    r = r && consumeToken(b, RIGHT_CURLY_BRACE);
    exit_section_(b, m, FUNCTION_DEFINITION, r);
    return r;
  }

  // FunctionParameters?
  private static boolean FunctionDefinition_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionDefinition_3")) return false;
    FunctionParameters(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // (BuiltInFunctionName | CustomFunctionName) LEFT_PARENTHESIS FunctionArguments? RIGHT_PARENTHESIS
  public static boolean FunctionInvocation(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionInvocation")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FUNCTION_INVOCATION, "<function invocation>");
    r = FunctionInvocation_0(b, l + 1);
    r = r && consumeToken(b, LEFT_PARENTHESIS);
    r = r && FunctionInvocation_2(b, l + 1);
    r = r && consumeToken(b, RIGHT_PARENTHESIS);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // BuiltInFunctionName | CustomFunctionName
  private static boolean FunctionInvocation_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionInvocation_0")) return false;
    boolean r;
    r = BuiltInFunctionName(b, l + 1);
    if (!r) r = CustomFunctionName(b, l + 1);
    return r;
  }

  // FunctionArguments?
  private static boolean FunctionInvocation_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionInvocation_2")) return false;
    FunctionArguments(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // Type? IDENTIFIER
  public static boolean FunctionParameter(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionParameter")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FUNCTION_PARAMETER, "<function parameter>");
    r = FunctionParameter_0(b, l + 1);
    r = r && consumeToken(b, IDENTIFIER);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // Type?
  private static boolean FunctionParameter_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionParameter_0")) return false;
    Type(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // FunctionParameter (COMMA FunctionParameter)*
  public static boolean FunctionParameters(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionParameters")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FUNCTION_PARAMETERS, "<function parameters>");
    r = FunctionParameter(b, l + 1);
    r = r && FunctionParameters_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (COMMA FunctionParameter)*
  private static boolean FunctionParameters_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionParameters_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!FunctionParameters_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "FunctionParameters_1", c)) break;
    }
    return true;
  }

  // COMMA FunctionParameter
  private static boolean FunctionParameters_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionParameters_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && FunctionParameter(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // KEYWORD_IF LEFT_PARENTHESIS Expression RIGHT_PARENTHESIS LEFT_CURLY_BRACE ControlStructureBody RIGHT_CURLY_BRACE (KEYWORD_ELSE KEYWORD_IF LEFT_PARENTHESIS Expression RIGHT_PARENTHESIS LEFT_CURLY_BRACE ControlStructureBody RIGHT_CURLY_BRACE)* (KEYWORD_ELSE LEFT_CURLY_BRACE ControlStructureBody RIGHT_CURLY_BRACE)?
  public static boolean If(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "If")) return false;
    if (!nextTokenIs(b, KEYWORD_IF)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, KEYWORD_IF, LEFT_PARENTHESIS);
    r = r && Expression(b, l + 1, -1);
    r = r && consumeTokens(b, 0, RIGHT_PARENTHESIS, LEFT_CURLY_BRACE);
    r = r && ControlStructureBody(b, l + 1);
    r = r && consumeToken(b, RIGHT_CURLY_BRACE);
    r = r && If_7(b, l + 1);
    r = r && If_8(b, l + 1);
    exit_section_(b, m, IF, r);
    return r;
  }

  // (KEYWORD_ELSE KEYWORD_IF LEFT_PARENTHESIS Expression RIGHT_PARENTHESIS LEFT_CURLY_BRACE ControlStructureBody RIGHT_CURLY_BRACE)*
  private static boolean If_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "If_7")) return false;
    while (true) {
      int c = current_position_(b);
      if (!If_7_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "If_7", c)) break;
    }
    return true;
  }

  // KEYWORD_ELSE KEYWORD_IF LEFT_PARENTHESIS Expression RIGHT_PARENTHESIS LEFT_CURLY_BRACE ControlStructureBody RIGHT_CURLY_BRACE
  private static boolean If_7_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "If_7_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, KEYWORD_ELSE, KEYWORD_IF, LEFT_PARENTHESIS);
    r = r && Expression(b, l + 1, -1);
    r = r && consumeTokens(b, 0, RIGHT_PARENTHESIS, LEFT_CURLY_BRACE);
    r = r && ControlStructureBody(b, l + 1);
    r = r && consumeToken(b, RIGHT_CURLY_BRACE);
    exit_section_(b, m, null, r);
    return r;
  }

  // (KEYWORD_ELSE LEFT_CURLY_BRACE ControlStructureBody RIGHT_CURLY_BRACE)?
  private static boolean If_8(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "If_8")) return false;
    If_8_0(b, l + 1);
    return true;
  }

  // KEYWORD_ELSE LEFT_CURLY_BRACE ControlStructureBody RIGHT_CURLY_BRACE
  private static boolean If_8_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "If_8_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, KEYWORD_ELSE, LEFT_CURLY_BRACE);
    r = r && ControlStructureBody(b, l + 1);
    r = r && consumeToken(b, RIGHT_CURLY_BRACE);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (Expression (COMMA Expression)*)?
  public static boolean ListContents(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ListContents")) return false;
    Marker m = enter_section_(b, l, _NONE_, LIST_CONTENTS, "<list contents>");
    ListContents_0(b, l + 1);
    exit_section_(b, l, m, true, false, null);
    return true;
  }

  // Expression (COMMA Expression)*
  private static boolean ListContents_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ListContents_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Expression(b, l + 1, -1);
    r = r && ListContents_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (COMMA Expression)*
  private static boolean ListContents_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ListContents_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!ListContents_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ListContents_0_1", c)) break;
    }
    return true;
  }

  // COMMA Expression
  private static boolean ListContents_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ListContents_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && Expression(b, l + 1, -1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // LEFT_BRACKET ListContents RIGHT_BRACKET
  public static boolean ListLiteral(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ListLiteral")) return false;
    if (!nextTokenIs(b, LEFT_BRACKET)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LEFT_BRACKET);
    r = r && ListContents(b, l + 1);
    r = r && consumeToken(b, RIGHT_BRACKET);
    exit_section_(b, m, LIST_LITERAL, r);
    return r;
  }

  /* ********************************************************** */
  // OPERATOR_INCREMENT | OPERATOR_DECREMENT
  public static boolean PostfixOperator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PostfixOperator")) return false;
    if (!nextTokenIs(b, "<postfix operator>", OPERATOR_DECREMENT, OPERATOR_INCREMENT)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, POSTFIX_OPERATOR, "<postfix operator>");
    r = consumeToken(b, OPERATOR_INCREMENT);
    if (!r) r = consumeToken(b, OPERATOR_DECREMENT);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // OPERATOR_INCREMENT | OPERATOR_DECREMENT
  public static boolean PrefixOperator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PrefixOperator")) return false;
    if (!nextTokenIs(b, "<prefix operator>", OPERATOR_DECREMENT, OPERATOR_INCREMENT)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PREFIX_OPERATOR, "<prefix operator>");
    r = consumeToken(b, OPERATOR_INCREMENT);
    if (!r) r = consumeToken(b, OPERATOR_DECREMENT);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // KEYWORD_RETURN Expression
  public static boolean ReturnStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ReturnStatement")) return false;
    if (!nextTokenIs(b, KEYWORD_RETURN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KEYWORD_RETURN);
    r = r && Expression(b, l + 1, -1);
    exit_section_(b, m, RETURN_STATEMENT, r);
    return r;
  }

  /* ********************************************************** */
  // KEYWORD_SEQ SeqForParenthesis StatementWithoutEol
  public static boolean Seq(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Seq")) return false;
    if (!nextTokenIs(b, KEYWORD_SEQ)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KEYWORD_SEQ);
    r = r && SeqForParenthesis(b, l + 1);
    r = r && StatementWithoutEol(b, l + 1);
    exit_section_(b, m, SEQ, r);
    return r;
  }

  /* ********************************************************** */
  // LEFT_PARENTHESIS Assignment SEMICOLON Expression SEMICOLON Assignment RIGHT_PARENTHESIS
  public static boolean SeqForParenthesis(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SeqForParenthesis")) return false;
    if (!nextTokenIs(b, LEFT_PARENTHESIS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LEFT_PARENTHESIS);
    r = r && Assignment(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    r = r && Expression(b, l + 1, -1);
    r = r && consumeToken(b, SEMICOLON);
    r = r && Assignment(b, l + 1);
    r = r && consumeToken(b, RIGHT_PARENTHESIS);
    exit_section_(b, m, SEQ_FOR_PARENTHESIS, r);
    return r;
  }

  /* ********************************************************** */
  // SINGLE_QUOTED_STRING | DOUBLE_QUOTED_STRING
  public static boolean SingleStringLiteral(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SingleStringLiteral")) return false;
    if (!nextTokenIs(b, "<single string literal>", DOUBLE_QUOTED_STRING, SINGLE_QUOTED_STRING)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SINGLE_STRING_LITERAL, "<single string literal>");
    r = consumeToken(b, SINGLE_QUOTED_STRING);
    if (!r) r = consumeToken(b, DOUBLE_QUOTED_STRING);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // (FunctionInvocation | Assignment | Declaration | ReturnStatement | KEYWORD_BREAK) SEMICOLON
  public static boolean Statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Statement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STATEMENT, "<statement>");
    r = Statement_0(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // FunctionInvocation | Assignment | Declaration | ReturnStatement | KEYWORD_BREAK
  private static boolean Statement_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Statement_0")) return false;
    boolean r;
    r = FunctionInvocation(b, l + 1);
    if (!r) r = Assignment(b, l + 1);
    if (!r) r = Declaration(b, l + 1);
    if (!r) r = ReturnStatement(b, l + 1);
    if (!r) r = consumeToken(b, KEYWORD_BREAK);
    return r;
  }

  /* ********************************************************** */
  // FunctionInvocation | Assignment | Declaration | BuiltInVariableName
  public static boolean StatementWithoutEol(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StatementWithoutEol")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STATEMENT_WITHOUT_EOL, "<statement without eol>");
    r = FunctionInvocation(b, l + 1);
    if (!r) r = Assignment(b, l + 1);
    if (!r) r = Declaration(b, l + 1);
    if (!r) r = BuiltInVariableName(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // SingleStringLiteral (OPERATOR_PLUS Expression)* | SingleStringLiteral (OPERATOR_PLUS SingleStringLiteral)*
  public static boolean StringLiteral(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StringLiteral")) return false;
    if (!nextTokenIs(b, "<string literal>", DOUBLE_QUOTED_STRING, SINGLE_QUOTED_STRING)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STRING_LITERAL, "<string literal>");
    r = StringLiteral_0(b, l + 1);
    if (!r) r = StringLiteral_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // SingleStringLiteral (OPERATOR_PLUS Expression)*
  private static boolean StringLiteral_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StringLiteral_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = SingleStringLiteral(b, l + 1);
    r = r && StringLiteral_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (OPERATOR_PLUS Expression)*
  private static boolean StringLiteral_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StringLiteral_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!StringLiteral_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "StringLiteral_0_1", c)) break;
    }
    return true;
  }

  // OPERATOR_PLUS Expression
  private static boolean StringLiteral_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StringLiteral_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OPERATOR_PLUS);
    r = r && Expression(b, l + 1, -1);
    exit_section_(b, m, null, r);
    return r;
  }

  // SingleStringLiteral (OPERATOR_PLUS SingleStringLiteral)*
  private static boolean StringLiteral_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StringLiteral_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = SingleStringLiteral(b, l + 1);
    r = r && StringLiteral_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (OPERATOR_PLUS SingleStringLiteral)*
  private static boolean StringLiteral_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StringLiteral_1_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!StringLiteral_1_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "StringLiteral_1_1", c)) break;
    }
    return true;
  }

  // OPERATOR_PLUS SingleStringLiteral
  private static boolean StringLiteral_1_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StringLiteral_1_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OPERATOR_PLUS);
    r = r && SingleStringLiteral(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // KEYWORD_SWITCH LEFT_PARENTHESIS Expression RIGHT_PARENTHESIS LEFT_CURLY_BRACE (KEYWORD_CASE Constant COLON (ControlStructureBody (KEYWORD_BREAK SEMICOLON)?))* (KEYWORD_DEFAULT Constant COLON (ControlStructureBody (KEYWORD_BREAK SEMICOLON)?))? RIGHT_CURLY_BRACE
  public static boolean Switch(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Switch")) return false;
    if (!nextTokenIs(b, KEYWORD_SWITCH)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, KEYWORD_SWITCH, LEFT_PARENTHESIS);
    r = r && Expression(b, l + 1, -1);
    r = r && consumeTokens(b, 0, RIGHT_PARENTHESIS, LEFT_CURLY_BRACE);
    r = r && Switch_5(b, l + 1);
    r = r && Switch_6(b, l + 1);
    r = r && consumeToken(b, RIGHT_CURLY_BRACE);
    exit_section_(b, m, SWITCH, r);
    return r;
  }

  // (KEYWORD_CASE Constant COLON (ControlStructureBody (KEYWORD_BREAK SEMICOLON)?))*
  private static boolean Switch_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Switch_5")) return false;
    while (true) {
      int c = current_position_(b);
      if (!Switch_5_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "Switch_5", c)) break;
    }
    return true;
  }

  // KEYWORD_CASE Constant COLON (ControlStructureBody (KEYWORD_BREAK SEMICOLON)?)
  private static boolean Switch_5_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Switch_5_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KEYWORD_CASE);
    r = r && Constant(b, l + 1);
    r = r && consumeToken(b, COLON);
    r = r && Switch_5_0_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ControlStructureBody (KEYWORD_BREAK SEMICOLON)?
  private static boolean Switch_5_0_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Switch_5_0_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ControlStructureBody(b, l + 1);
    r = r && Switch_5_0_3_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (KEYWORD_BREAK SEMICOLON)?
  private static boolean Switch_5_0_3_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Switch_5_0_3_1")) return false;
    Switch_5_0_3_1_0(b, l + 1);
    return true;
  }

  // KEYWORD_BREAK SEMICOLON
  private static boolean Switch_5_0_3_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Switch_5_0_3_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, KEYWORD_BREAK, SEMICOLON);
    exit_section_(b, m, null, r);
    return r;
  }

  // (KEYWORD_DEFAULT Constant COLON (ControlStructureBody (KEYWORD_BREAK SEMICOLON)?))?
  private static boolean Switch_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Switch_6")) return false;
    Switch_6_0(b, l + 1);
    return true;
  }

  // KEYWORD_DEFAULT Constant COLON (ControlStructureBody (KEYWORD_BREAK SEMICOLON)?)
  private static boolean Switch_6_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Switch_6_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KEYWORD_DEFAULT);
    r = r && Constant(b, l + 1);
    r = r && consumeToken(b, COLON);
    r = r && Switch_6_0_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ControlStructureBody (KEYWORD_BREAK SEMICOLON)?
  private static boolean Switch_6_0_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Switch_6_0_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ControlStructureBody(b, l + 1);
    r = r && Switch_6_0_3_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (KEYWORD_BREAK SEMICOLON)?
  private static boolean Switch_6_0_3_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Switch_6_0_3_1")) return false;
    Switch_6_0_3_1_0(b, l + 1);
    return true;
  }

  // KEYWORD_BREAK SEMICOLON
  private static boolean Switch_6_0_3_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Switch_6_0_3_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, KEYWORD_BREAK, SEMICOLON);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // FunctionDefinition | ControlStructure | Statement
  public static boolean TopLevelItem(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TopLevelItem")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TOP_LEVEL_ITEM, "<top level item>");
    r = FunctionDefinition(b, l + 1);
    if (!r) r = ControlStructure(b, l + 1);
    if (!r) r = Statement(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // TYPE_INTEGER | TYPE_FLOAT | TYPE_DATE | TYPE_STRING | TYPE_LIST | TYPE_DICT | TYPE_ANY
  public static boolean Type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Type")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TYPE, "<type>");
    r = consumeToken(b, TYPE_INTEGER);
    if (!r) r = consumeToken(b, TYPE_FLOAT);
    if (!r) r = consumeToken(b, TYPE_DATE);
    if (!r) r = consumeToken(b, TYPE_STRING);
    if (!r) r = consumeToken(b, TYPE_LIST);
    if (!r) r = consumeToken(b, TYPE_DICT);
    if (!r) r = consumeToken(b, TYPE_ANY);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // VISIBILITY_GLOBAL | VISIBILITY_LOCAL
  public static boolean Visibility(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Visibility")) return false;
    if (!nextTokenIs(b, "<visibility>", VISIBILITY_GLOBAL, VISIBILITY_LOCAL)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, VISIBILITY, "<visibility>");
    r = consumeToken(b, VISIBILITY_GLOBAL);
    if (!r) r = consumeToken(b, VISIBILITY_LOCAL);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // KEYWORD_WHILE LEFT_PARENTHESIS Expression RIGHT_PARENTHESIS LEFT_CURLY_BRACE ControlStructureBody RIGHT_CURLY_BRACE
  public static boolean While(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "While")) return false;
    if (!nextTokenIs(b, KEYWORD_WHILE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, KEYWORD_WHILE, LEFT_PARENTHESIS);
    r = r && Expression(b, l + 1, -1);
    r = r && consumeTokens(b, 0, RIGHT_PARENTHESIS, LEFT_CURLY_BRACE);
    r = r && ControlStructureBody(b, l + 1);
    r = r && consumeToken(b, RIGHT_CURLY_BRACE);
    exit_section_(b, m, WHILE, r);
    return r;
  }

  /* ********************************************************** */
  // TopLevelItem*
  static boolean feFile(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "feFile")) return false;
    while (true) {
      int c = current_position_(b);
      if (!TopLevelItem(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "feFile", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // Expression root: Expression
  // Operator priority table:
  // 0: PREFIX(NegatedExpression)
  // 1: BINARY(CombinationExpression)
  // 2: BINARY(ComparisonExpression)
  // 3: BINARY(CalculationExpression)
  // 4: BINARY(ShortIfExpression)
  // 5: ATOM(LeafExpression)
  // 6: PREFIX(ParenthesisExpression)
  public static boolean Expression(PsiBuilder b, int l, int g) {
    if (!recursion_guard_(b, l, "Expression")) return false;
    addVariant(b, "<expression>");
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, "<expression>");
    r = NegatedExpression(b, l + 1);
    if (!r) r = LeafExpression(b, l + 1);
    if (!r) r = ParenthesisExpression(b, l + 1);
    p = r;
    r = r && Expression_0(b, l + 1, g);
    exit_section_(b, l, m, null, r, p, null);
    return r || p;
  }

  public static boolean Expression_0(PsiBuilder b, int l, int g) {
    if (!recursion_guard_(b, l, "Expression_0")) return false;
    boolean r = true;
    while (true) {
      Marker m = enter_section_(b, l, _LEFT_, null);
      if (g < 1 && CombinationOperator(b, l + 1)) {
        r = Expression(b, l, 1);
        exit_section_(b, l, m, COMBINATION_EXPRESSION, r, true, null);
      }
      else if (g < 2 && ComparisonOperator(b, l + 1)) {
        r = Expression(b, l, 2);
        exit_section_(b, l, m, COMPARISON_EXPRESSION, r, true, null);
      }
      else if (g < 3 && CalculationOperator(b, l + 1)) {
        r = Expression(b, l, 3);
        exit_section_(b, l, m, CALCULATION_EXPRESSION, r, true, null);
      }
      else if (g < 4 && consumeTokenSmart(b, QUESIONMARK)) {
        r = report_error_(b, Expression(b, l, 4));
        r = ShortIfExpression_1(b, l + 1) && r;
        exit_section_(b, l, m, SHORT_IF_EXPRESSION, r, true, null);
      }
      else {
        exit_section_(b, l, m, null, false, false, null);
        break;
      }
    }
    return r;
  }

  public static boolean NegatedExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NegatedExpression")) return false;
    if (!nextTokenIsSmart(b, OPERATOR_NEGATION)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = consumeTokenSmart(b, OPERATOR_NEGATION);
    p = r;
    r = p && Expression(b, l, 0);
    exit_section_(b, l, m, NEGATED_EXPRESSION, r, p, null);
    return r || p;
  }

  // COLON Expression
  private static boolean ShortIfExpression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ShortIfExpression_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COLON);
    r = r && Expression(b, l + 1, -1);
    exit_section_(b, m, null, r);
    return r;
  }

  // FunctionInvocation | Constant  | ArrayAccess | PrefixOperator IDENTIFIER | IDENTIFIER PostfixOperator | IDENTIFIER
  public static boolean LeafExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LeafExpression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LEAF_EXPRESSION, "<leaf expression>");
    r = FunctionInvocation(b, l + 1);
    if (!r) r = Constant(b, l + 1);
    if (!r) r = ArrayAccess(b, l + 1);
    if (!r) r = LeafExpression_3(b, l + 1);
    if (!r) r = LeafExpression_4(b, l + 1);
    if (!r) r = consumeTokenSmart(b, IDENTIFIER);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // PrefixOperator IDENTIFIER
  private static boolean LeafExpression_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LeafExpression_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = PrefixOperator(b, l + 1);
    r = r && consumeToken(b, IDENTIFIER);
    exit_section_(b, m, null, r);
    return r;
  }

  // IDENTIFIER PostfixOperator
  private static boolean LeafExpression_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LeafExpression_4")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, IDENTIFIER);
    r = r && PostfixOperator(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  public static boolean ParenthesisExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ParenthesisExpression")) return false;
    if (!nextTokenIsSmart(b, LEFT_PARENTHESIS)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = consumeTokenSmart(b, LEFT_PARENTHESIS);
    p = r;
    r = p && Expression(b, l, -1);
    r = p && report_error_(b, consumeToken(b, RIGHT_PARENTHESIS)) && r;
    exit_section_(b, l, m, PARENTHESIS_EXPRESSION, r, p, null);
    return r || p;
  }

}
