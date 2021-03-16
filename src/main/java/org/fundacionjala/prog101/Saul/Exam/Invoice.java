package org.fundacionjala.prog101.Saul.Exam;

import java.util.ArrayList;

public class Invoice {
    private String productsInformation;
    private ArrayList<Product> productList;

    public Invoice(ArrayList<Product> productList) {
        this.productList = productList;
    }
    public int getTotalCost() {
        int totalCost = 0;
        for (Product product : productList) {
            totalCost += product.getPrice();
        }
        return totalCost;
    }
    public String getItemsCost() {
        String itemsCost = "";
        for (Product product : productList) {
            itemsCost += product.getName() + "   -   ";
            itemsCost += "$" + product.getPrice() + "\n";
        }
        itemsCost += "----------------\n";
        itemsCost += "Total" + "       $" + getTotalCost();
        return itemsCost;
    }
}
