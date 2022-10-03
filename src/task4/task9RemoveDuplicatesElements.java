package task4;

import java.util.Arrays;

public class task9RemoveDuplicatesElements {
    private static final int[] arr = {5, 2, 4, 7, 10, -20, 138, 21, 8, 2, 9, 10, -20};

    public static void main(String[] args) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1 ; j < arr.length; j++) {
                if (arr[i] == (arr[j])) {
                    arr[i] = 0;
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
