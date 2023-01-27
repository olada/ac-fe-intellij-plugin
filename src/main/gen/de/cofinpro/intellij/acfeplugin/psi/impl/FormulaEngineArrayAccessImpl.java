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

public class FormulaEngineArrayAccessImpl extends ASTWrapperPsiElement implements FormulaEngineArrayAccess {

  public FormulaEngineArrayAccessImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull FormulaEngineVisitor visitor) {
    visitor.visitArrayAccess(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof FormulaEngineVisitor) accept((FormulaEngineVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public FormulaEngineBuiltInVariableName getBuiltInVariableName() {
    return PsiTreeUtil.getChildOfType(this, FormulaEngineBuiltInVariableName.class);
  }

  @Override
  @NotNull
  public List<FormulaEngineExpression> getExpressionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, FormulaEngineExpression.class);
  }

  @Override
  @Nullable
  public FormulaEngineIdentifierLiteral getIdentifierLiteral() {
    return PsiTreeUtil.getChildOfType(this, FormulaEngineIdentifierLiteral.class);
  }

  @Override
  public PsiReference getReference() {
    return FormulaEnginePsiImplUtil.getReference(this);
  }

}
