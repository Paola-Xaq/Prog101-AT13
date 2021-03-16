package org.fundacionjala.prog101.PaolaAguilar.Exam;

import org.fundacionjala.prog101.PaolaAguilar.Exam.src.Category;
import org.fundacionjala.prog101.PaolaAguilar.Exam.src.Product;
import org.fundacionjala.prog101.PaolaAguilar.Exam.src.Store;

public class Main {

    public static void main(String[] args) {
        Store store = new Store();
        store.buy(new Product("Bread", 1, 10, new Category("Grain")));
        store.buy(new Product("Milk", 10, 3, new Category("Lactose")));
        store.buy(new Product("Cookies", 14, 1 , new Category("Grain")));
        store.buy(new Product("Coffee", 15, 4, new Category("Grain")));
        System.out.println(store.createInvoice().showDetailSale());

    }
}
