package Lesson_6;

import java.util.Scanner;

public class work_4 {
    public static void main(String[] args) {
        //4
        //
        //
        //1. Создать массив на 10 строк.
        //2. Создать массив на 10 чисел.
        //3. Ввести с клавиатуры 10 строк, заполнить ими массив строк.
        //4. В каждую ячейку массива чисел записать длину строки из массива строк, индекс/номер ячейки
        // которой совпадает с текущим индексом из массива чисел.

        String[] stringsArr;
        stringsArr = new String[10];

        int[] intArr;
        intArr = new int[10];


        Scanner scanner = new Scanner(System.in);


        for (int i = 0; i < 10; i++) {

            stringsArr[i]  = scanner.nextLine();
            intArr[i]  = stringsArr[i].length();

        }



    }
}
