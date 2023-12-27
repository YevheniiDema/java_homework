public class AdditionalTasks {

    /*Дан массив размера  N-1  , содержащий только
    различные целые числа в диапазоне от  1 до N .
     Найдите недостающий элемент.*/
    public static void main(String[] args) {
//        int [] arr = {1, 2, 3, 5};
        int [] arr = {6, 1, 2, 8, 3, 4, 7, 10, 5};
        int N = arr.length + 1;


        int missingNumber = missingElement(arr, N);
        System.out.println("Выход: " + missingNumber);

    }

    public static int missingElement (int [] arr, int N) {
        int sumNumbers = N * (N + 1) / 2;

        int sumElem = 0;
        for (int num : arr) {
            sumElem += num;
        }
        int missingElem = sumNumbers - sumElem;
        return missingElem;
    }
}
