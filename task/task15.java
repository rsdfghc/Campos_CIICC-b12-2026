interface Shape {
    double calculateArea();
    double calculatePerimeter();
}

abstract class AbstractShape implements Shape {
    String color;
    double length, width;

    AbstractShape(String color, double length, double width) {
        this.color = color;
        this.length = length;
        this.width = width;
    }
}

class Circle extends AbstractShape {
    double radius;

    Circle(String color, double radius) {
        super(color, radius, radius);
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

class Rectangle extends AbstractShape {

    Rectangle(String color, double length, double width) {
        super(color, length, width);
    }

    public double calculateArea() {
        return length * width;
    }

    public double calculatePerimeter() {
        return 2 * (length + width);
    }
}

public class task15 {
    public static void main(String[] args) {
        Circle circle = new Circle("Red", 5);
        Rectangle rectangle = new Rectangle("Blue", 4, 6);

        System.out.println("Circle Area: " + circle.calculateArea());
        System.out.println("Circle Perimeter: " + circle.calculatePerimeter());

        System.out.println("Rectangle Area: " + rectangle.calculateArea());
        System.out.println("Rectangle Perimeter: " + rectangle.calculatePerimeter());
    }
}