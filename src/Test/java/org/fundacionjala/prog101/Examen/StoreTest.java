package org.fundacionjala.prog101.Examen;
import org.junit.Test;
import static org.junit.Assert.*;


public class StoreTest {
    @Test
    public void testTotalCostNoProductAdded(){
        Store store = new Store();
        int expected = 0;
        int actual = store.getTotalCost();
        assertEquals(expected, actual);
    }

    @Test
    public void testTotalInvoiceWithOneProduct(){
        Store store = new Store();
        store.buy(new Product("Bread", 1));
        int expected = 1;
        int actual = store.createInvoice();
        assertEquals(expected, actual);
    }


}
