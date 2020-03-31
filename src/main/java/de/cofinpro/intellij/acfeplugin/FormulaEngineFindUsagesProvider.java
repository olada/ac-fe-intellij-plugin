package de.cofinpro.intellij.acfeplugin;

import com.intellij.lang.cacheBuilder.DefaultWordsScanner;
import com.intellij.lang.cacheBuilder.WordsScanner;
import com.intellij.lang.findUsages.FindUsagesProvider;
import com.intellij.psi.PsiElement;
import com.intellij.psi.tree.TokenSet;
import de.cofinpro.intellij.acfeplugin.lex.FormulaEngineLexerAdapter;
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
        return psiElement instanceof FormulaEngineFunctionDefinition;
    }

    @Nullable
    @Override
    public String getHelpId(@NotNull PsiElement psiElement) {
        if (psiElement instanceof FormulaEngineFunctionDefinition) {
            return "reference.dialogs.findUsages.method";
        }
        return null;
    }

    @NotNull
    @Override
    public String getType(@NotNull PsiElement element) {
        if (element instanceof FormulaEngineFunctionDefinition) {
            return "function";
        }
        return null;
    }

    @NotNull
    @Override
    public String getDescriptiveName(@NotNull PsiElement element) {
        if (element instanceof FormulaEngineFunctionDefinition) {
            return presentationTextCreator.createTextFor((FormulaEngineFunctionDefinition) element);
        }
        return null;
    }

    @NotNull
    @Override
    public String getNodeText(@NotNull PsiElement element, boolean useFullName) {
        if (element instanceof FormulaEngineFunctionDefinition) {
            return ((FormulaEngineFunctionDefinition) element).getIdentifierName();
        }
        return null;
    }
}
