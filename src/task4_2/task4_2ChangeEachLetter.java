package task4_2;

import static task4.Helpers.*;

public class task4_2ChangeEachLetter {
    private static final String str = "Lorem ipsum dolor sit amet. Est recusandae quisquam aut animi perspiciatis et animi atque vel dolor veniam ut beatae perspiciatis.";

    public static void main(String[] args) {
        setScannerCharMessage("Enter desired symbol on which you want to change");
        char char2Change = inputCharValue();
        setScannerIntMessage("Enter desired integer char number");
        int desiredChar = inputIntegerValue();
        String[] arr = str.split(" ");
        for (int i = 0; i < arr.length; i++) {
            char[] ch = arr[i].toCharArray();
            if (arr[i].length() >= desiredChar) {
                ch[desiredChar - 1] = char2Change;
                String newWord = new String(ch);
                arr[i] = newWord;
            }
        }
        String newStr = String.join(" ", arr);
        System.out.println(newStr);
    }
}
