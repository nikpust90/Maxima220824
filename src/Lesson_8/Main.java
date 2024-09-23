package Lesson_8;

public class Main {
    public static void main(String[] args) {

        Human olga = new Human("Olga", true, 75);
        Human andre = new Human("Andre", false, 76);
        Human fiona = new Human("Fiona", true, 85);
        Human petr = new Human("Petr", false, 86);

        System.out.println(olga.toString());
        System.out.println(andre.toString());
        System.out.println(fiona.toString());
        System.out.println(petr.toString());

        Human anna = new Human("Anna", true, 45, fiona, petr);
        Human igor = new Human("Igor", false, 46, olga, andre);
        Human vika = new Human("vika", true, 10, anna, igor);
        Human liza = new Human("liza", true, 11, anna, igor);
        Human kolia = new Human("kolia", false, 12, anna, igor);



        System.out.println(anna.toString());
        System.out.println(igor.toString());
        System.out.println(vika.toString());
        System.out.println(liza.toString());
        System.out.println(kolia.toString());





    }
}
