package oop_inheritance.task2;

public class Python extends Animal {
    private String speak;
    private String eat;
    private String run;
    private String sleep;

    public Python(String speak, String eat, String run, String sleep) {
        this.speak = speak;
        this.eat = eat;
        this.run = run;
        this.sleep = sleep;
    }

    public static void main(String[] args) {
        Python python = new Python("Shhhh", "Mouse", "Crawls", "don't sleep");
        python.speak();
        python.eat();
        python.run();
        python.sleep();
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
        return "Python " + "speak: " + speak + ", eat: " + eat + ", run: " + run + ", sleep: " + sleep;
    }
}
