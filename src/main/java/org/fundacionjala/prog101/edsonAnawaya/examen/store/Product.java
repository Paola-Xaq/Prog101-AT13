package org.fundacionjala.prog101.edsonAnawaya.examen.store;

public class Product {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    private int price;

    public Product(final String newName, final int newPrice) {
        this.name = newName;
        this.price = newPrice;
    }
}
