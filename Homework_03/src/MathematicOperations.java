public class MathematicOperations {
    public static void main(String[] args) {
        int sumResult = sum(3, 5);
        System.out.println("Сумма чисел: " + sumResult);

        int differenceResult = dif(7, 8);
        System.out.println("Разность: " + differenceResult);

        int multiResult = multi(10, 25);
        System.out.println("Умножение: " + multiResult);

        double divideResult = divide(15.5, 4.2);
        System.out.println("Деление: " + divideResult);
    }

    public static int sum(int a, int b){
        return a +b;
    }
    public static int dif(int a, int b) {
        return a - b;
    }
    public static int multi(int a, int b) {
        return a * b;
    }
    public static double divide(double a, double b) {
        return a / b;
    }

}
