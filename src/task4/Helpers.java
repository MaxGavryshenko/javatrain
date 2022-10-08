package task4;

import java.util.Arrays;
import java.util.Scanner;

public class Helpers {
    private static String scannerIntMessage = "Enter the desired integer value";
    private static String scannerStringMessage = "Enter the desired string";
    private static String scannerCharMessage = "Enter the desired char";


    private static final Scanner sc = new Scanner(System.in);
    public static int indexOfIntElementInArray(int[] arr, int value){
        Arrays.sort(arr);
        return Arrays.binarySearch(arr, value);
    }

    public static int inputIntegerValue() {
        System.out.printf(scannerIntMessage + "\n");
        return sc.nextInt();
    }

    public static String inputStringValue() {
        System.out.printf(scannerStringMessage + "\n");
        return sc.next();
    }

    public static char inputCharValue() {
        System.out.printf(scannerCharMessage + "\n");
        return sc.next().charAt(0);
    }
    public static void setScannerIntMessage(String scannerIntMessage) {
        Helpers.scannerIntMessage = String.format(scannerIntMessage);
    }
    public static void setScannerStringMessage(String ScannerStringMessage) {
        Helpers.scannerStringMessage = String.format(ScannerStringMessage);
    }
    public static void setScannerCharMessage(String scannerCharMessage) {
        Helpers.scannerCharMessage = scannerCharMessage;
    }
}
