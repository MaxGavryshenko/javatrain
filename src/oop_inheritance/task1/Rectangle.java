package oop_inheritance.task1;

public class Rectangle extends Shape {

    private int side1;
    private int side2;

    public Rectangle(int side1, int side2) {
        this.side1 = side1;
        this.side2 = side2;
    }

    @Override
    public double getArea() {
        return side1 * side2;
    }

    @Override
    public double getPerimeter() {
        return (side1 + side2) * 2;
    }

    @Override
    public String toString() {
        return "Rectangle " + "area: " + (int) this.getArea() + ", perimeter: " + (int) this.getPerimeter();
    }
}
