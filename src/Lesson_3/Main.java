package Lesson_3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //1 Написать программу, чтобы она:
        //- выводил на экран строку "Число меньше 5", если число, которое мы ей подадим меньше 5,
        //- выводил строку "Число больше 5", если число, которое мы ей подадим больше 5,
        //- выводил строку "Число равно 5", если число, которое мы ей подадим равен 5.
//        Scanner scanner = new Scanner(System.in);
//        int a = scanner.nextInt();
//
//        if (a < 5) {
//            System.out.println("Число меньше 5");
//        }
//
//        if (a > 5) {
//            System.out.println("Число больше 5");
//        }
//
//        if (a == 5) {
//            System.out.println("Число равно 5");
//        }


        //2 Напиши программу. которая будет проверять попало ли целое число, которое мы ей подадим
        //в интервал от 50 до 100 и сообщить результат на экран в следующем виде:
        //"Число number не содержится в интервале." или "Число number содержится в интервале.", где number - число, которое мы ей подадим.
        //Пример для числа 112:
        //Число 112 не содержится в интервале.
        //
        //
        //Пример для числа 60:
        //Число 60 содержится в интервале.

//        Scanner scanner1 = new Scanner(System.in);
//        int entered_number = scanner1.nextByte();
//        if (entered_number >= 50 && entered_number <= 100){
//            System.out.println("Число " + entered_number + " содержится В интервале.");
//        } else {
//            System.out.println("Число " + entered_number + " НЕ содержится в интервале.");
//        }


        //3 Напиши программу, которая по номеру месяца должна определить время года (зима, весна, лето, осень) и вывести на экран.

        //Пример для номера месяца 2:
        //зима
        //Пример для номера месяца 5:
        //весна

//        Scanner scanner2 = new Scanner(System.in);
//        int timeOfYear = scanner2.nextByte();
//        if (timeOfYear < 3 || timeOfYear == 12) {
//            System.out.println("Время года зима");
//        }
//        else if (timeOfYear >= 3 && timeOfYear <= 5) {
//            System.out.println("Время года весна");
//        }
//        else if (timeOfYear >= 6 && timeOfYear <= 8) {
//            System.out.println("Время года лето");
//        }
//        else if (timeOfYear >= 9 && timeOfYear <= 11) {
//            System.out.println("Время года осень");
//        }

        //4
        //Написать программу, которая будет проверять число, которое мы подадим ей.
        //Если число положительное, то увеличить его в два раза.
        //Если число отрицательное, то прибавить единицу.
        //Если введенное число равно нулю, необходимо вывести ноль.
        //Вывести результат в консоль.

//        Scanner scanner2 = new Scanner(System.in);
//        int positiveOrNegativeNumber = scanner2.nextByte();
//        if (positiveOrNegativeNumber > 0){
//            positiveOrNegativeNumber = positiveOrNegativeNumber * 2;
//        } else if (positiveOrNegativeNumber < 0) {
//            positiveOrNegativeNumber = positiveOrNegativeNumber + 1;
//        } else if (positiveOrNegativeNumber == 0) {
//            positiveOrNegativeNumber = 0;
//        }
//        System.out.println(positiveOrNegativeNumber);

        //
        //
        //6
        //Написать программу, которая, в зависимости от того числа, которое мы ей подадим (год)
        //, будет определять количество дней в году. Результат вывести на экран в следующем виде:
        //количество дней в этом году: x
        //, где
        //х - 366 для високосного года,
        //х - 365 для обычного года.
        //
        //
        //Подсказка:
        //В високосном году - 366 дней, тогда как в обычном - 365.
        //1) если год делится без остатка на 400 это високосный год;
        //2) в оставшихся годах после этого, если год делится без остатка на 100, то это обычный год;
        //3) в оставшихся годах после этого, если год делится без остатка на 4, то это високосный год;
        //4) все оставшиеся года невисокосные.
        //Так, годы 1700, 1800 и 1900 не являются високосными, так как они кратны 100 и не кратны 400.
        //Годы 1600 и 2000 - високосные, так как они кратны 100 и кратны 400.
        //Годы 2100, 2200 и 2300 - не високосные.
        //
        //
        //7
        // Объявить три переменных (a, b, c) - стороны предполагаемого треугольника.
        //Определить возможность существования треугольника по сторонам.
        //Результат вывести на экран в следующем виде:
        //"Треугольник существует." - если треугольник с такими сторонами существует.
        //"Треугольник не существует." - если треугольник с такими сторонами не существует.
        //
        //
        //Подсказка:
        //Треугольник существует только тогда, когда сумма двух его сторон больше третьей.
        //Требуется сравнить каждую сторону с суммой двух других.
        //Если хотя бы в одном случае сторона окажется больше либо равна сумме двух других,
        // то треугольника с такими сторонами не существует.

//        int a = 5;
//        int b = 5;
//        int c = 10;
//
//        if (a + b > c && a + c > b && b + c > a){
//
//            System.out.println("Треугольник существует");
//        } else {
//            System.out.println("Треугольник НЕ существует");
//        }

        //8
        // Работа светофора для пешеходов запрограммирована следующим образом:
        //в начале каждого часа в течение трех минут горит зелёный сигнал,
        //затем в течение одной минуты - жёлтый,
        //а потом в течение одной минуты - красный,
        //затем опять зелёный горит три минуты и т. д.
        //Подать программе вещественное число t, означающее время в минутах, прошедшее с начала очередного часа.
        //Определить, сигнал какого цвета горит для пешеходов в этот момент.
        //Результат вывести на экран в следующем виде:
        //"зелёный" - если горит зелёный цвет,
        //"жёлтый" - если горит жёлтый цвет,
        //"красный" - если горит красный цвет.
        //
        //
        //Пример для числа 2.5:
        //зелёный
        //
        //
        //Пример для числа 3:
        //жёлтый
        //
        //
        //Пример для числа 4:
        //красный
        //
        //
        //Пример для числа 5:
        //зелёный

        int interval_green = 3;
        int interval_red = 4;
        int interval_yellow = 5;

//        Scanner scanner2 = new Scanner(System.in);
//        double entered_number = scanner2.nextByte();
        double entered_number = 26;
        double a1 = entered_number / interval_yellow;
        if (a1 % 1 == 0){
            System.out.println("Горит Желтый");
        } else {
            //int b = a
        }

    }
}
