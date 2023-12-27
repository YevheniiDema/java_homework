import java.util.Arrays;
import java.util.Random;

public class Repeating {
    public static void main(String[] args) {
        Integer[] arr = new Integer[5];
        Random rand = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(89) + 10;
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        for (int i = 0; i < arr.length; i++) {
            Integer[] arrCopy = Arrays.copyOf(arr, arr.length);
            Arrays.sort(arrCopy);
            System.out.print(Arrays.toString(arrCopy));
        }




    }
}
