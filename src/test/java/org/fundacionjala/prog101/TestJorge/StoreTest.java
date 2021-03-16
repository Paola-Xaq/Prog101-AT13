package org.fundacionjala.prog101.TestJorge;

import org.junit.Test;

import static org.junit.Assert.*;

public class StoreTest {

    @Test
    public void testTotalCostNoProductAdded() {
        Store store = new Store();
        int expected = 0;
        int actual = store.getProductsCost();
        assertEquals(expected,actual);
    }

    @Test
    public void testTotalWithOneProductAdded() {
        Store store = new Store();
        store.buy(new Bread(1));
        int expected = 1;
        int actual = store.getProductsCost();
        assertEquals(expected,actual);
    }

    @Test
    public void testTotalWithTwoProductAdded() {
        Store store = new Store();
        store.buy(new Bread(1));
        store.buy(new Milk(1));
        int expected = 11;
        int actual = store.getProductsCost();
        assertEquals(expected,actual);
    }
    @Test
    public void testInvoice() {
        Store store = new Store();
        store.buy(new Rice(20));
        String expected = "20Kg Rice $5 $90.0";
        String actual = store.createInvoice(new Rice(20));
        assertEquals(expected,actual);
    }
    @Test
    public void testPromo() {
        Store store = new Store();
        store.buy(new Oil(10));
        String expected = "Per 10 Lt of Oil, pay $90.0(Regular cost 100)";
        String actual = store.showPromo(new Oil(10));
        assertEquals(expected,actual);
    }
    @Test
    public void testPrintInvoice(){
        Store store = new Store();
        store.buy(new Rice(20));
        store.buy(new Oil(10));
        store.buy(new Bread(4));
        store.printInvoice();
        store.printPromo();
    }
}