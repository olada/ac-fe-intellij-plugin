package de.cofinpro.intellij.acfeplugin.highlighting;

import com.intellij.openapi.editor.DefaultLanguageHighlighterColors;
import com.intellij.openapi.editor.colors.TextAttributesKey;

import static com.intellij.openapi.editor.DefaultLanguageHighlighterColors.KEYWORD;
import static com.intellij.openapi.editor.colors.TextAttributesKey.createTextAttributesKey;

public class FormulaEngineHighlighterColors {
    // Data Types
    public static final TextAttributesKey ANY_ATTR_KEY = createTextAttributesKey("FE_ANY", KEYWORD);
    public static final TextAttributesKey BOOLEAN_ATTR_KEY = createTextAttributesKey("FE_BOOLEAN", KEYWORD);
    public static final TextAttributesKey DATE_ATTR_KEY = createTextAttributesKey("FE_DATE", KEYWORD);
    public static final TextAttributesKey DATETIME_ATTR_KEY = createTextAttributesKey("FE_DATETIME", KEYWORD);
    public static final TextAttributesKey DICT_ATTR_KEY = createTextAttributesKey("FE_DICT", KEYWORD);
    public static final TextAttributesKey FLOAT_ATTR_KEY = createTextAttributesKey("FE_FLOAT", KEYWORD);
    public static final TextAttributesKey INTEGER_ATTR_KEY = createTextAttributesKey("FE_INTEGER", KEYWORD);
    public static final TextAttributesKey LIST_ATTR_KEY = createTextAttributesKey("FE_LIST", KEYWORD);
    public static final TextAttributesKey NUMBER_ATTR_KEY = createTextAttributesKey("FE_NUMBER", KEYWORD);
    public static final TextAttributesKey STRING_ATTR_KEY = createTextAttributesKey("FE_STRING", KEYWORD);
    public static final TextAttributesKey TIME_ATTR_KEY = createTextAttributesKey("FE_TIME", KEYWORD);

    // Variable Visibility
    public static final TextAttributesKey LOCAL_ATTR_KEY = createTextAttributesKey("FE_LOCAL", KEYWORD);
    public static final TextAttributesKey GLOBAL_ATTR_KEY = createTextAttributesKey("FE_GLOBAL", KEYWORD);

    // Keywords
    public static final TextAttributesKey AND_ATTR_KEY = createTextAttributesKey("FE_AND", KEYWORD);
    public static final TextAttributesKey BREAK_ATTR_KEY = createTextAttributesKey("FE_BREAK", KEYWORD);
    public static final TextAttributesKey CASE_ATTR_KEY = createTextAttributesKey("FE_CASE", KEYWORD);
    public static final TextAttributesKey CONTINUE_ATTR_KEY = createTextAttributesKey("FE_CONTINUE", KEYWORD);
    public static final TextAttributesKey DEFAULT_ATTR_KEY = createTextAttributesKey("FE_DEFAULT", KEYWORD);
    public static final TextAttributesKey DO_ATTR_KEY = createTextAttributesKey("FE_DO", KEYWORD);
    public static final TextAttributesKey ELSE_ATTR_KEY = createTextAttributesKey("FE_ELSE", KEYWORD);
    public static final TextAttributesKey FOR_ATTR_KEY = createTextAttributesKey("FE_FOR", KEYWORD);
    public static final TextAttributesKey FUNCTION_ATTR_KEY = createTextAttributesKey("FE_FUNCTION", KEYWORD);
    public static final TextAttributesKey IF_ATTR_KEY = createTextAttributesKey("FE_IF", KEYWORD);
    public static final TextAttributesKey OR_ATTR_KEY = createTextAttributesKey("FE_OR", KEYWORD);
    public static final TextAttributesKey RETURN_ATTR_KEY = createTextAttributesKey("FE_RETURN", KEYWORD);
    public static final TextAttributesKey SEQ_ATTR_KEY = createTextAttributesKey("FE_SEQ", KEYWORD);
    public static final TextAttributesKey SWITCH_ATTR_KEY = createTextAttributesKey("FE_SWITCH", KEYWORD);
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
    public static final TextAttributesKey INBUILT_VARIABLE_TIMETODAY_ATTR_KEY = createTextAttributesKey("FE_INBUILT_VARIABLE_TIMETODAY", DefaultLanguageHighlighterColors.STATIC_FIELD);
    public static final TextAttributesKey INBUILT_VARIABLE_SYMBOL_ATTR_KEY = createTextAttributesKey("FE_INBUILT_VARIABLE_SYMBOL", DefaultLanguageHighlighterColors.STATIC_FIELD);
    public static final TextAttributesKey INBUILT_VARIABLE_NAME_ATTR_KEY = createTextAttributesKey("FE_INBUILT_VARIABLE_NAME", DefaultLanguageHighlighterColors.STATIC_FIELD);
    public static final TextAttributesKey INBUILT_VARIABLE_PROCESSED_ATTR_KEY = createTextAttributesKey("FE_INBUILT_VARIABLE_PROCESSED", DefaultLanguageHighlighterColors.STATIC_FIELD);
    public static final TextAttributesKey INBUILT_VARIABLE_PASSED_ATTR_KEY = createTextAttributesKey("FE_INBUILT_VARIABLE_PASSED", DefaultLanguageHighlighterColors.STATIC_FIELD);
    public static final TextAttributesKey INBUILT_VARIABLE_LISTID_ATTR_KEY = createTextAttributesKey("FE_INBUILT_VARIABLE_LISTID", DefaultLanguageHighlighterColors.STATIC_FIELD);
    public static final TextAttributesKey INBUILT_VARIABLE_LISTTP_ATTR_KEY = createTextAttributesKey("FE_INBUILT_VARIABLE_LISTTP", DefaultLanguageHighlighterColors.STATIC_FIELD);
    public static final TextAttributesKey INBUILT_VARIABLE_TREEID_ATTR_KEY = createTextAttributesKey("FE_INBUILT_VARIABLE_TREEID", DefaultLanguageHighlighterColors.STATIC_FIELD);
    public static final TextAttributesKey INBUILT_VARIABLE_FIELD_ATTR_KEY = createTextAttributesKey("FE_INBUILT_VARIABLE_FIELD", DefaultLanguageHighlighterColors.STATIC_FIELD);
    public static final TextAttributesKey INBUILT_VARIABLE_FIELDS_ATTR_KEY = createTextAttributesKey("FE_INBUILT_VARIABLE_FIELDS", DefaultLanguageHighlighterColors.STATIC_FIELD);
    public static final TextAttributesKey INBUILT_VARIABLE_DATA_ATTR_KEY = createTextAttributesKey("FE_INBUILT_VARIABLE_DATA", DefaultLanguageHighlighterColors.STATIC_FIELD);
    public static final TextAttributesKey INBUILT_VARIABLE_DATETIME_ATTR_KEY = createTextAttributesKey("FE_INBUILT_VARIABLE_DATETIME", DefaultLanguageHighlighterColors.STATIC_FIELD);
    public static final TextAttributesKey INBUILT_VARIABLE_STATUS_ATTR_KEY = createTextAttributesKey("FE_INBUILT_VARIABLE_STATUS", DefaultLanguageHighlighterColors.STATIC_FIELD);
    public static final TextAttributesKey INBUILT_VARIABLE_DEPENDENCIES_ATTR_KEY = createTextAttributesKey("FE_INBUILT_VARIABLE_DEPENDENCIES", DefaultLanguageHighlighterColors.STATIC_FIELD);
    public static final TextAttributesKey INBUILT_VARIABLE_DEPENDENCIES_TRIGGERS_ATTR_KEY = createTextAttributesKey("FE_INBUILT_VARIABLE_DEPENDENCIES_TRIGGERS", DefaultLanguageHighlighterColors.STATIC_FIELD);

    // Built in Functions
    public static final TextAttributesKey INBUILT_FUNCTION_ADO_BROWSE_ATTR_KEY = createTextAttributesKey("FE_INBUILT_FUNCTION_ADO_BROWSE", DefaultLanguageHighlighterColors.STATIC_FIELD);
    public static final TextAttributesKey INBUILT_FUNCTION_ATTRIBUTE_ATTR_KEY = createTextAttributesKey("FE_INBUILT_FUNCTION_ATTRIBUTE", DefaultLanguageHighlighterColors.STATIC_FIELD);
    public static final TextAttributesKey INBUILT_FUNCTION_BSEARCH_ATTR_KEY = createTextAttributesKey("FE_INBUILT_FUNCTION_BSEARCH", DefaultLanguageHighlighterColors.STATIC_FIELD);
    public static final TextAttributesKey INBUILT_FUNCTION_BOOL_ATTR_KEY = createTextAttributesKey("FE_INBUILT_FUNCTION_BOOL", DefaultLanguageHighlighterColors.STATIC_FIELD);
    public static final TextAttributesKey INBUILT_FUNCTION_CORRECT_PRICE_FIELD_ATTR_KEY = createTextAttributesKey("FE_INBUILT_FUNCTION_CORRECT_PRICE_FIELD", DefaultLanguageHighlighterColors.STATIC_FIELD);
    public static final TextAttributesKey INBUILT_FUNCTION_DATE_ATTR_KEY = createTextAttributesKey("FE_INBUILT_FUNCTION_DATE", DefaultLanguageHighlighterColors.STATIC_FIELD);
    public static final TextAttributesKey INBUILT_FUNCTION_DATETIME_ATTR_KEY = createTextAttributesKey("FE_INBUILT_FUNCTION_DATETIME", DefaultLanguageHighlighterColors.STATIC_FIELD);
    public static final TextAttributesKey INBUILT_FUNCTION_DAYDIFF_ATTR_KEY = createTextAttributesKey("FE_INBUILT_FUNCTION_DAYDIFF", DefaultLanguageHighlighterColors.STATIC_FIELD);
    public static final TextAttributesKey INBUILT_FUNCTION_DAYPLUS_ATTR_KEY = createTextAttributesKey("FE_INBUILT_FUNCTION_DAYPLUS", DefaultLanguageHighlighterColors.STATIC_FIELD);
    public static final TextAttributesKey INBUILT_FUNCTION_DICT_ATTR_KEY = createTextAttributesKey("FE_INBUILT_FUNCTION_DICT", DefaultLanguageHighlighterColors.STATIC_FIELD);
    public static final TextAttributesKey INBUILT_FUNCTION_DICT_GET_ATTR_KEY = createTextAttributesKey("FE_INBUILT_FUNCTION_DICT_GET", DefaultLanguageHighlighterColors.STATIC_FIELD);
    public static final TextAttributesKey INBUILT_FUNCTION_DICT_ISKEY_ATTR_KEY = createTextAttributesKey("FE_INBUILT_FUNCTION_DICT_ISKEY", DefaultLanguageHighlighterColors.STATIC_FIELD);
    public static final TextAttributesKey INBUILT_FUNCTION_DICT_KEYS_ATTR_KEY = createTextAttributesKey("FE_INBUILT_FUNCTION_DICT_KEYS", DefaultLanguageHighlighterColors.STATIC_FIELD);
    public static final TextAttributesKey INBUILT_FUNCTION_DICT_PUT_ATTR_KEY = createTextAttributesKey("FE_INBUILT_FUNCTION_DICT_PUT", DefaultLanguageHighlighterColors.STATIC_FIELD);
    public static final TextAttributesKey INBUILT_FUNCTION_DICT_VALUES_ATTR_KEY = createTextAttributesKey("FE_INBUILT_FUNCTION_DICT_VALUES", DefaultLanguageHighlighterColors.STATIC_FIELD);
    public static final TextAttributesKey INBUILT_FUNCTION_ELT_ATTR_KEY = createTextAttributesKey("FE_INBUILT_FUNCTION_ELT", DefaultLanguageHighlighterColors.STATIC_FIELD);
    public static final TextAttributesKey INBUILT_FUNCTION_EVALUATE_ATTR_KEY = createTextAttributesKey("FE_INBUILT_FUNCTION_EVALUATE", DefaultLanguageHighlighterColors.STATIC_FIELD);
    public static final TextAttributesKey INBUILT_FUNCTION_FIRST_ATTR_KEY = createTextAttributesKey("FE_INBUILT_FUNCTION_FIRST", DefaultLanguageHighlighterColors.STATIC_FIELD);
    public static final TextAttributesKey INBUILT_FUNCTION_FLOAT_ATTR_KEY = createTextAttributesKey("FE_INBUILT_FUNCTION_FLOAT", DefaultLanguageHighlighterColors.STATIC_FIELD);
    public static final TextAttributesKey INBUILT_FUNCTION_INTEGER_ATTR_KEY = createTextAttributesKey("FE_INBUILT_FUNCTION_INTEGER", DefaultLanguageHighlighterColors.STATIC_FIELD);
    public static final TextAttributesKey INBUILT_FUNCTION_HASH_GET_ATTR_KEY = createTextAttributesKey("FE_INBUILT_FUNCTION_HASH_GET", DefaultLanguageHighlighterColors.STATIC_FIELD);
    public static final TextAttributesKey INBUILT_FUNCTION_HASH_GLOBAL_ATTR_KEY = createTextAttributesKey("FE_INBUILT_FUNCTION_HASH_GLOBAL", DefaultLanguageHighlighterColors.STATIC_FIELD);
    public static final TextAttributesKey INBUILT_FUNCTION_HASH_ISKEY_ATTR_KEY = createTextAttributesKey("FE_INBUILT_FUNCTION_HASH_ISKEY", DefaultLanguageHighlighterColors.STATIC_FIELD);
    public static final TextAttributesKey INBUILT_FUNCTION_HASH_KEYS_ATTR_KEY = createTextAttributesKey("FE_INBUILT_FUNCTION_HASH_KEYS", DefaultLanguageHighlighterColors.STATIC_FIELD);
    public static final TextAttributesKey INBUILT_FUNCTION_HASH_PUT_ATTR_KEY = createTextAttributesKey("FE_INBUILT_FUNCTION_HASH_PUT", DefaultLanguageHighlighterColors.STATIC_FIELD);
    public static final TextAttributesKey INBUILT_FUNCTION_INSERT_ATTR_KEY = createTextAttributesKey("FE_INBUILT_FUNCTION_INSERT", DefaultLanguageHighlighterColors.STATIC_FIELD);
    public static final TextAttributesKey INBUILT_FUNCTION_IS_DATE_ATTR_KEY = createTextAttributesKey("FE_INBUILT_FUNCTION_IS_DATE", DefaultLanguageHighlighterColors.STATIC_FIELD);
    public static final TextAttributesKey INBUILT_FUNCTION_IS_DATETIME_ATTR_KEY = createTextAttributesKey("FE_INBUILT_FUNCTION_IS_DATETIME", DefaultLanguageHighlighterColors.STATIC_FIELD);
    public static final TextAttributesKey INBUILT_FUNCTION_IS_FLOAT_ATTR_KEY = createTextAttributesKey("FE_INBUILT_FUNCTION_IS_FLOAT", DefaultLanguageHighlighterColors.STATIC_FIELD);
    public static final TextAttributesKey INBUILT_FUNCTION_IS_INTEGER_ATTR_KEY = createTextAttributesKey("FE_INBUILT_FUNCTION_IS_INTEGER", DefaultLanguageHighlighterColors.STATIC_FIELD);
    public static final TextAttributesKey INBUILT_FUNCTION_IS_LIST_ATTR_KEY = createTextAttributesKey("FE_INBUILT_FUNCTION_IS_LIST", DefaultLanguageHighlighterColors.STATIC_FIELD);
    public static final TextAttributesKey INBUILT_FUNCTION_IS_MATRIX_ATTR_KEY = createTextAttributesKey("FE_INBUILT_FUNCTION_IS_MATRIX", DefaultLanguageHighlighterColors.STATIC_FIELD);
    public static final TextAttributesKey INBUILT_FUNCTION_IS_NA_ATTR_KEY = createTextAttributesKey("FE_INBUILT_FUNCTION_IS_NA", DefaultLanguageHighlighterColors.STATIC_FIELD);
    public static final TextAttributesKey INBUILT_FUNCTION_IS_NUMBER_ATTR_KEY = createTextAttributesKey("FE_INBUILT_FUNCTION_IS_NUMBER", DefaultLanguageHighlighterColors.STATIC_FIELD);
    public static final TextAttributesKey INBUILT_FUNCTION_IS_OPAQUE_ATTR_KEY = createTextAttributesKey("FE_INBUILT_FUNCTION_IS_OPAQUE", DefaultLanguageHighlighterColors.STATIC_FIELD);
    public static final TextAttributesKey INBUILT_FUNCTION_IS_STRING_ATTR_KEY = createTextAttributesKey("FE_INBUILT_FUNCTION_IS_STRING", DefaultLanguageHighlighterColors.STATIC_FIELD);
    public static final TextAttributesKey INBUILT_FUNCTION_STRVAL_ATTR_KEY = createTextAttributesKey("FE_INBULT_FUNCTION_STRVAK", DefaultLanguageHighlighterColors.STATIC_FIELD);
    public static final TextAttributesKey INBUILT_FUNCTION_IS_TIME_ATTR_KEY =createTextAttributesKey("FE_INBUILT_FUNCTION_IS_TIME", DefaultLanguageHighlighterColors.STATIC_FIELD);
    public static final TextAttributesKey INBUILT_FUNCTION_KERNEL_ATTR_KEY = createTextAttributesKey("FE_INBUILT_FUNCTION_KERNEL", DefaultLanguageHighlighterColors.STATIC_FIELD);
    public static final TextAttributesKey INBUILT_FUNCTION_LAST_ATTR_KEY = createTextAttributesKey("FE_INBUILT_FUNCTION_LAST", DefaultLanguageHighlighterColors.STATIC_FIELD);
    public static final TextAttributesKey INBUILT_FUNCTION_LEN_ATTR_KEY = createTextAttributesKey("FE_INBUILT_FUNCTION_LEN", DefaultLanguageHighlighterColors.STATIC_FIELD);
    public static final TextAttributesKey INBUILT_FUNCTION_LIST_ATTR_KEY = createTextAttributesKey("FE_INBUILT_FUNCTION_LIST", DefaultLanguageHighlighterColors.STATIC_FIELD);
    public static final TextAttributesKey INBUILT_FUNCTION_LSEARCH_ATTR_KEY = createTextAttributesKey("FE_INBUILT_FUNCTION_LSEARCH", DefaultLanguageHighlighterColors.STATIC_FIELD);
    public static final TextAttributesKey INBUILT_FUNCTION_LOAD_ATTR_KEY = createTextAttributesKey("FE_INBUILT_FUNCTION_LOAD", DefaultLanguageHighlighterColors.STATIC_FIELD);
    public static final TextAttributesKey INBUILT_FUNCTION_MAP_ATTR_KEY = createTextAttributesKey("FE_INBUILT_FUNCTION_MAP", DefaultLanguageHighlighterColors.STATIC_FIELD);
    public static final TextAttributesKey INBUILT_FUNCTION_MAX_ATTR_KEY = createTextAttributesKey("FE_INBUILT_FUNCTION_MAX", DefaultLanguageHighlighterColors.STATIC_FIELD);
    public static final TextAttributesKey INBUILT_FUNCTION_OUT_ATTR_KEY = createTextAttributesKey("FE_INBUILT_FUNCTION_OUT", DefaultLanguageHighlighterColors.STATIC_FIELD);
    public static final TextAttributesKey INBUILT_FUNCTION_PRICE_FIELD_ATTR_KEY = createTextAttributesKey("FE_INBUILT_FUNCTION_PRICE_FIELD", DefaultLanguageHighlighterColors.STATIC_FIELD);
    public static final TextAttributesKey INBUILT_FUNCTION_RDBMS_PROC_ATTR_KEY = createTextAttributesKey("FE_INBUILT_FUNCTION_RDBMS_PROC", DefaultLanguageHighlighterColors.STATIC_FIELD);
    public static final TextAttributesKey INBUILT_FUNCTION_REGEX_MATCH_ATTR_KEY = createTextAttributesKey("FE_INBUILT_FUNCTION_REGEX_MATCH", DefaultLanguageHighlighterColors.STATIC_FIELD);
    public static final TextAttributesKey INBUILT_FUNCTION_REMOVE_ATTR_KEY = createTextAttributesKey("FE_INBUILT_FUNCTION_REMOVE", DefaultLanguageHighlighterColors.STATIC_FIELD);
    public static final TextAttributesKey INBUILT_FUNCTION_SECOND_ATTR_KEY = createTextAttributesKey("FE_INBUILT_FUNCTION_SECOND", DefaultLanguageHighlighterColors.STATIC_FIELD);
    public static final TextAttributesKey INBUILT_FUNCTION_SET_SUSPECT_PRICE_FIELD_ATTR_KEY = createTextAttributesKey("FE_INBUILT_FUNCTION_SET_SUSPECT_PRICE_FIELD", DefaultLanguageHighlighterColors.STATIC_FIELD);
    public static final TextAttributesKey INBUILT_FUNCTION_SORT_ATTR_KEY = createTextAttributesKey("FE_INBUILT_FUNCTION_SORT", DefaultLanguageHighlighterColors.STATIC_FIELD);
    public static final TextAttributesKey INBUILT_FUNCTION_SPLIT_ATTR_KEY = createTextAttributesKey("FE_INBUILT_FUNCTION_SPLIT", DefaultLanguageHighlighterColors.STATIC_FIELD);
    public static final TextAttributesKey INBUILT_FUNCTION_SQL_ATTR_KEY = createTextAttributesKey("FE_INBUILT_FUNCTION_SQL", DefaultLanguageHighlighterColors.STATIC_FIELD);
    public static final TextAttributesKey INBUILT_FUNCTION_STATUS_ATTR_KEY = createTextAttributesKey("FE_INBUILT_FUNCTION_STATUS", DefaultLanguageHighlighterColors.STATIC_FIELD);
    public static final TextAttributesKey INBUILT_FUNCTION_STR_ATTR_KEY = createTextAttributesKey("FE_INBUILT_FUNCTION_STR", DefaultLanguageHighlighterColors.STATIC_FIELD);
    public static final TextAttributesKey INBUILT_FUNCTION_STRING_ATTR_KEY = createTextAttributesKey("FE_INBUILT_FUNCTION_STRING", DefaultLanguageHighlighterColors.STATIC_FIELD);
    public static final TextAttributesKey INBUILT_FUNCTION_STRIP_ATTR_KEY = createTextAttributesKey("FE_INBUILT_FUNCTION_STRIP", DefaultLanguageHighlighterColors.STATIC_FIELD);
    public static final TextAttributesKey INBUILT_FUNCTION_TIME_ATTR_KEY = createTextAttributesKey("FE_INBUILT_FUNCTION_TIME", DefaultLanguageHighlighterColors.STATIC_FIELD);
    public static final TextAttributesKey INBUILT_FUNCTION_TOUPPER_ATTR_KEY = createTextAttributesKey("FE_INBUILT_FUNCTION_TOUPPER", DefaultLanguageHighlighterColors.STATIC_FIELD);
    public static final TextAttributesKey INBUILT_FUNCTION_TS_ATTR_KEY = createTextAttributesKey("FE_INBUILT_FUNCTION_TS", DefaultLanguageHighlighterColors.STATIC_FIELD);
    public static final TextAttributesKey INBUILT_FUNCTION_TS_UPDATE_ATTR_KEY = createTextAttributesKey("FE_INBUILT_FUNCTION_TS_UPDATE", DefaultLanguageHighlighterColors.STATIC_FIELD);
    public static final TextAttributesKey INBUILT_FUNCTION_YEAR_FRACTION_ATTR_KEY = createTextAttributesKey("FE_INBUILT_FUNCTION_YEAR_FRACTION", DefaultLanguageHighlighterColors.STATIC_FIELD);

    // General Tokens
    public static final TextAttributesKey NUMBER_SCIENTIFIC = createTextAttributesKey("FE_NUMBER_SCIENTIFIC", DefaultLanguageHighlighterColors.NUMBER);
    public static final TextAttributesKey NUMBER_FLOAT = createTextAttributesKey("FE_NUMBER_FLOAT", DefaultLanguageHighlighterColors.NUMBER);
    public static final TextAttributesKey NUMBER_INTEGER = createTextAttributesKey("FE_NUMBER_INTEGER", DefaultLanguageHighlighterColors.NUMBER);

    public static final TextAttributesKey SEMICOLON = createTextAttributesKey("FE_SEMICOLON", DefaultLanguageHighlighterColors.SEMICOLON);
}
