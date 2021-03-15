package org.fundacionjala.prog101.joelrojas.supermarket;

import java.util.ArrayList;

public class Invoice {
    private int totalcost;
    private ArrayList<Product> products;
    public Invoice (ArrayList<Product> products) {
        this.products = products;
        totalcost = 0;
        calculeTotalCost();
    }
    public int getTotalCost() {
        return totalcost;
    }

    private void calculeTotalCost() {
        for (int i = 0; i < products.size(); i++) {
            totalcost += products.get(i).getPrice();
        }
    }

    public String toString(){
        String res = "";
        for (int i = 0; i < products.size(); i++) {
            res +=products.get(i).toString() + "\n";
        }
        res += "Total             " + totalcost;
        return res;
    }
}
