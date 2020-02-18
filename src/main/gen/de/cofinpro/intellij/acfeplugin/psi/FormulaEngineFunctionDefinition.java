// This is a generated file. Not intended for manual editing.
package de.cofinpro.intellij.acfeplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface FormulaEngineFunctionDefinition extends PsiElement {

  @NotNull
  FormulaEngineFunctionBody getFunctionBody();

  @Nullable
  FormulaEngineFunctionParameters getFunctionParameters();

  @NotNull
  PsiElement getIdentifier();

}
