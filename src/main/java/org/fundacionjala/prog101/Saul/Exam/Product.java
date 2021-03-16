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
    public void setPrice(int price) {
        this.price = price;
    }
    public int getPrice() {
        return price;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String getBrand() {
        return brand;
    }
}
