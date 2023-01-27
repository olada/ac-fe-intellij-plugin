package de.cofinpro.intellij.acfeplugin.highlighting;

import com.intellij.lexer.Lexer;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase;
import com.intellij.psi.tree.IElementType;
// import com.sun.tools.internal.xjc.generator.bean.ImplStructureStrategy;
import de.cofinpro.intellij.acfeplugin.lex.FormulaEngineLexerAdapter;
import de.cofinpro.intellij.acfeplugin.psi.FormulaEngineElementTypes;
import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.Map;

import static de.cofinpro.intellij.acfeplugin.highlighting.FormulaEngineHighlighterColors.*;

public class FormulaEngineSyntaxHighlighter extends SyntaxHighlighterBase {

    protected static final Map<IElementType, TextAttributesKey> ATTRIBUTES = new HashMap<>();

    static {
        // Types
        safeMap(ATTRIBUTES, FormulaEngineElementTypes.KEYWORD_ANY, ANY_ATTR_KEY);
        safeMap(ATTRIBUTES, FormulaEngineElementTypes.KEYWORD_BOOLEAN, BOOLEAN_ATTR_KEY);
        safeMap(ATTRIBUTES, FormulaEngineElementTypes.KEYWORD_DATE, DATE_ATTR_KEY);
        safeMap(ATTRIBUTES, FormulaEngineElementTypes.KEYWORD_DATETIME, DATETIME_ATTR_KEY);
        safeMap(ATTRIBUTES, FormulaEngineElementTypes.KEYWORD_DICT, DICT_ATTR_KEY);
        safeMap(ATTRIBUTES, FormulaEngineElementTypes.KEYWORD_FLOAT, FLOAT_ATTR_KEY);
        safeMap(ATTRIBUTES, FormulaEngineElementTypes.KEYWORD_INTEGER, INTEGER_ATTR_KEY);
        safeMap(ATTRIBUTES, FormulaEngineElementTypes.KEYWORD_LIST, LIST_ATTR_KEY);
        safeMap(ATTRIBUTES, FormulaEngineElementTypes.KEYWORD_NUMBER, NUMBER_ATTR_KEY);
        safeMap(ATTRIBUTES, FormulaEngineElementTypes.KEYWORD_STRING, STRING_ATTR_KEY);
        safeMap(ATTRIBUTES, FormulaEngineElementTypes.KEYWORD_TIME, TIME_ATTR_KEY);

        safeMap(ATTRIBUTES, FormulaEngineElementTypes.VISIBILITY_LOCAL, LOCAL_ATTR_KEY);
        safeMap(ATTRIBUTES, FormulaEngineElementTypes.VISIBILITY_GLOBAL, GLOBAL_ATTR_KEY);

        // Keywords
        safeMap(ATTRIBUTES, FormulaEngineElementTypes.KEYWORD_AND, AND_ATTR_KEY);
        safeMap(ATTRIBUTES, FormulaEngineElementTypes.KEYWORD_BREAK, BREAK_ATTR_KEY);
        safeMap(ATTRIBUTES, FormulaEngineElementTypes.KEYWORD_CASE, CASE_ATTR_KEY);
        safeMap(ATTRIBUTES, FormulaEngineElementTypes.KEYWORD_CONTINUE, CONTINUE_ATTR_KEY);
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
        safeMap(ATTRIBUTES, FormulaEngineElementTypes.BUILT_IN_VAR_DATETIME, INBUILT_VARIABLE_DATETIME_ATTR_KEY);
        safeMap(ATTRIBUTES, FormulaEngineElementTypes.BUILT_IN_VAR_STATUS, INBUILT_VARIABLE_STATUS_ATTR_KEY);
        safeMap(ATTRIBUTES, FormulaEngineElementTypes.BUILT_IN_VAR_DEPENDENCIES, INBUILT_VARIABLE_DEPENDENCIES_ATTR_KEY);
        safeMap(ATTRIBUTES, FormulaEngineElementTypes.BUILT_IN_VAR_DEPENDENCIES_TRIGGERS, INBUILT_VARIABLE_DEPENDENCIES_TRIGGERS_ATTR_KEY);

        // Built in functions
        safeMap(ATTRIBUTES, FormulaEngineElementTypes.BUILT_IN_FUNC_ADO_BROWSE, INBUILT_FUNCTION_ADO_BROWSE_ATTR_KEY);
        safeMap(ATTRIBUTES, FormulaEngineElementTypes.BUILT_IN_FUNC_ATTRIBUTE, INBUILT_FUNCTION_ATTRIBUTE_ATTR_KEY);
        safeMap(ATTRIBUTES, FormulaEngineElementTypes.BUILT_IN_FUNC_BSEARCH, INBUILT_FUNCTION_BSEARCH_ATTR_KEY);
        safeMap(ATTRIBUTES, FormulaEngineElementTypes.BUILT_IN_FUNC_BOOL, INBUILT_FUNCTION_BOOL_ATTR_KEY);
        safeMap(ATTRIBUTES, FormulaEngineElementTypes.BUILT_IN_FUNC_CORRECT_PRICE_FIELD, INBUILT_FUNCTION_CORRECT_PRICE_FIELD_ATTR_KEY);
        safeMap(ATTRIBUTES, FormulaEngineElementTypes.BUILT_IN_FUNC_DATE, INBUILT_FUNCTION_DATE_ATTR_KEY);
        safeMap(ATTRIBUTES, FormulaEngineElementTypes.BUILT_IN_FUNC_DATETIME, INBUILT_FUNCTION_DATETIME_ATTR_KEY);
        safeMap(ATTRIBUTES, FormulaEngineElementTypes.BUILT_IN_FUNC_DAYDIFF, INBUILT_FUNCTION_DAYDIFF_ATTR_KEY);
        safeMap(ATTRIBUTES, FormulaEngineElementTypes.BUILT_IN_FUNC_DAYPLUS, INBUILT_FUNCTION_DAYPLUS_ATTR_KEY);
        safeMap(ATTRIBUTES, FormulaEngineElementTypes.BUILT_IN_FUNC_DICT, INBUILT_FUNCTION_DICT_ATTR_KEY);
        safeMap(ATTRIBUTES, FormulaEngineElementTypes.BUILT_IN_FUNC_DICT_GET, INBUILT_FUNCTION_DICT_GET_ATTR_KEY);
        safeMap(ATTRIBUTES, FormulaEngineElementTypes.BUILT_IN_FUNC_DICT_ISKEY, INBUILT_FUNCTION_DICT_ISKEY_ATTR_KEY);
        safeMap(ATTRIBUTES, FormulaEngineElementTypes.BUILT_IN_FUNC_DICT_KEYS, INBUILT_FUNCTION_DICT_KEYS_ATTR_KEY);
        safeMap(ATTRIBUTES, FormulaEngineElementTypes.BUILT_IN_FUNC_DICT_PUT, INBUILT_FUNCTION_DICT_PUT_ATTR_KEY);
        safeMap(ATTRIBUTES, FormulaEngineElementTypes.BUILT_IN_FUNC_DICT_VALUES, INBUILT_FUNCTION_DICT_VALUES_ATTR_KEY);
        safeMap(ATTRIBUTES, FormulaEngineElementTypes.BUILT_IN_FUNC_ELT, INBUILT_FUNCTION_ELT_ATTR_KEY);
        safeMap(ATTRIBUTES, FormulaEngineElementTypes.BUILT_IN_FUNC_EVALUATE, INBUILT_FUNCTION_EVALUATE_ATTR_KEY);
        safeMap(ATTRIBUTES, FormulaEngineElementTypes.BUILT_IN_FUNC_FIRST, INBUILT_FUNCTION_FIRST_ATTR_KEY);
        safeMap(ATTRIBUTES, FormulaEngineElementTypes.BUILT_IN_FUNC_FLOAT, INBUILT_FUNCTION_FLOAT_ATTR_KEY);
        safeMap(ATTRIBUTES, FormulaEngineElementTypes.BUILT_IN_FUNC_HASH_GET, INBUILT_FUNCTION_HASH_GET_ATTR_KEY);
        safeMap(ATTRIBUTES, FormulaEngineElementTypes.BUILT_IN_FUNC_HASH_GLOBAL, INBUILT_FUNCTION_HASH_GLOBAL_ATTR_KEY);
        safeMap(ATTRIBUTES, FormulaEngineElementTypes.BUILT_IN_FUNC_HASH_ISKEY, INBUILT_FUNCTION_HASH_ISKEY_ATTR_KEY);
        safeMap(ATTRIBUTES, FormulaEngineElementTypes.BUILT_IN_FUNC_HASH_KEYS, INBUILT_FUNCTION_HASH_KEYS_ATTR_KEY);
        safeMap(ATTRIBUTES, FormulaEngineElementTypes.BUILT_IN_FUNC_HASH_PUT, INBUILT_FUNCTION_HASH_PUT_ATTR_KEY);
        safeMap(ATTRIBUTES, FormulaEngineElementTypes.BUILT_IN_FUNC_INSERT, INBUILT_FUNCTION_INSERT_ATTR_KEY);
        safeMap(ATTRIBUTES, FormulaEngineElementTypes.BUILT_IN_FUNC_INTEGER, INBUILT_FUNCTION_INTEGER_ATTR_KEY);
        safeMap(ATTRIBUTES, FormulaEngineElementTypes.BUILT_IN_FUNC_IS_DATE, INBUILT_FUNCTION_IS_DATE_ATTR_KEY);
        safeMap(ATTRIBUTES, FormulaEngineElementTypes.BUILT_IN_FUNC_IS_DATETIME, INBUILT_FUNCTION_IS_DATETIME_ATTR_KEY);
        safeMap(ATTRIBUTES, FormulaEngineElementTypes.BUILT_IN_FUNC_IS_FLOAT, INBUILT_FUNCTION_IS_FLOAT_ATTR_KEY);
        safeMap(ATTRIBUTES, FormulaEngineElementTypes.BUILT_IN_FUNC_IS_INTEGER, INBUILT_FUNCTION_IS_INTEGER_ATTR_KEY);
        safeMap(ATTRIBUTES, FormulaEngineElementTypes.BUILT_IN_FUNC_IS_LIST, INBUILT_FUNCTION_IS_LIST_ATTR_KEY);
        safeMap(ATTRIBUTES, FormulaEngineElementTypes.BUILT_IN_FUNC_IS_MATRIX, INBUILT_FUNCTION_IS_MATRIX_ATTR_KEY);
        safeMap(ATTRIBUTES, FormulaEngineElementTypes.BUILT_IN_FUNC_IS_NA, INBUILT_FUNCTION_IS_NA_ATTR_KEY);
        safeMap(ATTRIBUTES, FormulaEngineElementTypes.BUILT_IN_FUNC_IS_NUMBER, INBUILT_FUNCTION_IS_NUMBER_ATTR_KEY);
        safeMap(ATTRIBUTES, FormulaEngineElementTypes.BUILT_IN_FUNC_IS_OPAQUE, INBUILT_FUNCTION_IS_OPAQUE_ATTR_KEY);
        safeMap(ATTRIBUTES, FormulaEngineElementTypes.BUILT_IN_FUNC_IS_STRING, INBUILT_FUNCTION_IS_STRING_ATTR_KEY);
        safeMap(ATTRIBUTES, FormulaEngineElementTypes.BUILT_IN_FUNC_STRVAL, INBUILT_FUNCTION_STRVAL_ATTR_KEY);
        safeMap(ATTRIBUTES, FormulaEngineElementTypes.BUILT_IN_FUNC_IS_TIME, INBUILT_FUNCTION_IS_TIME_ATTR_KEY);
        safeMap(ATTRIBUTES, FormulaEngineElementTypes.BUILT_IN_FUNC_KERNEL, INBUILT_FUNCTION_KERNEL_ATTR_KEY);
        safeMap(ATTRIBUTES, FormulaEngineElementTypes.BUILT_IN_FUNC_LAST, INBUILT_FUNCTION_LAST_ATTR_KEY);
        safeMap(ATTRIBUTES, FormulaEngineElementTypes.BUILT_IN_FUNC_LEN, INBUILT_FUNCTION_LEN_ATTR_KEY);
        safeMap(ATTRIBUTES, FormulaEngineElementTypes.BUILT_IN_FUNC_LIST, INBUILT_FUNCTION_LIST_ATTR_KEY);
        safeMap(ATTRIBUTES, FormulaEngineElementTypes.BUILT_IN_FUNC_LOAD, INBUILT_FUNCTION_LOAD_ATTR_KEY);
        safeMap(ATTRIBUTES, FormulaEngineElementTypes.BUILT_IN_FUNC_LSEARCH, INBUILT_FUNCTION_LSEARCH_ATTR_KEY);
        safeMap(ATTRIBUTES, FormulaEngineElementTypes.BUILT_IN_FUNC_MAP, INBUILT_FUNCTION_MAP_ATTR_KEY);
        safeMap(ATTRIBUTES, FormulaEngineElementTypes.BUILT_IN_FUNC_MAX, INBUILT_FUNCTION_MAX_ATTR_KEY);
        safeMap(ATTRIBUTES, FormulaEngineElementTypes.BUILT_IN_FUNC_OUT, INBUILT_FUNCTION_OUT_ATTR_KEY);
        safeMap(ATTRIBUTES, FormulaEngineElementTypes.BUILT_IN_FUNC_PRICE_FIELD, INBUILT_FUNCTION_PRICE_FIELD_ATTR_KEY);
        safeMap(ATTRIBUTES, FormulaEngineElementTypes.BUILT_IN_FUNC_RDBMS_PROC, INBUILT_FUNCTION_RDBMS_PROC_ATTR_KEY);
        safeMap(ATTRIBUTES, FormulaEngineElementTypes.BUILT_IN_FUNC_REGEX_MATCH, INBUILT_FUNCTION_REGEX_MATCH_ATTR_KEY);
        safeMap(ATTRIBUTES, FormulaEngineElementTypes.BUILT_IN_FUNC_REMOVE, INBUILT_FUNCTION_REMOVE_ATTR_KEY);
        safeMap(ATTRIBUTES, FormulaEngineElementTypes.BUILT_IN_FUNC_SECOND, INBUILT_FUNCTION_SECOND_ATTR_KEY);
        safeMap(ATTRIBUTES, FormulaEngineElementTypes.BUILT_IN_FUNC_SET_SUSPECT_PRICE_FIELD, INBUILT_FUNCTION_SET_SUSPECT_PRICE_FIELD_ATTR_KEY);
        safeMap(ATTRIBUTES, FormulaEngineElementTypes.BUILT_IN_FUNC_SORT, INBUILT_FUNCTION_SORT_ATTR_KEY);
        safeMap(ATTRIBUTES, FormulaEngineElementTypes.BUILT_IN_FUNC_SPLIT, INBUILT_FUNCTION_SPLIT_ATTR_KEY);
        safeMap(ATTRIBUTES, FormulaEngineElementTypes.BUILT_IN_FUNC_SQL, INBUILT_FUNCTION_SQL_ATTR_KEY);
        safeMap(ATTRIBUTES, FormulaEngineElementTypes.BUILT_IN_FUNC_STATUS, INBUILT_FUNCTION_STATUS_ATTR_KEY);
        safeMap(ATTRIBUTES, FormulaEngineElementTypes.BUILT_IN_FUNC_STR, INBUILT_FUNCTION_STR_ATTR_KEY);
        safeMap(ATTRIBUTES, FormulaEngineElementTypes.BUILT_IN_FUNC_STRING, INBUILT_FUNCTION_STRING_ATTR_KEY);
        safeMap(ATTRIBUTES, FormulaEngineElementTypes.BUILT_IN_FUNC_STRIP, INBUILT_FUNCTION_STRIP_ATTR_KEY);
        safeMap(ATTRIBUTES, FormulaEngineElementTypes.BUILT_IN_FUNC_TIME, INBUILT_FUNCTION_TIME_ATTR_KEY);
        safeMap(ATTRIBUTES, FormulaEngineElementTypes.BUILT_IN_FUNC_TOUPPER, INBUILT_FUNCTION_TOUPPER_ATTR_KEY);
        safeMap(ATTRIBUTES, FormulaEngineElementTypes.BUILT_IN_FUNC_TS, INBUILT_FUNCTION_TS_ATTR_KEY);
        safeMap(ATTRIBUTES, FormulaEngineElementTypes.BUILT_IN_FUNC_TS_UPDATE, INBUILT_FUNCTION_TS_UPDATE_ATTR_KEY);
        safeMap(ATTRIBUTES, FormulaEngineElementTypes.BUILT_IN_FUNC_YEAR_FRACTION, INBUILT_FUNCTION_YEAR_FRACTION_ATTR_KEY);

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
