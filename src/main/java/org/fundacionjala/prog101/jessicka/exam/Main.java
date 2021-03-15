package org.fundacionjala.prog101.jessicka.exam;

public class Main {
    public static void main(String[] args) {
        Store store = new Store();
        store.buy(new Product("bread", 1));
        store.buy(new Product("milk", 10));
        store.createInvoice();
        System.out.println(store.getTotalCost());
    }
}
