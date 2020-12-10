package abstractclasses;

abstract class Shape {
    String color;

    abstract double area();

    public abstract String toString();

    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}

class Circle extends Shape {
    double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;

    }

    @Override
    double area() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public String toString() {
        return String.format("color is " + super.color + " and "+ "area is " + area());

    }
}

public class Test {
    public static void main(String[] args) {
        Shape sh = new Circle("Red", 10.0);
        System.out.println(sh.toString());
    }
}