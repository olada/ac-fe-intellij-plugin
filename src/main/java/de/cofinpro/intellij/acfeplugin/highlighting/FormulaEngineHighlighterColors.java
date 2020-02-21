package de.cofinpro.intellij.acfeplugin.highlighting;

import com.intellij.openapi.editor.DefaultLanguageHighlighterColors;
import com.intellij.openapi.editor.colors.TextAttributesKey;

import static com.intellij.openapi.editor.DefaultLanguageHighlighterColors.FUNCTION_DECLARATION;
import static com.intellij.openapi.editor.DefaultLanguageHighlighterColors.KEYWORD;
import static com.intellij.openapi.editor.colors.TextAttributesKey.createTextAttributesKey;

public class FormulaEngineHighlighterColors {
    public static final TextAttributesKey FUNCTION_ATTR_KEY = createTextAttributesKey("FE_FUNCTION", FUNCTION_DECLARATION);
    public static final TextAttributesKey INTEGER_ATTR_KEY = createTextAttributesKey("FE_INTEGER", KEYWORD);
    public static final TextAttributesKey STRING_ATTR_KEY = createTextAttributesKey("FE_STRING", KEYWORD);
    public static final TextAttributesKey LIST_ATTR_KEY = createTextAttributesKey("FE_LIST", KEYWORD);
    public static final TextAttributesKey DICT_ATTR_KEY = createTextAttributesKey("FE_DICT", KEYWORD);
    public static final TextAttributesKey ANY_ATTR_KEY = createTextAttributesKey("FE_ANY", KEYWORD);
    public static final TextAttributesKey LOCAL_ATTR_KEY = createTextAttributesKey("FE_LOCAL", KEYWORD);
    public static final TextAttributesKey GLOBAL_ATTR_KEY = createTextAttributesKey("FE_GLOBAL", KEYWORD);
    public static final TextAttributesKey RETURN_ATTR_KEY = createTextAttributesKey("FE_RETURN", KEYWORD);

    // Built in Variables
    public static final TextAttributesKey INBUILT_VARIABLE_NA_ATTR_KEY = createTextAttributesKey("FE_INBUILT_VARIABLE_NA", DefaultLanguageHighlighterColors.STATIC_FIELD);

    // Built in Functions
    public static final TextAttributesKey INBUILT_FUNCTION_ATTRIBUTE_ATTR_KEY = createTextAttributesKey("FE_INBUILT_FUNCTION_ATTRIBUTE", DefaultLanguageHighlighterColors.STATIC_FIELD);
    public static final TextAttributesKey INBUILT_FUNCTION_DATE_ATTR_KEY = createTextAttributesKey("FE_INBUILT_FUNCTION_DATE", DefaultLanguageHighlighterColors.STATIC_FIELD);
    public static final TextAttributesKey INBUILT_FUNCTION_DATETIME_ATTR_KEY = createTextAttributesKey("FE_INBUILT_FUNCTION_DATETIME", DefaultLanguageHighlighterColors.STATIC_FIELD);
    public static final TextAttributesKey INBUILT_FUNCTION_ELT_ATTR_KEY = createTextAttributesKey("FE_INBUILT_FUNCTION_ELT", DefaultLanguageHighlighterColors.STATIC_FIELD);
    public static final TextAttributesKey INBUILT_FUNCTION_IS_NA_ATTR_KEY = createTextAttributesKey("FE_INBUILT_FUNCTION_IS_NA", DefaultLanguageHighlighterColors.STATIC_FIELD);
    public static final TextAttributesKey INBUILT_FUNCTION_IS_LIST_ATTR_KEY = createTextAttributesKey("FE_INBUILT_FUNCTION_IS_LIST", DefaultLanguageHighlighterColors.STATIC_FIELD);
    public static final TextAttributesKey INBUILT_FUNCTION_LEN_ATTR_KEY = createTextAttributesKey("FE_INBUILT_FUNCTION_LEN", DefaultLanguageHighlighterColors.STATIC_FIELD);
    public static final TextAttributesKey INBUILT_FUNCTION_LOAD_ATTR_KEY = createTextAttributesKey("FE_INBUILT_FUNCTION_LOAD", DefaultLanguageHighlighterColors.STATIC_FIELD);
    public static final TextAttributesKey INBUILT_FUNCTION_REMOVE_ATTR_KEY = createTextAttributesKey("FE_INBUILT_FUNCTION_REMOVE", DefaultLanguageHighlighterColors.STATIC_FIELD);
    public static final TextAttributesKey INBUILT_FUNCTION_STATUS_ATTR_KEY = createTextAttributesKey("FE_INBUILT_FUNCTION_STATUS", DefaultLanguageHighlighterColors.STATIC_FIELD);
    public static final TextAttributesKey INBUILT_FUNCTION_STR_ATTR_KEY = createTextAttributesKey("FE_INBUILT_FUNCTION_STR", DefaultLanguageHighlighterColors.STATIC_FIELD);
}