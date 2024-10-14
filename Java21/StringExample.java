package Java21;

import java.util.Arrays;
import java.util.stream.Collectors;

public class StringExample {
    public static void usingString() {
        String text = "The quick brown fox jumps over the lazy dog";
        int index = text.indexOf("fox", 10, 30);
        System.out.println("Index of 'fox': " + index);
    }

    public static void usingChar() {
        String text = "The quick brown fox jumps over the lazy dog";
        int index = text.indexOf('o', 10, 30);
        System.out.println("Index of 'o': " + index);
    }

    public static void deliMeter() {
        String string = "the red brown fox jumps over the lazy dog";
        String[] parts = string.splitWithDelimiters(" ", 5);
        System.out.println(Arrays.stream(parts).collect(Collectors.joining("', '", "'", "'")));
    }

    public static void main(String[] args) {
        usingString();
        usingChar();
        deliMeter();
    }
}