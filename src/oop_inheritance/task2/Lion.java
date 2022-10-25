package oop_inheritance.task2;

public class Lion extends Animal{
    @Override
    public void speak() {
        System.out.println("Hrrrr");
    }

    @Override
    public void eat() {
        System.out.println("Meat");
    }

    @Override
    public void run() {
        System.out.println("Fast");
    }

    @Override
    public void sleep() {
        System.out.println( "at night");
    }
}
