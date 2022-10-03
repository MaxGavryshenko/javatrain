package task4;

import java.util.Arrays;
import java.util.Scanner;

public class Helpers {
    private static String scannerMessage = "Enter the desired integer value";

    private static final Scanner sc = new Scanner(System.in);
    public static int indexOfIntElementInArray(int[] arr, int value){
        Arrays.sort(arr);
        return Arrays.binarySearch(arr, value);
    }

    public static int inputIntegerValue() {
        System.out.printf(scannerMessage);
        return sc.nextInt();
    }

    public static String inputStringValue() {
        System.out.printf(scannerMessage);
        return sc.next();
    }

    public static void setScannerMessage(String scannerMessage) {
        Helpers.scannerMessage = String.format(scannerMessage);
    }
}
