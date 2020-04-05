package de.cofinpro.intellij.acfeplugin;

import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;

import java.util.Collection;

public interface FormulaEngineFile extends PsiFile {
    Collection<PsiElement> getTopLevelElements();
}
