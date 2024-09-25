package Lesson_6;

import java.util.Scanner;

public class work_3 {
    public static void main(String[] args) {
        //3
        //
        //
        //1. Создать массив на 10 строк.
        //2. Ввести с клавиатуры 8 строк и сохранить их в массив.
        //3. Вывести содержимое всего массива (10 элементов) на экран в обратном порядке. Каждый элемент - с новой строки.

        String[] stringsArr;
        stringsArr = new String[10];


        Scanner scanner = new Scanner(System.in);


        for (int i = 0; i < 10; i++) {

            stringsArr[i]  = scanner.nextLine();

        }

        for (int i = 9; i >= 0; i--) {
            System.out.println(stringsArr[i]);
        }

    }
}
