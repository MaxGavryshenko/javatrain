package task2;

import java.util.Scanner;

public class DigitsSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter integer number");
        int number = sc.nextInt();
        System.out.printf("Sum of the digits in number %d is %d", number, calcNumDigitSum(number));
    }

    public static int calcNumDigitSum(int number) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }
}
