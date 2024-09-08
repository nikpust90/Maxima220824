package Lesson_5;

import java.util.Scanner;

public class work2 {
    public static void main(String[] args) {
        //2
        //
        //
        //1.1. Создай массив на 10 чисел
        //1.2. Считай с консоли 10 чисел и заполни ими массив
        //2. Найти максимальное число из элементов массива

        int[] myArr10;
        myArr10 = new int[10];

        Scanner scanner1 = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {

            myArr10[i] = scanner1.nextInt();

        }

        int maxNumber = myArr10[0];

        for (int i = 1; i < 10; i++) {
            if (myArr10[i] > maxNumber) {
                maxNumber = myArr10[i];
            }
        }

        System.out.println(maxNumber);


//        for (int i = 0; i < 10; i++) {
//            System.out.println(myArr10[i]);
//        }
    }
}
