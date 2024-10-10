package Java9;

import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java9OptionalClass {
    public static void stream() {
        List<Optional<String>> list = List.of(
                Optional.empty(),
                Optional.of("ABC"),
                Optional.empty(),
                Optional.of("XYZ"));

        // filter the list based to print non-empty values

        // if optional is non-empty, get the value in stream, otherwise return empty
        List<String> filteredList = list.stream()
                .flatMap(o -> o.isPresent() ? Stream.of(o.get()) : Stream.empty())
                .collect(Collectors.toList());

        // Optional::stream method will return a stream of either one
        // or zero element if data is present or not.
        List<String> filteredListJava9 = list.stream()
                .flatMap(Optional::stream).collect(Collectors.toList());

        System.out.println(filteredList);
        System.out.println(filteredListJava9);
    }

    public static void ifPresentOrElse() {
        Optional<Integer> optional = Optional.of(10);

        optional.ifPresentOrElse(x -> System.out.println("Value: " + x),
                () -> System.out.println("Not Present."));

        Optional<Integer> optional1 = Optional.empty();

        optional1.ifPresentOrElse(x -> System.out.println("Value: " + x),
                () -> System.out.println("Not Present."));
    }

    public static void or() {
        Optional<String> optional1 = Optional.of("Ramesh");

        Supplier<Optional<String>> supplierString = () -> Optional.of("Not Present");

        optional1 = optional1.or(supplierString);

        optional1.ifPresent(x -> System.out.println("Value: " + x));

        optional1 = Optional.empty();

        optional1 = optional1.or(supplierString);

        optional1.ifPresent(x -> System.out.println("Value: " + x));
    }

    public static void main(String[] args) {
        stream();
        ifPresentOrElse();
        or();
    }
}
