package org.fundacionjala.prog101.Examen;

public class Product {
    private String name;
    private int price;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public String getInfoProduct() {
        return name + " " + "--" + " " + price;
    }

}
