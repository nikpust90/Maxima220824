package Lesson_5;

import java.util.Scanner;

public class work7 {
    public static void main(String[] args) {
        //7
        //
        //
        //Задача: Написать программу, которая вводит с клавиатуры 20 чисел и выводит их в убывающем порядке.
        int[] myArr20;
        myArr20 = new int[20];

        for (int i = 0; i < 19; i++) {
            Scanner scanner6 = new  Scanner(System.in);
            myArr20[i] = scanner6.nextInt();
        }

        while (true){
            boolean checkTrue = true;
            for (int i = 0; i < 19; i++) {
                if (myArr20[i] > myArr20[i + 1]){
                    int changeNumber = myArr20[i+1];
                    myArr20[i+1] = myArr20[i];
                    myArr20[i] = changeNumber;
                    checkTrue = false;
                }
            }
            if (checkTrue == true) {
                break;
            }

        }

        for (int i = 19; i >= 0; i--){
            System.out.println(myArr20[i]);
        }
    }
}
