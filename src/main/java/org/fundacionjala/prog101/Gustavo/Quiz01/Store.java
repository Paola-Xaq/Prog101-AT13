package org.fundacionjala.prog101.Gustavo.Quiz01;

import java.util.ArrayList;

public class Store {
    private Invoice invoice;
    private ArrayList<Product> listProduct = new ArrayList<Product>();
    private Product product;

    /**
     * Add a new product in list
     * @return nothing
     */
    void buy(final Product productNew) {
        this.product = productNew;
        listProduct.add(product);
    }

    /**
     * @return new Invoice
     */
    Invoice createInvoice() {
        return new Invoice(listProduct);
    }
}
