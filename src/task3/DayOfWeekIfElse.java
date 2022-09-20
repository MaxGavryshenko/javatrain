package task3;

import java.util.Scanner;

public class DayOfWeekIfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int option;
        do {
            System.out.println("Enter the day of the week number");
            option = sc.nextInt();
            if (option == 1) {
                System.out.println("Monday");
            } else if (option == 2) {
                System.out.println("Tuesday");
            } else if (option == 3) {
                System.out.println("Wednesday");
            } else if (option == 4) {
                System.out.println("Thursday");
            } else if (option == 5) {
                System.out.println("Friday");
            } else if (option == 6 || option == 7) {
                System.out.println("Holiday");
            } else {
                System.out.println("Your choice is not correct, please choose correct value");
            }
        } while (option > 7);
    }
}

