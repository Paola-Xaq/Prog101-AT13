package org.fundacionjala.prog101.edsonAnawaya.examen.store;

import java.util.ArrayList;
import java.util.List;

public class Invoice {
    private List<Product> productsObjects;

    public Invoice() {
        productsObjects = new ArrayList<>();
    }

    public void addProduct(Product product) {
        productsObjects.add(product);
    }

    public int getTotalCost() {
        int sum = 0;
        for (Product product : productsObjects) {
            sum += product.getPrice();
            System.out.println(product.getName() + " - $" + product.getPrice());
        }
        System.out.println("Total  $" + sum);
        return sum;
    }
}
