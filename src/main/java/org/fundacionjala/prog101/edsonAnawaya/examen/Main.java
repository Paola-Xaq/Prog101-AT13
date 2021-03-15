package org.fundacionjala.prog101.edsonAnawaya.examen;

import org.fundacionjala.prog101.edsonAnawaya.examen.store.Product;
import org.fundacionjala.prog101.edsonAnawaya.examen.store.Store;

public final class Main {
    private Main() {
    }

    public static void main(final String[] args) {
        final int priceMilk = 10;
        Store store = new Store();
        store.buy(new Product("bread", 1));
        store.buy(new Product("bread", 1));
        store.buy(new Product("milk", priceMilk));
        store.buy(new Product("milk", priceMilk));
        store.buy(new Product("milk", priceMilk));

        store.createInvoice().getTotalCost();
    }
}
