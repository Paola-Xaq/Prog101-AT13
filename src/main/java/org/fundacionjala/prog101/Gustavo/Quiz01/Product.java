package org.fundacionjala.prog101.Gustavo.Quiz01;

public class Product {
    private String name;
    private int price;

    Product(final String nameProduct, final int priceProduct) {
        this.name = nameProduct;
        this.price = priceProduct;
    }

    /**
     * @return a name
     */
    String getName() {
        return name;
    }

    /**
     * @return a price
     */
    int getprice() {
        return price;
    }
}
