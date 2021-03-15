package org.fundacionjala.prog101.jessicka.exam;

import org.junit.Test;

import static org.junit.Assert.*;

public class StoreTest {

    @Test
    public void testTotalCostNoProductAdded() {
        Store store = new Store();
        int expected = 0;
        int actual = store.getTotalCost();
        assertEquals(expected, actual);
    }

    @Test
    public void testTotalInvoiceWithOneProduct() {
        Store store = new Store();
        store.buy(new Product("bread", 1, 5));
        int expected = 5;
        int actual = store.getTotalCost();
        assertEquals(expected, actual);
    }

    @Test
    public void testTotalInvoiceWithTwoProduct() {
        Store store = new Store();
        store.buy(new Product("bread", 1, 2));
        store.buy(new Product("milk", 10, 3));
        int expected = 32;
        int actual = store.getTotalCost();
        assertEquals(expected, actual);
    }

    @Test
    public void createInvoice_Product_StringOfProducts() {
        Store store = new Store();
        store.buy(new Product("bread", 1, 6));
        store.buy(new Product("milk", 10, 10));
        String expected = "Cant Product Price Total\n--------------------------\n6  -  bread  -  $1  6\n10  -  milk  -  $10  100\n--------------------------\nTotal:              106";
        String actual = store.createInvoice();
        assertEquals(expected, actual);
    }
}