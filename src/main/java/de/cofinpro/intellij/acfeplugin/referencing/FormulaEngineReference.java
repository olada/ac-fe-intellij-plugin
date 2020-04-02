package de.cofinpro.intellij.acfeplugin.referencing;

import com.intellij.openapi.util.TextRange;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiReferenceBase;
import org.jetbrains.annotations.NotNull;

/**
 * Base reference class for the Formula Engine language.
 * This is primarily necessary because {@link #getRangeInElement()} needs to be overridden
 *
 * @see
 *      <a href="https://intellij-support.jetbrains.com/hc/en-us/community/posts/115000006084/comments/115000091030">
 *          Jetbrains Comment Thread
 *      </a>
 */
public abstract class FormulaEngineReference extends PsiReferenceBase<PsiElement> {
    public FormulaEngineReference(@NotNull PsiElement element) {
        super(element);
    }

    /**
     * Controls which portion of an element can be used to resolve a reference.
     * This can be shown by holding down the ctrl or the command button.
     * @return text range of the element which is used for resolving
     */
    @NotNull
    @Override
    public TextRange getRangeInElement() {
        int indexOfLeftParenthesis = getElement().getText().indexOf('(');
        if (indexOfLeftParenthesis >= 0) {
            return TextRange.from(0, indexOfLeftParenthesis);
        } else {
            int indexOfLeftBracket = getElement().getText().indexOf('[');
            if (indexOfLeftBracket >= 0) {
                return TextRange.from(0, indexOfLeftBracket);
            } else {
                return TextRange.from(0, getElement().getTextLength());
            }
        }
    }
}
