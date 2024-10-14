package Java21;

public class PatternMatchingSwitchExample {
    public static void main(String[] args) {
        Object obj = "Java 21";
        String result = switch (obj) {
            case Integer i -> "Integer: " + i;
            case String s -> "String: " + s;
            default -> "Unknown type";
        };
        System.out.println(result);
    }
}