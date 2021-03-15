package org.fundacionjala.prog101.TestJorge;

public class Main {
    public static void main(String[] args) {
        Store store = new Store();
        store.buy(new Product("Pilfrut",1));
        store.buy(new Product("Pilfrut",1));
        store.buy(new Product("Pilfrut",1));
        store.printInvoice();

    }
}
