package task3;

import static java.lang.System.out;

public class MultiplicationTable {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            out.printf("4 * %d = %d\n", i, (4 * i));
        }
    }
}
