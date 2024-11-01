package Lesson_14;

import java.util.HashMap;
import java.util.Map;

public class Work_1 {
    public static void main(String[] args) {
        //1
        //
        //
        //1. Создать словарь Map (<String, String>) и добавить туда 10 человек в виде "Фамилия"-"Имя".
        //2. Пусть среди этих 10 человек есть люди с одинаковыми именами.
        //3. Пусть среди этих 10 человек есть люди с одинаковыми фамилиями.
        //4. Вывести содержимое Map на экран.

        Map<String, String> map = new HashMap<>();
        map.put("Иванов", "Иван");
        map.put("Петров", "Петр");
        map.put("Сидоров", "Сидор");
        map.put("Иванов", "Иван");
        map.put("Петров", "Петр");
        map.put("Сидоров", "Сидор");
        map.put("Иванов", "Иван");
        map.put("Петров", "Петр");
        map.put("Сидоров", "Сидор");

        for (String key : map.keySet()) {
            System.out.println(key + " : " + map.get(key));
        }
    }
}
