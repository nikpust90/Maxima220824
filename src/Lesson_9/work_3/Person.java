package Lesson_9.work_3;

public class Person {
    private String fullName;
    private int age;

    public Person() {
    }

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public void move(){
        String fullNameTrue = fullName == null ?"Person":fullName;
        System.out.println(String.format("%s идет",
                fullNameTrue));
    }

    public void talk(){
        String fullNameTrue = fullName == null ?"Person":fullName;
        System.out.println(String.format("%s говорит",
                fullNameTrue));
    }
}
