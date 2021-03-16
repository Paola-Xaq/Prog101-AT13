package org.fundacionjala.prog101.Gustavo.Quiz01;

public interface ProductStore {
    /**
     * @return a name
     */
    String getName();

    /**
     * @return a price
     */
    int getPrice();

    /**
     * @return a price
     */
    String getUnit();

    /**
     * @return a discount next to each item
     */
    int getDiscount(int unit);
}
