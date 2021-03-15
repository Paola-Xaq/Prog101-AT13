package org.fundacionjala.prog101.PaolaAguilar.Exam.src;

import java.util.Locale;

public class Store{
    Product product;


    public void Store() {
    }

    public Store getInvoice() {
        return this;
    }

    public int getTotalCost(){
        return 0;
    }

    public void buy(Product product) {
        this.product = product;
    }

}
