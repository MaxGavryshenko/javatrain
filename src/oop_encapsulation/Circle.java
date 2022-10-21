package oop_encapsulation;

public class Circle {
    private static final double PI = 3.14;
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public double circle_area_calc() {
        return this.radius * this.radius * PI;
    }

    public static void main(String[] args) {
        Circle circle = new Circle(3);
        System.out.println(circle.circle_area_calc());
    }
}
