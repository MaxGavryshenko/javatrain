package task3;

import java.util.Scanner;

import static java.lang.System.out;

public class PrintEach7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        out.println("Enter integer number");
        int number = sc.nextInt();
        for (int i = 0; i <= number; i += 7) {
            out.printf("%d ", i);
        }
    }
}
