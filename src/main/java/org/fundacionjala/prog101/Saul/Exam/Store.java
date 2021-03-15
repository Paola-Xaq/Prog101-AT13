package org.fundacionjala.prog101.Saul.Exam;

import java.util.ArrayList;

public class Store {
    private ArrayList<Product> cart;
    public Store() {
        cart = new ArrayList<Product>();
    }
    public void buy(String productName, int price) {
        ProductBuilder productBuilder = new ProductBuilder();
        Product productBought = productBuilder.getProduct(productName, price);
        cart.add(productBought);
    }
    public Invoice createInvoice() {
        Invoice invoice = new Invoice(cart);
        return invoice;
    }
}
