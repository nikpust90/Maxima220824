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
        Scanner scanner6 = new  Scanner(System.in);

        for (int i = 0; i < 20; i++) {
            myArr20[i] = scanner6.nextInt();
        }

        int leastNumber = myArr20[0];
        int maxNumber = myArr20[0];

        for (int i = 1; i < 20; i++) {
            if (myArr20[i] > maxNumber) {
                maxNumber = myArr20[i];
            }
            if (myArr20[i] < leastNumber) {
                leastNumber = myArr20[i];

            }

        }


        System.out.println(leastNumber + " " + maxNumber);
    }
}
