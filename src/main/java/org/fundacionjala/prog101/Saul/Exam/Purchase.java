package org.fundacionjala.prog101.Saul.Exam;

public class Purchase {
    Product product;
    int quantity;
    public Purchase(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }
    public Product getProduct() {
        return product;
    }
    public int getQuantity() {
        return quantity;
    }
}
