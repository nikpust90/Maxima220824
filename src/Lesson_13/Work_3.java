package Lesson_13;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

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

        ArrayList<String> strings = new ArrayList<String>();
        strings.add("роза");
        strings.add("лоза");
        strings.add("лира");
        strings = fix(strings);


        for (String string : strings) {
            System.out.println(string);
        }


    }



    public static ArrayList<String> fix(ArrayList<String> strings) {
        //напишите тут ваш код

        //находим все слова с буквой "л" и добавляем их в результирующий список
        List<String> resultList = strings.stream()
                .filter(s -> s.startsWith("л"))
                .toList();

        //добавляем все элементы списка  resultList в список strings
        for (int i = 0; i < resultList.size(); i++) {
            strings.add(resultList.get(i));

        }

        //удаляем элементы по условию
        strings.removeIf(element -> element.contains("р") && !element.contains("л")); //2.1

        return strings;
    }


}
