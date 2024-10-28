package Lesson_14;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.*;

public class Work_2 {
    public static void main(String[] args) {
        //2
        //
        //
        //Программа вводит с клавиатуры имя месяца и выводит его номер на экран в виде: "May is the 5 month".
        //Используй коллекции.

        Map<String, Integer> months = new HashMap<>();
        months.put("January", 1);
        months.put("February", 2);
        months.put("March", 3);
        months.put("April", 4);
        months.put("May", 5);
        months.put("June", 6);
        months.put("July", 7);
        months.put("August", 8);
        months.put("September", 9);
        months.put("October", 10);
        months.put("November", 11);
        months.put("December", 12);

        Scanner scanner = new Scanner(System.in);
        String month = scanner.nextLine();

        Integer numberMonth = months.get(month);
        if (numberMonth == null) {
            System.out.println("Invalid month");
        } else {
            System.out.println(month + " is the " + numberMonth + " month");
        }



    }
}
