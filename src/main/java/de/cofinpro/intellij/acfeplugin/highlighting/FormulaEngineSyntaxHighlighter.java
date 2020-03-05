package de.cofinpro.intellij.acfeplugin.highlighting;

import com.intellij.lexer.Lexer;
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors;
import com.intellij.openapi.editor.HighlighterColors;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase;
import com.intellij.psi.tree.IElementType;
// import com.sun.tools.internal.xjc.generator.bean.ImplStructureStrategy;
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

    protected static final Map<IElementType, TextAttributesKey> ATTRIBUTES = new HashMap<>();

    static {
        // Types
        safeMap(ATTRIBUTES, FormulaEngineElementTypes.KEYWORD_DATE, DATE_ATTR_KEY);
        safeMap(ATTRIBUTES, FormulaEngineElementTypes.KEYWORD_DATETIME, DATETIME_ATTR_KEY);
        safeMap(ATTRIBUTES, FormulaEngineElementTypes.KEYWORD_FLOAT, FLOAT_ATTR_KEY);
        safeMap(ATTRIBUTES, FormulaEngineElementTypes.KEYWORD_INTEGER, INTEGER_ATTR_KEY);
        safeMap(ATTRIBUTES, FormulaEngineElementTypes.KEYWORD_STRING, STRING_ATTR_KEY);
        safeMap(ATTRIBUTES, FormulaEngineElementTypes.KEYWORD_LIST, LIST_ATTR_KEY);
        safeMap(ATTRIBUTES, FormulaEngineElementTypes.KEYWORD_DICT, DICT_ATTR_KEY);
        safeMap(ATTRIBUTES, FormulaEngineElementTypes.KEYWORD_ANY, ANY_ATTR_KEY);

        safeMap(ATTRIBUTES, FormulaEngineElementTypes.VISIBILITY_LOCAL, LOCAL_ATTR_KEY);
        safeMap(ATTRIBUTES, FormulaEngineElementTypes.VISIBILITY_GLOBAL, GLOBAL_ATTR_KEY);

        // Keywords
        safeMap(ATTRIBUTES, FormulaEngineElementTypes.KEYWORD_AND, AND_ATTR_KEY);
        safeMap(ATTRIBUTES, FormulaEngineElementTypes.KEYWORD_BREAK, BREAK_ATTR_KEY);
        safeMap(ATTRIBUTES, FormulaEngineElementTypes.KEYWORD_CASE, CASE_ATTR_KEY);
        safeMap(ATTRIBUTES, FormulaEngineElementTypes.KEYWORD_DEFAULT, DEFAULT_ATTR_KEY);
        safeMap(ATTRIBUTES, FormulaEngineElementTypes.KEYWORD_DO, DO_ATTR_KEY);
        safeMap(ATTRIBUTES, FormulaEngineElementTypes.KEYWORD_ELSE, ELSE_ATTR_KEY);
        safeMap(ATTRIBUTES, FormulaEngineElementTypes.KEYWORD_FOR, FOR_ATTR_KEY);
        safeMap(ATTRIBUTES, FormulaEngineElementTypes.KEYWORD_FUNCTION, FUNCTION_ATTR_KEY);
        safeMap(ATTRIBUTES, FormulaEngineElementTypes.KEYWORD_IF, IF_ATTR_KEY);
        safeMap(ATTRIBUTES, FormulaEngineElementTypes.KEYWORD_OR, OR_ATTR_KEY);
        safeMap(ATTRIBUTES, FormulaEngineElementTypes.KEYWORD_RETURN, RETURN_ATTR_KEY);
        safeMap(ATTRIBUTES, FormulaEngineElementTypes.KEYWORD_SEQ, SEQ_ATTR_KEY);
        safeMap(ATTRIBUTES, FormulaEngineElementTypes.KEYWORD_SWITCH, SWITCH_ATTR_KEY);
        safeMap(ATTRIBUTES, FormulaEngineElementTypes.KEYWORD_WHILE, WHILE_ATTR_KEY);

        // Strings
        safeMap(ATTRIBUTES, FormulaEngineElementTypes.DOUBLE_QUOTED_STRING, STRINGS_DOUBLE_QUOTED);
        safeMap(ATTRIBUTES, FormulaEngineElementTypes.SINGLE_QUOTED_STRING, STRINGS_SINGLE_QUOTED);

        // Comments
        safeMap(ATTRIBUTES, FormulaEngineElementTypes.LINE_COMMENT, COMMENT_SINGLE_LINE);
        safeMap(ATTRIBUTES, FormulaEngineElementTypes.BLOCK_COMMENT, COMMENT_BLOCK);

        // Operators
        safeMap(ATTRIBUTES, FormulaEngineElementTypes.OPERATOR_AND, OPERATOR_AND);

        // Built in variables
        safeMap(ATTRIBUTES, FormulaEngineElementTypes.BUILT_IN_VAR_NA, INBUILT_VARIABLE_NA_ATTR_KEY);
        safeMap(ATTRIBUTES, FormulaEngineElementTypes.BUILT_IN_VAR_TODAY, INBUILT_VARIABLE_TODAY_ATTR_KEY);
        safeMap(ATTRIBUTES, FormulaEngineElementTypes.BUILT_IN_VAR_TIMETODAY, INBUILT_VARIABLE_TIMETODAY_ATTR_KEY);
        safeMap(ATTRIBUTES, FormulaEngineElementTypes.BUILT_IN_VAR_SYMBOL, INBUILT_VARIABLE_SYMBOL_ATTR_KEY);
        safeMap(ATTRIBUTES, FormulaEngineElementTypes.BUILT_IN_VAR_NAME, INBUILT_VARIABLE_NAME_ATTR_KEY);
        safeMap(ATTRIBUTES, FormulaEngineElementTypes.BUILT_IN_VAR_PROCESSED, INBUILT_VARIABLE_PROCESSED_ATTR_KEY);
        safeMap(ATTRIBUTES, FormulaEngineElementTypes.BUILT_IN_VAR_PASSED, INBUILT_VARIABLE_PASSED_ATTR_KEY);
        safeMap(ATTRIBUTES, FormulaEngineElementTypes.BUILT_IN_VAR_LISTID, INBUILT_VARIABLE_LISTID_ATTR_KEY);
        safeMap(ATTRIBUTES, FormulaEngineElementTypes.BUILT_IN_VAR_LISTTP, INBUILT_VARIABLE_LISTTP_ATTR_KEY);
        safeMap(ATTRIBUTES, FormulaEngineElementTypes.BUILT_IN_VAR_TREEID, INBUILT_VARIABLE_TREEID_ATTR_KEY);
        safeMap(ATTRIBUTES, FormulaEngineElementTypes.BUILT_IN_VAR_FIELD, INBUILT_VARIABLE_FIELD_ATTR_KEY);
        safeMap(ATTRIBUTES, FormulaEngineElementTypes.BUILT_IN_VAR_FIELDS, INBUILT_VARIABLE_FIELDS_ATTR_KEY);
        safeMap(ATTRIBUTES, FormulaEngineElementTypes.BUILT_IN_VAR_DATA, INBUILT_VARIABLE_DATA_ATTR_KEY);
        safeMap(ATTRIBUTES, FormulaEngineElementTypes.BUILT_IN_VAR_STATUS, INBUILT_VARIABLE_STATUS_ATTR_KEY);
        safeMap(ATTRIBUTES, FormulaEngineElementTypes.BUILT_IN_VAR_DEPENDENCIES, INBUILT_VARIABLE_DEPENDENCIES_ATTR_KEY);
        safeMap(ATTRIBUTES, FormulaEngineElementTypes.BUILT_IN_VAR_DEPENDENCIES_TRIGGERS, INBUILT_VARIABLE_DEPENDENCIES_TRIGGERS_ATTR_KEY);

        // Built in functions
        safeMap(ATTRIBUTES, FormulaEngineElementTypes.BUILT_IN_FUNC_ATTRIBUTE, INBUILT_FUNCTION_ATTRIBUTE_ATTR_KEY);
        safeMap(ATTRIBUTES, FormulaEngineElementTypes.BUILT_IN_FUNC_DATE, INBUILT_FUNCTION_DATE_ATTR_KEY);
        safeMap(ATTRIBUTES, FormulaEngineElementTypes.BUILT_IN_FUNC_DATETIME, INBUILT_FUNCTION_DATETIME_ATTR_KEY);
        safeMap(ATTRIBUTES, FormulaEngineElementTypes.BUILT_IN_FUNC_DAYDIFF, INBUILT_FUNCTION_DAYDIFF_ATTR_KEY);
        safeMap(ATTRIBUTES, FormulaEngineElementTypes.BUILT_IN_FUNC_DAYPLUS, INBUILT_FUNCTION_DAYPLUS_ATTR_KEY);
        safeMap(ATTRIBUTES, FormulaEngineElementTypes.BUILT_IN_FUNC_ELT, INBUILT_FUNCTION_ELT_ATTR_KEY);
        safeMap(ATTRIBUTES, FormulaEngineElementTypes.BUILT_IN_FUNC_FIRST, INBUILT_FUNCTION_FIRST_ATTR_KEY);
        safeMap(ATTRIBUTES, FormulaEngineElementTypes.BUILT_IN_FUNC_FLOAT, INBUILT_FUNCTION_FLOAT_ATTR_KEY);
        safeMap(ATTRIBUTES, FormulaEngineElementTypes.BUILT_IN_FUNC_HASH_GET, INBUILT_FUNCTION_HASH_GET_ATTR_KEY);
        safeMap(ATTRIBUTES, FormulaEngineElementTypes.BUILT_IN_FUNC_HASH_ISKEY, INBUILT_FUNCTION_HASH_ISKEY_ATTR_KEY);
        safeMap(ATTRIBUTES, FormulaEngineElementTypes.BUILT_IN_FUNC_HASH_KEYS, INBUILT_FUNCTION_HASH_KEYS_ATTR_KEY);
        safeMap(ATTRIBUTES, FormulaEngineElementTypes.BUILT_IN_FUNC_HASH_PUT, INBUILT_FUNCTION_HASH_PUT_ATTR_KEY);
        safeMap(ATTRIBUTES, FormulaEngineElementTypes.BUILT_IN_FUNC_INTEGER, INBUILT_FUNCTION_INTEGER_ATTR_KEY);
        safeMap(ATTRIBUTES, FormulaEngineElementTypes.BUILT_IN_FUNC_IS_LIST, INBUILT_FUNCTION_IS_LIST_ATTR_KEY);
        safeMap(ATTRIBUTES, FormulaEngineElementTypes.BUILT_IN_FUNC_IS_NA, INBUILT_FUNCTION_IS_NA_ATTR_KEY);
        safeMap(ATTRIBUTES, FormulaEngineElementTypes.BUILT_IN_FUNC_IS_STRING, INBUILT_FUNCTION_IS_STRING_ATTR_KEY);
        safeMap(ATTRIBUTES, FormulaEngineElementTypes.BUILT_IN_FUNC_KERNEL, INBUILT_FUNCTION_KERNEL_ATTR_KEY);
        safeMap(ATTRIBUTES, FormulaEngineElementTypes.BUILT_IN_FUNC_LEN, INBUILT_FUNCTION_LEN_ATTR_KEY);
        safeMap(ATTRIBUTES, FormulaEngineElementTypes.BUILT_IN_FUNC_LIST, INBUILT_FUNCTION_LIST_ATTR_KEY);
        safeMap(ATTRIBUTES, FormulaEngineElementTypes.BUILT_IN_FUNC_LOAD, INBUILT_FUNCTION_LOAD_ATTR_KEY);
        safeMap(ATTRIBUTES, FormulaEngineElementTypes.BUILT_IN_FUNC_MAP, INBUILT_FUNCTION_MAP_ATTR_KEY);
        safeMap(ATTRIBUTES, FormulaEngineElementTypes.BUILT_IN_FUNC_MAX, INBUILT_FUNCTION_MAX_ATTR_KEY);
        safeMap(ATTRIBUTES, FormulaEngineElementTypes.BUILT_IN_FUNC_OUT, INBUILT_FUNCTION_OUT_ATTR_KEY);
        safeMap(ATTRIBUTES, FormulaEngineElementTypes.BUILT_IN_FUNC_REMOVE, INBUILT_FUNCTION_REMOVE_ATTR_KEY);
        safeMap(ATTRIBUTES, FormulaEngineElementTypes.BUILT_IN_FUNC_STATUS, INBUILT_FUNCTION_STATUS_ATTR_KEY);
        safeMap(ATTRIBUTES, FormulaEngineElementTypes.BUILT_IN_FUNC_STR, INBUILT_FUNCTION_STR_ATTR_KEY);
        safeMap(ATTRIBUTES, FormulaEngineElementTypes.BUILT_IN_FUNC_STRING, INBUILT_FUNCTION_STRING_ATTR_KEY);

        // General Tokens
        safeMap(ATTRIBUTES, FormulaEngineElementTypes.NUMBER_SCIENTIFIC, NUMBER_SCIENTIFIC);
        safeMap(ATTRIBUTES, FormulaEngineElementTypes.NUMBER_FLOAT, NUMBER_FLOAT);
        safeMap(ATTRIBUTES, FormulaEngineElementTypes.NUMBER_INTEGER, NUMBER_INTEGER);
        safeMap(ATTRIBUTES, FormulaEngineElementTypes.SEMICOLON, SEMICOLON);
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
