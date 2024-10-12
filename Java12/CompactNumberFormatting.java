package Java12;

import java.text.NumberFormat;
import java.util.Locale;

public class CompactNumberFormatting {
    public static void main(String[] args) {
        long number = 1_234_567;

        // Compact number formatting for different locales
        NumberFormat compactFormatterUS = NumberFormat.getCompactNumberInstance(Locale.US, NumberFormat.Style.SHORT);
        NumberFormat compactFormatterIN = NumberFormat.getCompactNumberInstance(new Locale("hi", "IN"), NumberFormat.Style.SHORT);

        System.out.println("US Compact Format: " + compactFormatterUS.format(number));
        System.out.println("India Compact Format: " + compactFormatterIN.format(number));
    }
}
