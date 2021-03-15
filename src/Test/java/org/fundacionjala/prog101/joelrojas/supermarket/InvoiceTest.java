package org.fundacionjala.prog101.joelrojas.supermarket;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;
public class InvoiceTest {
    @Test
    public void testTotalCostWithThreeProducts() {
        ArrayList<Product> products = new ArrayList<>();
        products.add(new Product("Beer", 12));
        products.add(new Product("Cookies", 6));
        products.add(new Product("Cheese", 5));
        Invoice invoice = new Invoice(products);
        int expected = 23;
        int actual = invoice.getTotalCost();
        assertEquals(expected, actual);
    }

    @Test
    public void testToString() {
        ArrayList<Product> products = new ArrayList<>();
        products.add(new Product("Beer", 12));
        products.add(new Product("Cookies", 6));
        Invoice invoice = new Invoice(products);
        String expected = "Beer     12" + "\n" + "Cookies     6" + "\n";
        String actual = invoice.toString();
        assertEquals(expected, actual);
    }
}
