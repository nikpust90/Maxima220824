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

        for (int i = 0; i < 9; i++) {
            Scanner scanner1 = new Scanner(System.in);
            myArr10[i] = scanner1.nextInt();

        }

        boolean checktrue = false;
        while (true){
            checktrue = true;
            for (int i = 0; i < 9; i++) {
                if (myArr10[i] > myArr10[i + 1]) {
                    int next_number = myArr10[i];
                    myArr10[i] = myArr10[i + 1];
                    myArr10[i + 1] = next_number;
                    checktrue = false;

                }
            }
            if (checktrue == true){
                break;
            }

        }
        for (int i = 0; i < 10; i++) {
            System.out.println(myArr10[i]);
        }
    }
}
