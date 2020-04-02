// This is a generated file. Not intended for manual editing.
package de.cofinpro.intellij.acfeplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface FormulaEngineFor extends PsiElement {

  @Nullable
  FormulaEngineControlStructure getControlStructure();

  @Nullable
  FormulaEngineControlStructureBody getControlStructureBody();

  @Nullable
  FormulaEngineSeqForParenthesis getSeqForParenthesis();

  @Nullable
  FormulaEngineStatement getStatement();

}
