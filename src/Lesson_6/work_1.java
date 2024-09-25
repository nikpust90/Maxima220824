package Lesson_6;

import java.util.Scanner;

public class work_1 {
    public static void main(String[] args) {
        //Задача: Программа вводит строки, пока пользователь не введёт пустую строку (нажав enter).
        // Потом она конвертирует строки в верхний регистр (Мама превращается в МАМА) и выводит их на экран.
        //
        //
        //Новая задача: Программа вводит строки, пока пользователь не введёт пустую строку (нажав enter).
        //Если в строке чётное число букв, строка удваивается, если нечётное - утраивается.
        //Программа выводит слова на экран.

        Scanner scanner = new Scanner(System.in);

        while (true){
            String line  = scanner.nextLine();

            if (line.isEmpty()){
                break;
            }
            String upperCase = line.toUpperCase();
            System.out.println(upperCase);
        }
    }
}
