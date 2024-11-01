package Lesson_14;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Work_3 {
    public static void main(String[] args) {
        //3
        //
        //
        //Задача: Программа определяет, какая семья (фамилию) живёт в доме с указанным номером.
        //Новая задача: Программа должна работать не с номерами домов, а с городами:
        //
        //
        //Пример ввода:
        //Москва
        //Ивановы
        //Киев
        //Петровы
        //Лондон
        //Абрамовичи
        //
        //
        //Лондон
        //
        //
        //Пример вывода:
        //Абрамовичи

        Map<String, String> map = new HashMap<>();
        map.put("Москва", "Ивановы");
        map.put("Киев", "Петровы");
        map.put("Лондон", "Абрамовичи");

        Scanner scanner = new Scanner(System.in);
        String city = scanner.nextLine();
        if (map.containsKey(city)) {
            System.out.println(map.get(city));
        } else{
            System.out.println("Такого города нет");
        }
    }

}
