package Lesson_9;

public class Dog extends Animal{
    private String nameDog;
    private String animalFormDog;


    public Dog(String food, String location, String naimDog, String animalFormDog) {
        super(food, location);
        this.nameDog = nameDog;
        this.animalFormDog = animalFormDog;
    }

    @Override
    public void makeNoise() {
        System.out.println(nameDog + " ");
        super.makeNoise();
    }

    @Override
    public void eat() {
        System.out.println(nameDog + " ");
        super.eat();
    }
}
