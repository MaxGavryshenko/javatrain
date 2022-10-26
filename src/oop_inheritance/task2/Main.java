package oop_inheritance.task2;

public class Main {
    static Horse horse = new Horse();
    static Lion lion = new Lion();
    static Mouse mouse = new Mouse();
    static Python python = new Python();

    public static void main(String[] args) {
        horse.eat();
        lion.sleep();
        mouse.run();
        python.speak();
    }
}
