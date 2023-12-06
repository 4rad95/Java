import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//
//        1 уровень сложности: №1
//        Введите 2 слова, воспользуйтесь сканером, состоящие из четного количества букв (проверьте количество букв в слове).
//        Нужно получить слово, состоящее из первой половины первого слова и второй половины второго слова. распечатать на консоль.
//                Например:
//        ввод - mama, papa
//        вывод - mapa

        String word = "Lenka";
        String word1 = "Ninochka";

        String vvodStr =  getWord("Input first word (ENTER - used default 'Lenka')---->");
        if (vvodStr.length()>1) {
            word = vvodStr;
            }
        vvodStr = getWord("Input second word (ENTER - used default 'Ninochka')---->");
        if (vvodStr.length()>1) {
            word1 = vvodStr;
            }
        createWord(word, word1);

//
//        Реализовать программу, выводящую на экран результаты:
//        Сложения двух чисел
//        Вычитания двух чисел
//        Умножения двух чисел
//        Деления двух чисел
//        Каждая из арифметических операций должна быть реализована как
//        два отдельных метода - один с типом void, второй - int.

        int num = getNum("Input first number ---->");
        int num1 = getNum("Input second number ---->");

        Oper arith = new Oper();

        arith.printAdd(num,num1);
        System.out.println("Summa iz methoda "+ arith.makeAdd(num,num1));

        arith.printDiff(num,num1);
        System.out.println("Difference iz methoda "+ arith.makeDiff(num,num1));

        arith.printMult(num,num1);
        System.out.println("Multiplication iz methoda "+ arith.makeMult(num,num1));

        arith.printDiv(num,num1);
        System.out.println("Division iz methoda "+ arith.makeDiv(num,num1));



    }
    public static void createWord(String word, String word1){
        String newWord =word.substring(0,word.length()/2)+word1.substring(0,word1.length()/2);
        System.out.println(newWord);
    }
    public static String getWord(String text) {
        Scanner sc = new Scanner(System.in);
        System.out.print(text);
        String vvodStr = sc.nextLine();
        return vvodStr;
    }
    public static int getNum(String text) {
        Scanner sc = new Scanner(System.in);
        System.out.print(text);
        int vvodStr = sc.nextInt();
        return vvodStr;
    }

}