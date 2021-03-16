package org.fundacionjala.prog101.Gustavo.Quiz01;

public class Milk implements ProductStore {
    private static final String NAME = "Milk";
    private static final int PRICE = 10;
    private static final String UNIT = "lt";
    private static final int CANT_PROMO = 5;
    private static final int VALUE_PROMP = 5;
    Milk() {
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
