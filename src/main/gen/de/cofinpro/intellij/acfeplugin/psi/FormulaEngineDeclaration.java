// This is a generated file. Not intended for manual editing.
package de.cofinpro.intellij.acfeplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface FormulaEngineDeclaration extends FormulaEngineNameIdentifierOwner {

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

}
