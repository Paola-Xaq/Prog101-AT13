package org.fundacionjala.prog101.Saul.Exam;

public abstract class Product {
    private int price;
    private String name;
    private String typeOfProduct;
    private String brand;
    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }
    public int getPrice() {
        return price;
    }
}
