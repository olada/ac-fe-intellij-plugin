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
      LEAF_EXPRESSION, NEGATED_EXPRESSION, PARENTHESIS_EXPRESSION, SHORT_IF_EXPRESSION,
      UNARY_EXPRESSION),
  };

  /* ********************************************************** */
  // (BuiltInVariableName | IdentifierLiteral) (LEFT_BRACKET Expression RIGHT_BRACKET)+
  public static boolean ArrayAccess(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ArrayAccess")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ARRAY_ACCESS, "<array access>");
    r = ArrayAccess_0(b, l + 1);
    r = r && ArrayAccess_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // BuiltInVariableName | IdentifierLiteral
  private static boolean ArrayAccess_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ArrayAccess_0")) return false;
    boolean r;
    r = BuiltInVariableName(b, l + 1);
    if (!r) r = IdentifierLiteral(b, l + 1);
    return r;
  }

  // (LEFT_BRACKET Expression RIGHT_BRACKET)+
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

  // LEFT_BRACKET Expression RIGHT_BRACKET
  private static boolean ArrayAccess_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ArrayAccess_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LEFT_BRACKET);
    r = r && Expression(b, l + 1, -1);
    r = r && consumeToken(b, RIGHT_BRACKET);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // RegularAssignment | IdentifierLiteral PostfixOperator | PrefixOperator IdentifierLiteral | OPERATOR_MINUS IdentifierLiteral
  public static boolean Assignment(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Assignment")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ASSIGNMENT, "<assignment>");
    r = RegularAssignment(b, l + 1);
    if (!r) r = Assignment_1(b, l + 1);
    if (!r) r = Assignment_2(b, l + 1);
    if (!r) r = Assignment_3(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // IdentifierLiteral PostfixOperator
  private static boolean Assignment_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Assignment_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = IdentifierLiteral(b, l + 1);
    r = r && PostfixOperator(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // PrefixOperator IdentifierLiteral
  private static boolean Assignment_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Assignment_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = PrefixOperator(b, l + 1);
    r = r && IdentifierLiteral(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // OPERATOR_MINUS IdentifierLiteral
  private static boolean Assignment_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Assignment_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OPERATOR_MINUS);
    r = r && IdentifierLiteral(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // OPERATOR_ADDASSIGNMENT | OPERATOR_SUBTRACTASSIGNMENT | OPERATOR_MULTIPLYASSIGNMENT | OPERATOR_DIVIDEASSIGNMENT | OPERATOR_MODULOASSIGNMENT | OPERATOR_ASSIGNMENT
  static boolean AssignmentOperator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AssignmentOperator")) return false;
    boolean r;
    r = consumeToken(b, OPERATOR_ADDASSIGNMENT);
    if (!r) r = consumeToken(b, OPERATOR_SUBTRACTASSIGNMENT);
    if (!r) r = consumeToken(b, OPERATOR_MULTIPLYASSIGNMENT);
    if (!r) r = consumeToken(b, OPERATOR_DIVIDEASSIGNMENT);
    if (!r) r = consumeToken(b, OPERATOR_MODULOASSIGNMENT);
    if (!r) r = consumeToken(b, OPERATOR_ASSIGNMENT);
    return r;
  }

  /* ********************************************************** */
  // BUILT_IN_FUNC_ADO_BROWSE
  //     | BUILT_IN_FUNC_ATTRIBUTE
  //     | BUILT_IN_FUNC_BSEARCH
  //     | BUILT_IN_FUNC_CORRECT_PRICE_FIELD
  //     | BUILT_IN_FUNC_DATE | BUILT_IN_FUNC_DATETIME
  //     | BUILT_IN_FUNC_DICT | BUILT_IN_FUNC_DICT_GET | BUILT_IN_FUNC_DICT_ISKEY
  //     | BUILT_IN_FUNC_DICT_KEYS | BUILT_IN_FUNC_DICT_PUT | BUILT_IN_FUNC_DICT_VALUES
  //     | BUILT_IN_FUNC_STR | BUILT_IN_FUNC_FLOAT | BUILT_IN_FUNC_INTEGER | BUILT_IN_FUNC_LIST | BUILT_IN_FUNC_STRING | BUILT_IN_FUNC_BOOL
  //     | BUILT_IN_FUNC_DAYDIFF | BUILT_IN_FUNC_DAYPLUS
  //     | BUILT_IN_FUNC_ELT
  //     | BUILT_IN_FUNC_EVALUATE
  //     | BUILT_IN_FUNC_FIRST
  //     | BUILT_IN_FUNC_HASH_GET | BUILT_IN_FUNC_HASH_GLOBAL | BUILT_IN_FUNC_HASH_PUT | BUILT_IN_FUNC_HASH_ISKEY | BUILT_IN_FUNC_HASH_KEYS
  //     | BUILT_IN_FUNC_INSERT
  //     | BUILT_IN_FUNC_IS_DATE | BUILT_IN_FUNC_IS_DATETIME | BUILT_IN_FUNC_IS_FLOAT | BUILT_IN_FUNC_IS_INTEGER | BUILT_IN_FUNC_IS_LIST
  //     | BUILT_IN_FUNC_IS_MATRIX | BUILT_IN_FUNC_IS_NA | BUILT_IN_FUNC_IS_NUMBER | BUILT_IN_FUNC_IS_OPAQUE | BUILT_IN_FUNC_IS_STRING
  //     | BUILT_IN_FUNC_IS_TIME
  //     | BUILT_IN_FUNC_KERNEL
  //     | BUILT_IN_FUNC_LAST
  //     | BUILT_IN_FUNC_LEN
  //     | BUILT_IN_FUNC_LOAD
  //     | BUILT_IN_FUNC_LSEARCH
  //     | BUILT_IN_FUNC_PRICE_FIELD
  //     | BUILT_IN_FUNC_MAP
  //     | BUILT_IN_FUNC_MAX
  //     | BUILT_IN_FUNC_OUT
  //     | BUILT_IN_FUNC_RDBMS_PROC
  //     | BUILT_IN_FUNC_REGEX_MATCH
  //     | BUILT_IN_FUNC_REMOVE
  //     | BUILT_IN_FUNC_SECOND
  //     | BUILT_IN_FUNC_SET_SUSPECT_PRICE_FIELD
  //     | BUILT_IN_FUNC_SQL
  //     | BUILT_IN_FUNC_SORT
  //     | BUILT_IN_FUNC_SPLIT
  //     | BUILT_IN_FUNC_STATUS
  //     | BUILT_IN_FUNC_STRIP
  //     | BUILT_IN_FUNC_STRVAL
  //     | BUILT_IN_FUNC_TIME
  //     | BUILT_IN_FUNC_TOUPPER
  //     | BUILT_IN_FUNC_TS
  //     | BUILT_IN_FUNC_TS_UPDATE
  //     | BUILT_IN_FUNC_YEAR_FRACTION
  public static boolean BuiltInFunctionName(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BuiltInFunctionName")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BUILT_IN_FUNCTION_NAME, "<built in function name>");
    r = consumeToken(b, BUILT_IN_FUNC_ADO_BROWSE);
    if (!r) r = consumeToken(b, BUILT_IN_FUNC_ATTRIBUTE);
    if (!r) r = consumeToken(b, BUILT_IN_FUNC_BSEARCH);
    if (!r) r = consumeToken(b, BUILT_IN_FUNC_CORRECT_PRICE_FIELD);
    if (!r) r = consumeToken(b, BUILT_IN_FUNC_DATE);
    if (!r) r = consumeToken(b, BUILT_IN_FUNC_DATETIME);
    if (!r) r = consumeToken(b, BUILT_IN_FUNC_DICT);
    if (!r) r = consumeToken(b, BUILT_IN_FUNC_DICT_GET);
    if (!r) r = consumeToken(b, BUILT_IN_FUNC_DICT_ISKEY);
    if (!r) r = consumeToken(b, BUILT_IN_FUNC_DICT_KEYS);
    if (!r) r = consumeToken(b, BUILT_IN_FUNC_DICT_PUT);
    if (!r) r = consumeToken(b, BUILT_IN_FUNC_DICT_VALUES);
    if (!r) r = consumeToken(b, BUILT_IN_FUNC_STR);
    if (!r) r = consumeToken(b, BUILT_IN_FUNC_FLOAT);
    if (!r) r = consumeToken(b, BUILT_IN_FUNC_INTEGER);
    if (!r) r = consumeToken(b, BUILT_IN_FUNC_LIST);
    if (!r) r = consumeToken(b, BUILT_IN_FUNC_STRING);
    if (!r) r = consumeToken(b, BUILT_IN_FUNC_BOOL);
    if (!r) r = consumeToken(b, BUILT_IN_FUNC_DAYDIFF);
    if (!r) r = consumeToken(b, BUILT_IN_FUNC_DAYPLUS);
    if (!r) r = consumeToken(b, BUILT_IN_FUNC_ELT);
    if (!r) r = consumeToken(b, BUILT_IN_FUNC_EVALUATE);
    if (!r) r = consumeToken(b, BUILT_IN_FUNC_FIRST);
    if (!r) r = consumeToken(b, BUILT_IN_FUNC_HASH_GET);
    if (!r) r = consumeToken(b, BUILT_IN_FUNC_HASH_GLOBAL);
    if (!r) r = consumeToken(b, BUILT_IN_FUNC_HASH_PUT);
    if (!r) r = consumeToken(b, BUILT_IN_FUNC_HASH_ISKEY);
    if (!r) r = consumeToken(b, BUILT_IN_FUNC_HASH_KEYS);
    if (!r) r = consumeToken(b, BUILT_IN_FUNC_INSERT);
    if (!r) r = consumeToken(b, BUILT_IN_FUNC_IS_DATE);
    if (!r) r = consumeToken(b, BUILT_IN_FUNC_IS_DATETIME);
    if (!r) r = consumeToken(b, BUILT_IN_FUNC_IS_FLOAT);
    if (!r) r = consumeToken(b, BUILT_IN_FUNC_IS_INTEGER);
    if (!r) r = consumeToken(b, BUILT_IN_FUNC_IS_LIST);
    if (!r) r = consumeToken(b, BUILT_IN_FUNC_IS_MATRIX);
    if (!r) r = consumeToken(b, BUILT_IN_FUNC_IS_NA);
    if (!r) r = consumeToken(b, BUILT_IN_FUNC_IS_NUMBER);
    if (!r) r = consumeToken(b, BUILT_IN_FUNC_IS_OPAQUE);
    if (!r) r = consumeToken(b, BUILT_IN_FUNC_IS_STRING);
    if (!r) r = consumeToken(b, BUILT_IN_FUNC_IS_TIME);
    if (!r) r = consumeToken(b, BUILT_IN_FUNC_KERNEL);
    if (!r) r = consumeToken(b, BUILT_IN_FUNC_LAST);
    if (!r) r = consumeToken(b, BUILT_IN_FUNC_LEN);
    if (!r) r = consumeToken(b, BUILT_IN_FUNC_LOAD);
    if (!r) r = consumeToken(b, BUILT_IN_FUNC_LSEARCH);
    if (!r) r = consumeToken(b, BUILT_IN_FUNC_PRICE_FIELD);
    if (!r) r = consumeToken(b, BUILT_IN_FUNC_MAP);
    if (!r) r = consumeToken(b, BUILT_IN_FUNC_MAX);
    if (!r) r = consumeToken(b, BUILT_IN_FUNC_OUT);
    if (!r) r = consumeToken(b, BUILT_IN_FUNC_RDBMS_PROC);
    if (!r) r = consumeToken(b, BUILT_IN_FUNC_REGEX_MATCH);
    if (!r) r = consumeToken(b, BUILT_IN_FUNC_REMOVE);
    if (!r) r = consumeToken(b, BUILT_IN_FUNC_SECOND);
    if (!r) r = consumeToken(b, BUILT_IN_FUNC_SET_SUSPECT_PRICE_FIELD);
    if (!r) r = consumeToken(b, BUILT_IN_FUNC_SQL);
    if (!r) r = consumeToken(b, BUILT_IN_FUNC_SORT);
    if (!r) r = consumeToken(b, BUILT_IN_FUNC_SPLIT);
    if (!r) r = consumeToken(b, BUILT_IN_FUNC_STATUS);
    if (!r) r = consumeToken(b, BUILT_IN_FUNC_STRIP);
    if (!r) r = consumeToken(b, BUILT_IN_FUNC_STRVAL);
    if (!r) r = consumeToken(b, BUILT_IN_FUNC_TIME);
    if (!r) r = consumeToken(b, BUILT_IN_FUNC_TOUPPER);
    if (!r) r = consumeToken(b, BUILT_IN_FUNC_TS);
    if (!r) r = consumeToken(b, BUILT_IN_FUNC_TS_UPDATE);
    if (!r) r = consumeToken(b, BUILT_IN_FUNC_YEAR_FRACTION);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // BUILT_IN_VAR_NA
  //                         | BUILT_IN_VAR_TODAY
  //                         | BUILT_IN_VAR_TIMETODAY
  //                         | BUILT_IN_VAR_SYMBOL
  //                         | BUILT_IN_VAR_NAME
  //                         | BUILT_IN_VAR_PROCESSED
  //                         | BUILT_IN_VAR_PASSED
  //                         | BUILT_IN_VAR_LISTID
  //                         | BUILT_IN_VAR_LISTTP
  //                         | BUILT_IN_VAR_TREEID
  //                         | BUILT_IN_VAR_FIELD
  //                         | BUILT_IN_VAR_FIELDS
  //                         | BUILT_IN_VAR_DATA
  //                         | BUILT_IN_VAR_DATETIME
  //                         | BUILT_IN_VAR_STATUS
  //                         | BUILT_IN_VAR_DEPENDENCIES
  //                         | BUILT_IN_VAR_DEPENDENCIES_TRIGGERS
  public static boolean BuiltInVariableName(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BuiltInVariableName")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BUILT_IN_VARIABLE_NAME, "<built in variable name>");
    r = consumeToken(b, BUILT_IN_VAR_NA);
    if (!r) r = consumeToken(b, BUILT_IN_VAR_TODAY);
    if (!r) r = consumeToken(b, BUILT_IN_VAR_TIMETODAY);
    if (!r) r = consumeToken(b, BUILT_IN_VAR_SYMBOL);
    if (!r) r = consumeToken(b, BUILT_IN_VAR_NAME);
    if (!r) r = consumeToken(b, BUILT_IN_VAR_PROCESSED);
    if (!r) r = consumeToken(b, BUILT_IN_VAR_PASSED);
    if (!r) r = consumeToken(b, BUILT_IN_VAR_LISTID);
    if (!r) r = consumeToken(b, BUILT_IN_VAR_LISTTP);
    if (!r) r = consumeToken(b, BUILT_IN_VAR_TREEID);
    if (!r) r = consumeToken(b, BUILT_IN_VAR_FIELD);
    if (!r) r = consumeToken(b, BUILT_IN_VAR_FIELDS);
    if (!r) r = consumeToken(b, BUILT_IN_VAR_DATA);
    if (!r) r = consumeToken(b, BUILT_IN_VAR_DATETIME);
    if (!r) r = consumeToken(b, BUILT_IN_VAR_STATUS);
    if (!r) r = consumeToken(b, BUILT_IN_VAR_DEPENDENCIES);
    if (!r) r = consumeToken(b, BUILT_IN_VAR_DEPENDENCIES_TRIGGERS);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // OPERATOR_MODULO | OPERATOR_PLUS | OPERATOR_MINUS | OPERATOR_MULTIPLY | OPERATOR_DIVIDE | OPERATOR_POWER
  static boolean CalculationOperator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CalculationOperator")) return false;
    boolean r;
    r = consumeToken(b, OPERATOR_MODULO);
    if (!r) r = consumeToken(b, OPERATOR_PLUS);
    if (!r) r = consumeToken(b, OPERATOR_MINUS);
    if (!r) r = consumeToken(b, OPERATOR_MULTIPLY);
    if (!r) r = consumeToken(b, OPERATOR_DIVIDE);
    if (!r) r = consumeToken(b, OPERATOR_POWER);
    return r;
  }

  /* ********************************************************** */
  // OPERATOR_AND | OPERATOR_OR | KEYWORD_AND | KEYWORD_OR
  static boolean CombinationOperator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CombinationOperator")) return false;
    boolean r;
    r = consumeToken(b, OPERATOR_AND);
    if (!r) r = consumeToken(b, OPERATOR_OR);
    if (!r) r = consumeToken(b, KEYWORD_AND);
    if (!r) r = consumeToken(b, KEYWORD_OR);
    return r;
  }

  /* ********************************************************** */
  // OPERATOR_EQUAL | OPERATOR_NOTEQUAL | OPERATOR_GREATERTHANEQUAL | OPERATOR_GREATERTHAN | OPERATOR_LESSTHANEQUAL | OPERATOR_LESSTHAN
  static boolean ComparisonOperator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ComparisonOperator")) return false;
    boolean r;
    r = consumeToken(b, OPERATOR_EQUAL);
    if (!r) r = consumeToken(b, OPERATOR_NOTEQUAL);
    if (!r) r = consumeToken(b, OPERATOR_GREATERTHANEQUAL);
    if (!r) r = consumeToken(b, OPERATOR_GREATERTHAN);
    if (!r) r = consumeToken(b, OPERATOR_LESSTHANEQUAL);
    if (!r) r = consumeToken(b, OPERATOR_LESSTHAN);
    return r;
  }

  /* ********************************************************** */
  // BuiltInVariableName | NumberLiteral | StringLiteral | ListLiteral
  public static boolean Constant(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Constant")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CONSTANT, "<constant>");
    r = BuiltInVariableName(b, l + 1);
    if (!r) r = NumberLiteral(b, l + 1);
    if (!r) r = StringLiteral(b, l + 1);
    if (!r) r = ListLiteral(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
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
  static boolean CustomFunctionName(PsiBuilder b, int l) {
    return consumeToken(b, IDENTIFIER);
  }

  /* ********************************************************** */
  // (FullDeclaration | DeclarationWithoutType) DeclarationInitialization?
  public static boolean Declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Declaration")) return false;
    if (!nextTokenIs(b, "<declaration>", VISIBILITY_GLOBAL, VISIBILITY_LOCAL)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DECLARATION, "<declaration>");
    r = Declaration_0(b, l + 1);
    r = r && Declaration_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // FullDeclaration | DeclarationWithoutType
  private static boolean Declaration_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Declaration_0")) return false;
    boolean r;
    r = FullDeclaration(b, l + 1);
    if (!r) r = DeclarationWithoutType(b, l + 1);
    return r;
  }

  // DeclarationInitialization?
  private static boolean Declaration_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Declaration_1")) return false;
    DeclarationInitialization(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // DeclarationOperator SeqOrExpression
  static boolean DeclarationInitialization(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DeclarationInitialization")) return false;
    if (!nextTokenIs(b, OPERATOR_ASSIGNMENT)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = DeclarationOperator(b, l + 1);
    p = r; // pin = 1
    r = r && SeqOrExpression(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // OPERATOR_ASSIGNMENT
  static boolean DeclarationOperator(PsiBuilder b, int l) {
    return consumeToken(b, OPERATOR_ASSIGNMENT);
  }

  /* ********************************************************** */
  // Visibility IdentifierLiteral
  static boolean DeclarationWithoutType(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DeclarationWithoutType")) return false;
    if (!nextTokenIs(b, "", VISIBILITY_GLOBAL, VISIBILITY_LOCAL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Visibility(b, l + 1);
    r = r && IdentifierLiteral(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
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
  // KEYWORD_FOR SeqForParenthesis (ControlStructure | Statement) | (LEFT_CURLY_BRACE ControlStructureBody RIGHT_CURLY_BRACE)
  public static boolean For(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "For")) return false;
    if (!nextTokenIs(b, "<for>", KEYWORD_FOR, LEFT_CURLY_BRACE)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FOR, "<for>");
    r = For_0(b, l + 1);
    if (!r) r = For_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // KEYWORD_FOR SeqForParenthesis (ControlStructure | Statement)
  private static boolean For_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "For_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KEYWORD_FOR);
    r = r && SeqForParenthesis(b, l + 1);
    r = r && For_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ControlStructure | Statement
  private static boolean For_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "For_0_2")) return false;
    boolean r;
    r = ControlStructure(b, l + 1);
    if (!r) r = Statement(b, l + 1);
    return r;
  }

  // LEFT_CURLY_BRACE ControlStructureBody RIGHT_CURLY_BRACE
  private static boolean For_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "For_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LEFT_CURLY_BRACE);
    r = r && ControlStructureBody(b, l + 1);
    r = r && consumeToken(b, RIGHT_CURLY_BRACE);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // Visibility Type IdentifierLiteral
  static boolean FullDeclaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FullDeclaration")) return false;
    if (!nextTokenIs(b, "", VISIBILITY_GLOBAL, VISIBILITY_LOCAL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Visibility(b, l + 1);
    r = r && Type(b, l + 1);
    r = r && IdentifierLiteral(b, l + 1);
    exit_section_(b, m, null, r);
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
  // FunctionName LEFT_PARENTHESIS FunctionArguments? RIGHT_PARENTHESIS
  public static boolean FunctionInvocation(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionInvocation")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FUNCTION_INVOCATION, "<function invocation>");
    r = FunctionName(b, l + 1);
    r = r && consumeToken(b, LEFT_PARENTHESIS);
    r = r && FunctionInvocation_2(b, l + 1);
    r = r && consumeToken(b, RIGHT_PARENTHESIS);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // FunctionArguments?
  private static boolean FunctionInvocation_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionInvocation_2")) return false;
    FunctionArguments(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // BuiltInFunctionName | CustomFunctionName
  static boolean FunctionName(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionName")) return false;
    boolean r;
    r = BuiltInFunctionName(b, l + 1);
    if (!r) r = CustomFunctionName(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // ParameterWithType | ParameterWithoutType
  public static boolean FunctionParameter(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionParameter")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FUNCTION_PARAMETER, "<function parameter>");
    r = ParameterWithType(b, l + 1);
    if (!r) r = ParameterWithoutType(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
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
  // IDENTIFIER | Type
  public static boolean IdentifierLiteral(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IdentifierLiteral")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, IDENTIFIER_LITERAL, "<identifier literal>");
    r = consumeToken(b, IDENTIFIER);
    if (!r) r = Type(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // KEYWORD_IF LEFT_PARENTHESIS Expression RIGHT_PARENTHESIS IfOrElseBlock (KEYWORD_ELSE KEYWORD_IF LEFT_PARENTHESIS Expression RIGHT_PARENTHESIS IfOrElseBlock)* (KEYWORD_ELSE IfOrElseBlock)?
  public static boolean If(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "If")) return false;
    if (!nextTokenIs(b, KEYWORD_IF)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, KEYWORD_IF, LEFT_PARENTHESIS);
    r = r && Expression(b, l + 1, -1);
    r = r && consumeToken(b, RIGHT_PARENTHESIS);
    r = r && IfOrElseBlock(b, l + 1);
    r = r && If_5(b, l + 1);
    r = r && If_6(b, l + 1);
    exit_section_(b, m, IF, r);
    return r;
  }

  // (KEYWORD_ELSE KEYWORD_IF LEFT_PARENTHESIS Expression RIGHT_PARENTHESIS IfOrElseBlock)*
  private static boolean If_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "If_5")) return false;
    while (true) {
      int c = current_position_(b);
      if (!If_5_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "If_5", c)) break;
    }
    return true;
  }

  // KEYWORD_ELSE KEYWORD_IF LEFT_PARENTHESIS Expression RIGHT_PARENTHESIS IfOrElseBlock
  private static boolean If_5_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "If_5_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, KEYWORD_ELSE, KEYWORD_IF, LEFT_PARENTHESIS);
    r = r && Expression(b, l + 1, -1);
    r = r && consumeToken(b, RIGHT_PARENTHESIS);
    r = r && IfOrElseBlock(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (KEYWORD_ELSE IfOrElseBlock)?
  private static boolean If_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "If_6")) return false;
    If_6_0(b, l + 1);
    return true;
  }

  // KEYWORD_ELSE IfOrElseBlock
  private static boolean If_6_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "If_6_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KEYWORD_ELSE);
    r = r && IfOrElseBlock(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // LEFT_CURLY_BRACE ControlStructureBody RIGHT_CURLY_BRACE | ControlStructureBody
  public static boolean IfOrElseBlock(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IfOrElseBlock")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, IF_OR_ELSE_BLOCK, "<if or else block>");
    r = IfOrElseBlock_0(b, l + 1);
    if (!r) r = ControlStructureBody(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // LEFT_CURLY_BRACE ControlStructureBody RIGHT_CURLY_BRACE
  private static boolean IfOrElseBlock_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IfOrElseBlock_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LEFT_CURLY_BRACE);
    r = r && ControlStructureBody(b, l + 1);
    r = r && consumeToken(b, RIGHT_CURLY_BRACE);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ArrayAccess | BuiltInVariableName | IdentifierLiteral
  static boolean LeftHandSide(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LeftHandSide")) return false;
    boolean r;
    r = ArrayAccess(b, l + 1);
    if (!r) r = BuiltInVariableName(b, l + 1);
    if (!r) r = IdentifierLiteral(b, l + 1);
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
  // FunctionName
  static boolean MethodReference(PsiBuilder b, int l) {
    return FunctionName(b, l + 1);
  }

  /* ********************************************************** */
  // NUMBER_SCIENTIFIC | NUMBER_FLOAT | NUMBER_INTEGER
  public static boolean NumberLiteral(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NumberLiteral")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, NUMBER_LITERAL, "<number literal>");
    r = consumeToken(b, NUMBER_SCIENTIFIC);
    if (!r) r = consumeToken(b, NUMBER_FLOAT);
    if (!r) r = consumeToken(b, NUMBER_INTEGER);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // Type IdentifierLiteral
  static boolean ParameterWithType(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ParameterWithType")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Type(b, l + 1);
    r = r && IdentifierLiteral(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // IdentifierLiteral
  static boolean ParameterWithoutType(PsiBuilder b, int l) {
    return IdentifierLiteral(b, l + 1);
  }

  /* ********************************************************** */
  // OPERATOR_INCREMENT | OPERATOR_DECREMENT
  static boolean PostfixOperator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PostfixOperator")) return false;
    if (!nextTokenIs(b, "", OPERATOR_DECREMENT, OPERATOR_INCREMENT)) return false;
    boolean r;
    r = consumeToken(b, OPERATOR_INCREMENT);
    if (!r) r = consumeToken(b, OPERATOR_DECREMENT);
    return r;
  }

  /* ********************************************************** */
  // OPERATOR_INCREMENT | OPERATOR_DECREMENT
  static boolean PrefixOperator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PrefixOperator")) return false;
    if (!nextTokenIs(b, "", OPERATOR_DECREMENT, OPERATOR_INCREMENT)) return false;
    boolean r;
    r = consumeToken(b, OPERATOR_INCREMENT);
    if (!r) r = consumeToken(b, OPERATOR_DECREMENT);
    return r;
  }

  /* ********************************************************** */
  // !(SEMICOLON)
  static boolean RecoverUntilSemicolon(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RecoverUntilSemicolon")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_);
    r = !consumeToken(b, SEMICOLON);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // LeftHandSide AssignmentOperator (Seq | Expression)
  static boolean RegularAssignment(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RegularAssignment")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = LeftHandSide(b, l + 1);
    r = r && AssignmentOperator(b, l + 1);
    p = r; // pin = 2
    r = r && RegularAssignment_2(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // Seq | Expression
  private static boolean RegularAssignment_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RegularAssignment_2")) return false;
    boolean r;
    r = Seq(b, l + 1);
    if (!r) r = Expression(b, l + 1, -1);
    return r;
  }

  /* ********************************************************** */
  // RegularStatementWithoutSemicolon SEMICOLON
  static boolean RegularStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RegularStatement")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = RegularStatementWithoutSemicolon(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // Assignment | Declaration | Expression | ReturnStatement | Seq | KEYWORD_BREAK | KEYWORD_CONTINUE
  static boolean RegularStatementWithoutSemicolon(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RegularStatementWithoutSemicolon")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_);
    r = Assignment(b, l + 1);
    if (!r) r = Declaration(b, l + 1);
    if (!r) r = Expression(b, l + 1, -1);
    if (!r) r = ReturnStatement(b, l + 1);
    if (!r) r = Seq(b, l + 1);
    if (!r) r = consumeToken(b, KEYWORD_BREAK);
    if (!r) r = consumeToken(b, KEYWORD_CONTINUE);
    exit_section_(b, l, m, r, false, FormulaEngineParser::RecoverUntilSemicolon);
    return r;
  }

  /* ********************************************************** */
  // KEYWORD_RETURN Expression?
  public static boolean ReturnStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ReturnStatement")) return false;
    if (!nextTokenIs(b, KEYWORD_RETURN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KEYWORD_RETURN);
    r = r && ReturnStatement_1(b, l + 1);
    exit_section_(b, m, RETURN_STATEMENT, r);
    return r;
  }

  // Expression?
  private static boolean ReturnStatement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ReturnStatement_1")) return false;
    Expression(b, l + 1, -1);
    return true;
  }

  /* ********************************************************** */
  // KEYWORD_SEQ SeqForParenthesis SeqBody
  public static boolean Seq(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Seq")) return false;
    if (!nextTokenIs(b, KEYWORD_SEQ)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KEYWORD_SEQ);
    r = r && SeqForParenthesis(b, l + 1);
    r = r && SeqBody(b, l + 1);
    exit_section_(b, m, SEQ, r);
    return r;
  }

  /* ********************************************************** */
  // Assignment | CalculationExpression | FunctionInvocation | ListLiteral | BuiltInVariableName
  static boolean SeqBody(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SeqBody")) return false;
    boolean r;
    r = Assignment(b, l + 1);
    if (!r) r = Expression(b, l + 1, 3);
    if (!r) r = FunctionInvocation(b, l + 1);
    if (!r) r = ListLiteral(b, l + 1);
    if (!r) r = BuiltInVariableName(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // LEFT_PARENTHESIS Assignment (COMMA (Assignment | FunctionInvocation))* SEMICOLON Expression SEMICOLON (Assignment | FunctionInvocation) RIGHT_PARENTHESIS
  public static boolean SeqForParenthesis(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SeqForParenthesis")) return false;
    if (!nextTokenIs(b, LEFT_PARENTHESIS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LEFT_PARENTHESIS);
    r = r && Assignment(b, l + 1);
    r = r && SeqForParenthesis_2(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    r = r && Expression(b, l + 1, -1);
    r = r && consumeToken(b, SEMICOLON);
    r = r && SeqForParenthesis_6(b, l + 1);
    r = r && consumeToken(b, RIGHT_PARENTHESIS);
    exit_section_(b, m, SEQ_FOR_PARENTHESIS, r);
    return r;
  }

  // (COMMA (Assignment | FunctionInvocation))*
  private static boolean SeqForParenthesis_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SeqForParenthesis_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!SeqForParenthesis_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "SeqForParenthesis_2", c)) break;
    }
    return true;
  }

  // COMMA (Assignment | FunctionInvocation)
  private static boolean SeqForParenthesis_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SeqForParenthesis_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && SeqForParenthesis_2_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // Assignment | FunctionInvocation
  private static boolean SeqForParenthesis_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SeqForParenthesis_2_0_1")) return false;
    boolean r;
    r = Assignment(b, l + 1);
    if (!r) r = FunctionInvocation(b, l + 1);
    return r;
  }

  // Assignment | FunctionInvocation
  private static boolean SeqForParenthesis_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SeqForParenthesis_6")) return false;
    boolean r;
    r = Assignment(b, l + 1);
    if (!r) r = FunctionInvocation(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // Seq | Expression
  static boolean SeqOrExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SeqOrExpression")) return false;
    boolean r;
    r = Seq(b, l + 1);
    if (!r) r = Expression(b, l + 1, -1);
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
  // FunctionDefinition | ControlStructure | RegularStatement
  public static boolean Statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Statement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STATEMENT, "<statement>");
    r = FunctionDefinition(b, l + 1);
    if (!r) r = ControlStructure(b, l + 1);
    if (!r) r = RegularStatement(b, l + 1);
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
  // KEYWORD_SWITCH LEFT_PARENTHESIS Expression RIGHT_PARENTHESIS LEFT_CURLY_BRACE (KEYWORD_CASE Constant COLON (ControlStructureBody (KEYWORD_BREAK SEMICOLON)?))* (KEYWORD_DEFAULT COLON (ControlStructureBody (KEYWORD_BREAK SEMICOLON)?))? RIGHT_CURLY_BRACE
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

  // (KEYWORD_DEFAULT COLON (ControlStructureBody (KEYWORD_BREAK SEMICOLON)?))?
  private static boolean Switch_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Switch_6")) return false;
    Switch_6_0(b, l + 1);
    return true;
  }

  // KEYWORD_DEFAULT COLON (ControlStructureBody (KEYWORD_BREAK SEMICOLON)?)
  private static boolean Switch_6_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Switch_6_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, KEYWORD_DEFAULT, COLON);
    r = r && Switch_6_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ControlStructureBody (KEYWORD_BREAK SEMICOLON)?
  private static boolean Switch_6_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Switch_6_0_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ControlStructureBody(b, l + 1);
    r = r && Switch_6_0_2_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (KEYWORD_BREAK SEMICOLON)?
  private static boolean Switch_6_0_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Switch_6_0_2_1")) return false;
    Switch_6_0_2_1_0(b, l + 1);
    return true;
  }

  // KEYWORD_BREAK SEMICOLON
  private static boolean Switch_6_0_2_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Switch_6_0_2_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, KEYWORD_BREAK, SEMICOLON);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // KEYWORD_ANY
  //     | KEYWORD_BOOLEAN
  //     | KEYWORD_DATE
  //     | KEYWORD_DATETIME
  //     | KEYWORD_DICT
  //     | KEYWORD_FLOAT
  //     | KEYWORD_INTEGER
  //     | KEYWORD_LIST
  //     | KEYWORD_NUMBER
  //     | KEYWORD_STRING
  //     | KEYWORD_TIME
  public static boolean Type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Type")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TYPE, "<type>");
    r = consumeToken(b, KEYWORD_ANY);
    if (!r) r = consumeToken(b, KEYWORD_BOOLEAN);
    if (!r) r = consumeToken(b, KEYWORD_DATE);
    if (!r) r = consumeToken(b, KEYWORD_DATETIME);
    if (!r) r = consumeToken(b, KEYWORD_DICT);
    if (!r) r = consumeToken(b, KEYWORD_FLOAT);
    if (!r) r = consumeToken(b, KEYWORD_INTEGER);
    if (!r) r = consumeToken(b, KEYWORD_LIST);
    if (!r) r = consumeToken(b, KEYWORD_NUMBER);
    if (!r) r = consumeToken(b, KEYWORD_STRING);
    if (!r) r = consumeToken(b, KEYWORD_TIME);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // OPERATOR_PLUS | OPERATOR_MINUS
  static boolean UnaryOperator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UnaryOperator")) return false;
    if (!nextTokenIs(b, "", OPERATOR_MINUS, OPERATOR_PLUS)) return false;
    boolean r;
    r = consumeToken(b, OPERATOR_PLUS);
    if (!r) r = consumeToken(b, OPERATOR_MINUS);
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
  // Statement*
  static boolean feFile(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "feFile")) return false;
    while (true) {
      int c = current_position_(b);
      if (!Statement(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "feFile", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // Expression root: Expression
  // Operator priority table:
  // 0: PREFIX(NegatedExpression)
  // 1: PREFIX(ParenthesisExpression)
  // 2: BINARY(CombinationExpression)
  // 3: BINARY(ComparisonExpression)
  // 4: BINARY(CalculationExpression)
  // 5: BINARY(ShortIfExpression)
  // 6: ATOM(LeafExpression)
  // 7: PREFIX(UnaryExpression)
  public static boolean Expression(PsiBuilder b, int l, int g) {
    if (!recursion_guard_(b, l, "Expression")) return false;
    addVariant(b, "<expression>");
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, "<expression>");
    r = NegatedExpression(b, l + 1);
    if (!r) r = ParenthesisExpression(b, l + 1);
    if (!r) r = LeafExpression(b, l + 1);
    if (!r) r = UnaryExpression(b, l + 1);
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
      if (g < 2 && CombinationOperator(b, l + 1)) {
        r = Expression(b, l, 2);
        exit_section_(b, l, m, COMBINATION_EXPRESSION, r, true, null);
      }
      else if (g < 3 && ComparisonOperator(b, l + 1)) {
        r = Expression(b, l, 3);
        exit_section_(b, l, m, COMPARISON_EXPRESSION, r, true, null);
      }
      else if (g < 4 && CalculationOperator(b, l + 1)) {
        r = Expression(b, l, 4);
        exit_section_(b, l, m, CALCULATION_EXPRESSION, r, true, null);
      }
      else if (g < 5 && consumeTokenSmart(b, QUESIONMARK)) {
        r = report_error_(b, Expression(b, l, 5));
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

  public static boolean ParenthesisExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ParenthesisExpression")) return false;
    if (!nextTokenIsSmart(b, LEFT_PARENTHESIS)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = consumeTokenSmart(b, LEFT_PARENTHESIS);
    p = r;
    r = p && Expression(b, l, 1);
    r = p && report_error_(b, consumeToken(b, RIGHT_PARENTHESIS)) && r;
    exit_section_(b, l, m, PARENTHESIS_EXPRESSION, r, p, null);
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

  // FunctionInvocation | ArrayAccess | Constant |  MethodReference | PrefixOperator IdentifierLiteral | IdentifierLiteral PostfixOperator | IdentifierLiteral
  public static boolean LeafExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LeafExpression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LEAF_EXPRESSION, "<leaf expression>");
    r = FunctionInvocation(b, l + 1);
    if (!r) r = ArrayAccess(b, l + 1);
    if (!r) r = Constant(b, l + 1);
    if (!r) r = MethodReference(b, l + 1);
    if (!r) r = LeafExpression_4(b, l + 1);
    if (!r) r = LeafExpression_5(b, l + 1);
    if (!r) r = IdentifierLiteral(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // PrefixOperator IdentifierLiteral
  private static boolean LeafExpression_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LeafExpression_4")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = PrefixOperator(b, l + 1);
    r = r && IdentifierLiteral(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // IdentifierLiteral PostfixOperator
  private static boolean LeafExpression_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LeafExpression_5")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = IdentifierLiteral(b, l + 1);
    r = r && PostfixOperator(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  public static boolean UnaryExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UnaryExpression")) return false;
    if (!nextTokenIsSmart(b, OPERATOR_MINUS, OPERATOR_PLUS)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = UnaryOperator(b, l + 1);
    p = r;
    r = p && Expression(b, l, -1);
    exit_section_(b, l, m, UNARY_EXPRESSION, r, p, null);
    return r || p;
  }

}
