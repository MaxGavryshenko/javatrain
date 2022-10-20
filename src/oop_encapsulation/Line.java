package oop_encapsulation;

public class Line {
    private Point point1;
    private Point point2;

    public Line(Point point1, Point point2) {
        this.point1 = point1;
        this.point2 = point2;
    }

    void parallel(Line line) {
        int p1 = this.point2.getX() - this.point1.getX();
        int p2 = this.point2.getY() - this.point1.getY();
        int q1 = line.point2.getX() - line.point1.getX();
        int q2 = line.point2.getY() - line.point1.getY();
        if (Math.abs(p1 * q2 - p2 * q1) < 1e-9)
            System.out.println("Two lines are parallel.");
        else
            System.out.println("Two lines are not parallel.");
    }

    public static void main(String[] args) {
        Line line = new Line(new Point(3, 5), new Point(8, 12));
        line.parallel(new Line(new Point(3, 5), new Point(8, 12)));
    }
}