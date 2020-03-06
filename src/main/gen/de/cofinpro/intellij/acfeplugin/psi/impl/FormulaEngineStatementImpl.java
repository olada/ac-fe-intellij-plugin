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

public class FormulaEngineStatementImpl extends ASTWrapperPsiElement implements FormulaEngineStatement {

  public FormulaEngineStatementImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull FormulaEngineVisitor visitor) {
    visitor.visitStatement(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof FormulaEngineVisitor) accept((FormulaEngineVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public FormulaEngineAssignment getAssignment() {
    return findChildByClass(FormulaEngineAssignment.class);
  }

  @Override
  @Nullable
  public FormulaEngineDeclaration getDeclaration() {
    return findChildByClass(FormulaEngineDeclaration.class);
  }

  @Override
  @Nullable
  public FormulaEngineFunctionDefinition getFunctionDefinition() {
    return findChildByClass(FormulaEngineFunctionDefinition.class);
  }

  @Override
  @Nullable
  public FormulaEngineFunctionInvocation getFunctionInvocation() {
    return findChildByClass(FormulaEngineFunctionInvocation.class);
  }

  @Override
  @Nullable
  public FormulaEngineReturnStatement getReturnStatement() {
    return findChildByClass(FormulaEngineReturnStatement.class);
  }

}
