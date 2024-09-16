package Lesson_6;

import java.util.Scanner;

public class work_5 {
    public static void main(String[] args) {
        //5
        //
        //
        //1. Считать 6 строк и заполнить ими массив strings.
        //2. Удалить повторяющиеся строки из массива strings, заменив их на null (null должны быть не строками "null").

        String[] stringsArr;
        stringsArr = new String[6];

        Scanner scanner = new Scanner(System.in);


        for (int i = 0; i < 6; i++) {

            stringsArr[i]  = scanner.nextLine();

        }

        for (int i = 0; i < 6; i++) {
            if (stringsArr[i] != null) {
                for (int j = i; j < 5; j++) {
                    if (stringsArr[i].equals(stringsArr[j + 1])) {
                        stringsArr[j + 1] = null;
                    }
                }
            }
        }

        

    }
}
