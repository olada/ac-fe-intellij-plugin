// This is a generated file. Not intended for manual editing.
package de.cofinpro.intellij.acfeplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface FormulaEngineControlStructure extends PsiElement {

  @Nullable
  FormulaEngineControlStructureBody getControlStructureBody();

  @Nullable
  FormulaEngineControlStructureKeyword getControlStructureKeyword();

  @Nullable
  FormulaEngineExpression getExpression();

  @Nullable
  FormulaEngineFor getFor();

  @Nullable
  FormulaEngineIf getIf();

}
