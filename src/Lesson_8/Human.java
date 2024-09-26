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

    public String toString(){
        String genderStr;
        if (gender) {
            genderStr = "Женский";
        } else {
            genderStr = "Мужской";
        }

        if (mother == null || father == null){
            return String.format("Имя - %s,  пол - %s, Возраст - %d", name, genderStr, age);
        }else {
            return String.format("Имя - %s,  пол - %s, Возраст - %d, Мама - %s, Папа - %s", name, genderStr, age, mother.name, father.name);
        }




    }
}
