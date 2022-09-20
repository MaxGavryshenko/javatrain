package task3;

import static java.lang.System.out;

public class Country {
    public static void main(String[] args) {
        int population = 1_000_000;
        int birthRate = 14;
        int mortality = 8;
        for (int year = 1; year <= 10; year++) {
            population += population / 1000 * birthRate - population / 1000 * mortality;
        }
        out.printf("Population is %d\n", population);
    }
}
