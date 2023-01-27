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
import de.cofinpro.intellij.acfeplugin.psi.stub.FunctionDefinitionStub;
import de.cofinpro.intellij.acfeplugin.psi.*;
import com.intellij.psi.stubs.IStubElementType;
import com.intellij.psi.tree.IElementType;

public class FormulaEngineFunctionDefinitionImpl extends StubBasedPsiElementBase<FunctionDefinitionStub> implements FormulaEngineFunctionDefinition {

  public FormulaEngineFunctionDefinitionImpl(@NotNull FunctionDefinitionStub stub, @NotNull IStubElementType<?, ?> type) {
    super(stub, type);
  }

  public FormulaEngineFunctionDefinitionImpl(@NotNull ASTNode node) {
    super(node);
  }

  public FormulaEngineFunctionDefinitionImpl(FunctionDefinitionStub stub, IElementType type, ASTNode node) {
    super(stub, type, node);
  }

  public void accept(@NotNull FormulaEngineVisitor visitor) {
    visitor.visitFunctionDefinition(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof FormulaEngineVisitor) accept((FormulaEngineVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public FormulaEngineFunctionBody getFunctionBody() {
    return notNullChild(PsiTreeUtil.getChildOfType(this, FormulaEngineFunctionBody.class));
  }

  @Override
  @Nullable
  public FormulaEngineFunctionParameters getFunctionParameters() {
    return PsiTreeUtil.getChildOfType(this, FormulaEngineFunctionParameters.class);
  }

  @Override
  @NotNull
  public PsiElement getIdentifier() {
    return notNullChild(findChildByType(IDENTIFIER));
  }

  @Override
  public List<FormulaEngineFunctionDefinition> getInnerFunctionDefinitions() {
    return FormulaEnginePsiImplUtil.getInnerFunctionDefinitions(this);
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
