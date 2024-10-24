package Lesson_12;

import java.util.HashSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {


        Coin coin1 = new Coin(10, 1.5, "RUS", 2004);
        Coin coin2 = new Coin(20, 2.2, "USA", 2007);
        Coin coin3 = new Coin(7, 1.6, "UK", 1999);
        Coin coin4 = new Coin(20, 2.2, "AN", 2007);
        Coin coin5 = new Coin(7, 1.6, "BL", 1999);


        //HashSet<Coin> coins = new HashSet<>();
        //ReverseIntegers reverseInteger = new ReverseIntegers();
        TreeSet<Coin> coins = new TreeSet<>();
        coins.add(coin1);
        coins.add(coin2);
        coins.add(coin3);
        coins.add(coin4);
        coins.add(coin5);







    }
}
