package org.fundacionjala.prog101.Saul.Exam;

public class ProductBuilder {
    public ProductBuilder() {

    }
    public Product getProduct(String name, int price) {
        Product product = null;
        switch (name) {
            case "Milk" : product = new Milk(name, price);
            break;
            case "Bread" : product = new Milk(name, price);
            break;
        }
        return product;
    }
}
