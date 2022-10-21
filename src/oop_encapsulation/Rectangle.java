package oop_encapsulation;

public class Rectangle {
    private int length;
    private int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int rectangleAreaCalc() {
        return this.length * this.width;
    }

    public static void main(String[] args) {
        Rectangle rect = new Rectangle(5, 2);
        System.out.println(rect.rectangleAreaCalc());
    }
}
