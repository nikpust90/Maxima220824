package Lesson_4;

import javax.sound.sampled.SourceDataLine;
import java.lang.reflect.Array;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


       //1
        //Ввести с клавиатуры два числа m и n.
        //Используя цикл for вывести на экран прямоугольник размером m на n из восьмёрок.

        //Пример: m=2, n=4
        //8888
        //8888
//        Scanner scanner = new Scanner(System.in);
//        int m = scanner.nextInt();
//
//        Scanner scanner1 = new Scanner(System.in);
//        int n = scanner1.nextInt();
//
//        int[] MyArray;
//        MyArray = new int[]{8,8,8,8};
//
//
//        for (int i = 0; i < m; i++) {

//            String line_counter = "";

//            for (int i1 = 0; i1 < n; i1++) {

//                line_counter = line_counter + MyArray[i1];
//
//            }

//            System.out.println(line_counter);
//        }
        //2
        //Используя цикл for вывести на экран прямоугольный треугольник из восьмёрок со сторонами 10 и 10.
        //
        //
        //Пример вывода на экран:
        //8
        //88
        //888
        //8888
        //88888
        //888888
        //8888888
        //88888888
        //888888888
        //8888888888

//        int[] MyArray10;
//        MyArray10 = new int[]{8,8,8,8,8,8,8,8,8,8};
//
//
//        for (int i = 0; i < 10; i++) {
//            String line_counter = "";
//            for (int i1 = 0; i1 < i; i1++) {
//                line_counter = line_counter + MyArray10[i1];
//            }
//            System.out.println(line_counter);
//
//        }

        //3
        //
        //
        //Ввести с клавиатуры три числа, вывести на экран среднее из них.
        //Т.е. не самое большое и не самое маленькое.
        //Если все числа равны, вывести любое из них.

//        Scanner scanner = new Scanner(System.in);
//        int a = scanner.nextInt();
//
//        Scanner scanner1 = new Scanner(System.in);
//        int b = scanner1.nextInt();
//
//        Scanner scanner2 = new Scanner(System.in);
//        int c = scanner2.nextInt();
//
//
//        int line_counter = 0;
//        if (a > b && a < c || a < b && a > c){
//            line_counter = a;
//        }
//        if (b > a && b < c || b < a && b > c){
//            line_counter = b;
//        }
//        if (c > b && c < a || c < b && c > a){
//            line_counter = c;
//        }
//        if (c == b && c == a){
//            line_counter = c;
//        }
//
//        System.out.println(line_counter);



        //4
        //Вводить с клавиатуры числа.
        //Если пользователь ввел -1, вывести на экран сумму всех введенных чисел и завершить программу.
        //-1 должно учитываться в сумме.
        //
        //
        //Подсказка: один из вариантов решения этой задачи, использовать конструкцию:
        //
        //
        //while (true) {
        //    int number = считываем число;
        //    if (проверяем, что number -1)
        //        break;
        //}

//        int counter_number = 0;
//        while (true) {
//            Scanner scanner = new Scanner(System.in);
//            int number = scanner.nextInt();
//            if (number == -1){
//                counter_number = counter_number + number;
//                break;
//            }else {
//                counter_number = counter_number + number;
//            }
//
//        }
//        System.out.println(counter_number);

        //5
        //Вывести на экран таблицу умножения 10х10 используя цикл while.
        //Числа разделить пробелом.
        //
        //
        //Пример вывода на экран:
        //1 2 3 4 5 6 7 8 9 10
        //2 4 6 8 10 12 14 16 18 20
        //3 6 9 12 15 18 21 24 27 30
        //4 8 12 16 20 24 28 32 36 40
        //5 10 15 20 25 30 35 40 45 50
        //6 12 18 24 30 36 42 48 54 60
        //7 14 21 28 35 42 49 56 63 70
        //8 16 24 32 40 48 56 64 72 80
        //9 18 27 36 45 54 63 72 81 90
        //10 20 30 40 50 60 70 80 90 100
        int counter_number = 0;
        int[]  Arr10;
        Arr10 = new  int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int counter_number1 = 0;


        int numberOne = 0;
        int numbertwo = 0;
        while (numberOne < 10) {
            String line_counter = "";

            while (numbertwo < 10) {

                line_counter = line_counter + Arr10[counter_number1] + " ";
                counter_number1 = counter_number1 + 1;
                numbertwo = numbertwo + 1;


            }
            System.out.println(line_counter);
        }



        //6
        //Ввести с клавиатуры строку name.
        //Ввести с клавиатуры дату рождения (три числа): y, m, d.
        //
        //
        //Вывести на экран текст:
        //"Меня зовут name.
        //Я родился d.m.y"
        //
        //
        //Пример вывода:
        //Меня зовут Вася.
        //Я родился 15.2.1988

    }
}
