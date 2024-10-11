package Java11;

import java.util.List;

public class CollectionToArray {
    public static void main(String[] args) {
        List<String> list = List.of("Java", "11", "Features");

        // Converting list to array using new toArray() method
        String[] array = list.toArray(String[]::new);

        for (String item : array) {
            System.out.println(item);
        }
    }
}
