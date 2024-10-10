package Lesson_11;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Work_7 {
    public static void main(String[] args) {
        //7
        //
        //
        //1. Введи с клавиатуры 20 чисел, сохрани их в список и рассортируй по трём другим спискам:
        //Число нацело делится на 3 (x%3==0), нацело делится на 2 (x%2==0) и все остальные.
        //Числа, которые делятся на 3 и на 2 одновременно, например 6, попадают в оба списка.
        //Порядок объявления списков очень важен.
        //1.1 Создай метод printList
        //2. Метод printList должен выводить на экран все элементы списка с новой строки.
        //3. Используя метод printList выведи эти три списка на экран.
        //Сначала тот, который для x%3, потом тот, который для x%2, потом последний.

        LinkedList<Integer> listDivisionOnTrm = new LinkedList<>();
        LinkedList<Integer> listDivisionOnTwo = new LinkedList<>();
        LinkedList<Integer> listDivisionRest = new LinkedList<>();

        Scanner scanner = new Scanner(System.in);
        int number;
        for (int i = 0; i < 20; i++){
            number = scanner.nextInt();

            if (number%3 == 0){
                listDivisionOnTrm.add(number);
            }
            if (number%2==0){
                listDivisionOnTwo.add(number);
            }

            if (number%3 != 0 && number%2 != 0){
                listDivisionRest.add(number);
            }

        }
        printList(listDivisionOnTrm);
        printList(listDivisionOnTwo);
        printList(listDivisionRest);
    }

    public static void printList(List<Integer> list){
        for (Object elem: list){
            System.out.println(elem);
        }
    }


}
