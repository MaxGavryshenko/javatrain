package task4;

import static task4.Helpers.inputIntegerValue;

public class task4ValueInArray {
    private static final String VALUE_EXISTS = "Value is exists in array";
    private static final String VALUE_NOT_EXISTS = "Value does not exists in array";
    private static final int[] ARR = {1, 8, 7, 3, 10};
    private static final int val = inputIntegerValue();

    public static void main(String[] args) {
        for (int data: ARR) {
            if (data == val){
                System.out.print(VALUE_EXISTS);
                break;
            }
            else {
                System.out.print(VALUE_NOT_EXISTS);
            }
        }
    }
}
