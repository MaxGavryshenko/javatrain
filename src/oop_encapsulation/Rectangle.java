package oop_encapsulation;

public class Rectangle {
    private int length;
    private int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public static int rectangleAreaCalc(int length, int width) {
        Rectangle rect = new Rectangle(length, width);
        return rect.length * rect.width;
    }

    public static void main(String[] args) {
        System.out.println(rectangleAreaCalc(5, 2));
    }
}
