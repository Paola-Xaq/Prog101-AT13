package org.fundacionjala.prog101.jessicka.exam;

public class Product {
    private Integer price;
    private String name;
    private Category category;

    Product(String name, Integer price) {
        this.name = name;
        this.price = price;
    }

    public Integer getPrice() {
        return this.price;
    }

    public String getName() {
        return this.name;
    }
}
