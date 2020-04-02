// This is a generated file. Not intended for manual editing.
package de.cofinpro.intellij.acfeplugin.psi;

import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.PsiElement;
import com.intellij.psi.StubBasedPsiElement;
import de.cofinpro.intellij.acfeplugin.psi.stub.FunctionDefinitionStub;

public class FormulaEngineVisitor extends PsiElementVisitor {

  public void visitArrayAccess(@NotNull FormulaEngineArrayAccess o) {
    visitPsiElement(o);
  }

  public void visitAssignment(@NotNull FormulaEngineAssignment o) {
    visitPsiElement(o);
  }

  public void visitBuiltInFunctionName(@NotNull FormulaEngineBuiltInFunctionName o) {
    visitPsiElement(o);
  }

  public void visitBuiltInVariableName(@NotNull FormulaEngineBuiltInVariableName o) {
    visitPsiElement(o);
  }

  public void visitCalculationExpression(@NotNull FormulaEngineCalculationExpression o) {
    visitExpression(o);
  }

  public void visitCombinationExpression(@NotNull FormulaEngineCombinationExpression o) {
    visitExpression(o);
  }

  public void visitComparisonExpression(@NotNull FormulaEngineComparisonExpression o) {
    visitExpression(o);
  }

  public void visitConstant(@NotNull FormulaEngineConstant o) {
    visitPsiElement(o);
  }

  public void visitControlStructure(@NotNull FormulaEngineControlStructure o) {
    visitPsiElement(o);
  }

  public void visitControlStructureBody(@NotNull FormulaEngineControlStructureBody o) {
    visitPsiElement(o);
  }

  public void visitDeclaration(@NotNull FormulaEngineDeclaration o) {
    visitNameIdentifierOwner(o);
  }

  public void visitDoWhile(@NotNull FormulaEngineDoWhile o) {
    visitPsiElement(o);
  }

  public void visitExpression(@NotNull FormulaEngineExpression o) {
    visitPsiElement(o);
  }

  public void visitFor(@NotNull FormulaEngineFor o) {
    visitPsiElement(o);
  }

  public void visitFunctionArgument(@NotNull FormulaEngineFunctionArgument o) {
    visitPsiElement(o);
  }

  public void visitFunctionArguments(@NotNull FormulaEngineFunctionArguments o) {
    visitPsiElement(o);
  }

  public void visitFunctionBody(@NotNull FormulaEngineFunctionBody o) {
    visitPsiElement(o);
  }

  public void visitFunctionDefinition(@NotNull FormulaEngineFunctionDefinition o) {
    visitNameIdentifierOwner(o);
    // visitStubBasedPsiElement(o);
  }

  public void visitFunctionInvocation(@NotNull FormulaEngineFunctionInvocation o) {
    visitPsiElement(o);
  }

  public void visitFunctionParameter(@NotNull FormulaEngineFunctionParameter o) {
    visitNameIdentifierOwner(o);
  }

  public void visitFunctionParameters(@NotNull FormulaEngineFunctionParameters o) {
    visitPsiElement(o);
  }

  public void visitIdentifierLiteral(@NotNull FormulaEngineIdentifierLiteral o) {
    visitPsiElement(o);
  }

  public void visitIf(@NotNull FormulaEngineIf o) {
    visitPsiElement(o);
  }

  public void visitIfOrElseBlock(@NotNull FormulaEngineIfOrElseBlock o) {
    visitPsiElement(o);
  }

  public void visitLeafExpression(@NotNull FormulaEngineLeafExpression o) {
    visitExpression(o);
  }

  public void visitListContents(@NotNull FormulaEngineListContents o) {
    visitPsiElement(o);
  }

  public void visitListLiteral(@NotNull FormulaEngineListLiteral o) {
    visitPsiElement(o);
  }

  public void visitNegatedExpression(@NotNull FormulaEngineNegatedExpression o) {
    visitExpression(o);
  }

  public void visitNumberLiteral(@NotNull FormulaEngineNumberLiteral o) {
    visitPsiElement(o);
  }

  public void visitParenthesisExpression(@NotNull FormulaEngineParenthesisExpression o) {
    visitExpression(o);
  }

  public void visitReturnStatement(@NotNull FormulaEngineReturnStatement o) {
    visitPsiElement(o);
  }

  public void visitSeq(@NotNull FormulaEngineSeq o) {
    visitPsiElement(o);
  }

  public void visitSeqForParenthesis(@NotNull FormulaEngineSeqForParenthesis o) {
    visitPsiElement(o);
  }

  public void visitShortIfExpression(@NotNull FormulaEngineShortIfExpression o) {
    visitExpression(o);
  }

  public void visitSingleStringLiteral(@NotNull FormulaEngineSingleStringLiteral o) {
    visitPsiElement(o);
  }

  public void visitStatement(@NotNull FormulaEngineStatement o) {
    visitPsiElement(o);
  }

  public void visitStringLiteral(@NotNull FormulaEngineStringLiteral o) {
    visitPsiElement(o);
  }

  public void visitSwitch(@NotNull FormulaEngineSwitch o) {
    visitPsiElement(o);
  }

  public void visitTopLevelItem(@NotNull FormulaEngineTopLevelItem o) {
    visitPsiElement(o);
  }

  public void visitType(@NotNull FormulaEngineType o) {
    visitPsiElement(o);
  }

  public void visitUnaryExpression(@NotNull FormulaEngineUnaryExpression o) {
    visitExpression(o);
  }

  public void visitVisibility(@NotNull FormulaEngineVisibility o) {
    visitPsiElement(o);
  }

  public void visitWhile(@NotNull FormulaEngineWhile o) {
    visitPsiElement(o);
  }

  public void visitNameIdentifierOwner(@NotNull FormulaEngineNameIdentifierOwner o) {
    visitPsiElement(o);
  }

  public void visitPsiElement(@NotNull PsiElement o) {
    visitElement(o);
  }

}
