// This is a generated file. Not intended for manual editing.
package de.cofinpro.intellij.acfeplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface FormulaEngineSwitch extends PsiElement {

  @NotNull
  List<FormulaEngineConstant> getConstantList();

  @NotNull
  List<FormulaEngineControlStructureBody> getControlStructureBodyList();

  @NotNull
  FormulaEngineExpression getExpression();

}
