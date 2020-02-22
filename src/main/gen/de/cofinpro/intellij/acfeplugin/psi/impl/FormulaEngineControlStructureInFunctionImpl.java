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

public class FormulaEngineControlStructureInFunctionImpl extends ASTWrapperPsiElement implements FormulaEngineControlStructureInFunction {

  public FormulaEngineControlStructureInFunctionImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull FormulaEngineVisitor visitor) {
    visitor.visitControlStructureInFunction(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof FormulaEngineVisitor) accept((FormulaEngineVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public FormulaEngineControlStructureInFunctionBody getControlStructureInFunctionBody() {
    return findNotNullChildByClass(FormulaEngineControlStructureInFunctionBody.class);
  }

  @Override
  @NotNull
  public FormulaEngineControlStructureKeyword getControlStructureKeyword() {
    return findNotNullChildByClass(FormulaEngineControlStructureKeyword.class);
  }

  @Override
  @NotNull
  public FormulaEngineExpression getExpression() {
    return findNotNullChildByClass(FormulaEngineExpression.class);
  }

}
