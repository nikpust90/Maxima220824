package Lesson_5;

import java.util.Scanner;

public class work6 {
    public static void main(String[] args) {
        //6
        //
        //
        //Создать массив на 20 чисел.
        //Заполнить его числами с клавиатуры.
        //Найти максимальное и минимальное числа в массиве.
        //Вывести на экран максимальное и минимальное числа через пробел.
        int[] myArr20;
        myArr20 = new int[20];

        for (int i = 0; i < 19; i++) {
            Scanner scanner6 = new  Scanner(System.in);
            myArr20[i] = scanner6.nextInt();
        }

        int leastNumber;
        int maxNumber;


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
                leastNumber = myArr20[0];
                maxNumber = myArr20[myArr20.length - 1];
                break;
            }

        }

        System.out.println(leastNumber + " " + maxNumber);
    }
}
