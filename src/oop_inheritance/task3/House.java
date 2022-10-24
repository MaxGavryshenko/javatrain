package oop_inheritance.task3;


public class House extends Building{
    private Bathroom bathroom;
    private Bedroom bedroom;

    public House(Bathroom bathroom, Bedroom bedroom) {
        this.bathroom = bathroom;
        this.bedroom = bedroom;
    }

    public static void main(String[] args) {
        House house = new House(new Bathroom(3, 2), new Bedroom(4, 5));
        System.out.println(house.getArea());
    }
    @Override
    public int getArea() {
        return this.bathroom.getArea() + this.bedroom.getArea();
    }
}
