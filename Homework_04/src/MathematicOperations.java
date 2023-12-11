import javax.swing.plaf.PanelUI;

public class MathematicOperations {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 12;
        int c = sum(num1, num2);
        System.out.println(c);
        secondSum(num1, num2);

        int d = sub(num1, num2);
        System.out.println(d);
        secondSub(num1, num2);

        int m = mult(num1, num2);
        System.out.println(m);
        secondMult(num1, num2);

        double dif = div(num1, num2);
        System.out.println(dif);
        secondDiv(num1, num2);
    }
    public static int sum(int num1, int num2){
        return num1 + num2;
    }
    public static void secondSum (int num1, int num2) {
        System.out.println(num1 + num2);
    }

    public static int sub(int num1, int num2){
        return num1 - num2;
    }
    public static void secondSub(int num1, int num2) {
        System.out.println(num1 - num2);
    }

    public static int mult(int num1, int num2){
        return num1 * num2;
    }
    public static void secondMult (int num1, int num2) {
        System.out.println(num1 * num2);
    }
    public static double div(double num1, double num2){
        return num1 / num2;
    }
    public static void secondDiv(double num1, double num2) {
        System.out.println(num1 / num2);
    }
}
