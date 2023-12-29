public class Main {
    /*№1. Представим, что у нас есть устройство, в котором две колбы.
    Прибор работает корректно, если температура первой колбы выше 100 градусов,
    а температура второй колбы меньше 100 градусов.
    Вы должны написать метод, который проверяет это устройство.
    Ваша программа должна иметь переменные temperature1 и temperature2.
    В результате метод возвращает true или false. */
    public static void main(String[] args) {
        int temperature1 = 101;
        int temperature2 = 99;
        boolean correctWork = isFunction(temperature1, temperature2);
        System.out.println(correctWork);

    }
    public static boolean isFunction(int t1, int t2) {
        return t1 > 100 && t2 < 100;
    }
}