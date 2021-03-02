package org.fundacionjala.prog101.PaolaAguilar.Wrapper;

public class intValue {
    private int numInt;

    public intValue(int numInt) {
        this.numInt = numInt;
    }

    public int getValue() {
        return numInt;
    }

    public void setValue(int number) {
        this.numInt = number;
    }

    public void increment() {
        this.numInt ++;
    }
    @Override
    public String toString() {
        return Integer.toString(numInt);
    }
}
