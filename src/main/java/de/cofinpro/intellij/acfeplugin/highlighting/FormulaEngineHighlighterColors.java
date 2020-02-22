package de.cofinpro.intellij.acfeplugin.highlighting;

import com.intellij.openapi.editor.DefaultLanguageHighlighterColors;
import com.intellij.openapi.editor.colors.TextAttributesKey;

import static com.intellij.openapi.editor.DefaultLanguageHighlighterColors.FUNCTION_DECLARATION;
import static com.intellij.openapi.editor.DefaultLanguageHighlighterColors.KEYWORD;
import static com.intellij.openapi.editor.colors.TextAttributesKey.createTextAttributesKey;

public class FormulaEngineHighlighterColors {
    public static final TextAttributesKey FUNCTION_ATTR_KEY = createTextAttributesKey("FE_FUNCTION", FUNCTION_DECLARATION);

    // Data Types
    public static final TextAttributesKey DATE_ATTR_KEY = createTextAttributesKey("FE_DATE", KEYWORD);
    public static final TextAttributesKey INTEGER_ATTR_KEY = createTextAttributesKey("FE_INTEGER", KEYWORD);
    public static final TextAttributesKey FLOAT_ATTR_KEY = createTextAttributesKey("FE_FLOAT", KEYWORD);
    public static final TextAttributesKey STRING_ATTR_KEY = createTextAttributesKey("FE_STRING", KEYWORD);
    public static final TextAttributesKey LIST_ATTR_KEY = createTextAttributesKey("FE_LIST", KEYWORD);
    public static final TextAttributesKey DICT_ATTR_KEY = createTextAttributesKey("FE_DICT", KEYWORD);
    public static final TextAttributesKey ANY_ATTR_KEY = createTextAttributesKey("FE_ANY", KEYWORD);

    // Variable Visibility
    public static final TextAttributesKey LOCAL_ATTR_KEY = createTextAttributesKey("FE_LOCAL", KEYWORD);
    public static final TextAttributesKey GLOBAL_ATTR_KEY = createTextAttributesKey("FE_GLOBAL", KEYWORD);

    // Keywords
    public static final TextAttributesKey RETURN_ATTR_KEY = createTextAttributesKey("FE_RETURN", KEYWORD);
    public static final TextAttributesKey ELSE_ATTR_KEY = createTextAttributesKey("FE_ELSE", KEYWORD);
    public static final TextAttributesKey FOR_ATTR_KEY = createTextAttributesKey("FE_FOR", KEYWORD);
    public static final TextAttributesKey IF_ATTR_KEY = createTextAttributesKey("FE_IF", KEYWORD);
    public static final TextAttributesKey SEQ_ATTR_KEY = createTextAttributesKey("FE_SEQ", KEYWORD);
    public static final TextAttributesKey WHILE_ATTR_KEY = createTextAttributesKey("FE_WHILE", KEYWORD);

    // Strings
    public static final TextAttributesKey STRINGS_DOUBLE_QUOTED = createTextAttributesKey("FE_STRING_DOUBLE_QUOTE", DefaultLanguageHighlighterColors.STRING);
    public static final TextAttributesKey STRINGS_SINGLE_QUOTED = createTextAttributesKey("FE_STRING_SINGLE_QUOTE", DefaultLanguageHighlighterColors.STRING);

    // Comments
    public static final TextAttributesKey COMMENT_SINGLE_LINE = createTextAttributesKey("FE_COMMENT_SINGLE_LINE", DefaultLanguageHighlighterColors.LINE_COMMENT);
    public static final TextAttributesKey COMMENT_BLOCK = createTextAttributesKey("FE_COMMENT_BLOCK", DefaultLanguageHighlighterColors.BLOCK_COMMENT);

    // Operators
    public static final TextAttributesKey OPERATOR_AND = createTextAttributesKey("FE_OPERATOR_AND", DefaultLanguageHighlighterColors.OPERATION_SIGN);

    // Built in Variables
    public static final TextAttributesKey INBUILT_VARIABLE_NA_ATTR_KEY = createTextAttributesKey("FE_INBUILT_VARIABLE_NA", DefaultLanguageHighlighterColors.STATIC_FIELD);
    public static final TextAttributesKey INBUILT_VARIABLE_TODAY_ATTR_KEY = createTextAttributesKey("FE_INBUILT_VARIABLE_TODAY", DefaultLanguageHighlighterColors.STATIC_FIELD);

    // Built in Functions
    public static final TextAttributesKey INBUILT_FUNCTION_ATTRIBUTE_ATTR_KEY = createTextAttributesKey("FE_INBUILT_FUNCTION_ATTRIBUTE", DefaultLanguageHighlighterColors.STATIC_FIELD);
    public static final TextAttributesKey INBUILT_FUNCTION_DATE_ATTR_KEY = createTextAttributesKey("FE_INBUILT_FUNCTION_DATE", DefaultLanguageHighlighterColors.STATIC_FIELD);
    public static final TextAttributesKey INBUILT_FUNCTION_DATETIME_ATTR_KEY = createTextAttributesKey("FE_INBUILT_FUNCTION_DATETIME", DefaultLanguageHighlighterColors.STATIC_FIELD);
    public static final TextAttributesKey INBUILT_FUNCTION_DAYDIFF_ATTR_KEY = createTextAttributesKey("FE_INBUILT_FUNCTION_DAYDIFF", DefaultLanguageHighlighterColors.STATIC_FIELD);
    public static final TextAttributesKey INBUILT_FUNCTION_DAYPLUS_ATTR_KEY = createTextAttributesKey("FE_INBUILT_FUNCTION_DAYPLUS", DefaultLanguageHighlighterColors.STATIC_FIELD);
    public static final TextAttributesKey INBUILT_FUNCTION_ELT_ATTR_KEY = createTextAttributesKey("FE_INBUILT_FUNCTION_ELT", DefaultLanguageHighlighterColors.STATIC_FIELD);
    public static final TextAttributesKey INBUILT_FUNCTION_FIRST_ATTR_KEY = createTextAttributesKey("FE_INBUILT_FUNCTION_FIRST", DefaultLanguageHighlighterColors.STATIC_FIELD);
    public static final TextAttributesKey INBUILT_FUNCTION_FLOAT_ATTR_KEY = createTextAttributesKey("FE_INBUILT_FUNCTION_FLOAT", DefaultLanguageHighlighterColors.STATIC_FIELD);
    public static final TextAttributesKey INBUILT_FUNCTION_INTEGER_ATTR_KEY = createTextAttributesKey("FE_INBUILT_FUNCTION_INTEGER", DefaultLanguageHighlighterColors.STATIC_FIELD);
    public static final TextAttributesKey INBUILT_FUNCTION_HASH_GET_ATTR_KEY = createTextAttributesKey("FE_INBUILT_FUNCTION_HASH_GET", DefaultLanguageHighlighterColors.STATIC_FIELD);
    public static final TextAttributesKey INBUILT_FUNCTION_HASH_ISKEY_ATTR_KEY = createTextAttributesKey("FE_INBUILT_FUNCTION_HASH_ISKEY", DefaultLanguageHighlighterColors.STATIC_FIELD);
    public static final TextAttributesKey INBUILT_FUNCTION_HASH_KEYS_ATTR_KEY = createTextAttributesKey("FE_INBUILT_FUNCTION_HASH_KEYS", DefaultLanguageHighlighterColors.STATIC_FIELD);
    public static final TextAttributesKey INBUILT_FUNCTION_HASH_PUT_ATTR_KEY = createTextAttributesKey("FE_INBUILT_FUNCTION_HASH_PUT", DefaultLanguageHighlighterColors.STATIC_FIELD);
    public static final TextAttributesKey INBUILT_FUNCTION_IS_NA_ATTR_KEY = createTextAttributesKey("FE_INBUILT_FUNCTION_IS_NA", DefaultLanguageHighlighterColors.STATIC_FIELD);
    public static final TextAttributesKey INBUILT_FUNCTION_IS_LIST_ATTR_KEY = createTextAttributesKey("FE_INBUILT_FUNCTION_IS_LIST", DefaultLanguageHighlighterColors.STATIC_FIELD);
    public static final TextAttributesKey INBUILT_FUNCTION_IS_STRING_ATTR_KEY = createTextAttributesKey("FE_INBUILT_FUNCTION_IS_STRING", DefaultLanguageHighlighterColors.STATIC_FIELD);
    public static final TextAttributesKey INBUILT_FUNCTION_KERNEL_ATTR_KEY = createTextAttributesKey("FE_INBUILT_FUNCTION_KERNEL", DefaultLanguageHighlighterColors.STATIC_FIELD);
    public static final TextAttributesKey INBUILT_FUNCTION_LEN_ATTR_KEY = createTextAttributesKey("FE_INBUILT_FUNCTION_LEN", DefaultLanguageHighlighterColors.STATIC_FIELD);
    public static final TextAttributesKey INBUILT_FUNCTION_LOAD_ATTR_KEY = createTextAttributesKey("FE_INBUILT_FUNCTION_LOAD", DefaultLanguageHighlighterColors.STATIC_FIELD);
    public static final TextAttributesKey INBUILT_FUNCTION_OUT_ATTR_KEY = createTextAttributesKey("FE_INBUILT_FUNCTION_OUT", DefaultLanguageHighlighterColors.STATIC_FIELD);
    public static final TextAttributesKey INBUILT_FUNCTION_REMOVE_ATTR_KEY = createTextAttributesKey("FE_INBUILT_FUNCTION_REMOVE", DefaultLanguageHighlighterColors.STATIC_FIELD);
    public static final TextAttributesKey INBUILT_FUNCTION_STATUS_ATTR_KEY = createTextAttributesKey("FE_INBUILT_FUNCTION_STATUS", DefaultLanguageHighlighterColors.STATIC_FIELD);
    public static final TextAttributesKey INBUILT_FUNCTION_STR_ATTR_KEY = createTextAttributesKey("FE_INBUILT_FUNCTION_STR", DefaultLanguageHighlighterColors.STATIC_FIELD);

    // General Tokens
    public static final TextAttributesKey NUMBER_INTEGER = createTextAttributesKey("FE_NUMBER_INTEGER", DefaultLanguageHighlighterColors.NUMBER);
}