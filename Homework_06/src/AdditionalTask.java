import java.util.Arrays;
import java.util.Scanner;

public class AdditionalTask {
    public static void main(String[] args) {
        /*Для введённого пользователем с клавиатуры натурального числа
        посчитайте сумму всех его цифр (заранее не известно сколько цифр будет в числе).
        Например:
        Ввод = 12345
        Вывод = 1+2+3+4+5 = 15*/
        Scanner sc = new Scanner(System.in);

        System.out.println("Input a natural number");
        int num = sc.nextInt();
        int sum = 0;

        for (int n = num; n !=0; n /= 10) {
            sum += (n % 10);

        }
        System.out.println(sum);
    }
}
