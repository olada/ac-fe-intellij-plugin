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

public class FormulaEngineSwitchImpl extends ASTWrapperPsiElement implements FormulaEngineSwitch {

  public FormulaEngineSwitchImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull FormulaEngineVisitor visitor) {
    visitor.visitSwitch(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof FormulaEngineVisitor) accept((FormulaEngineVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<FormulaEngineConstant> getConstantList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, FormulaEngineConstant.class);
  }

  @Override
  @NotNull
  public List<FormulaEngineControlStructureBody> getControlStructureBodyList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, FormulaEngineControlStructureBody.class);
  }

  @Override
  @NotNull
  public FormulaEngineExpression getExpression() {
    return notNullChild(PsiTreeUtil.getChildOfType(this, FormulaEngineExpression.class));
  }

}
