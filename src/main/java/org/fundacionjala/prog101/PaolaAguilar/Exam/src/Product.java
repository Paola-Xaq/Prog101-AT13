package org.fundacionjala.prog101.PaolaAguilar.Exam.src;

import java.util.List;

public class Product {
    private String name;
    private int price;
    private int amount = 1;
    Category category;

    public Product(String productName, int productPrice, int cant, Category category) {
        this.name = productName;
        this.price = productPrice;
        this.amount = cant;
        this.category = category;
    }

    /**
     * Get name of a Product
     * @return name
     */
    public String getProductName() {
        return this.name;
    }

    /**
     * Get price of a Product
     * @return price
     */
    public int getProductPrice() {
        return this.price;
    }

    /**
     * Get amount of a Product
     * @return amount
     */
    public int getAmount() { return this.amount; }

    /**
     * Get category of a Product
     * @return Category unit
     */
    public String getCategory() {
        return category.getUnit();
    }

}
