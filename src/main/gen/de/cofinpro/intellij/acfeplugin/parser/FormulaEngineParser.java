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
    b = adapt_builder_(t, b, this, null);
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

  /* ********************************************************** */
  // IDENTIFIER (LEFT_BRACKET NUMBER_INTEGER RIGHT_BRACKET)+
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

  // (LEFT_BRACKET NUMBER_INTEGER RIGHT_BRACKET)+
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

  // LEFT_BRACKET NUMBER_INTEGER RIGHT_BRACKET
  private static boolean ArrayAccess_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ArrayAccess_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, LEFT_BRACKET, NUMBER_INTEGER, RIGHT_BRACKET);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // Declaration OPERATOR_ASSIGNMENT Expression
  public static boolean Assignment(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Assignment")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ASSIGNMENT, "<assignment>");
    r = Declaration(b, l + 1);
    r = r && consumeToken(b, OPERATOR_ASSIGNMENT);
    r = r && Expression(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // BUILT_IN_FUNC_ATTRIBUTE | BUILT_IN_FUNC_STATUS
  //     | BUILT_IN_FUNC_DATE | BUILT_IN_FUNC_DATETIME | BUILT_IN_FUNC_STR | BUILT_IN_FUNC_FLOAT | BUILT_IN_FUNC_INTEGER
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
  // BuiltInVariableName | NUMBER_INTEGER | StringLiteral | ListLiteral
  public static boolean Constant(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Constant")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CONSTANT, "<constant>");
    r = BuiltInVariableName(b, l + 1);
    if (!r) r = consumeToken(b, NUMBER_INTEGER);
    if (!r) r = StringLiteral(b, l + 1);
    if (!r) r = ListLiteral(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ControlStructureKeyword LEFT_PARENTHESIS Expression RIGHT_PARENTHESIS LEFT_CURLY_BRACE ControlStructureBody RIGHT_CURLY_BRACE
  public static boolean ControlStructure(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ControlStructure")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CONTROL_STRUCTURE, "<control structure>");
    r = ControlStructureKeyword(b, l + 1);
    r = r && consumeToken(b, LEFT_PARENTHESIS);
    r = r && Expression(b, l + 1);
    r = r && consumeTokens(b, 0, RIGHT_PARENTHESIS, LEFT_CURLY_BRACE);
    r = r && ControlStructureBody(b, l + 1);
    r = r && consumeToken(b, RIGHT_CURLY_BRACE);
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
  // ControlStructureKeyword LEFT_PARENTHESIS Expression RIGHT_PARENTHESIS LEFT_CURLY_BRACE ControlStructureInFunctionBody RIGHT_CURLY_BRACE
  public static boolean ControlStructureInFunction(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ControlStructureInFunction")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CONTROL_STRUCTURE_IN_FUNCTION, "<control structure in function>");
    r = ControlStructureKeyword(b, l + 1);
    r = r && consumeToken(b, LEFT_PARENTHESIS);
    r = r && Expression(b, l + 1);
    r = r && consumeTokens(b, 0, RIGHT_PARENTHESIS, LEFT_CURLY_BRACE);
    r = r && ControlStructureInFunctionBody(b, l + 1);
    r = r && consumeToken(b, RIGHT_CURLY_BRACE);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // (ControlStructureInFunction | Statement | (ReturnStatement ';'))*
  public static boolean ControlStructureInFunctionBody(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ControlStructureInFunctionBody")) return false;
    Marker m = enter_section_(b, l, _NONE_, CONTROL_STRUCTURE_IN_FUNCTION_BODY, "<control structure in function body>");
    while (true) {
      int c = current_position_(b);
      if (!ControlStructureInFunctionBody_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ControlStructureInFunctionBody", c)) break;
    }
    exit_section_(b, l, m, true, false, null);
    return true;
  }

  // ControlStructureInFunction | Statement | (ReturnStatement ';')
  private static boolean ControlStructureInFunctionBody_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ControlStructureInFunctionBody_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ControlStructureInFunction(b, l + 1);
    if (!r) r = Statement(b, l + 1);
    if (!r) r = ControlStructureInFunctionBody_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ReturnStatement ';'
  private static boolean ControlStructureInFunctionBody_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ControlStructureInFunctionBody_0_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ReturnStatement(b, l + 1);
    r = r && consumeToken(b, ";");
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // KEYWORD_IF | KEYWORD_FOR | KEYWORD_WHILE
  public static boolean ControlStructureKeyword(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ControlStructureKeyword")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CONTROL_STRUCTURE_KEYWORD, "<control structure keyword>");
    r = consumeToken(b, KEYWORD_IF);
    if (!r) r = consumeToken(b, KEYWORD_FOR);
    if (!r) r = consumeToken(b, KEYWORD_WHILE);
    exit_section_(b, l, m, r, false, null);
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
  // SingleExpression (Operator SingleExpression)*
  public static boolean Expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Expression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXPRESSION, "<expression>");
    r = SingleExpression(b, l + 1);
    r = r && Expression_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (Operator SingleExpression)*
  private static boolean Expression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Expression_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!Expression_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "Expression_1", c)) break;
    }
    return true;
  }

  // Operator SingleExpression
  private static boolean Expression_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Expression_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Operator(b, l + 1);
    r = r && SingleExpression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // Expression
  public static boolean FunctionArgument(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionArgument")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FUNCTION_ARGUMENT, "<function argument>");
    r = Expression(b, l + 1);
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
  // ControlStructureInFunction | ((FunctionInvocation | Assignment | Declaration | ReturnStatement) ';')
  public static boolean FunctionBodyStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionBodyStatement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FUNCTION_BODY_STATEMENT, "<function body statement>");
    r = ControlStructureInFunction(b, l + 1);
    if (!r) r = FunctionBodyStatement_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (FunctionInvocation | Assignment | Declaration | ReturnStatement) ';'
  private static boolean FunctionBodyStatement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionBodyStatement_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = FunctionBodyStatement_1_0(b, l + 1);
    r = r && consumeToken(b, ";");
    exit_section_(b, m, null, r);
    return r;
  }

  // FunctionInvocation | Assignment | Declaration | ReturnStatement
  private static boolean FunctionBodyStatement_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionBodyStatement_1_0")) return false;
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
    r = Expression(b, l + 1);
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
    r = r && Expression(b, l + 1);
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
  // OPERATOR_NEGATION SingleExpression | OPERATOR_NEGATION LEFT_PARENTHESIS SingleExpression RIGHT_PARENTHESIS
  public static boolean NegatedExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NegatedExpression")) return false;
    if (!nextTokenIs(b, OPERATOR_NEGATION)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = NegatedExpression_0(b, l + 1);
    if (!r) r = NegatedExpression_1(b, l + 1);
    exit_section_(b, m, NEGATED_EXPRESSION, r);
    return r;
  }

  // OPERATOR_NEGATION SingleExpression
  private static boolean NegatedExpression_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NegatedExpression_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OPERATOR_NEGATION);
    r = r && SingleExpression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // OPERATOR_NEGATION LEFT_PARENTHESIS SingleExpression RIGHT_PARENTHESIS
  private static boolean NegatedExpression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NegatedExpression_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, OPERATOR_NEGATION, LEFT_PARENTHESIS);
    r = r && SingleExpression(b, l + 1);
    r = r && consumeToken(b, RIGHT_PARENTHESIS);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // OPERATOR_AND | OPERATOR_EQUAL | OPERATOR_MODULO | OPERATOR_NOTEQUAL | OPERATOR_OR
  public static boolean Operator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Operator")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, OPERATOR, "<operator>");
    r = consumeToken(b, OPERATOR_AND);
    if (!r) r = consumeToken(b, OPERATOR_EQUAL);
    if (!r) r = consumeToken(b, OPERATOR_MODULO);
    if (!r) r = consumeToken(b, OPERATOR_NOTEQUAL);
    if (!r) r = consumeToken(b, OPERATOR_OR);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // KEYWORD_RETURN IDENTIFIER
  public static boolean ReturnStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ReturnStatement")) return false;
    if (!nextTokenIs(b, KEYWORD_RETURN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, KEYWORD_RETURN, IDENTIFIER);
    exit_section_(b, m, RETURN_STATEMENT, r);
    return r;
  }

  /* ********************************************************** */
  // FunctionInvocation | Constant | NegatedExpression | ArrayAccess | IDENTIFIER
  public static boolean SingleExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SingleExpression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SINGLE_EXPRESSION, "<single expression>");
    r = FunctionInvocation(b, l + 1);
    if (!r) r = Constant(b, l + 1);
    if (!r) r = NegatedExpression(b, l + 1);
    if (!r) r = ArrayAccess(b, l + 1);
    if (!r) r = consumeToken(b, IDENTIFIER);
    exit_section_(b, l, m, r, false, null);
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
  // (FunctionInvocation | Assignment | Declaration) ';'
  public static boolean Statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Statement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STATEMENT, "<statement>");
    r = Statement_0(b, l + 1);
    r = r && consumeToken(b, ";");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // FunctionInvocation | Assignment | Declaration
  private static boolean Statement_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Statement_0")) return false;
    boolean r;
    r = FunctionInvocation(b, l + 1);
    if (!r) r = Assignment(b, l + 1);
    if (!r) r = Declaration(b, l + 1);
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
    r = r && Expression(b, l + 1);
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

}
