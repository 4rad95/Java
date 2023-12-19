import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("----------------------------------------------------------------------");
        task1();
        System.out.println("----------------------------------------------------------------------");
        task2();
        System.out.println("----------------------------------------------------------------------");
        addTask();
        System.out.println("----------------------------------------------------------------------");
    }

    public static void task1() {
//        Представим, что у нас есть устройство, в котором две колбы.
//                Прибор работает корректно, если температура первой колбы выше 100 градусов, а температура второй колбы меньше 100 градусов.
//                Вы должны написать метод, который проверяет это устройство.
//                Ваша программа должна иметь переменные temperature1 и temperature2.
//                В результате метод возвращает true или false.
//
        Scanner sc = new Scanner(System.in);
        System.out.print("Input temperature 1 -->");
        int temperature1 = sc.nextInt();
        System.out.print("Input temperature 2 -->");
        int temperature2 = sc.nextInt();
        System.out.println("Device correct work -->" + getStatusDevice(temperature1, temperature2));
    }

    public static boolean getStatusDevice(int temperature1, int temperature2) {
        if ((temperature1 > 100) && (temperature2 < 100)) return true;
        return false;
    }

    public static void task2() {
//        У вас на банковском счету N долларов.
//                Вы хотите снять все, но банк разрешает снять только сумму, которая является делителем текущей суммы на счету и меньше текущей суммы.
//        Если вы снимаете максимально возможную сумму каждый день, сколько дней вам понадобится, чтобы забрать все свои деньги из банка?
//        Примечание: если оставшаяся сумма равна 1, вы можете снять ее.
        Scanner sc = new Scanner(System.in);
        System.out.print("Inpunt amount -->");
        int amount = sc.nextInt();
        int day = 1;
        int delta;
        while (amount > 0) {
            System.out.print("Day : " + day + "   Balance in : " + amount);
            delta = getDayAmount(amount);
            amount = amount - delta;
            System.out.println("   Remove : " + delta + "   Balance out : " + amount);
            day++;
        }
    }

    public static int getDayAmount(int amount) {
        for (int i = amount - 1; i > 1; i--) {
            if (amount % i == 0) {
                return i;
            }
        }
        return 1;
    }

    public static void addTask() {
//        Лифт, находящийся на первом этаже здания высотой H, должен подняться на последний этаж.
//        Лифт сломан.
//        Каждый раз он поднимается на N этажей и спускается на M этажей. Если на последнем подъеме лифт превысил количество этажей, то считается что лифт поднялся на самый верх.
        Scanner sc = new Scanner(System.in);
        System.out.print(" Total floor (H)--> ");
        int floor = sc.nextInt();
        System.out.print(" Up floor ( N )--> ");
        int upFloor = sc.nextInt();
        System.out.print(" Down floor ( M )--> ");
        int downFloor = sc.nextInt();
        System.out.println("Total climb : " + numberOfLifts(floor, upFloor, downFloor));

    }
    public static int numberOfLifts(int floor, int stepUp, int stepDown)
    {
        int currentFloor = 1;
        int iteration = 0;
        while (currentFloor <= floor) {
            iteration++;
            System.out.print("Iteration : " + iteration + ": -----> " + currentFloor + " + " + stepUp + " - " + stepDown + " = ");
            currentFloor = currentFloor + stepUp - stepDown;
            System.out.println(currentFloor);

        }
        return iteration;
    }
}