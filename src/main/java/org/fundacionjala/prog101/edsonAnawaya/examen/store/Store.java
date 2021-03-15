package org.fundacionjala.prog101.edsonAnawaya.examen.store;

public class Store {
    private Invoice invoice;


    public Store() {
        this.invoice = new Invoice();
    }

    public void buy(Product product) {
        this.invoice.addProduct(product);
    }

    public Invoice createInvoice() {
        return invoice;
    }
}
