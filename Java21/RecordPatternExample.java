package Java21;

public class RecordPatternExample {
    public static void main(String[] args) {
        record Point(int x, int y) {}
        Point point = new Point(5, 10);

        if (point instanceof Point(int x, int y)) {
            System.out.println("x: " + x + ", y: " + y);
        }
    }
}