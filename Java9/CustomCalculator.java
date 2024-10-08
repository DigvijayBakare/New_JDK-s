package Java9;

import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class CustomCalculator implements Calculator {
    public static void main(String[] args) {
        Calculator calculator = new CustomCalculator();
        int sumOfEven = calculator.addEvenElements(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int sumOfOdd = calculator.addOddElements(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println("The sum of even numbers provided is " + sumOfEven);
        System.out.println("The sum of odd numbers provided is " + sumOfOdd);
    }
}

interface Calculator {
    default int addEvenElements(int... num) {
        return add(n -> n % 2 == 0, num);
    }

    default int addOddElements(int... num) {
        return add(n -> n % 2 != 0, num);
    }

    private int add(IntPredicate predicate, int... num) {
        return IntStream.of(num).filter(predicate).sum();
    }
}