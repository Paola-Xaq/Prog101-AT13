package org.fundacionjala.prog101.Gustavo.Quiz01;

public class Bread implements ProductStore {
    private static final String NAME="Bread";
    private static final int PRICE=1;
    private static final String UNIT="u";
    Bread() {
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
