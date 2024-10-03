package Lesson_9;

public class Cat extends Animal{
    private String naimCat;
    private String animalFormCat;

    public Cat(String food, String location, String naimCat, String animalFormCat) {
        super(food, location);
        this.naimCat = naimCat;
        this.animalFormCat = animalFormCat;
    }

    @Override
    void makeNoise() {
        System.out.println(naimCat + " ");
        super.makeNoise();
    }

    @Override
    void eat() {
        System.out.println(naimCat + " ");
        super.eat();
    }
}
