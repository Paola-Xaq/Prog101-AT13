package org.fundacionjala.prog101.joelrojas.supermarket;

import java.util.ArrayList;

public class Invoice {
    private int totalcost;
    private ArrayList<Product> products;
    private ArrayList<Integer> amounts;

    public Invoice(ArrayList<Product> inputProducts, ArrayList<Integer> amountList) {
        products = inputProducts;
        amounts = amountList;
        totalcost = 0;
        calculateTotalCost();
    }

    public int getTotalCost() {
        return totalcost;
    }

    private void calculateTotalCost() {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getinPromo()) {
                totalcost += (int) (products.get(i).getPrice() * amounts.get(i) * 0.90);
            } else {
                totalcost += products.get(i).getPrice() * amounts.get(i);
            }
        }
    }

    public String toString() {
        String res = "";
        res = Format.complete("Cant") + Format.complete("Product", Format.NAME)
                + Format.complete("Price") + "Total" + "\n";
        res += "----------------------------------------\n";
        for (int i = 0; i < products.size(); i++) {

            res += Format.complete(amounts.get(i) + " " + products.get(i).getUnitOfMeasurement())
                    + products.get(i).toString();
            if (products.get(i).getinPromo()) {
                res += "$" + (int) (amounts.get(i) * products.get(i).getPrice() * 0.90) + "  10%\n";
            } else {
                res += "$" + amounts.get(i) * products.get(i).getPrice() + "\n";
            }
        }
        res += "----------------------------------------\n";
        res += Format.complete("Total", Format.TOTAL) + "$" + totalcost;
        return res;
    }

}
