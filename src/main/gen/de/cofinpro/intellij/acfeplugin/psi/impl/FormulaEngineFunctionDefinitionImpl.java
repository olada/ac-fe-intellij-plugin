// This is a generated file. Not intended for manual editing.
package de.cofinpro.intellij.acfeplugin.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static de.cofinpro.intellij.acfeplugin.psi.FormulaEngineElementTypes.*;
import de.cofinpro.intellij.acfeplugin.psi.FormulaEngineNameIdentifierOwnerImpl;
import de.cofinpro.intellij.acfeplugin.psi.*;

public class FormulaEngineFunctionDefinitionImpl extends FormulaEngineNameIdentifierOwnerImpl implements FormulaEngineFunctionDefinition {

  public FormulaEngineFunctionDefinitionImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull FormulaEngineVisitor visitor) {
    visitor.visitFunctionDefinition(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof FormulaEngineVisitor) accept((FormulaEngineVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public FormulaEngineFunctionBody getFunctionBody() {
    return findNotNullChildByClass(FormulaEngineFunctionBody.class);
  }

  @Override
  @Nullable
  public FormulaEngineFunctionParameters getFunctionParameters() {
    return findChildByClass(FormulaEngineFunctionParameters.class);
  }

  @Override
  @NotNull
  public PsiElement getIdentifier() {
    return findNotNullChildByType(IDENTIFIER);
  }

}
