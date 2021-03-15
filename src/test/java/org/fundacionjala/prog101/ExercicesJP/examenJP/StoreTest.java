package org.fundacionjala.prog101.ExercicesJP.examenJP;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StoreTest {

    ItemInvoice[] items;

    @Before
    public void setup() {
        Product producto1 = new Product("bread",1);
        Product producto2 = new Product("milk",10);
        ItemInvoice[] products= {
                new ItemInvoice(3,producto1),
                new ItemInvoice(2,producto2)
        };
        items = products;
    }




    @Test
    public void testTotalCostNoProductAdded() {
        Store store = new Store();
        int expected = 0;
        int actual = store.totalCost();
        assertEquals(expected,actual);
    }

    @Test
    public void testTotalInvoiceWithOneProduct() {
        Store store = new Store();
        Product producto1 = new Product("bread",1);
        ItemInvoice[] items = {new ItemInvoice(1,producto1)};
        store.buy(items);
        int expected = 1;
        int actual = store.totalCost();
        assertEquals(expected,actual);
    }

    @Test
    public void testTotalInvoiceWithTwoProducts() {
        Store store = new Store();
        store.buy(items);
        int expected = 23;
        int actual = store.totalCost();
        assertEquals(expected,actual);
    }

    @Test
    public void testShowDetailInvoice() {
        Store store = new Store();
        store.buy(items);
        StringBuilder sb = new StringBuilder();
        sb.append("Cant\tProduct\t\t\tPrice\tTotal\n")
                .append("-------------------------------------\n")
                .append("3 - \tbread\t-\t\t$1\t\t$3\n")
                .append("2 - \tmilk\t-\t\t$10\t\t$20\n")
                .append("-------------------------------------\n")
                .append("Total\t\t\t\t\t\t\t$23");
        String expected = sb.toString();
        String actual = store.showDetail();
        assertEquals(expected,actual);
    }
}