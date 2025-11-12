package Demo1;

class shape {
    String color;
    boolean filled;

    shape() { // default constructor
        color = "RED";
        filled = false;
    }
    shape(String color, boolean filled) { // parameterized constructor
        this.color = color;
        this.filled = filled;
    }
    String getColor() {
        return color;
    }
    void setColor(String color) {
        this.color = color;
    }
    boolean isFilled() {
        return filled;
    }
    void setFilled(boolean filled) {
        this.filled = filled;
    }

    double getarea() {
        System.out.println("Area formula depends on the shape.");
        return 0;
    }

    double getperimeter() {
        System.out.println("Perimeter formula depends on the shape.");
        return 0;
    }
    void display() {
        System.out.println("Color of shape is: " + this.color);
        System.out.println("The shape is filled or not: " + this.filled);
    }
} // class shape ends

class Circle extends shape {
    double radius;

    Circle() { // default constructor
        super();
        radius = 2.25;
    }
    Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }
    double getRadius() {
        return radius;
    }
    void setRadius(double radius) {
        this.radius = radius;
    }

    double getarea() {
        return Math.PI * radius * radius;
    }

    double getperimeter() {
        return 2 * Math.PI * radius;
    }

    void display() {
        super.display(); // include shape info
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + getarea());
        System.out.println("Perimeter: " + getperimeter());
    }
} // class Circle ends

public class shapetest {
    public static void main(String[] args) {
        shape s1 = new shape();
        System.out.println("---- Shape 1 ----");
        s1.display();
        s1.getarea();
        s1.getperimeter();
        System.out.println();

        shape s2 = new shape("Blue", false);
        System.out.println("---- Shape 2 ----");
        s2.display();
        s2.getarea();
        s2.getperimeter();
        System.out.println();

        Circle c1 = new Circle();
        System.out.println("---- Circle 1 ----");
        c1.display();
        System.out.println();

        Circle c2 = new Circle("Green", true, 5.5);
        System.out.println("---- Circle 2 ----");
        c2.display();
    }
}
