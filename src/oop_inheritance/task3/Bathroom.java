package oop_inheritance.task3;

public class Bathroom {
    private int length;
    private int height;

    public Bathroom(int length, int height) {
        this.length = length;
        this.height = height;
    }

    public int getArea() {
        return this.length * this.height;
    }
}
