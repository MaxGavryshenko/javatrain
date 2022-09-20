package task3;

import java.util.Scanner;

public class BankDepositFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter deposit amount");
        double depositAmount = sc.nextInt();
        System.out.println("Enter number of months");
        int monthsNumber = sc.nextInt();
        for (int month = 1; monthsNumber >= month; month++) {
            depositAmount += (depositAmount * 0.07);
        }
        System.out.format("Total money amount : %.2f", depositAmount);
    }
}
