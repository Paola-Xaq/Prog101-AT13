package org.fundacionjala.prog101.edsonAnawaya.examen;

import org.fundacionjala.prog101.edsonAnawaya.examen.store.Product;
import org.fundacionjala.prog101.edsonAnawaya.examen.store.Store;

public final class Main {
    private Main() {
    }

    public static void main(final String[] args) {
        /**
         * Diagram class
         * https://drive.google.com/file/d/1W7FXwiyB0pq7bUziKyM69S5rAhCgF9cS/view?usp=sharing
         */
        final int priceBread = 1;
        final int priceMilk = 10;
        final int priceOil = 10;
        final int priceRice = 5;
        final int percentagePromos = 10;
        Store store = new Store();

        store.cashier().addFullName("Jhon Mir");
        store.manager().addFullName("Andrew Mir");

        store.cashier().printPosition();
        store.manager().printPosition();

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

        store.createInvoice().setPromos(percentagePromos);
        System.out.println(store.createInvoice().getTotalCost());
    }
}
