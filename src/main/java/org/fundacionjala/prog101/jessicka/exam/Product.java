package org.fundacionjala.prog101.jessicka.exam;

public class Product {
    Integer price;
    String name;
    Category category;

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

    public String toString(){
        return "[" + name + "," + price + "]";
    }
}
