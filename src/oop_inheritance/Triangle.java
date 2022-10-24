package oop_inheritance;

public class Triangle extends Shape {

    private int side1;
    private int side2;
    private int side3;
    private double area;

    private double perimeter;

    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        triangle.side1 = setIntegerValue("Enter integer length triangle side1 ");
        triangle.side2 = setIntegerValue("Enter integer length triangle side2 ");
        triangle.side3 = setIntegerValue("Enter integer length triangle side3 ");
        triangle.area = triangle.getArea();
        triangle.perimeter = triangle.getPerimeter();
        System.out.println(triangle);
    }
    @Override
    public double getArea() {
        double p = 0.5 * (side1 + side2 + side3);
        return Math.sqrt(p * (p - side1) * (p - side2) * (p - side3));
    }

    @Override
    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    @Override
    public String toString() {
        return "Triangle " + "area: " + area + ", perimeter: " + (int) perimeter;
    }
}
