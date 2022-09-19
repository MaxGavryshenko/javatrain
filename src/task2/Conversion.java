package task2;

import java.util.Scanner;

public class Conversion {
    public static void main(String[] args) {
        double degreeFahrenheit, inches;
        Scanner sc = new Scanner(System.in);
        int option;
        do {
            System.out.println("Choose type of conversion \n 1.Fahrenheit to Celsius  \n 2.Inches to Centimeter");
            option = sc.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Enter Fahrenheit temperature");
                    degreeFahrenheit = sc.nextDouble();
                    System.out.println("Celsius temperature is " + convertToCelsius(degreeFahrenheit));
                    break;
                case 2:
                    System.out.println("Enter Inches value");
                    inches = sc.nextDouble();
                    System.out.println(inches + " Inches equal " + convertToCentimeter(inches) + " Centimeters");
                    break;
                default:
                    System.out.println("Your choice is not correct, please choose correct value");
            }
        } while (option > 2);

    }

    public static double convertToCelsius(double degreeFahrenheit) {
        return (degreeFahrenheit - 32) * 5 / 9;
    }

    public static double convertToCentimeter(double inches) {
        return inches * 2.54;
    }
}


