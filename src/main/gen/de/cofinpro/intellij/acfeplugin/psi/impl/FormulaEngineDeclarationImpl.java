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

public class FormulaEngineDeclarationImpl extends ASTWrapperPsiElement implements FormulaEngineDeclaration {

  public FormulaEngineDeclarationImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull FormulaEngineVisitor visitor) {
    visitor.visitDeclaration(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof FormulaEngineVisitor) accept((FormulaEngineVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public FormulaEngineExpression getExpression() {
    return PsiTreeUtil.getChildOfType(this, FormulaEngineExpression.class);
  }

  @Override
  @NotNull
  public FormulaEngineIdentifierLiteral getIdentifierLiteral() {
    return notNullChild(PsiTreeUtil.getChildOfType(this, FormulaEngineIdentifierLiteral.class));
  }

  @Override
  @Nullable
  public FormulaEngineSeq getSeq() {
    return PsiTreeUtil.getChildOfType(this, FormulaEngineSeq.class);
  }

  @Override
  @Nullable
  public FormulaEngineType getType() {
    return PsiTreeUtil.getChildOfType(this, FormulaEngineType.class);
  }

  @Override
  @NotNull
  public FormulaEngineVisibility getVisibility() {
    return notNullChild(PsiTreeUtil.getChildOfType(this, FormulaEngineVisibility.class));
  }

}
