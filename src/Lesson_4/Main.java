package Lesson_4;

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
//
//        for (int i = 0; i < m; i++) {
//
//            String lineResult = "";
//
//            for (int i1 = 0; i1 < n; i1++) {
//
//                lineResult = lineResult + "8";
//
//            }
//
//            System.out.println(lineResult);
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




//        for (int i = 0; i < 10; i++) {
//            String lineResult = "";
//            for (int i1 = 0; i1 < i; i1++) {
//                lineResult = lineResult + "8";
//            }
//            System.out.println(lineResult);
//
//        }

//        //3
//        //
//        //
//        //Ввести с клавиатуры три числа, вывести на экран среднее из них.
//        //Т.е. не самое большое и не самое маленькое.
//        //Если все числа равны, вывести любое из них.
//
//        Scanner scanner1 = new Scanner(System.in);
//        int a = scanner1.nextInt();
//
//        int b = scanner1.nextInt();
//        int c = scanner1.nextInt();
//
//
//        int middleNumber = 0;
//        if (a > b && a < c || a < b && a > c){
//            middleNumber  = a;
//        }
//        if (b > a && b < c || b < a && b > c){
//            middleNumber  = b;
//        }
//        if (c > b && c < a || c < b && c > a){
//            middleNumber  = c;
//        }
//        if (c == b && c == a){
//            middleNumber  = c;
//        }
//
//        System.out.println(middleNumber);



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

//        int sumNumber = 0;
//        Scanner scanner = new Scanner(System.in);
//        while (true) {
//
//            int number = scanner.nextInt();
//            sumNumber = sumNumber + number;
//            if (number == -1){
//                break;
//            }
//
//        }
//        System.out.println(sumNumber);

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


        for (int x = 1; x < 11; x++) {
            int numberOne = 0;
            String ResultString = "";

            for (int i = 0; i < 10; i++) {
                numberOne = numberOne + x;
                ResultString = ResultString + numberOne + " ";
            }
            System.out.println(ResultString);

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

//        Scanner scanner = new Scanner(System.in);
//        String name = scanner.nextLine();
//
//        int d = scanner.nextInt();
//
//        int m = scanner.nextInt();
//
//        int y = scanner.nextInt();
//
//        String data = d + "." + m + "." + y;
//
//        System.out.println(String.format("Меня зовут %s. Я родился %s", name, data));

    }
}
