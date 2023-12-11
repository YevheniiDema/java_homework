import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое слово!");
        String str1 = sc.nextLine();
        System.out.println("Введите второе слово!");
        String str2 = sc.nextLine();

        if ((str1.length() % 2 != 0) || (str2.length() % 2 != 0) ) {
            System.out.println("Введенные слова не подходят!");
        } else {
            System.out.println(str1.substring(0, str1.length()/2) +
                    str2.substring(str2.length()/2));
        }
    }

}