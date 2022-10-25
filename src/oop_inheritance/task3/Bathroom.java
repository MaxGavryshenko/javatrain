package oop_inheritance.task3;

public class Bathroom extends Room{
    private int length;
    private int height;

    public Bathroom(int length, int height) {
        this.length = length;
        this.height = height;
    }

    public int getArea() {
        return areaCalculation(this.length, this.height);
    }
}
