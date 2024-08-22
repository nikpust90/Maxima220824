package Lesson_2;

public class Main {
    public static void main(String[] args) {
        //Задача 1. Дано: Хитрый бухгалтер разделил 5 рублей на 2 кассы. Сколько рублей лежит в каждой кассе?
        //Вывести на косоль//////////////
        int a = 5;
        int a1 = 2;
        //double b = (a / a1);
        double b = ((double)a / (double)a1);
        System.out.println(b);

        //Задача 2. Дано: Стороны квадрата a = 50, b = 20. Найти площадь.
        //Вывести на косоль

        int a2 = 50;
        int b2 = 20;
        int c2 = a2 * b2;
        System.out.println(c2);

        //
        //
        //Задача 3. Дано: Голодный Вася съедает за 9 минут 3 банана, а сытый за 15 минут,
        // насколько быстрее голодный Вася съедает один банан?
        //Вывести на косоль

        int time_hungry = 9;
        int time_wellFed = 15;
        int banana = 3;
        int result_hungry = time_hungry / banana;
        int result_wellFed = time_wellFed / banana;
        double total = (double)result_wellFed / (double)result_hungry;
        System.out.println(total);
    }
}
