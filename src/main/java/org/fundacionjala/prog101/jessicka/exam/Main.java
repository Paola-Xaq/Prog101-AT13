package org.fundacionjala.prog101.jessicka.exam;

public class Main {
    public static void main(String[] args) {
        Store store = new Store();
        store.buy(new Product("bread", 1, 5));
        store.buy(new Product("milk", 10, 4));
        System.out.println(store.createInvoice());
    }
}
