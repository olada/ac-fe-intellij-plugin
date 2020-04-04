// This is a generated file. Not intended for manual editing.
package de.cofinpro.intellij.acfeplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
import com.intellij.psi.StubBasedPsiElement;
import de.cofinpro.intellij.acfeplugin.psi.stub.DeclarationStub;

public interface FormulaEngineDeclaration extends FormulaEngineNameIdentifierOwner, StubBasedPsiElement<DeclarationStub> {

  @Nullable
  FormulaEngineExpression getExpression();

  @NotNull
  FormulaEngineIdentifierLiteral getIdentifierLiteral();

  @Nullable
  FormulaEngineSeq getSeq();

  @Nullable
  FormulaEngineType getType();

  @NotNull
  FormulaEngineVisibility getVisibility();

  String getName();

  int getTextOffset();

  PsiElement setName(String name);

}
