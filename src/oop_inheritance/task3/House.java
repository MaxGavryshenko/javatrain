package oop_inheritance.task3;


public class House extends Building {
    private Bathroom bathroom;
    private Bedroom bedroom;

    public House(Bathroom bathroom, Bedroom bedroom) {
        this.bathroom = bathroom;
        this.bedroom = bedroom;
    }

    @Override
    public int getArea() {
        return this.bathroom.getArea() + this.bedroom.getArea();
    }
}
