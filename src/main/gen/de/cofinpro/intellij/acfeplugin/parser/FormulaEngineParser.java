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
  // VisibilityPrefix? TypePrefix IDENTIFIER '=' (Constant | FunctionInvocation)
  public static boolean Assignment(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Assignment")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ASSIGNMENT, "<assignment>");
    r = Assignment_0(b, l + 1);
    r = r && TypePrefix(b, l + 1);
    r = r && consumeTokens(b, 0, IDENTIFIER, OPERATOR_EQUALS);
    r = r && Assignment_4(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // VisibilityPrefix?
  private static boolean Assignment_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Assignment_0")) return false;
    VisibilityPrefix(b, l + 1);
    return true;
  }

  // Constant | FunctionInvocation
  private static boolean Assignment_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Assignment_4")) return false;
    boolean r;
    r = Constant(b, l + 1);
    if (!r) r = FunctionInvocation(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // attribute | status
  //     | date | datetime | str
  //     | elt
  //     | is_list | is_na
  //     | len
  //     | load
  //     | remove
  public static boolean BuiltInFunctionName(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BuiltInFunctionName")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BUILT_IN_FUNCTION_NAME, "<built in function name>");
    r = consumeToken(b, ATTRIBUTE);
    if (!r) r = consumeToken(b, STATUS);
    if (!r) r = consumeToken(b, DATE);
    if (!r) r = consumeToken(b, DATETIME);
    if (!r) r = consumeToken(b, STR);
    if (!r) r = consumeToken(b, ELT);
    if (!r) r = consumeToken(b, IS_LIST);
    if (!r) r = consumeToken(b, IS_NA);
    if (!r) r = consumeToken(b, LEN);
    if (!r) r = consumeToken(b, LOAD);
    if (!r) r = consumeToken(b, REMOVE);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // BUILT_IN_VAR_NA
  public static boolean BuiltInVariableName(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BuiltInVariableName")) return false;
    if (!nextTokenIs(b, BUILT_IN_VAR_NA)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, BUILT_IN_VAR_NA);
    exit_section_(b, m, BUILT_IN_VARIABLE_NAME, r);
    return r;
  }

  /* ********************************************************** */
  // BuiltInVariableName
  public static boolean Constant(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Constant")) return false;
    if (!nextTokenIs(b, BUILT_IN_VAR_NA)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = BuiltInVariableName(b, l + 1);
    exit_section_(b, m, CONSTANT, r);
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
  // IDENTIFIER (',' IDENTIFIER)*
  public static boolean FunctionArguments(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionArguments")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    r = r && FunctionArguments_1(b, l + 1);
    exit_section_(b, m, FUNCTION_ARGUMENTS, r);
    return r;
  }

  // (',' IDENTIFIER)*
  private static boolean FunctionArguments_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionArguments_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!FunctionArguments_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "FunctionArguments_1", c)) break;
    }
    return true;
  }

  // ',' IDENTIFIER
  private static boolean FunctionArguments_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionArguments_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
    r = r && consumeToken(b, IDENTIFIER);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // Statement*
  public static boolean FunctionBody(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionBody")) return false;
    Marker m = enter_section_(b, l, _NONE_, FUNCTION_BODY, "<function body>");
    while (true) {
      int c = current_position_(b);
      if (!Statement(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "FunctionBody", c)) break;
    }
    exit_section_(b, l, m, true, false, null);
    return true;
  }

  /* ********************************************************** */
  // function IDENTIFIER '(' FunctionParameters? ')' '{' FunctionBody '}'
  public static boolean FunctionDefinition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionDefinition")) return false;
    if (!nextTokenIs(b, FUNCTION)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, FUNCTION, IDENTIFIER, LEFT_PARENTHESIS);
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
  // (BuiltInFunctionName | CustomFunctionName) '(' FunctionArguments? ')'
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
  // TypePrefix? IDENTIFIER
  public static boolean FunctionParameter(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionParameter")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FUNCTION_PARAMETER, "<function parameter>");
    r = FunctionParameter_0(b, l + 1);
    r = r && consumeToken(b, IDENTIFIER);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // TypePrefix?
  private static boolean FunctionParameter_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionParameter_0")) return false;
    TypePrefix(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // FunctionParameter (',' FunctionParameter)*
  public static boolean FunctionParameters(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionParameters")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FUNCTION_PARAMETERS, "<function parameters>");
    r = FunctionParameter(b, l + 1);
    r = r && FunctionParameters_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (',' FunctionParameter)*
  private static boolean FunctionParameters_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionParameters_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!FunctionParameters_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "FunctionParameters_1", c)) break;
    }
    return true;
  }

  // ',' FunctionParameter
  private static boolean FunctionParameters_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionParameters_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
    r = r && FunctionParameter(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // return IDENTIFIER
  public static boolean ReturnStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ReturnStatement")) return false;
    if (!nextTokenIs(b, RETURN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, RETURN, IDENTIFIER);
    exit_section_(b, m, RETURN_STATEMENT, r);
    return r;
  }

  /* ********************************************************** */
  // (Assignment | ReturnStatement) ';'
  public static boolean Statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Statement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STATEMENT, "<statement>");
    r = Statement_0(b, l + 1);
    r = r && consumeToken(b, ";");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // Assignment | ReturnStatement
  private static boolean Statement_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Statement_0")) return false;
    boolean r;
    r = Assignment(b, l + 1);
    if (!r) r = ReturnStatement(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // integer | float | date | string | list | dict | any
  public static boolean TypePrefix(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypePrefix")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TYPE_PREFIX, "<type prefix>");
    r = consumeToken(b, INTEGER);
    if (!r) r = consumeToken(b, FLOAT);
    if (!r) r = consumeToken(b, DATE);
    if (!r) r = consumeToken(b, STRING);
    if (!r) r = consumeToken(b, LIST);
    if (!r) r = consumeToken(b, DICT);
    if (!r) r = consumeToken(b, ANY);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // local | global
  public static boolean VisibilityPrefix(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VisibilityPrefix")) return false;
    if (!nextTokenIs(b, "<visibility prefix>", GLOBAL, LOCAL)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, VISIBILITY_PREFIX, "<visibility prefix>");
    r = consumeToken(b, LOCAL);
    if (!r) r = consumeToken(b, GLOBAL);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // FunctionDefinition*
  static boolean feFile(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "feFile")) return false;
    while (true) {
      int c = current_position_(b);
      if (!FunctionDefinition(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "feFile", c)) break;
    }
    return true;
  }

}
