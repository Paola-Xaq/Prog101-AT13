package org.fundacionjala.prog101.edsonAnawaya.examen.store;

import java.util.ArrayList;
import java.util.List;

public class Invoice {
    private List<Product> productsObjects;

    public Invoice() {
        productsObjects = new ArrayList<>();
    }

    public void addProduct(Product product) {
        if (!verifyExist(product)) {
            productsObjects.add(product);
        }
    }

    private boolean verifyExist(Product newProduct) {

        for (Product product : productsObjects) {
            if (product.getName() == newProduct.getName()) {
                product.setCant(product.getCant() + 1);
                return true;
            }
        }
        return false;
    }

    public int getTotalCost() {
        int sum = 0;
        int cant = 0;
        String name = "";
        int price = 0;
        int sumTotal = 0;

        System.out.println("Cant    Product    Price   Total");
        System.out.println("--------------------------------");
        for (Product product : productsObjects) {
            cant = product.getCant();
            name = product.getName();
            price = product.getPrice();
            sumTotal = product.getPrice() * product.getCant();
            sum += sumTotal;

            System.out.println(cant + "       " + name + "  -     $" + price + "      $" + sumTotal);
        }
        System.out.println("--------------------------------");
        System.out.println("Total                        $" + sum);
        return sum;
    }
}
