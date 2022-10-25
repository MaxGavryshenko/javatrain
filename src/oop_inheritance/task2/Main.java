package oop_inheritance.task2;

public class Main {
    static Horse horse = new Horse("Igogo", "Grass", "Fast", "at night");
    static Lion lion = new Lion("Hrrrr", "Meat", "Fast", "at night");
    static Mouse mouse = new Mouse("Pipipi", "Cheese", "Fast", "at the day");
    static Python python = new Python("Shhhh", "Mouse", "Crawls", "don't sleep");

    public static void main(String[] args) {
        System.out.println(horse);
        System.out.println(lion);
        System.out.println(mouse);
        System.out.println(python);
    }
}
