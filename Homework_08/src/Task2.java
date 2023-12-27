import java.util.Arrays;
import java.util.Random;

public class Task2 {
    /*Создайте массив из 5 случайных целых чисел из интервала [10;99]
Выведите его на консоль в строку.
Определите и выведите на экран сообщение о том, является ли массив строго возрастающей последовательностью.

*/
    public static void main(String[] args) {
        Integer[] arr2 = new Integer[5];
        Random num2 = new Random();

        Integer[] arrCopy = new Integer[5];


        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = num2.nextInt(89) + 10;
            System.out.print(arr2[i] + " ");
        }



        for (int i = 0; i < arr2.length; i++) {
            arrCopy = Arrays.copyOf(arr2, arr2.length);
//            System.out.print(arrCopy[i] + " ");
        }
        System.out.println();
        System.out.println(Arrays.toString(arr2));
        Arrays.sort(arrCopy);
        System.out.println(Arrays.toString(arrCopy));
        if (arr2 == arrCopy) {
            System.out.println("Массив является строго возрастающей последовательностью");
        } else {
            System.out.println("Массив не является строго возрастающей последовательностью");
        }
    }
}
