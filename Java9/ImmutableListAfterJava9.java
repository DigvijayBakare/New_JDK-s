package Java9;

import java.util.List;
import java.util.Set;
import java.util.Map;

public class ImmutableListAfterJava9 {
    public static void main(String[] args) {
        // Creating Immutable List
        List<String> fruits = List.of("Banana", "Apple", "Mango", "Orange");
        fruits.forEach(e -> System.out.println(e));

        // You can't add Elements Immutable List
//         fruits.add("Strawberry");
        // Exception in thread "main" java.lang.UnsupportedOperationException

        // in single list
        List<String> list = List.of("A", "B", "C", "D");
        list.forEach(e -> System.out.println(e));

        // Immutable Set
        Set<String> immutableSet = Set.of("X", "Y", "Z");
        System.out.println("Immutable Set: " + immutableSet);

        // Immutable Map
        Map<String, Integer> immutableMap = Map.of("One", 1, "Two", 2);
        System.out.println("Immutable Map: " + immutableMap);
    }
}
