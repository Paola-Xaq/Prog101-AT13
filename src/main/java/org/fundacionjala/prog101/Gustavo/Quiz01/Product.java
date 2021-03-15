package org.fundacionjala.prog101.Gustavo.Quiz01;

public class Product implements ProductStore {
    private ProductStore productStore;
    private int quantity = 1;

    Product(final ProductStore productStoreActual) {
        this.productStore = productStoreActual;
    }

    Product(final ProductStore productStoreActual, final int quantityActual) {
        this.productStore = productStoreActual;
        this.quantity = quantityActual;
    }

    /**
     * @return a name
     */
    @Override
    public String getName() {
        return productStore.getName();
    }

    /**
     * @return a price
     */
    @Override
    public int getprice() {
        return productStore.getprice();
    }

    /**
     * @return a unit
     */
    @Override
    public String getUnit() {
        return productStore.getUnit();
    }

    /**
     * @return a quantity of products added
     */
    public int getQuantityOfProducts() {
        return  quantity;
    }
}
