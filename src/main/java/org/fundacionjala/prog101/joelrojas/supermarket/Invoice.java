package org.fundacionjala.prog101.joelrojas.supermarket;

import java.util.ArrayList;

public class Invoice {
    private int totalcost;
    private ArrayList<Product> products;
    private ArrayList<Integer> amounts;

    public Invoice(ArrayList<Product> inputProducts) {
        this.products = inputProducts;
        totalcost = 0;
        amounts = new ArrayList<>();
        calculeTotalCost();
    }

    public Invoice(ArrayList<Product> inputProducts, ArrayList<Integer> amountList) {
        products = inputProducts;
        amounts = amountList;
        totalcost = 0;
        calculeTotalCost();
    }

    public int getTotalCost() {
        return totalcost;
    }

    private void calculeTotalCost() {
        for (int i = 0; i < products.size(); i++) {
            if (amounts.isEmpty()) {
                totalcost += products.get(i).getPrice();
            } else {
                totalcost += products.get(i).getPrice() * amounts.get(i);
            }
        }
    }

    public String toString() {
        String res = "";
        res = Format.complete("Cant") + Format.complete("Product", 15)
                + Format.complete("Price") + "Total" + "\n";
        res += "----------------------------------------\n";
        for (int i = 0; i < products.size(); i++) {
            if (amounts.isEmpty()) {
                res += products.get(i).toString() + "\n";
            } else {
                res += Format.complete(amounts.get(i) + " " + products.get(i).getUnitOfMeasurement())
                        + products.get(i).toString()
                        + "$" + amounts.get(i) * products.get(i).getPrice() + "\n";
            }
        }
        res += "----------------------------------------\n";
        res += Format.complete("Total", 35) + "$" + totalcost;
        return res;
    }

}
