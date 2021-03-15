package org.fundacionjala.prog101.ExercicesJP.examenJP;

import org.junit.Test;

import static org.junit.Assert.*;

public class StoreTest {

    @Test
    public void testTotalCostNoProductAdded() {
        Store store = new Store();
        int expected = 0;
        int actual = store.totalCost();
        assertEquals(expected,actual);
    }

    @Test
    public void testTotalInvoiceWithOneProduct() {
        Store store = new Store();
        Product producto1 = new Product("bread",1);
        ItemInvoice[] items = {
                new ItemInvoice(1,producto1)
        };
        store.buy(items);
        int expected = 1;
        int actual = store.totalCost();
        assertEquals(expected,actual);
    }

    @Test
    public void testTotalInvoiceWithTwoProducts() {
        Store store = new Store();
        Product producto1 = new Product("bread",1);
        Product producto2 = new Product("milk",10);
        ItemInvoice[] items = {
                new ItemInvoice(1,producto1),
                new ItemInvoice(1,producto2)
        };
        store.buy(items);
        int expected = 11;
        int actual = store.totalCost();
        assertEquals(expected,actual);
    }
}