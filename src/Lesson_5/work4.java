package Lesson_5;

import java.util.Scanner;

public class work4 {
    public static void main(String[] args) {
        //4
        //
        //
        //1. Создать массив на 10 чисел.
        //2. Ввести с клавиатуры 10 чисел и записать их в массив.
        //3. Вывести на экран элементы массива в обратном порядке, каждое значение выводить с новой строки.


        int[] myArr10;
        myArr10 = new int[10];
        for (int i = 0; i < 10; i++) {
            Scanner scanner3 = new Scanner(System.in);
            myArr10[i] = scanner3.nextInt();
        }
        for (int i = 9; i >= 0; i--) {
            System.out.println(myArr10[i]);
        }
    }
}
