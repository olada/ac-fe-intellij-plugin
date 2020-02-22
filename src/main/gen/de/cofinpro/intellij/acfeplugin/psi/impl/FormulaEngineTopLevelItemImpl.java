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

public class FormulaEngineTopLevelItemImpl extends ASTWrapperPsiElement implements FormulaEngineTopLevelItem {

  public FormulaEngineTopLevelItemImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull FormulaEngineVisitor visitor) {
    visitor.visitTopLevelItem(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof FormulaEngineVisitor) accept((FormulaEngineVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public FormulaEngineFunctionDefinition getFunctionDefinition() {
    return findChildByClass(FormulaEngineFunctionDefinition.class);
  }

  @Override
  @Nullable
  public FormulaEngineGlobalAssignment getGlobalAssignment() {
    return findChildByClass(FormulaEngineGlobalAssignment.class);
  }

  @Override
  @Nullable
  public FormulaEngineGlobalDeclaration getGlobalDeclaration() {
    return findChildByClass(FormulaEngineGlobalDeclaration.class);
  }

}
