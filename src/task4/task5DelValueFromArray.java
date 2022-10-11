package task4;

import java.util.Arrays;

import static task4.Helpers.inputIntegerValue;

public class task5DelValueFromArray {
    private static final int[] arr = {5, 3, 4, 3, 8, 3, 5};
    private static final int val = inputIntegerValue();

    public static void main(String[] args) {
        int[] new_arr = new int[arr.length];
        for (int i = 0, k = 0; k < arr.length; k++) {
            if (arr[k] != val) {
                new_arr[i] = arr[k];
                i++;
            }
        }
        System.out.println(Arrays.toString(new_arr));
    }

}
