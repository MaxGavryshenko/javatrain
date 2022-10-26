package oop_inheritance.task2;

public class Mouse extends Animal{

    @Override
    public void speak() {
        System.out.println("Pipipi");
    }

    @Override
    public void eat() {
        System.out.println("Cheese");
    }

    @Override
    public void run() {
        System.out.println("Fast");
    }

    @Override
    public void sleep() {
        System.out.println("at the day");
    }
}
