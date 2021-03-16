package org.fundacionjala.prog101.Gustavo.Quiz01;

import java.util.ArrayList;

public class Store {
    private Invoice invoice;
    private ArrayList<PurchasedItem> purchasedItems = new ArrayList<PurchasedItem>();

    /**
     * Add a new product in list
     *
     * @return nothing
     */
    void buy(final ProductStore productStore, final int quantity) {
        purchasedItems.add(new PurchasedItem(productStore, quantity));
    }

    /**
     * Add a new product in list
     *
     * @return nothing
     */
    void buy(final ProductStore productStore) {
        purchasedItems.add(new PurchasedItem(productStore));
    }

    /**
     * @return new Invoice
     */
    Invoice createInvoice() {
        return new Invoice(purchasedItems);
    }
}
