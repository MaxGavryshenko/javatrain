public class DataTypes {
    public static void main(String[] args) {
        int myInt = 17, my2Int = 0b0101, my8Int = 0123, my16Int = 0x3FF;
        byte myByte = 1, my2Byte = 0b01, my8Byte = 0125, my16Byte = 0x12;
        short myShort = 1541, my2Short = 0b01, my8Short = 0122, my16Short = 0x01;
        long myLong = 32L, my2Long = 0b0101L, my8Long = 0127L, my16Long = 0x3FFL;
        float myFloat = .283f;
        double myDouble = .345;
        char myChar = '\u0051', my2Char = 0b0101, my8Char = 0126, my16Char = 0x3FF;

        int sumInt= myInt + my2Int + my8Int + my16Int;
        int sumByte = myByte + my2Byte + my8Byte + my16Byte;
        int sumShort = myShort + my2Short + my8Short + my16Short;
        long sumLong = myLong + my2Long + my8Long + my16Long;
        double sumDouble = myDouble + myFloat;
        int sumChar = myChar + my2Char + my8Char + my16Char;

        System.out.println("Integer DT sum: " + sumInt);
        System.out.println("Byte DT sum: " + sumByte);
        System.out.println("Short DT sum: " + sumShort);
        System.out.println("Long DT sum: " + sumLong);
        System.out.println("Double DT sum: " + sumDouble);
        System.out.println("Char DT sum: " + sumChar);

        long result = (long) (sumInt + sumByte + sumDouble + sumLong + sumShort + sumDouble + sumChar);
        System.out.println("Total sum: " + result);
    }
}
