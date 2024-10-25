package Lesson_13;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Work_3{
    public static void main(String[] args) {
        //3
        //
        //
        //1. Создай список слов, заполни его самостоятельно.
        //2. Метод fix должен:
        //2.1. удалять из списка строк все слова, содержащие букву "р"
        //2.2. удваивать все слова содержащие букву "л".
        //2.3. если слово содержит и букву "р" и букву "л", то оставить это слово без изменений.
        //2.4. с другими словами ничего не делать.
        //
        //

        List<String> strings = new ArrayList<String>();
        strings.add("роза");
        strings.add("лоза");
        strings.add("лира");
        strings = fix(strings);

        for (String string : strings) {
            System.out.println(string);
        }
    }

    public static List<String> fix(List<String> strings) {
        //напишите тут ваш код
        //создаем потоки
        Stream<String> OneStream = strings.stream();

        List<String> oneList = strings.stream()
                .filter(s -> s.startsWith("л"))
                .toList();
        Stream<String> TwoStream = oneList.stream();

        //объединяем два потока
        Stream<String> resultStream = Stream.concat(OneStream, TwoStream);
        //сохраняем результат в список
        List<String> resultList1 = new ArrayList<>(resultStream.toList());
        //удаляем по условию
        List<String> removeList = resultList1.stream()
                .filter(s ->  s.contains("р")  && !s.contains("л"))
                .toList();
        resultList1.removeAll(removeList);




        return resultList1;
    }


}
