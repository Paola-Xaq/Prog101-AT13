package org.fundacionjala.prog101.Gustavo.Quiz01;

import org.junit.Test;

import static org.junit.Assert.*;

public class StoreTest {

    @Test
    public void totalCost_AddNothigProduct_TotalPriceZero() {
        Store store=new Store();
        int expected=0;
        int actual = store.createInvoice().getTotalCost();
        assertEquals(expected,actual);
    }

    @Test
    public void totalCost_AddOneProduct_TotalPriceOne() {
        Store store=new Store();
        store.buy(new Product("bread",1));
        int expected=1;
        int actual = store.createInvoice().getTotalCost();
        assertEquals(expected,actual);
    }

    @Test
    public void totalCost_AddtwoProduct_TotalPriceEleven() {
        Store store=new Store();
        store.buy(new Product("bread",1));
        store.buy(new Product("milk",10));
        int expected=11;
        int actual = store.createInvoice().getTotalCost();
        assertEquals(expected,actual);
    }
}