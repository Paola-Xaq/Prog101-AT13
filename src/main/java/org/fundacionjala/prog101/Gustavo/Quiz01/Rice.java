package org.fundacionjala.prog101.Gustavo.Quiz01;

public class Rice implements ProductStore {
    private static final String NAME="Rice";
    private static final int PRICE=5;
    private static final String UNIT="kg";
    Rice() {
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
