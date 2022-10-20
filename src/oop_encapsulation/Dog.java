package oop_encapsulation;

public class Dog {
    private String colour = "Light Brown";
    private String name = "Gracey";

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        System.out.println("Dog name: " + dog.name);
        System.out.println("Dog colour: " + dog.colour);
        dog.setName("Linda");
        dog.setColour("Black");
        System.out.println("Dog name: " + dog.name);
        System.out.println("Dog colour: " + dog.colour);
    }

}
