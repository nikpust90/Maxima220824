package Lesson_9.work_3;

public class Person {
    private String fullNaim;
    private int age;

    public Person() {
    }

    public Person(String fullNaim, int age) {
        this.fullNaim = fullNaim;
        this.age = age;
    }

    void move(){
        System.out.println(String.format("%s идет",
                fullNaim));
    }

    void talk(){
        System.out.println(String.format("%s говорит",
                fullNaim));
    }
}
