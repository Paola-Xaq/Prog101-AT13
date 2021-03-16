package org.fundacionjala.prog101.Examen;

import java.util.ArrayList;

public class Invoice {
    private int totalCost = 0;
    public ArrayList<Product> prod;

    public Invoice(ArrayList<Product> products) {
        this.prod = products;
    }

    public int totalCost() {
        if (!prod.isEmpty()) {
            for (int i = 0; i < prod.size(); i++) {
                totalCost += prod.get(i).getPrice();
            }
        }
        return totalCost;
    }

    public int getTotalCost() {
        return totalCost;
    }

    public ArrayList<Product> getProd() {
        return prod;
    }

    public String create() {
        String creation = "";
        for (int i = 0; i < prod.size(); i++) {
            creation += prod.get(i).getInfoProduct();
            System.out.println(prod.get(i).getInfoProduct());
        }
        System.out.println("-------------------");
        System.out.println("Total" + "     " + getTotalCost());
        return creation;
    }
}
