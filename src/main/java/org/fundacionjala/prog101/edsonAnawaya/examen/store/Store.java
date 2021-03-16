package org.fundacionjala.prog101.edsonAnawaya.examen.store;

import org.fundacionjala.prog101.edsonAnawaya.examen.employees.Cashier;
import org.fundacionjala.prog101.edsonAnawaya.examen.employees.Manager;

public class Store {
    private Invoice invoice;
    private Cashier cashier;
    private Manager manager;

    public Store() {
        this.invoice = new Invoice();
        this.cashier = new Cashier();
        this.manager = new Manager();
    }

    public void buy(Product product) {
        this.invoice.addProduct(product);
    }

    public Invoice createInvoice() {
        return invoice;
    }

    public Cashier cashier() {
        return this.cashier;
    }

    public Manager manager() {
        return this.manager;
    }
}
