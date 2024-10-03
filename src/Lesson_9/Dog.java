package Lesson_9;

public class Dog extends Animal{
    private String naimDog;
    private String animalFormDog;


    public Dog(String food, String location, String naimDog, String animalFormDog) {
        super(food, location);
        this.naimDog = naimDog;
        this.animalFormDog = animalFormDog;
    }

    @Override
    void makeNoise() {
        System.out.println(naimDog + " ");
        super.makeNoise();
    }

    @Override
    void eat() {
        System.out.println(naimDog + " ");
        super.eat();
    }
}
