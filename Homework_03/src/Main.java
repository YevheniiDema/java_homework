public class Main {
    public static void main(String[] args) {
        String str = new String("I study Basic Java!");
        manipulationsWithString(str);
    }
    public static void manipulationsWithString(String str) {
        System.out.println("Пред-последний символ строки: " + str.charAt(str.length()-2));
        System.out.println("Вырезанная строка: " + str.substring(0));
        System.out.println("UpperCase: " + str.toUpperCase());
        System.out.println("LowerCase: " + str.toLowerCase());
    }
}
