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

public class FormulaEngineAssignmentImpl extends ASTWrapperPsiElement implements FormulaEngineAssignment {

  public FormulaEngineAssignmentImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull FormulaEngineVisitor visitor) {
    visitor.visitAssignment(this);
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
  public FormulaEngineIdentifierLiteral getIdentifierLiteral() {
    return PsiTreeUtil.getChildOfType(this, FormulaEngineIdentifierLiteral.class);
  }

  @Override
  @Nullable
  public FormulaEngineSeq getSeq() {
    return PsiTreeUtil.getChildOfType(this, FormulaEngineSeq.class);
  }

}
