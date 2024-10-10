package Lesson_11;

import java.util.LinkedList;
import java.util.Scanner;

public class work_6 {
    public static void main(String[] args) {
        //6
        //1. Создай список строк.
        //2. Добавь в него 10 строчек с клавиатуры.
        //3. Узнай, какая строка в списке встретится раньше: самая короткая или самая длинная.
        //Если таких строк несколько, то должны быть учтены самые первые из них.
        //4. Выведи на экран строку из п.3. Должна быть выведена одна строка.

        LinkedList<String> listStrings = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            listStrings.add(scanner.nextLine());
        }

        //находим самую короткую и длинную строки и  индексы
        int maxLength = listStrings.get(0).length();
        int maxIndex = 0;

        int minLength = listStrings.get(0).length();
        int minIndex = 0;

        for (int i = 1; i < listStrings.size(); i++) {
            if (maxLength < listStrings.get(i).length()){
                maxLength = listStrings.get(i).length();
                maxIndex = listStrings.indexOf(listStrings.get(i));
            }
            if (minLength > listStrings.get(i).length()){
                minLength = listStrings.get(i).length();
                minIndex = listStrings.indexOf(listStrings.get(i));
            }
        }



        //определяем ближайший индекс между мин. и максим.
        int leastIndex = Math.min(maxIndex, minIndex);

        System.out.println(listStrings.get(leastIndex));

    }
}
