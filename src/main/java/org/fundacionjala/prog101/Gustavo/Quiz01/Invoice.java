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
            sum = sum + product1.getPrice() * product1.getQuantityOfProducts();
        }
        return sum;
    }

    /**
     * @return an string  of Cost of each item.
     */
    public String getCostOfEachItem() {
        String res = "";
        for (Product product1 : productsSold) {
            res = res + product1.getName() + " - " + "$" + product1.getPrice() + "\n";
        }
        res = res + "---------- " + "\n";
        res = res + "Total  $" + getTotalCost();

        return res;
    }

    /**
     * @return an string  of complete detail of each item.
     */
    public String getCompleteInvoiceDetail() {

        String res = "Cant  Produtc   Price    Total" + "\n" + "------------------------------" + "\n";
        for (Product product1 : productsSold) {
            res = res + product1.getQuantityOfProducts() + " " + product1.getUnit() + " - \t"
                    + product1.getName() + " -\t" + "$" + product1.getPrice() + "\t\t $"
                    + product1.getTotalPrice() + "\n";
        }
        res = res + "------------------------------" + "\n";
        res = res + "Total                    $" + getTotalCost();

        return res;
    }

    /**
     * @return an result of total sum.
     */
    public int getTotalCostPriceWithDiscount() {
        int sum = 0;
        for (Product product1 : productsSold) {
            sum = sum + product1.getTotalPriceWithDiscount();
        }
        return sum;
    }

    /**
     * @return an string  of complete detail of each item.
     */
    public String getCompleteInvoiceDetailWithPromotion() {

        String res = "Cant  Product   Price    Total  %DisCount   Total"
                + "\n" + "------------------------------------------------------------" + "\n";
        for (Product product1 : productsSold) {
            res = res + product1.getQuantityOfProducts() + " " + product1.getUnit() + " -\t"
                    + product1.getName() + " -\t" + "$" + product1.getPrice() + "\t\t $" + product1.getTotalPrice()
                    + "\t" + product1.getPercentageDiscount() + "%\t\t" + product1.getTotalPriceWithDiscount() + "\n";
        }
        res = res + "------------------------------------------------------------" + "\n";
        res = res + "Total                    $" + getTotalCost() + "      \t\t\t$" + getTotalCostPriceWithDiscount();

        return res;
    }

}
