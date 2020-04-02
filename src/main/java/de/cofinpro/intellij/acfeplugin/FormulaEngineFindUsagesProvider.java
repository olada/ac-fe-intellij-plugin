package de.cofinpro.intellij.acfeplugin;

import com.intellij.lang.HelpID;
import com.intellij.lang.cacheBuilder.DefaultWordsScanner;
import com.intellij.lang.cacheBuilder.WordsScanner;
import com.intellij.lang.findUsages.FindUsagesProvider;
import com.intellij.psi.PsiElement;
import com.intellij.psi.tree.TokenSet;
import de.cofinpro.intellij.acfeplugin.lex.FormulaEngineLexerAdapter;
import de.cofinpro.intellij.acfeplugin.psi.FormulaEngineDeclaration;
import de.cofinpro.intellij.acfeplugin.psi.FormulaEngineElementTypes;
import de.cofinpro.intellij.acfeplugin.psi.FormulaEngineFunctionDefinition;
import de.cofinpro.intellij.acfeplugin.psi.FormulaEnginePsiPresentationTextCreator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class FormulaEngineFindUsagesProvider implements FindUsagesProvider {
    private static final FormulaEnginePsiPresentationTextCreator presentationTextCreator = new FormulaEnginePsiPresentationTextCreator();

    private static class FormulaEngineWordsScanner extends DefaultWordsScanner {
        public FormulaEngineWordsScanner() {
            super(
                    new FormulaEngineLexerAdapter(),
                    TokenSet.create(FormulaEngineElementTypes.IDENTIFIER, FormulaEngineElementTypes.IDENTIFIER_LITERAL),
                    FormulaEngineParserDefinition.COMMENTS,
                    FormulaEngineParserDefinition.LITERALS
            );
        }
    }
    @Nullable
    @Override
    public WordsScanner getWordsScanner() {
        return new FormulaEngineWordsScanner();
    }

    @Override
    public boolean canFindUsagesFor(@NotNull PsiElement psiElement) {
        return psiElement instanceof FormulaEngineFunctionDefinition
                || psiElement instanceof FormulaEngineDeclaration;
    }

    @Nullable
    @Override
    public String getHelpId(@NotNull PsiElement psiElement) {
        return HelpID.FIND_OTHER_USAGES;
    }

    @NotNull
    @Override
    public String getType(@NotNull PsiElement element) {
        if (element instanceof FormulaEngineFunctionDefinition) {
            return "function";
        } else if (element instanceof FormulaEngineDeclaration) {
            return "variable";
        }
        return null;
    }

    @NotNull
    @Override
    public String getDescriptiveName(@NotNull PsiElement element) {
        if (element instanceof FormulaEngineFunctionDefinition) {
            return presentationTextCreator.createTextFor((FormulaEngineFunctionDefinition) element);
        } else if (element instanceof FormulaEngineDeclaration) {
            return "declaration descriptive name";
        }
        return null;
    }

    @NotNull
    @Override
    public String getNodeText(@NotNull PsiElement element, boolean useFullName) {
        if (element instanceof FormulaEngineFunctionDefinition) {
            return presentationTextCreator.createTextFor((FormulaEngineFunctionDefinition) element);
        } else if (element instanceof FormulaEngineDeclaration) {
            String identifierName = ((FormulaEngineDeclaration) element).getName();
            return identifierName == null ? "" : identifierName;
        }
        return null;
    }
}
