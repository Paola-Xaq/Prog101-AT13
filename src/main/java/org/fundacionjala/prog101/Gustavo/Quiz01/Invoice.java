package org.fundacionjala.prog101.Gustavo.Quiz01;

import java.util.ArrayList;

public class Invoice {
    private ArrayList<Product> productsSold;

    Invoice() {
    }

    Invoice(final ArrayList<Product> productsSoldList) {
        this.productsSold = productsSoldList;
    }

    /**
     * @return an result of total sum.
     */
    public int getTotalCost() {
        int sum = 0;
        for (Product product1 : productsSold) {
            sum = sum + product1.getprice();
        }
        return sum;
    }
}
