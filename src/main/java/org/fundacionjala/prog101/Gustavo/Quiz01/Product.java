package org.fundacionjala.prog101.Gustavo.Quiz01;

public class Product implements ProductStore {
    private ProductStore productStore;

    Product(final ProductStore productStoreActual) {
        this.productStore = productStoreActual;
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
}
