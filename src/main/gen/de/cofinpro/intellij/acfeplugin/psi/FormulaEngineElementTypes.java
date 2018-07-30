// This is a generated file. Not intended for manual editing.
package de.cofinpro.intellij.acfeplugin.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import de.cofinpro.intellij.acfeplugin.psi.impl.*;

public interface FormulaEngineElementTypes {

  IElementType PROPERTY = new FormulaEngineElementType("PROPERTY");

  IElementType COMMENT = new FormulaEngineTokenType("COMMENT");
  IElementType CRLF = new FormulaEngineTokenType("CRLF");
  IElementType KEY = new FormulaEngineTokenType("KEY");
  IElementType SEPARATOR = new FormulaEngineTokenType("SEPARATOR");
  IElementType VALUE = new FormulaEngineTokenType("VALUE");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
       if (type == PROPERTY) {
        return new FormulaEnginePropertyImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
