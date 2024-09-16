package Lesson_7;

import java.util.Scanner;

public class work_5 {
    public static void main(String[] args) {
        //5
        //
        //
        //Условие задачи:
        //Необходимо написать простой консольный калькулятор на Java.
        //
        //
        //
        //Метод int getInt() - должен считывать с консоли целое число и возвращать его
        //Метод char getOperation() - должен считывать с консоли какое-то значение и возвращать символ с операцией (+, -, * или /)
        //Метод int calc(int num1, int num2, char operation) - должен выполнять над числами num1 и num2 арифметическую операцию, заданную operation.
        //Метод main() - должен считывать 2 числа (с помощью getInt()), считать операцию (с помощью getOperation(), передать все методу calc() и вывести на экран результат.

        Scanner scanner = new Scanner(System.in);
        int number1 = getInt(scanner.nextInt());
        int number2 = getInt(scanner.nextInt());
        char operation = getOperation(scanner.next().charAt(0));
        int result = calc(number1, number2, operation);

        System.out.println(result);


    }

    public static int getInt(int number){

        return number;
    }

    public static char getOperation(char operation){

        return operation;
    }

    public static int calc(int number1, int number2, char operation){
        int result = 0;
        if (operation == '+'){
            result = number1 + number2;
        } else if (operation == '-') {
            result = number1 - number2;
        } else if (operation == '/') {
            result = number1 / number2;
        } else if (operation == '*') {
            result = number1 * number2;
        }


        return result;
    }
}
