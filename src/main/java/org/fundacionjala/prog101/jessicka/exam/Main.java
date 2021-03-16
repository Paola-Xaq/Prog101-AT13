package org.fundacionjala.prog101.jessicka.exam;

import org.fundacionjala.prog101.jessicka.exam.categories.Food;
import org.fundacionjala.prog101.jessicka.exam.categories.Lactose;

public class Main {
    public static void main(String[] args) {
        Store store = new Store();
        store.buy(new Product("bread", 1, 5, new Food()));
        store.buy(new Product("milk", 10, 4, new Lactose()));
        System.out.println(store.createInvoice());
    }
}
