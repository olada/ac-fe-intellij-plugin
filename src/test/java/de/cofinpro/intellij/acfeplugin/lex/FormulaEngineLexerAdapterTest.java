package de.cofinpro.intellij.acfeplugin.lex;

import com.intellij.psi.tree.IElementType;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static com.intellij.psi.TokenType.WHITE_SPACE;
import static de.cofinpro.intellij.acfeplugin.psi.FormulaEngineElementTypes.*;
import static org.assertj.core.api.Assertions.assertThat;

class FormulaEngineLexerAdapterTest {
    FormulaEngineLexerAdapter adapter = new FormulaEngineLexerAdapter();
    private static final IElementType EOF = null;

    @Nested
    class Declaration {

        @Test
        @DisplayName("local date foobar;")
        void withVisibilityAndType() {
            List<IElementType> tokens = parse("local date foobar;");

            assertThat(tokens).containsExactly(
                    VISIBILITY_LOCAL, WHITE_SPACE, KEYWORD_DATE, WHITE_SPACE, IDENTIFIER, SEMICOLON, EOF
            );
        }

        @Test
        @DisplayName("global ValFuncFields=load(\"ix_ValFuncFields\",\"TABTABLE\");")
        void withAssignmentAndFunctionInvocation() {
            List<IElementType> tokens = parse("global ValFuncFields=load(\"ix_ValFuncFields\",\"TABTABLE\");");

            assertThat(tokens).containsExactly(
                    VISIBILITY_GLOBAL, WHITE_SPACE, IDENTIFIER, OPERATOR_ASSIGNMENT, BUILT_IN_FUNC_LOAD, LEFT_PARENTHESIS,
                    DOUBLE_QUOTED_STRING, COMMA, DOUBLE_QUOTED_STRING, RIGHT_PARENTHESIS, SEMICOLON, EOF
            );
        }
    }

    @Nested
    class FunctionArguments {
        @Test
        void methodReference() {
            List<IElementType> tokens = parse("abc = map(string, a_variable);");

            assertThat(tokens).containsExactly(
                    IDENTIFIER, WHITE_SPACE, OPERATOR_ASSIGNMENT, WHITE_SPACE, BUILT_IN_FUNC_MAP,
                    LEFT_PARENTHESIS, BUILT_IN_FUNC_STRING, COMMA, WHITE_SPACE, IDENTIFIER,
                    RIGHT_PARENTHESIS, SEMICOLON, EOF
            );
        }
    }

    @Nested
    class Function {
        @Test
        void function() {
            List<IElementType> tokens = parse("function EN_DCR_MAPPING (string symbol, string attrib, list dependencies, list parameters){\n" +
                    "    if (!adoIsSecurity(symbol, $NA)) {\n" +
                    "\t    DF_debug(__DF_debug, 'EN_DCR_MAPPING: Symbol ' + symbol + ' is no security. Exit formula');\n" +
                    "\t    return $NA;\n" +
                    "\t} else {\n" +
                    "\t    return \"foobar\";\n" +
                    "\t}\n" +
                    "}");

            assertThat(tokens).containsExactly(
                    KEYWORD_FUNCTION, WHITE_SPACE, IDENTIFIER, WHITE_SPACE, LEFT_PARENTHESIS, KEYWORD_STRING,
                    WHITE_SPACE, IDENTIFIER, COMMA, WHITE_SPACE, KEYWORD_STRING, WHITE_SPACE, IDENTIFIER, COMMA, WHITE_SPACE,
                    KEYWORD_LIST, WHITE_SPACE, IDENTIFIER, COMMA, WHITE_SPACE, KEYWORD_LIST, WHITE_SPACE, IDENTIFIER,
                    RIGHT_PARENTHESIS, LEFT_CURLY_BRACE, WHITE_SPACE, WHITE_SPACE, WHITE_SPACE, WHITE_SPACE, WHITE_SPACE,
                    KEYWORD_IF, WHITE_SPACE, LEFT_PARENTHESIS, OPERATOR_NEGATION, IDENTIFIER, LEFT_PARENTHESIS, IDENTIFIER, COMMA,
                    WHITE_SPACE, BUILT_IN_VAR_NA, RIGHT_PARENTHESIS, RIGHT_PARENTHESIS, WHITE_SPACE, LEFT_CURLY_BRACE, WHITE_SPACE,
                    WHITE_SPACE, WHITE_SPACE, WHITE_SPACE, WHITE_SPACE, WHITE_SPACE, IDENTIFIER, LEFT_PARENTHESIS,
                    IDENTIFIER, COMMA, WHITE_SPACE, SINGLE_QUOTED_STRING, WHITE_SPACE, OPERATOR_PLUS, WHITE_SPACE, IDENTIFIER,
                    WHITE_SPACE, OPERATOR_PLUS, WHITE_SPACE, SINGLE_QUOTED_STRING, RIGHT_PARENTHESIS, SEMICOLON, WHITE_SPACE, WHITE_SPACE,
                    WHITE_SPACE, WHITE_SPACE, WHITE_SPACE, WHITE_SPACE, KEYWORD_RETURN, WHITE_SPACE, BUILT_IN_VAR_NA,
                    SEMICOLON, WHITE_SPACE, WHITE_SPACE, RIGHT_CURLY_BRACE, WHITE_SPACE, KEYWORD_ELSE, WHITE_SPACE, LEFT_CURLY_BRACE,
                    WHITE_SPACE, WHITE_SPACE, WHITE_SPACE, WHITE_SPACE, WHITE_SPACE, WHITE_SPACE, KEYWORD_RETURN,
                    WHITE_SPACE, DOUBLE_QUOTED_STRING, SEMICOLON, WHITE_SPACE, WHITE_SPACE, RIGHT_CURLY_BRACE, WHITE_SPACE,
                    RIGHT_CURLY_BRACE, EOF
            );
        }
    }

    private List<IElementType> parse(String input) {
        adapter.start(input);

        List<IElementType> tokens = new ArrayList<>();
        IElementType token;

        do {
            token = adapter.getTokenType();
            tokens.add(token);
            adapter.advance();
        } while (token != null);

        return tokens;
    }

}