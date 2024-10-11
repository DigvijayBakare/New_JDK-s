package Java11;

import java.util.List;
import java.util.function.Consumer;

public class VarInLambda {
    public static void main(String[] args) {
        List<String> list = List.of("Java", "11", "Features");

        // Using 'var' in lambda expression
        Consumer<String> consumer = (var item) -> System.out.println(item);

        list.forEach(consumer);
    }
}
