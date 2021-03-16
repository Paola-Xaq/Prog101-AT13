package org.fundacionjala.prog101.ExercicesJP.examenJP;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StoreTest {

    ItemInvoice[] items;

    @Before
    public void setup() {
        Product producto1 = new Product("bread",1,"u");
        Product producto2 = new Product("milk",10,"lt");
        Product producto3 = new Product("rice",5,"kg");
        ItemInvoice[] products= {
                new ItemInvoice(3,producto1),
                new ItemInvoice(2,producto2),
                new ItemInvoice(5,producto3),
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
    public void testTotalInvoiceWithProducts() {
        Store store = new Store();
        store.buy(items);
        int expected = 48;
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
                .append("3 u - \tbread\t-\t\t$1\t\t$3\n")
                .append("2 lt - \tmilk\t-\t\t$10\t\t$20\n")
                .append("5 kg - \trice\t-\t\t$5\t\t$25\n")
                .append("-------------------------------------\n")
                .append("Total\t\t\t\t\t\t\t$48");
        String expected = sb.toString();
        String actual = store.showDetail();
        assertEquals(expected,actual);
    }
}