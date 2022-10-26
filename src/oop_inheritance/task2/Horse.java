package oop_inheritance.task2;

public class Horse extends Animal {
    @Override
    public void speak() {
        System.out.println("Igogo");
    }

    @Override
    public void eat() {
        System.out.println("Grass");
    }

    @Override
    public void run() {
        System.out.println("Fast");
    }

    @Override
    public void sleep() {
        System.out.println("at night");
    }
}
