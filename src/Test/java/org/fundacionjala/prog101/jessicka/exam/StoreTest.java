package org.fundacionjala.prog101.jessicka.exam;

import org.fundacionjala.prog101.jessicka.exam.categories.Food;
import org.fundacionjala.prog101.jessicka.exam.categories.Lactose;
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
        store.buy(new Product("bread", 1, 5, new Food()));
        int expected = 5;
        int actual = store.getTotalCost();
        assertEquals(expected, actual);
    }

    @Test
    public void testTotalInvoiceWithTwoProduct() {
        Store store = new Store();
        store.buy(new Product("bread", 1, 2, new Food()));
        store.buy(new Product("milk", 10, 3, new Lactose()));
        int expected = 32;
        int actual = store.getTotalCost();
        assertEquals(expected, actual);
    }

    @Test
    public void createInvoice_Product_StringOfProducts() {
        Store store = new Store();
        store.buy(new Product("bread", 1, 6, new Food()));
        store.buy(new Product("milk", 10, 10, new Lactose()));
        String expected = "Cant Product Price Total\n--------------------------\n6 u  -  bread  -  $1  6\n10 lt  -  milk  -  $10  100\n--------------------------\nTotal:              106";
        String actual = store.createInvoice();
        assertEquals(expected, actual);
    }

    @Test
    public void createInvoiceWithPromo_Product_StringOfProducts() {
        Store store = new Store();
        Product milk = new Product("milk", 10, 4, new Lactose());
        milk.setPromo(10);
        store.buy(new Product("bread", 1, 5, new Food()));
        store.buy(milk);
        String expected = "Cant Product Price Total\n--------------------------\n5 u  -  bread  -  $1  5\n4 lt  -  milk  -  $9  36 %10\n--------------------------\nTotal:              41";
        String actual = store.createInvoice();
        assertEquals(expected, actual);
    }
}