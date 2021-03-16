package org.fundacionjala.prog101.PaolaAguilar.Exam.src;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Store {
    Product product;
    Sale sale;
    List<Product> products = new ArrayList<>();
    EmployeeDelegate salesman;


    public Sale createInvoice() {
        salesman = new Salesman("Julian Perez");
        return sale = new Sale(products);
    }

    public void buy(Product product) {
        if (product != null)
            products.add(product);
    }

    public void buy(Product product, int cant) {
        if (product != null)
            products.add(product);
    }
}
