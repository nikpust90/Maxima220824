package Lesson_5;

import java.util.Scanner;

public class work5 {
    public static void main(String[] args) {
        //5
        //
        //
        //1. Создать массив на 20 чисел.
        //2. Ввести в него значения с клавиатуры.
        //3. Создать два массива на 10 чисел каждый.
        //4. Скопировать большой массив в два маленьких: половину чисел в первый маленький, вторую половину во второй маленький.
        //5. Вывести второй маленький массив на экран, каждое значение выводить с новой строки.
        int[] myArr20;
        myArr20 = new int[20];

        int[] oneArr10;
        oneArr10 = new int[10];

        int[] twoArr10;
        twoArr10 = new int[10];

        Scanner scanner4 = new Scanner(System.in);

        for (int i = 0; i < 20; i++) {
            myArr20[i] = scanner4.nextInt();
        }
        for (int i = 0; i < 20; i++) {
            if (i < 10){
                oneArr10[i] = myArr20[i];
            } else {
                twoArr10[i - 10] = myArr20[i];
            }
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(twoArr10[i]);
        }
    }
}
