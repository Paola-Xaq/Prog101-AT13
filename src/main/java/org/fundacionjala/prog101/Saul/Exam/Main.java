package org.fundacionjala.prog101.Saul.Exam;

public class Main {
    public static void main(String[] args) {
        Store store = new Store();
        store.buy("Bread", 1);
        String totalCost = store.createInvoice().getItemsCost();
        System.out.println(totalCost);
    }
}
