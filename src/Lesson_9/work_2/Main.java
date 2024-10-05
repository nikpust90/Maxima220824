package Lesson_9.work_2;

public class Main {
    public static void main(String[] args) {
        Product[] productsOne = new Product[3];
        productsOne[0] = new Product("Ботинки", 5000, "Премиум");
        productsOne[1] = new Product("Туфли", 3000, "Бюджет");
        productsOne[2] = new Product("Сапоги", 10000, "Средний");

        Product[] productsTwo = new Product[2];
        productsTwo[0] = new Product("Жакет", 5000, "Премиум");
        productsTwo[1] = new Product("Джинсы", 3000, "Бюджет");



        Category categoryShoes = new Category("Обувь", productsOne);
        Category categoryDress = new Category("Одежда", productsTwo);

        User user = new User("Пользователь1", "123", new Basket(productsOne));

    }
}
