package org.fundacionjala.prog101.Saul.Exam;

import java.util.ArrayList;

public class Invoice {
    private String productsInformation;
    private ArrayList<Purchase> purchaseList;

    public Invoice(Cart cart) {
        this.purchaseList = cart.getPurchases();
    }
    public int getTotalCost() {
        int totalCost = 0;
        for (Purchase purchase : purchaseList) {
            int cost = purchase.getProduct().getPrice();
            int quantity = purchase.getQuantity();
            totalCost += (int)(cost * quantity);
        }
        return totalCost;
    }
    public String getItemsCost() {
        String itemsCost = "Cant   Product      Price   Total\n";
        itemsCost += "---------------------------------\n";
        for (Purchase purchase : purchaseList) {
            String name = purchase.getProduct().getName();
            int price = purchase.getProduct().getPrice();
            int quantity = purchase.getQuantity();
            itemsCost += quantity + "     ";
            itemsCost += name + "    -    ";
            itemsCost += "$" + price + "    -    ";
            itemsCost += "$" + (int)(price * quantity) + "\n";
        }
        itemsCost += "---------------------------------\n";
        itemsCost += "Total" + "                          $" + getTotalCost();
        return itemsCost;
    }
}
