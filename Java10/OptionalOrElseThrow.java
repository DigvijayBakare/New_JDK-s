package Java10;

import java.util.NoSuchElementException;
import java.util.Optional;

public class OptionalOrElseThrow {
    public static void main(String[] args) {
        Optional<String> optionalValue = Optional.of("Java 10");

        // Using orElseThrow() to get the value or throw an exception
        String value = optionalValue.orElseThrow();
        System.out.println("Value: " + value);

        Optional<String> emptyOptional = Optional.empty();

        try {
            // This will throw NoSuchElementException
            emptyOptional.orElseThrow();
        } catch (NoSuchElementException e) {
            System.out.println("No value present");
        }
    }
}
