package org.fundacionjala.prog101.TestJorge;

import org.junit.Test;

import static org.junit.Assert.*;

public class StoreTest {

    @Test
    public void testTotalCostNoProductAdded() {
        Store store = new Store();
        int expected = 0;
        int actual = store.getTotalCost();
    }

    @Test
    public void testTotalWithOneProductAdded() {
        Store store = new Store();
        store.buy(new Product("Pilfrut",1));
        int expected = 1;
        int actual = store.getTotalCost();
    }

    @Test
    public void testTotalWithTwoProductAdded() {
        Store store = new Store();
        store.buy(new Product("Pilfrut",1));
        store.buy(new Product("Pancito",1));
        int expected = 2;
        int actual = store.getTotalCost();
    }
}