package Lesson_12;

import org.jetbrains.annotations.NotNull;

import java.util.Objects;

public class Coin implements Comparable<Coin>{
    private Integer nominal;
    private  Double diameter;
    private  String country;
    private Integer price;

    public Coin(Integer nominal, Double diameter, String country, Integer price) {
        this.nominal = nominal;
        this.diameter = diameter;
        this.country = country;
        this.price = price;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Coin coin = (Coin) o;
        return Objects.equals(nominal, coin.nominal) && Objects.equals(diameter, coin.diameter) && Objects.equals(country, coin.country) && Objects.equals(price, coin.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nominal, diameter, country, price);
    }

    public int compareTo(Coin coin) {
        if (!this.price.equals(coin.price)) {
            return this.price - coin.price;

        }
        if (this.price.equals(coin.price) && !this.nominal.equals(coin.nominal) && !this.country.equals(coin.country)) {
            return this.nominal - coin.nominal;

        }
        if (this.price.equals(coin.price) && this.nominal.equals(coin.nominal) && !this.country.equals(coin.country)) {
            return this.country.length() - coin.country.length();

        }
        if (this.price.equals(coin.price) && this.nominal.equals(coin.nominal) && this.country.equals(coin.country)) {
            return (int) (this.diameter - coin.diameter);

        }
        return 0;
    }


}
