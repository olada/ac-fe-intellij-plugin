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
import com.intellij.psi.PsiReference;

public class FormulaEngineFunctionInvocationImpl extends ASTWrapperPsiElement implements FormulaEngineFunctionInvocation {

  public FormulaEngineFunctionInvocationImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull FormulaEngineVisitor visitor) {
    visitor.visitFunctionInvocation(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof FormulaEngineVisitor) accept((FormulaEngineVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public FormulaEngineBuiltInFunctionName getBuiltInFunctionName() {
    return PsiTreeUtil.getChildOfType(this, FormulaEngineBuiltInFunctionName.class);
  }

  @Override
  @Nullable
  public FormulaEngineFunctionArguments getFunctionArguments() {
    return PsiTreeUtil.getChildOfType(this, FormulaEngineFunctionArguments.class);
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

  @Override
  public boolean isCustomFunction() {
    return FormulaEnginePsiImplUtil.isCustomFunction(this);
  }

}
