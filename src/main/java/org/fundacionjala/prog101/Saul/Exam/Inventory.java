package org.fundacionjala.prog101.Saul.Exam;

import jdk.jfr.Category;

import java.util.ArrayList;

public final class Inventory {
    private ArrayList<Product> inventory = new ArrayList<>();
    public Inventory() {
    }
    public void addProduct(Product product) {
        inventory.add(product);
    }
    public Product getProduct(String productName) {
        for (Product product : inventory) {
            if (product.getName().equals(productName)) {
                return product;
            }
        }
        return null;
    }
}
