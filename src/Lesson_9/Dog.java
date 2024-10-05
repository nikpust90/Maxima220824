package Lesson_9;

public class Dog extends Animal{
    private String name;
    private String animalForm;


    public Dog(String food, String location, String naimDog, String animalFormDog) {
        super(food, location);
        this.name = name;
        this.animalForm = animalForm;
    }

    @Override
    public void makeNoise() {
        System.out.println(name + " ");
        super.makeNoise();
    }

    @Override
    public void eat() {
        System.out.println(name + " ");
        super.eat();
    }
}
