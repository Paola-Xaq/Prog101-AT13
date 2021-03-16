package org.fundacionjala.prog101.Saul.Exam;

import java.util.ArrayList;

public class Cart {
    private ArrayList<Purchase> purchases;
    public Cart() {
        purchases = new ArrayList<Purchase>();
    }
    public ArrayList<Purchase> getPurchases() {
        return purchases;
    }
    public void addPurchase(Product product, int quantity) {
        Purchase purchase = new Purchase(product, quantity);
        purchases.add(purchase);
    }
}
