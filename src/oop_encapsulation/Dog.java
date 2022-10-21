package oop_encapsulation;

public class Dog {
    private String colour;
    private String name;

    public Dog(String colour, String name) {
        this.colour = colour;
        this.name = name;
    }

    public static void main(String[] args) {
        Dog dog = new Dog("Black", "Linda");
        System.out.println("Dog name: " + dog.name);
        System.out.println("Dog colour: " + dog.colour);
    }

}
