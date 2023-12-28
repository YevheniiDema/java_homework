public class Main {
    public static void main(String[] args) {
        /*1. Создайте две переменные isEdekaOpen и isReweOpen,
        значения которых зависят от того, открыты магазины или нет.
    Реализует логический метод canBuy,  возвращающий boolean
    Значение этой переменной должно быть true, если хотя бы один магазин открыт, иначе false.
    Отобразите строку «Я могу купить еду, это ……» и значение.*/
        boolean isEdekaOpen = true;
        boolean isReweOpen = false;
        boolean buying = cabBuy(isEdekaOpen, isReweOpen);
        System.out.println(buying);



    }
    public static boolean cabBuy(boolean firstMarkt, boolean secondMarkt) {
        return firstMarkt || secondMarkt;
    }
}