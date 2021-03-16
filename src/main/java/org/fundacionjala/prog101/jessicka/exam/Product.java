package org.fundacionjala.prog101.jessicka.exam;

import org.fundacionjala.prog101.jessicka.exam.categories.Category;

public class Product {
    private Integer price;
    private String name;
    private Integer quantity;
    private Category category;
    private Integer percentageDiscount = 0;

    Product(String name, Integer price, Integer quantity, Category category) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.category = category;
    }

    public Integer getPrice() {
        return this.price;
    }

    public String getName() {
        return this.name;
    }

    public Integer getQuantity() {
        return this.quantity;
    }

    public Integer getPriceQuantity() {
        return this.price * this.quantity;
    }

    public String getCategoryUnit() {
        return category.getUnity();
    }

    public Integer setPromo(int percentageDiscount) {
        Promo promo = new Promo(this.price, percentageDiscount);
        this.price = this.price - promo.setPromo();
        this.percentageDiscount = percentageDiscount;
        return this.price;
    }

    public Integer getPercentageDiscount() {
        return this.percentageDiscount;
    }
}
