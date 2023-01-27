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
import com.intellij.psi.PsiReference;

public class FormulaEngineLeafExpressionImpl extends FormulaEngineExpressionImpl implements FormulaEngineLeafExpression {

  public FormulaEngineLeafExpressionImpl(@NotNull ASTNode node) {
    super(node);
  }

  @Override
  public void accept(@NotNull FormulaEngineVisitor visitor) {
    visitor.visitLeafExpression(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof FormulaEngineVisitor) accept((FormulaEngineVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public FormulaEngineArrayAccess getArrayAccess() {
    return PsiTreeUtil.getChildOfType(this, FormulaEngineArrayAccess.class);
  }

  @Override
  @Nullable
  public FormulaEngineBuiltInFunctionName getBuiltInFunctionName() {
    return PsiTreeUtil.getChildOfType(this, FormulaEngineBuiltInFunctionName.class);
  }

  @Override
  @Nullable
  public FormulaEngineConstant getConstant() {
    return PsiTreeUtil.getChildOfType(this, FormulaEngineConstant.class);
  }

  @Override
  @Nullable
  public FormulaEngineFunctionInvocation getFunctionInvocation() {
    return PsiTreeUtil.getChildOfType(this, FormulaEngineFunctionInvocation.class);
  }

  @Override
  @Nullable
  public FormulaEngineIdentifierLiteral getIdentifierLiteral() {
    return PsiTreeUtil.getChildOfType(this, FormulaEngineIdentifierLiteral.class);
  }

  @Override
  @Nullable
  public PsiElement getIdentifier() {
    return findChildByType(IDENTIFIER);
  }

  @Override
  public PsiReference getReference() {
    return FormulaEnginePsiImplUtil.getReference(this);
  }

}
