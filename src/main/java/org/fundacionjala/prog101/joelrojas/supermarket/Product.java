package org.fundacionjala.prog101.joelrojas.supermarket;

public class Product {
    private String name;
    private int price;
    private String category;
    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }
    public String toString() {
        return name + "     " + price;
    }

    public int getPrice() {
        return price;
    }
}
