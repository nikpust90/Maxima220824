package Lesson_10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class work_3 {
    public static void main(String[] args) {
        //3
        //1. Создай список строк.
        //2. Считай с клавиатуры 5 строк и добавь в список.
        //3. Используя цикл, найди самую короткую строку в списке.
        //4. Выведи найденную строку на экран.
        //5. Если таких строк несколько, выведи каждую с новой строки.

        List<String> listStrings = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            listStrings.add(scanner.nextLine());

        }

        int minLength = listStrings.get(0).length();
        for (int i = 1; i < listStrings.size(); i++) {
            if (minLength > listStrings.get(i).length()){
                minLength = listStrings.get(i).length();
            }
        }
        for (int i = 0; i < listStrings.size(); i++) {
            if (minLength == listStrings.get(i).length()){
                System.out.println(listStrings.get(i));
            }

        }


    }



}
