package org.fundacionjala.prog101.PaolaAguilar.Exam.src;

public class Product {
    String name;
    int price;
    Category category;

    public void Product(String productName, int productPrice) {
        this.name = productName;
        this.price = productPrice;
        //this.category = category;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}
