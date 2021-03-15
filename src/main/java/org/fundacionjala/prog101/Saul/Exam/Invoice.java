package org.fundacionjala.prog101.Saul.Exam;

import java.util.ArrayList;

public class Invoice {
    private ArrayList<Product> productList;
    private int totalCost;
    public Invoice(ArrayList<Product> productList) {
        this.productList = productList;
    }
    public int getTotalCost() {
        totalCost = 0;
        for (Product product : productList) {
            totalCost += product.getPrice();
        }
        return totalCost;
    }
}
