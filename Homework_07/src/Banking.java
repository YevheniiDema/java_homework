public class Banking {
    /*№2.У вас на банковском счету N долларов. Вы хотите снять все, но банк разрешает
    снять только сумму, которая является делителем текущей суммы на счету и меньше текущей суммы.
    Если вы снимаете максимально возможную сумму каждый день, сколько дней вам понадобится, чтобы
    забрать все свои деньги из банка?
    Примечание: если оставшаяся сумма равна 1, вы можете снять ее.

Ввод:  N = 21
Выход:  7
Объяснение:  N = 21
Снято 7, осталось = 14
Снято 7, осталось = 7
Снято 1, осталось = 6
Снято 3, осталось = 3
Снято 1, осталось = 2
Снято 1, Осталось = 1
Снято 1, осталось = 0

*/
    public static void main(String[] args) {
        int N = 5;
        int count1 = bankingOperation(N);
        System.out.println(count1);

    }

    public static boolean isValid(int sum, int divisor) {
        return (sum % divisor == 0 && divisor < sum);

    }

    public static int bankingOperation(int sum) {
        int count = 0;
        while (sum > 0) {
            int maxDivisor = 1;
            for (int i = sum; i >= 1; i--) {
                if (isValid(sum, i)) {
                    maxDivisor = i;
                    break;
                }
            }
            sum -= maxDivisor;
            count ++;
        }
        return count;
    }
}