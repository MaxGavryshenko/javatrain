package task4;

import static task4.Helpers.inputIntegerValue;

public class task2NumberSum {
    public static void main(String[] args) {
        int num = inputIntegerValue();
        for (int i = 1, sum = 0; i < num; i++) {
            System.out.println(sum += i);
        }
    }
}
