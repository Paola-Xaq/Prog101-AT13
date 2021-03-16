package org.fundacionjala.prog101.TestJorge;

public class Main {
    public static void main(String[] args) {
        Store store = new Store();
        store.buy(new Rice(20));
        store.buy(new Oil(10));
        store.buy(new Bread(4));
        store.printInvoice();
        store.printPromo();
    }
}
