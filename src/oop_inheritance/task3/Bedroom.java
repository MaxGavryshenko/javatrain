package oop_inheritance.task3;

public class Bedroom {
    private int length;
    private int height;

    public Bedroom(int length, int height) {
        this.length = length;
        this.height = height;
    }
    
    public int getArea() {
        return this.length * this.height;
    }
}
