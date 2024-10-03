package Lesson_9;

public class Veterinarian {
    public void treatAnimal(Animal animal){
        System.out.println(String.format("Корм - %s, Локация - %s", animal.getFood(), animal.getLocation()));


    }
}
