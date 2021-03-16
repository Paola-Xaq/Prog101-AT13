package org.fundacionjala.prog101.joelrojas.supermarket;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;
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
        store.buy(new Product("bread", 1));
        int expected = 1;
        int actual = store.createInvoice().getTotalCost();
        assertEquals(expected, actual);
    }

    @Test
    public void testTotalInvoiceTwoOneProducts() {
        Store store = new Store();
        store.buy(new Product("bread", 1));
        store.buy(new Product("milk", 10));
        int expected = 11;
        int actual = store.createInvoice().getTotalCost();
        assertEquals(expected, actual);
    }

    @Test
    public void testTotalInvoiceOneProductsWithDiscount() {
        Store store = new Store();
        store.buy(new Product("Bread", 1),10);
        int expected = 9;
        int actual = store.createInvoice().getTotalCost();
        assertEquals(expected, actual);
    }


    @Test
    public void testClompleteInformationOfProductWithDiscount() {
        Store store = new Store();
        store.buy(new Product("Oil", 100, "l"),10);
        String expected = "Cant      Product        Price     Total\n"
                + "----------------------------------------\n"
                + "10 l      Oil            $100      $900  10%" + "\n"
                + "----------------------------------------\n"
                + "Total                              $900";
        String actual = store.createInvoice().toString();
        assertEquals(expected, actual);
    }
}
