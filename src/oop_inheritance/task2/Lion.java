package oop_inheritance.task2;

public class Lion extends Animal{
    private String speak;
    private String eat;
    private String run;
    private String sleep;

    public Lion(String speak, String eat, String run, String sleep) {
        this.speak = speak;
        this.eat = eat;
        this.run = run;
        this.sleep = sleep;
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
        return "Lion " + "speak: " + speak + ", eat: " + eat + ", run: " + run + ", sleep: " + sleep;
    }
}
