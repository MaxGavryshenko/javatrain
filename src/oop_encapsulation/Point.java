package oop_encapsulation;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public double calculateDistanceToThePoint(Point point) {
        return Math.sqrt(Math.pow((point.y - this.y), 2) + Math.pow((point.x - this.x), 2));
    }

    public static void main(String[] args) {
        Point point = new Point(3, 5);
        double result = point.calculateDistanceToThePoint(new Point(4, 6));
        System.out.println(result);
    }
}

