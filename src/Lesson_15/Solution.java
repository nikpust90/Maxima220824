package Lesson_15;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
//Создать множество чисел(Set<Integer>), занести туда 20 различных чисел.
//Удалить из множества все числа больше 10.
//
//
//Требования:
//•    Программа не должна выводить текст на экран.
//•    Программа не должна считывать значения с клавиатуры.
//•    Класс Solution должен содержать только три метода.
//•    Метод createSet() должен создавать и возвращать множество Set состоящих из 20 различных чисел.
//•    Метод removeAllNumbersGreaterThan10() должен удалять из множества все числа больше 10.
//
//
//public class Solution {
//    public static Set<Integer> createSet() {
//        // напишите тут ваш код
//
//
//    }
//
//
//    public static Set<Integer> removeAllNumbersGreaterThan10(Set<Integer> sset) {
//        // напишите тут ваш код
//
//
//    }
//
//
//    public static void main(String[] args) {
//
//
//    }
//}
public class Solution {
    public static Set<Integer> createSet() {

        Random r = new Random();
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < 20; i++) {
            set.add(r.nextInt(20));
        }
        return removeAllNumbersGreaterThan10(set);
    }

    public static Set<Integer> removeAllNumbersGreaterThan10(Set<Integer> sset) {
        sset.removeIf(n -> n > 10);

        return sset;
    }

    public static void main(String[] args) {
        Set<Integer> set = createSet();
        System.out.println(set);

    }

}
