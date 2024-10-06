package Lesson_10;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //1
        //
        //
        //1. Создай список строк.
        //2. Добавь в него 5 различных строк.
        //3. Выведи его размер на экран.
        //4. Используя цикл выведи его содержимое на экран, каждое значение с новой строки.

        List<String> listStrings = new ArrayList<>();
        listStrings.add("SrtOne");
        listStrings.add("StrTwo");
        listStrings.add("Strthree");
        listStrings.add("StrFour");
        listStrings.add("StrFive");

        System.out.println(listStrings.size());

        for (int i = 0; i < listStrings.size(); i++) {
            System.out.println(listStrings.get(i));

        }




    }
}
