package Java12;

public class StringIndent {
    public static void main(String[] args) {
        String text = "Java\nFeatures\nIndentation";

        // Indent each line by 4 spaces
        String indentedText = text.indent(4);

        // Remove 2 spaces from each line
        String reducedIndentationText = indentedText.indent(-2);

        System.out.println("Original Text:\n" + text);
        System.out.println("Indented Text:\n" + indentedText);
        System.out.println("Reduced Indentation Text:\n" + reducedIndentationText);
    }
}
