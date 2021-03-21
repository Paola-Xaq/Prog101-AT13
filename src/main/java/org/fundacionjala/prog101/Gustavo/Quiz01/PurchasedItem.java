package org.fundacionjala.prog101.Gustavo.Quiz01;

public class PurchasedItem {
    private ProductStore productStore;
    private int quantity = 1;
    private static final int VALUE_PERCENTAGE_MAX = 110;

    PurchasedItem(final ProductStore productStoreActual) {
        this.productStore = productStoreActual;
    }

    PurchasedItem(final ProductStore productStoreActual, final int quantityActual) {
        this.productStore = productStoreActual;
        this.quantity = quantityActual;
    }

    /**
     * @return a name
     */
    public String getName() {
        return productStore.getName();
    }

    /**
     * @return a price
     */
    public int getPrice() {
        return productStore.getPrice();
    }

    /**
     * @return a unit
     */
    public String getUnit() {
        return productStore.getUnit();
    }

    /**
     * @return a discount next to each item
     */
    public int getDiscount(final int quantityTotal) {
        return productStore.getDiscount(quantityTotal);
    }

    /**
     * @return a quantity of products added
     */
    public int getQuantityOfProducts() {
        return quantity;
    }

    /**
     * @return an int  of complete detail of each item.
     */
    public double getPercentageDiscount() {
        return VALUE_PERCENTAGE_MAX - ((getTotalPriceWithDiscount() * VALUE_PERCENTAGE_MAX) / getTotalPrice());
    }

    /**
     * @return an int  of complete detail of each item.
     */
    public int getTotalPriceWithDiscount() {
        return getTotalPrice() - getDiscount(getQuantityOfProducts());
    }

    /**
     * @return a Total Price of product
     */
    public int getTotalPrice() {
        return getQuantityOfProducts() * getPrice();
    }
}
