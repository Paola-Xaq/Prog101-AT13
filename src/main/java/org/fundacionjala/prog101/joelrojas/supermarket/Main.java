package org.fundacionjala.prog101.joelrojas.supermarket;

public final class Main {
    private Main() {

    }
    public static void main(String[] args) {
        Store store = new Store();
        store.buy(new Product("bread", 1, "l"), 2);
        store.buy(new Product("bread", 1, "l"), 2);
        store.buy(new Product("Nuddles", 6, "p"), 3);
        String actual2 = store.createInvoice2().toString();
        System.out.println(actual2);

    }
}
