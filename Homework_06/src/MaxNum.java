import java.util.Scanner;

public class MaxNum {
    /*Реализуйте программу, которая попросит
    пользователя ввести три целых числа (используйте сканер) и
    напечатает максимум из трех чисел.*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input the first number!");
        int num1 = sc.nextInt();
        System.out.println("Input the second number!");
        int num2 = sc.nextInt();
        System.out.println("Input the third number!");
        int num3 = sc.nextInt();

        maxNum(num1, num2, num3);
        int max = maxNum(num1, num2, num3);
        System.out.println("Maximal number is: " + max);


    }
    public static int maxNum(int num1, int num2, int num3) {
        if (num1 > num2 && num1 > num3) {
            return num1;
        } else if (num2 > num3 && num2 > num1) {
            return num2;
        } else {
            return num3;
        }
    }
}
