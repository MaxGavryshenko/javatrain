package task4;

import java.util.Arrays;

public class task10ArrayEquality {
    private static final int[][] arr1 = {{1, 2, 3, 4, 5, 6}, {1, 2, 3, 4, 5, 6, 7, 8}};
    private static final int[][] arr2 = {{1, 2, 3, 4, 5, 6}, {1, 2, 3, 4, 5, 6, 7, 10}};

    public static void main(String[] args) {
        System.out.println(Arrays.deepEquals(arr1, arr2));
    }
}
