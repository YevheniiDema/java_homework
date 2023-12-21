
public class Main {
    public static void main(String[] args) {
        char g = 'G';
        int numInt = 89;
        byte numByte = 4;
        short numShort = 56;
        float numFloat = 4.7333436f;
        double numDouble = 4.355453532;
        long numLong = 12121;



        System.out.println("Character: " + g);
        System.out.println("Integer: " + numInt);
        System.out.println("Byte: " + numByte);
        System.out.println("Short: " + numShort);
        System.out.println("Float: " + numFloat);
        System.out.println("Double: " + numDouble);
        System.out.println("Long: " + numLong);

        short num2 = 345;
        int res1 = num2 / 100;
        int res2 = (num2 / 10) % 10;
        int res3 = (num2 % (num2 / 10));
        System.out.println("Число 345 -> " + res1 + ", " + res2 + ", " + res3);


    }
}