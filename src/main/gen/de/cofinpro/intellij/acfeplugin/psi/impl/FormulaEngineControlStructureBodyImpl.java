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

public class FormulaEngineControlStructureBodyImpl extends ASTWrapperPsiElement implements FormulaEngineControlStructureBody {

  public FormulaEngineControlStructureBodyImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull FormulaEngineVisitor visitor) {
    visitor.visitControlStructureBody(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof FormulaEngineVisitor) accept((FormulaEngineVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<FormulaEngineControlStructure> getControlStructureList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, FormulaEngineControlStructure.class);
  }

  @Override
  @NotNull
  public List<FormulaEngineStatement> getStatementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, FormulaEngineStatement.class);
  }

}
