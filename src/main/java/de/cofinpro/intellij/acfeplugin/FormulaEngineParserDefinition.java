package de.cofinpro.intellij.acfeplugin;

import com.intellij.lang.ASTNode;
import com.intellij.lang.ParserDefinition;
import com.intellij.lang.PsiParser;
import com.intellij.lexer.Lexer;
import com.intellij.openapi.project.Project;
import com.intellij.psi.FileViewProvider;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import com.intellij.psi.TokenType;
import com.intellij.psi.tree.IFileElementType;
import com.intellij.psi.tree.TokenSet;
import de.cofinpro.intellij.acfeplugin.lex.FormulaEngineLexerAdapter;
import de.cofinpro.intellij.acfeplugin.parser.FormulaEngineParser;
import de.cofinpro.intellij.acfeplugin.psi.FormulaEngineElementTypes;
import de.cofinpro.intellij.acfeplugin.psi.FormulaEngineFileBase;
import org.jetbrains.annotations.NotNull;

/**
 * Created by David Olah on 30.07.2018.
 */
public class FormulaEngineParserDefinition implements ParserDefinition {
    public static final TokenSet WHITE_SPACES = TokenSet.create(TokenType.WHITE_SPACE);
    public static final TokenSet COMMENTS = TokenSet.create(FormulaEngineElementTypes.LINE_COMMENT, FormulaEngineElementTypes.BLOCK_COMMENT);

    @NotNull
    @Override
    public Lexer createLexer(Project project) {
        return new FormulaEngineLexerAdapter();
    }

    @Override
    public PsiParser createParser(Project project) {
        return new FormulaEngineParser();
    }

    @Override
    public IFileElementType getFileNodeType() {
        return FormulaEngineFileElementType.INSTANCE;
    }

    @NotNull
    @Override
    public TokenSet getWhitespaceTokens() {
        return WHITE_SPACES;
    }

    @NotNull
    @Override
    public TokenSet getCommentTokens() {
        return COMMENTS;
    }

    @NotNull
    @Override
    public TokenSet getStringLiteralElements() {
        return TokenSet.EMPTY;
    }

    @NotNull
    @Override
    public PsiElement createElement(ASTNode node) {
        return FormulaEngineElementTypes.Factory.createElement(node);
    }

    @Override
    public PsiFile createFile(FileViewProvider viewProvider) {
        return new FormulaEngineFileBase(viewProvider);
    }

    @Override
    public SpaceRequirements spaceExistanceTypeBetweenTokens(ASTNode left, ASTNode right) {
        return SpaceRequirements.MAY;
    }
}
