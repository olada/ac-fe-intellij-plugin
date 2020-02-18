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
  // VisibilityPrefix? TypePrefix IDENTIFIER '=' FunctionInvocation
  public static boolean Assignment(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Assignment")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ASSIGNMENT, "<assignment>");
    r = Assignment_0(b, l + 1);
    r = r && TypePrefix(b, l + 1);
    r = r && consumeTokens(b, 0, IDENTIFIER, OPERATOR_EQUALS);
    r = r && FunctionInvocation(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // VisibilityPrefix?
  private static boolean Assignment_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Assignment_0")) return false;
    VisibilityPrefix(b, l + 1);
    return true;
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
  // IDENTIFIER '(' FunctionArguments? ')'
  public static boolean FunctionInvocation(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionInvocation")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, IDENTIFIER, LEFT_PARENTHESIS);
    r = r && FunctionInvocation_2(b, l + 1);
    r = r && consumeToken(b, RIGHT_PARENTHESIS);
    exit_section_(b, m, FUNCTION_INVOCATION, r);
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
  // Assignment ';'
  public static boolean Statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Statement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STATEMENT, "<statement>");
    r = Assignment(b, l + 1);
    r = r && consumeToken(b, ";");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // integer | string | list | dict | any
  public static boolean TypePrefix(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypePrefix")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TYPE_PREFIX, "<type prefix>");
    r = consumeToken(b, INTEGER);
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
