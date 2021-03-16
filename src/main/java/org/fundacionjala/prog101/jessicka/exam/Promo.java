package org.fundacionjala.prog101.jessicka.exam;

public class Promo {
    Integer percentageDiscount;
    Integer price;
    private static final int PERCENTAGE_100 = 100;

    public Promo(Integer price, Integer percentageDiscount) {
        this.percentageDiscount = percentageDiscount;
        this.price = price;
    }
    public int setPromo() {
        return (this.price * this.percentageDiscount) / PERCENTAGE_100;
    }

    public int getPercentageDiscount() {
        return this.percentageDiscount;
    }
}
