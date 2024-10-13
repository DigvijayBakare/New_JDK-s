package Java12;

public class SwitchExpressions {
    public static void main(String[] args) {
        String day = "MONDAY";

        // Using switch as an expression
        int result = switch (day) {
            case "MONDAY", "FRIDAY", "SUNDAY" -> 6;
            case "TUESDAY" -> 7;
            case "THURSDAY", "SATURDAY" -> 8;
            case "WEDNESDAY" -> 9;
            default -> throw new IllegalArgumentException("Invalid day: " + day);
        };

        System.out.println("Result: " + result);
    }
}
