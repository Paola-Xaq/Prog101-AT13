package org.fundacionjala.prog101.Gustavo.Quiz01;

public class Milk implements ProductStore {
    private static final String NAME="Milk";
    private static final int PRICE=10;
    private static final String UNIT="lt";
    Milk() {
        super();
    }

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public int getprice() {
        return PRICE;
    }

    @Override
    public String getUnit() {
        return UNIT;
    }
}
