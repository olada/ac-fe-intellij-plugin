// This is a generated file. Not intended for manual editing.
package de.cofinpro.intellij.acfeplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
import com.intellij.psi.StubBasedPsiElement;
import de.cofinpro.intellij.acfeplugin.psi.stub2.FunctionDefinitionStub;
import com.intellij.psi.PsiReference;

public interface FormulaEngineFunctionDefinition extends FormulaEngineNameIdentifierOwner, StubBasedPsiElement<FunctionDefinitionStub> {

  @NotNull
  FormulaEngineFunctionBody getFunctionBody();

  @Nullable
  FormulaEngineFunctionParameters getFunctionParameters();

  @NotNull
  PsiElement getIdentifier();

  String getIdentifierName();

  PsiReference getReference();

  int getTextOffset();

}
