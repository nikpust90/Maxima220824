package Lesson_9;

public class Cat extends Animal{
    private String nameCat;
    private String animalFormCat;

    public Cat(String food, String location, String naimCat, String animalFormCat) {
        super(food, location);
        this.nameCat = naimCat;
        this.animalFormCat = animalFormCat;
    }

    @Override
    public void makeNoise() {
        System.out.println(nameCat + " ");
        super.makeNoise();
    }

    @Override
    public void eat() {
        System.out.println(nameCat + " ");
        super.eat();
    }
}
