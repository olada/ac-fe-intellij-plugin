package de.cofinpro.intellij.acfeplugin;

import com.intellij.psi.PsiFile;
import de.cofinpro.intellij.acfeplugin.psi.FormulaEngineFunctionDefinition;

import java.util.List;

public interface FormulaEngineFile extends PsiFile {
    List<FormulaEngineFunctionDefinition> getFunctionDefinitions();
}
