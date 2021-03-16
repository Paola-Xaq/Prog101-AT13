package org.fundacionjala.prog101.ExercicesJP.examenJP;

public class Product {
    private String name;
    private int price;
    private String type;
    private Category category;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public Product(String name, int price, String type) {
        this.name = name;
        this.price = price;
        this.type = type;
    }

    public Product(String name, int price, String type, Category category) {
        this.name = name;
        this.price = price;
        this.type = type;
        this.category = category;
    }


    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public String getType() { return type; }

    public Category getCategory() { return category; }

    @Override
    public String toString() {
        return "Producto{" +
                " nombre='" + name +
                ", precio=" + price +
                ", type=" + type +
                ", category=" + category +
                '}';
    }

}
