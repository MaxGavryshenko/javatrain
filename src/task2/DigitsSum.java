package task2;

import java.util.Scanner;

public class DigitsSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter integer number");
        int number = sc.nextInt();
        System.out.println("Sum of the digits in number " + number + " is " + calcNumDigitSum(number));
    }

    public static int calcNumDigitSum(int number) {
        int sum = 0;
        while (number > 0) {
            sum = sum + number % 10;
            number = number / 10;
        }
        return sum;
    }
}
