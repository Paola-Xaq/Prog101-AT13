package org.fundacionjala.prog101.joelrojas.supermarket;

import java.util.ArrayList;

public class Store {
    private ArrayList<Product> products = new ArrayList<>();
    private ArrayList<Integer> amounts = new ArrayList<>();

    public Invoice createInvoice() {
        return new Invoice(products);
    }

    public Invoice createInvoice2() {
        return new Invoice(products, amounts);
    }

    public void buy(Product product) {
        products.add(product);
    }

    public void buy(Product product, int amount) {
        products.add(product);
        amounts.add(amount);
    }
}
