package Lesson_5;

import java.util.Scanner;

public class work3 {
    public static void main(String[] args) {
        //3
        //
        //
        //1. Создать массив на 10 строк.
        //2. Создать массив на 10 чисел.
        //3. Ввести с клавиатуры 10 строк, заполнить ими массив строк.
        //4. В каждую ячейку массива чисел записать длину строки из массива строк,
        //индекс/номер ячейки которой совпадает с текущим индексом из массива чисел.
        //Для нахождения длины строки используй у конкретного слова вызов метода length()

        String[] stringsArr;
        stringsArr = new String[10];

        int[] intsArr;
        intsArr = new int[10];

        for (int i = 0; i < 9; i++) {
            Scanner scanner2 = new Scanner(System.in);
            stringsArr[i] = scanner2.nextLine();
            intsArr[i] = stringsArr[i].length();
        }
    }
}
