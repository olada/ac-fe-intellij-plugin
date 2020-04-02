// This is a generated file. Not intended for manual editing.
package de.cofinpro.intellij.acfeplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiReference;

public interface FormulaEngineLeafExpression extends FormulaEngineExpression {

  @Nullable
  FormulaEngineArrayAccess getArrayAccess();

  @Nullable
  FormulaEngineBuiltInFunctionName getBuiltInFunctionName();

  @Nullable
  FormulaEngineConstant getConstant();

  @Nullable
  FormulaEngineFunctionInvocation getFunctionInvocation();

  @Nullable
  FormulaEngineIdentifierLiteral getIdentifierLiteral();

  @Nullable
  PsiElement getIdentifier();

  PsiReference getReference();

}
