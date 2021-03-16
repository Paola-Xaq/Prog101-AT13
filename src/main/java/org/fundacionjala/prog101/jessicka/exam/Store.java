package org.fundacionjala.prog101.jessicka.exam;

import java.util.ArrayList;

public class Store {
    String header = "Cant Product Price Total\n--------------------------\n";
    String footer = "--------------------------\nTotal:              ";
    ArrayList<Product> order = new ArrayList<>();

    public void buy(Product product) {
        this.order.add(product);
    }

    public String createInvoice() {
        String invoice = "";
        for (Product product: order) {
            if (product.getPercentageDiscount() == 0) {
                invoice += product.getQuantity() + " " + product.getCategoryUnit() + "  -  " + product.getName() + "  -  $" + product.getPrice() + "  " + product.getPriceQuantity() + "\n";
            } else {
                invoice += product.getQuantity() + " " + product.getCategoryUnit() + "  -  " + product.getName() + "  -  $" + product.getPrice() + "  " + product.getPriceQuantity() + " %" + product.getPercentageDiscount() + "\n";
            }
        }
        return header + invoice + footer + getTotalCost();
    }

    public Integer getTotalCost() {
        Integer totalCost = 0;
        for (Product product: order) {
            totalCost += product.getPriceQuantity();
        }
        return totalCost;
    }
}
