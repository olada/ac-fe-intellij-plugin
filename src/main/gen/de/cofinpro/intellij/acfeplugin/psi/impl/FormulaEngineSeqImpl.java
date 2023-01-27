// This is a generated file. Not intended for manual editing.
package de.cofinpro.intellij.acfeplugin.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static de.cofinpro.intellij.acfeplugin.psi.FormulaEngineElementTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import de.cofinpro.intellij.acfeplugin.psi.*;

public class FormulaEngineSeqImpl extends ASTWrapperPsiElement implements FormulaEngineSeq {

  public FormulaEngineSeqImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull FormulaEngineVisitor visitor) {
    visitor.visitSeq(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof FormulaEngineVisitor) accept((FormulaEngineVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public FormulaEngineAssignment getAssignment() {
    return PsiTreeUtil.getChildOfType(this, FormulaEngineAssignment.class);
  }

  @Override
  @Nullable
  public FormulaEngineBuiltInVariableName getBuiltInVariableName() {
    return PsiTreeUtil.getChildOfType(this, FormulaEngineBuiltInVariableName.class);
  }

  @Override
  @Nullable
  public FormulaEngineExpression getExpression() {
    return PsiTreeUtil.getChildOfType(this, FormulaEngineExpression.class);
  }

  @Override
  @Nullable
  public FormulaEngineFunctionInvocation getFunctionInvocation() {
    return PsiTreeUtil.getChildOfType(this, FormulaEngineFunctionInvocation.class);
  }

  @Override
  @Nullable
  public FormulaEngineListLiteral getListLiteral() {
    return PsiTreeUtil.getChildOfType(this, FormulaEngineListLiteral.class);
  }

  @Override
  @NotNull
  public FormulaEngineSeqForParenthesis getSeqForParenthesis() {
    return notNullChild(PsiTreeUtil.getChildOfType(this, FormulaEngineSeqForParenthesis.class));
  }

}
