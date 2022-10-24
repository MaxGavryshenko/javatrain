package oop_inheritance.task1;

public class Circle extends Shape {

    private static final double PI = 3.14;
    private int radius;
    private double area;

    private double perimeter;

    public Circle(int radius) {
        this.radius = radius;
    }

    public static void main(String[] args) {
        int r = setIntegerValue("Enter integer value of circle radius");
        Circle circle = new Circle(r);
        circle.area = circle.getArea();
        circle.perimeter = circle.getPerimeter();
        System.out.println(circle);
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
        return "Circle " + "radius: " + radius + ", area: " + area + ", perimeter: " + perimeter;
    }
}
