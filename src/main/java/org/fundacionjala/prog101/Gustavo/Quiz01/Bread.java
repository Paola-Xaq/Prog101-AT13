package org.fundacionjala.prog101.Gustavo.Quiz01;

public class Bread implements ProductStore {
    private static final String NAME = "Bread";
    private static final int PRICE = 1;
    private static final String UNIT = "u";

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
