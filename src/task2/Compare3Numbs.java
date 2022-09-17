package task2;

import java.util.Scanner;

public class Compare3Numbs {
    public static void main(String[] args) {
        int firstNum, secondNum, thirdNum;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 number");
        firstNum = sc.nextInt();
        System.out.println("Enter 2 number");
        secondNum = sc.nextInt();
        System.out.println("Enter 3 number");
        thirdNum = sc.nextInt();
        System.out.println(compareNumbers(firstNum, secondNum, thirdNum) + " number is bigger");
    }

    public static int compareNumbers(int num1, int num2, int num3) {
        if (num3 > num2 && num3 > num1) {
            return num3;
        } else if (num2 > num1 && num2 > num3) {
            return num2;
        } else
            return num1;
    }
}
