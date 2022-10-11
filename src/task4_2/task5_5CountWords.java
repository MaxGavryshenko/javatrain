package task4_2;

public class task5_5CountWords {
    private static final String str = "Lorem ipsum dolor sit amet. Est recusandae quisquam aut animi perspiciatis et animi atque vel dolor veniam ut beatae perspiciatis.";
    private static final String desiredWord = "dolor";

    public static void main(String[] args) {
        int count = 0;
        String[] words = str.split(" ");
        for (String word : words) {
            if (word.equals(desiredWord)) {
                count++;
            }
        }
        System.out.println(count);
    }
}
