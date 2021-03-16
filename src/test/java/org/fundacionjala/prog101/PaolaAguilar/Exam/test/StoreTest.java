package org.fundacionjala.prog101.PaolaAguilar.Exam.test;

import org.fundacionjala.prog101.PaolaAguilar.Exam.src.Category;
import org.fundacionjala.prog101.PaolaAguilar.Exam.src.Product;
import org.fundacionjala.prog101.PaolaAguilar.Exam.src.Store;
import org.junit.Test;

import static org.junit.Assert.*;

public class StoreTest {

    @Test
    public void testTotalCostNoProductAdded() {
        Store store = new Store();
        int expected = 0;
        int actual = store.createInvoice().getTotalCost();
        assertEquals(expected,actual);
    }

    @Test
    public void testTotalInvoiceWithOneProduct() {
        Store store = new Store();
        store.buy(new Product("Bread", 1, 1, new Category("Grain")));
        int expected = 1;
        int actual = store.createInvoice().getTotalCost();
        assertEquals(expected,actual);
    }

    @Test
    public void testTotalInvoiceWithTwoProducts() {
        Store store = new Store();
        store.buy(new Product("Bread", 1,1, new Category("Grain")));
        store.buy(new Product("Milk", 10,1, new Category("Lactose")));
        int expected = 11;
        int actual = store.createInvoice().getTotalCost();
        assertEquals(expected,actual);
    }

    @Test
    public void testTotalInvoiceWithFourProductsAndDifferentAmounts() {
        Store store = new Store();
        store.buy(new Product("Bread", 1,5, new Category("Grain")));
        store.buy(new Product("Milk", 10,4, new Category("Lactose")));
        store.buy(new Product("Oil", 1,2, new Category("Liquid")));
        store.buy(new Product("Rice", 10,4, new Category("Grain")));
        int expected = 87;
        int actual = store.createInvoice().getTotalCost();
        assertEquals(expected,actual);
    }

    @Test
    public void testCompleteInvoiceDetailDisplayOfOneProducts() {
        Store store = new Store();
        store.buy(new Product("Bread", 1,5, new Category("Grain")));
        String expected = "Amount\t\tProduct\t\tPrice\t\tTotal\n" +
                "--------------------------------------\n" +
                "5 kg\t\tBread\t\t$1\t\t\t5\n" +
                "--------------------------------------\n" +
                "Total\t\t\t\t\t\t\t\t$5";
        String actual = store.createInvoice().showDetailSale();
        assertEquals(expected,actual);
    }

    @Test
    public void testCompleteInvoiceDetailDisplayTwoProductsOneWithProm() {
        Store store = new Store();
        store.buy(new Product("Bread", 1,9, new Category("Grain")));
        store.buy(new Product("Oil", 3,2, new Category("Liquid")));
        String expected = "Amount\t\tProduct\t\tPrice\t\tTotal\n" +
                "--------------------------------------\n" +
                "9 kg\t\tBread\t\t$1\t\t\t9\n" +
                "2 lt\t\tOil\t\t$3\t\t\t6\n" +
                "--------------------------------------\n" +
                "Total\t\t\t\t\t\t\t\t$15";
        String actual = store.createInvoice().showDetailSale();
        assertEquals(expected,actual);
    }
}