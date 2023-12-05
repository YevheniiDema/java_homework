import java.util.Scanner;

public class AdditionalTasks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите имя пользователя!");
        String user = sc.nextLine();
        System.out.println("Добрый день, <" + user + ">!");
        System.out.println("Ваше имя начинается с символа < " + user.charAt(0) +
                " и заканчивается на символ < " + user.charAt(user.length()-1) + " >.");
    }
}
