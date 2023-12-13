import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        addTask();
    }
    public static void task1 ()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input first num --->");
        float num1 = sc.nextFloat();
        System.out.print("Input second num --->");
        float num2 = sc.nextFloat();
        if (Math.abs(num1-10)>Math.abs(num2-10)) {
            System.out.println("Num 2 ("+num2+") closer to 10  how num1 ("+num1+")");
            return;
        }
        if (Math.abs(num1-10)<Math.abs(num2-10)) {
            System.out.println("Num 1 ("+num1+") closer to 10  how num2 ("+num2+")");
            return;
        }
        else{
            System.out.println("Num 1 ("+num1+") equals to 10  how num2 ("+num2+")");
            return;
        }
    }
    public static void task2 () {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input last time (sek.)--->");
        int sec = sc.nextInt();
        System.out.println(sec/3600+" Hours left");
    }
    public static void addTask () {
        Scanner sc = new Scanner(System.in);
        System.out.print("Working hours--->");
        int hours = sc.nextInt();
        System.out.print("Salary per hour--->");
        float salary = sc.nextInt();
        if (hours <= 40){
            System.out.println("Salary = "+hours*salary);
        }
        else {
            System.out.println("Salary = " + ((40 * salary) + ((hours - 40) * 1.5 * salary)));
        }
        return;
    }
}