package org.fundacionjala.prog101.Saul.Exam;

public class Main {
    public static void main(String[] args) {
        Store store = new Store();
        store.initializeInventory();
        store.buy("Bread", 1);
        store.buy("Milk", 2);
        store.buy("Rice", 5);
        String totalCost = store.createInvoice().getItemsCost();
        System.out.println(totalCost);
    }
}
