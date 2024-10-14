package Java21;

import java.util.concurrent.Future;
import java.util.concurrent.StructuredTaskScope;

public class PreviewFeatures {
    public static void stringTemplateExample() {
        int age = 25;
        String template = STR."Hello, I am \{age} years old.";
        System.out.println(template); // "Hello, I am 25 years old."
    }

    // Unnamed patterns and variables allow for the use of patterns and variables without specifying a name.
    public static void unnamedPatternsExample() {
        record Point(int x, int y) {}
        Point point = new Point(5, 10);

        if (point instanceof Point(var x, var y)) {
            System.out.println("Point: " + point);
        }
    }

    // Unnamed classes and instance main methods simplify the creation of classes and instance main methods without specifying names.
    public static void unnamedClassesExample() {
        var example = new Object() {
            void instanceMain() {
                System.out.println("Unnamed class instance main method.");
            }
        };
        example.instanceMain();
    }

    //Scoped values provide a way to define values that are scoped to a specific thread or task, improving the management of context-specific data.
    public static void scopedValuesExample() {
        ScopedValue<String> scopedValue = ScopedValue.newInstance();

        var scope = ScopedValue.where(scopedValue, "Hello, Java 21!");
        scope.run(() -> {
            System.out.println("Scoped Value: " + scopedValue.get());
        });
    }

    // Structured concurrency simplifies the handling of concurrent tasks by grouping related tasks and managing their lifecycle as a unit.
    public static void structuredConcurrencyExample() {
        try (var scope = new StructuredTaskScope.ShutdownOnFailure()) {
            var task1 = scope.fork(() -> "Task 1 result");
            var task2 = scope.fork(() -> "Task 2 result");

            scope.join();
            scope.throwIfFailed();

            System.out.println("Results: " + task1.get() + ", " + task2.get());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public static void main(String[] args) {
        stringTemplateExample();
        unnamedPatternsExample();
        unnamedClassesExample();
        scopedValuesExample();
        structuredConcurrencyExample();
    }
}