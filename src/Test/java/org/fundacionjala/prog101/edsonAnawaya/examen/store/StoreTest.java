package org.fundacionjala.prog101.edsonAnawaya.examen.store;

import junit.framework.TestCase;
import org.junit.Test;

public class StoreTest extends TestCase {
    @Test
    public void testTotalCostoNoProductAdded() {
        Store store = new Store();
        int expect = 0;
        int actual = store.createInvoice().getTotalCost();
        assertEquals(expect, actual);
    }

    @Test
    public void testTotalInvoiceWithOneProduct() {
        Store store = new Store();
        store.buy(new Product("Bread", 1));
        int expect = 1;
        int actual = store.createInvoice().getTotalCost();
        assertEquals(expect, actual);
    }

    @Test
    public void testTotalInvoiceWithTwoProducts() {
        Store store = new Store();
        store.buy(new Product("Bread", 1));
        store.buy(new Product("Milk", 10));
        int expect = 11;
        int actual = store.createInvoice().getTotalCost();
        assertEquals(expect, actual);
    }

    @Test
    public void testTotalInvoiceWithTwoProductsEquals() {
        Store store = new Store();
        store.buy(new Product("Bread", 1));
        store.buy(new Product("Bread", 1));
        store.buy(new Product("Milk", 10));
        store.buy(new Product("Milk", 10));
        int expect = 22;
        int actual = store.createInvoice().getTotalCost();
        assertEquals(expect, actual);
    }

    @Test
    public void testTotalInvoiceWithPromos() {
        Store store = new Store();
        store.buy(new Product("Bread", 1));
        store.buy(new Product("Bread", 1));
        store.buy(new Product("Bread", 1));
        store.buy(new Product("Bread", 1));
        store.buy(new Product("Bread", 1));
        store.buy(new Product("Bread", 1));
        store.buy(new Product("Bread", 1));
        store.buy(new Product("Bread", 1));
        store.buy(new Product("Bread", 1));
        store.buy(new Product("Bread", 1));
        store.buy(new Product("Milk", 10));
        store.buy(new Product("Milk", 10));
        store.buy(new Product("Milk", 10));
        store.buy(new Product("Milk", 10));
        store.buy(new Product("Milk", 10));
        store.buy(new Product("Oil", 10));
        store.buy(new Product("Oil", 10));
        store.buy(new Product("Oil", 10));
        store.buy(new Product("Oil", 10));
        store.buy(new Product("Oil", 10));
        store.buy(new Product("Oil", 10));
        store.buy(new Product("Oil", 10));
        store.buy(new Product("Oil", 10));
        store.buy(new Product("Oil", 10));
        store.buy(new Product("Oil", 10));
        store.buy(new Product("Rice", 5));
        store.buy(new Product("Rice", 5));
        store.buy(new Product("Rice", 5));
        store.buy(new Product("Rice", 5));
        store.buy(new Product("Rice", 5));
        store.buy(new Product("Rice", 5));
        store.buy(new Product("Rice", 5));
        store.buy(new Product("Rice", 5));
        store.buy(new Product("Rice", 5));
        store.buy(new Product("Rice", 5));
        store.buy(new Product("Rice", 5));
        store.buy(new Product("Rice", 5));
        store.buy(new Product("Rice", 5));
        store.buy(new Product("Rice", 5));
        store.buy(new Product("Rice", 5));
        store.buy(new Product("Rice", 5));
        store.buy(new Product("Rice", 5));
        store.buy(new Product("Rice", 5));
        store.buy(new Product("Rice", 5));
        store.buy(new Product("Rice", 5));
        store.createInvoice().setPromos(10);
        int expect = 234;
        int actual = store.createInvoice().getTotalCost();
        assertEquals(expect, actual);
    }
}