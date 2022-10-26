package oop_inheritance.task2;

public class Python extends Animal {

    @Override
    public void speak() {
        System.out.println("Shhhh");
    }

    @Override
    public void eat() {
        System.out.println("Mouse");
    }

    @Override
    public void run() {
        System.out.println("Crawls");
    }

    @Override
    public void sleep() {
        System.out.println("don't sleep");
    }
}
