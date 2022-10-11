package task4_2;

public class task4_4AddWord {
    private static final String str = "Hey Hey, you will finish this task today";
    private static final String desiredSymb = "ey";
    private static final String desiredWord = "You";

    public static void main(String[] args) {

        String[] words = str.split(" ");
        for (int i = 0; i < words.length; i++) {
            if (words[i].endsWith(desiredSymb)) {
                words[i] += " " + desiredWord;
            }
        }
        String newStr = String.join(" ", words);
        System.out.print(newStr);
    }
}
