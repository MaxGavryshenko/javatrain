package task3;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter positive integer");
        int number = sc.nextInt();
        long fact = 1;
        for (int i = 1; i <= number; i++) {
            fact *= i;
        }
        System.out.printf("Factorial of %d is %d", number, fact);
    }
}

