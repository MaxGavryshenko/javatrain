package task4_2;

import java.util.Arrays;

public class task4_1RemoveEachWorldMore5Char {
    private static final String[] arr = {"MoreThan5letters", "Max", "Test4", "3sy"};

    public static void main(String[] args) {
        String[] new_arr = new String[arr.length - 1];
        for (int i = 0, k = 0; k < arr.length; k++) {
            if (arr[k].length() < 5){
                new_arr[i] = arr[k];
                i++;
            }
        }
        System.out.println(Arrays.toString(new_arr));
    }
}
