package de.cofinpro.intellij.acfeplugin.psi.stub;

import com.intellij.psi.PsiFile;
import com.intellij.psi.stubs.IStubElementType;
import com.intellij.psi.stubs.NamedStubBase;
import com.intellij.psi.stubs.StubElement;
import com.intellij.util.io.StringRef;
import de.cofinpro.intellij.acfeplugin.psi.FormulaEngineDeclaration;
import de.cofinpro.intellij.acfeplugin.psi.FormulaEngineFunctionDefinition;

public class DeclarationStubImpl extends NamedStubBase<FormulaEngineDeclaration> implements DeclarationStub {
    private final boolean topLevel;
    private final boolean global;

    protected DeclarationStubImpl(StubElement parent, IStubElementType elementType, FormulaEngineDeclaration declaration) {
        super(parent, elementType, declaration.getIdentifierLiteral().getText());
        this.topLevel = declaration.getParent() instanceof PsiFile;
        this.global = declaration.getVisibility().getText().equalsIgnoreCase("global");
    }

    public DeclarationStubImpl(StubElement parentStub, DeclarationElementType declarationElementType, StringRef stringRef, boolean toplevel, boolean global) {
        super(parentStub, declarationElementType, stringRef);
        this.topLevel = toplevel;
        this.global = global;
    }

    @Override
    public boolean isToplevel() {
        return topLevel;
    }

    @Override
    public boolean isGlobalDeclaration() {
        return global;
    }
}
