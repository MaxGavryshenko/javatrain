package task3;

import static java.lang.System.out;

public class DisplayNumSequence {
    public static void main(String[] args) {
        for (int i = 1; i <= 512; i *= 2) {
            out.printf("%d ", i);
        }
    }
}
