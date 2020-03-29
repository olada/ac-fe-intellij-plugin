package de.cofinpro.intellij.acfeplugin.psi.stub;

import com.intellij.psi.PsiElement;
import com.intellij.psi.stubs.IStubElementType;
import com.intellij.psi.stubs.StubElement;
import de.cofinpro.intellij.acfeplugin.FormulaEngineFileType;
import org.jetbrains.annotations.NotNull;

public abstract class ElementTypeBase<StubT extends StubElement, PsiT extends PsiElement> extends IStubElementType<StubT, PsiT> {
    public ElementTypeBase(@NotNull String debugName) {
        super(debugName, FormulaEngineFileType.INSTANCE.getLanguage());
    }

    @NotNull
    @Override
    public String getExternalId() {
        return "fe." + super.toString();
    }
}
