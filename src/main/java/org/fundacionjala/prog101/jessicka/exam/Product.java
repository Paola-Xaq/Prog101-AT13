package org.fundacionjala.prog101.jessicka.exam;

public class Product {
    private Integer price;
    private String name;
    private Integer quantity;
    private Category category;

    Product(String name, Integer price, Integer quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public Integer getPrice() {
        return this.price;
    }

    public String getName() {
        return this.name;
    }

    public Integer getQuantity() {
        return this.quantity;
    }

    public Integer getPriceQuantity() {
        return this.price * this.quantity;
    }
}
