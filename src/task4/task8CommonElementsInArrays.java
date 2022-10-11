package task4;

public class task8CommonElementsInArrays {
    private static final int[] arr1 = {5, 3, 4, 8, 10, -30, 158};
    private static final int[] arr2 = {5, 2, 4, 7, 10, -20, 138, 21, 8};

    public static void main(String[] args) {
        for (int el1 : arr1) {
            for (int el2 : arr2) {
                if (el1 == el2) {
                    System.out.println(el1);
                }
            }
        }
    }
}
