package task4;

import static task4.Helpers.inputIntegerValue;
import static task4.Helpers.setScannerIntMessage;

public class task3ArrayElAverage {
    public static void main(String[] args) {
        int sum = 0;
        setScannerIntMessage("Enter the size of array");
        int arrSize = inputIntegerValue();
        int[] arr = new int[arrSize];
        for (int i = 0; i < arrSize; i++) {
            setScannerIntMessage(String.format("Enter the %d int number of array\n", i + 1));
            int num = inputIntegerValue();
            arr[i] = num;
        }
        for (int num : arr) {
            sum += num;
        }
        System.out.println(sum / arr.length);
    }
}
