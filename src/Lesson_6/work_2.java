package Lesson_6;

import java.util.Scanner;

public class work_2 {
    public static void main(String[] args) {
        //Ввести 5 строк с консоли, найти самую короткую и самую длинную строки. Вывести найденные строки и их длину.

        Scanner scanner = new Scanner(System.in);
        String shortString = "";
        String longString = "";
        int lengthLineMin = 1;
        int lengthLineMax = 1;

        for (int i = 0; i < 5; i++) {

            String line  = scanner.nextLine();
            if (line.length() > lengthLineMax){
                lengthLineMax = line.length();
                longString = line;
            }
            if (line.length() <= lengthLineMin){
                lengthLineMin = line.length();
                shortString = line;
            }
        }
        System.out.println(shortString  + " " + lengthLineMin);
        System.out.println(longString  + " " + lengthLineMax);
    }
}
