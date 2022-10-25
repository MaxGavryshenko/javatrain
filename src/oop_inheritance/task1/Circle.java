package oop_inheritance.task1;

public class Circle extends Shape {

    private static final double PI = 3.14;
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.pow(this.radius, 2) * PI;
    }

    @Override
    public double getPerimeter() {
        return 2 * this.radius * PI;
    }

    @Override
    public String toString() {
        return "Circle " + "radius: " + radius + ", area: " + this.getArea() + ", perimeter: " + this.getPerimeter();
    }
}
