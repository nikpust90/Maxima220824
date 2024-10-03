package Lesson_9;

public class Main {
    public static void main(String[] args) {
        Animal[] animal = new Animal[3];
        animal[0] = new Dog("Кость", "Север", "Шарик", "Собака");
        animal[1] = new Cat("Рыба", "Юг", "Барсик", "Кот");
        animal[2] = new Horse("Сено", "Центр", "Любимчик", "Лошадь");

        for (int i = 0; i < 3; i++) {

            new Veterinarian().treatAnimal(animal[i]);

        }


    }


}
