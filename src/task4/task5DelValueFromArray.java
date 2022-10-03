package task4;

import java.util.Arrays;

import static task4.Helpers.indexOfIntElementInArray;
import static task4.Helpers.inputIntegerValue;

public class task5DelValueFromArray {
    private static final int[] arr = {5, 3, 4, 8};
    private static final int val = inputIntegerValue();
    private static final int index = indexOfIntElementInArray(arr, val);

    public static void main(String[] args) {
        int[] new_arr = new int[arr.length - 1];
        for (int i = 0, k = 0; i < new_arr.length; i++, k++) {
            if (i == index) {
                k++;
            }
            new_arr[i] = arr[k];
        }
        System.out.println(Arrays.toString(new_arr));
    }

}
