package org.fundacionjala.prog101.Gustavo.Quiz01;

import java.util.ArrayList;
import java.util.List;

public class Store {
    Invoice invoice;
    ArrayList<Product> ListProduct=new ArrayList<Product>();
    Product product;

    void buy(Product product){
        this.product=product;
        ListProduct.add(product);
    }

    Invoice createInvoice(){
        return new Invoice(ListProduct);
    }
}
