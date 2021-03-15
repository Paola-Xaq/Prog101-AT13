package org.fundacionjala.prog101.jessicka.exam;

import org.fundacionjala.prog101.jessicka.Figures.SolutionThree.Figure;

import java.util.ArrayList;

public class Store {
    ArrayList <Product> order = new ArrayList<>();

    public void buy(Product product) {
        this.order.add(product);
    }

    public void createInvoice() {
        for (Product product: order) {
            System.out.println(product.getName());
            System.out.println(product.getPrice().toString());
        }
    }

    public Integer getTotalCost() {
        Integer totalCost = 0;
        for (Product product: order) {
            totalCost += product.getPrice();
        }
        return totalCost;
    }
}
