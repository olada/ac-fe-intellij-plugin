// This is a generated file. Not intended for manual editing.
package de.cofinpro.intellij.acfeplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface FormulaEngineFunctionBodyStatement extends PsiElement {

  @Nullable
  FormulaEngineAssignment getAssignment();

  @Nullable
  FormulaEngineControlStructure getControlStructure();

  @Nullable
  FormulaEngineDeclaration getDeclaration();

  @Nullable
  FormulaEngineFunctionInvocation getFunctionInvocation();

  @Nullable
  FormulaEngineReturnStatement getReturnStatement();

}
