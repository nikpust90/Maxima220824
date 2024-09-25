package Lesson_8;

public class Human {
    String name;
    boolean gender;
    int age;
    Human mother;
    Human father;

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
        if (mother == null || father == null){
            if (gender) {
                return "Имя - " + name + " пол - Женский"  + " Возраст " + age;
            }else {
                return "Имя - " + name + " пол - Мужской"  + " Возраст " + age;
            }
        }else {
            if (gender) {
                return "Имя - " + name + " пол - Женский" + " Возраст " + age + " Мама - " + mother.name + " Папа - " + father.name;
            }else {
                return "Имя - " + name + " пол - Мужской" + " Возраст " + age + " Мама - " + mother.name + " Папа - " + father.name;
            }


        }

    }
}
