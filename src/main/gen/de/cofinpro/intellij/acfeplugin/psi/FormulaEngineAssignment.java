// This is a generated file. Not intended for manual editing.
package de.cofinpro.intellij.acfeplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface FormulaEngineAssignment extends PsiElement {

  @NotNull
  FormulaEngineFunctionInvocation getFunctionInvocation();

  @NotNull
  FormulaEngineTypePrefix getTypePrefix();

  @Nullable
  FormulaEngineVisibilityPrefix getVisibilityPrefix();

  @NotNull
  PsiElement getIdentifier();

}
