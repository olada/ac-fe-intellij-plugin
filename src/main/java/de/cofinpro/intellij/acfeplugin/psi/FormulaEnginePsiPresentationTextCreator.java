package de.cofinpro.intellij.acfeplugin.psi;

public class FormulaEnginePsiPresentationTextCreator {
    public String createTextFor(FormulaEngineFunctionDefinition element) {
        // The structure view shows functions with their names and their parameter list.
        String identifierName = element.getName() != null ? element.getName() : "";
        StringBuilder stringBuilder = new StringBuilder(identifierName);
        stringBuilder.append('(');
        String parametersText = element.getText().substring(element.getText().indexOf('(') + 1, element.getText().indexOf(')'));
        stringBuilder.append(parametersText.trim().replaceAll("\\s\\s+", " ")); // replace more than two spaces with one space
        stringBuilder.append(')');
        return stringBuilder.toString();
    }

    public String createTextFor(FormulaEngineDeclaration declaration) {
        StringBuilder stringBuilder = new StringBuilder(declaration.getIdentifierLiteral().getText());
        if (declaration.getType() != null) {
            stringBuilder.append(" : ");
            stringBuilder.append(declaration.getType().getText());
        }
        return stringBuilder.toString();
    }
}
