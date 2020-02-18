package de.cofinpro.intellij.acfeplugin.highlighting;

import com.intellij.openapi.editor.DefaultLanguageHighlighterColors;
import com.intellij.openapi.editor.colors.TextAttributesKey;

import static com.intellij.openapi.editor.DefaultLanguageHighlighterColors.*;
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
    public static final TextAttributesKey TYPE_PREFIX_ATTR_KEY = createTextAttributesKey("FE_TYPE_PREFIX", KEYWORD);
}
