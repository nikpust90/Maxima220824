package Lesson_14;

import java.util.HashMap;
import java.util.Map;

import static java.lang.Double.valueOf;

public class Work_5 {
    public static void main(String[] args) {
        //5
        //
        //
        //Есть коллекция Map<String, Object> (реализация HashMap), туда занесли 10 различных пар объектов.
        //Вывести содержимое коллекции на экран, каждый элемент с новой строки.
        //
        //
        //Пример вывода (тут показана только одна строка):
        //Sim - 5

        Map<String, Object> openingMap = new HashMap<String, Object>();
        openingMap.put("элемент1", 1);
        openingMap.put("элемент2", "2str");
        openingMap.put("элемент3", 3.2);
        openingMap.put("элемент4", 4);
        openingMap.put("элемент5", valueOf('%'));
        openingMap.put("элемент6", 6);
        openingMap.put("элемент7", 7);
        openingMap.put("элемент8", 8);
        openingMap.put("элемент9", 9);
        openingMap.put("элемент10", (double)10);


        for (Map.Entry<String, Object> entryOne : openingMap.entrySet()) {

            System.out.println(entryOne.getKey() + " - " + entryOne.getValue());
        }



    }
}
