package org.fundacionjala.prog101.Gustavo.Quiz01;

public class Bread implements ProductStore {
    private static final String NAME = "Bread";
    private static final int PRICE = 1;
    private static final String UNIT = "u";
    private static final int CANT_PROMO = 10;
    private static final int VALUE_PROMP = 1;

    Bread() {
        super();
    }

    /**
     * @return a name
     */
    @Override
    public String getName() {
        return NAME;
    }

    /**
     * @return a price
     */
    @Override
    public int getPrice() {
        return PRICE;
    }

    /**
     * @return a unit
     */
    @Override
    public String getUnit() {
        return UNIT;
    }

    /**
     * @return a discount next to each item
     */
    @Override
    public int getDiscount(final int quantity) {
        return (quantity / CANT_PROMO) * VALUE_PROMP;
    }
}
