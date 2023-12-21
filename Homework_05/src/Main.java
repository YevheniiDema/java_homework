/* 1 уровень сложности: №1

Создать программу, выводящую на экран ближайшее к 10 из двух чисел, записанных в переменные m и n.
Числа могут быть, как целочисленные, так и дробные.


Например :
ввод : m=10.5, n=10.45
вывод: Число 10.45 ближе к 10.

 */
public class Main {
    public static void main(String[] args) {
        float m = 10.35f;
        float n = 10.25f;
        int k = 10;

        if (Math.abs(k-m) < Math.abs(k-n)) {
            System.out.println("Число " + m + " ближе к " + k);
        } else if (Math.abs(k-m) > Math.abs(k-n)){
            System.out.println("Число " + n + " ближе к " + k);
        } else {
            System.out.println("Числа разположены на одинаковом расстоянии");
        }


    }
}