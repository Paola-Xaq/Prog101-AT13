package org.fundacionjala.prog101.Saul.Exam;

public class ProductBuilder {
    public ProductBuilder() {

    }
    public Product getProduct(String name, int price, String category, String brand, String productUnit) {
        Product product = null;
        switch (name) {
            case "Milk" : product = new Milk(name, price, category, brand, productUnit);
            break;
            case "Bread" : product = new Bread(name, price, category, brand, productUnit);
            break;
            case "Rice" : product = new Bread(name, price, category, brand, productUnit);
                break;
        }
        return product;
    }
}
