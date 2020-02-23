// This is a generated file. Not intended for manual editing.
package de.cofinpro.intellij.acfeplugin.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static de.cofinpro.intellij.acfeplugin.psi.FormulaEngineElementTypes.*;
import de.cofinpro.intellij.acfeplugin.psi.*;

public class FormulaEngineComparisonExpressionImpl extends FormulaEngineExpressionImpl implements FormulaEngineComparisonExpression {

  public FormulaEngineComparisonExpressionImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull FormulaEngineVisitor visitor) {
    visitor.visitComparisonExpression(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof FormulaEngineVisitor) accept((FormulaEngineVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public FormulaEngineComparisonOperator getComparisonOperator() {
    return findNotNullChildByClass(FormulaEngineComparisonOperator.class);
  }

  @Override
  @NotNull
  public List<FormulaEngineExpression> getExpressionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, FormulaEngineExpression.class);
  }

}