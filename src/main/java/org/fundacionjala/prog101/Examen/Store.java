package org.fundacionjala.prog101.Examen;

public class Store {
    Product product;
    int totalCost = 0;

    public Invoice createInvoice() {
        for (int i = 0; i < product.getProducts().size(); i++) {
            System.out.println(product.getName() + " " + "--" + " " + product.getPrice());
        }
        System.out.println("---------------");
        System.out.println("Total" + " " + totalCost);

    }

    public int getTotalCost() {
        return totalCost;
    }

    public void buy(Product product) {
        totalCost += product.getPrice();
    }


}
