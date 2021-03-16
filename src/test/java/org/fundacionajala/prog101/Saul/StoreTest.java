package org.fundacionajala.prog101.Saul;
import org.fundacionjala.prog101.Saul.Exam.*;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class StoreTest {
    @Test
    public void testTotalCostNoProductAdded() {
        Store store = new Store();
        int expected = 0;
        int actual = store.createInvoice().getTotalCost();
        assertEquals(expected, actual);
    }
    @Test
    public void testTotalInvoiceWithOneProduct() {
        Store store = new Store();
        store.buy("Bread", 1);
        int expected = 1;
        int actual = store.createInvoice().getTotalCost();
        assertEquals(expected, actual);
    }
    @Test
    public void testTotalInvoiceWithTwoProducts() {
        Store store = new Store();
        store.buy ("Bread", 1);
        store.buy ("Milk", 10);
        int expected = 11;
        int actual = store.createInvoice().getTotalCost();
        assertEquals(expected, actual);
    }
    @Test
    public void testGetItemsCostWith2Products() {
        Store store = new Store();
        store.buy ("Bread", 1);
        store.buy ("Milk", 10);
        String expected = "Bread   -   $10\nMilk   -   $1\n----------------\nTotal        $11";
        String actual = store.createInvoice().getItemsCost();
    }
    @Test
    public void testGetItemsCostWith3Products() {
        Store store = new Store();
        store.buy ("Milk", 3);
        store.buy ("Bread", 14);
        store.buy ("Bread", 3);
        String expected = "Milk   -   $3\nBread   -   $14\nBread   -   $3\n----------------\nTotal       $20";
        String actual = store.createInvoice().getItemsCost();
        assertEquals(expected, actual);
    }
}
