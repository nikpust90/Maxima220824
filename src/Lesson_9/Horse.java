package Lesson_9;

public class Horse extends Animal{
    private String nameHorse;
    private String animalFormHorse;

    public Horse(String food, String location, String naimHorse, String animalFormHorse) {
        super(food, location);
        this.nameHorse = naimHorse;
        this.animalFormHorse = animalFormHorse;
    }

    @Override
    public void makeNoise() {
        System.out.println(nameHorse + " ");
        super.makeNoise();
    }

    @Override
    public void eat() {
        System.out.println(nameHorse + " ");
        super.eat();
    }


}
