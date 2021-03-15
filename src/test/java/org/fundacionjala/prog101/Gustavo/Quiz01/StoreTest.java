package org.fundacionjala.prog101.Gustavo.Quiz01;

import org.junit.Test;

import static org.junit.Assert.*;

public class StoreTest {

    @Test
    public void totalCost_AddNothigProduct_TotalPriceZero() {
        Store store = new Store();
        int expected = 0;
        int actual = store.createInvoice().getTotalCost();
        assertEquals(expected, actual);
    }

    @Test
    public void totalCost_AddOneProduct_TotalPriceOne() {
        Store store = new Store();
        store.buy(new Product(new Bread()));
        int expected = 1;
        int actual = store.createInvoice().getTotalCost();
        assertEquals(expected, actual);
    }

    @Test
    public void totalCost_AddTwoProduct_TotalPriceEleven() {
        Store store = new Store();
        store.buy(new Product(new Bread()));
        store.buy(new Product(new Milk()));
        int expected = 11;
        int actual = store.createInvoice().getTotalCost();
        assertEquals(expected, actual);
    }

    @Test
    public void costOfEachItem_AddNothigProduct_ShowOnlyTotal() {
        Store store = new Store();
        String expected = "---------- " + "\n" + "Total  $0";
        String actual = store.createInvoice().getCostOfEachItem();
        assertEquals(expected, actual);
    }

    @Test
    public void costOfEachItem_AddOneProduct_ShowOneProductAndTotalOne() {
        Store store = new Store();
        store.buy(new Product(new Bread()));
        String expected = "Bread - $1" + "\n" + "---------- " + "\n" + "Total  $1";
        String actual = store.createInvoice().getCostOfEachItem();
        assertEquals(expected, actual);
    }

    @Test
    public void costOfEachItem_AddTwoProduct_ShowOneProductAndTotalEleven() {
        Store store = new Store();
        store.buy(new Product(new Bread()));
        store.buy(new Product(new Milk()));
        String expected = "Bread - $1" + "\n" + "Milk - $10" + "\n" + "---------- " + "\n" + "Total  $11";
        String actual = store.createInvoice().getCostOfEachItem();
        assertEquals(expected, actual);
    }

    @Test
    public void invoiceDetail_AddThreeProduct_ShowInvoiceDetail() {
        Store store = new Store();
        store.buy(new Product(new Bread(),3));
        store.buy(new Product(new Milk(),2));
        store.buy(new Product(new Rice(),5));
        String expected = "Cant  Produtc   Price    Total" + "\n" + "------------------------------" + "\n"+
                 "3 u - \tBread -\t$1\t\t $3" + "\n"+
                 "2 lt - \tMilk -\t$10\t\t $20" + "\n"+
                 "5 kg - \tRice -\t$5\t\t $25" + "\n"+
                 "------------------------------" + "\n"+
                "Total                    $48";
        String actual = store.createInvoice().getCompleteInvoiveDetail();
        assertEquals(expected, actual);
    }
}