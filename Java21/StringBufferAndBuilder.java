package Java21;

public class StringBufferAndBuilder {
    public static void repeatMethod() {
        StringBuilder sb = new StringBuilder();
        sb.repeat("Hello ", 2);
        System.out.println(sb.toString());
    }

    public static void repeatWP() {
        StringBuilder sb = new StringBuilder();
        sb.repeat(0x1F600, 5); // Unicode for 😀
        sb.repeat('!', 2);
        System.out.println(sb.toString());
    }

    public static void main(String[] args) {
        repeatMethod();
        repeatWP();
    }
}
