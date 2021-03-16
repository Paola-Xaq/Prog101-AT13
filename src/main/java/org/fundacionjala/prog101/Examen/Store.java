package org.fundacionjala.prog101.Examen;

import java.util.ArrayList;


public class Store {
    Product product;
    private ArrayList<Product> productList = new ArrayList<>();

    public void buy(Product productToBuy) {
        productList.add(productToBuy);
        //return productList;
    }

    public Invoice createInvoice() {
        Invoice invoice = new Invoice(productList);
        return invoice;
    }

}
