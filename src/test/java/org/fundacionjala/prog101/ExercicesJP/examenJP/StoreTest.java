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

    @Test
    public void testShowDetailInvoice() {
        Store store = new Store();
        Product producto1 = new Product("bread",1);
        Product producto2 = new Product("milk",10);
        ItemInvoice[] items = {
                new ItemInvoice(1,producto1),
                new ItemInvoice(1,producto2)
        };
        store.buy(items);
        StringBuilder sb = new StringBuilder();
        sb.append("bread\t-\t\t$1\n").append("milk\t-\t\t$10\n").append("---------------------\n").append("Total\t\t\t$11");
        String expected = sb.toString();
        String actual = store.showDetail();
        assertEquals(expected,actual);
    }
}