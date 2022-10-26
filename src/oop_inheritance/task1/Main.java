package oop_inheritance.task1;

import static oop_inheritance.task1.Shape.setIntegerValue;

public class Main {

    public static void main(String[] args) {
        //        Circle calculations
        Circle circle = new Circle(setCircleRadius());
        System.out.println(circle);
        //        Rectangle calculations
        int[] rectangleSides = setRectangleSides();
        Rectangle rectangle = new Rectangle(rectangleSides[0], rectangleSides[1]);
        System.out.println(rectangle);
        //        Triangle calculations
        int[] triangleSides = setTriangleSides();
        Triangle triangle = new Triangle(triangleSides[0], triangleSides[1], triangleSides[2]);
        System.out.println(triangle);
    }

    private static int setCircleRadius(){
        return setIntegerValue("Enter integer value of circle radius");
    }

    private static int[] setRectangleSides(){
        int[] arr = new int[2];
        for (int i = 0; i < arr.length; i++) {
            int num = setIntegerValue(String.format("Enter integer length rectangle side %d\n", i + 1));
            arr[i] = num;
        }
        return arr;
    }

    private static int[] setTriangleSides(){
        int[] arr = new int[3];
        for (int i = 0; i < arr.length; i++) {
            int num = setIntegerValue(String.format("Enter integer length triangle %d\n", i + 1));
            arr[i] = num;
        }
        return arr;
    }

}
