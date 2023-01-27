// This is a generated file. Not intended for manual editing.
package de.cofinpro.intellij.acfeplugin.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static de.cofinpro.intellij.acfeplugin.psi.FormulaEngineElementTypes.*;
import com.intellij.extapi.psi.StubBasedPsiElementBase;
import de.cofinpro.intellij.acfeplugin.psi.stub.DeclarationStub;
import de.cofinpro.intellij.acfeplugin.psi.*;
import com.intellij.psi.stubs.IStubElementType;
import com.intellij.psi.tree.IElementType;

public class FormulaEngineDeclarationImpl extends StubBasedPsiElementBase<DeclarationStub> implements FormulaEngineDeclaration {

  public FormulaEngineDeclarationImpl(@NotNull DeclarationStub stub, @NotNull IStubElementType<?, ?> type) {
    super(stub, type);
  }

  public FormulaEngineDeclarationImpl(@NotNull ASTNode node) {
    super(node);
  }

  public FormulaEngineDeclarationImpl(DeclarationStub stub, IElementType type, ASTNode node) {
    super(stub, type, node);
  }

  public void accept(@NotNull FormulaEngineVisitor visitor) {
    visitor.visitDeclaration(this);
  }

  @Override
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

  @Override
  public String getName() {
    return FormulaEnginePsiImplUtil.getName(this);
  }

  @Override
  public int getTextOffset() {
    return FormulaEnginePsiImplUtil.getTextOffset(this);
  }

  @Override
  public PsiElement setName(String name) {
    return FormulaEnginePsiImplUtil.setName(this, name);
  }

}
