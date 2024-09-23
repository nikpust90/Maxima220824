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
        boolean resetFirstElement = false;
        for (int i = 0; i < 6; i++) {

            if (stringsArr[i] == null) {
                continue;
            }
            for (int j = i + 1; j < 6; j++) {
                if (stringsArr[i].equals(stringsArr[j])) {
                    stringsArr[j] = null;
                    resetFirstElement = true;
                }
            }
            if (resetFirstElement){
                stringsArr[i] = null;
                resetFirstElement = false;
            }

        }

        

    }
}
