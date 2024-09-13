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

        Scanner scanner = new Scanner(System.in);
        String shortString = "";
        String longString = "";
        int lengthLineMin = 1;
        int lengthLineMax = 1;

        for (int i = 0; i < 5; i++) {

            String line  = scanner.nextLine();
            if (line.length() > lengthLineMax){
                lengthLineMax = line.length();
                longString = line;
            }
            if (line.length() <= lengthLineMin){
                lengthLineMin = line.length();
                shortString = line;
            }
        }
        System.out.println(shortString  + " " + lengthLineMin);
        System.out.println(longString  + " " + lengthLineMax);
    }
}
