package org.fundacionjala.prog101.joelrojas.supermarket;

public final class Main {
    private Main() {

    }
    public static void main(String[] args) {
        Store store = new Store();
        store.buy(new Product("Bread", 1, "l"), 10);
        store.buy(new Product("Nuddles", 6, "p"), 3);
        String actual2 = store.createInvoice().toString();
        System.out.println(actual2);
    }
}
