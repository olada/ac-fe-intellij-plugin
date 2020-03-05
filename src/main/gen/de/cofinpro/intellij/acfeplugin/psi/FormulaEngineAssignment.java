// This is a generated file. Not intended for manual editing.
package de.cofinpro.intellij.acfeplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface FormulaEngineAssignment extends PsiElement {

  @Nullable
  FormulaEngineAssignmentOperator getAssignmentOperator();

  @Nullable
  FormulaEngineDeclaration getDeclaration();

  @Nullable
  FormulaEngineExpression getExpression();

  @Nullable
  FormulaEnginePostfixOperator getPostfixOperator();

  @Nullable
  FormulaEnginePrefixOperator getPrefixOperator();

  @Nullable
  FormulaEngineSeq getSeq();

  @Nullable
  PsiElement getIdentifier();

}
