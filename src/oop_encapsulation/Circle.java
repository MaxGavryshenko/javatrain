package oop_encapsulation;

public class Circle {
    private static final double PI = 3.14;
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public static double circle_area_calc(int radius) {
        Circle circle = new Circle(radius);
        return circle.radius * circle.radius * P;
    }

    public static void main(String[] args) {
        System.out.println(circle_area_calc(3));
    }
}
