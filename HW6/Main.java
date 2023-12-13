import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        taskAdd();
    }
    public static void task1(){
        boolean isEdekaOpen = true;
        boolean isReweOpen  = false;

        boolean canBuy =isEdekaOpen||isReweOpen;
        if (canBuy) {
            System.out.print("Я могу купить еду, это ");
            if (isEdekaOpen)
            {
                System.out.print(" Edeka ");
            }
            if (isReweOpen)
            {
                System.out.print(" Rewe ");
            }
            System.out.println(".");
        }
        else     System.out.print(" Все магазины закрыты.");
        return;
    }
    public static void task2(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Input Year ---> ");
        int year= sc.nextInt();
        if (year%4==0) {
            System.out.println(year + " Leap year");
        }
        else {
            System.out.println(year +" not a high year");
        }
        return;
    }
    // Я не стал рассматривать ситуацию если есть два одинаковых числа
    // чтобы не реализовывать алгоритм сортировки. Но если надо, то я могу это сделать.
    public static void task3(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Input first num ---> ");
        int num1= sc.nextInt();
        System.out.print("Input second num ---> ");
        int num2= sc.nextInt();
        System.out.print("Input third num ---> ");
        int num3= sc.nextInt();
        if ((num1>num2)&&(num1>num3))
            {
                System.out.println("Maximum num 1-->"+num1);}
        if ((num2>num1)&&(num2>num3))
            {
                System.out.println("Maximum num 2-->"+num2);}
        if ((num3>num1)&&(num3>num2))
        {
            System.out.println("Maximum num 3-->"+num3);}
        return;
    }
    public static void taskAdd(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Input int num ---> ");
        String str= sc.nextLine();
        int sum = 0;
        for (int i=0; i<str.length();i++)
        {
            sum = sum+(int)str.charAt(i)-48;
        }
        System.out.println("Summa = "+sum);
        return;
    }

}