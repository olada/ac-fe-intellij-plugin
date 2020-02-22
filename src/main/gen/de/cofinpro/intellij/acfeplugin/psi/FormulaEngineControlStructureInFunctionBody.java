// This is a generated file. Not intended for manual editing.
package de.cofinpro.intellij.acfeplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface FormulaEngineControlStructureInFunctionBody extends PsiElement {

  @NotNull
  List<FormulaEngineControlStructureInFunction> getControlStructureInFunctionList();

  @NotNull
  List<FormulaEngineReturnStatement> getReturnStatementList();

  @NotNull
  List<FormulaEngineStatement> getStatementList();

}
