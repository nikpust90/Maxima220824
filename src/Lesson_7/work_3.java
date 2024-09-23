package Lesson_7;

public class work_3 {
    public static void main(String[] args) {
        //3
        //
        //
        //Необходимо написать метод, который бы возвращал из 2 чисел меньшее число.
        // Например, из двух чисел 7 и 3 метод должен вывести в консоль 3.

        int numberOne = 8;
        int numberTwo = 4;
        int numberMin = numberMin(numberOne, numberTwo);

        System.out.println(numberMin);
    }

    public static int numberMin(int numberOne, int numberTwo){
        return Math.min(numberOne, numberTwo);
    }
}
