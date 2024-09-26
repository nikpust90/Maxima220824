package Lesson_8;

public class Human {
    private String name;
    private boolean gender;
    private int age;
    private Human mother;
    private Human father;

    public Human(String name, boolean gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public Human(String name, boolean gender, int age, Human mother, Human father) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.mother = mother;
        this.father = father;
    }

    public String getName() {
        return name;
    }

    public String toString(){
        String genderStr = gender ?"Женский":"Мужской";

        String motherName = mother == null ?"Неопределено":mother.getName();
        String fatherName = father == null ?"Неопределено":father.getName();

        return String.format("Имя - %s,  пол - %s, Возраст - %d, Мама - %s, Папа - %s", name, genderStr, age, motherName, fatherName);

    }
}
