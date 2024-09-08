package Lesson_5;

import java.util.Scanner;

public class one {
    public static void main(String[] args) {
        //1
        //
        //
        //1. Создать массив на 10 строк.
        //2. Ввести с клавиатуры 8 строк и сохранить их в массив. Для считывания строк используй у сканера метод nextLine()
        //3. Вывести содержимое всего массива (10 элементов) на экран в обратном порядке. Каждый элемент - с новой строки.

        String[] myArray;
        myArray = new String[10];
        Scanner scanner1 = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {

            myArray[i] = scanner1.nextLine();

        }

        for (int i = 9; i >= 0; i--) {
            System.out.println(myArray[i]);

        }

    }
}
