// This is a generated file. Not intended for manual editing.
package de.cofinpro.intellij.acfeplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface FormulaEngineSeq extends PsiElement {

  @Nullable
  FormulaEngineAssignment getAssignment();

  @Nullable
  FormulaEngineBuiltInVariableName getBuiltInVariableName();

  @Nullable
  FormulaEngineExpression getExpression();

  @Nullable
  FormulaEngineFunctionInvocation getFunctionInvocation();

  @Nullable
  FormulaEngineListLiteral getListLiteral();

  @NotNull
  FormulaEngineSeqForParenthesis getSeqForParenthesis();

}
