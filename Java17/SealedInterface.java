package Java17;

// sealed interface

sealed interface Shape permits Circle, Rectangle {
}

final class Circle implements Shape {
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double radius() {
        return radius;
    }
}

final class Rectangle implements Shape {
    private final double length;
    private final double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double length() {
        return length;
    }

    public double width() {
        return width;
    }
}

public class SealedInterface {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(20, 10);

        double areaOfCircle = 3.14 * (circle.radius() * circle.radius());
        double areaOfRect = rectangle.length() * rectangle.width();

        System.out.println("Area of circle: " + areaOfCircle);
        System.out.println("Area of rectangle: " + areaOfRect);
    }
}
