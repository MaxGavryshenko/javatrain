package task4;

import java.util.Arrays;

public class task6MinMaxArrValue {
    private static final String MIN_VALUE_OUT = "MIN value in array is: ";
    private static final String MAX_VALUE_OUT = "MAX value in array is: ";
    private static final int[] arr = {5, 3, 4, 8,10, -30, 158};
    public static void main(String[] args) {
        Arrays.sort(arr);
        System.out.println(MIN_VALUE_OUT + arr[0]);
        System.out.println(MAX_VALUE_OUT + arr[arr.length - 1]);
    }
}
