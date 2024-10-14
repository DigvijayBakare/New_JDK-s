package Java21;

// clamp: - ensures that a number is within a specified range.

public class ClampMethod {
    public static void intMethod() {
        int value = 150;
        int clampedValue = Math.clamp(value, 100, 120);
        System.out.println("Clamped Value: " + clampedValue);
    }

    public static void longMethod() {
        long value = 150L;
        long clampedValue = Math.clamp(value, 100L, 120L);
        System.out.println("Clamped Value: " + clampedValue);
    }

    public static void doubleMethod() {
        double value = 9.8;
        double clampedValue = Math.clamp(value, 0.0, 5.0);
        System.out.println("Clamped Value: " + clampedValue);
    }

    public static void floatMethod() {
        float value = 9.8f;
        float clampedValue = Math.clamp(value, 0.0f, 5.0f);
        System.out.println("Clamped Value: " + clampedValue);
    }

    public static void main(String[] args) {
        intMethod();
        longMethod();
        doubleMethod();
        floatMethod();
    }
}
