package Java10;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UnmodifiableCollectors {
    public static void main(String[] args) {
        List<String> list = Stream.of("Java", "10", "Features")
                .collect(Collectors.toUnmodifiableList());

        Set<String> set = Stream.of("A", "B", "C")
                .collect(Collectors.toUnmodifiableSet());

        Map<String, Integer> map = Stream.of("One", "Two", "Three")
                .collect(Collectors.toUnmodifiableMap(
                        s -> s,
                        s -> s.length()
                ));

        System.out.println("Unmodifiable List: " + list);
        System.out.println("Unmodifiable Set: " + set);
        System.out.println("Unmodifiable Map: " + map);
    }
}
