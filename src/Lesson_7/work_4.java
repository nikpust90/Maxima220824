package Lesson_7;

public class work_4 {
    public static void main(String[] args) {
        //4
        //
        //
        //Написать метод, который будет принимать число и степень.
        // В этом методе нужно два раза вызвать ДРУГОЙ МЕТОД, который вернет число в заданной степени.
        // А затем сложить результаты двух вызовов и вывести в консоль.
        //Норм?

        int numberOne = 5;
        int powerOne = 2;
        int numberPowerOne = pow(numberOne, powerOne);

        int numberTwo = 8;
        int powerTwo = 4;
        int numberPowerTwo = pow(numberTwo, powerTwo);

        int numberSum = numberPowerOne + numberPowerTwo;


        System.out.println(numberSum);


    }

    public static int pow(int number, int power){

        return (int) Math.pow(number, power);
    }
}
