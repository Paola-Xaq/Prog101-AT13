package org.fundacionjala.prog101.Gustavo.Quiz01;

import java.util.ArrayList;

public class Invoice {
    private ArrayList<Product> productsSold;

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

    /**
     * @return an string  of Cost of each item.
     */
    public String getCostOfEachItem() {
        String res = "";
        for (Product product1 : productsSold) {
            res = res + product1.getName() + " - " + "$" + product1.getprice() + "\n";
        }
        res = res + "---------- " + "\n";
        res = res + "Total  $" + getTotalCost();

        return res;
    }

    /**
     * @return an string  of complete detail of each item.
     */
    public String getCompleteInvoiveDetail() {
        String res = "Cant  Produtc   Price Total" + "\n" + "----------------------------" + "\n";
        for (Product product1 : productsSold) {
            res = res + product1.getQuantityOfProducts() + " -    " + product1.getName() + " -    " + "$" + product1.getprice() + "   $"
                    + product1.getprice() * product1.getQuantityOfProducts() + "\n";
        }
        res = res + "----------------------------" + "\n";
        res = res + "Total                  $" + getTotalCost();

        return res;
    }
}
