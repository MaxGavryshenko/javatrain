package oop_inheritance.task1;

import static task4.Helpers.inputIntegerValue;
import static task4.Helpers.setScannerIntMessage;

public abstract class Shape {

    public static int setIntegerValue(String message) {
        setScannerIntMessage(message);
        return inputIntegerValue();
    }

    public abstract double getArea();

    public abstract double getPerimeter();
}
