package Lesson_9;

public class Horse extends Animal{
    private String name;
    private String animalForm;

    public Horse(String food, String location, String naimHorse, String animalFormHorse) {
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
