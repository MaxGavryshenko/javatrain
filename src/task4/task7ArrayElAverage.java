package task4;

import java.util.Arrays;

public class task7ArrayElAverage {
    private static final String ARRAY_AVG_OUT = "Array average except first and last is: ";
    private static final int[] arr = {5, 3, 4, 8, 10, -30, 158};

    public static void main(String[] args) {
        Arrays.sort(arr);
        double sum = 0;
        for (int i = 1; i < arr.length - 1; i++) {
            sum += arr[i];
        }
        double arrAvg = sum / (arr.length - 2);
        System.out.println(ARRAY_AVG_OUT + arrAvg);
    }
}
