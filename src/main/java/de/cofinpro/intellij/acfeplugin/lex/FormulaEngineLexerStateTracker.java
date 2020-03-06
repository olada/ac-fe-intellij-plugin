package de.cofinpro.intellij.acfeplugin.lex;

import com.intellij.openapi.diagnostic.Logger;

import java.util.EmptyStackException;
import java.util.Stack;

/**
 * Trackt states, die während des Lexens durchlaufen werden.
 * Ermöglicht komfortableres Stack-Management in der .flex-Datei.
 */
public class FormulaEngineLexerStateTracker {
    private static final Logger LOG = Logger.getInstance(FormulaEngineLexerStateTracker.class);

    private final IFormulaEngineLexer lexer;
    private final Stack<Integer> states = new Stack<>();

    public FormulaEngineLexerStateTracker(IFormulaEngineLexer lexer) {
        this.lexer = lexer;
    }

    public void beginState(int state) {
        states.push(state);
        lexer.yybegin(state);
    }

    public void endState() {
        try {
            Integer poppedState = states.pop();
            Integer newStateToEnter = states.peek();
            lexer.yybegin(newStateToEnter);
            LOG.trace("Popped-State: " + poppedState);
            LOG.trace("New State: " + newStateToEnter);
        } catch (EmptyStackException e) {
            LOG.trace("Lexer State Stack has no values - entering initial state");
            lexer.yybegin(lexer.getInitialState());
        }
    }
}
