package oop_inheritance.task2;

public class Mouse extends Animal{
    private String speak;
    private String eat;
    private String run;
    private String sleep;

    public Mouse(String speak, String eat, String run, String sleep) {
        this.speak = speak;
        this.eat = eat;
        this.run = run;
        this.sleep = sleep;
    }
    public static void main(String[] args) {
        Mouse mouse = new Mouse("Pipipi", "Cheese", "Fast", "at the day");
        mouse.speak();
        mouse.eat();
        mouse.run();
        mouse.sleep();
    }
    @Override
    public void speak() {
        System.out.println(this.speak);
    }

    @Override
    public void eat() {
        System.out.println(this.eat);
    }

    @Override
    public void run() {
        System.out.println(this.run);
    }

    @Override
    public void sleep() {
        System.out.println(this.sleep);
    }

    @Override
    public String toString() {
        return "Mouse " + "speak: " + speak + ", eat: " + eat + ", run: " + run + ", sleep: " + sleep;
    }
}
