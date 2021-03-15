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
        store.buy(new Product("bread",1));
        int expect = 1;
        int actual = store.createInvoice().getTotalCost();
        assertEquals(expect, actual);
    }
    @Test
    public void testTotalInvoiceWithTwoProducts() {
        Store store = new Store();
        store.buy(new Product("bread",1));
        store.buy(new Product("milk",10));
        int expect = 11;
        int actual = store.createInvoice().getTotalCost();
        assertEquals(expect, actual);
    }
}