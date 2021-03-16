package org.fundacionjala.prog101.joelrojas.supermarket;

import java.util.ArrayList;

public class Store {
    private ArrayList<Product> products = new ArrayList<>();
    private ArrayList<Integer> amounts = new ArrayList<>();
    private Promo promo = new Promo();

    public Invoice createInvoice() {
        return new Invoice(products, amounts);
    }

    public void buy(Product product) {
        buy(product, 1);
    }

    public void buy(Product product, int amount) {
        if (promo.hasProm(product, amount)) {
            product.putInPromo();
        }
        products.add(product);
        amounts.add(amount);
    }

}
