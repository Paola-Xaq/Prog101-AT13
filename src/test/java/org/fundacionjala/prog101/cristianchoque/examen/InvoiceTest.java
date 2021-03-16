package org.fundacionjala.prog101.cristianchoque.examen;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class InvoiceTest {

    @Test
    public void getTotalCost_NoProductAdded_Zero() {
        Store store = new Store();
        double expected = 0.0;
        double actual = store.createInvoice().getTotalCost();
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void getTotalCost_InvoiceWIthOneProduct_Five() {
        Store store = new Store();
        Product producto1 = new Product("Bread", "u", "lactose", "PIL", "1", 10, 10);
        store.buy(10, producto1);
        double expected = 9.0;
        double actual = store.createInvoice().getTotalCost();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getTotalCost_InvoiceWIthTwoProducts_Zero() {
        Store store = new Store();
        Product producto1 = new Product("Bread", "u", "lactose", "PIL", "1", 10, 10);
        Product producto2 = new Product("Milk", "lt", "masitas", "San Gabriel", "10", 5, 10);
        store.buy(10, producto1);
        store.buy(5, producto2);
        double expected = 54.0;
        double actual = store.createInvoice().getTotalCost();
        Assert.assertEquals(expected, actual);
    }

}