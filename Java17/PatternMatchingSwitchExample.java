package Java17;

public class PatternMatchingSwitchExample {
    public static void main(String[] args) {
//        Object obj = "Java 17";
        Object obj = 17;

        String result = switch (obj) {
            case Integer i -> "Integer: " + i;
            case String s -> "String: " + s;
            default -> "Unknown type";
        };
        System.out.println(result);
    }
}