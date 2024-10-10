package Java9;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java9StreamAPI {
    public static void main(String[] args) {
//        takeWhile();
//        dropWhile();
//        iterate();
        ofNullable();
    }

    private static void takeWhile() {
        Stream.of("a", "b", "c", "", "e", "f").takeWhile(s -> !s.isEmpty()).forEach(System.out::print);

        System.out.println();

        Stream.of("a", "", "c", "", "e", "f").takeWhile(s -> !s.isEmpty()).forEach(System.out::print);
    }

    private static void dropWhile() {
        Stream.of("a", "", "b", "c", "e", "f").dropWhile(s -> !s.isEmpty()).forEach(System.out::print);

        System.out.println();
        Stream.of("a", "b", "c", "", "e", "", "f").dropWhile(s -> !s.isEmpty()).forEach(System.out::print);
    }

    private static void iterate() {
        List<Integer> numbers = Stream.iterate(1, i -> i <= 5, i -> i + 1)
                .collect(Collectors.toList());

        System.out.println(numbers);
    }

    private static void ofNullable() {
        Stream<String> stream = Stream.ofNullable("Ramesh");
        System.out.println(stream.count());

        stream = Stream.ofNullable(null);
        System.out.println(stream.count());
    }
}
