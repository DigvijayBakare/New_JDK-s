package Java21;

import java.util.*;

public class SequencedCollectionExample {
    public static void sequencedList() {
        SequencedCollection<String> collection = new ArrayList<>();
        collection.add("Java");
        collection.add("21");

        SequencedCollection<String> reversed = collection.reversed();
        System.out.println("Sequenced reversed list: " + reversed); // Output: [21, Java]
    }

    public static void sequencedSet() {
        SequencedSet<String> set = new LinkedHashSet<>();
        set.add("Java");
        set.add("21");

        SequencedSet<String> reversed = set.reversed();
        System.out.println("Sequenced reversed set: " + reversed); // Output: [21, Java]
    }

    public static void sequencedMap() {
        SequencedMap<String, Integer> map = new LinkedHashMap<>();
        map.put("Java", 21);
        map.put("Features", 2023);

        SequencedMap<String, Integer> reversed = map.reversed();
        System.out.println("Sequenced reversed map: " + reversed); // Output: {Features=2023, Java=21}
    }

    public static void main(String[] args) {
        sequencedList();
        sequencedSet();
        sequencedMap();
    }
}