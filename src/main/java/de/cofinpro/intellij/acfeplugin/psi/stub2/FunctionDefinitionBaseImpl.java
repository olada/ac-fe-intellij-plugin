package de.cofinpro.intellij.acfeplugin.psi.stub2;

import com.intellij.extapi.psi.StubBasedPsiElementBase;
import com.intellij.lang.ASTNode;
import com.intellij.psi.stubs.IStubElementType;
import de.cofinpro.intellij.acfeplugin.psi.FormulaEngineFunctionDefinition;
import org.jetbrains.annotations.NotNull;

public abstract class FunctionDefinitionBaseImpl extends StubBasedPsiElementBase<FunctionDefinitionStub> implements FormulaEngineFunctionDefinition {

    public FunctionDefinitionBaseImpl(@NotNull ASTNode node) {
        super(node);
    }

    @Override
    public IStubElementType getElementType() {
        return null;
    }

    @Override
    public FunctionDefinitionStub getStub() {
        return null;
    }
}
