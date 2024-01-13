package org.example;

import java.util.Arrays;
import java.util.Scanner;

import static org.example.Const.*;

public class Util {
    public static Integer[][] inputUserData() {

        Integer tempNum;
        Integer[][] userNums = new Integer[PLAYERS][USER_NUM];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < PLAYERS ; i++) {

        for (int j = 0; j < USER_NUM; j++) {

            while (true) {
                System.out.print("Input player "+ (i+1) + " and " + (j + 1) + " number (from 1 to 50) ---> ");
                tempNum = sc.nextInt();
                if (tempNum < 1 || tempNum > RANGE) {
                    System.out.println("Your number is out os range. Try again");
                } else {
                    userNums[i][j] = tempNum;
                    break;
                }

            }}
        }
        return userNums;
    }
    public static Integer[] createWinData(){

        Integer[] winNums   = new Integer[WIN_NUM];

        for (int i = 0; i < winNums.length; i++) {
            winNums[i] =  (int) ((Math.random()*(RANGE-1))+1);
        }
        return winNums;
    }

    public static Integer[] checkArrayUniq (Integer[] arr, int typeInput, int player) {

// 0    - Manual input
// else - Automatic input

        boolean checkArr = true;
        Scanner sc = new Scanner(System.in);

        while (checkArr) {
            checkArr = false;
            for (int i = 0; i < arr.length; i++) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        checkArr = true;
                        if (typeInput == 0) {
                            System.out.print("Input another number for " + player + " player --> ");
                            arr[i] = sc.nextInt();
                        } else {
                            arr[i] = (int) ((Math.random() * (RANGE - 1)) + 1);
                        }}
                }
            }
        }
        return arr;
    }
    public static Integer countWinNum(Integer[] userData, Integer[] winData) {

        Integer winsCount = 0;
        winsCount = 0 ;

        for (int i = 0; i < userData.length ; i++) {
            for (int j = 0; j < winData.length; j++) {
                if (userData[i] == winData[j]) {
                    winsCount++;
                }
            }
        }
        return winsCount;
    }

    public static void printResult (Integer[][] userNums, Integer[] winNums) {

        System.out.println("Win number " + Arrays.toString(winNums));
        for (int i = 0; i <PLAYERS ; i++) {

            System.out.println("Player " + (i+1) + " numbers " + Arrays.toString(userNums[i]));
            System.out.println("Player " + (i+1) + " Win count number " + countWinNum(userNums[i], winNums));
        }
    }
}