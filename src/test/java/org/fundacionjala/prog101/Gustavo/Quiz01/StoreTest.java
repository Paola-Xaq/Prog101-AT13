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
        String actual = store.createInvoice().getCompleteInvoiceDetail();
        assertEquals(expected, actual);
    }

    @Test
    public void invoiceDetailWithPromotion_AddFourProduct_ShowInvoiceDetailWithPromotion() {
        Store store = new Store();
        store.buy(new Product(new Bread(),33));
        store.buy(new Product(new Milk(),20));
        store.buy(new Product(new Rice(),50));
        store.buy(new Product(new Oil(),45));
        String expected = "Cant  Product   Price    Total  %DisCount   Total" +"\n"+
                "------------------------------------------------------------" + "\n"+
                "33 u -\tBread -\t$1\t\t $33\t10.0%\t\t30"+"\n"+
                "20 lt -\tMilk -\t$10\t\t $200\t11.0%\t\t180"+"\n"+
                "50 kg -\tRice -\t$5\t\t $250\t9.0%\t\t230"+"\n"+
                "45 l -\tOil -\t$10\t\t $450\t10.0%\t\t410"+"\n"+
                "------------------------------------------------------------" + "\n"+
                "Total                    $933      \t\t\t$850";
        String actual = store.createInvoice().getCompleteInvoiceDetailWithPromotion();
        assertEquals(expected, actual);
    }
}