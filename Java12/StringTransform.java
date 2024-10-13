package Java12;

import java.util.Locale;

public class StringTransform {
    public static void main(String[] args) {
        String text = "java features";

        // Transform the string to uppercase and append a suffix
        String transformedText = text.transform(s -> s.toUpperCase(Locale.ROOT) + " - Java 12");

        System.out.println("Original Text: " + text);
        System.out.println("Transformed Text: " + transformedText);
    }
}
