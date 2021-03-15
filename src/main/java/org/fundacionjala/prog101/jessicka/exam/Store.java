package org.fundacionjala.prog101.jessicka.exam;

import java.util.ArrayList;

public class Store {
    ArrayList<Product> order = new ArrayList<>();

    public void buy(Product product) {
        this.order.add(product);
    }

    public String createInvoice() {
        String invoice = "";
        for (Product product: order) {
            invoice += product.getName() + " - $" + product.getPrice() + "\n";
        }
        return invoice + "---------------\nTotal:    " + getTotalCost();
    }

    public Integer getTotalCost() {
        Integer totalCost = 0;
        for (Product product: order) {
            totalCost += product.getPrice();
        }
        return totalCost;
    }
}
