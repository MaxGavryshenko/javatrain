package oop_inheritance;

public class Rectangle extends Shape {

    private int side1;
    private int side2;
    private double area;

    private double perimeter;

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.side1 = setIntegerValue("Enter integer length rectangle side 1");
        rectangle.side2 = setIntegerValue("Enter integer length rectangle side 2");
        rectangle.area = rectangle.getArea();
        rectangle.perimeter = rectangle.getPerimeter();
        System.out.println(rectangle);
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
        return "Rectangle " + "area: " + (int) area + ", perimeter: " + (int) perimeter;
    }
}
