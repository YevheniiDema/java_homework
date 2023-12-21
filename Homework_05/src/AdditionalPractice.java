import java.util.Scanner;

public class AdditionalPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите ставку работника!");
        double tariff = sc.nextDouble();
        System.out.println("Введите количество отработанных часов!");
        double hours = sc.nextDouble();
        double sal = salary(tariff, hours);
        System.out.println(sal);
    }

    public static double salary(double tariff, double hours) {
        if (hours > 60) {
            System.out.println("Работник не может работать больше чем 60 часов в неделю");
            return 0.0;
        } else if (hours > 40) {
            return tariff * hours + tariff * (hours - 40) * 1.5;
        } else {
            return tariff * hours;
        }
    }
}

