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
        store.buy("Bread");
        int expected = 1;
        int actual = store.createInvoice().getTotalCost();
        assertEquals(expected, actual);
    }
    @Test
    public void testTotalInvoiceWithTwoProducts() {
        Store store = new Store();
        store.buy ("Bread");
        store.buy ("Milk");
        int expected = 11;
        int actual = store.createInvoice().getTotalCost();
        assertEquals(expected, actual);
    }
}
