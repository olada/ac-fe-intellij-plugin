package de.cofinpro.intellij.acfeplugin.psi;

public class FormulaEnginePsiPresentationTextCreator {
    public String createTextFor(FormulaEngineFunctionDefinition element) {
        // The structure view shows functions with their names and their parameter list.
        StringBuilder stringBuilder = new StringBuilder(element.getIdentifierName());
        stringBuilder.append('(');
        String parametersText = element.getText().substring(element.getText().indexOf('(') + 1, element.getText().indexOf(')'));
        stringBuilder.append(parametersText.trim().replaceAll("\\s\\s+", " ")); // replace more than two spaces with one space
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}
