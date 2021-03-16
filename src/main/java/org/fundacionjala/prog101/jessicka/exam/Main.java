package org.fundacionjala.prog101.jessicka.exam;

import org.fundacionjala.prog101.jessicka.exam.categories.Food;
import org.fundacionjala.prog101.jessicka.exam.categories.Lactose;

public class Main {
    public static void main(String[] args) {
        Store store = new Store();
        Product bread = new Product("bread", 1, 5, new Food());
        Product milk = new Product("milk", 10, 4, new Lactose());
        milk.setPromo(10);
        store.buy(bread);
        store.buy(milk);
        System.out.println(store.createInvoice());
    }
}
