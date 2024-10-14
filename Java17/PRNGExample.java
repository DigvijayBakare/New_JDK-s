package Java17;

import java.util.random.*;

public class PRNGExample {
    public static void main(String[] args) {
        RandomGenerator generator = RandomGeneratorFactory.of("L64X128MixRandom").create();
        System.out.println("Random Number: " + generator.nextInt());

        // 6 digit random generator
        // Generate a random number between 100000 and 999999 (6 digits)
        int randomSixDigitNumber = 100000 + generator.nextInt(900000);

        // Print the random 6-digit number
        System.out.println("Random 6-Digit Number: " + randomSixDigitNumber);
    }
}

// "L64X128MixRandom" is one of the newer algorithms available in Java 17 for random number generation.
// The code now correctly obtains an instance of this generator.