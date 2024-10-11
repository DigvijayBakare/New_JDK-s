package Java10;

import java.util.List;
import java.util.Set;
import java.util.Map;

public class ImmutableCollections {
    public static void main(String[] args) {
        List<String> list = List.of("A", "B", "C");
        List<String> immutableList = List.copyOf(list);
//        immutableList.add("D");         // java.lang.UnsupportedOperationException

        Set<String> originalSet = Set.of("X", "Y", "Z");
        Set<String> immutableSet = Set.copyOf(originalSet);

        Map<String, Integer> originalMap = Map.of("One", 1, "Two", 2);
        Map<String, Integer> immutableMap = Map.copyOf(originalMap);

        System.out.println("Immutable List: " + immutableList);
        System.out.println("Immutable Set: " + immutableSet);
        System.out.println("Immutable Map: " + immutableMap);
    }
}
