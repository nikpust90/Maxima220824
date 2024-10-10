package Lesson_11;

import java.util.LinkedList;
import java.util.Scanner;

public class work_5 {
    public static void main(String[] args) {
        //5
        //1. Создай список строк.
        //2. Добавь в него 5 строк с клавиатуры.
        //3. Выполни 13 раз: удалить последнюю строку и вставить её в начало.
        //4. Используя цикл выведи содержимое результирующего списка на экран, каждое значение с новой строки.

        LinkedList<String> listStrings = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            listStrings.add(scanner.nextLine());

        }
        String lastStr;
        for (int i = 0; i < 13; i++) {
            lastStr = listStrings.pollLast();
            listStrings.addFirst(lastStr);
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(listStrings.get(i));

        }
    }
}
