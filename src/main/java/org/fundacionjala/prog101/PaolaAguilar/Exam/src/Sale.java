package org.fundacionjala.prog101.PaolaAguilar.Exam.src;

import java.util.List;

public class Sale {
    List<Product> products;
    int totalCost = 0;
    String subTotal;

    Sale(List<Product> products) {
        this.products = products;
    }

    /**
     * Get total cost
     * @return totalCost of List<Product>
     */
    public int getTotalCost() {
        if(products == null || products.size() == 0)
            return 0;
        for (Product product: products) {
            totalCost += product.getProductPrice() * product.getAmount();
        }
        return totalCost;
    }

    /**
     * Display SaleDetail
     * @return string detailSale
     */
    public String showDetailSale() {
        String detailSale = "Amount\t\tProduct\t\tPrice\t\tTotal\n"+
                            "--------------------------------------\n";
        for (Product product: products) {
            detailSale += product.getAmount() + " "
                    + product.getCategory() +"\t\t"
                    + product.getProductName() +"\t\t$"
                    + product.getProductPrice() + "\t\t\t"
                    + getProm(product)+"\n";
        }
        detailSale += "--------------------------------------\n"+
                      "Total\t\t\t\t\t\t\t\t$"+getTotalCost();
        return detailSale;
    }

    public String getProm(Product product) {
        if(new RiceProm().newPromPrice(product) != 0)
            return (new RiceProm().newPromPrice(product)) + "%";
        else if(new OilProm().newPromPrice(product) != 0)
            return  new OilProm().newPromPrice(product) + "%";
        else if (new MilkProm().newPromPrice(product) != 0)
            return  new MilkProm().newPromPrice(product) + "%";
        else if (new BreadProm().newPromPrice(product) != 0)
            return new BreadProm().newPromPrice(product) + "%";
        else return subTotal = (product.getAmount() * product.getProductPrice())+"";
    }
}
