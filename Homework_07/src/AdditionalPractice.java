public class AdditionalPractice {
    /*Лифт, находящийся на первом этаже здания высотой H, должен подняться на последний этаж.
    Лифт сломан. Каждый раз он поднимается на N этажей и спускается на M этажей. Если на
    последнем подъеме лифт превысил количество этажей, то считается что лифт поднялся на самый верх.
    Найдите количество подъемов, которые понадобятся лифту.
    Ввод:
    H = 200, N = 50, M = 1
    Ответ: 5
    Объяснение:
    Первый подъем: 50 - 1 = 49
    Второй подъем: 49 + 50 - 1 = 98
    Третий подъем: 98 + 50 - 1 = 147
    Четвертый подъем: 147 + 50 - 1 = 196
    Пятый подъем: выйти за пределы H.
    Реализовать метод numberOfLifts(int floor, int stepUp, int stepDown)
    */
    public static void main(String[] args) {
        int floor = 200;
        int stepUp = 50;
        int stepDown = 1;


        int numberOfEtage = numberOfLifts(floor, stepUp, stepDown);
        System.out.println(numberOfEtage);
    }
    public static int numberOfLifts (int floor, int stepUp, int stepDown) {
        int currFloor = 0;
        int counter = 0;
        while ( currFloor < floor) {
            currFloor += (stepUp - stepDown);
            counter ++;
        }
        return counter;
    }

}
