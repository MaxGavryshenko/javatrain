package task4_2;

public class task4_3ChangeLetterToNum {
    private static final String str = "Lorem ipsum dol1or sit amet. Est recusandae quisquam aut animi perspiciatis et animi atque vel dolor veniam ut beatae perspiciatis.";

    public static void main(String[] args) {
        String regex = "^[a-zA-Z]$";
        String[] strArray = str.split("");
        char[] ch = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            if (strArray[i].matches(regex)) {
                int num = ch[i];
                strArray[i] = Integer.toString(num);
            } else {
                strArray[i] = "*";
            }
        }
        String newStr = String.join(" ", strArray);
        System.out.print(newStr);
    }
}

