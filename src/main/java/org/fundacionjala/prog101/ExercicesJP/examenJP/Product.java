package org.fundacionjala.prog101.ExercicesJP.examenJP;

public class Product {
    private String name;
    private int price;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
    @Override
    public String toString() {
        return "Producto{" +
                " nombre='" + name +
                ", precio=" + price +
                '}';
    }

}
