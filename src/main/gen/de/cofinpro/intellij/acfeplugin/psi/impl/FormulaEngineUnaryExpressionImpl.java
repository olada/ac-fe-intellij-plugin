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

public class FormulaEngineUnaryExpressionImpl extends FormulaEngineExpressionImpl implements FormulaEngineUnaryExpression {

  public FormulaEngineUnaryExpressionImpl(@NotNull ASTNode node) {
    super(node);
  }

  @Override
  public void accept(@NotNull FormulaEngineVisitor visitor) {
    visitor.visitUnaryExpression(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof FormulaEngineVisitor) accept((FormulaEngineVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public FormulaEngineExpression getExpression() {
    return PsiTreeUtil.getChildOfType(this, FormulaEngineExpression.class);
  }

}
