package org.fundacionjala.prog101.edsonAnawaya.examen;

import org.fundacionjala.prog101.edsonAnawaya.examen.store.Product;
import org.fundacionjala.prog101.edsonAnawaya.examen.store.Store;

public final class Main {
    private Main() {
    }

    public static void main(final String[] args) {
        final int priceBread = 1;
        final int priceMilk = 10;
        final int priceOil = 10;
        final int priceRice = 5;
        Store store = new Store();
        store.buy(new Product("Bread", priceBread));
        store.buy(new Product("Bread", priceBread));
        store.buy(new Product("Bread", priceBread));
        store.buy(new Product("Bread", priceBread));
        store.buy(new Product("Bread", priceBread));
        store.buy(new Product("Bread", priceBread));
        store.buy(new Product("Bread", priceBread));
        store.buy(new Product("Bread", priceBread));
        store.buy(new Product("Bread", priceBread));
        store.buy(new Product("Bread", priceBread));
        store.buy(new Product("Milk", priceMilk));
        store.buy(new Product("Milk", priceMilk));
        store.buy(new Product("Milk", priceMilk));
        store.buy(new Product("Milk", priceMilk));
        store.buy(new Product("Milk", priceMilk));
        store.buy(new Product("Oil", priceOil));
        store.buy(new Product("Oil", priceOil));
        store.buy(new Product("Oil", priceOil));
        store.buy(new Product("Oil", priceOil));
        store.buy(new Product("Oil", priceOil));
        store.buy(new Product("Oil", priceOil));
        store.buy(new Product("Oil", priceOil));
        store.buy(new Product("Oil", priceOil));
        store.buy(new Product("Oil", priceOil));
        store.buy(new Product("Oil", priceOil));
        store.buy(new Product("Rice", priceRice));
        store.buy(new Product("Rice", priceRice));
        store.buy(new Product("Rice", priceRice));
        store.buy(new Product("Rice", priceRice));
        store.buy(new Product("Rice", priceRice));
        store.buy(new Product("Rice", priceRice));
        store.buy(new Product("Rice", priceRice));
        store.buy(new Product("Rice", priceRice));
        store.buy(new Product("Rice", priceRice));
        store.buy(new Product("Rice", priceRice));
        store.buy(new Product("Rice", priceRice));
        store.buy(new Product("Rice", priceRice));
        store.buy(new Product("Rice", priceRice));
        store.buy(new Product("Rice", priceRice));
        store.buy(new Product("Rice", priceRice));
        store.buy(new Product("Rice", priceRice));
        store.buy(new Product("Rice", priceRice));
        store.buy(new Product("Rice", priceRice));
        store.buy(new Product("Rice", priceRice));
        store.buy(new Product("Rice", priceRice));

        store.createInvoice().setPromos(10);
        System.out.println(store.createInvoice().getTotalCost());
    }
}
