import java.util.Scanner;

public class LeapYear {
    /*Реализуйте программу, которая попросит
    пользователя ввести год и напечатать этот год
    isLeap (високосный) или нет.*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите год!");
        int year = sc.nextInt();

        if (year % 4 == 0) {
            System.out.println("Этот год високосный");
        } else {
            System.out.println("Этот год не високосный");
        }
    }
}
