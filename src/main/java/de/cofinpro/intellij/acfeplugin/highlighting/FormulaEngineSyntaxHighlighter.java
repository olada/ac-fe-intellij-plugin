package de.cofinpro.intellij.acfeplugin.highlighting;

import com.intellij.lexer.Lexer;
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors;
import com.intellij.openapi.editor.HighlighterColors;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase;
import com.intellij.psi.TokenType;
import com.intellij.psi.tree.IElementType;
import com.intellij.util.ui.Centerizer;
import de.cofinpro.intellij.acfeplugin.lex.FormulaEngineLexerAdapter;
import de.cofinpro.intellij.acfeplugin.psi.FormulaEngineElementTypes;
import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.Map;

import static com.intellij.openapi.editor.colors.TextAttributesKey.createTextAttributesKey;
import static de.cofinpro.intellij.acfeplugin.highlighting.FormulaEngineHighlighterColors.*;

public class FormulaEngineSyntaxHighlighter extends SyntaxHighlighterBase {

    public static final TextAttributesKey SEPARATOR =
            createTextAttributesKey("SIMPLE_SEPARATOR", DefaultLanguageHighlighterColors.OPERATION_SIGN);
    public static final TextAttributesKey KEY =
            createTextAttributesKey("SIMPLE_KEY", DefaultLanguageHighlighterColors.KEYWORD);
    public static final TextAttributesKey VALUE =
            createTextAttributesKey("SIMPLE_VALUE", DefaultLanguageHighlighterColors.STRING);
    public static final TextAttributesKey COMMENT =
            createTextAttributesKey("SIMPLE_COMMENT", DefaultLanguageHighlighterColors.LINE_COMMENT);
    public static final TextAttributesKey BAD_CHARACTER =
            createTextAttributesKey("SIMPLE_BAD_CHARACTER", HighlighterColors.BAD_CHARACTER);

    private static final TextAttributesKey[] BAD_CHAR_KEYS = new TextAttributesKey[]{BAD_CHARACTER};
    private static final TextAttributesKey[] SEPARATOR_KEYS = new TextAttributesKey[]{SEPARATOR};
    private static final TextAttributesKey[] KEY_KEYS = new TextAttributesKey[]{KEY};
    private static final TextAttributesKey[] VALUE_KEYS = new TextAttributesKey[]{VALUE};
    private static final TextAttributesKey[] COMMENT_KEYS = new TextAttributesKey[]{COMMENT};
    private static final TextAttributesKey[] EMPTY_KEYS = new TextAttributesKey[0];

    protected static final Map<IElementType, TextAttributesKey> ATTRIBUTES = new HashMap<>();

    static {
        safeMap(ATTRIBUTES, FormulaEngineElementTypes.FUNCTION, FUNCTION_ATTR_KEY);

        // Keywords
        safeMap(ATTRIBUTES, FormulaEngineElementTypes.INTEGER, INTEGER_ATTR_KEY);
        safeMap(ATTRIBUTES, FormulaEngineElementTypes.STRING, STRING_ATTR_KEY);
        safeMap(ATTRIBUTES, FormulaEngineElementTypes.LIST, LIST_ATTR_KEY);
        safeMap(ATTRIBUTES, FormulaEngineElementTypes.DICT, DICT_ATTR_KEY);
        safeMap(ATTRIBUTES, FormulaEngineElementTypes.ANY, ANY_ATTR_KEY);
        safeMap(ATTRIBUTES, FormulaEngineElementTypes.LOCAL, LOCAL_ATTR_KEY);
        safeMap(ATTRIBUTES, FormulaEngineElementTypes.GLOBAL, GLOBAL_ATTR_KEY);
        safeMap(ATTRIBUTES, FormulaEngineElementTypes.RETURN, RETURN_ATTR_KEY);

        // Built in variables
        safeMap(ATTRIBUTES, FormulaEngineElementTypes.BUILT_IN_VAR_NA, INBUILT_VARIABLE_NA_ATTR_KEY);

        // Built in functions
        safeMap(ATTRIBUTES, FormulaEngineElementTypes.ATTRIBUTE, INBUILT_FUNCTION_ATTRIBUTE_ATTR_KEY);
        safeMap(ATTRIBUTES, FormulaEngineElementTypes.DATE, INBUILT_FUNCTION_DATE_ATTR_KEY);
        safeMap(ATTRIBUTES, FormulaEngineElementTypes.DATETIME, INBUILT_FUNCTION_DATETIME_ATTR_KEY);
        safeMap(ATTRIBUTES, FormulaEngineElementTypes.ELT, INBUILT_FUNCTION_ELT_ATTR_KEY);
        safeMap(ATTRIBUTES, FormulaEngineElementTypes.IS_LIST, INBUILT_FUNCTION_IS_LIST_ATTR_KEY);
        safeMap(ATTRIBUTES, FormulaEngineElementTypes.IS_NA, INBUILT_FUNCTION_IS_NA_ATTR_KEY);
        safeMap(ATTRIBUTES, FormulaEngineElementTypes.LEN, INBUILT_FUNCTION_LEN_ATTR_KEY);
        safeMap(ATTRIBUTES, FormulaEngineElementTypes.LOAD, INBUILT_FUNCTION_LOAD_ATTR_KEY);
        safeMap(ATTRIBUTES, FormulaEngineElementTypes.REMOVE, INBUILT_FUNCTION_REMOVE_ATTR_KEY);
        safeMap(ATTRIBUTES, FormulaEngineElementTypes.STATUS, INBUILT_FUNCTION_STATUS_ATTR_KEY);
        safeMap(ATTRIBUTES, FormulaEngineElementTypes.STR, INBUILT_FUNCTION_STR_ATTR_KEY);
    }


    @NotNull
    @Override
    public Lexer getHighlightingLexer() {
        return new FormulaEngineLexerAdapter();
    }

    @NotNull
    @Override
    public TextAttributesKey[] getTokenHighlights(IElementType tokenType) {
        return pack(ATTRIBUTES.get(tokenType));
    }
}
