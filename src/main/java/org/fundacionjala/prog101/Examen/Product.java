package org.fundacionjala.prog101.Examen;
import java.util.List;
import java.util.ArrayList;
public class Product {
    private String name;
    private int price;
    List<String> products = new ArrayList<String>();
    public Product(String name, int price){
        this.name = name;
        this.price = price;
        products.add(name);
    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public List<String> getProducts() {
        return products;
    }
}
