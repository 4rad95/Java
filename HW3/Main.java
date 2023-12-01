import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//
//        Создайте строку через new - I study Basic Java!
//                Напишите метод, который принимает в качестве параметра строку, передайте в этот метод строку, которую создали в п.1
//        Распечатать пред-последний символ строки. Используем метод String.charAt().
//                Вырезать строку Java c помощью метода String.substring().
//                Преобразуйте строку к верхнему регистру.
//        Преобразуйте строку к нижнему регистру.

        String str = new String("I study Basic Java!");
        System.out.print("Input number first char from substring -->");
        Scanner sc = new Scanner(System.in);
        int indexFirst = sc.nextInt();
        System.out.print("Input number last char from substring -->");
        int indexLast = sc.nextInt();

        strPrint(str,indexFirst,indexLast);

//№ 2
//        Создайте методы с математическими операциями +, -, *, /
//        Каждый метод принимает два числа в параметрах и возвращает результат
//        Вызовите все методы в main
//        Результат распечатайте в консоль



        System.out.print("Input first number -->");
        float num1 = sc.nextFloat();
        System.out.print("Input second number -->");
        float num2 = sc.nextFloat();

        System.out.println("Method + -->"+addMethod(num1,num2));
        System.out.println("Method - -->"+diffMethod(num1,num2));
        System.out.println("Method * -->"+multMethod(num1,num2));
        System.out.println("Method - -->"+divMethod(num1,num2));

    }
    public static void strPrint(String str,int a, int b)
    {
            System.out.println("Etalon String ----> "+str);
            System.out.println("First Char ----> "+str.charAt(0));
            System.out.println("Last Char ----> "+str.charAt(str.length()-1));
            System.out.println("Substring ----> "+str.substring(a-1,b-1));
            System.out.println("First Char ----> "+str.toUpperCase());
            System.out.println("First Char ----> "+str.toLowerCase());

    }
    public static float addMethod (float a,float b)
    {
        return a+b;
    }
    public static float diffMethod (float a,float b)
    {
        return a-b;
    }
    public static float multMethod (float a,float b)
    {
        return a*b;
    }
    public static float divMethod (float a,float b)
    {
        return a/b;
    }

}
