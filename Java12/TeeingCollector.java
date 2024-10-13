package Java12;

import java.util.List;
import java.util.stream.Collectors;

public class TeeingCollector {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Using Teeing Collector to calculate the average and sum
        var result = numbers.stream()
                .collect(Collectors.teeing(
                        Collectors.summingInt(Integer::intValue),
                        Collectors.averagingInt(Integer::intValue),
                        (sum, avg) -> "Sum: " + sum + ", Average: " + avg
                ));

        System.out.println("Result: " + result);
    }
}
