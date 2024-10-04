package Lesson_9;

public class Cat extends Animal{
    private String name;
    private String animalForm;

    public Cat(String food, String location, String naimCat, String animalFormCat) {
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
