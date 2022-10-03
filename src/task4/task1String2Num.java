package task4;

import static task4.Helpers.inputStringValue;
import static task4.Helpers.setScannerMessage;

public class task1String2Num {
    public static void main(String[] args) {
        setScannerMessage("Enter positive integer or double");
        String str = inputStringValue();
        if (str.matches("[0-9.,]+")) {
            double doub = Double.parseDouble(str.replace(",", "."));
            System.out.println(doub);
        }
        else {
            System.out.println("You entered non integer or double number");
        }

    }
}
