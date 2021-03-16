package org.fundacionjala.prog101.Saul.Exam;

public abstract class Product {
    private int price;
    private String name;
    private String category;
    private String brand;
    private ProductUnit productUnit;
    public Product(String name, int price, String category, String brand, String productUnit) {
        ProductUnitBuilder productUnitBuilder= new ProductUnitBuilder();
        this.name = name;
        this.price = price;
        this.category = category;
        this.brand = brand;
        this.productUnit = productUnitBuilder.getProductUnit(productUnit);
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
