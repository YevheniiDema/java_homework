import java.util.Random;

public class Main {
    /* Создайте массив из 8 случайных целых чисел из интервала [1;50]
Выведите массив на консоль в строку.
Замените каждый элемент с нечетным индексом на ноль.
Снова выведете массив на консоль в отдельной строке.*/
    public static void main(String[] args) {
        Integer [] arr1 = new Integer[8];
        Random num = new Random();

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = num.nextInt(50) + 1;
            System.out.print(arr1[i] + " ");
        }
        System.out.println(" ");

        for (int i = 0; i < arr1.length; i++) {
            if ( i % 2 != 0) {
                arr1[i] = 0;
                }
            System.out.print(arr1[i] + " ");
        }
    }
}