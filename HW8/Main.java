package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        Создайте массив из 8 случайных целых чисел из интервала [1;50]
//        Выведите массив на консоль в строку.
//        Замените каждый элемент с нечетным индексом на ноль.
//        Снова выведете массив на консоль в отдельной строке.

        task1();

//        Создайте массив из 5 случайных целых чисел из интервала [10;99]
//        Выведите его на консоль в строку.
//        Определите и выведите на экран сообщение о том, является ли массив строго возрастающей последовательностью.

        task2();

//        Дан массив размера  N-1  , содержащий только различные целые числа в диапазоне от  1 до N . Найдите недостающий элемент.
//                Пример 1:
//        Вход:
//        N = 5
//        А[] = {1,2,3,5}
//        Выход: 4

        task3();
    }

    public static void task1() {
        Integer[] arr = createArray(8, 1, 50);

        outputArray(arr, 1);
        for (int i = 0; i < arr.length; i = i + 2) {
            arr[i] = 0;
        }
        outputArray(arr, 1);
    }

    public static void task2() {

        Integer[] arr = createArray(5, 10, 99);
        outputArray(arr, 2);
        System.out.println("Массив возростающий - " + chekArray(arr));

    }

    public static Integer[] createArray(int length, int startNum, int endNum) {

        Integer[] arr = new Integer[length];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) ((Math.random() * (endNum - startNum)) + startNum);
        }
        return arr;
    }

    public static void outputArray(Integer[] arr, int task) {

        System.out.println(" Задание №" + task + ". Наш массив : " + Arrays.toString(arr));
        System.out.println("-----------------------------------------------");
    }

    public static boolean chekArray(Integer[] arr) {

        boolean check = true;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                check = false;
            }
        }
        return check;
    }

    public static void task3() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите размер массива -->");
        Integer size = sc.nextInt();

        Integer[] arr = new Integer[size - 1];

        for (int i = 0; i < arr.length; i++) {
            System.out.print(i + " елемент массива -->");
            arr[i] = sc.nextInt();
        }

        System.out.println(" Отсутствует число - " + findAbsend(arr));
    }

    public static Integer findMinimal(Integer[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static Integer findAbsend(Integer[] arr) {

        int min = findMinimal(arr);

        for (int i = min; i < min + arr.length - 1; i++) {
            if (!checkNumber(i, arr)) {
                return i;
            }
        }
        return arr[arr.length-1]+1;
    }


    public static boolean checkNumber(int num, Integer[] arr){
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i] == num ) {
                return true;
            }
        }
        return false;
    }
}