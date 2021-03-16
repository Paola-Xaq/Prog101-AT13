package org.fundacionjala.prog101.Saul.Exam;

public class Store {
    private Inventory inventory;
    private Cart cart;
    public Store() {
        cart = new Cart();
        inventory = new Inventory();
        initializeInventory();
    }
    /**
     * Add products to the inventory
     */
    public void initializeInventory() {
        ProductBuilder productBuilder = new ProductBuilder();
        inventory.addProduct(productBuilder.getProduct("Bread", 1, "Food", "Impasa", "Unit"));
        inventory.addProduct(productBuilder.getProduct("Milk", 10, "Lactose", "Pil", "Liters"));
        inventory.addProduct(productBuilder.getProduct("Rice", 5, "Cooking", "Rayuela", "Kilogram"));
    }
    public void buy(String productName, int quantity) {
        Product product = inventory.getProduct(productName);
        cart.addPurchase(product, quantity);
    }
    public Invoice createInvoice() {
        Invoice invoice = new Invoice(cart);
        return invoice;
    }
}
