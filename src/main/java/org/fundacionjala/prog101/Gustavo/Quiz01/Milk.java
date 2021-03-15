package org.fundacionjala.prog101.Gustavo.Quiz01;

public class Milk implements ProductStore {
    private static final String NAME = "Milk";
    private static final int PRICE = 10;
    private static final String UNIT = "lt";

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
    public int getprice() {
        return PRICE;
    }

    /**
     * @return a unit
     */
    @Override
    public String getUnit() {
        return UNIT;
    }
}
