package Lesson_9;

public class Animal {
     private String food;
     private String location;

    public String getFood() {
        return food;
    }

    public String getLocation() {
        return location;
    }

    public Animal(String food, String location) {
        this.food = food;
        this.location = location;
    }

    void makeNoise(){
        System.out.println(" шумит ");
    }

    void eat(){
        System.out.println(" ест");
    }

    void sleep(){
        System.out.println("Животное спит");
    }


}
