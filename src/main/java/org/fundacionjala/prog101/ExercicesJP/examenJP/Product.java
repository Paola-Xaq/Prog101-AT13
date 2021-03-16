package org.fundacionjala.prog101.ExercicesJP.examenJP;

public class Product {
    private String name;
    private int price;
    private String type;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public Product(String name, int price, String type) {
        this.name = name;
        this.price = price;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public String getType() { return type; }

    @Override
    public String toString() {
        return "Producto{" +
                " nombre='" + name +
                ", precio=" + price +
                ", type=" + type +
                '}';
    }

}
