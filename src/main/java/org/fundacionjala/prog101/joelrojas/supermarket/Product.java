package org.fundacionjala.prog101.joelrojas.supermarket;

public class Product {
    private String name;
    private int price;
    private String category;

    public Product(String nameP, int priceP) {
        this.name = nameP;
        this.price = priceP;
    }

    public String toString() {
        return name + "     " + price;
    }

    public int getPrice() {
        return price;
    }
}
