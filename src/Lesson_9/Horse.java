package Lesson_9;

public class Horse extends Animal{
    private String naimHorse;
    private String animalFormHorse;

    public Horse(String food, String location, String naimHorse, String animalFormHorse) {
        super(food, location);
        this.naimHorse = naimHorse;
        this.animalFormHorse = animalFormHorse;
    }

    @Override
    void makeNoise() {
        System.out.println(naimHorse + " ");
        super.makeNoise();
    }

    @Override
    void eat() {
        System.out.println(naimHorse + " ");
        super.eat();
    }


}
