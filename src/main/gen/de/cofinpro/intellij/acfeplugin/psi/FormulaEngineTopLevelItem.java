// This is a generated file. Not intended for manual editing.
package de.cofinpro.intellij.acfeplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface FormulaEngineTopLevelItem extends PsiElement {

  @Nullable
  FormulaEngineFunctionDefinition getFunctionDefinition();

  @Nullable
  FormulaEngineGlobalAssignment getGlobalAssignment();

  @Nullable
  FormulaEngineGlobalDeclaration getGlobalDeclaration();

}
