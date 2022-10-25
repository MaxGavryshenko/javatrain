package oop_inheritance.task3;

public class Bedroom extends Room{
    private int length;
    private int height;

    public Bedroom(int length, int height) {
        this.length = length;
        this.height = height;
    }
    
    public int getArea() {
        return areaCalculation(this.length, this.height);
    }
}
