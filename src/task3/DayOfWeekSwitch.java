package task3;

import java.util.Scanner;

public class DayOfWeekSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int option;
        do {
            System.out.println("Enter the day of the week number");
            option = sc.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Monday");
                    break;
                case 2:
                    System.out.println("Tuesday");
                    break;
                case 3:
                    System.out.println("Wednesday");
                    break;
                case 4:
                    System.out.println("Thursday");
                    break;
                case 5:
                    System.out.println("Friday");
                    break;
                case 6:
                case 7:
                    System.out.println("Holiday");
                    break;
                default:
                    System.out.println("Your choice is not correct, please choose correct value");
            }
        } while (option > 7 || option < 1);
    }
}

