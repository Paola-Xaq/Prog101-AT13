package org.fundacionjala.prog101.Saul.Exam;

public class Main {
    public static void main(String[] args) {
        Store store = new Store();
        store.buy("Bread", 1);
        int totalCost = store.createInvoice().getTotalCost();
        System.out.println(totalCost);
    }
}
