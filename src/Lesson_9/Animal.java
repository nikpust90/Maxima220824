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

    public void makeNoise(){
        System.out.println(" шумит ");
    }

    public void eat(){
        System.out.println(" ест");
    }

    public void sleep(){
        System.out.println("Животное спит");
    }


}
