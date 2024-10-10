package Java9;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class ImmutableListBeforeJava9 {
    public static void main(String[] args) {
        // Creating an ArrayList of String using
        List<String> fruits = new ArrayList<>();

        // Adding new elements to the ArrayList
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("mango");
        fruits.add("orange");

        fruits = Collections.unmodifiableList(fruits);

        // Creating Immutable List
//        fruits.add("Strawberry");
        // Exception in thread "main" java.lang.UnsupportedOperationException<String> fruits

        fruits.forEach(e -> System.out.println(e));
    }
}
