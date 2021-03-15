package org.fundacionjala.prog101.joelrojas.supermarket;

import java.util.ArrayList;

public class Store {
    ArrayList<Product> products = new ArrayList<>();
    public Invoice createInvoice() {
        return new Invoice(products);
    }

    public void buy(Product product) {
        products.add(product);
    }
}
