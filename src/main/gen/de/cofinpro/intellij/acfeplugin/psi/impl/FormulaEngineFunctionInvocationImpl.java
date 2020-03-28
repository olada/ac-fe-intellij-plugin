// This is a generated file. Not intended for manual editing.
package de.cofinpro.intellij.acfeplugin.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static de.cofinpro.intellij.acfeplugin.psi.FormulaEngineElementTypes.*;
import de.cofinpro.intellij.acfeplugin.referencing.FormulaEngineFunctionNameImpl;
import de.cofinpro.intellij.acfeplugin.psi.*;

public class FormulaEngineFunctionInvocationImpl extends FormulaEngineFunctionNameImpl implements FormulaEngineFunctionInvocation {

  public FormulaEngineFunctionInvocationImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull FormulaEngineVisitor visitor) {
    visitor.visitFunctionInvocation(this);
  }

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
  public FormulaEngineCustomFunctionName getCustomFunctionName() {
    return PsiTreeUtil.getChildOfType(this, FormulaEngineCustomFunctionName.class);
  }

  @Override
  @Nullable
  public FormulaEngineFunctionArguments getFunctionArguments() {
    return PsiTreeUtil.getChildOfType(this, FormulaEngineFunctionArguments.class);
  }

}
