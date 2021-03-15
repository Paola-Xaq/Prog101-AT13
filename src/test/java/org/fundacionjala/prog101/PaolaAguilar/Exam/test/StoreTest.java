package org.fundacionjala.prog101.PaolaAguilar.Exam.test;

import org.fundacionjala.prog101.PaolaAguilar.Exam.src.Product;
import org.fundacionjala.prog101.PaolaAguilar.Exam.src.Store;
import org.junit.Test;

import static org.junit.Assert.*;

public class StoreTest {

    @Test
    public void testTotalCostNoProductAdded() {
        Store store = new Store();
        int expected = 0;
        int actual = store.getInvoice().getTotalCost();
        assertEquals(expected,actual);
    }

    @Test
    public void testTotalInvoiceWithTwoProducts() {
        Store store = new Store();

        store.buy(new Product("bread", 1));
        store.buy(new Product("milk", 10);
        int expected = 0;
        int actual = store.getInvoice().getTotalCost();
        assertEquals(expected,actual);
    }

}