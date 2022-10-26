package oop_inheritance.task3;

public class Main {
    public static void main(String[] args) {
        House house = new House(new Bathroom(3, 2), new Bedroom(4, 5));
        System.out.println(house.getArea());
    }
}
